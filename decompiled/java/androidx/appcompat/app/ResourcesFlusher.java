package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ResourcesFlusher {
    public static Field sDrawableCacheField;
    public static boolean sDrawableCacheFieldFetched;
    public static Field sResourcesImplField;
    public static boolean sResourcesImplFieldFetched;
    public static Class<?> sThemedResourceCacheClazz;
    public static boolean sThemedResourceCacheClazzFetched;
    public static Field sThemedResourceCache_mUnthemedEntriesField;
    public static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;

    public static void flush(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            flushNougats(resources);
        } else {
            flushMarshmallows(resources);
        }
    }

    public static void flushLollipops(Resources resources) {
        if (!sDrawableCacheFieldFetched) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                sDrawableCacheField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            sDrawableCacheFieldFetched = true;
        }
        Field field = sDrawableCacheField;
        if (field != null) {
            try {
                Map map = (Map) field.get(resources);
                if (map != null) {
                    map.clear();
                }
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static void flushMarshmallows(Resources resources) {
        if (!sDrawableCacheFieldFetched) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                sDrawableCacheField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            sDrawableCacheFieldFetched = true;
        }
        Field field = sDrawableCacheField;
        if (field != null) {
            try {
                Object obj = field.get(resources);
                if (obj != null) {
                    flushThemedResourcesCache(obj);
                }
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static void flushNougats(Resources resources) {
        if (!sResourcesImplFieldFetched) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                sResourcesImplField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            sResourcesImplFieldFetched = true;
        }
        Field field = sResourcesImplField;
        if (field == null) {
            return;
        }
        try {
            Object obj = field.get(resources);
            if (obj != null) {
                if (!sDrawableCacheFieldFetched) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        sDrawableCacheField = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    sDrawableCacheFieldFetched = true;
                }
                Field field2 = sDrawableCacheField;
                if (field2 != null) {
                    try {
                        Object obj2 = field2.get(obj);
                        if (obj2 != null) {
                            flushThemedResourcesCache(obj2);
                        }
                    } catch (IllegalAccessException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
            }
        } catch (IllegalAccessException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }

    public static void flushThemedResourcesCache(Object obj) {
        if (!sThemedResourceCacheClazzFetched) {
            try {
                sThemedResourceCacheClazz = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            sThemedResourceCacheClazzFetched = true;
        }
        Class<?> cls = sThemedResourceCacheClazz;
        if (cls == null) {
            return;
        }
        if (!sThemedResourceCache_mUnthemedEntriesFieldFetched) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                sThemedResourceCache_mUnthemedEntriesField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            sThemedResourceCache_mUnthemedEntriesFieldFetched = true;
        }
        Field field = sThemedResourceCache_mUnthemedEntriesField;
        if (field == null) {
            return;
        }
        try {
            LongSparseArray longSparseArray = (LongSparseArray) field.get(obj);
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
        } catch (IllegalAccessException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}

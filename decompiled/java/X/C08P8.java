package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08P8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08P8 {
    public static volatile String LIZ;
    public static final Map<String, Integer> LIZIZ;
    public static final Map<String, Field> LIZJ;

    static {
        HashMap map = new HashMap();
        LIZIZ = map;
        LIZJ = new HashMap();
        map.put("armeabi", 32);
        map.put("armeabi-v7a", 32);
        map.put("arm64-v8a", 64);
        map.put("x86", 32);
        map.put("x86_64", 64);
        map.put("mips", 32);
        map.put("mips64", 64);
        LIZ = LIZLLL();
    }

    public static String LIZJ() {
        if (LIZ == null) {
            synchronized (C08P8.class) {
                try {
                    if (LIZ == null) {
                        LIZ = LIZLLL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL() {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08P8.LIZLLL():java.lang.String");
    }

    public static Map LIZIZ(C09NU c09nu) {
        HashMap map = new HashMap();
        Enumeration<? extends ZipEntry> enumerationEntries = c09nu.entries();
        Pattern patternCompile = PatternProtector.compile("^lib/[^/]+/lib[^/]+.so$");
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            if (!zipEntryNextElement.isDirectory() && patternCompile.matcher(zipEntryNextElement.getName()).matches()) {
                String[] strArrSplit = zipEntryNextElement.getName().split(File.separator);
                if (strArrSplit.length >= 2) {
                    String str = strArrSplit[strArrSplit.length - 2];
                    if (((HashMap) LIZIZ).containsKey(str)) {
                        if (map.get(str) == null) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(zipEntryNextElement);
                    }
                }
            }
        }
        return map;
    }

    public static Object LJ(Object obj) {
        Field declaredField;
        if (obj != null) {
            Class<?> superclass = obj.getClass();
            if (!TextUtils.isEmpty("primaryCpuAbi")) {
                String str = superclass.toString() + "#primaryCpuAbi";
                Map<String, Field> map = LIZJ;
                synchronized (map) {
                    try {
                        declaredField = (Field) ((HashMap) map).get(str);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                if (declaredField == null) {
                    while (true) {
                        if (superclass != null) {
                            try {
                                declaredField = superclass.getDeclaredField("primaryCpuAbi");
                                if (!declaredField.isAccessible()) {
                                    declaredField.setAccessible(true);
                                }
                                Map<String, Field> map2 = LIZJ;
                                synchronized (map2) {
                                    try {
                                        ((HashMap) map2).put(str, declaredField);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                break;
                            } catch (NoSuchFieldException e) {
                                TryCatchGuardChecker.doCheck(e);
                                superclass = superclass.getSuperclass();
                            }
                        } else {
                            declaredField = null;
                            break;
                        }
                    }
                } else if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                if (declaredField == null) {
                    return null;
                }
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField.get(obj);
            }
            throw new IllegalArgumentException("The field name must not be blank");
        }
        throw new IllegalArgumentException("target object must not be null");
    }

    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}

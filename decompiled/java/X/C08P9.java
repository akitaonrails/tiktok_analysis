package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
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

/* JADX INFO: renamed from: X.08P9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08P9 {
    public static volatile String LIZ;
    public static final Map<String, Integer> LIZIZ;
    public static final Map<String, Field> LIZJ;
    public static ApplicationInfo LIZLLL;
    public static C0VSJ LJ;
    public static volatile String LJFF;

    public static int LIZJ() {
        int i = 0;
        try {
            i = Process.is64Bit() ? 64 : 32;
            C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("inferHostAbiAuto, processMode=");
            sbLIZ.append(i);
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("inferHostAbiAuto, processMode exception default=");
            sbLIZ2.append(i);
            c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            return i;
        } catch (NoSuchMethodError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return i;
        }
    }

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
        LJFF = null;
    }

    public static Map LIZIZ(C09NU c09nu) {
        String[] strArrSplit;
        HashMap map = new HashMap();
        Enumeration<? extends ZipEntry> enumerationEntries = c09nu.entries();
        Pattern patternCompile = PatternProtector.compile("^lib/[^/]+/lib[^/]+.so$");
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            if (!zipEntryNextElement.isDirectory() && patternCompile.matcher(zipEntryNextElement.getName()).matches() && (strArrSplit = zipEntryNextElement.getName().split(File.separator)) != null && strArrSplit.length >= 2) {
                String str = strArrSplit[strArrSplit.length - 2];
                if (((HashMap) LIZIZ).containsKey(str)) {
                    if (map.get(str) == null) {
                        map.put(str, new LinkedList());
                    }
                    ((List) map.get(str)).add(zipEntryNextElement);
                }
            }
        }
        C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAllSoZipEntries, zipFile=");
        sbLIZ.append(c09nu.getName());
        sbLIZ.append(", soEntries=");
        sbLIZ.append(map);
        c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        return map;
    }

    public static String LIZLLL(Context context) {
        String str;
        if (LJFF == null) {
            LIZLLL = context.getApplicationInfo();
            LJ = new C0VSJ(LIZLLL.nativeLibraryDir);
            if (LIZ == null) {
                synchronized (C08P9.class) {
                    try {
                        if (LIZ == null) {
                            LIZ = LJ(context);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            Integer num = (Integer) ((HashMap) LIZIZ).get(LIZ);
            if (num == null) {
                num = -1;
            }
            if (num.intValue() != 32 && num.intValue() == 64) {
                str = "arm64-v8a";
            } else {
                str = "armeabi-v7a";
            }
            LJFF = str;
        }
        return LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d4 -> B:18:0x00d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(android.content.Context r14) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08P9.LJ(android.content.Context):java.lang.String");
    }

    public static Object LJFF(Object obj) {
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

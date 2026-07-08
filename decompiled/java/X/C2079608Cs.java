package X;

import com.bytedance.otis.attribution.JarvisDebugConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2079608Cs {
    public static final String LIZ;

    static {
        int[] iArr = {117, 62, 59, 46, 59, 117, 54, 53, 57, 59, 54, 117, 46, 55, 42, 117, 48, 59, 40, 44, 51, 41, 5, 57, 53, 52, 60, 51, 61};
        char[] cArr = new char[29];
        int i = 0;
        do {
            cArr[i] = (char) ((iArr[i] ^ 90) & 65535);
            i++;
        } while (i < 29);
        LIZ = new String(cArr);
    }

    /* JADX WARN: Finally extract failed */
    public static String LIZIZ(C0VSJ c0vsj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        C0VSP c0vsp = new C0VSP(c0vsj);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[1024];
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            try {
                c0vsp.close();
                throw th3;
            } finally {
                TryCatchGuardChecker.doCheck(th2);
                th3.addSuppressed(th2);
            }
        }
        while (true) {
            int i = c0vsp.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                String string = byteArrayOutputStream.toString("UTF-8");
                byteArrayOutputStream.close();
                c0vsp.close();
                return string;
            }
            TryCatchGuardChecker.doCheck(th3);
            c0vsp.close();
            throw th3;
        }
    }

    public static void LIZ(JarvisDebugConfig jarvisDebugConfig, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objValueOf = jSONObject.get(next);
            if (objValueOf != JSONObject.NULL) {
                try {
                    Field declaredField = jarvisDebugConfig.getClass().getDeclaredField(next);
                    declaredField.setAccessible(true);
                    Class<?> type = declaredField.getType();
                    if (type != Long.class && type != Long.TYPE) {
                        if (type != Integer.class && type != Integer.TYPE) {
                            if (type != Boolean.class && type != Boolean.TYPE) {
                                if (type != Double.class && type != Double.TYPE) {
                                    if (type == String.class) {
                                        declaredField.set(jarvisDebugConfig, String.valueOf(objValueOf));
                                    }
                                } else {
                                    declaredField.set(jarvisDebugConfig, Double.valueOf(((Number) objValueOf).doubleValue()));
                                }
                            } else {
                                if (!(objValueOf instanceof Boolean)) {
                                    objValueOf = Boolean.valueOf(Boolean.parseBoolean(String.valueOf(objValueOf)));
                                }
                                declaredField.set(jarvisDebugConfig, objValueOf);
                            }
                        } else {
                            declaredField.set(jarvisDebugConfig, Integer.valueOf(((Number) objValueOf).intValue()));
                        }
                    } else {
                        declaredField.set(jarvisDebugConfig, Long.valueOf(((Number) objValueOf).longValue()));
                    }
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (IllegalAccessException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                } catch (NoSuchFieldException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
        }
    }
}

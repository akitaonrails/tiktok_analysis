package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08KR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KR extends RuntimeException {
    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public C08KR(Exception exc) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exc);
    }

    public static Object zzc(Callable callable) {
        callable.getClass();
        try {
            return callable.call();
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new C08KR(e2);
        }
    }

    public final Exception zzb(Class cls) {
        int iIndexOf;
        String strLIZIZ;
        int i = 0;
        Class[] clsArr = {cls};
        for (char c = 0; c <= 0; c = 1) {
            Class cls2 = clsArr[c];
            if (!(!RuntimeException.class.isAssignableFrom(cls2))) {
                Object[] objArr = new Object[2];
                objArr[0] = "getCause";
                objArr[1] = cls2;
                for (int i2 = 0; i2 < 2; i2++) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        strLIZIZ = "null";
                    } else {
                        try {
                            strLIZIZ = obj.toString();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            String name = obj.getClass().getName();
                            String hexString = Integer.toHexString(System.identityHashCode(obj));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(name);
                            sbLIZ.append(e3.g);
                            sbLIZ.append(hexString);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strLIZIZ2), (Throwable) e);
                            String name2 = e.getClass().getName();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("<");
                            sbLIZ2.append(strLIZIZ2);
                            sbLIZ2.append(" threw ");
                            sbLIZ2.append(name2);
                            sbLIZ2.append(">");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    }
                    objArr[i2] = strLIZIZ;
                }
                StringBuilder sb = new StringBuilder(118);
                int i3 = 0;
                while (i < 2 && (iIndexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i3)) != -1) {
                    sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i3, iIndexOf);
                    sb.append(objArr[i]);
                    i3 = iIndexOf + 2;
                    i++;
                }
                sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i3, 86);
                if (i < 2) {
                    sb.append(" [");
                    sb.append(objArr[i]);
                    for (int i4 = i + 1; i4 < 2; i4++) {
                        sb.append(", ");
                        sb.append(objArr[i4]);
                    }
                    sb.append(']');
                }
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (cls.isInstance(getCause())) {
            return (Exception) cls.cast(getCause());
        }
        Exception cause = getCause();
        ClassCastException classCastException = new ClassCastException(C786410Ut5.j4("getCause(%s) doesn't match underlying exception", new Object[]{cls}));
        classCastException.initCause(cause);
        throw classCastException;
    }
}

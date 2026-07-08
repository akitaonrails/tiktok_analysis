package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.measurement.internal.zzba;
import com.google.android.gms.measurement.internal.zzbf;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.12aP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19781112aP {
    public static final AtomicReference<String[]> LIZIZ = new AtomicReference<>();
    public static final AtomicReference<String[]> LIZJ = new AtomicReference<>();
    public static final AtomicReference<String[]> LIZLLL = new AtomicReference<>();
    public final InterfaceC19787012bM LIZ;

    public C19781112aP(C19783912ar c19783912ar) {
        this.LIZ = c19783912ar;
    }

    public final String LIZ(Bundle bundle) {
        Object obj;
        String strValueOf;
        if (bundle == null) {
            return null;
        }
        if (!((C19783912ar) this.LIZ).LIZ()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(LJFF(str));
            sb.append("=");
            try {
                obj = bundle.get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj = null;
            }
            if (obj instanceof Bundle) {
                strValueOf = LJ(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strValueOf = LJ((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                strValueOf = LJ(((ArrayList) obj).toArray());
            } else {
                strValueOf = String.valueOf(obj);
            }
            sb.append(strValueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String LIZIZ(zzbf zzbfVar) {
        String strLIZ;
        if (!((C19783912ar) this.LIZ).LIZ()) {
            return zzbfVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbfVar.zzc);
        sb.append(",name=");
        sb.append(LIZJ(zzbfVar.zza));
        sb.append(",params=");
        zzba zzbaVar = zzbfVar.zzb;
        if (zzbaVar == null) {
            strLIZ = null;
        } else if (!((C19783912ar) this.LIZ).LIZ()) {
            strLIZ = zzbaVar.toString();
        } else {
            strLIZ = LIZ(zzbaVar.LLIFFJFJJ());
        }
        sb.append(strLIZ);
        return sb.toString();
    }

    public final String LIZJ(String str) {
        if (str == null) {
            return null;
        }
        if (!((C19783912ar) this.LIZ).LIZ()) {
            return str;
        }
        return LIZLLL(str, C19781212aQ.LIZJ, C19781212aQ.LIZ, LIZIZ);
    }

    public final String LJ(Object[] objArr) {
        String strValueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(e3.e);
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                strValueOf = LIZ((Bundle) obj);
            } else {
                strValueOf = String.valueOf(obj);
            }
            if (strValueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strValueOf);
            }
        }
        sb.append(e3.f);
        return sb.toString();
    }

    public final String LJFF(String str) {
        if (str == null) {
            return null;
        }
        if (!((C19783912ar) this.LIZ).LIZ()) {
            return str;
        }
        return LIZLLL(str, C19786812bK.LIZIZ, C19786812bK.LIZ, LIZJ);
    }

    public final String LJI(String str) {
        if (str == null) {
            return null;
        }
        if (!((C19783912ar) this.LIZ).LIZ()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return LIZLLL(str, C19776612Zg.LIZIZ, C19776612Zg.LIZ, LIZLLL);
    }

    public static String LIZLLL(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        boolean z;
        String str2;
        C0W3J.LJIIIIZZ(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C0W3J.LIZIZ(z);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i] == null) {
                            strArr3[i] = strArr2[i] + e3.h + strArr[i] + ")";
                        }
                        str2 = strArr3[i];
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }
}

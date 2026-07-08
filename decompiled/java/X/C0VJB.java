package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: renamed from: X.0VJB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJB {
    public static Object LIZ(File file) {
        C0VSP c0vsp;
        try {
            if (!file.exists()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(file.getAbsolutePath());
                sbLIZ.append(".bk");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (!c0vsj.exists()) {
                    return null;
                }
                c0vsj.renameTo(file);
            }
            try {
                c0vsp = new C0VSP(file);
                try {
                    try {
                        Object object = new ObjectInputStream(c0vsp).readObject();
                        C2112008Pe.LIZ(c0vsp);
                        return object;
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        C2112008Pe.LIZ(c0vsp);
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    C08SE.LIZIZ(file);
                    C801940Vd2.LIZJ(e);
                    C2112008Pe.LIZ(c0vsp);
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                c0vsp = null;
            } catch (Throwable th2) {
                th = th2;
                c0vsp = null;
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C801940Vd2.LIZJ(th3);
            return null;
        }
    }

    public static void LIZIZ(C0VSJ c0vsj, Object obj) {
        boolean z;
        C0VSV c0vsv;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0vsj.getAbsolutePath());
            sbLIZ.append(".bk");
            C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.isDirectory()) {
                C08SE.LIZIZ(c0vsj);
            } else if (c0vsj.exists()) {
                if (c0vsj2.exists()) {
                    c0vsj2.delete();
                }
                c0vsj.renameTo(c0vsj2);
            }
            C0VSV c0vsv2 = null;
            try {
                try {
                    c0vsv = new C0VSV(c0vsj);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                new ObjectOutputStream(c0vsv).writeObject(obj);
                C2112008Pe.LIZ(c0vsv);
                z = true;
            } catch (Exception e2) {
                e = e2;
                c0vsv2 = c0vsv;
                TryCatchGuardChecker.doCheck(e);
                C801940Vd2.LIZJ(e);
                C2112008Pe.LIZ(c0vsv2);
                z = false;
            } catch (Throwable th2) {
                th = th2;
                c0vsv2 = c0vsv;
                TryCatchGuardChecker.doCheck(th);
                C2112008Pe.LIZ(c0vsv2);
                throw th;
            }
            if (c0vsj2.exists()) {
                if (z) {
                    C08SE.LIZIZ(c0vsj2);
                    return;
                }
                if (c0vsj.exists()) {
                    C08SE.LIZIZ(c0vsj);
                }
                c0vsj2.renameTo(c0vsj);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C801940Vd2.LIZJ(th3);
        }
    }
}

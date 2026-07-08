package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15iE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20594015iE {
    public final String LIZ;

    public final int LIZ() {
        Keva repoFromSp;
        int i = 0;
        try {
            if (C20594115iF.LIZ == null) {
                try {
                    C844470XAv.LIZ.getClass();
                    repoFromSp = KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "tablet_cache", 0);
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    repoFromSp = null;
                }
                C20594115iF.LIZ = repoFromSp;
            }
            Keva keva = C20594115iF.LIZ;
            if (keva != null) {
                i = keva.getInt(this.LIZ, 0);
                return i;
            }
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return i;
    }

    public AbstractC20594015iE(String str) {
        this.LIZ = str;
    }

    public final void LIZIZ(int i) {
        Keva repoFromSp;
        try {
            if (C20594115iF.LIZ == null) {
                try {
                    C844470XAv.LIZ.getClass();
                    repoFromSp = KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "tablet_cache", 0);
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    repoFromSp = null;
                }
                C20594115iF.LIZ = repoFromSp;
            }
            Keva keva = C20594115iF.LIZ;
            if (keva != null) {
                keva.storeInt(this.LIZ, i);
            }
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
            e2.printStackTrace();
        }
    }
}

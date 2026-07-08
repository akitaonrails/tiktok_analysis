package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.100a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC191754100a extends AbstractC191755100b {
    public abstract long LIZIZ();

    public abstract int LIZJ();

    public final boolean LIZLLL() {
        return System.currentTimeMillis() > C100Z.LIZIZ(LIZ()) + LIZIZ();
    }

    public final void LJ() {
        if (C100Z.LIZ(LIZ()) >= LIZJ()) {
            C100Z c100z = this.LIZ;
            String strLIZ = LIZ();
            c100z.getClass();
            Keva keva = C100Z.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append("_cnt_");
            sbLIZ.append(C100Z.LIZJ());
            keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        }
        this.LIZ.LIZLLL(LIZ());
        C100Z.LJ(LIZ());
    }
}

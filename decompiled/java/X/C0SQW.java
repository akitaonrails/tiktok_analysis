package X;

import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0SQW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQW {
    public int LJI;
    public int LJII;
    public float LIZ = 0.0f;
    public float LIZIZ = 0.0f;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(457));
    public float LIZLLL = -1.0f;
    public final float LJ = C339190DRl.LIZ(52);
    public int LJFF = -1;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(452));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(453));

    public final float LIZ() {
        if (this.LIZLLL < 0.0f) {
            this.LIZLLL = (((Number) this.LIZJ.getValue()).floatValue() * 32) / 68;
        }
        return this.LIZLLL;
    }

    public final int LIZIZ(C19EG c19eg) {
        if (this.LJII == 0) {
            this.LJII = LIZJ(c19eg) - C0H9H.LIZIZ(49);
        }
        if (this.LJI <= 0) {
            C844470XAv.LIZ.getClass();
            this.LJI = C11VU.LIZLLL(C844470XAv.LIZ()) - C0H9H.LIZIZ(40);
        }
        return this.LJI;
    }

    public final int LIZJ(C19EG c19eg) {
        if (this.LJFF < 0) {
            C721640SSk.LIZ.getClass();
            this.LJFF = C721640SSk.LJII(c19eg);
        }
        return this.LJFF;
    }
}

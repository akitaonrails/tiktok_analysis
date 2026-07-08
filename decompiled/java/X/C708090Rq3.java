package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Rq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708090Rq3 implements C0RQG {
    public final InterfaceC1483820oiS LIZ;
    public InterfaceC1479620obg LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1587));

    public final InterfaceC1484830ok5 LIZIZ() {
        return (InterfaceC1484830ok5) this.LIZJ.getValue();
    }

    @Override // X.C0RQG
    public final void LIZ(C0RQ8 c0rq8) {
        try {
            switch (C692870RFt.LIZ[c0rq8.ordinal()]) {
                case 1:
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LJI("AdCardBgmPlayer", "INIT");
                    LIZIZ().LIZJ(this.LIZ);
                    return;
                case 2:
                    int i2 = C2187451AjH.LIZ;
                    C1720106oR.LJI("AdCardBgmPlayer", "START");
                    LIZIZ().LJ(this.LIZIZ);
                    return;
                case 3:
                    int i3 = C2187451AjH.LIZ;
                    C1720106oR.LJI("AdCardBgmPlayer", "PAUSE");
                    LIZIZ().pause();
                    return;
                case 4:
                    int i4 = C2187451AjH.LIZ;
                    C1720106oR.LJI("AdCardBgmPlayer", "RESUME");
                    LIZIZ().resume();
                    return;
                case 5:
                    int i5 = C2187451AjH.LIZ;
                    C1720106oR.LJI("AdCardBgmPlayer", "STOP");
                    LIZIZ().stop();
                    return;
                case 6:
                    int i6 = C2187451AjH.LIZ;
                    C1720106oR.LJI("AdCardBgmPlayer", "RELEASE");
                    LIZIZ().release();
                    return;
                default:
                    throw new C1954807lC();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public C708090Rq3(InterfaceC1483820oiS interfaceC1483820oiS, InterfaceC1479620obg interfaceC1479620obg) {
        this.LIZ = interfaceC1483820oiS;
        this.LIZIZ = interfaceC1479620obg;
    }
}

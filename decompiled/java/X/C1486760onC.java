package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewHolder;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0onC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486760onC implements InterfaceC1486770onD {
    public final InterfaceC1483820oiS LIZ;
    public final InterfaceC1479620obg LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 134));

    public final InterfaceC1484830ok5 LIZIZ() {
        return (InterfaceC1484830ok5) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC1486770onD
    public final void LIZ(EnumC1486800onG enumC1486800onG) {
        try {
            switch (C1486790onF.LIZ[enumC1486800onG.ordinal()]) {
                case 1:
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LJI("TTRecUserBgmPlayer", "INIT");
                    LIZIZ().LIZJ(this.LIZ);
                    return;
                case 2:
                    int i2 = C2187451AjH.LIZ;
                    C1720106oR.LJI("TTRecUserBgmPlayer", "START");
                    LIZIZ().LJ(this.LIZIZ);
                    return;
                case 3:
                    int i3 = C2187451AjH.LIZ;
                    C1720106oR.LJI("TTRecUserBgmPlayer", "PAUSE");
                    LIZIZ().pause();
                    return;
                case 4:
                    int i4 = C2187451AjH.LIZ;
                    C1720106oR.LJI("TTRecUserBgmPlayer", "RESUME");
                    LIZIZ().resume();
                    return;
                case 5:
                    int i5 = C2187451AjH.LIZ;
                    C1720106oR.LJI("TTRecUserBgmPlayer", "STOP");
                    LIZIZ().stop();
                    return;
                case 6:
                    int i6 = C2187451AjH.LIZ;
                    C1720106oR.LJI("TTRecUserBgmPlayer", "RELEASE");
                    LIZIZ().release();
                    return;
                default:
                    throw new C1954807lC();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJFF("TTRecUserBgmPlayer", e.getStackTrace().toString());
        }
    }

    public C1486760onC(TTRecUserBigCardViewHolder tTRecUserBigCardViewHolder, C1486740onA c1486740onA) {
        this.LIZ = tTRecUserBigCardViewHolder;
        this.LIZIZ = c1486740onA;
    }
}

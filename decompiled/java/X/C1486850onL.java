package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.series.commonfeed.holder.MiniDramaDNUGuideListCard;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0onL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486850onL implements InterfaceC1486860onM {
    public final InterfaceC1483820oiS LIZ;
    public final InterfaceC1479620obg LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 219));

    public final InterfaceC1484830ok5 LIZIZ() {
        return (InterfaceC1484830ok5) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC1486860onM
    public final void LIZ(EnumC1486890onP enumC1486890onP) {
        try {
            switch (C1486880onO.LIZ[enumC1486890onP.ordinal()]) {
                case 1:
                    LIZIZ().LIZJ(this.LIZ);
                    return;
                case 2:
                    LIZIZ().LJ(this.LIZIZ);
                    return;
                case 3:
                    LIZIZ().pause();
                    return;
                case 4:
                    LIZIZ().resume();
                    return;
                case 5:
                    LIZIZ().stop();
                    return;
                case 6:
                    LIZIZ().release();
                    return;
                default:
                    throw new C1954807lC();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJFF("MiniDramaBgmPlayerManager", e.getStackTrace().toString());
        }
    }

    public C1486850onL(MiniDramaDNUGuideListCard miniDramaDNUGuideListCard, C1485920olq c1485920olq) {
        this.LIZ = miniDramaDNUGuideListCard;
        this.LIZIZ = c1485920olq;
    }
}

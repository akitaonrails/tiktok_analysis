package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.interest.card.InterestCardCellComponent;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0onQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486900onQ implements InterfaceC1486910onR {
    public final InterfaceC1483820oiS LIZ;
    public final InterfaceC1479620obg LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 160));

    public final InterfaceC1484830ok5 LIZIZ() {
        return (InterfaceC1484830ok5) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC1486910onR
    public final void LIZ(EnumC1486960onW enumC1486960onW) {
        try {
            switch (C1486950onV.LIZ[enumC1486960onW.ordinal()]) {
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
            C2344809Gs.LJFF("IRS_Card_music", e.getStackTrace().toString());
        }
    }

    public C1486900onQ(InterestCardCellComponent interestCardCellComponent, C1486930onT c1486930onT) {
        this.LIZ = interestCardCellComponent;
        this.LIZIZ = c1486930onT;
    }
}

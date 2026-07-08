package X;

import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0exj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108890exj implements InterfaceC1107960ewE, InterfaceC1059280dfi {
    public final C1108900exk LL;

    @Override // X.InterfaceC1108000ewI
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
    }

    @Override // X.InterfaceC1107960ewE
    public final String LJ() {
        String str = this.LL.LIZLLL;
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC1107960ewE
    public final Function1<SparkContext, Unit> LJFF() {
        return new AwS596S0100000_17(this, 611);
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        ((IPinCardService) C1161920gLG.LIZJ(IPinCardService.class)).Rg(EnumC1107860ew4.LIVE_GOAL, EnumC1108010ewJ.MANUALLY_CLOSE, null);
    }

    public C1108890exj(C1108900exk c1108900exk) {
        this.LL = c1108900exk;
    }
}

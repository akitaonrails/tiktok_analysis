package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS412S0200000_11;

/* JADX INFO: renamed from: X.0ROV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0ROV extends C09AY implements Function1<C698680Ras, C698680Ras> {
    public final /* synthetic */ InteractBottomBannerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ROV(InteractBottomBannerComponent interactBottomBannerComponent) {
        super(1);
        this.LL = interactBottomBannerComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C698680Ras invoke(C698680Ras c698680Ras) {
        C698680Ras c698680Ras2 = c698680Ras;
        new AwS412S0200000_11(c698680Ras2, this.LL, 53);
        C0T6L.LIZLLL();
        if (C1203404nI.LIZ()) {
            this.LL.gg(new C700260RdQ(c698680Ras2, null, false, null, 14));
            return c698680Ras2;
        }
        this.LL.gg(new C700260RdQ(c698680Ras2, null, false, null, 14));
        return c698680Ras2;
    }
}

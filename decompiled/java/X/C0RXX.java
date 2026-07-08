package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RXX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RXX extends C09AY implements Function0<String> {
    public final /* synthetic */ InteractBottomBannerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RXX(InteractBottomBannerComponent interactBottomBannerComponent) {
        super(0);
        this.LL = interactBottomBannerComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.LL.LLLFF.getValue();
    }
}

package X;

import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.android.livesdk.viewerwishes.common.viewmodel.ViewerWishesViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176971AHv extends C09AY implements Function1<C2176931AHr, C2176931AHr> {
    public final /* synthetic */ ViewerPicksInfo LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ ViewerWishesViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2176971AHv(ViewerPicksInfo viewerPicksInfo, long j, ViewerWishesViewModel viewerWishesViewModel) {
        super(1);
        this.LL = viewerPicksInfo;
        this.LLILLJJLI = j;
        this.LLILLL = viewerWishesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2176931AHr invoke(C2176931AHr c2176931AHr) {
        EnumC2176951AHt enumC2176951AHt = EnumC2176951AHt.UPDATE_TIME;
        ViewerPicksInfo viewerPicksInfo = this.LL;
        Long lValueOf = Long.valueOf(this.LLILLJJLI);
        EnumC2176961AHu enumC2176961AHuVQ2 = this.LLILLL.vQ2(this.LL);
        c2176931AHr.getClass();
        return new C2176931AHr(enumC2176951AHt, viewerPicksInfo, lValueOf, enumC2176961AHuVQ2);
    }
}

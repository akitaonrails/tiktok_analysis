package X;

import com.ss.android.ugc.aweme.videoadaption.adaptioncontext.VideoAdaptionManagerContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20565215da extends C09AY implements Function0<C20566315dl> {
    public final /* synthetic */ VideoAdaptionManagerContext LL;
    public final /* synthetic */ C20564615dU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20565215da(VideoAdaptionManagerContext videoAdaptionManagerContext, C20564615dU c20564615dU) {
        super(0);
        this.LL = videoAdaptionManagerContext;
        this.LLILLJJLI = c20564615dU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C20566315dl invoke() {
        C20564615dU.Companion.getClass();
        return new C20566315dl(C20564615dU.tabletResizeHelper$delegate.getValue(), this.LL, this.LLILLJJLI.getTabletHandlerFactory());
    }
}

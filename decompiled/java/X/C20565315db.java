package X;

import com.ss.android.ugc.aweme.videoadaption.adaptioncontext.VideoAdaptionManagerContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20565315db extends C09AY implements Function0<C1869440ykQ> {
    public final /* synthetic */ VideoAdaptionManagerContext LL;
    public final /* synthetic */ C20564615dU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20565315db(VideoAdaptionManagerContext videoAdaptionManagerContext, C20564615dU c20564615dU) {
        super(0);
        this.LL = videoAdaptionManagerContext;
        this.LLILLJJLI = c20564615dU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1869440ykQ invoke() {
        return new C1869440ykQ(C20562515d9.LIZ().enable_feed_async_adaption, this.LL, this.LLILLJJLI.getFeedHandlerFactory());
    }
}

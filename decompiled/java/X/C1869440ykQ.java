package X;

import com.ss.android.ugc.aweme.videoadaption.adaptioncontext.VideoAdaptionManagerContext;

/* JADX INFO: renamed from: X.0ykQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869440ykQ implements InterfaceC1869460ykS {
    public final boolean LL;
    public final VideoAdaptionManagerContext LLILLJJLI;
    public final InterfaceC1869390ykL LLILLL;

    public final boolean getEnableAsyncAdaption() {
        return this.LL;
    }

    @Override // X.InterfaceC1869460ykS
    public InterfaceC1869390ykL getHandlerFactory() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1869460ykS
    public VideoAdaptionManagerContext getManagerContext() {
        return this.LLILLJJLI;
    }

    public C1869440ykQ(boolean z, VideoAdaptionManagerContext videoAdaptionManagerContext, InterfaceC1869390ykL interfaceC1869390ykL) {
        this.LL = z;
        this.LLILLJJLI = videoAdaptionManagerContext;
        this.LLILLL = interfaceC1869390ykL;
    }
}

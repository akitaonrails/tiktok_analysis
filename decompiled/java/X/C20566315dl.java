package X;

import com.ss.android.ugc.aweme.videoadaption.adaptioncontext.VideoAdaptionManagerContext;

/* JADX INFO: renamed from: X.15dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20566315dl implements InterfaceC1869460ykS {
    public static final int $stable = 8;
    public final C0RG7 LL;
    public final VideoAdaptionManagerContext LLILLJJLI;
    public final InterfaceC1869390ykL LLILLL;

    @Override // X.InterfaceC1869460ykS
    public InterfaceC1869390ykL getHandlerFactory() {
        return this.LLILLL;
    }

    public final C0RG7 getTabletResizeHelper() {
        return this.LL;
    }

    @Override // X.InterfaceC1869460ykS
    public VideoAdaptionManagerContext getManagerContext() {
        return this.LLILLJJLI;
    }

    public C20566315dl(C0RG7 c0rg7, VideoAdaptionManagerContext videoAdaptionManagerContext, InterfaceC1869390ykL interfaceC1869390ykL) {
        this.LL = c0rg7;
        this.LLILLJJLI = videoAdaptionManagerContext;
        this.LLILLL = interfaceC1869390ykL;
    }
}

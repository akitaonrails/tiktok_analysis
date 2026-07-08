package X;

import com.ss.android.ugc.aweme.vibefeed.feed.VibeDetailSharedVM;

/* JADX INFO: renamed from: X.0P3Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.VibeDetailSharedVM", f = "VibeDetailSharedVM.kt", l = {159, 167, 173}, m = "onRefresh")
public final class C0P3Z extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ VibeDetailSharedVM LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0P3Z(VibeDetailSharedVM vibeDetailSharedVM, InterfaceC1364105Vn<? super C0P3Z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = vibeDetailSharedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeDetailSharedVM@72c.onRefresh$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILZIL.onRefresh(this);
        C1C7U.LIZIZ("VibeDetailSharedVM@72c.onRefresh$1");
        return objOnRefresh;
    }
}

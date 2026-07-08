package X;

import com.ss.android.ugc.aweme.vibefeed.feed.VibeDetailSharedVM;

/* JADX INFO: renamed from: X.0P3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.VibeDetailSharedVM", f = "VibeDetailSharedVM.kt", l = {261}, m = "doRealRequest")
public final class C638600P3a extends AbstractC23140094w {
    public C0P35 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VibeDetailSharedVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C638600P3a(VibeDetailSharedVM vibeDetailSharedVM, InterfaceC1364105Vn<? super C638600P3a> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = vibeDetailSharedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeDetailSharedVM@72c.doRealRequest$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLL.BQ2(null, 0, null, this);
        C1C7U.LIZIZ("VibeDetailSharedVM@72c.doRealRequest$1");
        return objBQ2;
    }
}

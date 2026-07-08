package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListBBViewModel;

/* JADX INFO: renamed from: X.0xpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListBBViewModel", f = "LiveReplayListBBViewModel.kt", l = {161}, m = "fetchReplayVideoInfosFromBB")
public final class C1834070xpN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LiveReplayListBBViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1834070xpN(LiveReplayListBBViewModel liveReplayListBBViewModel, InterfaceC1364105Vn<? super C1834070xpN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = liveReplayListBBViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveReplayListBBViewModel@d256.fetchReplayVideoInfosFromBB$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(this);
        C1C7U.LIZIZ("LiveReplayListBBViewModel@d256.fetchReplayVideoInfosFromBB$1");
        return objWQ2;
    }
}

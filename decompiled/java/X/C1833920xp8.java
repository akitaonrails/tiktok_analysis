package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel;

/* JADX INFO: renamed from: X.0xp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel", f = "LiveReplayListViewModel.kt", l = {113}, m = "fetchLiveReplayList")
public final class C1833920xp8 extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ LiveReplayListViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833920xp8(LiveReplayListViewModel liveReplayListViewModel, InterfaceC1364105Vn<? super C1833920xp8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = liveReplayListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveReplayListViewModel@885a.fetchLiveReplayList$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZIL.wQ2(0, null, this);
        C1C7U.LIZIZ("LiveReplayListViewModel@885a.fetchLiveReplayList$1");
        return objWQ2;
    }
}

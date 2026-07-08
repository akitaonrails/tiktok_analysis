package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.replay.ReplayListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0xrt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.replay.ReplayListViewModel", f = "ReplayListVM.kt", l = {BaseNotice.CREATOR}, m = "fetchRealPage")
public final class C1835630xrt extends AbstractC23140094w {
    public long LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ ReplayListViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1835630xrt(ReplayListViewModel replayListViewModel, InterfaceC1364105Vn<? super C1835630xrt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = replayListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplayListViewModel@3eaf.fetchRealPage$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZIL.wQ2(0L, this);
        C1C7U.LIZIZ("ReplayListViewModel@3eaf.fetchRealPage$1");
        return objWQ2;
    }
}

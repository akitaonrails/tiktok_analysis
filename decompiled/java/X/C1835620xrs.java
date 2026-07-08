package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.myclips.MyClipsListViewModel;

/* JADX INFO: renamed from: X.0xrs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.myclips.MyClipsListViewModel", f = "MyClipsListVM.kt", l = {66}, m = "fetchRealPage")
public final class C1835620xrs extends AbstractC23140094w {
    public long LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ MyClipsListViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1835620xrs(MyClipsListViewModel myClipsListViewModel, InterfaceC1364105Vn<? super C1835620xrs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = myClipsListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MyClipsListViewModel@3b30.fetchRealPage$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZIL.wQ2(0L, this);
        C1C7U.LIZIZ("MyClipsListViewModel@3b30.fetchRealPage$1");
        return objWQ2;
    }
}

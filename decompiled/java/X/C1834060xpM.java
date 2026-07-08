package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListBBViewModel;

/* JADX INFO: renamed from: X.0xpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListBBViewModel", f = "LiveReplayListBBViewModel.kt", l = {31, LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "onRefresh")
public final class C1834060xpM extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LiveReplayListBBViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1834060xpM(LiveReplayListBBViewModel liveReplayListBBViewModel, InterfaceC1364105Vn<? super C1834060xpM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = liveReplayListBBViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveReplayListBBViewModel@d256.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("LiveReplayListBBViewModel@d256.onRefresh$1");
        return objOnRefresh;
    }
}

package X;

import com.bytedance.android.live.liveinteract.feed.match.itemcard.MatchFeedItemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0bLA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969660bLA {
    public final MatchFeedItemViewModel LIZ = new MatchFeedItemViewModel();
    public DataChannel LIZIZ;

    public final void LIZ() {
        C20441214yg.LJ("MatchFeedItemDelegate", "onDestroy");
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LIZIZ = null;
        MatchFeedItemViewModel matchFeedItemViewModel = this.LIZ;
        matchFeedItemViewModel.getClass();
        EnumC964170bCJ enumC964170bCJ = EnumC964170bCJ.MATCH_END;
        matchFeedItemViewModel.LLILZIL = enumC964170bCJ;
        matchFeedItemViewModel.LLILZIL = EnumC964170bCJ.NONE;
        DataChannel dataChannel2 = matchFeedItemViewModel.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(matchFeedItemViewModel);
        }
        matchFeedItemViewModel.LLILLJJLI = null;
        matchFeedItemViewModel.LLILZLL = null;
        MatchFeedItemViewModel matchFeedItemViewModel2 = this.LIZ;
        matchFeedItemViewModel2.getClass();
        matchFeedItemViewModel2.LLILZIL = enumC964170bCJ;
    }
}

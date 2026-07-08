package X;

import com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;

/* JADX INFO: renamed from: X.0SPC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SPC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C0SZ8 c0sz8, Aweme aweme) {
        Boolean boolValueOf;
        BaseFeedPlayerView baseFeedPlayerViewE;
        BaseFeedPlayerView baseFeedPlayerViewE2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldCommitColdBoot called with: , isFirstFeedCompleted = [");
        sbLIZ.append(C0CN5.LJII());
        sbLIZ.append("] ,, isSurfaceViewUsed = [");
        if (c0sz8 != null && (baseFeedPlayerViewE2 = c0sz8.E()) != null) {
            boolValueOf = Boolean.valueOf(baseFeedPlayerViewE2.Mg());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append("] ,");
        C2188811AlT.LIZIZ(sbLIZ);
        if ((!((Boolean) C285090BFj.LJIIZILJ.getValue()).booleanValue() || (c0sz8 != null && (baseFeedPlayerViewE = c0sz8.E()) != null && !baseFeedPlayerViewE.Mg())) && C1150504el.LIZ().LJII && C1150504el.LIZ().LJIIJJI == 0) {
            InterfaceC1603190roz.LJJIJIIJI.getClass();
            if (C0SPD.LIZ() && (c0sz8 instanceof FullFeedVideoViewHolder)) {
                if (!((Boolean) C285090BFj.LJIILLIIL.getValue()).booleanValue() || (aweme != null && AwemeBizOptExtKt.getAwemeCacheType(aweme) == 1)) {
                    C089T.LIZJ = true;
                }
            }
        }
    }
}

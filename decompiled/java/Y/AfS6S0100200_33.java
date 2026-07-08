package Y;

import X.C09JN;
import X.C1227904rF;
import X.C1A56;
import X.C1A57;
import X.C1C7U;
import X.C20267014Rw;
import X.C589080N8o;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.live.RelatedLiveTagStruct;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssemTriggerV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes34.dex */
public class AfS6S0100200_33 implements C09JN {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00d1: IGET (r1 I:java.lang.Object) = (r0 I:Y.AfS6S0100200_33) (LINE:33554641) Y.AfS6S0100200_33.l0 java.lang.Object, block:B:30:0x00c0 */
    /* JADX WARN: Type inference failed for: r0v0, types: [Y.AfS6S0100200_33] */
    public static final void accept$0(AfS6S0100200_33 afS6S0100200_33, Object obj) {
        ?? r0;
        RelatedLiveTagStruct relatedLiveTag;
        Aweme aweme;
        Aweme aweme2;
        final RelatedLiveTagStruct relatedLiveTag2;
        RelatedLiveTagStruct relatedLiveTagStruct;
        String str;
        Aweme aweme3;
        Aweme aweme4;
        C1C7U.LIZ("GameLiveBottomBarAssemTriggerV2@2d62.checkUpdateContent$3");
        String str2 = (String) obj;
        String aid = null;
        try {
            C589080N8o.LIZIZ(C20267014Rw.LIZ, "GameLiveBottomBarAssemTest", new AwS177S1100000_28(str2, (GameLiveBottomBarAssemTriggerV2) afS6S0100200_33.l0, 18));
            VideoItemParams videoItemParams = ((GameLiveBottomBarAssemTriggerV2) afS6S0100200_33.l0).LLJJLIIIJLLLLLLLZ;
            if (videoItemParams != null && (aweme4 = videoItemParams.getAweme()) != null) {
                relatedLiveTag2 = aweme4.getRelatedLiveTag();
            } else {
                relatedLiveTag2 = null;
            }
            C1227904rF.LIZ.getClass();
            relatedLiveTagStruct = (RelatedLiveTagStruct) C1227904rF.LIZIZ(str2, RelatedLiveTagStruct.class);
            str = relatedLiveTagStruct.content;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C589080N8o.LIZLLL(C20267014Rw.LIZ, "GameLiveBottomBarAssemTest", new AwS546S0100000_2(e, 1147));
            int i = GameLiveBottomBarAssemTriggerV2.LLJLL;
            VideoItemParams videoItemParams2 = ((GameLiveBottomBarAssemTriggerV2) r0.l0).LLJJLIIIJLLLLLLLZ;
            if (videoItemParams2 != null && (aweme2 = videoItemParams2.getAweme()) != null) {
                relatedLiveTag = aweme2.getRelatedLiveTag();
            } else {
                relatedLiveTag = null;
            }
            boolean zLIZIZ = C1A56.LIZIZ(((GameLiveBottomBarAssemTriggerV2) r0.l0).LJJIJL());
            long j = r0.j1;
            long j2 = r0.j2;
            C1A57 c1a57 = C1A57.LIZ;
            VideoItemParams videoItemParams3 = ((GameLiveBottomBarAssemTriggerV2) r0.l0).LLJJLIIIJLLLLLLLZ;
            if (videoItemParams3 != null && (aweme = videoItemParams3.getAweme()) != null) {
                aid = aweme.getAid();
            }
            c1a57.getClass();
            C1A56.LIZJ(videoItemParams2, relatedLiveTag, false, zLIZIZ, true, j, j2, false, C1A57.LIZIZ(aid), 264);
        }
        if (str != null && str.length() != 0) {
            int i2 = GameLiveBottomBarAssemTriggerV2.LLJLL;
            final boolean zLIZIZ2 = C1A56.LIZIZ(((GameLiveBottomBarAssemTriggerV2) afS6S0100200_33.l0).LJJIJL());
            VideoItemParams videoItemParams4 = ((GameLiveBottomBarAssemTriggerV2) afS6S0100200_33.l0).LLJJLIIIJLLLLLLLZ;
            if (videoItemParams4 != null && (aweme3 = videoItemParams4.getAweme()) != null) {
                aweme3.setRelatedLiveTag(relatedLiveTagStruct);
            }
            FeedBottomBannerView feedBottomBannerView = (FeedBottomBannerView) ((GameLiveBottomBarAssemTriggerV2) afS6S0100200_33.l0).LJJIJL().findViewById(R.id.tr7);
            if (feedBottomBannerView != null) {
                String str3 = relatedLiveTagStruct.content;
                if (str3 == null) {
                    str3 = "";
                }
                feedBottomBannerView.setTitle(str3);
            }
            ((FeedBottomBannerView) ((GameLiveBottomBarAssemTriggerV2) afS6S0100200_33.l0).LJJIJL().findViewById(R.id.tr7)).invalidate();
            FeedBottomBannerView feedBottomBannerView2 = (FeedBottomBannerView) ((GameLiveBottomBarAssemTriggerV2) afS6S0100200_33.l0).LJJIJL().findViewById(R.id.tr7);
            if (feedBottomBannerView2 != null) {
                final GameLiveBottomBarAssemTriggerV2 gameLiveBottomBarAssemTriggerV2 = (GameLiveBottomBarAssemTriggerV2) afS6S0100200_33.l0;
                final long j3 = afS6S0100200_33.j1;
                final long j4 = afS6S0100200_33.j2;
                HandlerHook.viewPost(feedBottomBannerView2, new Runnable() { // from class: X.1A55
                    public final void LIZ() {
                        Aweme aweme5;
                        int i3 = GameLiveBottomBarAssemTriggerV2.LLJLL;
                        GameLiveBottomBarAssemTriggerV2 gameLiveBottomBarAssemTriggerV22 = gameLiveBottomBarAssemTriggerV2;
                        VideoItemParams videoItemParams5 = gameLiveBottomBarAssemTriggerV22.LLJJLIIIJLLLLLLLZ;
                        RelatedLiveTagStruct relatedLiveTagStruct2 = relatedLiveTag2;
                        boolean z = zLIZIZ2;
                        boolean zLIZIZ3 = C1A56.LIZIZ(gameLiveBottomBarAssemTriggerV22.LJJIJL());
                        long j5 = j3;
                        long j6 = j4;
                        C1A57 c1a572 = C1A57.LIZ;
                        VideoItemParams videoItemParams6 = gameLiveBottomBarAssemTriggerV2.LLJJLIIIJLLLLLLLZ;
                        String aid2 = (videoItemParams6 == null || (aweme5 = videoItemParams6.getAweme()) == null) ? null : aweme5.getAid();
                        c1a572.getClass();
                        C1A56.LIZJ(videoItemParams5, relatedLiveTagStruct2, z, zLIZIZ3, true, j5, j6, false, C1A57.LIZIZ(aid2), 256);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("GameLiveBottomBarAssemTriggerV2@2d62.checkUpdateContent$3$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("GameLiveBottomBarAssemTriggerV2@2d62.checkUpdateContent$3$2");
                    }
                });
            }
            C1C7U.LIZIZ("GameLiveBottomBarAssemTriggerV2@2d62.checkUpdateContent$3");
            return;
        }
        throw new Exception("content is empty");
    }

    public static final void accept$1(AfS6S0100200_33 afS6S0100200_33, Object obj) {
        RelatedLiveTagStruct relatedLiveTag;
        Aweme aweme;
        Aweme aweme2;
        C1C7U.LIZ("GameLiveBottomBarAssemTriggerV2@2d62.checkUpdateContent$4");
        C589080N8o.LIZLLL(C20267014Rw.LIZ, "GameLiveBottomBarAssemTest", new AwS546S0100000_2((Throwable) obj, 1148));
        int i = GameLiveBottomBarAssemTriggerV2.LLJLL;
        VideoItemParams videoItemParams = ((GameLiveBottomBarAssemTriggerV2) afS6S0100200_33.l0).LLJJLIIIJLLLLLLLZ;
        String aid = null;
        if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null) {
            relatedLiveTag = aweme2.getRelatedLiveTag();
        } else {
            relatedLiveTag = null;
        }
        boolean zLIZIZ = C1A56.LIZIZ(((GameLiveBottomBarAssemTriggerV2) afS6S0100200_33.l0).LJJIJL());
        long j = afS6S0100200_33.j1;
        long j2 = afS6S0100200_33.j2;
        C1A57 c1a57 = C1A57.LIZ;
        VideoItemParams videoItemParams2 = ((GameLiveBottomBarAssemTriggerV2) afS6S0100200_33.l0).LLJJLIIIJLLLLLLLZ;
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            aid = aweme.getAid();
        }
        c1a57.getClass();
        C1A56.LIZJ(videoItemParams, relatedLiveTag, false, zLIZIZ, true, j, j2, false, C1A57.LIZIZ(aid), 264);
        C1C7U.LIZIZ("GameLiveBottomBarAssemTriggerV2@2d62.checkUpdateContent$4");
    }

    public AfS6S0100200_33(GameLiveBottomBarAssemTriggerV2 gameLiveBottomBarAssemTriggerV2, long j, long j2, int i) {
        this.$t = i;
        this.l0 = gameLiveBottomBarAssemTriggerV2;
        this.j1 = j;
        this.j2 = j2;
    }
}

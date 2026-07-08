package X;

import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.ECGuidanceCard;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist.HighlightAutoPostSwitchCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDiscoveryInfo;
import com.ss.android.ugc.aweme.music.model.PreSaveInfo;
import com.ss.android.ugc.aweme.music.model.TT2DspAlbumInfo;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0P4C, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4C extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0P4C(HighlightAutoPostSwitchCell highlightAutoPostSwitchCell, int i) {
        super(300L);
        this.$t = i;
        this.l0 = highlightAutoPostSwitchCell;
    }

    public static final void LIZ$0(C0P4C c0p4c, View view) {
        TT2DspAlbumInfo tT2DspAlbumInfo;
        TT2DspAlbumInfo tT2DspAlbumInfo2;
        PreSaveInfo preSaveInfo;
        Music music;
        VideoMusicTitleAssem videoMusicTitleAssem = (VideoMusicTitleAssem) c0p4c.l0;
        MusicDiscoveryInfo musicDiscoveryInfo = ((VideoItemParams) C631370Opb.LIZ(videoMusicTitleAssem)).getAweme().getMusicDiscoveryInfo();
        String str = null;
        if (musicDiscoveryInfo != null) {
            tT2DspAlbumInfo = musicDiscoveryInfo.tt2DspAlbumInfo;
        } else {
            tT2DspAlbumInfo = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ((VideoMusicTitleAssem) c0p4c.l0);
        videoMusicTitleAssem.Aq(false, true);
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && (music = aweme.getMusic()) != null) {
            C633020OsG.LIZIZ.LJIJ(music);
        }
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        String str2 = videoItemParams.mEventType;
        String aid = videoItemParams.getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        String strValueOf = String.valueOf(videoItemParams.getAweme().getAwemeType());
        Music music2 = videoItemParams.getAweme().getMusic();
        MusicDiscoveryInfo musicDiscoveryInfo2 = videoItemParams.getAweme().getMusicDiscoveryInfo();
        if (musicDiscoveryInfo2 != null) {
            tT2DspAlbumInfo2 = musicDiscoveryInfo2.tt2DspAlbumInfo;
        } else {
            tT2DspAlbumInfo2 = null;
        }
        String strLJJII = c633020OsG.LJJII(str2, aid, strValueOf, music2, tT2DspAlbumInfo2);
        if (tT2DspAlbumInfo != null && (preSaveInfo = tT2DspAlbumInfo.preSaveInfo) != null) {
            str = preSaveInfo.schema;
        }
        SmartRouter.buildRoute(videoMusicTitleAssem.getContext(), UriProtector.parse(str).buildUpon().appendQueryParameter("log_extra", strLJJII).build().toString()).open();
    }

    public static final void LIZ$1(C0P4C c0p4c, View view) {
        int id;
        Object obj;
        Context context = ((VideoMusicTitleAssem) c0p4c.l0).getContext();
        if (context != null) {
            VideoMusicTitleAssem videoMusicTitleAssem = (VideoMusicTitleAssem) c0p4c.l0;
            VideoMusicBaseVM videoMusicBaseVMVp = videoMusicTitleAssem.Vp();
            TuxTextView tuxTextView = videoMusicTitleAssem.LLLIIL;
            if (tuxTextView != null) {
                id = tuxTextView.getId();
            } else {
                id = 0;
            }
            boolean z = videoMusicTitleAssem.LLLJ;
            boolean zLq = videoMusicTitleAssem.lq();
            boolean zT2 = C1589640rT8.LIZIZ.t2(C724240Sb0.LJI(videoMusicTitleAssem));
            C724270Sb3 c724270Sb3 = videoMusicTitleAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            videoMusicBaseVMVp.DQ2(new C1398450mUl(context, id, z, zLq, zT2, C729510SjV.LJJIJIL(((VideoItemParams) obj).getAweme()), false, null, videoMusicTitleAssem.kq(), 1804));
        }
    }

    public static final void LIZ$2(C0P4C c0p4c, View view) {
        HighlightsListViewModel highlightsListViewModelL5;
        ECGuidanceCard eCGuidanceCard;
        if (view != null && (eCGuidanceCard = (highlightsListViewModelL5 = ((HighlightAutoPostSwitchCell) c0p4c.l0).L5()).LLJILLL) != null) {
            highlightsListViewModelL5.setState(new AwS588S0100000_9(eCGuidanceCard, 668));
        }
    }

    public C0P4C(VideoMusicTitleAssem videoMusicTitleAssem, int i) {
        this.$t = i;
        this.l0 = videoMusicTitleAssem;
    }
}

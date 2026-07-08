package Y;

import X.C0PSL;
import X.C1578630rBN;
import X.C291001Au;
import android.text.TextUtils;
import com.bytedance.android.btm.api.BtmSDK;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.profile.business.profile.tab.MTAwemeListFragment;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AObjectS367S0100000_24 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public AObjectS367S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AObjectS367S0100000_24 aObjectS367S0100000_24, Object obj) {
        T t;
        MTAwemeListFragment mTAwemeListFragment = (MTAwemeListFragment) aObjectS367S0100000_24.l0;
        C291001Au c291001Au = (C291001Au) obj;
        mTAwemeListFragment.getClass();
        if (c291001Au != null && (t = c291001Au.LIZ) != 0) {
            String str = (String) ((Pair) t).getFirst();
            Music music = (Music) ((Pair) c291001Au.LIZ).getSecond();
            Iterator it2 = mTAwemeListFragment.LLJJJ.mmItems.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Aweme aweme = (Aweme) it2.next();
                if (TextUtils.equals(str, aweme.getAid())) {
                    aweme.setAddedSoundMusicInfo(music);
                    aweme.setMusic(music);
                    aweme.setMusicBeginTime(music.getMusicBeginTime());
                    if (aweme.getVideo() != null) {
                        Video video = aweme.getVideo();
                        if (video.getPlayAddr() != null && music.getPlayUrl() != null) {
                            video.getPlayAddr().setUri(music.getPlayUrl().getUri());
                            video.getPlayAddr().setUrlList(music.getPlayUrl().getUrlList());
                            video.getPlayAddr().setWidth(music.getPlayUrl().getWidth());
                            video.getPlayAddr().setHeight(music.getPlayUrl().getHeight());
                            video.getPlayAddr().setUrlKey(String.valueOf(music.getId()));
                        }
                        aweme.setVideo(video);
                    }
                    AwemeExtKt.getStatusSafety(aweme).getVideoMuteInfo().setAudioChangeStatus(0);
                    AwemeExtKt.getStatusSafety(aweme).getVideoMuteInfo().setIsMute(Boolean.FALSE);
                    AwemeExtKt.getStatusSafety(aweme).getVideoMuteInfo().setCopyrightViolation(false);
                    AwemeExtKt.getStatusSafety(aweme).getVideoMuteInfo().setMuteDesc("");
                    ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                    mTAwemeListFragment.LLJJJ.notifyDataSetChanged();
                }
            }
        }
        return null;
    }

    public static final Object invoke$1(AObjectS367S0100000_24 aObjectS367S0100000_24, Object obj) {
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aObjectS367S0100000_24.l0;
        feedRecommendFragment.getClass();
        int iIntValue = ((Integer) obj).intValue();
        boolean z = feedRecommendFragment.LLJZ;
        RootPanelComponent rootPanelComponentLIZJ = C1578630rBN.LIZJ(feedRecommendFragment);
        if (rootPanelComponentLIZJ != null) {
            rootPanelComponentLIZJ.onPageResume(iIntValue);
        }
        if (!z) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            Boolean bool = Boolean.TRUE;
            C0PSL c0psl = new C0PSL();
            c0psl.LIZ = true;
            btmSDK.onPageShow(feedRecommendFragment, bool, c0psl);
            return null;
        }
        return null;
    }

    public static final Object invoke$2(AObjectS367S0100000_24 aObjectS367S0100000_24, Object obj) {
        FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aObjectS367S0100000_24.l0;
        feedFollowFragment.getClass();
        C1578630rBN.LJFF(((Integer) obj).intValue(), feedFollowFragment);
        return null;
    }

    public static final Object invoke$3(AObjectS367S0100000_24 aObjectS367S0100000_24, Object obj) {
        FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aObjectS367S0100000_24.l0;
        feedFollowFragment.getClass();
        C1578630rBN.LJI(((Integer) obj).intValue(), feedFollowFragment);
        return null;
    }

    public static final Object invoke$4(AObjectS367S0100000_24 aObjectS367S0100000_24, Object obj) {
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aObjectS367S0100000_24.l0;
        feedRecommendFragment.getClass();
        C1578630rBN.LJFF(((Integer) obj).intValue(), feedRecommendFragment);
        return null;
    }
}

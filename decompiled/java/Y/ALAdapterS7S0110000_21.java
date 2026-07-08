package Y;

import X.C1347610lAl;
import X.C1353650lKV;
import X.C1353700lKa;
import X.C1618330sDP;
import X.C1744700vVE;
import X.C612110Nzd;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.commentlist.ui.CommentCharLimitConfig;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes22.dex */
public class ALAdapterS7S0110000_21 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS7S0110000_21 aLAdapterS7S0110000_21, Animator animator) {
        super.onAnimationCancel(animator);
        ((VideoMusicCoverAssem) aLAdapterS7S0110000_21.l0).getClass();
    }

    public static final void onAnimationCancel$1(ALAdapterS7S0110000_21 aLAdapterS7S0110000_21, Animator animator) {
        super.onAnimationCancel(animator);
        C1744700vVE.LJIIIZ(-2, (C1353650lKV) aLAdapterS7S0110000_21.l0);
    }

    public static final void onAnimationEnd$0(ALAdapterS7S0110000_21 aLAdapterS7S0110000_21, Animator animator) {
        super.onAnimationEnd(animator);
        if (aLAdapterS7S0110000_21.z1) {
            C612110Nzd.LIZ.getClass();
            Keva.getRepo("music_marquee_strategy_repo").storeInt(C612110Nzd.LIZ("key_music_cover_animation_count"), Keva.getRepo("music_marquee_strategy_repo").getInt(C612110Nzd.LIZ("key_music_cover_animation_count"), 0) + 1);
            Keva.getRepo("music_marquee_strategy_repo").storeLong(C612110Nzd.LIZ("key_music_cover_animation_show_time"), System.currentTimeMillis());
            C1618330sDP.LIZIZ.LJIIIIZZ();
        }
        ((VideoMusicCoverAssem) aLAdapterS7S0110000_21.l0).getClass();
        VideoMusicCoverAssem videoMusicCoverAssem = (VideoMusicCoverAssem) aLAdapterS7S0110000_21.l0;
        if (!videoMusicCoverAssem.LLLLLJIL) {
            videoMusicCoverAssem.LLLLLILLIL = false;
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS7S0110000_21 aLAdapterS7S0110000_21, Animator animator) {
        super.onAnimationEnd(animator);
        C1744700vVE.LJIIIZ(-2, (C1353650lKV) aLAdapterS7S0110000_21.l0);
        ((C1353650lKV) aLAdapterS7S0110000_21.l0).requestLayout();
    }

    public static final void onAnimationStart$0(ALAdapterS7S0110000_21 aLAdapterS7S0110000_21, Animator animator) {
        super.onAnimationStart(animator);
        VideoMusicCoverAssem videoMusicCoverAssem = (VideoMusicCoverAssem) aLAdapterS7S0110000_21.l0;
        videoMusicCoverAssem.LLLLJI = false;
        videoMusicCoverAssem.getClass();
    }

    public static final void onAnimationStart$1(ALAdapterS7S0110000_21 aLAdapterS7S0110000_21, Animator animator) {
        C1353650lKV c1353650lKV;
        Comment comment;
        int iIntValue;
        super.onAnimationStart(animator);
        if (aLAdapterS7S0110000_21.z1) {
            C1353650lKV c1353650lKV2 = (C1353650lKV) aLAdapterS7S0110000_21.l0;
            c1353650lKV2.setLimitedMaxLines(c1353650lKV2.LLJJJJ);
        } else {
            C1353650lKV c1353650lKV3 = (C1353650lKV) aLAdapterS7S0110000_21.l0;
            c1353650lKV3.setLimitedMaxLines(c1353650lKV3.getLimitedMaxLines() + ((CommentCharLimitConfig) C1353700lKa.LIZIZ.getValue()).expandLinesStep);
        }
        if (C1347610lAl.LIZLLL()) {
            C1353650lKV c1353650lKV4 = (C1353650lKV) aLAdapterS7S0110000_21.l0;
            Comment comment2 = c1353650lKV4.LLJJJJJIL;
            if (comment2 != null) {
                Integer maxActualLine = (Integer) ((LinkedHashMap) c1353650lKV4.LLJLLL).get(Integer.valueOf(c1353650lKV4.getLimitedMaxLines()));
                if (maxActualLine == null && (maxActualLine = ((C1353650lKV) aLAdapterS7S0110000_21.l0).getMaxActualLine()) == null) {
                    iIntValue = Integer.MAX_VALUE;
                } else {
                    iIntValue = maxActualLine.intValue();
                }
                comment2.setCurTextMaxLines(iIntValue);
            }
            C1353650lKV c1353650lKV5 = (C1353650lKV) aLAdapterS7S0110000_21.l0;
            Comment comment3 = c1353650lKV5.LLJJJJJIL;
            if (comment3 != null) {
                comment3.setCurTextLimitedLines(c1353650lKV5.getLimitedMaxLines());
            }
            if (aLAdapterS7S0110000_21.z1) {
                C1353650lKV c1353650lKV6 = (C1353650lKV) aLAdapterS7S0110000_21.l0;
                Comment comment4 = c1353650lKV6.LLJJJJJIL;
                if (comment4 != null) {
                    comment4.setCurTextMaxLines(c1353650lKV6.LLJJJJ);
                }
                C1353650lKV c1353650lKV7 = (C1353650lKV) aLAdapterS7S0110000_21.l0;
                Comment comment5 = c1353650lKV7.LLJJJJJIL;
                if (comment5 != null) {
                    comment5.setCurTextLimitedLines(c1353650lKV7.LLJJJJ);
                    return;
                }
                return;
            }
            return;
        }
        C1353650lKV c1353650lKV8 = (C1353650lKV) aLAdapterS7S0110000_21.l0;
        Comment comment6 = c1353650lKV8.LLJJJJJIL;
        if (comment6 != null) {
            comment6.setCurTextMaxLines(c1353650lKV8.getLimitedMaxLines());
        }
        if (!aLAdapterS7S0110000_21.z1 || (comment = (c1353650lKV = (C1353650lKV) aLAdapterS7S0110000_21.l0).LLJJJJJIL) == null) {
            return;
        }
        comment.setCurTextMaxLines(c1353650lKV.LLJJJJ);
    }

    public ALAdapterS7S0110000_21(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}

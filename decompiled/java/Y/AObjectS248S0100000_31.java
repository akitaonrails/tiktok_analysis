package Y;

import X.AnonymousClass0956;
import X.C123100dR;
import X.C129G;
import X.C1416310mxZ;
import X.C1482560ogQ;
import X.C154M;
import X.C15JN;
import X.C204599154b;
import X.C204604154g;
import X.C204645155v;
import X.C204646155w;
import X.C20502215Ki;
import X.C20502615Km;
import X.C20519815Rc;
import X.C20577315fX;
import X.C328730Cud;
import X.InterfaceC1441305kZ;
import X.InterfaceC1459480o5C;
import X.InterfaceC1652770t6x;
import X.InterfaceC204601154d;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent;
import com.tts.oecverify.BdTuring;
import dmt.av.video.VEPreviewMusicParams;
import kotlin.Pair;
import kotlin.jvm.internal.AwS43S0010000_31;
import kotlin.jvm.internal.Intrinsics;
import pyl.s;

/* JADX INFO: loaded from: classes32.dex */
public class AObjectS248S0100000_31 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
        }
    }

    public AObjectS248S0100000_31(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        Integer num = (Integer) obj;
        if (num != null && !((C20502215Ki) aObjectS248S0100000_31.l0).LLLILZLLLI()) {
            C20502215Ki c20502215Ki = (C20502215Ki) aObjectS248S0100000_31.l0;
            int iIntValue = num.intValue();
            int i = c20502215Ki.LLJILLL;
            if (i != 0 && i != iIntValue) {
                c20502215Ki.LLJILLL = iIntValue;
                c20502215Ki.LLLLIILL(false);
            }
        }
    }

    public static final void onChanged$1(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        Integer num = (Integer) obj;
        if (num != null && !((C20502215Ki) aObjectS248S0100000_31.l0).LLLILZLLLI()) {
            C20502215Ki c20502215Ki = (C20502215Ki) aObjectS248S0100000_31.l0;
            int iIntValue = num.intValue();
            int i = c20502215Ki.LLJJJIL;
            if (i != 0 && i != iIntValue) {
                c20502215Ki.LLJJJIL = c20502215Ki.LJJJIL(null, Integer.valueOf(iIntValue));
            }
        }
    }

    public static final void onChanged$10(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        C129G c129gLJ;
        VideoMusicModel videoMusicModel;
        Aweme aweme;
        Video video;
        C204599154b c204599154b = (C204599154b) aObjectS248S0100000_31.l0;
        if (c204599154b.LLJJIII != null) {
            VideoPlayerComponent videoPlayerComponentLIZLLL = c204599154b.LIZLLL();
            if (videoPlayerComponentLIZLLL != null) {
                VideoPlayerComponent.LJFF(videoPlayerComponentLIZLLL, ((C204599154b) aObjectS248S0100000_31.l0).LLJJIII);
            }
            VideoPlayerComponent videoPlayerComponentLIZLLL2 = ((C204599154b) aObjectS248S0100000_31.l0).LIZLLL();
            if (videoPlayerComponentLIZLLL2 != null) {
                videoPlayerComponentLIZLLL2.LLILZIL = ((C204599154b) aObjectS248S0100000_31.l0).LLJJIII;
            }
            VideoPlayerComponent videoPlayerComponentLIZLLL3 = ((C204599154b) aObjectS248S0100000_31.l0).LIZLLL();
            if (videoPlayerComponentLIZLLL3 != null && (videoMusicModel = videoPlayerComponentLIZLLL3.LLILZIL) != null && (aweme = videoMusicModel.getAweme()) != null && (video = aweme.getVideo()) != null) {
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                C1482560ogQ c1482560ogQLIZJ = VideoPlayerComponent.LIZJ(video, aid);
                videoPlayerComponentLIZLLL3.LIZIZ().setLoop(true);
                videoPlayerComponentLIZLLL3.LIZIZ().LJ(c1482560ogQLIZJ);
            }
            C204599154b c204599154b2 = (C204599154b) aObjectS248S0100000_31.l0;
            c204599154b2.LLJJIII = null;
            InterfaceC204601154d interfaceC204601154d = c204599154b2.LLJ;
            if (interfaceC204601154d != null && (c129gLJ = interfaceC204601154d.LJ()) != null) {
                c129gLJ.notifyDataSetChanged();
            }
        }
    }

    public static final void onChanged$11(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        ((C204599154b) aObjectS248S0100000_31.l0).LLJJIII = null;
    }

    public static final void onChanged$12(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        ((C204646155w) aObjectS248S0100000_31.l0).LLJIJIL.LIZLLL(new AwS43S0010000_31(C123100dR.LIZ(((VEPreviewMusicParams) obj).mPath), 12), true);
    }

    public static final void onChanged$13(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        C204646155w c204646155wLJ = ((C204645155v) aObjectS248S0100000_31.l0).LJ();
        MusicModel musicModelLJIL = c204646155wLJ.LLILZLL.LJIL();
        if (musicModelLJIL != null) {
            c204646155wLJ.LLJILLL = musicModelLJIL;
            c204646155wLJ.LLJILJILJ = C154M.LIZIZ;
        }
        InterfaceC1459480o5C interfaceC1459480o5C = (InterfaceC1459480o5C) c204646155wLJ.LLJI.getValue(c204646155wLJ, C204646155w.LLJJ[4]);
        if (interfaceC1459480o5C != null) {
            interfaceC1459480o5C.i21();
        }
    }

    public static final void onChanged$14(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        View view = null;
        if (((C20577315fX) aObjectS248S0100000_31.l0).isLoading()) {
            ((C20577315fX) aObjectS248S0100000_31.l0).LLLIIIIL().setClickable(false);
            TextView textView = ((C20577315fX) aObjectS248S0100000_31.l0).LLJJJ;
            if (textView == null) {
                textView = null;
            }
            textView.setClickable(false);
            View view2 = ((C20577315fX) aObjectS248S0100000_31.l0).LLJJJIL;
            if (view2 != null) {
                view = view2;
            }
            view.setClickable(false);
            return;
        }
        ((C20577315fX) aObjectS248S0100000_31.l0).LLLIIIIL().setClickable(true);
        TextView textView2 = ((C20577315fX) aObjectS248S0100000_31.l0).LLJJJ;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setClickable(true);
        View view3 = ((C20577315fX) aObjectS248S0100000_31.l0).LLJJJIL;
        if (view3 != null) {
            view = view3;
        }
        view.setClickable(true);
    }

    public static final void onChanged$15(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        C204599154b c204599154bLJII = ((C204604154g) aObjectS248S0100000_31.l0).LJII();
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        InterfaceC204601154d interfaceC204601154d = c204599154bLJII.LLJ;
        if (interfaceC204601154d != null) {
            interfaceC204601154d.LJI(zBooleanValue);
        }
    }

    public static final void onChanged$2(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        C20502615Km c20502615Km = (C20502615Km) obj;
        if (((C20502215Ki) aObjectS248S0100000_31.l0).LLLILZLLLI()) {
            ((C20502215Ki) aObjectS248S0100000_31.l0).LLLJ();
        }
        if (c20502615Km != null && c20502615Km.LJ == null) {
            if (!Intrinsics.LJFF(c20502615Km.LIZIZ, "")) {
                ((C20502215Ki) aObjectS248S0100000_31.l0).LLJJJJJIL = c20502615Km.LIZIZ;
            }
            C20502215Ki c20502215Ki = (C20502215Ki) aObjectS248S0100000_31.l0;
            AVMusic aVMusic = c20502615Km.LIZ;
            if (aVMusic != null) {
                aVMusic.getMusicId();
            }
            c20502215Ki.getClass();
            C20502215Ki c20502215Ki2 = (C20502215Ki) aObjectS248S0100000_31.l0;
            c20502215Ki2.LLJJJIL = c20502215Ki2.LJJJIL(c20502615Km.LIZ, Integer.valueOf(c20502615Km.LIZJ));
            C20502215Ki c20502215Ki3 = (C20502215Ki) aObjectS248S0100000_31.l0;
            AVMusic aVMusic2 = c20502615Km.LIZ;
            if (aVMusic2 == null) {
                aVMusic2 = c20502215Ki3.LLJJJJ;
            }
            c20502215Ki3.LLJJJJ = aVMusic2;
            int i = c20502615Km.LIZLLL;
            c20502215Ki3.LLJJI = i;
            c20502215Ki3.LLJJIII = i;
            c20502215Ki3.LLJJIJI = false;
            c20502215Ki3.LLJJIJIIJIL = false;
            c20502215Ki3.LLLIL().setIsSoundLoop(Boolean.valueOf(((C20502215Ki) aObjectS248S0100000_31.l0).LLJJIJI));
            if (((C20502215Ki) aObjectS248S0100000_31.l0).LLLLIIIILLL()) {
                C20502215Ki c20502215Ki4 = (C20502215Ki) aObjectS248S0100000_31.l0;
                C15JN c15jn = c20502215Ki4.LLLIIII;
                if (c15jn == null) {
                    c15jn = null;
                }
                c15jn.o4(C1416310mxZ.LJJL(c20502215Ki4.LLLIL(), 0, ((C20502215Ki) aObjectS248S0100000_31.l0).LLJJJJ, 1));
            }
            ((C20502215Ki) aObjectS248S0100000_31.l0).LLLLIILL(false);
        }
    }

    public static final void onChanged$3(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        ((C20502215Ki) aObjectS248S0100000_31.l0).LLLLIILL(false);
    }

    public static final void onChanged$4(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        AVMusic aVMusic;
        Pair pair = (Pair) obj;
        if (!Intrinsics.LJFF(((C20519815Rc) aObjectS248S0100000_31.l0).LLILZLL.isRecording().LIZJ(), Boolean.TRUE)) {
            if (pair != null && (aVMusic = (AVMusic) pair.getFirst()) != null) {
                ((C20519815Rc) aObjectS248S0100000_31.l0).LJJIJIL(aVMusic, null);
                return;
            }
            C328730Cud c328730Cud = ((C20519815Rc) aObjectS248S0100000_31.l0).LLJI;
            AnonymousClass0956 anonymousClass0956 = c328730Cud.LIZIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c328730Cud.LIZIZ = null;
            C20519815Rc c20519815Rc = (C20519815Rc) aObjectS248S0100000_31.l0;
            c20519815Rc.LLILLL.setRenderCacheString("ttsound_lyrics_data", "");
            c20519815Rc.LLILLL.setRenderCacheString("ttsound_music_info", "");
            c20519815Rc.LJJIIZI();
            c20519815Rc.LLJILJIL = null;
        }
    }

    public static final void onChanged$5(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        AVMusic aVMusicMr0 = ((C20519815Rc) aObjectS248S0100000_31.l0).LLILZIL.mr0();
        if (aVMusicMr0 != null) {
            ((C20519815Rc) aObjectS248S0100000_31.l0).LJJIJIL(aVMusicMr0, null);
        }
    }

    public static final void onChanged$6(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        s sVar = (s) obj;
        if (sVar != null) {
            ((C20519815Rc) aObjectS248S0100000_31.l0).LJJIJ(sVar);
        }
    }

    public static final void onChanged$7(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        AVMusic aVMusicMr0 = ((C20519815Rc) aObjectS248S0100000_31.l0).LLILZIL.mr0();
        if (aVMusicMr0 != null) {
            ((C20519815Rc) aObjectS248S0100000_31.l0).LJJIJIL(aVMusicMr0, null);
        }
    }

    public static final void onChanged$8(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        if (obj != null) {
            HandlerHook.viewPost(((C20519815Rc) aObjectS248S0100000_31.l0).LLILLL.getViewFunction().getView(), new ARunnableS131S0100000_31((C20519815Rc) aObjectS248S0100000_31.l0, 97));
        }
    }

    public static final void onChanged$9(AObjectS248S0100000_31 aObjectS248S0100000_31, Object obj) {
        C129G c129gLJ;
        C204599154b c204599154b = (C204599154b) aObjectS248S0100000_31.l0;
        VideoPlayerComponent videoPlayerComponentLIZLLL = c204599154b.LIZLLL();
        VideoMusicModel videoMusicModel = null;
        if (videoPlayerComponentLIZLLL != null) {
            videoMusicModel = videoPlayerComponentLIZLLL.LLILZIL;
        }
        c204599154b.LLJJIII = videoMusicModel;
        C204599154b c204599154b2 = (C204599154b) aObjectS248S0100000_31.l0;
        if (c204599154b2.LLJJIII != null) {
            InterfaceC1652770t6x interfaceC1652770t6x = (InterfaceC1652770t6x) c204599154b2.LLJJIJIL.getValue(c204599154b2, C204599154b.LLJJJJLIIL[5]);
            if (interfaceC1652770t6x != null) {
                interfaceC1652770t6x.Uj2(0, 0);
            }
            VideoPlayerComponent videoPlayerComponentLIZLLL2 = ((C204599154b) aObjectS248S0100000_31.l0).LIZLLL();
            if (videoPlayerComponentLIZLLL2 != null) {
                VideoPlayerComponent.LJI(videoPlayerComponentLIZLLL2);
            }
            InterfaceC204601154d interfaceC204601154d = ((C204599154b) aObjectS248S0100000_31.l0).LLJ;
            if (interfaceC204601154d != null && (c129gLJ = interfaceC204601154d.LJ()) != null) {
                c129gLJ.notifyDataSetChanged();
            }
        }
    }
}

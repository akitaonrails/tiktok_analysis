package Y;

import X.C09JN;
import X.C0XYI;
import X.C1389890mGx;
import X.C1C7U;
import X.C627680Oje;
import X.C627690Ojf;
import X.C786410Ut5;
import X.EnumC1783090wV9;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDescAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.WorkBenchNoticeMissionUpdateResponse;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes10.dex */
public class AfS145S0200000_9 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS145S0200000_9 afS145S0200000_9, Object obj) {
        C1C7U.LIZ("SearchAidSurveyApiManager@cf3.uploadSurveyData$1");
        if (((BaseResponse) obj).status_code == 0) {
            ((Function0) afS145S0200000_9.l0).invoke();
        } else {
            ((Function0) afS145S0200000_9.l1).invoke();
        }
        C1C7U.LIZIZ("SearchAidSurveyApiManager@cf3.uploadSurveyData$1");
    }

    public static final void accept$1(AfS145S0200000_9 afS145S0200000_9, Object obj) {
        C1C7U.LIZ("WorkBenchRepository@a4d7._operator$1$postUnsubscribeRequest$1");
        if (((WorkBenchNoticeMissionUpdateResponse) obj).statusCode == 0) {
            ((Function0) afS145S0200000_9.l0).invoke();
        } else {
            ((Function0) afS145S0200000_9.l1).invoke();
        }
        C1C7U.LIZIZ("WorkBenchRepository@a4d7._operator$1$postUnsubscribeRequest$1");
    }

    public static final void accept$2(AfS145S0200000_9 afS145S0200000_9, Object obj) {
        C1C7U.LIZ("MusicDescAssem@1774.startUpMusicDesc$4$1");
        C627680Oje c627680Oje = (C627680Oje) obj;
        if (!((MusicDescAssem) afS145S0200000_9.l0).LLJLL) {
            if (c627680Oje.LL >= c627680Oje.LLILLJJLI.LIZIZ) {
                C786410Ut5.LLLLLLZZ((TuxIconView) afS145S0200000_9.l1, 8);
            } else {
                C786410Ut5.LLLLLLZZ((TuxIconView) afS145S0200000_9.l1, 0);
            }
        }
        C1C7U.LIZIZ("MusicDescAssem@1774.startUpMusicDesc$4$1");
    }

    public static final void accept$3(AfS145S0200000_9 afS145S0200000_9, Object obj) {
        C1C7U.LIZ("MusicDescAssem@1774.startUpMusicDesc$4$2");
        if (((C627690Ojf) obj).LL == EnumC1783090wV9.FULL_PAGE) {
            ((MusicDescAssem) afS145S0200000_9.l0).LLJLL = true;
            C786410Ut5.LLLLLLZZ((TuxIconView) afS145S0200000_9.l1, 8);
            EventBus.LIZLLL().LJJI(((MusicDescAssem) afS145S0200000_9.l0).LLJLLIL.getValue());
        }
        C1C7U.LIZIZ("MusicDescAssem@1774.startUpMusicDesc$4$2");
    }

    public static final void accept$4(AfS145S0200000_9 afS145S0200000_9, Object obj) {
        C1C7U.LIZ("UserCanceledReactiveAccountImpl@11f3.handleReactiveClick$5");
        Runnable runnable = (Runnable) afS145S0200000_9.l0;
        if (runnable != null) {
            runnable.run();
        }
        ((C0XYI) afS145S0200000_9.l1).LJIIIZ();
        C1C7U.LIZIZ("UserCanceledReactiveAccountImpl@11f3.handleReactiveClick$5");
    }

    public static final void accept$5(AfS145S0200000_9 afS145S0200000_9, Object obj) {
        C1C7U.LIZ("UserCanceledReactiveAccountImpl@11f3.handleReactiveClick$6");
        Runnable runnable = (Runnable) afS145S0200000_9.l0;
        if (runnable != null) {
            runnable.run();
        }
        C0XYI c0xyi = (C0XYI) afS145S0200000_9.l1;
        c0xyi.getClass();
        C1389890mGx c1389890mGx = new C1389890mGx(c0xyi.LIZ);
        c1389890mGx.LJIIIZ(R.string.m25);
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("UserCanceledReactiveAccountImpl@11f3.handleReactiveClick$6");
    }

    public static final void accept$6(AfS145S0200000_9 afS145S0200000_9, Object obj) {
        C1C7U.LIZ("UserCanceledReactiveAccountImpl@11f3.handleReactiveClick$2");
        Runnable runnable = (Runnable) afS145S0200000_9.l0;
        if (runnable != null) {
            runnable.run();
        }
        ((C0XYI) afS145S0200000_9.l1).LJIIIZ();
        C1C7U.LIZIZ("UserCanceledReactiveAccountImpl@11f3.handleReactiveClick$2");
    }

    public static final void accept$7(AfS145S0200000_9 afS145S0200000_9, Object obj) {
        C1C7U.LIZ("UserCanceledReactiveAccountImpl@11f3.handleReactiveClick$3");
        Runnable runnable = (Runnable) afS145S0200000_9.l0;
        if (runnable != null) {
            runnable.run();
        }
        C0XYI c0xyi = (C0XYI) afS145S0200000_9.l1;
        c0xyi.getClass();
        C1389890mGx c1389890mGx = new C1389890mGx(c0xyi.LIZ);
        c1389890mGx.LJIIIZ(R.string.m25);
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("UserCanceledReactiveAccountImpl@11f3.handleReactiveClick$3");
    }

    public static final void accept$8(AfS145S0200000_9 afS145S0200000_9, Object obj) {
        C1C7U.LIZ("FilterVideoKeywordPresenter@a6a.dislikeAweme$1");
        if (((BaseResponse) obj).status_code == 0) {
            ((Function0) afS145S0200000_9.l0).invoke();
        } else {
            ((Function0) afS145S0200000_9.l1).invoke();
        }
        C1C7U.LIZIZ("FilterVideoKeywordPresenter@a6a.dislikeAweme$1");
    }

    public static final void accept$9(AfS145S0200000_9 afS145S0200000_9, Object obj) {
        C1C7U.LIZ("BulletinBoardProfileRepository@428d._operator$1$setShowOnProfileRx$1");
        if (((BaseResponse) obj).status_code == 0) {
            ((Function0) afS145S0200000_9.l0).invoke();
        } else {
            ((Function0) afS145S0200000_9.l1).invoke();
        }
        C1C7U.LIZIZ("BulletinBoardProfileRepository@428d._operator$1$setShowOnProfileRx$1");
    }

    public AfS145S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.component.surveybutton.FeedBottomSurveyButtonVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AwS445S0200000_9;

/* JADX INFO: renamed from: X.0Nfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599880Nfu extends AbstractC616030OEf<VideoItemParams> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final Lifecycle LLILZIL;
    public final C638900P4e LLILZLL;
    public final C638900P4e LLIZ;
    public C0ZP4 LLIZLLLIL;
    public C0ZP4 LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C599880Nfu.class, "buttonShowVM", "getButtonShowVM()Lcom/ss/android/ugc/aweme/feed/component/surveybutton/FeedBottomSurveyButtonVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C599880Nfu.class, "videoVM", "getVideoVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoViewModel;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void LJJJJZ() {
        C0ZP4 c0zp4 = this.LLIZLLLIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        C0ZP4 c0zp42 = this.LLJ;
        if (c0zp42 != null) {
            c0zp42.dispose();
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    public C599880Nfu(Lifecycle lifecycle) {
        super("bottom_button_feed_survey");
        this.LLILZIL = lifecycle;
        this.LLILZLL = new C638900P4e(this, C13LE.LIZ(FeedBottomSurveyButtonVM.class), 14);
        this.LLIZ = new C638900P4e(this, C13LE.LIZ(VideoViewModel.class), 15);
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void rr(Object obj) {
        Aweme aweme;
        boolean z;
        int i;
        C704840Rko c704840Rko;
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        C704830Rkn c704830Rkn = this.LLILLL;
        if (c704830Rkn != null && (c704840Rko = c704830Rkn.LJ) != null) {
            c704840Rko.LJIIIZ.put("survey_biz_type", String.valueOf(i));
        }
        C587470N2j c587470N2j = C587470N2j.LIZ;
        c587470N2j.getClass();
        if (C587470N2j.LIZIZ() == 1 || C587470N2j.LIZIZ() == 4) {
            this.LLIZLLLIL = C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLILZLL.getValue(this, LLJI[0]), new C2217381BqS() { // from class: X.0199
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C231900uz) obj2).LL;
                }
            }, null, new AwS445S0200000_9(videoItemParams, this, 42), 6);
        }
        this.LLJ = C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZ.getValue(this, LLJI[1]), new C2217381BqS() { // from class: X.0NgR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILZ;
            }
        }, null, new AwS445S0200000_9(videoItemParams, this, 43), 6);
        c587470N2j.getClass();
        if ((C587470N2j.LIZIZ() == 2 || C587470N2j.LIZIZ() == 3) && aweme != null && C587470N2j.LIZ(aweme) && C599890Nfv.LIZJ(aweme.getAid())) {
            LJ(true);
        }
    }
}

package X;

import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.suggestfollowing.FYPFollowingSuggestViewModel;
import com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS117S0201000_3;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2449809iq extends AbstractC616030OEf<VideoItemParams> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final Lifecycle LLILZIL;
    public boolean LLILZLL;
    public final C638900P4e LLIZ;
    public final C638900P4e LLIZLLLIL;
    public final C638900P4e LLJ;
    public Aweme LLJI;
    public String LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2449809iq.class, "holderVM", "getHolderVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C2449809iq.class, "pageContainerViewModel", "getPageContainerViewModel()Lcom/ss/android/ugc/aweme/feed/suggestfollowing/ProfileFollowingSuggestViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C2449809iq.class, "fypFollowingSuggestViewModel", "getFypFollowingSuggestViewModel()Lcom/ss/android/ugc/aweme/feed/suggestfollowing/FYPFollowingSuggestViewModel;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final FYPFollowingSuggestViewModel LJI() {
        return (FYPFollowingSuggestViewModel) this.LLJ.getValue(this, LLJILLL[2]);
    }

    public final ProfileFollowingSuggestViewModel LJII() {
        return (ProfileFollowingSuggestViewModel) this.LLIZLLLIL.getValue(this, LLJILLL[1]);
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void LJJJJZ() {
        Map<String, Object> map;
        C704830Rkn c704830Rkn = this.LLILLL;
        if (c704830Rkn != null && (map = c704830Rkn.LJFF) != null) {
            map.put("KEY_BUTTON_VM", null);
        }
        this.LLJI = null;
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().removeObserver((Observer) this.LLJILJILJ.getValue());
        C2450109it.LIZ.removeObserver((Observer) this.LLJILJIL.getValue());
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    public C2449809iq(Lifecycle lifecycle) {
        super("bottom_button_follow_follow");
        this.LLILZIL = lifecycle;
        this.LLIZ = new C638900P4e(this, C13LE.LIZ(VideoViewModel.class), 17);
        this.LLIZLLLIL = new C638900P4e(this, C13LE.LIZ(ProfileFollowingSuggestViewModel.class), 18);
        this.LLJ = new C638900P4e(this, C13LE.LIZ(FYPFollowingSuggestViewModel.class), 16);
        this.LLJIJIL = "";
        this.LLJILJIL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 162));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 161));
    }

    @Override // X.AbstractC616030OEf
    public final boolean LIZLLL(C698680Ras c698680Ras) {
        String aid;
        C1ECA.LIZ.getClass();
        if (!C1ECA.LIZ() || ((Number) C1ECA.LJIIIIZZ.getValue()).intValue() != 2) {
            return false;
        }
        String strLIZ = c698680Ras.LIZ();
        Aweme aweme = this.LLJI;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!TextUtils.equals(strLIZ, aid) || this.LLILZLL) {
            return false;
        }
        this.LLILZLL = true;
        List<String> list = c698680Ras.LIZ;
        if (list != null && (list.contains("like_click") || list.contains("video_play_finish"))) {
            Aweme aweme2 = this.LLJI;
            if (aweme2 != null) {
                LJI().wQ2(aweme2, "from_signal");
                this.LLILZLL = false;
            }
            return false;
        }
        this.LLILZLL = false;
        return false;
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void rr(Object obj) {
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null && videoItemParams.getAweme() != null) {
            this.LLJI = videoItemParams.getAweme();
            String str = videoItemParams.mEventType;
            this.LLJIJIL = str;
            if (Intrinsics.LJFF(str, "homepage_hot")) {
                int i = videoItemParams.currentPosition;
                C1ECA.LIZ.getClass();
                if (i <= ((Number) C1ECA.LJIIL.getValue()).intValue()) {
                    return;
                }
            } else if (Intrinsics.LJFF(this.LLJIJIL, "others_homepage") && videoItemParams.currentPosition < 0) {
                return;
            }
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZ.getValue(this, LLJILLL[0]), new C2217381BqS() { // from class: X.0HBx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C709790Rsn) obj2).LLILLL;
                }
            }, C736820SvI.LIZLLL(), new AwS117S0201000_3(videoItemParams.currentPosition, this, videoItemParams, 0), 4);
        }
    }
}

package X;

import Y.AObserverS121S0300000_3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS289S0300000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rlm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705440Rlm extends AbstractC616030OEf<VideoItemParams> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final Lifecycle LLILZIL;
    public final C638900P4e LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C705440Rlm.class, "videoVM", "getVideoVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoPlayViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC616030OEf
    public final void LIZJ() {
        MutableLiveData mutableLiveDataLJIILJJIL;
        Function0<VideoItemParams> function0;
        VideoItemParams videoItemParamsInvoke;
        C704830Rkn c704830Rkn = this.LLILLL;
        Aweme aweme = (c704830Rkn == null || (function0 = c704830Rkn.LIZLLL) == null || (videoItemParamsInvoke = function0.invoke()) == null) ? null : videoItemParamsInvoke.getAweme();
        C013C c013c = new C013C();
        c013c.element = !LJI(aweme);
        if (!LJII(aweme) || c013c.element) {
            return;
        }
        if (C296970BkV.LIZ()) {
            C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LLILZIL), null, null, new C2449309il(this, new C2449109ij(aweme, c013c, this, null), null), 3);
        } else {
            C0K77 c0k77 = (C0K77) this.LLIZLLLIL.getValue();
            if (c0k77 != null && (mutableLiveDataLJIILJJIL = c0k77.LJIILJJIL()) != null) {
                mutableLiveDataLJIILJJIL.observe(this, new AObserverS121S0300000_3(aweme, c013c, this, 2));
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLILZLL.getValue(this, LLJ[0]), new C2217381BqS() { // from class: X.0Rln
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, null, new AwS289S0300000_11(aweme, c013c, this, 4), 6);
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void LJJJJZ() {
        LJ(false);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    public C705440Rlm(Lifecycle lifecycle) {
        super("bottom_button_sov_preview_single_button");
        this.LLILZIL = lifecycle;
        this.LLILZLL = new C638900P4e(this, C13LE.LIZ(VideoPlayViewModel.class), 19);
        this.LLIZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1635));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(497));
    }

    public static final boolean LJI(Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        if (aweme != null && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null) {
            return Intrinsics.LJFF(subOnlyVideo.getShouldShowPaywall(), Boolean.TRUE);
        }
        return false;
    }

    public final boolean LJII(Aweme aweme) {
        StandardComponentInfo standardComponentInfo;
        ClientStandardModel clientModel;
        Map<String, ConditionData> map;
        if (aweme == null || (standardComponentInfo = aweme.getStandardComponentInfo()) == null || (clientModel = standardComponentInfo.getClientModel((String) this.LLIZ.getValue(), "standardized_bottom_button")) == null || (map = clientModel.componentsConditionMap) == null || !map.containsKey("bottom_button_sov_preview_single_button")) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void rr(Object obj) {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            Set<String> set = C705480Rlq.LIZ;
            if (C705480Rlq.LIZ(aweme.getAid()) && LJI(aweme) && LJII(aweme)) {
                LJ(true);
            } else {
                LJ(false);
            }
        }
    }
}

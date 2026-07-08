package X;

import Y.AObserverS121S0300000_3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
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
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705430Rll extends AbstractC616030OEf<VideoItemParams> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final Lifecycle LLILZIL;
    public final C638900P4e LLILZLL;
    public final C638900P4e LLIZ;
    public boolean LLIZLLLIL;
    public Boolean LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C705430Rll.class, "videoVM", "getVideoVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoPlayViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C705430Rll.class, "videoViewVM", "getVideoViewVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC616030OEf
    public final void LIZJ() {
        MutableLiveData mutableLiveDataLJIILJJIL;
        Map<String, Object> map;
        Function0<VideoItemParams> function0;
        VideoItemParams videoItemParamsInvoke;
        C704830Rkn c704830Rkn = this.LLILLL;
        Aweme aweme = (c704830Rkn == null || (function0 = c704830Rkn.LIZLLL) == null || (videoItemParamsInvoke = function0.invoke()) == null) ? null : videoItemParamsInvoke.getAweme();
        C013C c013c = new C013C();
        c013c.element = !(aweme != null && LJII(aweme));
        if (aweme == null || !LJIIIIZZ(aweme) || c013c.element) {
            return;
        }
        if (C296970BkV.LIZ()) {
            C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LLILZIL), null, null, new C2449509in(this, new C2449409im(aweme, c013c, this, null), null), 3);
        } else {
            C0K77 c0k77 = (C0K77) this.LLJIJIL.getValue();
            if (c0k77 != null && (mutableLiveDataLJIILJJIL = c0k77.LJIILJJIL()) != null) {
                mutableLiveDataLJIILJJIL.observe(this, new AObserverS121S0300000_3(aweme, c013c, this, 3));
            }
        }
        C638900P4e c638900P4e = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) c638900P4e.getValue(this, interfaceC2217461BqaArr[1]), new C2217381BqS() { // from class: X.0Rlo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new AwS625S0100000_11(this, 158), 6);
        C704830Rkn c704830Rkn2 = this.LLILLL;
        if (c704830Rkn2 != null && (map = c704830Rkn2.LJFF) != null) {
            map.put("mount_state", new Pair(Boolean.TRUE, Boolean.FALSE));
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLILZLL.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0Rlp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, C736820SvI.LJ(), new AwS447S0200000_11(this, c013c, 24), 4);
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void LJJJJZ() {
        LJI(false);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    public C705430Rll(Lifecycle lifecycle) {
        super("bottom_button_sov_preview_tip_card");
        this.LLILZIL = lifecycle;
        this.LLILZLL = new C638900P4e(this, C13LE.LIZ(VideoPlayViewModel.class), 20);
        this.LLIZ = new C638900P4e(this, C13LE.LIZ(VideoViewModel.class), 21);
        this.LLJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1636));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(498));
    }

    public static final boolean LJII(Aweme aweme) {
        StandardBusinessModel standardBusinessModel;
        SubOnlyVideo subOnlyVideo;
        ContentModel contentModel = aweme.getContentModel();
        if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel.getSubOnlyVideo()) != null) {
            return Intrinsics.LJFF(subOnlyVideo.getShouldShowPaywall(), Boolean.TRUE);
        }
        return false;
    }

    public final void LJI(boolean z) {
        boolean z2;
        if (Intrinsics.LJFF(this.LLJ, Boolean.valueOf(z))) {
            return;
        }
        if (z && !this.LLIZLLLIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        LJ(z);
        if (z2) {
            this.LLIZLLLIL = true;
        }
        this.LLJ = Boolean.valueOf(z);
    }

    public final boolean LJIIIIZZ(Aweme aweme) {
        ClientStandardModel clientModel;
        Map<String, ConditionData> map;
        StandardComponentInfo standardComponentInfo = aweme.getStandardComponentInfo();
        if (standardComponentInfo != null && (clientModel = standardComponentInfo.getClientModel((String) this.LLJI.getValue(), "standardized_bottom_button")) != null && (map = clientModel.componentsConditionMap) != null && map.containsKey("bottom_button_sov_preview_tip_card")) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void rr(Object obj) {
        Aweme aweme;
        C704830Rkn c704830Rkn;
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (c704830Rkn = this.LLILLL) != null) {
            Map<String, Object> map = c704830Rkn.LJFF;
            if (!map.containsKey("has_ended")) {
                Set<String> set = C705480Rlq.LIZ;
                map.put("has_ended", Boolean.valueOf(C705480Rlq.LIZ(aweme.getAid())));
            }
            Set<String> set2 = C705480Rlq.LIZ;
            if (C705480Rlq.LIZ(aweme.getAid()) && LJIIIIZZ(aweme)) {
                LJI(true);
            }
        }
    }
}

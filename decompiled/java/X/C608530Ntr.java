package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.StatePassingVM;
import com.ss.android.ugc.aweme.feed.assem.share.GuideSelfAwemeEventViewModel;
import com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel;
import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: renamed from: X.0Ntr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608530Ntr extends AbstractC616030OEf<VideoItemParams> {
    public static final C608590Ntx LLJJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final Lifecycle LLILZIL;
    public final C638900P4e LLILZLL;
    public C608600Nty LLIZ;
    public final C638900P4e LLIZLLLIL;
    public final C638900P4e LLJ;
    public final C638900P4e LLJI;
    public final C638900P4e LLJIJIL;
    public final C638900P4e LLJILJIL;
    public final C638900P4e LLJILJILJ;
    public final C638900P4e LLJILLL;
    public VideoItemParams LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C608530Ntr.class, "quickShareVM", "getQuickShareVM()Lcom/ss/android/ugc/aweme/feed/assem/share/quickexternalshare/QuickExternalShareVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C608530Ntr.class, "holderVM", "getHolderVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoViewModel;", 0), new C2217381BqS(C608530Ntr.class, "interceptEventVM", "getInterceptEventVM()Lcom/ss/android/ugc/aweme/feed/assem/share/InterceptorEventViewModel;", 0), new C2217381BqS(C608530Ntr.class, "eventDispatchVM", "getEventDispatchVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoEventDispatchViewModel;", 0), new C2217381BqS(C608530Ntr.class, "guideSelfAwemeEventViewModel", "getGuideSelfAwemeEventViewModel()Lcom/ss/android/ugc/aweme/feed/assem/share/GuideSelfAwemeEventViewModel;", 0), new C2217381BqS(C608530Ntr.class, "statePassingVM", "getStatePassingVM()Lcom/ss/android/ugc/aweme/feed/assem/StatePassingVM;", 0), new C2217381BqS(C608530Ntr.class, "videoPlayVM", "getVideoPlayVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoPlayViewModel;", 0), new C2217381BqS(C608530Ntr.class, "videoEventVM", "getVideoEventVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoEventDispatchViewModel;", 0)};
        LLJJI = new C608590Ntx();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Nty] */
    @Override // X.AbstractC616030OEf
    public final void LIZJ() {
        this.LLIZ = new AbstractC608770NuF() { // from class: X.0Nty
            @Override // X.AbstractC608770NuF
            public final int LIZ() {
                return 2;
            }

            @Override // X.AbstractC608770NuF
            public final void LIZIZ(C608820NuK c608820NuK) {
                C608530Ntr c608530Ntr;
                VideoItemParams videoItemParams;
                if (c608820NuK.LIZ == 0 && (videoItemParams = (c608530Ntr = this.LIZLLL).LLJJ) != null) {
                    c608530Ntr.LJII(videoItemParams, "like");
                }
            }
        };
        C638900P4e c638900P4e = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) c638900P4e.getValue(this, interfaceC2217461BqaArr[1]), new C2217381BqS() { // from class: X.0Nts
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, new AwS623S0100000_9(this, 27), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(this, interfaceC2217461BqaArr[1]), new C2217381BqS() { // from class: X.0Ntt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new AwS623S0100000_9(this, 28), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJI.getValue(this, interfaceC2217461BqaArr[3]), new C2217381BqS() { // from class: X.0Ntu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJILJILJ;
            }
        }, null, new AwS623S0100000_9(this, 29), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJI.getValue(this, interfaceC2217461BqaArr[3]), new C2217381BqS() { // from class: X.0Nu4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJILLL;
            }
        }, null, new AwS623S0100000_9(this, 30), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJIJIL.getValue(this, interfaceC2217461BqaArr[4]), new C2217381BqS() { // from class: X.0Ntq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0NIS) obj).LL;
            }
        }, null, new AwS623S0100000_9(this, 22), 6);
        if (C289760BXi.LIZ()) {
            C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJILLL.getValue(this, interfaceC2217461BqaArr[7]), new C2217381BqS() { // from class: X.0Nu3
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1ELP) obj).LLILLL;
                }
            }, null, new AwS623S0100000_9(this, 23), 6);
        }
        new Object() { // from class: X.0Ntw
        }.getClass();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && ((Number) C0BAE.LIZ.getValue()).intValue() > 0) {
            C736680Sv4.LJIILL(this, (AssemViewModel) this.LLJILLL.getValue(this, interfaceC2217461BqaArr[7]), new C2217381BqS() { // from class: X.0Nu6
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1ELP) obj).LLJ;
                }
            }, null, new AwS623S0100000_9(this, 24), 6);
        }
        if ((!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && ((Number) C0BAF.LIZ.getValue()).intValue() > 0) || (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && ((Number) C0BAD.LIZ.getValue()).intValue() > 0)) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJILJILJ.getValue(this, interfaceC2217461BqaArr[6]), new C2217381BqS() { // from class: X.0Nur
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0RFV) obj).LLJJIII;
                }
            }, null, new AwS623S0100000_9(this, 25), 6);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJILJIL.getValue(this, interfaceC2217461BqaArr[5]), new C2217381BqS() { // from class: X.0Ntz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C570070MXl) obj).LL;
            }
        }, null, new AwS623S0100000_9(this, 26), 6);
    }

    public final QuickExternalShareVM LJI() {
        return (QuickExternalShareVM) this.LLILZLL.getValue(this, LLJJIII[0]);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    public C608530Ntr(Lifecycle lifecycle) {
        super("bottom_button_quick_external_share");
        this.LLILZIL = lifecycle;
        this.LLILZLL = new C638900P4e(this, C13LE.LIZ(QuickExternalShareVM.class), 3);
        this.LLIZLLLIL = new C638900P4e(this, C13LE.LIZ(VideoViewModel.class), 4);
        this.LLJ = new C638900P4e(this, C13LE.LIZ(InterceptorEventViewModel.class), 5);
        this.LLJI = new C638900P4e(this, C13LE.LIZ(VideoEventDispatchViewModel.class), 6);
        this.LLJIJIL = new C638900P4e(this, C13LE.LIZ(GuideSelfAwemeEventViewModel.class), 7);
        this.LLJILJIL = new C638900P4e(this, C13LE.LIZ(StatePassingVM.class), 8);
        this.LLJILJILJ = new C638900P4e(this, C13LE.LIZ(VideoPlayViewModel.class), 1);
        this.LLJILLL = new C638900P4e(this, C13LE.LIZ(VideoEventDispatchViewModel.class), 2);
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void rr(Object obj) {
        String aid;
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        this.LLJJ = videoItemParams;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickExternalShareButtonAssem onBind test digg awemeid: ");
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (aid = aweme.getAid()) == null) {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJII(VideoItemParams videoItemParams, String str) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C608740NuC(this, videoItemParams, str, null), 3);
    }
}

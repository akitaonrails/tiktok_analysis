package X;

import Y.AObjectS247S0100000_29;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS14S0000001_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import nv7.c0;

/* JADX INFO: renamed from: X.12VT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12VT extends C19A3 implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final C1DRG LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 271));
    public final C1664750tQH LLJJI;
    public final C1664750tQH LLJJIII;
    public final C1664750tQH LLJJIJI;
    public final C1664750tQH LLJJIJIIJIL;
    public final C1664750tQH LLJJIJIL;
    public final C1664750tQH LLJJJ;
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12VT.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12VT.class, "editAdjustApi", "getEditAdjustApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12VT.class, "editAdjustClipsModel", "getEditAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C12VT.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C12VT.class, "videoEditViewModel", "getVideoEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C12VT.class, "playerController", "getPlayerController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/IPlayerController;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public final int LLLLIIIILLL() {
        return (int) C12ES.LIZJ(((C1463500oBg) this.LLJJIJI.getValue(this, LLJLIL[2])).LIZIZ ? 320.0f : 265.0f, this.mActivity);
    }

    public final int LLLLIILL() {
        Activity activity = this.mActivity;
        return (((ScreenUtils.getFullScreenHeight(activity) - ((int) C12ES.LIZJ(52.0f, this.mActivity))) - LLLLIIIILLL()) - C497820Jfg.LIZJ(requireActivity())) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(activity);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public C12VT(C1DRG c1drg) {
        this.LLJILLL = c1drg;
        this.LLJJI = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(c1drg, InterfaceC1419190n2D.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(c1drg, C1463500oBg.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(c1drg, EditAdjustClipsBottomViewModel.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(c1drg, VideoEditViewModel.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(c1drg, InterfaceC1463550oBl.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C12VN c12vn = (C12VN) this.LLJJ.getValue();
        if (!c12vn.LLJJ.isAdded(c12vn)) {
            c12vn.LLJJ.add(c12vn.LLJJI, c12vn, c12vn.getTag());
        }
        if (!c12vn.LLJJ.isShowing(c12vn)) {
            c12vn.LLJJ.show(c12vn);
        }
        this.LLJJJIL = requireViewById(R.id.tpo);
        this.LLJJJJ = requireViewById(R.id.lr1);
        this.LLJJJJJIL = requireViewById(R.id.chv);
        this.LLJL = requireViewById(R.id.tv_title);
        View viewRequireViewById = requireViewById(R.id.zbp);
        this.LLJJJJLIIL = viewRequireViewById;
        View view = null;
        if (viewRequireViewById == null) {
            viewRequireViewById = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 41), viewRequireViewById);
        this.LLJJL = requireViewById(R.id.tv_save);
        this.LLJJLIIIJLLLLLLLZ = requireViewById(R.id.tv_save_red);
        View view2 = this.LLJJL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 42), view2);
        View view3 = this.LLJJLIIIJLLLLLLLZ;
        if (view3 != null) {
            view = view3;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 43), view);
        C786410Ut5.I7(new AkS95S0100000_29(this, 44), requireViewById(R.id.exq));
        C1664750tQH c1664750tQH = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        ((VideoEditViewModel) c1664750tQH.getValue(this, interfaceC2217461BqaArr[4])).LLILLJJLI.observe(this, new AObjectS247S0100000_29(this, 56));
        BaseJediViewModel.iR2((BaseJediViewModel) this.LLJJIJIIJIL.getValue(this, interfaceC2217461BqaArr[3]), this, new C2217381BqS() { // from class: X.12VW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getFocusEditMode();
            }
        }, new AwS608S0100000_29(this, 221));
    }

    public final void LLLLIL(final Function0 function0, final boolean z) {
        C19A3 c19a3;
        C19A3 c19a32;
        View view = null;
        if (z) {
            Scene scene = this.mParentScene;
            if (!(scene instanceof C19A3) || (c19a32 = (C19A3) scene) == null || !c19a32.isShowing(this)) {
                Scene scene2 = this.mParentScene;
                if ((scene2 instanceof C19A3) && (c19a3 = (C19A3) scene2) != null) {
                    c19a3.show(this);
                }
            }
        }
        if (z) {
            C1664750tQH c1664750tQH = this.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
            InterfaceC1455860nzM interfaceC1455860nzM = (InterfaceC1455860nzM) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0]);
            int iLIZIZ = C19733712It.LIZIZ(true, false, false, false);
            int iLIZJ = ((int) C12ES.LIZJ(52.0f, this.mActivity)) + ScreenUtils.getStatusBarHeight(this.mActivity);
            int iLLLLIIIILLL = LLLLIIIILLL();
            int iLLLLIILL = LLLLIILL();
            c0.LIZ.n2();
            C1453160nv0 c1453160nv0LIZIZ = C1453170nv1.LIZIZ(iLIZIZ, iLIZJ, iLLLLIIIILLL, iLLLLIILL, false, false, 1984);
            c1453160nv0LIZIZ.LJIIJ = Boolean.TRUE;
            interfaceC1455860nzM.aM0(c1453160nv0LIZIZ);
            float fLLLLIILL = LLLLIILL() / r2.LIZJ();
            JediViewModel jediViewModel = (JediViewModel) this.LLJJIJIIJIL.getValue(this, interfaceC2217461BqaArr[3]);
            jediViewModel.getClass();
            jediViewModel.setState(new AwS14S0000001_29(fLLLLIILL, 2));
        } else {
            InterfaceC1455860nzM interfaceC1455860nzM2 = (InterfaceC1455860nzM) this.LLJJI.getValue(this, LLJLIL[0]);
            int color = getResources().getColor(R.color.b6);
            int iLIZJ2 = ((int) C12ES.LIZJ(52.0f, this.mActivity)) + ScreenUtils.getStatusBarHeight(this.mActivity);
            int iLLLLIIIILLL2 = LLLLIIIILLL();
            int iLLLLIILL2 = LLLLIILL();
            c0.LIZ.n2();
            interfaceC1455860nzM2.aM0(C1453170nv1.LIZ(color, iLIZJ2, iLLLLIIIILLL2, iLLLLIILL2));
        }
        View view2 = this.LLJJJJ;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.LJLLLLLL(8, view2);
        if (!z) {
            View view3 = this.LLJJJIL;
            if (view3 == null) {
                view3 = null;
            }
            C786410Ut5.LJLLLLLL(4, view3);
        }
        View view4 = this.LLJJJJJIL;
        if (view4 != null) {
            view = view4;
        }
        C1462750oAT.LIZIZ(view, z, LLLLIIIILLL(), this.mView, new C092O() { // from class: X.12VV
            @Override // X.C092O
            public final void accept(Object obj) {
                int i;
                View view5 = this.LIZ.LLJJJIL;
                if (view5 == null) {
                    view5 = null;
                }
                if (z) {
                    i = 0;
                } else {
                    i = 4;
                }
                C786410Ut5.LJLLLLLL(i, view5);
                if (!z) {
                    C12VT c12vt = this.LIZ;
                    C19A3 c19a33 = (C19A3) c12vt.mParentScene;
                    if (c19a33 != null) {
                        c19a33.hide(c12vt);
                    }
                }
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.th, viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}

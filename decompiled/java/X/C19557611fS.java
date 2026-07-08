package X;

import Y.AObjectS247S0100000_29;
import Y.AObjectS372S0100000_29;
import Y.AObjectS403S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.ATListenerS166S0000000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11fS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19557611fS extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C1DRG LLJI;
    public final C1664750tQH LLJIJIL;
    public final C1664750tQH LLJILJILJ;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 269));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(179));
    public boolean LLJJ = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19557611fS.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19557611fS.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final InterfaceC1455500nym LLLII() {
        return (InterfaceC1455500nym) this.LLJIJIL.getValue(this, LLJJI[0]);
    }

    public final C19557511fR LLLIIIIL() {
        return (C19557511fR) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        C19559011fg c19559011fg;
        super.onDestroy();
        C19557511fR c19557511fRLLLIIIIL = LLLIIIIL();
        InterfaceC1452170ntP interfaceC1452170ntP = c19557511fRLLLIIIIL.LJJIII;
        if (interfaceC1452170ntP != null && (c19559011fg = c19557511fRLLLIIIIL.LJJIIZ) != null) {
            interfaceC1452170ntP.Gf(c19559011fg);
        }
        C194364112k c194364112k = c19557511fRLLLIIIIL.LJJIJIL;
        if (c194364112k != null) {
            c194364112k.LLJILJILJ.LJI();
        }
        C113Z c113z = c19557511fRLLLIIIIL.LJJIZ;
        if (c113z != null) {
            C113S c113s = c113z.LLJJ;
            if (!(c113s instanceof C113S) || c113s == null) {
                return;
            }
            ((EffectDownloadController) c113s.LLJI.getValue()).LJI();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        C19557511fR c19557511fRLLLIIIIL = LLLIIIIL();
        RunnableC19558211fY runnableC19558211fY = c19557511fRLLLIIIIL.LJJIJ;
        if (runnableC19558211fY != null) {
            c19557511fRLLLIIIIL.LJII.post(runnableC19558211fY);
        }
        RunnableC19558611fc runnableC19558611fc = c19557511fRLLLIIIIL.LJJIJIIJI;
        if (runnableC19558611fc != null) {
            c19557511fRLLLIIIIL.LJII.post(runnableC19558611fc);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        LLLIIIIL().LJII.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C19557611fS(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1455500nym.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C19557511fR c19557511fRLLLIIIIL = LLLIIIIL();
        AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(this);
        c19557511fRLLLIIIIL.LJJIL = abstractC214814194yLIZ;
        c19557511fRLLLIIIIL.LJJIJLIJ = (C19EG) abstractC214814194yLIZ.requireActivity();
        c19557511fRLLLIIIIL.LJIIIIZZ = this;
        int i = 1;
        c19557511fRLLLIIIIL.LJJL = true;
        VEEditor.GET_FRAMES_FLAGS get_frames_flags = null;
        if (abstractC214814194yLIZ instanceof InterfaceC524950KiL) {
            c19557511fRLLLIIIIL.LJJLIIIJL = (InterfaceC524950KiL) abstractC214814194yLIZ;
        } else {
            C0CHQ.LIZ().getUiService().getClass();
            c19557511fRLLLIIIIL.LJJLIIIJL = null;
        }
        c19557511fRLLLIIIIL.LJJJJL = new SafeHandler(this);
        c19557511fRLLLIIIIL.LJII = new SafeHandler(this);
        c19557511fRLLLIIIIL.LIZ = c19557511fRLLLIIIIL.LJJJJLL.LJJJLIIL();
        c19557511fRLLLIIIIL.LJJJJLL.Ps();
        c19557511fRLLLIIIIL.LJJJJLL.lk();
        c19557511fRLLLIIIIL.LJJIII = c19557511fRLLLIIIIL.LJJJJLL.LIZIZ().getValue();
        c19557511fRLLLIIIIL.LJJJZ = c19557511fRLLLIIIIL.LJJJZ;
        c19557511fRLLLIIIIL.LJJLIIIJJIZ = new C194371112r(abstractC214814194yLIZ, c19557511fRLLLIIIIL.LIZ);
        final C19557511fR c19557511fRLLLIIIIL2 = LLLIIIIL();
        View viewFindViewById = findViewById(R.id.u17);
        FragmentManager fragmentManagerLJIILL = C20622515mp.LJIILL((C19EG) requireActivity(), this);
        c19557511fRLLLIIIIL2.LJJIJIIJIL = viewFindViewById;
        if (!c19557511fRLLLIIIIL2.LJJLIIIJ) {
            C372580EjA c372580EjA = new C372580EjA(viewFindViewById.getContext());
            c372580EjA.LJII = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C372880Eje(C19557511fR.LJJLIIIJLLLLLLLZ, -1.0f));
            c372580EjA.LIZLLL = arrayList;
            c372580EjA.LJ = C786410Ut5.Td(C786410Ut5.ne(c19557511fRLLLIIIIL2.LJJIJIIJIL.getContext()), R.layout.c3c, (ViewGroup) c19557511fRLLLIIIIL2.LJJIJIIJIL, false);
            c372580EjA.LJFF = C786410Ut5.Td(C786410Ut5.ne(c19557511fRLLLIIIIL2.LJJIJIIJIL.getContext()), R.layout.c3d, (ViewGroup) c19557511fRLLLIIIIL2.LJJIJIIJIL, false);
            c372580EjA.LJI = C786410Ut5.Td(C786410Ut5.ne(c19557511fRLLLIIIIL2.LJJIJIIJIL.getContext()), R.layout.c37, (ViewGroup) c19557511fRLLLIIIIL2.LJJIJIIJIL, false);
            ((ViewGroup) c19557511fRLLLIIIIL2.LJJIJIIJIL).addView(new C372830EjZ(c372580EjA), new ViewGroup.LayoutParams(-1, -1));
        }
        c19557511fRLLLIIIIL2.LJIIIZ = (C19557911fV) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.gxr);
        LinearLayout linearLayout = (LinearLayout) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.ujt);
        c19557511fRLLLIIIIL2.LJIIJ = linearLayout;
        c19557511fRLLLIIIIL2.LJIIL = (FrameLayout) linearLayout.findViewById(R.id.ujl);
        c19557511fRLLLIIIIL2.LJIIJJI = (FrameLayout) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.ex8);
        c19557511fRLLLIIIIL2.LJIILIIL = (ImageView) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.lr1);
        c19557511fRLLLIIIIL2.LJIILJJIL = (TuxIconView) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.t1j);
        c19557511fRLLLIIIIL2.LJIILL = (RelativeLayout) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.to9);
        c19557511fRLLLIIIIL2.LJIILLIIL = (TextView) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.zjo);
        c19557511fRLLLIIIIL2.LJIIZILJ = (RelativeLayout) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.gxn);
        RelativeLayout relativeLayout = (RelativeLayout) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.videolayout);
        c19557511fRLLLIIIIL2.LJIJJ = (TextView) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.tv_save);
        c19557511fRLLLIIIIL2.LJIJJLI = (TextView) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.zbv);
        c19557511fRLLLIIIIL2.LJJI = (C12UW) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.video_edit_view);
        c19557511fRLLLIIIIL2.LJJIJIIJIL.setOnTouchListener(new ATListenerS166S0000000_29(4));
        C12Y7 c12y7 = new C12Y7(c19557511fRLLLIIIIL2, 2);
        C786410Ut5.Q7(c19557511fRLLLIIIIL2.LJIILIIL, c12y7);
        C786410Ut5.a9(c19557511fRLLLIIIIL2.LJIILJJIL, c12y7);
        C786410Ut5.S7(relativeLayout, c12y7);
        C786410Ut5.T7(c19557511fRLLLIIIIL2.LJIJJLI, c12y7);
        C786410Ut5.T7(c19557511fRLLLIIIIL2.LJIJJ, c12y7);
        c19557511fRLLLIIIIL2.LJJIIZI = C2441009hQ.LJIIL(C960203pA.LIZ(R.attr.a1r, c19557511fRLLLIIIIL2.LJJIJLIJ), 204);
        c19557511fRLLLIIIIL2.LJIIIZ.setVideoDuration(c19557511fRLLLIIIIL2.LJFF());
        c19557511fRLLLIIIIL2.LJIL(0, false);
        c19557511fRLLLIIIIL2.LJIIIZ.setNormalColor(0);
        c19557511fRLLLIIIIL2.LJIIIZ.setOverlayColor(c19557511fRLLLIIIIL2.LJJIIZI);
        c19557511fRLLLIIIIL2.LJIJ = (LinearLayout) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.f762nla);
        c19557511fRLLLIIIIL2.LJIJI = (C19412810xC) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.nne);
        C366400EYc c366400EYc = C366400EYc.LIZ;
        VideoPublishEditModel videoPublishEditModel = c19557511fRLLLIIIIL2.LIZ;
        NLEModel model = ((C1463670oBx) c19557511fRLLLIIIIL2.LJJIII).LIZLLL().LIZ.getModel();
        c366400EYc.getClass();
        c19557511fRLLLIIIIL2.LJJLI = C366400EYc.LJFF(videoPublishEditModel, model);
        c19557511fRLLLIIIIL2.LJJLIIIIJ = !C366400EYc.LIZIZ(c19557511fRLLLIIIIL2.LIZ);
        View viewFindViewById2 = c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.gx6);
        if (c19557511fRLLLIIIIL2.LJJLIIIJ) {
            C194371112r c194371112r = c19557511fRLLLIIIIL2.LJJLIIIJJIZ;
            C113G c113g = new C113G(null, true, true, !C1444940nhk.LJIIJ(c194371112r.LIZIZ.getCanvasVideoData()), 48.0f, true, false, new AObjectS403S0100000_29(c19557511fRLLLIIIIL2, 3), c19557511fRLLLIIIIL2.LJJL, c19557511fRLLLIIIIL2.LJJJZ, C0F4Z.LIZ(), false, 1, false, false, false, false, false, null, false, false, 0, false, C0EPX.LIZIZ(false), -1538557, 255);
            c19557511fRLLLIIIIL2.LJJIZ = new C113Z(c19557511fRLLLIIIIL2.LIZ, c19557511fRLLLIIIIL2.LJJJJLL.LJI(), c19557511fRLLLIIIIL2.LJJIJIIJIL.getContext(), c113g, c19557511fRLLLIIIIL2.LJJLIIIJJIZ.LJ, c19557511fRLLLIIIIL2.LJJIII, C0CHQ.LIZ().getAccountService());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = (int) C12ES.LIZJ(14.0f, c19557511fRLLLIIIIL2.LJJIJLIJ);
            int iLJIIIIZZ = (int) ((C12ES.LJIIIIZZ(c19557511fRLLLIIIIL2.LJJIJLIJ) * c113g.LJIJJLI) + C12ES.LIZJ(72.0f, c19557511fRLLLIIIIL2.LJJIJLIJ));
            c19557511fRLLLIIIIL2.LJJLIIIJJI = iLJIIIIZZ;
            layoutParams.height = iLJIIIIZZ;
            C113Z c113z = c19557511fRLLLIIIIL2.LJJIZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c113z);
            c113z.setLayoutParams(layoutParams);
            c19557511fRLLLIIIIL2.LJIIJ.addView(c19557511fRLLLIIIIL2.LJJIZ);
            ((ViewGroup.MarginLayoutParams) relativeLayout.getLayoutParams()).bottomMargin = c19557511fRLLLIIIIL2.LJJLIIIJJI;
            c19557511fRLLLIIIIL2.LJIIJJI.getLayoutParams().height = c19557511fRLLLIIIIL2.LJJLIIIJJI;
            C0EZX.LIZIZ(c19557511fRLLLIIIIL2.LJIILJJIL, 0.5f);
            c19557511fRLLLIIIIL2.LJIJJ(false);
        } else {
            c19557511fRLLLIIIIL2.LJJLIIIJJI = (int) C12ES.LIZJ(276.0f, c19557511fRLLLIIIIL2.LJJIJLIJ);
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            C19412810xC c19412810xC = c19557511fRLLLIIIIL2.LJIJI;
            if (c19412810xC != null) {
                C19412710xB c19412710xBLIZ = C19412710xB.LIZ(c19557511fRLLLIIIIL2.LJJIJLIJ);
                c19412710xBLIZ.LJ = 1;
                c19412810xC.setBuilder(c19412710xBLIZ);
            }
            c19557511fRLLLIIIIL2.LJIL = (C0MS4) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.viewpager);
            c19557511fRLLLIIIIL2.LJJ = (C19561511g5) c19557511fRLLLIIIIL2.LJJIJIIJIL.findViewById(R.id.wya);
            C194364112k c194364112k = new C194364112k(c19557511fRLLLIIIIL2.LJJIJLIJ, fragmentManagerLJIILL, c19557511fRLLLIIIIL2.LJJJZ);
            c19557511fRLLLIIIIL2.LJJIJIL = c194364112k;
            c194364112k.LLJJ = !c19557511fRLLLIIIIL2.LJJLI;
            if (c19557511fRLLLIIIIL2.LIZ.isMvThemeVideoType()) {
                c19557511fRLLLIIIIL2.LJJIJIL.LLJJI = false;
            }
            c19557511fRLLLIIIIL2.LJIL.setOffscreenPageLimit(1);
            c19557511fRLLLIIIIL2.LJIL.setNoScroll(true);
            C19561511g5 c19561511g5 = c19557511fRLLLIIIIL2.LJJ;
            c19561511g5.getClass();
            c19561511g5.setTabMargin(C12VA.LIZ().LJ);
            c19557511fRLLLIIIIL2.LJJ.setDefaultAddTab(false);
            c19557511fRLLLIIIIL2.LJJ.setupWithViewPager(c19557511fRLLLIIIIL2.LJIL);
            c19557511fRLLLIIIIL2.LJIL.clearOnPageChangeListeners();
            c19557511fRLLLIIIIL2.LJIL.addOnPageChangeListener(new C19562411gE(c19557511fRLLLIIIIL2.LJJ));
            C19774712Yn c19774712Yn = new C19774712Yn(c19557511fRLLLIIIIL2, 1);
            c19557511fRLLLIIIIL2.LJJJJZI = c19774712Yn;
            c19557511fRLLLIIIIL2.LJIL.addOnPageChangeListener(c19774712Yn);
            C0F4X.LJFF();
        }
        if (!c19557511fRLLLIIIIL2.LJJLIIIJ) {
            c19557511fRLLLIIIIL2.LJIJJ(true);
            if (c19557511fRLLLIIIIL2.LJJJJZ == null) {
                c19557511fRLLLIIIIL2.LJJJJZ = new C565780MGy();
            }
            ((InterfaceC1635410sex) c19557511fRLLLIIIIL2.LJJJJZ.LIZ.getValue()).LJI("editingeffect", false, new C19773612Yc(c19557511fRLLLIIIIL2, 1));
        }
        C786410Ut5.LJZI(0, c19557511fRLLLIIIIL2.LJIILIIL);
        int iLIZJ = (int) C12ES.LIZJ(28.0f, c19557511fRLLLIIIIL2.LJJIJLIJ);
        int iLIZJ2 = (int) C12ES.LIZJ(28.0f, c19557511fRLLLIIIIL2.LJJIJLIJ);
        int iCeil = (int) Math.ceil((C12ES.LJIIJ(c19557511fRLLLIIIIL2.LJJIJLIJ) - (Math.round(C12ES.LIZJ(24.0f, c19557511fRLLLIIIIL2.LJJIJLIJ)) * 2)) / (iLIZJ2 * 1.0f));
        InterfaceC1452170ntP interfaceC1452170ntP = c19557511fRLLLIIIIL2.LJJIII;
        Scene scene = c19557511fRLLLIIIIL2.LJJIL;
        if (C1446620nkS.LIZ()) {
            get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
        }
        c19557511fRLLLIIIIL2.LJJII = new VEVideoCoverGeneratorImpl(interfaceC1452170ntP, scene, iCeil, get_frames_flags, "special_effects");
        c19557511fRLLLIIIIL2.LJJIIJZLJL = new C19560811fy(c19557511fRLLLIIIIL2.LJJII, iLIZJ2, iLIZJ, iCeil);
        if (c19557511fRLLLIIIIL2.LJJIII == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VEEffectHelper activity is finishing ");
            sbLIZ.append(c19557511fRLLLIIIIL2.LJJIJLIJ.isFinishing());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            int iLJFF = c19557511fRLLLIIIIL2.LJFF();
            c19557511fRLLLIIIIL2.LJJIFFI = (CutMultiVideoViewModel) C1659630tI1.LJFF(c19557511fRLLLIIIIL2.LJJIL).get(CutMultiVideoViewModel.class);
            c19557511fRLLLIIIIL2.LJJI.setCanEdit(false);
            c19557511fRLLLIIIIL2.LJJI.setMinVideoLength(1000L);
            c19557511fRLLLIIIIL2.LJJI.setUseCustomMaxVideoLengthDirectly(true);
            c19557511fRLLLIIIIL2.LJJI.setMaxVideoLength(iLJFF);
            c19557511fRLLLIIIIL2.LJJIFFI.LLJILJIL = c19557511fRLLLIIIIL2.LIZ.isMvThemeVideoType();
            c19557511fRLLLIIIIL2.LJJIFFI.LLJILJILJ = iLJFF;
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initCutTimeView video duration is ");
            sbLIZ2.append(c19557511fRLLLIIIIL2.LIZJ());
            C201955140j.LJIILJJIL(c20012313Rx, C2188811AlT.LIZIZ(sbLIZ2));
            c19557511fRLLLIIIIL2.LJJI.setVeEditor(c19557511fRLLLIIIIL2.LJJIII);
            List<MediaModel> mediaModelList = c19557511fRLLLIIIIL2.LIZ.getMediaModelList();
            C19560311ft c19560311ft = new C19560311ft();
            c19560311ft.LIZIZ = false;
            ((ArrayList) c19560311ft.LIZ).add(new C1420600n4U(c19557511fRLLLIIIIL2.LJJIJLIJ, new AObjectS403S0100000_29(c19557511fRLLLIIIIL2, 2), new AObjectS372S0100000_29(c19557511fRLLLIIIIL2, 3), new InterfaceC1685420txc() { // from class: X.11fh
                @Override // X.InterfaceC1685420txc
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    C19557511fR c19557511fR = c19557511fRLLLIIIIL2;
                    return Float.valueOf(C19558011fW.LIZ(c19557511fR.LJJJ, c19557511fR.LJFF(), ((Boolean) obj).booleanValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue(), ((Integer) obj4).intValue(), ((Float) obj5).floatValue()));
                }
            }));
            c19557511fRLLLIIIIL2.LJJI.setViewConfig(c19560311ft);
            c19557511fRLLLIIIIL2.LJJI.setOptimizeEffect(true);
            C12UW c12uw = c19557511fRLLLIIIIL2.LJJI;
            Scene scene2 = c19557511fRLLLIIIIL2.LJJIL;
            ViewModelProvider viewModelProviderLJFF = C1659630tI1.LJFF(scene2);
            CutMultiVideoViewModel cutMultiVideoViewModel = c19557511fRLLLIIIIL2.LJJIFFI;
            c12uw.LLLFZ = c19557511fRLLLIIIIL2.LJJIIJZLJL;
            c12uw.LLLI = true;
            c12uw.LJII(scene2, viewModelProviderLJFF, cutMultiVideoViewModel, mediaModelList);
            c19557511fRLLLIIIIL2.LJJI.setPointerType(2);
            c19557511fRLLLIIIIL2.LJJI.getVideoEditViewModel().LLILZLL.observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 53));
            c19557511fRLLLIIIIL2.LJJI.getVideoEditViewModel().LLJIJIL.observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 55));
            c19557511fRLLLIIIIL2.LJJI.getVideoEditViewModel().LLJ.observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 57));
            c19557511fRLLLIIIIL2.LJJI.getVideoEditViewModel().LLJI.observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 59));
            c19557511fRLLLIIIIL2.LJJI.getVideoEditViewModel().LLIZ.observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 51));
            c19557511fRLLLIIIIL2.LJJI.getVideoEditViewModel().LLIZLLLIL.observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 52));
            c19557511fRLLLIIIIL2.LJJI.getVideoEditViewModel().LLILLL.observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 54));
            c19557511fRLLLIIIIL2.LJJI.getVideoEditViewModel().LLILZIL.observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 56));
            c19557511fRLLLIIIIL2.LJJJJ.LIZIZ(iLJFF);
        }
        c19557511fRLLLIIIIL2.LJIIIZ.setOnCursorSeekListener(new C19558311fZ(c19557511fRLLLIIIIL2));
        c19557511fRLLLIIIIL2.LJJIIJ = new C19559611fm(c19557511fRLLLIIIIL2);
        if (c19557511fRLLLIIIIL2.LJJLIIIJ) {
            c19557511fRLLLIIIIL2.LJJJJLI.AQ2().observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 58));
            ((LiveData) c19557511fRLLLIIIIL2.LJJJJLI.LLILZ.getValue()).observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 60));
            c19557511fRLLLIIIIL2.LJJJJLI.BQ2().observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 61));
        }
        ReplayLiveData<C0EYM> replayLiveDataLIZLLL = c19557511fRLLLIIIIL2.LJJJJLL.LIZLLL();
        c19557511fRLLLIIIIL2.LIZJ = replayLiveDataLIZLLL;
        replayLiveDataLIZLLL.observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 67));
        c19557511fRLLLIIIIL2.LJFF = c19557511fRLLLIIIIL2.LJJJJLL.LJIIIZ();
        c19557511fRLLLIIIIL2.LIZLLL = c19557511fRLLLIIIIL2.LJJJJLL.LJFF();
        c19557511fRLLLIIIIL2.LJJJLIIL = new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 50);
        c19557511fRLLLIIIIL2.LJJJJLI.xQ2().observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 65));
        ((LiveData) c19557511fRLLLIIIIL2.LJJJJLI.LLJILLL.getValue()).observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 64));
        c19557511fRLLLIIIIL2.LJJJJLL.LJIIIIZZ().observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 62));
        StoredLiveData<C1452720nuI> storedLiveDataLJII = c19557511fRLLLIIIIL2.LJJJJLL.LJII();
        c19557511fRLLLIIIIL2.LJ = storedLiveDataLJII;
        C1452720nuI value = storedLiveDataLJII.getValue();
        if (value != null) {
            String str = value.LL;
            str.getClass();
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        EffectPointModel effectPointModel = new EffectPointModel();
                        c19557511fRLLLIIIIL2.LJJJ = effectPointModel;
                        effectPointModel.setType(2);
                        c19557511fRLLLIIIIL2.LJJJ.setCategory("time");
                        c19557511fRLLLIIIIL2.LJJJ.setStartPoint((int) value.LLILLJJLI);
                        c19557511fRLLLIIIIL2.LJJJ.setEndPoint((int) value.LLILLL);
                        c19557511fRLLLIIIIL2.LJJJ.setUiStartPoint((int) value.LLILLJJLI);
                        c19557511fRLLLIIIIL2.LJJJ.setUiEndPoint((int) value.LLILLL);
                        c19557511fRLLLIIIIL2.LJJJ.setKey(((EffectModel) ListProtector.get(C0F4X.LJ(), i)).key);
                        c19557511fRLLLIIIIL2.LJJJ.setName(((EffectModel) ListProtector.get(C0F4X.LJ(), i)).name);
                    }
                    break;
                case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    if (str.equals("2")) {
                        i = 2;
                        EffectPointModel effectPointModel2 = new EffectPointModel();
                        c19557511fRLLLIIIIL2.LJJJ = effectPointModel2;
                        effectPointModel2.setType(2);
                        c19557511fRLLLIIIIL2.LJJJ.setCategory("time");
                        c19557511fRLLLIIIIL2.LJJJ.setStartPoint((int) value.LLILLJJLI);
                        c19557511fRLLLIIIIL2.LJJJ.setEndPoint((int) value.LLILLL);
                        c19557511fRLLLIIIIL2.LJJJ.setUiStartPoint((int) value.LLILLJJLI);
                        c19557511fRLLLIIIIL2.LJJJ.setUiEndPoint((int) value.LLILLL);
                        c19557511fRLLLIIIIL2.LJJJ.setKey(((EffectModel) ListProtector.get(C0F4X.LJ(), i)).key);
                        c19557511fRLLLIIIIL2.LJJJ.setName(((EffectModel) ListProtector.get(C0F4X.LJ(), i)).name);
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        i = 3;
                        EffectPointModel effectPointModel22 = new EffectPointModel();
                        c19557511fRLLLIIIIL2.LJJJ = effectPointModel22;
                        effectPointModel22.setType(2);
                        c19557511fRLLLIIIIL2.LJJJ.setCategory("time");
                        c19557511fRLLLIIIIL2.LJJJ.setStartPoint((int) value.LLILLJJLI);
                        c19557511fRLLLIIIIL2.LJJJ.setEndPoint((int) value.LLILLL);
                        c19557511fRLLLIIIIL2.LJJJ.setUiStartPoint((int) value.LLILLJJLI);
                        c19557511fRLLLIIIIL2.LJJJ.setUiEndPoint((int) value.LLILLL);
                        c19557511fRLLLIIIIL2.LJJJ.setKey(((EffectModel) ListProtector.get(C0F4X.LJ(), i)).key);
                        c19557511fRLLLIIIIL2.LJJJ.setName(((EffectModel) ListProtector.get(C0F4X.LJ(), i)).name);
                    }
                    break;
            }
        }
        c19557511fRLLLIIIIL2.LJJJJLL.G9().observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 63));
        c19557511fRLLLIIIIL2.LJJJJIZL = c19557511fRLLLIIIIL2.LJJJJLL.dt();
        c19557511fRLLLIIIIL2.LJJJJLI.zQ2().observe(c19557511fRLLLIIIIL2.LJIIIIZZ, new AObserverS231S0100000_29(c19557511fRLLLIIIIL2, 66));
        c19557511fRLLLIIIIL2.LJIIIZ();
        LLLIIIIL().LJJJJLI.DQ2().observe(this, new AObserverS231S0100000_29(this, 78));
        ((LiveData) LLLIIIIL().LJJJJLI.LLJJ.getValue()).observe(this, new AObserverS231S0100000_29(this, 79));
        ((LiveData) LLLIIIIL().LJJJJLI.LLJJI.getValue()).observe(this, new AObserverS231S0100000_29(this, 80));
        LLLII().Wk1().LIZ(this, new AObjectS247S0100000_29(this, 52));
        LLLII().iT().LIZ(this, new AObjectS247S0100000_29(this, 53));
        LLLII().Qx().LIZ(this, new AObjectS247S0100000_29(this, 54));
        LLLII().rK1().LIZ(this, new AObjectS247S0100000_29(this, 55));
        ((LiveData) LLLIIIIL().LJJJJLI.LLJJIJI.getValue()).observe(this, new AObserverS231S0100000_29(this, 81));
        ((LiveData) LLLIIIIL().LJJJJLI.LLJJIJIL.getValue()).observe(this, new AObserverS231S0100000_29(this, 82));
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        AbstractC214814194y abstractC214814194yLIZ;
        Bundle argumentsSafely;
        String string;
        EditEffectAnchorManager data;
        if (C288490BSl.LIZ && (abstractC214814194yLIZ = C372650EjH.LIZ(this)) != null && (argumentsSafely = abstractC214814194yLIZ.getArgumentsSafely()) != null && (string = argumentsSafely.getString("extra_edit_effect_uid")) != null && (data = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(string)) != null && !data.isEditProp()) {
            LLLIIIIL().LJJLIIIJILLIZJL = true;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_edit_effect_panel_type", true) == 2) {
            i = R.layout.eo3;
        } else {
            i = R.layout.eo8;
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }
}

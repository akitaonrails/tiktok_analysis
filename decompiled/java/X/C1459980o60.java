package X;

import Y.AObjectS243S0100000_14;
import Y.AObserverS225S0100000_22;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o60, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459980o60 implements InterfaceC1660130tIp<C1661920tLi>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LL;
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final C1664740tQG LLJ;
    public final C1664740tQG LLJI;
    public final C1664740tQG LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1459980o60.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1459980o60.class, "lifecycleOwner", "getLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1459980o60.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1459980o60.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1459980o60.class, "editToolBarClickCallbacksApiComponent", "getEditToolBarClickCallbacksApiComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/business/EditToolBarClickCallbacksApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1459980o60.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1459980o60.class, "templateAutoCutAIApi", "getTemplateAutoCutAIApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/TemplateAutoCutAIApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1459980o60.class, "storyEditAiLiveApi", "getStoryEditAiLiveApi()Lcom/ss/android/ugc/aweme/social/creation/api/edit/StoryEditAiLiveApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1459980o60.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/aweme/social/creation/edit/component/toolbar/StoryEditToolbarApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZIZ() {
        String strYe;
        if (((C861380Xqi) this.LLILLJJLI.getValue()).LIZLLL) {
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) this.LLILZLL.getValue(this, LLJILJIL[2]));
            c1389890mGx.LJIIIZ(2131825310);
            c1389890mGx.LJIIJJI();
            return;
        }
        InterfaceC1455360nyY interfaceC1455360nyY = (InterfaceC1455360nyY) this.LLIZ.getValue(this, LLJILJIL[4]);
        if (interfaceC1455360nyY != null) {
            interfaceC1455360nyY.W61(false);
        }
        InterfaceC1460120o6E interfaceC1460120o6ELIZLLL = LIZLLL();
        if (interfaceC1460120o6ELIZLLL == null || (strYe = interfaceC1460120o6ELIZLLL.Ye()) == null) {
            return;
        }
        InterfaceC1460120o6E interfaceC1460120o6ELIZLLL2 = LIZLLL();
        if (interfaceC1460120o6ELIZLLL2 != null) {
            interfaceC1460120o6ELIZLLL2.rt();
        }
        C1402810mbn c1402810mbn = C1402810mbn.LIZ;
        VideoPublishEditModel videoPublishEditModelLJFF = LJFF();
        c1402810mbn.getClass();
        C1402810mbn.LIZIZ(videoPublishEditModelLJFF, strYe);
        InterfaceC1417050myl interfaceC1417050mylLIZJ = LIZJ();
        if (interfaceC1417050mylLIZJ != null) {
            interfaceC1417050mylLIZJ.HB0(strYe);
        }
    }

    public final InterfaceC1417050myl LIZJ() {
        return (InterfaceC1417050myl) this.LLIZLLLIL.getValue(this, LLJILJIL[5]);
    }

    public final InterfaceC1460120o6E LIZLLL() {
        return (InterfaceC1460120o6E) this.LLJIJIL.getValue(this, LLJILJIL[8]);
    }

    public final LifecycleOwner LJ() {
        return (LifecycleOwner) this.LLILZIL.getValue(this, LLJILJIL[1]);
    }

    public final VideoPublishEditModel LJFF() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJILJIL[0]);
    }

    public final void LJI() {
        boolean z;
        InterfaceC1417440mzO interfaceC1417440mzO;
        C05YD<C1464760oDi> c05ydHt2;
        C1464760oDi value;
        InterfaceC1460120o6E interfaceC1460120o6ELIZLLL;
        AutoCutModel autoCutModel = LJFF().creativeModel.autoCutModel;
        boolean z2 = (autoCutModel.curSource == C0MJ9.MIX_EDITING.ordinal() || C1403130mcJ.LIZJ(LJFF().creativeModel) == null || !C13LQ.LJLIIL(new Integer[]{Integer.valueOf(EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue()), Integer.valueOf(EnumC1412640mre.ALGORITHM_TEMPLATE.getValue()), Integer.valueOf(EnumC1412640mre.CUT_SAME.getValue()), Integer.valueOf(EnumC1412640mre.PUGC_TEMPLATE.getValue())}).contains(Integer.valueOf(autoCutModel.curTemplateType))) ? false : true;
        if (((Boolean) C0BOE.LIZ.getValue()).booleanValue() && (interfaceC1460120o6ELIZLLL = LIZLLL()) != null) {
            interfaceC1460120o6ELIZLLL.Uh1(1800, !C0MDL.LJ(LJFF()));
        }
        C1664740tQG c1664740tQG = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        InterfaceC1464740oDg interfaceC1464740oDg = (InterfaceC1464740oDg) c1664740tQG.getValue(this, interfaceC2217461BqaArr[7]);
        if (interfaceC1464740oDg == null || (c05ydHt2 = interfaceC1464740oDg.ht2()) == null || (value = c05ydHt2.getValue()) == null || !(value.LIZ == UsageStatus.SUCCESS_APPLY || value.LIZ())) {
            z = false;
            if (LJFF().getAILivePhotoModel().LJII() || LJFF().getAILivePhotoModel().LJIIIZ()) {
                z = true;
            }
        } else {
            z = true;
        }
        boolean z3 = (z2 || (interfaceC1417440mzO = (InterfaceC1417440mzO) this.LLJ.getValue(this, interfaceC2217461BqaArr[6])) == null || !interfaceC1417440mzO.ol0()) ? false : true;
        if (((C861380Xqi) this.LLILLJJLI.getValue()).LIZJ == z2 && ((C861380Xqi) this.LLILLJJLI.getValue()).LIZLLL == z && ((C861380Xqi) this.LLILLJJLI.getValue()).LJ == z3) {
            return;
        }
        C2252321DDq c2252321DDq = this.LLILLJJLI;
        C861380Xqi c861380Xqi = (C861380Xqi) c2252321DDq.getValue();
        c2252321DDq.setValue(new C861380Xqi(c861380Xqi.LIZ, c861380Xqi.LIZIZ, z2, z, z3));
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1660130tIp
    public final C05YD<C861380Xqi> getState() {
        return this.LLILLL;
    }

    public C1459980o60(C1DRG c1drg) {
        LiveEvent<Unit> liveEventHC2;
        LiveEvent<Unit> liveEventWR;
        LiveEvent<String> liveEventYx;
        this.LL = c1drg;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C861380Xqi(false, null, false, false, false));
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, LifecycleOwner.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, Activity.class, null);
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455360nyY.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1417050myl.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1417440mzO.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1464740oDg.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1460120o6E.class, null);
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
        C23250099c.LIZLLL(c054gLIZ, null, null, new C861320Xqc(this, null), 3);
        InterfaceC1417050myl interfaceC1417050mylLIZJ = LIZJ();
        if (interfaceC1417050mylLIZJ != null && (liveEventYx = interfaceC1417050mylLIZJ.Yx()) != null) {
            liveEventYx.LIZ(LJ(), new AObjectS243S0100000_14(this, 12));
        }
        InterfaceC1417050myl interfaceC1417050mylLIZJ2 = LIZJ();
        if (interfaceC1417050mylLIZJ2 != null && (liveEventWR = interfaceC1417050mylLIZJ2.WR()) != null) {
            liveEventWR.LIZ(LJ(), new AObjectS243S0100000_14(this, 13));
        }
        InterfaceC1417050myl interfaceC1417050mylLIZJ3 = LIZJ();
        if (interfaceC1417050mylLIZJ3 != null && (liveEventHC2 = interfaceC1417050mylLIZJ3.HC2()) != null) {
            liveEventHC2.LIZ(LJ(), new AObjectS243S0100000_14(this, 14));
        }
        C23250099c.LIZLLL(c054gLIZ, null, null, new C861350Xqf(this, null), 3);
        ((InterfaceC1455860nzM) c1664750tQHLIZ.getValue(this, LLJILJIL[3])).ww2().observe(LJ(), new AObserverS225S0100000_22(this, 196));
        C23250099c.LIZLLL(c054gLIZ, null, null, new C861310Xqb(this, null), 3);
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        String str;
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
        if (Intrinsics.LJFF(interfaceC1660090tIl, C1460150o6H.LIZ)) {
            if (LJFF().getOrigin() == 0) {
                str = "upload";
            } else {
                str = "shoot";
            }
            C1417710mzp.LJJIJ(str, "video_edit_page", LJFF().mShootWay, LJFF().getCreationId(), null, LJFF().creativeModel.photoModeEnterEditingStage.isFromMultiPhotoContent, LJFF().creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage, C1428470nHB.LJJJZ(LJFF()), null, 272);
        }
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0ME2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0ME2 extends AbstractC1664470tPp<C0ME6, Unit, Unit> implements C0ME6, InterfaceC379610EuV, InterfaceC197034127c {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LLILLL;
    public C0ME7 LLILZLL;
    public C0ME8 LLIZ;
    public final C0ME6 LLILZ = this;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC564900MDo.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), C0ME1.class, null);
    public final Function0<Unit> LLJI = AFwS194S0000000_8.get$arr$(244);
    public final Function0<Unit> LLJIJIL = AFwS194S0000000_8.get$arr$(245);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ME2.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0ME2.class, "innerRootApi", "getInnerRootApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveInnerRootApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0ME2.class, "aiLiveDraftApi", "getAiLiveDraftApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveDraftApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJILJILJ = 8;
    }

    private final InterfaceC564900MDo B3() {
        return (InterfaceC564900MDo) this.LLIZLLLIL.getValue(this, LLJILJIL[1]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJILJIL[0]);
    }

    private final C0ME1 q3() {
        return (C0ME1) this.LLJ.getValue(this, LLJILJIL[2]);
    }

    @Override // X.C0ME6
    public void Iw2() {
        C0ME7 c0me7;
        C0ME7 c0me72 = this.LLILZLL;
        if (c0me72 == null || !((Fragment) c0me72.LIZLLL.getValue()).isVisible() || (c0me7 = this.LLILZLL) == null) {
            return;
        }
        ((DialogFragment) c0me7.LIZLLL.getValue()).dismiss();
    }

    @Override // X.InterfaceC197034127c
    public void LLIIZ() {
        C564410MBr c564410MBr = C564410MBr.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        c564410MBr.getClass();
        C20684815ws.LJIILLIIL("ai_livephoto_edit_prompt", C564410MBr.LJII(editModel).LIZ);
        B3().ns0();
    }

    @Override // X.InterfaceC197034127c
    public void S0() {
        C564410MBr c564410MBr = C564410MBr.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        c564410MBr.getClass();
        PromptPageMobParam promptPageMobParam = editModel.getAILivePhotoModel().mobParam;
        C0LAB c0labLJII = C564410MBr.LJII(editModel);
        c0labLJII.LIZ(promptPageMobParam.isRegeneratePrompt ? 1 : 0, "is_edit_prompt_regenerate");
        if (promptPageMobParam.lastGenerateTime > 0) {
            c0labLJII.LIZIZ(System.currentTimeMillis() - promptPageMobParam.lastGenerateTime, "generate_waiting_duration");
        }
        C20684815ws.LJIILLIIL("ai_livephoto_leave", c0labLJII.LIZ);
        q3().TB2("ai_livephoto_click_loading_sheet", 30);
    }

    @Override // X.C0ME6
    public void l30() {
        C197035127d c197035127d;
        C0ME7 c0me7 = this.LLILZLL;
        if (c0me7 == null || (c197035127d = (C197035127d) ((View) c0me7.LIZJ.getValue())) == null) {
            return;
        }
        c197035127d.LIZ(getEditModel().getAILivePhotoModel().LIZIZ().remainTime);
    }

    @Override // X.C0ME6
    public void q70() {
        C0ME8 c0me8;
        C0ME8 c0me82 = this.LLIZ;
        if (c0me82 == null || !((Fragment) c0me82.LIZLLL.getValue()).isVisible() || (c0me8 = this.LLIZ) == null) {
            return;
        }
        ((DialogFragment) c0me8.LIZLLL.getValue()).dismiss();
    }

    @Override // X.InterfaceC197034127c
    public void LLFF() {
        B3().Ym();
        C564410MBr c564410MBr = C564410MBr.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        c564410MBr.getClass();
        PromptPageMobParam promptPageMobParam = editModel.getAILivePhotoModel().mobParam;
        C0LAB c0labLJII = C564410MBr.LJII(editModel);
        c0labLJII.LIZ(promptPageMobParam.isRegeneratePrompt ? 1 : 0, "is_edit_prompt_regenerate");
        if (promptPageMobParam.lastGenerateTime > 0) {
            c0labLJII.LIZIZ(System.currentTimeMillis() - promptPageMobParam.lastGenerateTime, "generate_waiting_duration");
        }
        C20684815ws.LJIILLIIL("ai_livephoto_stop_generating", c0labLJII.LIZ);
        C564410MBr.LJIILJJIL(c564410MBr, getEditModel(), true, false, 4);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ME7, X.0MEK] */
    @Override // X.C0ME6
    public void PR0() {
        C19EG c19eg;
        C19EG c19egInvoke;
        Activity activityLJII = C1664590tQ1.LJII(this);
        if ((activityLJII instanceof C19EG) && (c19eg = (C19EG) activityLJII) != null && (!c19eg.isFinishing())) {
            if (this.LLILZLL == null) {
                final Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
                final AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(c19eg, 516);
                ?? r3 = new C0MEK<C197035127d>(contextLJIIIZ, awS552S0100000_8) { // from class: X.0ME7
                    @Override // X.C0MEK
                    public final View LIZ() {
                        return new C197035127d(this.LIZ);
                    }
                };
                ((C197035127d) ((View) r3.LIZJ.getValue())).setAILivePhotoSheetEventListener(this);
                this.LLILZLL = r3;
            }
            l30();
            C0ME7 c0me7 = this.LLILZLL;
            if (c0me7 == null || (c19egInvoke = c0me7.LIZIZ.invoke()) == null) {
                return;
            }
            ((DialogFragment) c0me7.LIZLLL.getValue()).show(c19egInvoke.getSupportFragmentManager(), "");
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ME8, X.0MEK] */
    @Override // X.C0ME6
    public void hF1() {
        C19EG c19eg;
        C19EG c19egInvoke;
        C197033127b c197033127b;
        Activity activityLJII = C1664590tQ1.LJII(this);
        if ((activityLJII instanceof C19EG) && (c19eg = (C19EG) activityLJII) != null && (!c19eg.isFinishing())) {
            if (this.LLIZ == null) {
                final Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
                final AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(c19eg, 515);
                ?? r3 = new C0MEK<C197033127b>(contextLJIIIZ, awS552S0100000_8) { // from class: X.0ME8
                    @Override // X.C0MEK
                    public final View LIZ() {
                        return new C197033127b(this.LIZ);
                    }
                };
                ((C197033127b) ((View) r3.LIZJ.getValue())).setAILivePhotoSheetEventListener(this);
                this.LLIZ = r3;
            }
            C0ME8 c0me8 = this.LLIZ;
            if (c0me8 != null && (c197033127b = (C197033127b) ((View) c0me8.LIZJ.getValue())) != null) {
                c197033127b.LIZIZ(getEditModel().getAILivePhotoModel().LIZJ().prompt);
                c197033127b.LIZ(getEditModel().getAILivePhotoModel().LJIIZILJ());
            }
            C0ME8 c0me82 = this.LLIZ;
            if (c0me82 == null || (c19egInvoke = c0me82.LIZIZ.invoke()) == null) {
                return;
            }
            ((DialogFragment) c0me82.LIZLLL.getValue()).show(c19egInvoke.getSupportFragmentManager(), "");
        }
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> o2() {
        return this.LLJI;
    }

    public C0ME6 v3() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> w2() {
        return this.LLJIJIL;
    }

    public C0ME2(C1DRG c1drg) {
        this.LLILLL = c1drg;
    }

    @Override // X.InterfaceC197034127c
    public void LLZZZIL(boolean z) {
        String str;
        new C0ZDN(C1664590tQ1.LJIIIZ(this)).LIZ(0);
        InterfaceC1417440mzO interfaceC1417440mzO = (InterfaceC1417440mzO) getDiContainer().LJIIL(null, InterfaceC1417440mzO.class);
        if (interfaceC1417440mzO != null) {
            interfaceC1417440mzO.I22();
        }
        if (z) {
            B3().Sc(true);
        } else {
            B3().nh(true);
        }
        C564410MBr c564410MBr = C564410MBr.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c564410MBr.getClass();
        C0LAB c0labLJII = C564410MBr.LJII(editModel);
        c0labLJII.LJ("to_status", str);
        C20684815ws.LJIILLIIL("ai_livephoto_apply_toggle", c0labLJII.LIZ);
    }
}

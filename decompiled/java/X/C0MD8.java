package X;

import Y.AObserverS212S0100000_8;
import Y.AfS177S0100000_8;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.ailive.newprompt.NewPromptPageModel;
import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MD8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MD8 extends i<C0MDC, C0MFP, C0MDA, C0MDB> implements C0MDC, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public final C1DRG LLJILJILJ;
    public final C19A3 LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final C11NJ LLJJJIL;
    public final MutableLiveData<Unit> LLJJJJ;
    public final MutableLiveData<C0MDE> LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final Function0<C0MFP> LLJJL;
    public final Function0<C0MDA> LLJJLIIIJLLLLLLLZ;
    public final Function0<C0MDB> LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MD8.class, "pageModel", "getPageModel()Lcom/ss/android/ugc/gamora/editor/ailive/newprompt/NewPromptPageModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0MD8.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0MD8.class, "aiLivePromptV2Api", "getAiLivePromptV2Api()Lcom/ss/android/ugc/gamora/editor/ailive/newprompt/functions/AILivePresetPromptV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0MD8.class, "aiChoosePhotoApi", "getAiChoosePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/newprompt/functions/AILiveChoosePhotoApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0MD8.class, "aiLiveWritingApi", "getAiLiveWritingApi()Lcom/ss/android/ugc/gamora/editor/ailive/newprompt/functions/AILiveWritingApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0MD8.class, "aiUploadImageApi", "getAiUploadImageApi()Lcom/ss/android/ugc/gamora/editor/ailive/newprompt/functions/AILiveUploadImageApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0MD8.class, "aiLiveQuotaV2Api", "getAiLiveQuotaV2Api()Lcom/ss/android/ugc/gamora/editor/ailive/newprompt/functions/AILiveQuotaV2Api;", 0);
        c09r3.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
        LLJLILLLLZIIL = 8;
    }

    private final C0MD7 H4() {
        return (C0MD7) this.LLJJIII.getValue(this, LLJLIL[2]);
    }

    private final void Xi() {
        this.LLJJJIL.LIZ(H4().Xn().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 20)));
        F4().dR0().observe(this, new AObserverS212S0100000_8(this, 57));
    }

    public final InterfaceC537390L5t F4() {
        return (InterfaceC537390L5t) this.LLJJIJI.getValue(this, LLJLIL[3]);
    }

    public final C0L31 K4() {
        return (C0L31) this.LLJJJ.getValue(this, LLJLIL[6]);
    }

    public final C0MD4 O4() {
        return (C0MD4) this.LLJJIJIIJIL.getValue(this, LLJLIL[4]);
    }

    public final C0MC7 P4() {
        return (C0MC7) this.LLJJIJIL.getValue(this, LLJLIL[5]);
    }

    public final NewPromptPageModel T4() {
        return (NewPromptPageModel) this.LLJJ.getValue(this, LLJLIL[0]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJI.getValue(this, LLJLIL[1]);
    }

    private final void Z4() {
        H4().init();
        if (T2().LIZLLL.LJFF().length() > 0) {
            P4().Kd(T2().LIZLLL.LJFF());
        }
        PromptModel promptModel = getEditModel().getAILivePhotoModel().LIZIZ().prompt;
        if (promptModel == null || promptModel.LIZLLL()) {
            PromptModel promptModelLJII = C0MDL.LJII(getEditModel());
            if (promptModelLJII.promptType == PromptType.NONE) {
                d5();
            } else {
                n5(promptModelLJII);
            }
        } else {
            n5(promptModel);
        }
        C564410MBr c564410MBr = C564410MBr.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        PromptModel promptModel2 = T2().LIZJ;
        c564410MBr.getClass();
        C0LAB c0labLJI = C564410MBr.LJI(editModel);
        c0labLJI.LJ("default_prompt_type", promptModel2.promptTypeMob);
        C20684815ws.LJIILLIIL("ai_livephoto_generate_page_show", c0labLJI.LIZ);
    }

    private final void d5() {
        if (T2().LIZJ.LIZLLL()) {
            n5(C0MD9.LIZ(C1383370m6R.LJIIJ(2131820733), PromptType.DEFAULT, true, 12));
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
        Z4();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C11NJ c11nj = this.LLJJJIL;
        if (!c11nj.LLILLJJLI) {
            c11nj.dispose();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        i3(new AwS587S0100000_8(this, 351));
    }

    @Override // ge.i
    public Function0<C0MFP> E3() {
        return this.LLJJL;
    }

    @Override // X.C0MDC
    public LiveData<Unit> HI2() {
        return this.LLJJJJ;
    }

    @Override // X.C0MDC
    public LiveData<C0MDE> Y() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0MDA> o2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0MDB> w2() {
        return this.LLJL;
    }

    public final void k5(MediaModel mediaModel) {
        i3(new AwS587S0100000_8(mediaModel, 352));
    }

    public final void n5(PromptModel promptModel) {
        i3(new AwS587S0100000_8(promptModel, 353));
        new AwS587S0100000_8(promptModel, 354).invoke(getEditModel().getAILivePhotoModel().pageDataCache);
    }

    public C0MD8(C1DRG c1drg, C19A3 c19a3) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c19a3;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), NewPromptPageModel.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), C0MD7.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC537390L5t.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), C0MD4.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), C0MC7.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), C0L31.class, null);
        this.LLJJJIL = new C11NJ();
        this.LLJJJJ = new MutableLiveData<>();
        this.LLJJJJJIL = new MutableLiveData<>();
        this.LLJJL = AFwS194S0000000_8.get$arr$(254);
        this.LLJJLIIIJLLLLLLLZ = new AwS552S0100000_8(this, 536);
        this.LLJL = new AwS552S0100000_8(this, 537);
    }
}

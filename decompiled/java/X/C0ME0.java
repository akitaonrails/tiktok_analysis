package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0ME0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0ME0 extends AbstractC1664470tPp<C0MEL, Unit, Unit> implements C0MEL, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final C1DRG LLILLL;
    public final C19A3 LLILZ;
    public final C0MEL LLILZIL = this;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), C0ME6.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC564900MDo.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), C0MEH.class, null);
    public final Function0<Unit> LLJI = AFwS194S0000000_8.get$arr$(250);
    public final Function0<Unit> LLJIJIL = AFwS194S0000000_8.get$arr$(253);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455610nyx.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), C1456770o0p.class, null);
    public final boolean LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ME0.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0ME0.class, "aiLiveSheetApi", "getAiLiveSheetApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveSheetApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0ME0.class, "innerRootApi", "getInnerRootApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveInnerRootApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0ME0.class, "aiLiveQuotaApi", "getAiLiveQuotaApi()Lcom/ss/android/ugc/gamora/editor/ailive/quota/AILiveQuotaLogicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0ME0.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0ME0.class, "socialNewEditConfig", "getSocialNewEditConfig()Lcom/ss/android/ugc/aweme/social/creation/api/edit/exp/SocialNewEditConfig;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJJI = 8;
    }

    private final InterfaceC1455610nyx E3() {
        return (InterfaceC1455610nyx) this.LLJILJIL.getValue(this, LLJJ[4]);
    }

    private final InterfaceC564900MDo H3() {
        return (InterfaceC564900MDo) this.LLIZLLLIL.getValue(this, LLJJ[2]);
    }

    private final C1456770o0p O3() {
        return (C1456770o0p) this.LLJILJILJ.getValue(this, LLJJ[5]);
    }

    private final C0MEH q3() {
        return (C0MEH) this.LLJ.getValue(this, LLJJ[3]);
    }

    private final C0ME6 v3() {
        return (C0ME6) this.LLIZ.getValue(this, LLJJ[1]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZLL.getValue(this, LLJJ[0]);
    }

    private final void e4() {
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1455610nyx.class, new AwS587S0100000_8(this, 349));
            return;
        }
        InterfaceC1455610nyx interfaceC1455610nyxE3 = E3();
        if (interfaceC1455610nyxE3 != null) {
            interfaceC1455610nyxE3.Uh1(1800, !C0MDL.LJ(getEditModel()));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        e4();
    }

    public C0MEL B3() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> o2() {
        return this.LLJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> w2() {
        return this.LLJIJIL;
    }

    @Override // X.C0MEL
    public void Os(AbstractC564980MDw abstractC564980MDw) {
        C0MEH c0mehQ3;
        abstractC564980MDw.getClass();
        if ((abstractC564980MDw instanceof C565010MDz) && ((C565010MDz) abstractC564980MDw).LIZ == EnumC564910MDp.TOOLBAR) {
            getEditModel().getAILivePhotoModel().mobParam.generateSidebarType = 1;
            C564410MBr c564410MBr = C564410MBr.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            c564410MBr.getClass();
            C564410MBr.LJIIIIZZ(editModel);
        }
        if (!getEditModel().getAILivePhotoModel().LJFF() && !getEditModel().getAILivePhotoModel().LJIIIZ() && (c0mehQ3 = q3()) != null && c0mehQ3.Of0()) {
            return;
        }
        if (C0MDL.LJ(getEditModel())) {
            Activity activity = this.LLILZ.mActivity;
            if (activity != null) {
                C1390390mHl c1390390mHl = C1390390mHl.LIZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131825312);
                ((C1390360mHi) c1390390mHl.createToast(activity, 6018, creativeToastBuilder)).show();
                return;
            }
            return;
        }
        if (getEditModel().getAILivePhotoModel().LJFF()) {
            v3().hF1();
            return;
        }
        if (getEditModel().getAILivePhotoModel().LJIIIZ()) {
            v3().PR0();
            return;
        }
        C0M8O.LIZ.getClass();
        if (!C0M8O.LIZJ() && !C0MDL.LJIIIIZZ(getEditModel()) && !C0MDL.LJIIIZ(getEditModel())) {
            C0MES c0mes = C0MES.LIZ;
            Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
            C19A3 c19a3 = this.LLILZ;
            VideoPublishEditModel editModel2 = getEditModel();
            AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(this, abstractC564980MDw, 78);
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(251);
            AFwS194S0000000_8 aFwS194S0000000_82 = AFwS194S0000000_8.get$arr$(252);
            c0mes.getClass();
            C0MES.LJFF(contextLJIIIZ, c19a3, editModel2, null, "video_edit_page", R.id.mbc, awS409S0200000_8, aFwS194S0000000_8, aFwS194S0000000_82);
            return;
        }
        Q3(this, abstractC564980MDw);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0ME0(X.C1DRG r4, X.C19A3 r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.LLILLL = r4
            r3.LLILZ = r5
            r3.LLILZIL = r3
            X.1DRG r1 = r3.getDiContainer()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel> r0 = com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel.class
            r2 = 0
            X.0tQH r0 = X.C1664770tQJ.LIZ(r1, r0, r2)
            r3.LLILZLL = r0
            X.1DRG r1 = r3.getDiContainer()
            java.lang.Class<X.0ME6> r0 = X.C0ME6.class
            X.0tQH r0 = X.C1664770tQJ.LIZ(r1, r0, r2)
            r3.LLIZ = r0
            X.1DRG r1 = r3.getDiContainer()
            java.lang.Class<X.0MDo> r0 = X.InterfaceC564900MDo.class
            X.0tQH r0 = X.C1664770tQJ.LIZ(r1, r0, r2)
            r3.LLIZLLLIL = r0
            X.1DRG r1 = r3.getDiContainer()
            java.lang.Class<X.0MEH> r0 = X.C0MEH.class
            X.0tQG r0 = X.C1664770tQJ.LIZIZ(r1, r0, r2)
            r3.LLJ = r0
            r0 = 250(0xfa, float:3.5E-43)
            kotlin.jvm.internal.AFwS194S0000000_8 r0 = kotlin.jvm.internal.AFwS194S0000000_8.get$arr$(r0)
            r3.LLJI = r0
            r0 = 253(0xfd, float:3.55E-43)
            kotlin.jvm.internal.AFwS194S0000000_8 r0 = kotlin.jvm.internal.AFwS194S0000000_8.get$arr$(r0)
            r3.LLJIJIL = r0
            X.1DRG r1 = r3.getDiContainer()
            java.lang.Class<X.0nyx> r0 = X.InterfaceC1455610nyx.class
            X.0tQG r0 = X.C1664770tQJ.LIZIZ(r1, r0, r2)
            r3.LLJILJIL = r0
            X.1DRG r1 = r3.getDiContainer()
            java.lang.Class<X.0o0p> r0 = X.C1456770o0p.class
            X.0tQG r0 = X.C1664770tQJ.LIZIZ(r1, r0, r2)
            r3.LLJILJILJ = r0
            X.0o0p r0 = r3.O3()
            if (r0 == 0) goto L70
            boolean r1 = r0.LIZ
            r0 = 1
            if (r1 != r0) goto L70
        L6d:
            r3.LLJILLL = r0
            return
        L70:
            r0 = 0
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ME0.<init>(X.1DRG, X.19A3):void");
    }

    public static final void Q3(C0ME0 c0me0, AbstractC564980MDw abstractC564980MDw) {
        C0M8O.LIZ.getClass();
        C0M8O.LJ();
        c0me0.H3().AX(abstractC564980MDw);
    }
}

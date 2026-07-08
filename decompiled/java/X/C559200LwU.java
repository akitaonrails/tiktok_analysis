package X;

import Y.AObserverS212S0100000_8;
import Y.AObserverS51S0210000_8;
import Y.ARunnableS108S0100000_8;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.api.ITemplateService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559200LwU extends i<InterfaceC379590EuT, C21516819Io, C559320Lwg, C21516919Ip> implements InterfaceC379590EuT, C0F1U, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public static final int LLLFF;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final C01GW LLJJJJ;
    public long LLJJJJJIL;
    public int LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public NLEModel LLJL;
    public final C01GW LLJLIL;
    public final C559290Lwd LLJLILLLLZIIL;
    public final Function0<C559320Lwg> LLJLL;
    public final Function0<C21516919Ip> LLJLLIL;
    public C0FQS LLJLLL;
    public boolean LLJZ;
    public final MutableLiveData<Boolean> LLJZIJLIL;
    public final MutableLiveData<Boolean> LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C559200LwU.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C559200LwU.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C559200LwU.class, "veAutoPlayInterceptorApi", "getVeAutoPlayInterceptorApi()Lcom/ss/android/ugc/gamora/editor/VEAutoPlayInterceptorApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C559200LwU.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C559200LwU.class, "editTitlebarApi", "getEditTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C559200LwU.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C559200LwU.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C559200LwU.class, "magicProcessApi", "getMagicProcessApi()Lcom/ss/android/ugc/gamora/ugctemplate/TemplateMagicProcessApi;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLLFF = 8;
    }

    private final InterfaceC362610EJn D5() {
        return (InterfaceC362610EJn) this.LLJLIL.getValue();
    }

    private final InterfaceC372160EiU E5() {
        return (InterfaceC372160EiU) this.LLJJIII.getValue(this, LLLF[2]);
    }

    private final void N5() {
        Object next;
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getEditModel().getCreativeInfo().getCreationId());
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LJ("enter_from", getEditModel().getEnterFrom());
        c0lab.LIZLLL(this.LLJLLL.LJII, "template_type");
        c0lab.LJ("template_id", this.LLJLLL.LJ);
        c0lab.LIZ(((ArrayList) this.LLJLLL.LJIILLIIL).size(), "count");
        Iterator it2 = ((ArrayList) this.LLJLLL.LJJI).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((C0FQP) next).LIZJ == 1) {
                    break;
                }
            }
        }
        C0FQP c0fqp = (C0FQP) next;
        if (c0fqp == null || (str = c0fqp.LIZ) == null) {
            str = "";
        }
        c0lab.LJ("magic_fail_id", str);
        c0lab.LIZ(this.LLJJJJLIIL, "retry_count");
        C20684815ws.LJIILLIIL("template_magic_loading_retry_toast_click", c0lab.LIZ);
    }

    private final void R5() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LIZLLL(this.LLJLLL.LJII, "template_type");
        c0lab.LJ("template_id", this.LLJLLL.LJ);
        c0lab.LIZ(((ArrayList) this.LLJLLL.LJIILLIIL).size(), "count");
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLJJJJJIL, "duration");
        c0lab.LIZ(this.LLJJJJLIIL, "retry_count");
        C20684815ws.LJIILLIIL("template_magic_loading_exit_dialog_cancel", c0lab.LIZ);
    }

    private final void S5() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LIZLLL(this.LLJLLL.LJII, "template_type");
        c0lab.LJ("template_id", this.LLJLLL.LJ);
        c0lab.LIZ(((ArrayList) this.LLJLLL.LJIILLIIL).size(), "count");
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLJJJJJIL, "duration");
        c0lab.LIZ(this.LLJJJJLIIL, "retry_count");
        C20684815ws.LJIILLIIL("template_magic_loading_exit_dialog_confirm", c0lab.LIZ);
    }

    private final void U5() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LIZLLL(this.LLJLLL.LJII, "template_type");
        c0lab.LJ("template_id", this.LLJLLL.LJ);
        c0lab.LIZ(((ArrayList) this.LLJLLL.LJIILLIIL).size(), "count");
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLJJJJJIL, "duration");
        c0lab.LIZ(this.LLJJJJLIIL, "retry_count");
        C20684815ws.LJIILLIIL("template_magic_loading_exit_dialog_show", c0lab.LIZ);
    }

    private final void d6() {
        Object next;
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getEditModel().getCreativeInfo().getCreationId());
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LJ("enter_from", getEditModel().getEnterFrom());
        c0lab.LIZLLL(this.LLJLLL.LJII, "template_type");
        c0lab.LJ("template_id", this.LLJLLL.LJ);
        c0lab.LIZ(((ArrayList) this.LLJLLL.LJIILLIIL).size(), "count");
        Iterator it2 = ((ArrayList) this.LLJLLL.LJJI).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((C0FQP) next).LIZJ == 1) {
                    break;
                }
            }
        }
        C0FQP c0fqp = (C0FQP) next;
        if (c0fqp == null || (str = c0fqp.LIZ) == null) {
            str = "";
        }
        c0lab.LJ("magic_fail_id", str);
        C20684815ws.LJIILLIIL("template_magic_loading_final_failed_toast_show", c0lab.LIZ);
    }

    private final InterfaceC1453420nvQ k5() {
        return (InterfaceC1453420nvQ) this.LLJJJ.getValue(this, LLLF[6]);
    }

    private final void m6() {
        Object next;
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getEditModel().getCreativeInfo().getCreationId());
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LJ("enter_from", getEditModel().getEnterFrom());
        c0lab.LIZLLL(this.LLJLLL.LJII, "template_type");
        c0lab.LJ("template_id", this.LLJLLL.LJ);
        c0lab.LIZ(((ArrayList) this.LLJLLL.LJIILLIIL).size(), "count");
        Iterator it2 = ((ArrayList) this.LLJLLL.LJJI).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((C0FQP) next).LIZJ == 1) {
                    break;
                }
            }
        }
        C0FQP c0fqp = (C0FQP) next;
        if (c0fqp == null || (str = c0fqp.LIZ) == null) {
            str = "";
        }
        c0lab.LJ("magic_fail_id", str);
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLJJJJJIL, "duration");
        c0lab.LIZ(this.LLJJJJLIIL, "retry_count");
        C20684815ws.LJIILLIIL("template_magic_loading_retry_toast_show", c0lab.LIZ);
    }

    public final InterfaceC559090LwJ C5() {
        return (InterfaceC559090LwJ) this.LLJJJIL.getValue(this, LLLF[7]);
    }

    public final void H5() {
        i3(AFwS239S0000000_8.get$arr$(236));
    }

    public final void J6() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel nLEModel = this.LLJL;
        if (nLEModel != null) {
            C5().Nv2(nLEModel, this.LLJLLL);
            InterfaceC1452170ntP value = JY0().g().getValue();
            if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
                nLEEditor.commit();
            }
            InterfaceC559500Lwy interfaceC559500LwyD5 = d5();
            if (interfaceC559500LwyD5 != null) {
                interfaceC559500LwyD5.Qk(false);
            }
        }
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJ.getValue(this, LLLF[0]);
    }

    public final void K4() {
        this.LLJZIJLIL.setValue(Boolean.FALSE);
        hide();
    }

    public final void LJIILLIIL() {
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        C348100Dkm c348100DkmLIZIZ2;
        INLEMediaSession iNLEMediaSession2;
        INLEMediaRuntime mediaRuntimeApi;
        if (this.LLJJL) {
            return;
        }
        InterfaceC372160EiU interfaceC372160EiUE5 = E5();
        if (interfaceC372160EiUE5 != null) {
            interfaceC372160EiUE5.cg1(this.LLJLILLLLZIIL);
        }
        VEEditorAutoStartStopArbiter value = JY0().b10().getValue();
        if (value != null) {
            value.LIZJ(false, true, true);
        }
        InterfaceC1452170ntP value2 = JY0().g().getValue();
        if (value2 != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value2)) != null && (iNLEMediaSession2 = c348100DkmLIZIZ2.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession2.getMediaRuntimeApi()) != null) {
            mediaRuntimeApi.setPreviewOffScreen(false);
        }
        InterfaceC1452170ntP value3 = JY0().g().getValue();
        if (value3 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value3)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
            playerApi.seekTime(0L);
        }
        VEEditorAutoStartStopArbiter value4 = JY0().b10().getValue();
        if (value4 != null) {
            value4.LIZ();
        }
    }

    @Override // X.InterfaceC379590EuT
    public void P32() {
        i3(AFwS239S0000000_8.get$arr$(235));
        getEditModel().creativeModel.pugcTemplateData.magicProcessState = EnumC551570LkB.FINISHED.getValue();
        InterfaceC559500Lwy interfaceC559500LwyD5 = d5();
        if (interfaceC559500LwyD5 != null) {
            interfaceC559500LwyD5.Qk(false);
        }
    }

    public final void cancel() {
        this.LLL.setValue(Boolean.FALSE);
        R5();
    }

    public final InterfaceC559500Lwy d5() {
        return (InterfaceC559500Lwy) this.LLJJIJI.getValue(this, LLLF[3]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJI.getValue(this, LLLF[1]);
    }

    public final InterfaceC1457600o2A n5() {
        return (InterfaceC1457600o2A) this.LLJJIJIIJIL.getValue(this, LLLF[4]);
    }

    public final InterfaceC1460000o62 t5() {
        return (InterfaceC1460000o62) this.LLJJIJIL.getValue(this, LLLF[5]);
    }

    public final void u6() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        C348100Dkm c348100DkmLIZIZ2;
        NLEEditor nLEEditor2;
        C201955140j.LIZLLL(C559380Lwm.LIZIZ, "EditorProAIGCComponent", "restoreCombineEffect");
        if (this.LLJJLIIIJLLLLLLLZ) {
            if (C123100dR.LIZ(getEditModel().creativeModel.pugcTemplateData.combineEffectNLETemplateModel)) {
                this.LLJL = NLETemplateModel.restore(getEditModel().creativeModel.pugcTemplateData.combineEffectNLETemplateModel);
                InterfaceC1452170ntP value = JY0().g().getValue();
                if (value != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value)) != null && (nLEEditor2 = c348100DkmLIZIZ2.LIZ) != null) {
                    nLEEditor2.setModel(this.LLJL);
                }
                InterfaceC1452170ntP value2 = JY0().g().getValue();
                if (value2 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value2)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
                    nLEEditor.commit();
                }
            }
            this.LLJJLIIIJLLLLLLLZ = false;
        }
    }

    public final InterfaceC366660EZc v5() {
        return (InterfaceC366660EZc) this.LLJJJJ.getValue();
    }

    public final void H4() {
        InterfaceC1453420nvQ interfaceC1453420nvQK5 = k5();
        if (interfaceC1453420nvQK5 != null) {
            interfaceC1453420nvQK5.MO0();
        }
        S5();
    }

    public final void M5() {
        InterfaceC372160EiU interfaceC372160EiUE5 = E5();
        if (interfaceC372160EiUE5 != null) {
            interfaceC372160EiUE5.FS1(this.LLJLILLLLZIIL);
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this.LLJILJILJ);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.b8(D5());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    @Override // ge.i, X.AbstractC2255721DQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C559200LwU.onCreate():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        if (Intrinsics.LJFF(this.LLJZIJLIL.getValue(), Boolean.TRUE)) {
            this.LLJJL = true;
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEMediaRuntime mediaRuntimeApi;
        super.onResume();
        if (this.LLJJL && Intrinsics.LJFF(this.LLJZIJLIL.getValue(), Boolean.TRUE)) {
            InterfaceC1452170ntP value = JY0().g().getValue();
            if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null) {
                mediaRuntimeApi.setPreviewOffScreen(false);
            }
            C786410Ut5.LJLIIL(10L, new BPEAHandler(), new ARunnableS108S0100000_8(this, 97));
        } else if (this.LLJJL && Intrinsics.LJFF(this.LLJZIJLIL.getValue(), Boolean.FALSE)) {
            this.LLJJL = false;
            LJIILLIIL();
        }
        this.LLJJL = false;
    }

    public final void retry() {
        N5();
        P6(true);
        getEditModel().creativeModel.pugcTemplateData.isRetry = true;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this.LLJILJILJ);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.AH(D5());
        }
    }

    public final void O4() {
        d6();
    }

    public final C0FQS Z4() {
        return this.LLJLLL;
    }

    public final void d7() {
        U5();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C559320Lwg> o2() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC379590EuT
    public LiveData<Boolean> vV0() {
        return this.LLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21516919Ip> w2() {
        return this.LLJLLIL;
    }

    public final boolean x5() {
        return this.LLJZ;
    }

    private final void P6(boolean z) {
        C201955140j.LIZJ(C559380Lwm.LIZIZ, "TemplatePreProcessComponent Template_Consume runMagicAndApplyMatting");
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C559220LwW(this, z, null), 3);
    }

    public final Object F4(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C201955140j.LIZJ(C559380Lwm.LIZIZ, "Template_Consume applyMatting");
        C0FQS c0fqs = this.LLJLLL;
        c0fqs.LIZIZ = new C0F1S(getEditModel().getCreativeInfo().getCreationId(), getEditModel().getCreativeInfo().getVersion(), getEditModel().getCreativeInfo().getSessionId());
        c0fqs.LJ = C1416310mxZ.LJJIJ(getEditModel(), false);
        String str = null;
        c0fqs.LJII = C1412630mrd.LIZIZ(C1416310mxZ.LJJIJIIJI(getEditModel(), null, false));
        c0fqs.LJI = "";
        C1412390mrF c1412390mrFLIZ = C1412380mrE.LIZ(getEditModel());
        if (c1412390mrFLIZ != null) {
            str = c1412390mrFLIZ.LIZ;
        }
        c0fqs.LJIIL = str;
        c0fqs.LJIIIZ = getEditModel().creativeModel.pugcTemplateData.featureList;
        c0fqs.LJJIIJ = getEditModel();
        ITemplateService iTemplateService = (ITemplateService) PluggableExtentionKt.pluggableSpi$default(ITemplateService.class, false, false, false, 14, null);
        if (iTemplateService != null) {
            iTemplateService.LJIILL(this.LLJLLL, new AwS374S0200000_8(this, c2252611DEt, 138), new AwS587S0100000_8(c2252611DEt, 517), AFwS239S0000000_8.get$arr$(234));
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K6(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C559250LwZ
            if (r0 == 0) goto L54
            r6 = r8
            X.0LwZ r6 = (X.C559250LwZ) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L3e
            if (r0 != r4) goto L5a
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.ies.nle.editor_jni.NLEModel r2 = r7.LLJL
            if (r2 == 0) goto L25
            X.0LwJ r1 = r7.C5()
            X.0FQS r0 = r7.LLJLLL
            r6.LLILLL = r3
            java.lang.Object r0 = r1.Vk0(r2, r0, r6)
            if (r0 != r5) goto L41
            return r5
        L3e:
            X.C155000ia.LIZIZ(r1)
        L41:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0LwX r1 = new X.0LwX
            r0 = 0
            r1.<init>(r7, r0)
            r6.LLILLL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r6, r2, r1)
            if (r0 != r5) goto L25
            return r5
        L54:
            X.0LwZ r6 = new X.0LwZ
            r6.<init>(r7, r8)
            goto L12
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C559200LwU.K6(X.05Vn):java.lang.Object");
    }

    public final void P4(boolean z) {
        NLEModel model;
        String str;
        NLEModel nLEModelQq2;
        NLEEditor nLEEditor;
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEMediaSession iNLEMediaSession2;
        C348100Dkm c348100DkmLIZIZ2;
        C348100Dkm c348100DkmLIZIZ3;
        C348100Dkm c348100DkmLIZIZ4;
        NLEEditor nLEEditor2;
        InterfaceC1452170ntP value = JY0().g().getValue();
        INLEPlayer playerApi = null;
        if (value != null && (c348100DkmLIZIZ4 = C352130DrH.LIZIZ(value)) != null && (nLEEditor2 = c348100DkmLIZIZ4.LIZ) != null) {
            model = nLEEditor2.getModel();
        } else {
            model = null;
        }
        this.LLJL = model;
        C0FQS c0fqs = this.LLJLLL;
        c0fqs.LIZIZ = new C0F1S(getEditModel().getCreativeInfo().getCreationId(), getEditModel().getCreativeInfo().getVersion(), getEditModel().getCreativeInfo().getSessionId());
        c0fqs.LJ = C1416310mxZ.LJJIJ(getEditModel(), false);
        c0fqs.LJII = C1412630mrd.LIZIZ(C1416310mxZ.LJJIJIIJI(getEditModel(), null, false));
        c0fqs.LJI = "";
        C1412390mrF c1412390mrFLIZ = C1412380mrE.LIZ(getEditModel());
        if (c1412390mrFLIZ != null) {
            str = c1412390mrFLIZ.LIZ;
        } else {
            str = null;
        }
        c0fqs.LJIIL = str;
        NLEModel nLEModel = this.LLJL;
        if (nLEModel != null) {
            nLEModelQq2 = C5().qq2(nLEModel, z, this.LLJLLL);
        } else {
            nLEModelQq2 = null;
        }
        c0fqs.LJIIJJI = nLEModelQq2;
        c0fqs.LJIIIZ = getEditModel().creativeModel.pugcTemplateData.featureList;
        c0fqs.LJJIIJ = getEditModel();
        c0fqs.LJIIIIZZ = "anchor";
        String str2 = getEditModel().creativeModel.pugcTemplateData.combineEffectNLETemplateModel;
        if (str2 != null && C123100dR.LIZ(str2)) {
            c0fqs.LJIIJ = NLETemplateModel.restore(getEditModel().creativeModel.pugcTemplateData.combineEffectNLETemplateModel);
        }
        ((ArrayList) this.LLJLLL.LJJI).clear();
        C0FQS c0fqs2 = this.LLJLLL;
        c0fqs2.LJJIII = 0;
        ((ArrayList) c0fqs2.LJIJJ).clear();
        this.LLJLLL.LJIJJLI.clear();
        C0FQS c0fqs3 = this.LLJLLL;
        C381410ExP c381410ExP = new C381410ExP();
        c0fqs3.LJIJ = c381410ExP;
        InterfaceC1452170ntP value2 = JY0().g().getValue();
        if (value2 != null && (c348100DkmLIZIZ3 = C352130DrH.LIZIZ(value2)) != null) {
            nLEEditor = c348100DkmLIZIZ3.LIZ;
        } else {
            nLEEditor = null;
        }
        c381410ExP.LIZIZ = nLEEditor;
        C381410ExP c381410ExP2 = this.LLJLLL.LJIJ;
        if (c381410ExP2 != null) {
            InterfaceC1452170ntP value3 = JY0().g().getValue();
            if (value3 != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value3)) != null) {
                iNLEMediaSession2 = c348100DkmLIZIZ2.LIZIZ;
            } else {
                iNLEMediaSession2 = null;
            }
            c381410ExP2.LIZ = iNLEMediaSession2;
        }
        C381410ExP c381410ExP3 = this.LLJLLL.LJIJ;
        if (c381410ExP3 != null) {
            InterfaceC1452170ntP value4 = JY0().g().getValue();
            if (value4 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value4)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null) {
                playerApi = iNLEMediaSession.getPlayerApi();
            }
            c381410ExP3.LIZJ = playerApi;
        }
        this.LLJLLL.LIZJ = getEditModel().mShootWay;
        C0FQS c0fqs4 = this.LLJLLL;
        c0fqs4.LJJIFFI = this.LLJJJJLIIL;
        c0fqs4.LJJII = z;
    }

    public final void T6(C0FQS c0fqs) {
        this.LLJLLL = c0fqs;
    }

    public final void W6(boolean z) {
        this.LLJZ = z;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.0Lwd] */
    public C559200LwU(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC372160EiU.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1457600o2A.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453420nvQ.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC559090LwJ.class, null);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 795));
        this.LLJJJJJIL = System.currentTimeMillis();
        this.LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 796));
        this.LLJLILLLLZIIL = new InterfaceC1462000o9G() { // from class: X.0Lwd
            @Override // X.InterfaceC1462000o9G
            public final boolean LJL(boolean z) {
                return false;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean LLIIIJ() {
                return false;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean b0() {
                return true;
            }

            @Override // X.InterfaceC1462000o9G
            public final boolean x0() {
                return false;
            }
        };
        this.LLJLL = AFwS194S0000000_8.get$arr$(321);
        this.LLJLLIL = new AwS552S0100000_8(this, 797);
        this.LLJLLL = new C0FQS();
        this.LLJZIJLIL = new MutableLiveData<>();
        this.LLL = new MutableLiveData<>();
    }

    public final Object L6(boolean z, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        LiveData<Integer> liveDataWw;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        Iterator<String> it2 = getEditModel().creativeModel.pugcTemplateData.featureList.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), "UGC_ASYNC_I2V")) {
                    break;
                }
            } else {
                Iterator<String> it3 = getEditModel().creativeModel.pugcTemplateData.featureList.iterator();
                while (it3.hasNext() && !Intrinsics.LJFF(it3.next(), "TEMPLATE_MATTING")) {
                }
            }
        }
        InterfaceC1457600o2A interfaceC1457600o2AN5 = n5();
        if (interfaceC1457600o2AN5 != null) {
            interfaceC1457600o2AN5.In0(this, new AwS587S0100000_8(this, 518));
        }
        InterfaceC1460000o62 interfaceC1460000o62T5 = t5();
        if (interfaceC1460000o62T5 != null && (liveDataWw = interfaceC1460000o62T5.ww()) != null) {
            liveDataWw.observe(this, new AObserverS212S0100000_8(this, 74));
        }
        show();
        this.LLJJJJJIL = System.currentTimeMillis();
        this.LLJZIJLIL.setValue(true);
        if (z) {
            getEditModel().creativeModel.pugcTemplateData.magicProcessState = EnumC551570LkB.INIT.getValue();
            InterfaceC559500Lwy interfaceC559500LwyD5 = d5();
            if (interfaceC559500LwyD5 != null) {
                interfaceC559500LwyD5.Qk(false);
            }
        }
        if (this.LLJJLIIIJLLLLLLLZ) {
            u6();
        }
        P4(z);
        i3(new AwS587S0100000_8(this, 519));
        VEEditorAutoStartStopArbiter value = JY0().b10().getValue();
        if (value != null) {
            value.LIZIZ();
        }
        JY0().ww2().observe(this, new AObserverS51S0210000_8(this, z, c2252611DEt, 1));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final void k7(boolean z, int i) {
        if (z) {
            getEditModel().creativeModel.pugcTemplateData.magicProcessState = EnumC551570LkB.RETRY.getValue();
            this.LLJJJJLIIL = i;
            getEditModel().creativeModel.pugcTemplateData.retryCount = i;
            m6();
        } else {
            getEditModel().creativeModel.pugcTemplateData.magicProcessState = EnumC551570LkB.FINISHED.getValue();
        }
        InterfaceC559500Lwy interfaceC559500LwyD5 = d5();
        if (interfaceC559500LwyD5 != null) {
            interfaceC559500LwyD5.Qk(false);
        }
    }
}

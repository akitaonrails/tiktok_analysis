package X;

import Y.AObserverS170S0200000_5;
import Y.AObserverS212S0100000_8;
import Y.ARunnableS105S0100000_5;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
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

/* JADX INFO: renamed from: X.0LwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559190LwT extends i<InterfaceC379590EuT, C21516819Io, C559320Lwg, C21516919Ip> implements InterfaceC379590EuT, C0F1U, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public long LLJJJIL;
    public int LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C559280Lwc LLJJLIIIJLLLLLLLZ;
    public final Function0<C559320Lwg> LLJL;
    public final Function0<C21516919Ip> LLJLIL;
    public C0FQS LLJLILLLLZIIL;
    public boolean LLJLL;
    public final MutableLiveData<Boolean> LLJLLIL;
    public final MutableLiveData<Boolean> LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C559190LwT.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C559190LwT.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C559190LwT.class, "veAutoPlayInterceptorApi", "getVeAutoPlayInterceptorApi()Lcom/ss/android/ugc/gamora/editor/VEAutoPlayInterceptorApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C559190LwT.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C559190LwT.class, "editTitlebarApi", "getEditTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C559190LwT.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C559190LwT.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
        LLJZIJLIL = 8;
    }

    private final void E5() {
        Object next;
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getEditModel().getCreativeInfo().getCreationId());
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LJ("enter_from", getEditModel().getEnterFrom());
        c0lab.LIZLLL(this.LLJLILLLLZIIL.LJII, "template_type");
        c0lab.LJ("template_id", this.LLJLILLLLZIIL.LJ);
        c0lab.LIZ(((ArrayList) this.LLJLILLLLZIIL.LJIILLIIL).size(), "count");
        Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL.LJJI).iterator();
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
        c0lab.LIZ(this.LLJJJJ, "retry_count");
        C20684815ws.LJIILLIIL("template_magic_loading_retry_toast_click", c0lab.LIZ);
    }

    private final void H5() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LIZLLL(this.LLJLILLLLZIIL.LJII, "template_type");
        c0lab.LJ("template_id", this.LLJLILLLLZIIL.LJ);
        c0lab.LIZ(((ArrayList) this.LLJLILLLLZIIL.LJIILLIIL).size(), "count");
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLJJJIL, "duration");
        c0lab.LIZ(this.LLJJJJ, "retry_count");
        C20684815ws.LJIILLIIL("template_magic_loading_exit_dialog_cancel", c0lab.LIZ);
    }

    private final void M5() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LIZLLL(this.LLJLILLLLZIIL.LJII, "template_type");
        c0lab.LJ("template_id", this.LLJLILLLLZIIL.LJ);
        c0lab.LIZ(((ArrayList) this.LLJLILLLLZIIL.LJIILLIIL).size(), "count");
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLJJJIL, "duration");
        c0lab.LIZ(this.LLJJJJ, "retry_count");
        C20684815ws.LJIILLIIL("template_magic_loading_exit_dialog_confirm", c0lab.LIZ);
    }

    private final void N5() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LIZLLL(this.LLJLILLLLZIIL.LJII, "template_type");
        c0lab.LJ("template_id", this.LLJLILLLLZIIL.LJ);
        c0lab.LIZ(((ArrayList) this.LLJLILLLLZIIL.LJIILLIIL).size(), "count");
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLJJJIL, "duration");
        c0lab.LIZ(this.LLJJJJ, "retry_count");
        C20684815ws.LJIILLIIL("template_magic_loading_exit_dialog_show", c0lab.LIZ);
    }

    private final void R5() {
        Object next;
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getEditModel().getCreativeInfo().getCreationId());
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LJ("enter_from", getEditModel().getEnterFrom());
        c0lab.LIZLLL(this.LLJLILLLLZIIL.LJII, "template_type");
        c0lab.LJ("template_id", this.LLJLILLLLZIIL.LJ);
        c0lab.LIZ(((ArrayList) this.LLJLILLLLZIIL.LJIILLIIL).size(), "count");
        Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL.LJJI).iterator();
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

    private final void S5() {
        Object next;
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getEditModel().getCreativeInfo().getCreationId());
        c0lab.LJ("shoot_way", getEditModel().mShootWay);
        c0lab.LJ("enter_from", getEditModel().getEnterFrom());
        c0lab.LIZLLL(this.LLJLILLLLZIIL.LJII, "template_type");
        c0lab.LJ("template_id", this.LLJLILLLLZIIL.LJ);
        c0lab.LIZ(((ArrayList) this.LLJLILLLLZIIL.LJIILLIIL).size(), "count");
        Iterator it2 = ((ArrayList) this.LLJLILLLLZIIL.LJJI).iterator();
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
        c0lab.LIZIZ(System.currentTimeMillis() - this.LLJJJIL, "duration");
        c0lab.LIZ(this.LLJJJJ, "retry_count");
        C20684815ws.LJIILLIIL("template_magic_loading_retry_toast_show", c0lab.LIZ);
    }

    private final InterfaceC1453420nvQ d5() {
        return (InterfaceC1453420nvQ) this.LLJJJ.getValue(this, LLJZ[6]);
    }

    private final InterfaceC362610EJn v5() {
        return (InterfaceC362610EJn) this.LLJJL.getValue();
    }

    private final InterfaceC372160EiU x5() {
        return (InterfaceC372160EiU) this.LLJJIII.getValue(this, LLJZ[2]);
    }

    public final void C5() {
        i3(AFwS239S0000000_8.get$arr$(231));
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJ.getValue(this, LLJZ[0]);
    }

    public final void K4() {
        this.LLJLLIL.setValue(Boolean.FALSE);
        hide();
    }

    public final void LJIILLIIL() {
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        C348100Dkm c348100DkmLIZIZ2;
        INLEMediaSession iNLEMediaSession2;
        INLEMediaRuntime mediaRuntimeApi;
        if (this.LLJJJJJIL) {
            return;
        }
        InterfaceC372160EiU interfaceC372160EiUX5 = x5();
        if (interfaceC372160EiUX5 != null) {
            interfaceC372160EiUX5.cg1(this.LLJJLIIIJLLLLLLLZ);
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
        i3(AFwS239S0000000_8.get$arr$(230));
        getEditModel().creativeModel.pugcTemplateData.magicProcessState = EnumC551570LkB.FINISHED.getValue();
        InterfaceC559500Lwy interfaceC559500LwyZ4 = Z4();
        if (interfaceC559500LwyZ4 != null) {
            interfaceC559500LwyZ4.Qk(false);
        }
    }

    public final void P4() {
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        C348100Dkm c348100DkmLIZIZ2;
        C348100Dkm c348100DkmLIZIZ3;
        C348100Dkm c348100DkmLIZIZ4;
        NLEEditor nLEEditor;
        C0FQS c0fqs = this.LLJLILLLLZIIL;
        c0fqs.LIZIZ = new C0F1S(getEditModel().getCreativeInfo().getCreationId(), getEditModel().getCreativeInfo().getVersion(), getEditModel().getCreativeInfo().getSessionId());
        c0fqs.LJ = C1416310mxZ.LJJIJ(getEditModel(), false);
        INLEPlayer playerApi = null;
        c0fqs.LJII = C1412630mrd.LIZIZ(C1416310mxZ.LJJIJIIJI(getEditModel(), null, false));
        c0fqs.LJI = "";
        C1412390mrF c1412390mrFLIZ = C1412380mrE.LIZ(getEditModel());
        c0fqs.LJIIL = c1412390mrFLIZ != null ? c1412390mrFLIZ.LIZ : null;
        InterfaceC1452170ntP value = JY0().g().getValue();
        c0fqs.LJIIJJI = (value == null || (c348100DkmLIZIZ4 = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ4.LIZ) == null) ? null : nLEEditor.getModel();
        c0fqs.LJIIIZ = getEditModel().creativeModel.pugcTemplateData.featureList;
        if (C123100dR.LIZ(getEditModel().creativeModel.pugcTemplateData.combineEffectNLETemplateModel)) {
            this.LLJLILLLLZIIL.LJIIJ = NLETemplateModel.restore(getEditModel().creativeModel.pugcTemplateData.combineEffectNLETemplateModel);
        }
        ((ArrayList) this.LLJLILLLLZIIL.LJJI).clear();
        ((ArrayList) this.LLJLILLLLZIIL.LJIJJ).clear();
        this.LLJLILLLLZIIL.LJIJJLI.clear();
        C0FQS c0fqs2 = this.LLJLILLLLZIIL;
        C381410ExP c381410ExP = new C381410ExP();
        c0fqs2.LJIJ = c381410ExP;
        InterfaceC1452170ntP value2 = JY0().g().getValue();
        c381410ExP.LIZIZ = (value2 == null || (c348100DkmLIZIZ3 = C352130DrH.LIZIZ(value2)) == null) ? null : c348100DkmLIZIZ3.LIZ;
        C381410ExP c381410ExP2 = this.LLJLILLLLZIIL.LJIJ;
        if (c381410ExP2 != null) {
            InterfaceC1452170ntP value3 = JY0().g().getValue();
            c381410ExP2.LIZ = (value3 == null || (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value3)) == null) ? null : c348100DkmLIZIZ2.LIZIZ;
        }
        C381410ExP c381410ExP3 = this.LLJLILLLLZIIL.LJIJ;
        if (c381410ExP3 != null) {
            InterfaceC1452170ntP value4 = JY0().g().getValue();
            if (value4 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value4)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null) {
                playerApi = iNLEMediaSession.getPlayerApi();
            }
            c381410ExP3.LIZJ = playerApi;
        }
        this.LLJLILLLLZIIL.LIZJ = getEditModel().mShootWay;
        C0FQS c0fqs3 = this.LLJLILLLLZIIL;
        c0fqs3.LJJIFFI = this.LLJJJJ;
        c0fqs3.LJJIIJ = getEditModel();
    }

    public final void U5() {
        ArrayList arrayList;
        ArrayList arrayList2;
        NLETrackSlot nLETrackSlot;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        VecNLETrackSPtr tracks;
        VecNLETrackSPtr tracks2;
        C201955140j.LIZJ(C559380Lwm.LIZIZ, "TemplatePreProcessComponent Template_Consume restoreCombineEffect");
        if (this.LLJJJJLIIL) {
            if (C123100dR.LIZ(getEditModel().creativeModel.pugcTemplateData.combineEffectNLETemplateModel)) {
                NLETemplateModel nLETemplateModelRestore = NLETemplateModel.restore(getEditModel().creativeModel.pugcTemplateData.combineEffectNLETemplateModel);
                if (nLETemplateModelRestore == null || (tracks2 = nLETemplateModelRestore.getTracks()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    Iterator<NLETrack> it2 = tracks2.iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(it2.next().getSlots(), arrayList);
                    }
                }
                InterfaceC1452170ntP value = JY0().g().getValue();
                if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null || (tracks = model.getTracks()) == null) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList();
                    Iterator<NLETrack> it3 = tracks.iterator();
                    while (it3.hasNext()) {
                        C19719612Di.LJJI(it3.next().getSlots(), arrayList2);
                    }
                }
                if (arrayList != null) {
                    int i = 0;
                    for (Object obj : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) obj;
                        if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment()) != null && !nLETrackSlot2.getFeatureList().contains("UGC_ASYNC_I2V")) {
                            C354260Dui.LIZ.getClass();
                            NLEVideoEffect nLEVideoEffectLJFF = C354260Dui.LJFF(nLETrackSlot2);
                            if (nLEVideoEffectLJFF != null && arrayList2 != null && (nLETrackSlot = (NLETrackSlot) ListProtector.get(arrayList2, i)) != null) {
                                ((ArrayList) this.LLJLILLLLZIIL.LJIILLIIL).add(nLETrackSlot2.getExtra("ep_magic_resource_id"));
                                nLETrackSlot.clearVideoEffect();
                                this.LLJLILLLLZIIL.LJIL.add(new C381340ExI(nLETrackSlot, nLEVideoEffectLJFF));
                            }
                        }
                        i = i2;
                    }
                }
            }
            this.LLJJJJLIIL = false;
        }
    }

    public final InterfaceC559500Lwy Z4() {
        return (InterfaceC559500Lwy) this.LLJJIJI.getValue(this, LLJZ[3]);
    }

    public final void cancel() {
        this.LLJLLL.setValue(Boolean.FALSE);
        H5();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJI.getValue(this, LLJZ[1]);
    }

    public final InterfaceC1457600o2A k5() {
        return (InterfaceC1457600o2A) this.LLJJIJIIJIL.getValue(this, LLJZ[4]);
    }

    public final InterfaceC1460000o62 n5() {
        return (InterfaceC1460000o62) this.LLJJIJIL.getValue(this, LLJZ[5]);
    }

    public final void D5() {
        InterfaceC372160EiU interfaceC372160EiUX5 = x5();
        if (interfaceC372160EiUX5 != null) {
            interfaceC372160EiUX5.FS1(this.LLJJLIIIJLLLLLLLZ);
        }
    }

    public final void H4() {
        InterfaceC1453420nvQ interfaceC1453420nvQD5 = d5();
        if (interfaceC1453420nvQD5 != null) {
            interfaceC1453420nvQD5.MO0();
        }
        M5();
    }

    public final void d6() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        C348100Dkm c348100DkmLIZIZ2;
        NLEEditor nLEEditor2;
        NLETrackSlot nLETrackSlotLJL;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null) {
            return;
        }
        VecNLETrackSPtr tracks = model.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (NLETrackType.VIDEO == nLETrack.getTrackType()) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList<NLETrackSlot> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((NLETrackSlot) obj).getAIMatting() != null) {
                arrayList3.add(obj);
            }
        }
        for (NLETrackSlot nLETrackSlot : arrayList3) {
            NLETemplateModel nLETemplateModel = this.LLJLILLLLZIIL.LJIIJ;
            if (nLETemplateModel != null && (nLETrackSlotLJL = C351220Dpo.LJL(nLETemplateModel, nLETrackSlot.getUUID())) != null) {
                nLETrackSlot.setAIMatting(nLETrackSlotLJL.getAIMatting());
            }
        }
        InterfaceC1452170ntP value2 = JY0().g().getValue();
        if (value2 != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value2)) != null && (nLEEditor2 = c348100DkmLIZIZ2.LIZ) != null) {
            nLEEditor2.commit();
        }
        InterfaceC559500Lwy interfaceC559500LwyZ4 = Z4();
        if (interfaceC559500LwyZ4 != null) {
            interfaceC559500LwyZ4.Qk(false);
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this.LLJILJILJ);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.b8(v5());
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
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C559190LwT.onCreate():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        if (Intrinsics.LJFF(this.LLJLLIL.getValue(), Boolean.TRUE)) {
            this.LLJJJJJIL = true;
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEMediaRuntime mediaRuntimeApi;
        super.onResume();
        if (this.LLJJJJJIL && Intrinsics.LJFF(this.LLJLLIL.getValue(), Boolean.TRUE)) {
            InterfaceC1452170ntP value = JY0().g().getValue();
            if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null) {
                mediaRuntimeApi.setPreviewOffScreen(false);
            }
            C786410Ut5.LJLIIL(20L, new BPEAHandler(), new ARunnableS105S0100000_5(this, 79));
        } else if (this.LLJJJJJIL && Intrinsics.LJFF(this.LLJLLIL.getValue(), Boolean.FALSE)) {
            this.LLJJJJJIL = false;
            LJIILLIIL();
        }
        this.LLJJJJJIL = false;
    }

    public final void retry() {
        E5();
        J6(true);
        getEditModel().creativeModel.pugcTemplateData.isRetry = true;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(this.LLJILJILJ);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.AH(v5());
        }
    }

    public final void O4() {
        R5();
    }

    public final void P6() {
        N5();
    }

    public final C0FQS T4() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C559320Lwg> o2() {
        return this.LLJL;
    }

    public final boolean t5() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC379590EuT
    public LiveData<Boolean> vV0() {
        return this.LLJLLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21516919Ip> w2() {
        return this.LLJLIL;
    }

    private final void J6(boolean z) {
        C201955140j.LIZJ(C559380Lwm.LIZIZ, "TemplatePreProcessComponentV0 Template_Consume runMagicAndApplyMatting");
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C559210LwV(this, z, null), 3);
    }

    public final Object F4(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C201955140j.LIZJ(C559380Lwm.LIZIZ, "Template_Consume applyMatting");
        C0FQS c0fqs = this.LLJLILLLLZIIL;
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
            iTemplateService.LJIILL(this.LLJLILLLLZIIL, new AwS374S0200000_8(this, c2252611DEt, 137), new AwS587S0100000_8(c2252611DEt, 514), AFwS239S0000000_8.get$arr$(229));
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final void L6(C0FQS c0fqs) {
        this.LLJLILLLLZIIL = c0fqs;
    }

    public final void N6(boolean z) {
        this.LLJLL = z;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0Lwc] */
    public C559190LwT(C19A3 c19a3, C1DRG c1drg) {
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
        this.LLJJJIL = System.currentTimeMillis();
        this.LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 793));
        this.LLJJLIIIJLLLLLLLZ = new InterfaceC1462000o9G() { // from class: X.0Lwc
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
        this.LLJL = AFwS194S0000000_8.get$arr$(320);
        this.LLJLIL = new AwS552S0100000_8(this, 794);
        this.LLJLILLLLZIIL = new C0FQS();
        this.LLJLLIL = new MutableLiveData<>();
        this.LLJLLL = new MutableLiveData<>();
    }

    public final void S6(boolean z, int i) {
        if (z) {
            getEditModel().creativeModel.pugcTemplateData.magicProcessState = EnumC551570LkB.RETRY.getValue();
            this.LLJJJJ = i;
            getEditModel().creativeModel.pugcTemplateData.retryCount = i;
            S5();
        } else {
            getEditModel().creativeModel.pugcTemplateData.magicProcessState = EnumC551570LkB.FINISHED.getValue();
        }
        InterfaceC559500Lwy interfaceC559500LwyZ4 = Z4();
        if (interfaceC559500LwyZ4 != null) {
            interfaceC559500LwyZ4.Qk(false);
        }
    }

    public final Object m6(boolean z, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        VecNLETrackSPtr tracks;
        LiveData<Integer> liveDataWw;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        if (this.LLJLL) {
            InterfaceC1457600o2A interfaceC1457600o2AK5 = k5();
            if (interfaceC1457600o2AK5 != null) {
                interfaceC1457600o2AK5.In0(this, new AwS587S0100000_8(this, 515));
            }
            InterfaceC1460000o62 interfaceC1460000o62N5 = n5();
            if (interfaceC1460000o62N5 != null && (liveDataWw = interfaceC1460000o62N5.ww()) != null) {
                liveDataWw.observe(this, new AObserverS212S0100000_8(this, 73));
            }
            show();
            this.LLJJJIL = System.currentTimeMillis();
            this.LLJLLIL.setValue(true);
            if (z) {
                getEditModel().creativeModel.pugcTemplateData.magicProcessState = EnumC551570LkB.INIT.getValue();
                InterfaceC559500Lwy interfaceC559500LwyZ4 = Z4();
                if (interfaceC559500LwyZ4 != null) {
                    interfaceC559500LwyZ4.Qk(false);
                }
            }
            P4();
            if (this.LLJJJJLIIL) {
                U5();
            } else {
                NLEModel nLEModel = this.LLJLILLLLZIIL.LJIIJJI;
                if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
                    ArrayList<NLETrackSlot> arrayList = new ArrayList();
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(it2.next().getSlots(), arrayList);
                    }
                    for (NLETrackSlot nLETrackSlot : arrayList) {
                        if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null && !nLETrackSlot.getFeatureList().contains("UGC_ASYNC_I2V")) {
                            C354260Dui.LIZ.getClass();
                            NLEVideoEffect nLEVideoEffectLJFF = C354260Dui.LJFF(nLETrackSlot);
                            if (nLEVideoEffectLJFF != null) {
                                String extra = nLETrackSlot.getExtra("ep_magic_resource_id");
                                if (!z) {
                                    ((ArrayList) this.LLJLILLLLZIIL.LJIILLIIL).add(extra);
                                    nLETrackSlot.removeVideoEffect(nLEVideoEffectLJFF);
                                    this.LLJLILLLLZIIL.LJIL.add(new C381340ExI(nLETrackSlot, nLEVideoEffectLJFF));
                                }
                            }
                        }
                    }
                }
            }
            i3(new AwS587S0100000_8(this, 516));
            VEEditorAutoStartStopArbiter value = JY0().b10().getValue();
            if (value != null) {
                value.LIZIZ();
            }
            JY0().ww2().observe(this, new AObserverS170S0200000_5(c2252611DEt, this, 19));
        } else {
            this.LLJLLIL.setValue(false);
            hide();
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}

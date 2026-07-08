package X;

import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.audio.copyrightdetect.AudioCopyrightDetectAPI;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.services.IMusicEditService;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS128S1100000_14;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZiH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907110ZiH extends AbstractC2255721DQs<InterfaceC1453760nvy> implements InterfaceC1453760nvy, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1DRG LL;
    public final AbstractC856750XjF LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public InterfaceC1414530muh LLJI;
    public InterfaceC856150XiH LLJILLL;
    public boolean LLJJ;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public AbstractC856710XjB LLJJJ;
    public TuxPanel LLJJJJ;
    public Function0<Unit> LLJJJJJIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(326));
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1456450o0J.class, null);
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(325));
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), C21378018lO.class, null);
    public boolean LLJJI = true;
    public String LLJJJIL = "";

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C907110ZiH.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C907110ZiH.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C907110ZiH.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C907110ZiH.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C907110ZiH.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C907110ZiH.class, "editMusicControlApi", "getEditMusicControlApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C907110ZiH.class, "taskScheduler", "getTaskScheduler()Lcom/ss/android/ugc/aweme/creative/taskscheduler/scheduler/TaskScheduler;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    public InterfaceC1453760nvy Z1() {
        return this;
    }

    private final InterfaceC1418580n1E H2() {
        return (InterfaceC1418580n1E) this.LLIZ.getValue(this, LLJJJJLIIL[2]);
    }

    private final void K4() {
        if (this.LLJILLL == null) {
            return;
        }
        String creationId = i3().getCreationId();
        InterfaceC856150XiH interfaceC856150XiH = this.LLJILLL;
        if (interfaceC856150XiH == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        List list = (List) ((LinkedHashMap) C895680ZBu.LIZJ).get(creationId);
        if (list != null) {
            list.remove(interfaceC856150XiH);
        }
        this.LLJILLL = null;
    }

    private final InterfaceC1413540mt6 W2() {
        return (InterfaceC1413540mt6) this.LLIZLLLIL.getValue(this, LLJJJJLIIL[3]);
    }

    private final InterfaceC1456450o0J w2() {
        return (InterfaceC1456450o0J) this.LLJIJIL.getValue(this, LLJJJJLIIL[5]);
    }

    public final void F4() {
        AbstractC856710XjB abstractC856710XjB;
        AbstractC856710XjB abstractC856710XjB2;
        ArrayList<UnavailableReason> arrayList;
        PreCheckResult preCheckResult;
        PreCheckResultModel preCheckResultModel;
        this.LLJJJ = this.LLILLJJLI.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audioCopyrightDetectInEdit -> ditAudioCopyrightDetectComponent -> needShowUI = ");
        AbstractC856710XjB abstractC856710XjB3 = this.LLJJJ;
        sbLIZ.append(abstractC856710XjB3 != null && abstractC856710XjB3.LIZLLL(i3()));
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJJI || !this.LLJJIJI || this.LLJJIII || (abstractC856710XjB = this.LLJJJ) == null || !abstractC856710XjB.LIZLLL(i3()) || (abstractC856710XjB2 = this.LLJJJ) == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("EditAudioCopyrightDetectComponent -> showResultIfNeed -> controller.scene = ");
        sbLIZ2.append(abstractC856710XjB2.LIZ());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        PreCheckResult preCheckResult2 = abstractC856710XjB2.LIZ;
        if (preCheckResult2 == null || preCheckResult2.materialHash != this.LLJJIJIIJIL || (((arrayList = preCheckResult2.unavailableReasons) == null || arrayList.isEmpty()) && (preCheckResult = abstractC856710XjB2.LIZ) != null && preCheckResult.unavailableReasonsV1 == 0)) {
            abstractC856710XjB2.LIZ = null;
            return;
        }
        if (!C362370EIp.LIZ(abstractC856710XjB2.LIZ())) {
            abstractC856710XjB2.LJFF(((C19EG) C1664590tQ1.LJII(this)).getSupportFragmentManager(), C786410Ut5.L3(C1664590tQ1.LJII(this)), i3(), new AwS593S0100000_14(this, 178));
            abstractC856710XjB2.LIZ = null;
            HashMap<Integer, PreCheckResultModel> detectResults = i3().creativeModel.audioCopyrightDetectModel.getDetectResults();
            if (detectResults == null || (preCheckResultModel = detectResults.get(Integer.valueOf(abstractC856710XjB2.LIZ()))) == null) {
                return;
            }
            preCheckResultModel.hasShowResult = true;
            return;
        }
        if (this.LLJJIJIL != this.LLJJIJIIJIL && C0C1H.LIZ() != 1) {
            this.LLJJIJIL = this.LLJJIJIIJIL;
            C856790XjJ c856790XjJ = C856790XjJ.LIZ;
            String creationId = i3().getCreationId();
            String str = i3().mShootWay;
            if (str == null) {
                str = "";
            }
            String strLJIILL = C1428470nHB.LJIILL(i3());
            String strLJIILIIL = C1428470nHB.LJIILIIL(i3());
            int iLIZ = abstractC856710XjB2.LIZ();
            int videoLength = i3().getVideoLength();
            boolean zLIZIZ = C857680Xkk.LIZIZ(i3());
            c856790XjJ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("creation_id", creationId);
            c2344009Gk.LJIIIIZZ("shoot_way", str);
            c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
            c2344009Gk.LJIIIIZZ("content_type", strLJIILL);
            c2344009Gk.LJIIIIZZ("content_source", strLJIILIIL);
            c2344009Gk.LIZJ(videoLength, "creation_duration");
            C856790XjJ.LIZ(iLIZ, zLIZIZ ? 1 : 0, c2344009Gk);
            C20684815ws.LJIILLIIL("copyright_claim_show", c2344009Gk.LIZ);
        }
        InterfaceC1413540mt6 interfaceC1413540mt6W2 = W2();
        if (interfaceC1413540mt6W2 != null) {
            interfaceC1413540mt6W2.lz(null);
        }
    }

    public final InterfaceC1455860nzM G2() {
        return (InterfaceC1455860nzM) this.LLILZLL.getValue(this, LLJJJJLIIL[1]);
    }

    public final InterfaceC377540ErA T2() {
        return (InterfaceC377540ErA) this.LLJ.getValue(this, LLJJJJLIIL[4]);
    }

    public final AudioCopyrightDetectAPI X1() {
        return (AudioCopyrightDetectAPI) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC1453760nvy
    public void Yc1() {
        this.LLILLL.invoke();
    }

    public final VideoPublishEditModel i3() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJJJJLIIL[0]);
    }

    public final C21378018lO m3() {
        return (C21378018lO) this.LLJILJILJ.getValue(this, LLJJJJLIIL[6]);
    }

    public final IMusicEditService o2() {
        return (IMusicEditService) this.LLILZ.getValue();
    }

    public final void z4() {
        if (this.LLJILLL != null) {
            return;
        }
        this.LLJILLL = new InterfaceC856150XiH() { // from class: X.0Xhz
            @Override // X.InterfaceC856150XiH
            public final void LIZ(int i, Map map, int i2, int i3) {
                if (i == 1) {
                    C01TT.LIZLLL(new AwS558S0100000_14(this.LIZ, 1173));
                } else if (i == 3) {
                    return;
                }
                if (i2 != 102) {
                    if (i2 == 103) {
                        this.LIZ.i3().creativeModel.audioCopyrightDetectModel.setDetectDuration(System.currentTimeMillis() - this.LIZ.i3().creativeModel.audioCopyrightDetectModel.getDetectStart());
                        C01TT.LIZLLL(new C855960Xhy(this.LIZ, map, i3));
                    }
                } else {
                    C01TT.LIZLLL(new AwS558S0100000_14(this.LIZ, 1175));
                }
                if ((i != 1 && i != 2) || !((Boolean) C258830ACj.LIZ.getValue()).booleanValue()) {
                    return;
                }
                C907110ZiH c907110ZiH = this.LIZ;
                c907110ZiH.W1(c907110ZiH.i3());
            }
        };
        String creationId = i3().getCreationId();
        InterfaceC856150XiH interfaceC856150XiH = this.LLJILLL;
        if (interfaceC856150XiH != null) {
            C895680ZBu.LJ(creationId, interfaceC856150XiH);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private final boolean E3() {
        int iC3 = c3();
        if (iC3 == this.LLJJIJIIJIL) {
            return false;
        }
        this.LLJJIJIIJIL = iC3;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H3() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r6.i3()
            X.0nzM r0 = r6.G2()
            androidx.lifecycle.LiveData r0 = r0.g()
            java.lang.Object r1 = r0.getValue()
            X.0ntP r1 = (X.InterfaceC1452170ntP) r1
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r2.getEditorProModel()
            boolean r0 = r0.getHasAudioInAdvanceEdit()
            r5 = 0
            if (r0 != 0) goto L48
            boolean r0 = r2.getFromCut()
            if (r0 != 0) goto L29
            boolean r0 = r2.getFromMultiCut()
            if (r0 == 0) goto L48
        L29:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.i3()
            float r1 = r0.getVoiceVolume()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L47
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.i3()
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r0.getVeAudioRecorderParam()
            if (r0 == 0) goto L46
            boolean r0 = r0.getNeedOriginalSound()
            if (r0 == 0) goto L47
        L46:
            r5 = 1
        L47:
            return r5
        L48:
            if (r1 == 0) goto La5
            X.0Dkm r0 = X.C352130DrH.LIZIZ(r1)
            if (r0 == 0) goto Lbb
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r0.LIZ
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r0.getModel()
            if (r0 == 0) goto La5
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r0.getMainTrack()
            if (r0 == 0) goto La5
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r1 = r0.getSlots()
            if (r1 == 0) goto La5
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La5
            java.util.Iterator r4 = r1.iterator()
        L6e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r3 = r4.next()
            com.bytedance.ies.nle.editor_jni.NLENode r3 = (com.bytedance.ies.nle.editor_jni.NLENode) r3
            java.lang.String r2 = "slot_extra_source_type"
            java.lang.String r1 = r3.getExtra(r2)
            X.0Dxk r0 = X.EnumC356140Dxk.UploadFromEditorPro
            int r0 = r0.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L29
            java.lang.String r1 = r3.getExtra(r2)
            X.0Dxk r0 = X.EnumC356140Dxk.UploadFromRecordPage
            int r0 = r0.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6e
            goto L29
        La5:
            X.0XjF r0 = r6.LLILLJJLI
            X.0XjB r0 = r0.LIZJ()
            if (r0 == 0) goto Lb9
            int r0 = r0.LIZ()
        Lb1:
            boolean r0 = X.C362370EIp.LIZ(r0)
            if (r0 == 0) goto L47
            goto L29
        Lb9:
            r0 = -1
            goto Lb1
        Lbb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907110ZiH.H3():boolean");
    }

    public final void H4() {
        if (E3()) {
            i3().creativeModel.audioCopyrightDetectModel.setDetectResults(null);
            C895680ZBu c895680ZBu = C895680ZBu.LIZ;
            VideoPublishEditModel videoPublishEditModelI3 = i3();
            int iC3 = c3();
            AbstractC856750XjF abstractC856750XjF = this.LLILLJJLI;
            abstractC856750XjF.getClass();
            ArrayList arrayList = new ArrayList();
            for (AbstractC856710XjB abstractC856710XjB : abstractC856750XjF.LJ()) {
                if (abstractC856710XjB.LIZIZ(abstractC856750XjF.LJFF())) {
                    arrayList.add(Integer.valueOf(abstractC856710XjB.LIZ()));
                }
            }
            InterfaceC895730ZBz interfaceC895730ZBz = new InterfaceC895730ZBz() { // from class: X.0DrR
                @Override // X.InterfaceC895730ZBz
                public final String LIZ() {
                    int fileAudio;
                    NLEResourceNode resource;
                    NLETrack mainTrack;
                    NLEModel nLEModelLIZ;
                    try {
                        InterfaceC1452170ntP value = this.LIZ.G2().g().getValue();
                        NLEModel nLEModelDynamicCast = (value == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null) ? null : NLEModel.dynamicCast(nLEModelLIZ.deepClone());
                        if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_audio_copyright_duration_optimize", true) == 1) && this.LIZ.v3(nLEModelDynamicCast)) {
                            InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
                            CreativeInfo creativeInfo = this.LIZ.i3().getCreativeInfo();
                            EnumC20228014Cw enumC20228014Cw = EnumC20228014Cw.AUDIO_COPYRIGHT_DETECT;
                            String strLIZIZ = C2298208zU.LIZIZ(pathService, creativeInfo, enumC20228014Cw, null, 12);
                            ArrayList arrayList2 = new ArrayList();
                            VecNLETrackSlotSPtr slots = (nLEModelDynamicCast == null || (mainTrack = nLEModelDynamicCast.getMainTrack()) == null) ? null : mainTrack.getSlots();
                            if (slots != null && (!slots.isEmpty())) {
                                NLESegment mainSegment = slots.get(0).getMainSegment();
                                String resourceFile = (mainSegment == null || (resource = mainSegment.getResource()) == null) ? null : resource.getResourceFile();
                                if (resourceFile != null) {
                                    if (((Boolean) C277100AtY.LIZ.getValue()).booleanValue()) {
                                        String strLJIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIJ(this.LIZ.i3().getCreativeInfo(), enumC20228014Cw, "audio_temp.wav", true);
                                        VEUtils.detachAudioFromVideos(strLJIJ, new String[]{resourceFile}, new long[]{-1}, new long[]{-1}, -1L, -1L, new float[]{1.0f}, 1, 128000, 8000);
                                        arrayList2.add(strLJIJ);
                                        fileAudio = 0;
                                    } else {
                                        fileAudio = VEUtils.getFileAudio(resourceFile, strLIZIZ, arrayList2);
                                    }
                                    if (fileAudio == 0 && (!arrayList2.isEmpty())) {
                                        return (String) arrayList2.get(0);
                                    }
                                }
                            }
                        }
                        if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_audio_copyright_duration_optimize_2", true) == 1) && this.LIZ.e4(nLEModelDynamicCast)) {
                            String str = (String) C23250099c.LJ(C23271099x.INSTANCE, new C352080DrC(this.LIZ, nLEModelDynamicCast, null));
                            if (str.length() > 0) {
                                return str;
                            }
                        }
                        AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(110);
                        String strLJIJ2 = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIJ(this.LIZ.i3().getCreativeInfo(), EnumC20228014Cw.AUDIO_COPYRIGHT_DETECT, "originalAudio.wav", true);
                        if (nLEModelDynamicCast != null) {
                            return C0E38.LIZ(strLJIJ2, nLEModelDynamicCast, null, aFwS234S0000000_5, 1, 131072, 16000, null, null, false, false, 1920) == NLEError.SUCCESS ? strLJIJ2 : "";
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return "";
                    }
                }
            };
            c895680ZBu.getClass();
            C895680ZBu.LJFF(videoPublishEditModelI3, iC3, arrayList, interfaceC895730ZBz);
        }
    }

    public final boolean Q3() {
        return !C1664590tQ1.LJII(this).isFinishing() && this.LLJJ && H3();
    }

    @Override // X.InterfaceC1453760nvy
    public void a31() {
        if (Q3()) {
            if (this.LLJILLL == null) {
                z4();
            }
            H4();
            return;
        }
        i3().creativeModel.audioCopyrightDetectModel.setDetectResults(null);
        this.LLJJIJIIJIL = c3();
        C895680ZBu c895680ZBu = C895680ZBu.LIZ;
        String creationId = i3().getCreationId();
        int i = this.LLJJIJIIJIL;
        c895680ZBu.getClass();
        C895680ZBu.LIZIZ(i, creationId);
    }

    public final int c3() {
        if (!i3().isCurrentAutoCutMode()) {
            return C570830Ma9.LJI(i3(), null);
        }
        VideoPublishEditModel videoPublishEditModelI3 = i3();
        InterfaceC1452170ntP value = G2().g().getValue();
        return C570830Ma9.LJI(videoPublishEditModelI3, value != null ? C352130DrH.LIZ(value) : null);
    }

    @Override // X.InterfaceC1453760nvy
    public boolean d20() {
        return C362370EIp.LIZIZ(i3()) && C362370EIp.LIZJ(i3()) && C290480Ba2.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
    @Override // X.AbstractC2255721DQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907110ZiH.onCreate():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        Future<?> future;
        super.onDestroy();
        C895680ZBu.LIZ.getClass();
        C895680ZBu.LJ = false;
        C895680ZBu.LJFF = false;
        C895680ZBu.LJI = false;
        C895680ZBu.LJII = false;
        C895680ZBu.LJIIL = null;
        K4();
        String creationId = i3().getCreationId();
        C895680ZBu.LIZ();
        Map<String, RunnableC895670ZBt> map = C895680ZBu.LIZIZ;
        RunnableC895670ZBt runnableC895670ZBt = (RunnableC895670ZBt) ((LinkedHashMap) map).get(creationId);
        if (runnableC895670ZBt != null && (future = runnableC895670ZBt.LLILZLL) != null) {
            future.cancel(true);
        }
        map.remove(creationId);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        this.LLJJIJI = false;
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.LLJJIJI = true;
        C895680ZBu c895680ZBu = C895680ZBu.LIZ;
        String creationId = i3().getCreationId();
        int iC3 = c3();
        c895680ZBu.getClass();
        C895680ZBu.LIZIZ(iC3, creationId);
        o4(null);
        this.LLILLJJLI.LIZ();
        F4();
        if (i3().creativeModel.audioCopyrightDetectModel.getChangeMusicImmediately()) {
            i3().creativeModel.audioCopyrightDetectModel.setChangeMusicImmediately(false);
            q3();
        } else if (i3().creativeModel.audioCopyrightDetectModel.getEditorProImmediately()) {
            i3().creativeModel.audioCopyrightDetectModel.setEditorProImmediately(false);
            this.LLILLL.invoke();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        z4();
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        InterfaceC377540ErA interfaceC377540ErAT2 = T2();
        if (interfaceC377540ErAT2 == null || !interfaceC377540ErAT2.isShowing()) {
            K4();
        }
    }

    public final void q3() {
        InterfaceC1413540mt6 interfaceC1413540mt6W2;
        i3().creativeModel.audioCopyrightDetectModel.setGoMusicPage(true);
        w2().pd1(false, false, true);
        AbstractC856710XjB abstractC856710XjB = this.LLJJJ;
        boolean zLIZ = C362370EIp.LIZ(abstractC856710XjB != null ? abstractC856710XjB.LIZ() : -1);
        O3(!zLIZ);
        if (zLIZ && (interfaceC1413540mt6W2 = W2()) != null) {
            interfaceC1413540mt6W2.lz(null);
        }
        if (C0MT6.LIZ()) {
            return;
        }
        i3().setVoiceVolume(0.0f);
    }

    @Override // X.InterfaceC1453760nvy
    public void tB() {
        i3().creativeModel.audioCopyrightDetectModel.setGoMusicPage(true);
        O3(!C362370EIp.LIZ(this.LLJJJ != null ? r0.LIZ() : -1));
    }

    @Override // X.InterfaceC1453760nvy
    public void JO() {
        q3();
    }

    @Override // X.InterfaceC1453760nvy
    public AbstractC856750XjF LP2() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final void B3(InterfaceC859350XnR interfaceC859350XnR) {
        if (C856830XjN.LIZJ.LIZ("show_authorize", false)) {
            C856820XjM c856820XjM = C856820XjM.LIZ;
            AbstractC856710XjB abstractC856710XjB = this.LLJJJ;
            VideoPublishEditModel videoPublishEditModelI3 = i3();
            c856820XjM.getClass();
            C856820XjM.LIZ(abstractC856710XjB, videoPublishEditModelI3, 3);
            return;
        }
        C856820XjM c856820XjM2 = C856820XjM.LIZ;
        AbstractC856710XjB abstractC856710XjB2 = this.LLJJJ;
        VideoPublishEditModel videoPublishEditModelI32 = i3();
        c856820XjM2.getClass();
        C856820XjM.LIZ(abstractC856710XjB2, videoPublishEditModelI32, 0);
        i3();
        interfaceC859350XnR.LIZ(new AwS593S0100000_14(this, 169));
    }

    public final void O3(boolean z) {
        InterfaceC1418580n1E interfaceC1418580n1EH2 = H2();
        if (interfaceC1418580n1EH2 != null) {
            interfaceC1418580n1EH2.Hr1(false, false, true);
        }
        AudioRecorderParam veAudioRecorderParam = i3().getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            veAudioRecorderParam.setNeedOriginalSound(false);
            veAudioRecorderParam.setMuteByAudioCopyright(z);
        } else {
            VideoPublishEditModel videoPublishEditModelI3 = i3();
            AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
            audioRecorderParam.setNeedOriginalSound(false);
            audioRecorderParam.setVoiceVolume(i3().getVoiceVolume());
            audioRecorderParam.setHasOriginalSound(i3().hasOriginalSound(false));
            audioRecorderParam.setMuteByAudioCopyright(z);
            videoPublishEditModelI3.setVeAudioRecorderParam(audioRecorderParam);
        }
        this.LLJJIJIIJIL = c3();
    }

    public final void W1(VideoPublishEditModel videoPublishEditModel) {
        C2354709Kn.LJIJJ(C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228014Cw.AUDIO_COPYRIGHT_DETECT, null, 12));
    }

    public final boolean e4(NLEModel nLEModel) {
        if (nLEModel == null) {
            return false;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (!nLETrack2.getMainTrack() && ((C347830DkL.LIZ(nLETrack2) == NLETrackType.AUDIO && !Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "BGM")) || C347830DkL.LIZ(nLETrack2) == NLETrackType.VIDEO)) {
                arrayList.add(nLETrack);
            }
        }
        if (arrayList.size() != 0) {
            return false;
        }
        return true;
    }

    public final void o4(Function0<Unit> function0) {
        if (m3() != null) {
            C21378018lO c21378018lOM3 = m3();
            if (c21378018lOM3 != null) {
                c21378018lOM3.UM2(new C345250DgB("AudioCopyrightDetectTask", new AwS549S0100000_5(this, 156), new AwS371S0200000_5(this, (C907110ZiH) function0, (Function0<Unit>) 23)));
                return;
            }
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C353180Dsy(this, function0, null), 2);
    }

    public final boolean v3(NLEModel nLEModel) {
        if (nLEModel == null || nLEModel.getMainTrack() == null || nLEModel.getMainTrack().getSlots().size() != 1 || !C346680DiU.LIZIZ(nLEModel.getMainTrack().getSlots().get(0))) {
            return false;
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLEModel.getMainTrack().getSlots().get(0).getMainSegment());
        if (!e4(nLEModel) || nLESegmentVideoDynamicCast == null) {
            return false;
        }
        C352190DrN.LIZ.getClass();
        if (!C352190DrN.LIZJ(nLESegmentVideoDynamicCast)) {
            return false;
        }
        return true;
    }

    public C907110ZiH(C1DRG c1drg, AbstractC856750XjF abstractC856750XjF, Function0<Unit> function0) {
        this.LL = c1drg;
        this.LLILLJJLI = abstractC856750XjF;
        this.LLILLL = function0;
    }

    @Override // X.InterfaceC1453760nvy
    public boolean KB2(String str, String str2, boolean z, Integer num, Function0<Unit> function0) {
        int iLIZ;
        PreCheckResultModel preCheckResultModel;
        if (C362370EIp.LIZIZ(i3()) && z) {
            AbstractC856710XjB abstractC856710XjBLIZJ = this.LLILLJJLI.LIZJ();
            if (abstractC856710XjBLIZJ != null) {
                iLIZ = abstractC856710XjBLIZJ.LIZ();
            } else {
                iLIZ = -1;
            }
            if (C362380EIq.LIZ() && iLIZ == C0FPS.ECOMMERCE.getScene()) {
                return false;
            }
            HashMap<Integer, PreCheckResultModel> detectResults = i3().creativeModel.audioCopyrightDetectModel.getDetectResults();
            if (detectResults != null) {
                preCheckResultModel = detectResults.get(Integer.valueOf(iLIZ));
            } else {
                preCheckResultModel = null;
            }
            PreCheckResult preCheckResultLIZ = C855940Xhw.LIZ(preCheckResultModel);
            if (preCheckResultLIZ != null) {
                this.LLJJJJJIL = function0;
                IMusicEditService iMusicEditServiceO2 = o2();
                if (iMusicEditServiceO2 != null) {
                    this.LLJJJJ = iMusicEditServiceO2.LJIILJJIL(((C19EG) C1664590tQ1.LJII(this)).getSupportFragmentManager(), C1664590tQ1.LJII(this), preCheckResultLIZ, i3(), str, str2, iLIZ, num, new AwS128S1100000_14(this, str, 8));
                    return true;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return false;
    }
}

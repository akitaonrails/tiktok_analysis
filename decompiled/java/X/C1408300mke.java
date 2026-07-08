package X;

import Y.AObjectS245S0100000_22;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.experiment.CompileReuseEditPageMixAudioFileExp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;

/* JADX INFO: renamed from: X.0mke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408300mke extends AbstractC2255721DQs<InterfaceC1408320mkg> implements InterfaceC1408320mkg, InterfaceC379610EuV {
    public static final C1408310mkf LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public boolean LLIZLLLIL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1456910o13.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), C0E53.class, null);
    public final InterfaceC1408320mkg LLJI = this;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0mkf] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1408300mke.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1408300mke.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new C2217381BqS(C1408300mke.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0), new C2217381BqS(C1408300mke.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0), new C2217381BqS(C1408300mke.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0), new C2217381BqS(C1408300mke.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C1408300mke.class, "voiceBeautyApi", "getVoiceBeautyApi()Lcom/ss/android/ugc/gamora/editor/voicebeauty/IEditAudioVoiceBeautyComponent;", 0)};
        LLJIJIL = new Object() { // from class: X.0mkf
        };
        LLJILJILJ = 8;
    }

    private final void q3() {
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("creation_id", getEditModel().getCreationId());
        String str = getEditModel().mShootWay;
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("shoot_way", str);
        String enterFrom = getEditModel().getEnterFrom();
        pairArr[2] = new Pair("enter_from", enterFrom != null ? enterFrom : "");
        pairArr[3] = new Pair("content_source", C1428470nHB.LJIILIIL(getEditModel()));
        pairArr[4] = new Pair("is_success", "1");
        C20684815ws.LJIILLIIL("studio_edit_audio_mix_file", C2097608Jq.LJIIJ(pairArr));
    }

    public final void v3() {
        LiveEvent<Boolean> liveEventVm2;
        LiveEvent<Boolean> liveEventOq2;
        LiveEvent<Pair<Integer, Integer>> liveEventKt2;
        LiveEvent<Integer> liveEventVV;
        List<? extends InterfaceC2217241BqE<C1408460mku, Boolean>> listLJIIJJI = C1697810uHb.LJIIJJI(new C2217381BqS() { // from class: X.0mkh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1408460mku) obj).LIZ);
            }
        }, new C2217381BqS() { // from class: X.0mki
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1408460mku) obj).LIZLLL);
            }
        }, new C2217381BqS() { // from class: X.0mkj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1408460mku) obj).LJFF);
            }
        }, new C2217381BqS() { // from class: X.0mkk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1408460mku) obj).LJII);
            }
        });
        C1451630nsX c1451630nsXH2 = H2();
        if (c1451630nsXH2 != null) {
            c1451630nsXH2.LIZ(listLJIIJJI, this, new AObjectS245S0100000_22(this, 177));
        }
        InterfaceC1453200nv4 interfaceC1453200nv4W2 = w2();
        if (interfaceC1453200nv4W2 != null && (liveEventVV = interfaceC1453200nv4W2.vV()) != null) {
            liveEventVV.LIZ(this, new AObjectS245S0100000_22(this, 178));
        }
        InterfaceC1418580n1E interfaceC1418580n1EW2 = W2();
        if (interfaceC1418580n1EW2 != null && (liveEventKt2 = interfaceC1418580n1EW2.Kt2()) != null) {
            liveEventKt2.LIZ(this, new AObjectS245S0100000_22(this, 179));
        }
        InterfaceC1418580n1E interfaceC1418580n1EW22 = W2();
        if (interfaceC1418580n1EW22 != null && (liveEventOq2 = interfaceC1418580n1EW22.oq2()) != null) {
            liveEventOq2.LIZ(this, new AObjectS245S0100000_22(this, 180));
        }
        InterfaceC1418580n1E interfaceC1418580n1EW23 = W2();
        if (interfaceC1418580n1EW23 == null || (liveEventVm2 = interfaceC1418580n1EW23.vm2()) == null) {
            return;
        }
        liveEventVm2.LIZ(this, new AObjectS245S0100000_22(this, 181));
    }

    private final C1451630nsX H2() {
        return (C1451630nsX) this.LLILZLL.getValue(this, LLJILJIL[4]);
    }

    private final InterfaceC1456910o13 T2() {
        return (InterfaceC1456910o13) this.LLILZIL.getValue(this, LLJILJIL[3]);
    }

    private final C0E53 c3() {
        return (C0E53) this.LLJ.getValue(this, LLJILJIL[6]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLJILJIL[0]);
    }

    private final InterfaceC1453200nv4 w2() {
        return (InterfaceC1453200nv4) this.LLILLL.getValue(this, LLJILJIL[1]);
    }

    public final InterfaceC1455860nzM G2() {
        return (InterfaceC1455860nzM) this.LLIZ.getValue(this, LLJILJIL[5]);
    }

    public final InterfaceC1418580n1E W2() {
        return (InterfaceC1418580n1E) this.LLILZ.getValue(this, LLJILJIL[2]);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void registerObservers() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.getEditModel()
            boolean r0 = X.C1428470nHB.LJJZZI(r0)
            if (r0 != 0) goto L21
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r4.getEditModel()
            boolean r0 = r1.isRecordMode()
            r2 = 1
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r1.creativeModel
            com.ss.android.ugc.aweme.creative.model.CommonMobParamModel r1 = r0.commonMobModel
            int r0 = r1.originVideoCount
            if (r0 <= r2) goto L27
            int r0 = r1.originPhotoCount
            if (r0 != 0) goto L27
        L21:
            java.lang.String r0 = "PublishAudioMixReuseComponent: no support type."
            X.C0M7M.LIZJ(r0)
            return
        L27:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r4.getEditModel()
            boolean r0 = r1.isUploadVideo()
            if (r0 == 0) goto L3e
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r1.creativeModel
            com.ss.android.ugc.aweme.creative.model.CommonMobParamModel r1 = r0.commonMobModel
            int r0 = r1.originVideoCount
            if (r0 <= r2) goto L3e
            int r0 = r1.originPhotoCount
            if (r0 != 0) goto L3e
            goto L21
        L3e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.getEditModel()
            boolean r0 = r0.isDuet()
            if (r0 != 0) goto L21
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.getEditModel()
            boolean r0 = r0.isStitchMode()
            if (r0 != 0) goto L21
            X.1DRG r2 = r4.getDiContainer()
            boolean r0 = X.C343070Dcf.LIZ()
            r1 = 0
            if (r0 == 0) goto L72
            java.lang.Class<X.0ETY> r0 = X.C0ETY.class
            java.lang.Object r3 = r2.LJII(r0, r1)
            X.0ETY r3 = (X.C0ETY) r3
            java.lang.Class<X.0oA6> r2 = X.C1462520oA6.class
            kotlin.jvm.internal.AwS601S0100000_22 r1 = new kotlin.jvm.internal.AwS601S0100000_22
            r0 = 457(0x1c9, float:6.4E-43)
            r1.<init>(r4, r0)
            r3.Sd(r2, r1)
        L71:
            return
        L72:
            java.lang.Class<X.0oA6> r0 = X.C1462520oA6.class
            java.lang.Object r0 = r2.LJIIL(r1, r0)
            X.05YF r0 = (X.C05YF) r0
            if (r0 == 0) goto L71
            X.0oA6 r0 = (X.C1462520oA6) r0
            androidx.lifecycle.LiveData r2 = r0.nW0()
            Y.AObserverS225S0100000_22 r1 = new Y.AObserverS225S0100000_22
            r0 = 109(0x6d, float:1.53E-43)
            r1.<init>(r4, r0)
            r2.observe(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1408300mke.registerObservers():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        CompileReuseEditPageMixAudioFileExp.LIZ.getClass();
        if (CompileReuseEditPageMixAudioFileExp.LIZ().enable && ((Boolean) C284490BDb.LIZ.getValue()).booleanValue()) {
            registerObservers();
        } else {
            W1(EnumC1407490mjL.EXP_CLOSE);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        W1(EnumC1407490mjL.EDIT_ON_DESTROY);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public InterfaceC1408320mkg o2() {
        return this.LLJI;
    }

    public C1408300mke(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void i3(EnumC1407490mjL enumC1407490mjL) {
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("delete_type", enumC1407490mjL.getValue());
        pairArr[1] = new Pair("creation_id", getEditModel().getCreationId());
        String str = getEditModel().mShootWay;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[2] = new Pair("shoot_way", str);
        String enterFrom = getEditModel().getEnterFrom();
        if (enterFrom != null) {
            str2 = enterFrom;
        }
        pairArr[3] = new Pair("enter_from", str2);
        pairArr[4] = new Pair("content_source", C1428470nHB.LJIILIIL(getEditModel()));
        C20684815ws.LJIILLIIL("studio_edit_audio_mix_file_delete", C2097608Jq.LJIIJ(pairArr));
    }

    private final void m3(C1408410mkp<String> c1408410mkp) {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("creation_id", getEditModel().getCreationId());
        String str = getEditModel().mShootWay;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("shoot_way", str);
        String enterFrom = getEditModel().getEnterFrom();
        if (enterFrom != null) {
            str2 = enterFrom;
        }
        pairArr[2] = new Pair("enter_from", str2);
        pairArr[3] = new Pair("content_source", C1428470nHB.LJIILIIL(getEditModel()));
        pairArr[4] = new Pair("error_msg", c1408410mkp.LIZIZ);
        pairArr[5] = new Pair("is_success", CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("studio_edit_audio_mix_file", C2097608Jq.LJIIJ(pairArr));
    }

    public final void B3(NLEModel nLEModel) {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        if (C286430BKn.LIZ() && (mainTrack = nLEModel.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : slots) {
                C0E53 c0e53C3 = c3();
                if (c0e53C3 != null) {
                    c0e53C3.Tq0(nLETrackSlot, NLEEditorJniJNI.NLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER());
                }
            }
        }
    }

    public final void W1(EnumC1407490mjL enumC1407490mjL) {
        if (getEditModel().creativeModel.publishModel.editMixAudioFilePath != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PublishAudioMixReuseComponent: removeAndDeleteMixAudioFile, clearType: ");
            sbLIZ.append(enumC1407490mjL.getValue());
            C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            i3(enumC1407490mjL);
            String str = getEditModel().creativeModel.publishModel.editMixAudioFilePath;
            getEditModel().creativeModel.publishModel.editMixAudioFilePath = null;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1407470mjJ(str, null), 2);
        }
    }

    public final boolean Z1(NLEModel nLEModel, Pair<String, Boolean> pair) {
        C1408410mkp<String> c1408410mkp;
        String first = pair.getFirst();
        if (!pair.getSecond().booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PublishAudioMixReuseComponent: musicId:");
            sbLIZ.append(first);
            sbLIZ.append(" has no copyright, return");
            C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PublishAudioMixReuseComponent: afterCheckMusicCopyRight, trigger mix audio, musicId: ");
        sbLIZ2.append(first);
        C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        CompileReuseEditPageMixAudioFileExp.LIZ.getClass();
        try {
            c1408410mkp = X1(getEditModel(), CompileReuseEditPageMixAudioFileExp.LIZ().sampleRate, CompileReuseEditPageMixAudioFileExp.LIZ().bitRate, CompileReuseEditPageMixAudioFileExp.LIZ().channelCount, nLEModel, first);
        } catch (NoSuchElementException e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            c1408410mkp = new C1408410mkp<>(1, message, null, 4);
        }
        if (c1408410mkp.LIZ()) {
            C0M7M.LIZJ("PublishAudioMixReuseComponent: extractAudio failed, msg: " + c1408410mkp.LIZIZ);
            m3(c1408410mkp);
            getEditModel().creativeModel.publishModel.editMixAudioFilePath = null;
        } else {
            C0M7M.LIZJ("PublishAudioMixReuseComponent: extractAudio success, path: " + c1408410mkp.LIZJ);
            q3();
            getEditModel().creativeModel.publishModel.editMixAudioFilePath = c1408410mkp.LIZJ;
        }
        return C123100dR.LIZ(getEditModel().creativeModel.publishModel.editMixAudioFilePath);
    }

    private final C1408410mkp<String> X1(VideoPublishEditModel videoPublishEditModel, int i, int i2, int i3, NLEModel nLEModel, String str) {
        Pair pair;
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        CreativeInfo creativeInfo = videoPublishEditModel.getCreativeInfo();
        EnumC20228014Cw enumC20228014Cw = EnumC20228014Cw.EDIT_MIX_AUDIO;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mix_audio_file_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".aac");
        String strLIZIZ = C2298208zU.LIZIZ(pathService, creativeInfo, enumC20228014Cw, C2188811AlT.LIZIZ(sbLIZ), 8);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PublishAudioMixReuseComponent: extractAudio, sampleRate: ");
        sbLIZ2.append(i);
        sbLIZ2.append(", bitRate: ");
        sbLIZ2.append(i2);
        sbLIZ2.append(", channelCount: ");
        sbLIZ2.append(i3);
        C0M7M.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(117);
        AFwS234S0000000_5 aFwS234S0000000_52 = AFwS234S0000000_5.get$arr$(118);
        C013C c013c = new C013C();
        c013c.element = true;
        AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(nLEModel, c013c, 31);
        if (nLEModel != null) {
            NLEError nLEErrorLIZ = C0E38.LIZ(strLIZIZ, nLEModel, null, aFwS234S0000000_5, i3, i2, i, aFwS234S0000000_52, awS371S0200000_5, true, false, 1024);
            if (!c013c.element) {
                return new C1408410mkp<>(1, "music has no copyright", strLIZIZ);
            }
            if (nLEErrorLIZ == NLEError.SUCCESS) {
                pair = new Pair(0, "");
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("nle error ");
                sbLIZ3.append(nLEErrorLIZ.name());
                pair = new Pair(1, C2188811AlT.LIZIZ(sbLIZ3));
            }
            return new C1408410mkp<>(((Number) pair.getFirst()).intValue(), (String) pair.getSecond(), strLIZIZ);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}

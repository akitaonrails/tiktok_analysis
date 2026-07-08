package X;

import Y.AObjectS245S0100000_22;
import Y.AObjectS305S0200000_22;
import Y.AObserverS225S0100000_22;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.feed.model.TtsReuseModel;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.TtsReuseServiceImpl;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465420oEm extends AbstractC2255721DQs<InterfaceC1454710nxV> implements InterfaceC1454710nxV, InterfaceC379610EuV {
    public static final C1465450oEp LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC376040Eok.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
    public String LLIZ;
    public InterfaceC1452170ntP LLIZLLLIL;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0oEp] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1465420oEm.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1465420oEm.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C1465420oEm.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C1465420oEm.class, "editDraftApi", "getEditDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditDraftApi;", 0), new C2217381BqS(C1465420oEm.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0)};
        LLJ = new Object() { // from class: X.0oEp
        };
        LLJIJIL = 8;
    }

    public InterfaceC1454710nxV X1() {
        return this;
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILLL.getValue(this, LLJI[1]);
    }

    private final InterfaceC1453200nv4 w2() {
        return (InterfaceC1453200nv4) this.LLILZLL.getValue(this, LLJI[4]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLJI[0]);
    }

    public final void T2() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        InterfaceC1453200nv4 interfaceC1453200nv4W2;
        LiveEvent<AVMusic> liveEventB7;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLIZLLLIL;
        if (interfaceC1452170ntP == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (interfaceC1453200nv4W2 = w2()) == null || (liveEventB7 = interfaceC1453200nv4W2.b7()) == null) {
            return;
        }
        liveEventB7.LIZ(this, new AObjectS305S0200000_22(this, nLEEditor, 11));
    }

    public final InterfaceC1455850nzL Z1() {
        return (InterfaceC1455850nzL) this.LLILZ.getValue(this, LLJI[2]);
    }

    public final InterfaceC376040Eok o2() {
        return (InterfaceC376040Eok) this.LLILZIL.getValue(this, LLJI[3]);
    }

    @Override // X.InterfaceC1454710nxV
    public void rP1() {
        NLEEditor nLEEditor;
        InfoStickerModel infoStickerModel;
        VecNLETrackSPtr tracks;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null) {
            return;
        }
        this.LLIZLLLIL = value;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
        if (c348100DkmLIZIZ == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null) {
            return;
        }
        NLEModel model = nLEEditor.getModel();
        if (model != null && (tracks = model.getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                NLETrack next = it2.next();
                if (Intrinsics.LJFF(C348350DlB.LIZ(next), "TEXT_SPEAK")) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        List<TtsReuseModel> list = LJJJLIIL().creativeModel.ttsVoiceInfo.ttsReuseParams;
        int size = list != null ? list.size() : 0;
        if (LJJJLIIL().getInfoStickerModel() == null) {
            LJJJLIIL().setInfoStickerModel(new InfoStickerModel());
        }
        InfoStickerModel infoStickerModel2 = LJJJLIIL().getInfoStickerModel();
        if ((infoStickerModel2 == null || infoStickerModel2.stickers == null) && (infoStickerModel = LJJJLIIL().getInfoStickerModel()) != null) {
            infoStickerModel.stickers = new ArrayList();
        }
        List<TtsReuseModel> list2 = LJJJLIIL().creativeModel.ttsVoiceInfo.ttsReuseParams;
        if (list2 != null) {
            int i = 0;
            for (TtsReuseModel ttsReuseModel : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                TtsReuseModel ttsReuseModel2 = ttsReuseModel;
                StickerItemModel stickerItemModel = new StickerItemModel();
                stickerItemModel.type = 2;
                stickerItemModel.layerWeight = ttsReuseModel2.layer;
                if (ttsReuseModel2.startTime <= nLEEditor.getModel().getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                    TextStickerData textStickerDataW1 = W1(ttsReuseModel2);
                    C0F7U.LJIIJ(C1664590tQ1.LJIIIZ(this), JY0(), "tts_reuse", textStickerDataW1, new C1462350o9p(this, stickerItemModel, textStickerDataW1, i, size));
                }
                i = i2;
            }
        }
    }

    public final void G2() {
        if (C1416310mxZ.LJJLIIIJJIZ(LJJJLIIL())) {
            JY0().l02().observe(this, new AObserverS225S0100000_22(this, 66));
        } else {
            rP1();
        }
    }

    public final void H2() {
        NLEEditor nLEEditor;
        TextStickerData textStickerDataW1;
        String audioTrackFilePath;
        C348100Dkm c348100DkmLIZIZ;
        VecNLETrackSPtr tracks;
        VecNLETrackSPtr tracks2;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null) {
            return;
        }
        this.LLIZLLLIL = value;
        C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value);
        if (c348100DkmLIZIZ2 == null || (nLEEditor = c348100DkmLIZIZ2.LIZ) == null) {
            return;
        }
        NLEModel model = nLEEditor.getModel();
        if (model != null && (tracks2 = model.getTracks()) != null) {
            for (NLETrack nLETrack : tracks2) {
                if (Intrinsics.LJFF(C348350DlB.LIZ(nLETrack), "TEXT_SPEAK") && nLETrack.hasExtra("is_tts_reuse")) {
                    nLEEditor.getModel().removeTrack(nLETrack);
                }
            }
        }
        List<TtsReuseModel> list = LJJJLIIL().creativeModel.ttsVoiceInfo.ttsReuseParams;
        if (list != null) {
            boolean z = false;
            int i = 0;
            for (TtsReuseModel ttsReuseModel : list) {
                int i2 = i + 1;
                NLETrack nLETrack2 = null;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                TtsReuseModel ttsReuseModel2 = ttsReuseModel;
                if (ttsReuseModel2.startTime <= nLEEditor.getModel().getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) && (audioTrackFilePath = (textStickerDataW1 = W1(ttsReuseModel2)).getAudioTrackFilePath()) != null && audioTrackFilePath.length() != 0) {
                    InterfaceC1452170ntP interfaceC1452170ntP = this.LLIZLLLIL;
                    if (interfaceC1452170ntP == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    InterfaceC391070FUz interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF();
                    if (!C123100dR.LIZ(textStickerDataW1.getNleUuid()) || interfaceC391070FUzLJFF.get(textStickerDataW1.getNleUuid()) == null) {
                        C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
                        c347650Dk3.LIZIZ = audioTrackFilePath;
                        c347650Dk3.LIZLLL = 0L;
                        c347650Dk3.LJ = textStickerDataW1.getAudioTrackDuration();
                        c347650Dk3.LJFF = textStickerDataW1.getStartTime();
                        c347650Dk3.LJI = -2L;
                        c347650Dk3.LJIIIZ = 1.0f;
                        interfaceC391070FUzLJFF.LJJIJ(c347650Dk3, true);
                        String str = c347650Dk3.LIZJ;
                        NLEModel model2 = nLEEditor.getModel();
                        if (model2 != null && (tracks = model2.getTracks()) != null) {
                            Iterator<NLETrack> it2 = tracks.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                NLETrack next = it2.next();
                                NLENode nLENode = (NLENode) C13LP.LJJJLL(next.getSlots());
                                if (Intrinsics.LJFF(nLENode != null ? nLENode.getUUID() : null, str)) {
                                    nLETrack2 = next;
                                    break;
                                }
                            }
                            NLETrack nLETrack3 = nLETrack2;
                            if (nLETrack3 != null) {
                                nLETrack3.setExtra("is_tts_reuse", "1");
                            }
                        }
                    }
                    z = true;
                }
                i = i2;
            }
            if (z) {
                this.LLIZ = LJJJLIIL().getMusicId();
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        TtsVoiceInfo ttsVoiceInfo;
        List<TtsReuseModel> list;
        super.onCreate();
        if (LJJJLIIL().isFromCrash() && (ttsVoiceInfo = LJJJLIIL().creativeModel.ttsVoiceInfo) != null && (list = ttsVoiceInfo.ttsReuseParams) != null) {
            TtsReuseServiceImpl.LJ().initAudioSDKHandler(LJJJLIIL().getCreativeInfo());
            TtsReuseServiceImpl.LJ().fetchBatchTtsAudio(list);
        }
        JY0().ww2().observe(this, new AObjectS245S0100000_22(this, 114));
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        TtsReuseServiceImpl.LJ().destroyAudioSDKHandler();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1465420oEm(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final TextStickerData W1(TtsReuseModel ttsReuseModel) {
        int i;
        String str;
        VESize initSize;
        VESize initSize2;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLIZLLLIL;
        int i2 = 0;
        if (interfaceC1452170ntP != null && (initSize2 = interfaceC1452170ntP.getInitSize()) != null) {
            i = initSize2.width;
        } else {
            i = 0;
        }
        InterfaceC1452170ntP interfaceC1452170ntP2 = this.LLIZLLLIL;
        if (interfaceC1452170ntP2 != null && (initSize = interfaceC1452170ntP2.getInitSize()) != null) {
            i2 = initSize.height;
        }
        C05WW c05ww = C05WW.LIZ;
        Effect effectLIZ = c05ww.LIZ(ttsReuseModel.fontResId);
        Effect effectLIZJ = c05ww.LIZJ(ttsReuseModel.voiceResId);
        TextStickerData textStickerData = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null);
        textStickerData.setStartTime(ttsReuseModel.startTime);
        textStickerData.setEndTime(ttsReuseModel.endTime);
        float f = 2;
        textStickerData.setX(((ttsReuseModel.transformX / f) + 0.5f) * i);
        textStickerData.setY((0.5f - (ttsReuseModel.transformY / f)) * i2);
        textStickerData.setScale(ttsReuseModel.scale);
        textStickerData.setRotation(ttsReuseModel.rotation);
        textStickerData.setTextStr(ttsReuseModel.textStr);
        textStickerData.setTextWrapList(C123P.LIZLLL(ttsReuseModel.textStr));
        textStickerData.setBgMode(ttsReuseModel.bgMode);
        int iLJI = ttsReuseModel.color;
        if (!C0F9I.LIZ.contains(Integer.valueOf(iLJI))) {
            if (!C13LQ.LJIILJJIL(iLJI, C0F9I.LJ())) {
                iLJI = -1;
            }
        } else {
            C363420EMq.LIZ.getClass();
            iLJI = C363420EMq.LJI(iLJI);
        }
        textStickerData.setColor(iLJI);
        textStickerData.setAlign(ttsReuseModel.align);
        if (effectLIZ != null) {
            textStickerData.setFontId(effectLIZ.getEffectId());
            textStickerData.setFontPath(effectLIZ.getUnzipPath());
            textStickerData.setFontResId(effectLIZ.getResourceId());
            textStickerData.setFontType(((TextFontStyleData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), effectLIZ.getExtra(), TextFontStyleData.class)).fileName);
        } else {
            textStickerData.setFontType("default");
        }
        if (effectLIZJ != null) {
            textStickerData.setVoiceEffectId(effectLIZJ.getEffectId());
            textStickerData.setVoiceEffectResourceId(effectLIZJ.getResourceId());
            textStickerData.setVoiceAnchorName(effectLIZJ.getName());
            ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = (ReadTextEffectSpeakerExtra) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), effectLIZJ.getExtra(), ReadTextEffectSpeakerExtra.class);
            if (readTextEffectSpeakerExtra != null) {
                textStickerData.setVoiceCreatorUserId(readTextEffectSpeakerExtra.voiceCreatorUserId);
                textStickerData.setVoiceCreatorUserName(readTextEffectSpeakerExtra.voiceCreatorUserName);
                textStickerData.setCreatorVoice(readTextEffectSpeakerExtra.isCreatorVoice);
                textStickerData.setSpeakerID(readTextEffectSpeakerExtra.speakreID);
                textStickerData.setSpeakerName(readTextEffectSpeakerExtra.speakerName);
                textStickerData.setTtsAnchorReleaseDate(readTextEffectSpeakerExtra.ttsAnchorReleaseDate);
                textStickerData.setTtsReleaseDate(readTextEffectSpeakerExtra.ttsReleaseDate);
            }
            textStickerData.setVoiceEffectIconUrl((String) C13LP.LJJJLL(effectLIZJ.getIconUrl().getUrlList()));
        }
        textStickerData.setHasReadTextAudio(true);
        if (C123100dR.LIZ(ttsReuseModel.streamSpeakerId)) {
            str = ttsReuseModel.streamSpeakerId;
        } else {
            str = ttsReuseModel.speakerId;
        }
        String strLIZIZ = c05ww.LIZIZ(ttsReuseModel.textStr, str);
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        CreativeInfo creativeInfo = LJJJLIIL().getCreativeInfo();
        EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.TEXT_STICKER;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".mp3");
        String strLIZLLL = C2298208zU.LIZLLL(pathService, creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), false, 8);
        if (C2471909mP.LIZJ(strLIZIZ, strLIZLLL)) {
            textStickerData.setAudioTrackFilePath(strLIZLLL);
        }
        String audioTrackFilePath = textStickerData.getAudioTrackFilePath();
        if (audioTrackFilePath != null) {
            textStickerData.getAudioPathList().add(audioTrackFilePath);
        }
        textStickerData.setAudioTrackDuration(ttsReuseModel.endTime - ttsReuseModel.startTime);
        textStickerData.setAudioText(ttsReuseModel.textStr);
        textStickerData.getTtsExtraMap().put("is_tts_reuse_mdp", "1");
        return textStickerData;
    }
}

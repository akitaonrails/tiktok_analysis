package X;

import Y.AObjectS247S0100000_29;
import android.graphics.Point;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.audio.ConsumptionSpeakerInfo;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS106S0210000_29;
import kotlin.jvm.internal.AwS46S1300000_5;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11Yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19519111Yf extends AbstractC2255721DQs<InterfaceC1454770nxb> implements InterfaceC1454770nxb, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 681));
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC376040Eok.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
    public DialogC1389620mGW LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19519111Yf.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19519111Yf.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19519111Yf.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19519111Yf.class, "editDraftApi", "getEditDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditDraftApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19519111Yf.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public InterfaceC1454770nxb o2() {
        return this;
    }

    private final InterfaceC1635390sev H2() {
        return (InterfaceC1635390sev) this.LLILLJJLI.getValue();
    }

    private final void showLoadingDialog() {
        C01TT.LIZLLL(new AwS573S0100000_29(this, 682));
    }

    public final InterfaceC376040Eok G2() {
        return (InterfaceC376040Eok) this.LLILZLL.getValue(this, LLJ[3]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZ.getValue(this, LLJ[1]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJ[0]);
    }

    public final InterfaceC1454960nxu T2() {
        return (InterfaceC1454960nxu) this.LLIZ.getValue(this, LLJ[4]);
    }

    public final void Z1() {
        C01TT.LIZLLL(new AwS573S0100000_29(this, 680));
    }

    public final InterfaceC1455850nzL w2() {
        return (InterfaceC1455850nzL) this.LLILZIL.getValue(this, LLJ[2]);
    }

    private final void X1() throws Throwable {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        long j;
        long j2;
        if (C301810BsJ.LIZ()) {
            C197010126e c197010126e = C197010126e.LIZ;
            String strLJIIL = C1428470nHB.LJIIL(LJJJLIIL());
            c197010126e.getClass();
            C1456210nzv c1456210nzvLJIIJJI = C197010126e.LJIIJJI(strLJIIL);
            InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
            C577650Ml9 c577650Ml9 = c1456210nzvLJIIJJI.LJ;
            if (c577650Ml9 != null) {
                j = c577650Ml9.LIZ;
                j2 = c577650Ml9.LIZIZ;
            } else {
                j = 0;
                j2 = 0;
            }
            interfaceC1446740nkeJY0.oz1(j, j2, c1456210nzvLJIIJJI.LIZ);
            return;
        }
        String str = (String) C13LP.LJJJLZIJ(C19994513Lb.LIZIZ(System.currentTimeMillis()).nextInt(6), C1697810uHb.LJ("bg_00.png", "bg_01.png", "bg_02.png", "bg_03.png", "bg_04.png", "bg_05.png"));
        if (str == null) {
            return;
        }
        C197010126e c197010126e2 = C197010126e.LIZ;
        CreativeInfo creativeInfo = LJJJLIIL().getCreativeInfo();
        c197010126e2.getClass();
        C1456210nzv c1456210nzvLJI = C197010126e.LJI(creativeInfo, str);
        String path = new C0VSJ(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), LJJJLIIL().getCreativeInfo(), EnumC20228214Cy.SHARE_T0_STORY, null, false, 12), "background.png").getPath();
        C2471909mP.LIZJ(c1456210nzvLJI.LIZIZ, path);
        JY0().i61(path);
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null) {
            return;
        }
        nLEEditor.commit();
    }

    @Override // X.InterfaceC1454770nxb
    public void l11() {
        String nickname;
        UrlModel iconUrl;
        List<String> arrayList;
        com.ss.android.ugc.aweme.base.model.UrlModel avatarThumb;
        ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra;
        String uid;
        String nickname2;
        String uid2;
        X1();
        showLoadingDialog();
        ConsumptionSpeakerInfo consumptionSpeakerInfo = LJJJLIIL().creativeModel.instantCloneConsumption.speakerInfo;
        if (consumptionSpeakerInfo != null) {
            String str = consumptionSpeakerInfo.ttsId;
            final boolean z = consumptionSpeakerInfo.isPrivate;
            C1664590tQ1.LJIIIZ(this);
            InterfaceC2376809Ta interfaceC2376809Ta = new InterfaceC2376809Ta() { // from class: X.11Y6
                @Override // X.InterfaceC2376809Ta
                public final void LIZ(TTSSpeakerInfo tTSSpeakerInfo, int i, String str2) {
                    C01TT.LIZLLL(new AwS106S0210000_29(tTSSpeakerInfo, this.LIZ, z, 0));
                }
            };
            TTSSpeakerInfo tTSSpeakerInfo = new TTSSpeakerInfo(str, null, "private", "completed");
            Effect effect = tTSSpeakerInfo.LIZIZ;
            if (effect != null) {
                JSONObject jSONObject = new JSONObject();
                if (u.LJJIIJZLJL(str.toLowerCase(Locale.ROOT), "vop", false)) {
                    jSONObject.put("is_voice_clone", true);
                } else {
                    jSONObject.put("is_voice_clone", false);
                }
                jSONObject.put("is_instant_clone", true);
                jSONObject.put("from_tag", "instant clone");
                C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
                if (currentUser == null || (uid2 = currentUser.getUid()) == null) {
                    uid2 = "";
                }
                jSONObject.put("creator_user_id", uid2);
                effect.setExtra(C786410Ut5.J3(jSONObject));
            }
            Effect effect2 = tTSSpeakerInfo.LIZIZ;
            if (effect2 != null) {
                effect2.setEffect_id("instant_clone_private_local");
            }
            ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra2 = tTSSpeakerInfo.LIZ;
            if (readTextEffectSpeakerExtra2 != null) {
                C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
                if (currentUser2 == null || (nickname2 = currentUser2.getNickname()) == null) {
                    nickname2 = "";
                }
                readTextEffectSpeakerExtra2.speakerName = nickname2;
            }
            ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra3 = tTSSpeakerInfo.LIZ;
            if (readTextEffectSpeakerExtra3 != null) {
                readTextEffectSpeakerExtra3.speakreID = str;
                C19292410dm currentUser3 = C0CHQ.LIZ().getAccountService().getCurrentUser();
                if (currentUser3 == null || (uid = currentUser3.getUid()) == null) {
                    uid = "";
                }
                readTextEffectSpeakerExtra3.voiceCreatorUserId = uid;
            }
            if (C11VR.LIZIZ().enableStreamTTS == 1 && (readTextEffectSpeakerExtra = tTSSpeakerInfo.LIZ) != null) {
                readTextEffectSpeakerExtra.streamTTSSpkID = str;
            }
            Effect effect3 = tTSSpeakerInfo.LIZIZ;
            if (effect3 != null && (iconUrl = effect3.getIconUrl()) != null) {
                C19292410dm currentUser4 = C0CHQ.LIZ().getAccountService().getCurrentUser();
                if (currentUser4 == null || (avatarThumb = currentUser4.getAvatarThumb()) == null || (arrayList = avatarThumb.getUrlList()) == null) {
                    arrayList = new ArrayList<>();
                }
                iconUrl.setUrlList(arrayList);
            }
            Effect effect4 = tTSSpeakerInfo.LIZIZ;
            if (effect4 != null) {
                C19292410dm currentUser5 = C0CHQ.LIZ().getAccountService().getCurrentUser();
                if (currentUser5 == null || (nickname = currentUser5.getNickname()) == null) {
                    nickname = "";
                }
                effect4.setName(nickname);
            }
            interfaceC2376809Ta.LIZ(tTSSpeakerInfo, 0, "");
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C197010126e.LIZ.getClass();
        C197010126e.LIZIZ();
        JY0().ww2().observe(this, new AObjectS247S0100000_29(this, 85));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19519111Yf(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void W1(VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean, String str) {
        Point point;
        C0FVT c0fvtKR;
        InterfaceC391240FVq interfaceC391240FVqQj;
        Pair<Integer, Integer> pairAl;
        StickerItemModel stickerItemModel = new StickerItemModel();
        stickerItemModel.type = 2;
        stickerItemModel.layerWeight = 2;
        TextStickerData textStickerData = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null);
        textStickerData.setTextStr(str);
        textStickerData.setTextWrapList(C123P.LIZLLL(str));
        textStickerData.setColor(-1);
        textStickerData.setBgMode(1);
        textStickerData.setAlign(2);
        textStickerData.setFontSize(30);
        textStickerData.setScale(0.7f);
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ = w2().AT().LIZJ();
        if (interfaceC1461660o8iLIZJ != null && (c0fvtKR = interfaceC1461660o8iLIZJ.kR()) != null && (interfaceC391240FVqQj = c0fvtKR.qj()) != null && (pairAl = interfaceC391240FVqQj.al()) != null) {
            point = new Point(pairAl.getFirst().intValue() / 2, pairAl.getSecond().intValue() / 2);
        } else {
            point = new Point(C0JAI.LIZJ(C1664590tQ1.LJII(this)) / 2, C0JAI.LIZIZ(C1664590tQ1.LJII(this)) / 2);
        }
        textStickerData.setEditCenterPoint(point);
        textStickerData.setX(textStickerData.getEditCenterPoint().x);
        textStickerData.setY(textStickerData.getEditCenterPoint().y);
        textStickerData.setVoiceEffectId(voiceCloneReadTextEffectBean.effect.getEffectId());
        textStickerData.setVoiceEffectResourceId(voiceCloneReadTextEffectBean.effect.getResourceId());
        textStickerData.setVoiceAnchorName(voiceCloneReadTextEffectBean.effect.getName());
        textStickerData.setSpeakerID(voiceCloneReadTextEffectBean.mSpeaker.speakreID);
        textStickerData.setSpeakerName(voiceCloneReadTextEffectBean.mSpeaker.speakerName);
        textStickerData.setVoiceCreatorUserId(voiceCloneReadTextEffectBean.mSpeaker.voiceCreatorUserId);
        textStickerData.setVoiceCreatorUserName(voiceCloneReadTextEffectBean.mSpeaker.voiceCreatorUserName);
        textStickerData.setCreatorVoice(voiceCloneReadTextEffectBean.mSpeaker.isCreatorVoice);
        textStickerData.setTtsAnchorReleaseDate(voiceCloneReadTextEffectBean.mSpeaker.ttsAnchorReleaseDate);
        textStickerData.setTtsReleaseDate(voiceCloneReadTextEffectBean.mSpeaker.ttsReleaseDate);
        textStickerData.setHasReadTextAudio(true);
        textStickerData.getTtsExtraMap().put("is_instant_clone", "1");
        Map<String, String> ttsExtraMap = textStickerData.getTtsExtraMap();
        Effect effect = voiceCloneReadTextEffectBean.effect;
        C1446130njf.LIZ.getClass();
        String strLJFF = C1446130njf.LJFF(effect, "from_tag");
        if (strLJFF == null) {
            strLJFF = "";
        }
        ttsExtraMap.put("from_tag", strLJFF);
        C0F7U.LJIIJ(C1664590tQ1.LJIIIZ(this), JY0(), "instant_clone", textStickerData, new AwS46S1300000_5(this, textStickerData, stickerItemModel, str, 0));
    }
}

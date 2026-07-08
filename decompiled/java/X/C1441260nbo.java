package X;

import Y.ACallableS427S0100000_22;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.audio.CapcutVcTTSModel;
import com.ss.android.ugc.aweme.creative.model.audio.CapcutVoiceAnchorModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.gamora.editor.audioservice.service.anchor.CapCutOriginalVolumeInfo;
import com.ss.android.ugc.gamora.editor.audioservice.service.anchor.CapCutSoundMetaInfo;
import com.ss.android.ugc.gamora.editor.audioservice.service.anchor.CapcutMetaInfo;
import com.ss.android.ugc.gamora.editor.audioservice.service.anchor.CapcutVoiceAnchorInfo;
import com.ss.android.ugc.gamora.editor.audioservice.service.anchor.UgcTimbreInfo;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441260nbo extends AbstractC2255721DQs<InterfaceC1441270nbp> implements InterfaceC1441270nbp, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public InterfaceC1635410sex LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1441260nbo.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = 8;
    }

    public InterfaceC1441270nbp W1() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.List<java.lang.String>] */
    private final void G2() {
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = bb2().creativeModel.capcutVcTTSModel.vcSpeakerIds;
        InterfaceC1635410sex interfaceC1635410sexZ1 = Z1();
        if (interfaceC1635410sexZ1 != null) {
            interfaceC1635410sexZ1.LJI("voiceconversion", false, new IFetchEffectChannelListener() { // from class: X.0nbm
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                    List<Effect> allCategoryEffects;
                    EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                    if (effectChannelResponse2 != null && (allCategoryEffects = effectChannelResponse2.getAllCategoryEffects()) != null) {
                        List<String> list = c259800zU.element;
                        C1441260nbo c1441260nbo = this;
                        for (String str : list) {
                            for (Effect effect : allCategoryEffects) {
                                if (c1441260nbo.o2(C1664460tPo.LJII(effect), str)) {
                                    CapcutVoiceAnchorModel capcutVoiceAnchorModel = new CapcutVoiceAnchorModel(null, null, null, null, null, null);
                                    capcutVoiceAnchorModel.effectId = effect.getEffectId();
                                    C1446130njf.LIZ.getClass();
                                    String strLJFF = C1446130njf.LJFF(effect, "vc_anchor_name");
                                    String str2 = "";
                                    if (strLJFF == null) {
                                        strLJFF = "";
                                    }
                                    capcutVoiceAnchorModel.effectName = strLJFF;
                                    capcutVoiceAnchorModel.speakerId = C1664460tPo.LJII(effect);
                                    String str3 = (String) C13LP.LJJJLZIJ(0, effect.getIconUrl().getUrlList());
                                    if (str3 != null) {
                                        str2 = str3;
                                    }
                                    capcutVoiceAnchorModel.effectIconUrl = str2;
                                    capcutVoiceAnchorModel.resourceId = effect.getResourceId();
                                    capcutVoiceAnchorModel.creatorUid = C1664460tPo.LIZ(effect);
                                    c1441260nbo.bb2().creativeModel.capcutVcTTSModel.vcAnchorModels.put(str, capcutVoiceAnchorModel);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    private final InterfaceC1635410sex Z1() {
        if (this.LLILLL == null) {
            InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
            C0CHQ.LIZ().initDownloadableModel();
            this.LLILLL = interfaceC1635410sexLIZ;
        }
        return this.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.List<java.lang.String>] */
    private final void w2() {
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = bb2().creativeModel.capcutVcTTSModel.ttsSpeakerIds;
        InterfaceC1635410sex interfaceC1635410sexZ1 = Z1();
        if (interfaceC1635410sexZ1 != null) {
            interfaceC1635410sexZ1.LJI("speaking-voice", false, new IFetchEffectChannelListener() { // from class: X.0nbn
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                    List<Effect> allCategoryEffects;
                    String str;
                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra;
                    EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                    if (effectChannelResponse2 != null && (allCategoryEffects = effectChannelResponse2.getAllCategoryEffects()) != null) {
                        List<String> list = c259800zU.element;
                        C1441260nbo c1441260nbo = this;
                        for (String str2 : list) {
                            for (Effect effect : allCategoryEffects) {
                                if (c1441260nbo.o2(C1664460tPo.LJII(effect), str2)) {
                                    CapcutVoiceAnchorModel capcutVoiceAnchorModel = new CapcutVoiceAnchorModel(null, null, null, null, null, null);
                                    ReadTextEffectBean readTextEffectBeanLIZ = C2378709Tt.LIZ(effect);
                                    capcutVoiceAnchorModel.effectId = effect.getEffectId();
                                    String str3 = "";
                                    if (readTextEffectBeanLIZ == null || (readTextEffectSpeakerExtra = readTextEffectBeanLIZ.mSpeaker) == null || (str = readTextEffectSpeakerExtra.ttsAnchorName) == null) {
                                        str = "";
                                    }
                                    capcutVoiceAnchorModel.effectName = str;
                                    capcutVoiceAnchorModel.speakerId = C1664460tPo.LJII(effect);
                                    String str4 = (String) C13LP.LJJJLZIJ(0, effect.getIconUrl().getUrlList());
                                    if (str4 != null) {
                                        str3 = str4;
                                    }
                                    capcutVoiceAnchorModel.effectIconUrl = str3;
                                    capcutVoiceAnchorModel.resourceId = effect.getResourceId();
                                    capcutVoiceAnchorModel.creatorUid = C1664460tPo.LIZ(effect);
                                    c1441260nbo.bb2().creativeModel.capcutVcTTSModel.ttsAnchorModels.put(str2, capcutVoiceAnchorModel);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public final VideoPublishEditModel bb2() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    @Override // X.InterfaceC1441270nbp
    public void Hz() {
        G2();
        if (C311110CHl.LIZ()) {
            w2();
        }
    }

    @Override // X.InterfaceC1441270nbp
    public void O5() {
        String str;
        List<String> list;
        List<String> list2;
        ArrayList<ImportVideoInfo> importInfoList = bb2().getImportInfoList();
        if (importInfoList != null) {
            Iterator<ImportVideoInfo> it2 = importInfoList.iterator();
            while (it2.hasNext()) {
                HashMap<String, String> metaData = TEVideoUtils.getMetaData(it2.next().getRealImportPath());
                if (metaData != null && !metaData.isEmpty()) {
                    CapcutMetaInfo capcutMetaInfo = (CapcutMetaInfo) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), metaData.get("LvMetaInfo"), CapcutMetaInfo.class);
                    Gson gson = C7740030o.LIZ().getGson();
                    UgcTimbreInfo ugcTimbreInfo = capcutMetaInfo.data;
                    if (ugcTimbreInfo != null && (str = ugcTimbreInfo.info) != null) {
                        CapcutVoiceAnchorInfo capcutVoiceAnchorInfo = (CapcutVoiceAnchorInfo) GsonProtectorUtils.fromJson(gson, str, CapcutVoiceAnchorInfo.class);
                        CapcutVcTTSModel capcutVcTTSModel = bb2().creativeModel.capcutVcTTSModel;
                        if (capcutVoiceAnchorInfo == null || (list = capcutVoiceAnchorInfo.vcSpeakerIds) == null) {
                            list = C13BV.INSTANCE;
                        }
                        capcutVcTTSModel.vcSpeakerIds = list;
                        CapcutVcTTSModel capcutVcTTSModel2 = bb2().creativeModel.capcutVcTTSModel;
                        if (capcutVoiceAnchorInfo == null || (list2 = capcutVoiceAnchorInfo.ttsSpeakerIds) == null) {
                            list2 = C13BV.INSTANCE;
                        }
                        capcutVcTTSModel2.ttsSpeakerIds = list2;
                    }
                }
            }
        }
    }

    public final void X1() {
        Number numberValueOf;
        Number numberValueOf2;
        ArrayList<ImportVideoInfo> importInfoList = bb2().getImportInfoList();
        if (importInfoList != null) {
            Iterator<ImportVideoInfo> it2 = importInfoList.iterator();
            while (it2.hasNext()) {
                HashMap<String, String> metaData = TEVideoUtils.getMetaData(it2.next().getRealImportPath());
                if (metaData != null && !metaData.isEmpty()) {
                    try {
                        CapCutSoundMetaInfo capCutSoundMetaInfo = (CapCutSoundMetaInfo) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), metaData.get("LvMetaInfo"), CapCutSoundMetaInfo.class);
                        if (capCutSoundMetaInfo == null) {
                            return;
                        }
                        CapCutOriginalVolumeInfo capCutOriginalVolumeInfo = capCutSoundMetaInfo.originalVolumedata;
                        if (capCutOriginalVolumeInfo == null || (numberValueOf = capCutOriginalVolumeInfo.capCutOriginalVolume) == null) {
                            numberValueOf = Float.valueOf(0.0f);
                        }
                        float fFloatValue = numberValueOf.floatValue();
                        CapCutOriginalVolumeInfo capCutOriginalVolumeInfo2 = capCutSoundMetaInfo.originalVolumedata;
                        if (capCutOriginalVolumeInfo2 == null || (numberValueOf2 = capCutOriginalVolumeInfo2.capCutmusicVolume) == null) {
                            numberValueOf2 = Float.valueOf(0.0f);
                        }
                        float fFloatValue2 = numberValueOf2.floatValue();
                        if (fFloatValue > 100.0d) {
                            fFloatValue = ((fFloatValue - 100.0f) / 9.0f) + 100.0f;
                        }
                        if (fFloatValue2 > 100.0f) {
                            fFloatValue2 = ((fFloatValue2 - 100.0f) / 9.0f) + 100.0f;
                        }
                        float f = fFloatValue2 / 100.0f;
                        bb2().setVoiceVolume(Math.max(fFloatValue / 100.0f, f));
                        bb2().setMusicVolume(f);
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C15O7.LIZJ(new ACallableS427S0100000_22(this, 5));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1441260nbo(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final boolean o2(String str, String str2) {
        if (Intrinsics.LJFF(str2, str) || a0.LJJJLL("_stream", str2).equals(a0.LJJJLL("_stream", str))) {
            return true;
        }
        return false;
    }
}

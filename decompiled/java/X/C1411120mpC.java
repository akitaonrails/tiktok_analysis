package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ReuseAwemeTTSAndVCRefIDsModel;
import com.ss.android.ugc.aweme.feed.model.TtsReuseModel;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mpC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411120mpC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ShortVideoContext shortVideoContext) {
        CreativeModel creativeModel;
        TtsVoiceInfo ttsVoiceInfo;
        List<TtsReuseModel> list;
        boolean z;
        TtsVoiceInfo ttsVoiceInfo2;
        TtsVoiceInfo ttsVoiceInfo3;
        CreativeModel creativeModel2;
        TtsVoiceInfo ttsVoiceInfo4;
        List<TtsReuseModel> list2;
        String str;
        Effect effectLIZJ;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (ttsVoiceInfo = creativeModel.ttsVoiceInfo) != null && (list = ttsVoiceInfo.ttsReuseParams) != null && !list.isEmpty() && shortVideoContext != null) {
            if (!shortVideoContext.mIsFromDraft && !shortVideoContext.cameraComponentModel.isRetakeMode) {
                z = true;
            } else {
                z = false;
            }
            if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (ttsVoiceInfo4 = creativeModel2.ttsVoiceInfo) != null && (list2 = ttsVoiceInfo4.ttsReuseParams) != null) {
                for (TtsReuseModel ttsReuseModel : list2) {
                    if (C123100dR.LIZ(ttsReuseModel.streamSpeakerId)) {
                        str = ttsReuseModel.streamSpeakerId;
                    } else {
                        str = ttsReuseModel.speakerId;
                    }
                    C05WW c05ww = C05WW.LIZ;
                    String strLIZIZ = c05ww.LIZIZ(ttsReuseModel.textStr, str);
                    if (strLIZIZ != null && strLIZIZ.length() != 0 && C2354709Kn.LIZIZ(strLIZIZ) && (effectLIZJ = c05ww.LIZJ(ttsReuseModel.voiceResId)) != null) {
                        ttsReuseModel.setVoiceEffectId(effectLIZJ.getEffectId());
                    } else {
                        z = false;
                    }
                }
            }
            if (!z && shortVideoContext != null) {
                CreativeModel creativeModel3 = shortVideoContext.creativeModel;
                if (creativeModel3 != null && (ttsVoiceInfo3 = creativeModel3.ttsVoiceInfo) != null) {
                    ttsVoiceInfo3.setTtsReuseParams(C13BV.INSTANCE);
                }
                CreativeModel creativeModel4 = shortVideoContext.creativeModel;
                if (creativeModel4 != null && (ttsVoiceInfo2 = creativeModel4.ttsVoiceInfo) != null) {
                    ttsVoiceInfo2.setTtsReuseParamsOrigin(C13BV.INSTANCE);
                }
            }
        }
    }

    public static String LIZIZ(ShortVideoContext shortVideoContext) {
        boolean zLJFF;
        CreativeModel creativeModel;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel;
        CreativeModel creativeModel2;
        TtsVoiceInfo ttsVoiceInfo;
        List<TtsReuseModel> list;
        CreativeModel creativeModel3;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel2;
        int i = 0;
        if (shortVideoContext != null && (creativeModel3 = shortVideoContext.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel2 = creativeModel3.reuseAwemeTTSAndVCRefIDsModel) != null) {
            zLJFF = Intrinsics.LJFF(reuseAwemeTTSAndVCRefIDsModel2.originMusicRemoveTTS, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        ArrayList<String> arrayList = null;
        if (zLJFF) {
            if (l.LIZIZ()) {
                ArrayList arrayList2 = new ArrayList();
                if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (ttsVoiceInfo = creativeModel2.ttsVoiceInfo) != null && (list = ttsVoiceInfo.ttsReuseParams) != null) {
                    for (TtsReuseModel ttsReuseModel : list) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            String str = ttsReuseModel.voiceEffectId;
                            if (str != null) {
                                arrayList2.add(str);
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                ReuseAwemeTTSAndVCRefIDsModel.Companion.getClass();
                return C1402640mbW.LIZIZ(arrayList2);
            }
            return "";
        }
        C1402640mbW c1402640mbW = ReuseAwemeTTSAndVCRefIDsModel.Companion;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel = creativeModel.reuseAwemeTTSAndVCRefIDsModel) != null) {
            arrayList = reuseAwemeTTSAndVCRefIDsModel.curMusicTTSRedIDs;
        }
        c1402640mbW.getClass();
        return C1402640mbW.LIZIZ(arrayList);
    }
}

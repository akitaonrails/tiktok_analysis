package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ReuseAwemeTTSAndVCRefIDsModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.TtsReuseModel;
import com.ss.android.ugc.aweme.feed.model.TtsVoiceInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0mbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402630mbV {
    public static final C1402630mbV LIZ = new C1402630mbV();

    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean zLJFF;
        CreativeModel creativeModel;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel;
        CreativeModel creativeModel2;
        TtsVoiceInfo ttsVoiceInfo;
        List<TtsReuseModel> list;
        List<TextStickerData> listLJI;
        String voiceEffectId;
        CreativeModel creativeModel3;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel2;
        int i = 0;
        if (videoPublishEditModel != null && (creativeModel3 = videoPublishEditModel.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel2 = creativeModel3.reuseAwemeTTSAndVCRefIDsModel) != null) {
            zLJFF = Intrinsics.LJFF(reuseAwemeTTSAndVCRefIDsModel2.originMusicRemoveTTS, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        ArrayList<String> arrayList = null;
        if (zLJFF) {
            if (l.LIZIZ()) {
                if (l.LIZ()) {
                    ArrayList arrayList2 = new ArrayList();
                    if (videoPublishEditModel != null && (listLJI = C0F7U.LJI(videoPublishEditModel)) != null) {
                        int i2 = 0;
                        for (TextStickerData textStickerData : listLJI) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                TextStickerData textStickerData2 = textStickerData;
                                if (textStickerData2.getHasReadTextAudio() && textStickerData2.getTtsExtraMap().containsKey("is_tts_reuse_mdp") && u.LJIJI(textStickerData2.getTtsExtraMap().get("is_tts_reuse_mdp"), "1", false) && (voiceEffectId = textStickerData2.getVoiceEffectId()) != null) {
                                    arrayList2.add(voiceEffectId);
                                }
                                i2 = i3;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    ReuseAwemeTTSAndVCRefIDsModel.Companion.getClass();
                    return C1402640mbW.LIZIZ(arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (ttsVoiceInfo = creativeModel2.ttsVoiceInfo) != null && (list = ttsVoiceInfo.ttsReuseParams) != null) {
                    for (TtsReuseModel ttsReuseModel : list) {
                        int i4 = i + 1;
                        if (i >= 0) {
                            String str = ttsReuseModel.voiceEffectId;
                            if (str != null) {
                                arrayList3.add(str);
                            }
                            i = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                ReuseAwemeTTSAndVCRefIDsModel.Companion.getClass();
                return C1402640mbW.LIZIZ(arrayList3);
            }
            return "";
        }
        C1402640mbW c1402640mbW = ReuseAwemeTTSAndVCRefIDsModel.Companion;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel = creativeModel.reuseAwemeTTSAndVCRefIDsModel) != null) {
            arrayList = reuseAwemeTTSAndVCRefIDsModel.curMusicTTSRedIDs;
        }
        c1402640mbW.getClass();
        return C1402640mbW.LIZIZ(arrayList);
    }

    public static String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean zLJFF;
        String strLIZ;
        CreativeModel creativeModel;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel;
        CreativeModel creativeModel2;
        TtsVoiceInfo ttsVoiceInfo;
        List<TtsReuseModel> list;
        List<TextStickerData> listLJI;
        String voiceEffectId;
        CreativeModel creativeModel3;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel2;
        if (videoPublishEditModel != null && (creativeModel3 = videoPublishEditModel.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel2 = creativeModel3.reuseAwemeTTSAndVCRefIDsModel) != null) {
            zLJFF = Intrinsics.LJFF(reuseAwemeTTSAndVCRefIDsModel2.originMusicRemoveTTS, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        ArrayList<String> arrayList = null;
        if (zLJFF) {
            if (!l.LIZIZ()) {
                strLIZ = "";
            } else if (l.LIZ()) {
                ArrayList arrayList2 = new ArrayList();
                if (videoPublishEditModel != null && (listLJI = C0F7U.LJI(videoPublishEditModel)) != null) {
                    int i = 0;
                    for (TextStickerData textStickerData : listLJI) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            TextStickerData textStickerData2 = textStickerData;
                            if (textStickerData2.getHasReadTextAudio() && textStickerData2.getTtsExtraMap().containsKey("is_tts_reuse_mdp") && u.LJIJI(textStickerData2.getTtsExtraMap().get("is_tts_reuse_mdp"), "1", false) && (voiceEffectId = textStickerData2.getVoiceEffectId()) != null) {
                                arrayList2.add(voiceEffectId);
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                ReuseAwemeTTSAndVCRefIDsModel.Companion.getClass();
                strLIZ = C1402640mbW.LIZ(arrayList2);
            } else {
                ArrayList arrayList3 = new ArrayList();
                if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (ttsVoiceInfo = creativeModel2.ttsVoiceInfo) != null && (list = ttsVoiceInfo.ttsReuseParams) != null) {
                    int i3 = 0;
                    for (TtsReuseModel ttsReuseModel : list) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            String str = ttsReuseModel.voiceEffectId;
                            if (str != null) {
                                arrayList3.add(str);
                            }
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                ReuseAwemeTTSAndVCRefIDsModel.Companion.getClass();
                strLIZ = C1402640mbW.LIZ(arrayList3);
            }
        } else {
            C1402640mbW c1402640mbW = ReuseAwemeTTSAndVCRefIDsModel.Companion;
            if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel = creativeModel.reuseAwemeTTSAndVCRefIDsModel) != null) {
                arrayList = reuseAwemeTTSAndVCRefIDsModel.curMusicTTSRedIDs;
            }
            c1402640mbW.getClass();
            strLIZ = C1402640mbW.LIZ(arrayList);
        }
        if (strLIZ.length() == 0) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(strLIZ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

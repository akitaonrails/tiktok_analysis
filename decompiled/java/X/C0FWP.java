package X;

import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0FWP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FWP {
    public final C0FVT LIZ;
    public final Activity LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final InterfaceC1455860nzM LIZLLL;
    public final InterfaceC391390FWf LJ;
    public final Function0<InterfaceC391390FWf> LJFF;
    public final InterfaceC391240FVq LJI;
    public final C0FWT LJII;
    public final InterfaceC2378409Tq LJIIIIZZ;
    public final Function0<C0FVI> LJIIIZ;
    public ProgressDialogC1399790mWv LJIIJ;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public final C560530Lyd<Unit> LJIIZILJ;
    public final C560530Lyd LJIJ;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 128));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 127));
    public boolean LJIILIIL = true;
    public final MutableLiveData<Boolean> LJIILLIIL = new MutableLiveData<>();

    public final ShortVideoCommonParams LIZJ() {
        return (ShortVideoCommonParams) this.LJIIL.getValue();
    }

    public final void LJIIJJI() {
        C0CHQ.LIZ().getApplicationService().getClass();
        if (C2214201BlK.LJIIJJI) {
            return;
        }
        InterfaceC1452170ntP value = this.LIZLLL.g().getValue();
        if (value != null) {
            value.setLoopPlay(true);
        }
        InterfaceC1452170ntP value2 = this.LIZLLL.g().getValue();
        if (value2 != null) {
            value2.play();
        }
    }

    public static String LIZLLL(TextStickerModel textStickerModel) {
        Map<String, String> map;
        Map<String, String> map2;
        TTSModel ttsModel = textStickerModel.getTtsModel();
        String str = null;
        if (ttsModel != null && ttsModel.ttsVoiceModel != null) {
            return "auto";
        }
        TTSModel ttsModel2 = textStickerModel.getTtsModel();
        if (ttsModel2 != null && (map = ttsModel2.ttsExtraMap) != null && map.containsKey("is_tts_reuse_mdp")) {
            TTSModel ttsModel3 = textStickerModel.getTtsModel();
            if (ttsModel3 != null && (map2 = ttsModel3.ttsExtraMap) != null) {
                str = map2.get("is_tts_reuse_mdp");
            }
            if (u.LJIJI(str, "1", false)) {
                return "tts_reuse";
            }
            return "user_click";
        }
        return "user_click";
    }

    public static void LJII(boolean z) {
        C0MVY c0mvy;
        C194353111z c194353111z = C194353111z.LIZ;
        if (z) {
            c0mvy = C0MVY.SHOW;
        } else {
            c0mvy = C0MVY.DISMISS;
        }
        c194353111z.LIZIZ(1111, c0mvy, C0LD3.DUAL_BALL_WITH_MESSAGE, C0LEP.CLOSE_GONE);
    }

    public final String LIZ(TextStickerData textStickerData) {
        String audioTrackFilePath;
        long jLongValue;
        InterfaceC1452170ntP value = this.LIZLLL.g().getValue();
        String str = "";
        if (value == null || (audioTrackFilePath = textStickerData.getAudioTrackFilePath()) == null || audioTrackFilePath.length() == 0) {
            return "";
        }
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
        if (c348100DkmLIZIZ != null) {
            InterfaceC391070FUz interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF();
            if (C123100dR.LIZ(textStickerData.getNleUuid()) && interfaceC391070FUzLJFF.get(textStickerData.getNleUuid()) != null) {
                return textStickerData.getNleUuid();
            }
            C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
            c347650Dk3.LIZIZ = audioTrackFilePath;
            c347650Dk3.LIZLLL = 0L;
            c347650Dk3.LJ = textStickerData.getAudioTrackDuration();
            c347650Dk3.LJFF = textStickerData.getStartTime();
            long startTime = textStickerData.getStartTime();
            long audioTrackDuration = textStickerData.getAudioTrackDuration();
            Long lValueOf = Long.valueOf(value.getDuration());
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = audioTrackDuration;
            }
            long j = audioTrackDuration + startTime;
            if (jLongValue >= j) {
                jLongValue = j;
            }
            c347650Dk3.LJI = jLongValue;
            c347650Dk3.LJIIIZ = C0FM8.LIZ * 1.0f;
            C391360FWc.LJ("", new AwS406S0200000_5(interfaceC391070FUzLJFF, c347650Dk3, 18));
            String str2 = c347650Dk3.LIZJ;
            if (str2 != null) {
                str = str2;
            }
            textStickerData.setNleUuid(str);
            textStickerData.setHasReadTextAudio(true);
            return textStickerData.getNleUuid();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final boolean LIZIZ(TextStickerModel textStickerModel) {
        TTSModel ttsModel;
        String str;
        String str2;
        TTSModel ttsModel2 = textStickerModel.getTtsModel();
        if (ttsModel2 == null) {
            return false;
        }
        int i = ttsModel2.audioTrackIndex;
        if (!LJ(textStickerModel) || (ttsModel = textStickerModel.getTtsModel()) == null || (str = ttsModel.audioText) == null || !C123100dR.LIZ(str)) {
            return false;
        }
        TTSModel ttsModel3 = textStickerModel.getTtsModel();
        String str3 = null;
        if (ttsModel3 != null) {
            str2 = ttsModel3.audioText;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, textStickerModel.getTextStr())) {
            return false;
        }
        if (i < 0) {
            TTSModel ttsModel4 = textStickerModel.getTtsModel();
            if (ttsModel4 != null) {
                str3 = ttsModel4.nleUuid;
            }
            if (!C123100dR.LIZ(str3)) {
                return false;
            }
        }
        return true;
    }

    public final boolean LJ(TextStickerModel textStickerModel) {
        C09TL c09tl;
        C09TF c09tfKo1;
        TTSModel ttsModel = textStickerModel.getTtsModel();
        if (ttsModel == null || !ttsModel.hasReadTextAudio) {
            C0FWT c0fwt = this.LJII;
            if (c0fwt != null && (c09tfKo1 = c0fwt.ko1()) != null) {
                c09tl = c09tfKo1.LJI;
            } else {
                c09tl = null;
            }
            if (c09tl != C09TL.SUC) {
                return false;
            }
        }
        return true;
    }

    public final boolean LJFF(TextStickerModel textStickerModel) {
        String effectId;
        TTSModel ttsModel;
        TTSVoiceModel tTSVoiceModel;
        if (!LIZIZ(textStickerModel)) {
            TTSModel ttsModel2 = textStickerModel.getTtsModel();
            if (ttsModel2 != null && (tTSVoiceModel = ttsModel2.ttsVoiceModel) != null) {
                effectId = tTSVoiceModel.getEffectId();
            } else {
                effectId = null;
            }
            if (!C123100dR.LIZ(effectId) || (ttsModel = textStickerModel.getTtsModel()) == null || ttsModel.autoAddTtsFlag) {
                return false;
            }
        }
        return true;
    }

    public final void LJIIL(TextStickerModel textStickerModel) {
        String str;
        String str2;
        C0FWT c0fwt = this.LJII;
        if (c0fwt != null) {
            String textStr = textStickerModel.getTextStr();
            TTSModel ttsModel = textStickerModel.getTtsModel();
            if (ttsModel == null || (str = ttsModel.speakerID) == null) {
                str = "";
            }
            TTSModel ttsModel2 = textStickerModel.getTtsModel();
            if (ttsModel2 != null) {
                str2 = ttsModel2.voiceEffectId;
            } else {
                str2 = null;
            }
            c0fwt.Va0(textStr, str, new SpeakerCenter.KevaSpeakerBean(str2, null, null, null, "", "", false, 0L, 0L), C0F7U.LIZJ(textStickerModel), false);
        }
    }

    public final void LJIILIIL(TextStickerModel textStickerModel) {
        TTSModel ttsModel;
        String str;
        String str2;
        InterfaceC391070FUz interfaceC391070FUzLJFF;
        String str3;
        InterfaceC1452170ntP value = this.LIZLLL.g().getValue();
        if (value != null && (ttsModel = textStickerModel.getTtsModel()) != null && ttsModel.hasReadTextAudio) {
            TTSModel ttsModel2 = textStickerModel.getTtsModel();
            if (ttsModel2 != null) {
                str = ttsModel2.nleUuid;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
                if (c348100DkmLIZIZ != null && (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) != null) {
                    C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
                    TTSModel ttsModel3 = textStickerModel.getTtsModel();
                    if (ttsModel3 != null) {
                        str3 = ttsModel3.nleUuid;
                    } else {
                        str3 = null;
                    }
                    c347650Dk3.LIZJ = str3;
                    interfaceC391070FUzLJFF.LJJJI(c347650Dk3);
                }
                C0FWT c0fwt = this.LJII;
                if (c0fwt != null) {
                    TTSModel ttsModel4 = textStickerModel.getTtsModel();
                    if (ttsModel4 == null || (str2 = ttsModel4.speakerID) == null) {
                        str2 = "";
                    }
                    c0fwt.KJ(str2, C0F7U.LIZJ(textStickerModel));
                }
                TTSModel ttsModel5 = textStickerModel.getTtsModel();
                if (ttsModel5 != null) {
                    ttsModel5.hasReadTextAudio = false;
                    ttsModel5.nleUuid = "";
                    ttsModel5.audioTrackFilePath = null;
                    ttsModel5.speakerID = null;
                    ttsModel5.ttsExtraMap.put("is_instant_clone", CardStruct.IStatusCode.DEFAULT);
                    ttsModel5.ttsExtraMap.put("is_voice_clone", CardStruct.IStatusCode.DEFAULT);
                    ttsModel5.ttsExtraMap.put("is_tts_reuse_mdp", CardStruct.IStatusCode.DEFAULT);
                    ttsModel5.ttsExtraMap.put("from_tag", "");
                    ttsModel5.ttsExtraMap.put("stream_speaker_id", "");
                }
            }
        }
        LJIILL(textStickerModel);
    }

    public final void LJIILL(TextStickerModel textStickerModel) {
        C0FWO c0fwo;
        TextStickerModel textStickerModel2;
        InterfaceC391240FVq interfaceC391240FVq = this.LJI;
        StickerModel stickerModelLLJJIJI = null;
        if (interfaceC391240FVq != null) {
            c0fwo = (C0FWO) interfaceC391240FVq.LLIIIZ(EnumC1466150oFx.TEXT);
        } else {
            c0fwo = null;
        }
        int id = textStickerModel.getBaseStickerModel().getId();
        if (c0fwo != null && c0fwo.y1(id)) {
            TTSModel ttsModel = textStickerModel.getTtsModel();
            if (ttsModel == null) {
                ttsModel = new TTSModel(false, -1, "", null, null, null, 0, null, new ArrayList(), null, false, null, null, null, null, "", "", false, 0L, 0L, new ArrayList(), new TTSAudioBean(null, 1, null), false, "", new LinkedHashMap(), false);
            }
            c0fwo.W0(ttsModel, textStickerModel.getBaseStickerModel().getStartTime(), textStickerModel.getBaseStickerModel().getEndTime());
            return;
        }
        InterfaceC391240FVq interfaceC391240FVq2 = this.LJI;
        if (interfaceC391240FVq2 != null) {
            stickerModelLLJJIJI = interfaceC391240FVq2.LLJJIJI(textStickerModel.getBaseStickerModel().getId());
        }
        if ((stickerModelLLJJIJI instanceof TextStickerModel) && (textStickerModel2 = (TextStickerModel) stickerModelLLJJIJI) != null) {
            this.LJI.k3(TextStickerModel.copy$default(textStickerModel2, BaseStickerModel.copy$default(textStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, textStickerModel.getBaseStickerModel().getStartTime(), textStickerModel.getBaseStickerModel().getEndTime(), false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -100663297, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, textStickerModel.getTtsModel(), null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -32770, 65535, null), EnumC356070Dxd.COMMIT);
            StickerModel stickerModelLLJJIJI2 = this.LJI.LLJJIJI(textStickerModel2.getBaseStickerModel().getId());
            if (stickerModelLLJJIJI2 == null) {
                return;
            }
            this.LJI.h12(stickerModelLLJJIJI2);
        }
    }

    public final void LJIIIZ(TextStickerModel textStickerModel, String str) {
        String str2 = str;
        if (!C2279808wW.LIZIZ(textStickerModel.getTextStr())) {
            Activity activity = this.LIZIZ;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131829881);
            C1390380mHk.LIZ(activity, 1018, creativeToastBuilder);
            return;
        }
        C0FWY c0fwy = C0FWY.LIZ;
        ShortVideoCommonParams shortVideoCommonParamsLIZJ = LIZJ();
        if (str2 == null) {
            str2 = "text_edit_panel";
        }
        C0FWY.LIZJ(c0fwy, shortVideoCommonParamsLIZJ, "auto", str2, LIZLLL(textStickerModel), null, false, 48);
        this.LJIILL = true;
        C0FWT c0fwt = this.LJII;
        if (c0fwt != null) {
            c0fwt.Va0(textStickerModel.getTextStr(), SpeakerCenter.LIZLLL(), new SpeakerCenter.KevaSpeakerBean(SpeakerCenter.LJ(), null, null, null, "", "", false, 0L, 0L), C0F7U.LIZJ(textStickerModel), false);
        }
    }

    public final void LJIIJ(TextStickerModel textStickerModel, boolean z) {
        String str;
        String str2;
        TTSModel ttsModel;
        String str3;
        if (this.LJIILJJIL) {
            return;
        }
        if (!LIZIZ(textStickerModel) && (ttsModel = textStickerModel.getTtsModel()) != null && ttsModel.ttsVoiceModel != null) {
            InterfaceC1452170ntP value = this.LIZLLL.g().getValue();
            if (value != null) {
                TTSModel ttsModel2 = textStickerModel.getTtsModel();
                if (ttsModel2 != null) {
                    ttsModel2.hasReadTextAudio = false;
                }
                TTSModel ttsModel3 = textStickerModel.getTtsModel();
                if (ttsModel3 != null) {
                    ttsModel3.autoAddTtsFlag = true;
                }
                TTSModel ttsModel4 = textStickerModel.getTtsModel();
                if (ttsModel4 != null) {
                    ttsModel4.audioText = null;
                }
                TTSModel ttsModel5 = textStickerModel.getTtsModel();
                if (ttsModel5 != null) {
                    ttsModel5.nleUuid = "";
                }
                TTSModel ttsModel6 = textStickerModel.getTtsModel();
                if (ttsModel6 != null) {
                    ttsModel6.audioTrackIndex = -1;
                }
                TTSModel ttsModel7 = textStickerModel.getTtsModel();
                if (ttsModel7 != null) {
                    ttsModel7.audioTrackFilePath = null;
                }
                if ((C196909122h.LIZIZ().LIZIZ.LIZJ || (C196909122h.LIZIZ().LIZIZ.LIZIZ && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_tts_phase_one_use_loki", true, false))) && textStickerModel.getTextStr().length() > 0) {
                    LJIIL(textStickerModel);
                    TTSModel ttsModel8 = textStickerModel.getTtsModel();
                    if (ttsModel8 != null && ttsModel8.ttsVoiceModel != null) {
                        str3 = "auto";
                    } else {
                        str3 = "user_click";
                    }
                    C0FWY.LIZJ(C0FWY.LIZ, LIZJ(), null, "bubble", str3, null, false, 50);
                }
                value.nf((int) (textStickerModel.getBaseStickerModel().getStartTime() * LSPassThroughRecordSizeConfig.DEFAULT), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                value.play();
            }
            LJIILL(textStickerModel);
            return;
        }
        if (z) {
            LJIILJJIL(textStickerModel, 0);
            return;
        }
        InterfaceC1452170ntP value2 = this.LIZLLL.g().getValue();
        if (value2 != null) {
            TTSModel ttsModel9 = textStickerModel.getTtsModel();
            if (ttsModel9 != null && (str = ttsModel9.nleUuid) != null && C123100dR.LIZ(str)) {
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value2);
                if (c348100DkmLIZIZ != null) {
                    InterfaceC391070FUz interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF();
                    C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
                    TTSModel ttsModel10 = textStickerModel.getTtsModel();
                    if (ttsModel10 != null) {
                        str2 = ttsModel10.nleUuid;
                    } else {
                        str2 = null;
                    }
                    c347650Dk3.LIZJ = str2;
                    interfaceC391070FUzLJFF.LJJJI(c347650Dk3);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            TTSModel ttsModel11 = textStickerModel.getTtsModel();
            if (ttsModel11 != null) {
                ttsModel11.hasReadTextAudio = false;
            }
            TTSModel ttsModel12 = textStickerModel.getTtsModel();
            if (ttsModel12 != null) {
                ttsModel12.audioText = null;
            }
            TTSModel ttsModel13 = textStickerModel.getTtsModel();
            if (ttsModel13 != null) {
                ttsModel13.nleUuid = "";
            }
            TTSModel ttsModel14 = textStickerModel.getTtsModel();
            if (ttsModel14 != null) {
                ttsModel14.audioTrackIndex = -1;
            }
            TTSModel ttsModel15 = textStickerModel.getTtsModel();
            if (ttsModel15 != null) {
                ttsModel15.audioTrackFilePath = null;
            }
            if (C196909122h.LIZIZ().LIZIZ.LIZJ) {
                if (!a0.LJJJIL(textStickerModel.getTextStr())) {
                    LJIIL(textStickerModel);
                }
            } else if (textStickerModel.getTextStr().length() > 0) {
                C391040FUw.LIZ.getClass();
                Keva keva = C391040FUw.LIZIZ;
                if (keva.getInt("read_text_change_toast", 0) < 3) {
                    C1638280sja c1638280sja = C21366318jV.LIZLLL;
                    Activity activity = this.LIZIZ;
                    c1638280sja.getClass();
                    C1638280sja.LIZJ(2131829882, 0, activity).LIZ();
                    keva.storeInt("read_text_change_toast", keva.getInt("read_text_change_toast", 0) + 1);
                }
            }
            value2.nf((int) (textStickerModel.getBaseStickerModel().getStartTime() * LSPassThroughRecordSizeConfig.DEFAULT), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            value2.play();
        }
        LJIILL(textStickerModel);
    }

    public final void LJIILJJIL(TextStickerModel textStickerModel, Integer num) {
        InterfaceC1452170ntP value;
        this.LIZLLL.mw0(true);
        ProgressDialogC1399790mWv progressDialogC1399790mWv = this.LJIIJ;
        if (progressDialogC1399790mWv != null) {
            progressDialogC1399790mWv.cancel();
        }
        this.LJIIJ = C576210Mip.LIZ(this.LIZIZ, EnumC1399820mWy.VISIBLE, new InterfaceC1399800mWw() { // from class: X.0FWR
            @Override // X.InterfaceC1399800mWw
            public final void LIZ() {
                if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                    InterfaceC391390FWf interfaceC391390FWfInvoke = this.LIZ.LJFF.invoke();
                    if (interfaceC391390FWfInvoke != null) {
                        interfaceC391390FWfInvoke.o();
                        return;
                    }
                    return;
                }
                InterfaceC391390FWf interfaceC391390FWf = this.LIZ.LJ;
                if (interfaceC391390FWf != null) {
                    interfaceC391390FWf.o();
                }
            }
        });
        ProgressDialogC1399790mWv progressDialogC1399790mWv2 = this.LJIIJ;
        if (progressDialogC1399790mWv2 != null) {
            progressDialogC1399790mWv2.setMessage(this.LIZIZ.getString(R.string.txr));
        }
        ProgressDialogC1399790mWv progressDialogC1399790mWv3 = this.LJIIJ;
        if (progressDialogC1399790mWv3 != null) {
            C786410Ut5.O4(progressDialogC1399790mWv3);
            LJII(true);
            if (num != null && (value = this.LIZLLL.g().getValue()) != null) {
                value.nf(num.intValue() * LSPassThroughRecordSizeConfig.DEFAULT, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            }
            InterfaceC1452170ntP value2 = this.LIZLLL.g().getValue();
            if (value2 != null) {
                value2.pause();
            }
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                InterfaceC391390FWf interfaceC391390FWfInvoke = this.LJFF.invoke();
                if (interfaceC391390FWfInvoke != null) {
                    interfaceC391390FWfInvoke.Ix1(new C11YM(C0F7U.LIZJ(textStickerModel)), textStickerModel.getTextStr(), null, (C11YV) this.LJIIJJI.getValue());
                    return;
                }
                return;
            }
            InterfaceC391390FWf interfaceC391390FWf = this.LJ;
            if (interfaceC391390FWf == null) {
                return;
            }
            interfaceC391390FWf.Ix1(new C11YM(C0F7U.LIZJ(textStickerModel)), textStickerModel.getTextStr(), null, (C11YV) this.LJIIJJI.getValue());
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJIILLIIL(String str, String str2) {
        C0FWO c0fwo;
        InterfaceC391240FVq interfaceC391240FVq = this.LJI;
        if (interfaceC391240FVq != null && (c0fwo = (C0FWO) interfaceC391240FVq.LLIIIZ(EnumC1466150oFx.TEXT)) != null) {
            c0fwo.f5(new Pair<>(str, str2));
        }
    }

    public final void LJI(TextStickerModel textStickerModel, String str, String str2) {
        String str3 = str2;
        this.LJIILJJIL = true;
        C0FWT c0fwt = this.LJII;
        if (c0fwt != null) {
            c0fwt.Bt2(true, true, C0F7U.LIZJ(textStickerModel), "tts_toolBar", AFwS191S0000000_5.get$arr$(77), AFwS191S0000000_5.get$arr$(78));
        }
        C0FWY c0fwy = C0FWY.LIZ;
        ShortVideoCommonParams shortVideoCommonParamsLIZJ = LIZJ();
        if (str3 == null) {
            str3 = "text_edit_panel";
        }
        C0FWY.LIZJ(c0fwy, shortVideoCommonParamsLIZJ, "manual", str3, str, null, false, 48);
    }

    public final int LJIIIIZZ(TextStickerModel textStickerModel, String str, boolean z) {
        String str2;
        String audioText;
        InterfaceC1452170ntP value;
        String str3;
        InterfaceC1452170ntP value2;
        boolean z2;
        boolean z3;
        boolean z4;
        String str4;
        List<C0FTJ<StickerModel>> listLLLLLZ;
        String str5 = str;
        String str6 = "text_edit_panel";
        if (str5 != null) {
            if (Intrinsics.LJFF(str5, "text_edit_panel_force")) {
                this.LIZJ.creativeModel.ttsModel.enterMethod = "text_edit_panel";
            } else {
                this.LIZJ.creativeModel.ttsModel.enterMethod = str5;
            }
        }
        String str7 = null;
        if (z) {
            C391040FUw.LIZ.getClass();
            C391040FUw.LIZIZ();
            boolean zLJ = LJ(textStickerModel);
            InterfaceC391240FVq interfaceC391240FVq = this.LJI;
            if (interfaceC391240FVq != null && (listLLLLLZ = interfaceC391240FVq.LLLLLZ(EnumC1466150oFx.TEXT)) != null) {
                Iterator<C0FTJ<StickerModel>> it2 = listLLLLLZ.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getStickerId() == textStickerModel.getId()) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
            }
            boolean z5 = !z2;
            if (SpeakerCenter.LJFF() && !this.LJIIIIZZ.LN1() && !C0FWS.LIZIZ(this.LIZJ.isApplyVoiceToAllTextOpen())) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zLIZLLL = C11YF.LIZLLL();
            if (SpeakerCenter.LJFF() && !C0FWS.LIZIZ(this.LIZJ.isApplyVoiceToAllTextOpen())) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z5 && z3) {
                LJIIIZ(textStickerModel, str5);
                return 1;
            }
            if (zLJ) {
                LJI(textStickerModel, LIZLLL(textStickerModel), str5);
                return 0;
            }
            if (z5) {
                if (zLIZLLL) {
                    C0FWY c0fwy = C0FWY.LIZ;
                    ShortVideoCommonParams shortVideoCommonParamsLIZJ = LIZJ();
                    if (str5 == null) {
                        str5 = "small_icon";
                    }
                    C0FWY.LIZJ(c0fwy, shortVideoCommonParamsLIZJ, "manual", str5, LIZLLL(textStickerModel), null, false, 48);
                    C0FWT c0fwt = this.LJII;
                    if (c0fwt != null) {
                        c0fwt.Va0(textStickerModel.getTextStr(), "", new SpeakerCenter.KevaSpeakerBean("", null, null, null, "", "", false, 0L, 0L), C0F7U.LIZJ(textStickerModel), true);
                    }
                    return 1;
                }
                LJI(textStickerModel, LIZLLL(textStickerModel), str5);
                return 0;
            }
            if (z4) {
                if (!C2279808wW.LIZIZ(textStickerModel.getTextStr())) {
                    Activity activity = this.LIZIZ;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131829881);
                    C1390380mHk.LIZ(activity, 1018, creativeToastBuilder);
                } else {
                    C0FWY c0fwy2 = C0FWY.LIZ;
                    ShortVideoCommonParams shortVideoCommonParamsLIZJ2 = LIZJ();
                    if (str5 != null) {
                        str6 = str5;
                    }
                    C0FWY.LIZJ(c0fwy2, shortVideoCommonParamsLIZJ2, "auto", str6, LIZLLL(textStickerModel), null, false, 48);
                    C0FWT c0fwt2 = this.LJII;
                    if (c0fwt2 != null) {
                        String textStr = textStickerModel.getTextStr();
                        TTSModel ttsModel = textStickerModel.getTtsModel();
                        if (ttsModel == null || (str4 = ttsModel.speakerID) == null) {
                            str4 = "";
                        }
                        TTSModel ttsModel2 = textStickerModel.getTtsModel();
                        if (ttsModel2 != null) {
                            str7 = ttsModel2.voiceEffectId;
                        }
                        c0fwt2.Va0(textStr, str4, new SpeakerCenter.KevaSpeakerBean(str7, null, null, null, "", "", false, 0L, 0L), C0F7U.LIZJ(textStickerModel), false);
                        return 1;
                    }
                }
                return 1;
            }
            if (zLIZLLL) {
                LJIIIZ(textStickerModel, str5);
                return 1;
            }
            LJI(textStickerModel, LIZLLL(textStickerModel), str5);
            return 0;
        }
        String str8 = "bubble";
        if (C311110CHl.LIZ()) {
            if (this.LJII != null) {
                if (LJ(textStickerModel)) {
                    C0FWY c0fwy3 = C0FWY.LIZ;
                    ShortVideoCommonParams shortVideoCommonParamsLIZJ3 = LIZJ();
                    String strLIZLLL = LIZLLL(textStickerModel);
                    c0fwy3.getClass();
                    C0FWY.LIZIZ(shortVideoCommonParamsLIZJ3, strLIZLLL);
                } else {
                    C0FWY c0fwy4 = C0FWY.LIZ;
                    ShortVideoCommonParams shortVideoCommonParamsLIZJ4 = LIZJ();
                    if (str5 != null) {
                        str8 = str5;
                    }
                    C0FWY.LIZJ(c0fwy4, shortVideoCommonParamsLIZJ4, "auto", str8, LIZLLL(textStickerModel), null, false, 48);
                }
                if (!C0FWS.LIZIZ(this.LIZJ.isApplyVoiceToAllTextOpen()) && SpeakerCenter.LJFF() && !LJ(textStickerModel)) {
                    this.LJII.Va0(textStickerModel.getTextStr(), SpeakerCenter.LIZ(), SpeakerCenter.LIZIZ(), C0F7U.LIZJ(textStickerModel), false);
                    return 1;
                }
                if (LJ(textStickerModel)) {
                    C391040FUw.LIZ.getClass();
                    C391040FUw.LIZ(true);
                }
                this.LJII.Bt2(true, false, C0F7U.LIZJ(textStickerModel), "tts_actionSheet", AFwS191S0000000_5.get$arr$(77), AFwS191S0000000_5.get$arr$(78));
                return 0;
            }
            return 1;
        }
        TTSModel ttsModel3 = textStickerModel.getTtsModel();
        if (ttsModel3 != null && ttsModel3.ttsVoiceModel != null) {
            str2 = "auto";
        } else {
            str2 = "user_click";
        }
        if (!C790050Uyx.LIZ(this.LIZIZ)) {
            Activity activity2 = this.LIZIZ;
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(2131829876);
            creativeToastBuilder2.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity2, 6001, creativeToastBuilder2);
        } else if (LJ(textStickerModel)) {
            C0FWY.LIZ(C0FWY.LIZ, LIZJ(), null, null, 6);
            TTSModel ttsModel4 = textStickerModel.getTtsModel();
            if (ttsModel4 != null && (str3 = ttsModel4.nleUuid) != null && C123100dR.LIZ(str3) && (value2 = this.LIZLLL.g().getValue()) != null) {
                value2.nf((int) textStickerModel.getBaseStickerModel().getStartTime(), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            }
            LJIILIIL(textStickerModel);
            InterfaceC1452170ntP value3 = this.LIZLLL.g().getValue();
            if (value3 != null) {
                value3.play();
                return 1;
            }
        } else {
            C0FWY c0fwy5 = C0FWY.LIZ;
            ShortVideoCommonParams shortVideoCommonParamsLIZJ5 = LIZJ();
            if (str5 != null) {
                str8 = str5;
            }
            C0FWY.LIZJ(c0fwy5, shortVideoCommonParamsLIZJ5, null, str8, str2, null, false, 50);
            TextStickerData textStickerDataLIZJ = C0F7U.LIZJ(textStickerModel);
            String audioTrackFilePath = textStickerDataLIZJ.getAudioTrackFilePath();
            if (audioTrackFilePath != null && audioTrackFilePath.length() > 0 && new C0VSJ(textStickerDataLIZJ.getAudioTrackFilePath()).exists() && (audioText = textStickerDataLIZJ.getAudioText()) != null && audioText.length() > 0 && (!textStickerDataLIZJ.getTextWrapList().isEmpty()) && Intrinsics.LJFF(textStickerDataLIZJ.getAudioText(), C123P.LJIIIIZZ(textStickerDataLIZJ.getTextWrapList()))) {
                String audioTrackFilePath2 = textStickerDataLIZJ.getAudioTrackFilePath();
                if (audioTrackFilePath2 != null && (value = this.LIZLLL.g().getValue()) != null && audioTrackFilePath2.length() > 0) {
                    value.nf(textStickerDataLIZJ.getStartTime(), VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                    LIZ(textStickerDataLIZJ);
                }
                LJIIJJI();
                return 1;
            }
            if (C2279808wW.LIZIZ(textStickerModel.getTextStr())) {
                LJIILJJIL(textStickerModel, null);
                return 1;
            }
            Activity activity3 = this.LIZIZ;
            CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
            creativeToastBuilder3.messageRes(2131829881);
            creativeToastBuilder3.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity3, 1019, creativeToastBuilder3);
            return 1;
        }
        return 1;
    }

    public C0FWP(C0FVG c0fvg, Activity activity, VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM, InterfaceC391390FWf interfaceC391390FWf, AwS549S0100000_5 awS549S0100000_5, InterfaceC391240FVq interfaceC391240FVq, C0FWT c0fwt, InterfaceC2378409Tq interfaceC2378409Tq, AwS549S0100000_5 awS549S0100000_52) {
        this.LIZ = c0fvg;
        this.LIZIZ = activity;
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = interfaceC1455860nzM;
        this.LJ = interfaceC391390FWf;
        this.LJFF = awS549S0100000_5;
        this.LJI = interfaceC391240FVq;
        this.LJII = c0fwt;
        this.LJIIIIZZ = interfaceC2378409Tq;
        this.LJIIIZ = awS549S0100000_52;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LJIIZILJ = c560530Lyd;
        this.LJIJ = c560530Lyd;
    }
}

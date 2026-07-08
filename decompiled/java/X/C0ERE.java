package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ERE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ERE implements InterfaceC379610EuV, InterfaceC350230DoD, C0EMV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C1664750tQH LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ERE.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0ERE.class, "epInitLegacyApi", "getEpInitLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0ERE.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C0ERE(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
        C1664770tQJ.LIZ(c1drg, C0EC7.class, null);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
        VideoPublishEditModel videoPublishEditModel;
        VideoPublishEditModel videoPublishEditModel2;
        boolean z;
        C0FVT c0fvtKR;
        List<StickerItemModel> list;
        ArrayList<StickerItemModel> arrayList;
        if (c0emo.LIZ() == null || (videoPublishEditModel = c0emo.LIZIZ) == null || (videoPublishEditModel2 = c0emo.LIZJ) == null) {
            return;
        }
        if (!C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel2)) {
            C122Q c122qLIZJ = ((InterfaceC1455850nzL) this.LLILLJJLI.getValue(this, LLILZ[0])).uR1().LIZJ();
            if (c122qLIZJ != null) {
                c122qLIZJ.i();
            }
            C1416310mxZ.LJ(videoPublishEditModel2);
        }
        boolean zLJJLIIIJJIZ = C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel2);
        if (videoPublishEditModel2.creativeModel.nowsShootModel != null) {
            z = true;
        } else {
            z = false;
        }
        C1664750tQH c1664750tQH = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        InterfaceC1461350o8D interfaceC1461350o8DLIZJ = ((InterfaceC1455850nzL) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0])).TI1().LIZJ();
        if (interfaceC1461350o8DLIZJ != null) {
            interfaceC1461350o8DLIZJ.u1();
        }
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ = ((InterfaceC1455850nzL) this.LLILLJJLI.getValue(this, interfaceC2217461BqaArr[0])).AT().LIZJ();
        ArrayList<StickerItemModel> arrayList2 = null;
        if (interfaceC1461660o8iLIZJ != null) {
            c0fvtKR = interfaceC1461660o8iLIZJ.kR();
        } else {
            c0fvtKR = null;
        }
        if (zLJJLIIIJJIZ) {
            if (c0fvtKR != null) {
                c0fvtKR.hj(VideoPublishEditModel.makeCopy(videoPublishEditModel));
                c0fvtKR.Dj();
            }
        } else {
            C122Q c122qLIZJ2 = ((InterfaceC1455850nzL) this.LLILLJJLI.getValue(this, interfaceC2217461BqaArr[0])).uR1().LIZJ();
            if (c122qLIZJ2 != null) {
                Context context = (Context) this.LLILLL.getValue(this, interfaceC2217461BqaArr[2]);
                InlineCaptionModel inlineCaptionModel = videoPublishEditModel2.creativeModel.inlineCaptionModel;
                if (inlineCaptionModel != null) {
                    arrayList2 = inlineCaptionModel.utterances;
                }
                if (!u4.LJLJLLL(videoPublishEditModel2) && arrayList2 != null) {
                    for (StickerItemModel stickerItemModel : arrayList2) {
                        C364470EQr.LIZ.getClass();
                        TextStickerData textStickerDataLIZIZ = C364470EQr.LIZIZ(stickerItemModel);
                        if (textStickerDataLIZIZ != null) {
                            textStickerDataLIZIZ.setAddToLayout(false);
                            c122qLIZJ2.y92(textStickerDataLIZIZ);
                        }
                    }
                }
                Pair<Float, Float> pairCc = c122qLIZJ2.Cc(context);
                InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
                if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                    ArrayList<StickerItemModel> arrayList3 = new ArrayList();
                    for (StickerItemModel stickerItemModel2 : list) {
                        if (stickerItemModel2.type == 2) {
                            arrayList3.add(stickerItemModel2);
                        }
                    }
                    for (StickerItemModel stickerItemModel3 : arrayList3) {
                        C364470EQr.LIZ.getClass();
                        TextStickerData textStickerDataLIZIZ2 = C364470EQr.LIZIZ(stickerItemModel3);
                        if (textStickerDataLIZIZ2 != null) {
                            textStickerDataLIZIZ2.setX(textStickerDataLIZIZ2.getX() * pairCc.getFirst().floatValue());
                            textStickerDataLIZIZ2.setY(textStickerDataLIZIZ2.getY() * pairCc.getSecond().floatValue());
                            if (textStickerDataLIZIZ2.isTextSticker()) {
                                textStickerDataLIZIZ2.setShowOnScreen(false);
                                textStickerDataLIZIZ2.setX(textStickerDataLIZIZ2.getX() - ScreenUtils.getScreenWidth(context));
                                c122qLIZJ2.Ct(textStickerDataLIZIZ2, true);
                            } else if (textStickerDataLIZIZ2.isCaption()) {
                                textStickerDataLIZIZ2.setAddToLayout(false);
                                textStickerDataLIZIZ2.setCaptionOnlyShowDeleteBubble(z);
                                textStickerDataLIZIZ2.setTextWrapList(C1697810uHb.LJ(C123P.LIZJ(C123P.LJIILJJIL(textStickerDataLIZIZ2, context))));
                                c122qLIZJ2.y92(textStickerDataLIZIZ2);
                                if (videoPublishEditModel2.creativeModel.inlineCaptionModel != null) {
                                    StickerItemModel stickerItemModelLIZ = C0F7Y.LIZ(textStickerDataLIZIZ2, stickerItemModel3.layerWeight);
                                    if (arrayList2 == null) {
                                        InlineCaptionModel inlineCaptionModel2 = videoPublishEditModel2.creativeModel.inlineCaptionModel;
                                        if (inlineCaptionModel2 != null) {
                                            inlineCaptionModel2.utterances = C1697810uHb.LJ(stickerItemModelLIZ);
                                        }
                                    } else {
                                        InlineCaptionModel inlineCaptionModel3 = videoPublishEditModel2.creativeModel.inlineCaptionModel;
                                        if (inlineCaptionModel3 != null && (arrayList = inlineCaptionModel3.utterances) != null) {
                                            arrayList.add(stickerItemModelLIZ);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewTextStickerTask-render: ");
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(Integer.toHexString(videoPublishEditModel2.hashCode()));
        sbLIZ2.append("textSticker{");
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        for (TextStickerModel textStickerModel : videoPublishEditModel2.creativeModel.stickerModel.textStickerModels) {
            sb.append(textStickerModel.getTextStr());
            sb.append(":");
            sb.append(textStickerModel.getBaseStickerModel().getStartTime());
            sb.append("-");
            sb.append(textStickerModel.getBaseStickerModel().getEndTime());
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('[');
            sbLIZ3.append(textStickerModel.getUuid());
            sbLIZ3.append(']');
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            sb.append(", ");
        }
        sb.append("}");
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append('[');
        sbLIZ4.append(videoPublishEditModel2.creativeModel.stickerModel.textStickerModels.size());
        sbLIZ4.append(']');
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        sbLIZ.append(sb.toString());
        C201955140j.LIZLLL(c563650M8t, "EPSyncTask", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel] */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel] */
    /* JADX WARN: Type inference failed for: r34v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel] */
    /* JADX WARN: Type inference failed for: r35v1, types: [X.0FVR] */
    /* JADX WARN: Type inference failed for: r36v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMobModel] */
    /* JADX WARN: Type inference failed for: r38v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r41v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r46v1, types: [X.0F7S] */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel] */
    /* JADX WARN: Type inference failed for: r48v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel] */
    /* JADX WARN: Type inference failed for: r50v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r51v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r54v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel] */
    /* JADX WARN: Type inference failed for: r55v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel] */
    /* JADX WARN: Type inference failed for: r56v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextEventTrackingModel] */
    /* JADX WARN: Type inference failed for: r57v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.EditViewUIState] */
    /* JADX WARN: Type inference failed for: r58v1, types: [X.0F7T] */
    /* JADX WARN: Type inference failed for: r59v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.StoryStreakTextStickerStyleModel] */
    /* JADX WARN: Type inference failed for: r62v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r66v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel] */
    @Override // X.InterfaceC350230DoD
    public final void LIZIZ(C348820Dlw c348820Dlw) {
        VideoPublishEditModel videoPublishEditModel;
        boolean z;
        ArrayList arrayList;
        TextStickerModel textStickerModel;
        boolean z2;
        List<StickerItemModel> list;
        boolean z3;
        String str;
        BaseStickerModel baseStickerModelCopy$default;
        Object next;
        NLEModel nLEModelLIZ = c348820Dlw.LIZ();
        if (nLEModelLIZ == null || (videoPublishEditModel = c348820Dlw.LIZIZ) == null) {
            return;
        }
        EditModelProvider.Companion.getClass();
        C386320FCs editorProFileCenter = C0E1T.LIZ().getEditorProFileCenter();
        C364470EQr.LIZ.getClass();
        if (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList = new ArrayList(videoPublishEditModel.creativeModel.stickerModel.textStickerModels);
        } else {
            arrayList = null;
        }
        C1416310mxZ.LJ(videoPublishEditModel);
        Iterator it2 = ((ArrayList) C351220Dpo.LJLLI(nLEModelLIZ)).iterator();
        int i = 0;
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr sortedSlots = ((NLETrack) it2.next()).getSortedSlots();
            ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                if (C351220Dpo.LJJZZI(nLETrackSlot) == EnumC356170Dxn.TEXT_STICKER) {
                    arrayList2.add(nLETrackSlot);
                }
            }
            for (NLETrackSlot nLETrackSlot2 : arrayList2) {
                C364470EQr.LIZ.getClass();
                try {
                    TextStickerData textStickerDataLIZ = C364470EQr.LIZ(i, nLETrackSlot2);
                    if (textStickerDataLIZ != null) {
                        if (arrayList != null) {
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (Intrinsics.LJFF(((TextStickerModel) next).getUuid(), nLETrackSlot2.getUUID())) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            textStickerModel = (TextStickerModel) next;
                        } else {
                            textStickerModel = null;
                        }
                        if (editorProFileCenter != null) {
                            String audioTrackFilePath = textStickerDataLIZ.getAudioTrackFilePath();
                            if (audioTrackFilePath == null) {
                                audioTrackFilePath = "";
                            }
                            editorProFileCenter.LIZ.remove(audioTrackFilePath);
                        }
                        if (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (!nLETrackSlot2.hasExtra("text_tts_id") && !textStickerDataLIZ.getHasReadTextAudio()) {
                                textStickerDataLIZ.setNleUuid("");
                                textStickerDataLIZ.setAudioText(null);
                                textStickerDataLIZ.setAudioTrackFilePath(null);
                                textStickerDataLIZ.setAudioTrackDuration(0);
                                textStickerDataLIZ.setSpeakerID(null);
                                textStickerDataLIZ.setHasReadTextAudio(false);
                            }
                            Pair pair = new Pair(Integer.valueOf(C1415610mwR.LIZIZ()), Integer.valueOf(C1415610mwR.LIZ()));
                            textStickerDataLIZ.setX(textStickerDataLIZ.getX() * ((Number) pair.getFirst()).floatValue());
                            textStickerDataLIZ.setY(textStickerDataLIZ.getY() * ((Number) pair.getSecond()).floatValue());
                            textStickerDataLIZ.setLayoutWidth(((Number) pair.getFirst()).intValue());
                            textStickerDataLIZ.setLayoutHeight(((Number) pair.getSecond()).intValue());
                            TextStickerModel textStickerModelLIZLLL = C0F7U.LIZLLL(textStickerDataLIZ, true, new Pair(Integer.valueOf(((Number) pair.getFirst()).intValue() / 2), Integer.valueOf(((Number) pair.getSecond()).intValue() / 2)));
                            if (textStickerModel != null) {
                                TextStickerInfo textStickerInfo = textStickerModel.getTextStickerInfo();
                                if (C0F8Y.LJII(textStickerModelLIZLLL)) {
                                    str = null;
                                    baseStickerModelCopy$default = BaseStickerModel.copy$default(textStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, true, 0.0f, null, null, null, false, -1073741825, 15, null);
                                } else {
                                    str = null;
                                    baseStickerModelCopy$default = BaseStickerModel.copy$default(textStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null);
                                }
                                textStickerModelLIZLLL = TextStickerModel.copy$default(textStickerModelLIZLLL, baseStickerModelCopy$default, str, str, str, str, 0, 0, 0, 0.0f, str, false, false, false, false, false, str, textStickerInfo, str, str, str, str, str, str, false, str, 0L, 0L, str, str, str, false, str, str, false, false, str, str, str, str, str, str, false, false, str, false, false, false, str, -65538, 65535, str);
                            }
                            textStickerModelLIZLLL.setUuid(nLETrackSlot2.getUUID());
                            textStickerModelLIZLLL.getBaseStickerModel().setUiStartTime(textStickerDataLIZ.getStartTime());
                            textStickerModelLIZLLL.getBaseStickerModel().setUiEndTime(textStickerDataLIZ.getEndTime());
                            textStickerModelLIZLLL.getBaseStickerModel().setStartTime(textStickerDataLIZ.getStartTime());
                            textStickerModelLIZLLL.getBaseStickerModel().setEndTime(textStickerDataLIZ.getEndTime());
                            textStickerModelLIZLLL.getBaseStickerModel().setManuallyClipped(true);
                            TextMotionModel textMotionModel = textStickerModelLIZLLL.getTextMotionModel();
                            Integer numLJJJLZIJ = C351220Dpo.LJJJLZIJ(nLETrackSlot2, "motion_enabled_on_last_use", null);
                            if (numLJJJLZIJ != null && numLJJJLZIJ.intValue() == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            textStickerModelLIZLLL.setTextMotionModel(TextMotionModel.LIZ(textMotionModel, null, 0.0f, 0, null, null, 0, z3, 895));
                            NLESegmentSticker nLESegmentStickerDynamicCast = NLESegmentSticker.dynamicCast(nLETrackSlot2.getMainSegment());
                            if (nLESegmentStickerDynamicCast != null && nLESegmentStickerDynamicCast.getAnimation() != null) {
                                textStickerModelLIZLLL.setTextMotionModel(TextMotionModel.LIZ(textStickerModelLIZLLL.getTextMotionModel(), null, 0.0f, 0, null, null, 1, false, 959));
                            }
                            textStickerModelLIZLLL.getBaseStickerModel().setEnableNLEChange(true);
                            videoPublishEditModel.creativeModel.stickerModel.textStickerModels.add(textStickerModelLIZLLL);
                        } else {
                            StickerItemModel stickerItemModel = new StickerItemModel();
                            stickerItemModel.extra = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerDataLIZ);
                            stickerItemModel.type = 2;
                            stickerItemModel.startTime = textStickerDataLIZ.getStartTime();
                            stickerItemModel.endTime = textStickerDataLIZ.getEndTime();
                            InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
                            if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                                list.add(stickerItemModel);
                            }
                        }
                        i++;
                    }
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    @Override // X.C0EMV
    public final void LIZJ(C0EMO c0emo) {
        LIZ(c0emo);
    }

    @Override // X.C0EMV
    public final void LJ(C0EMO c0emo) {
        LIZ(c0emo);
    }
}

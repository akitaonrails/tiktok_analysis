package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoTransitionEffectParam;
import com.ss.android.ugc.aweme.creative.model.magic.CombineEffectPointModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.i1;
import defpackage.k1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366720EZi {
    public static List LIZ(final C554970Lpf c554970Lpf) {
        return C1697810uHb.LJ(new C389010FNb(c554970Lpf), new C0EWG(c554970Lpf), new C371970EiB(c554970Lpf), new C366430EYf(c554970Lpf), new C366710EZh(c554970Lpf), new AbstractC365860EWa<MvCreateVideoData>(c554970Lpf) { // from class: X.0FAN
            public final C554970Lpf LIZLLL;
            public final InterfaceC1635410sex LJ;
            public final int LJFF;
            public final int LJI;

            @Override // X.AbstractC365860EWa
            public final void LJIIJ() {
            }

            @Override // X.AbstractC365860EWa
            public final List<MvCreateVideoData> LJIIL() {
                MvCreateVideoData mvCreateVideoData = this.LIZLLL.LJ.LJJJJIZL.mvCreateVideoData;
                return (mvCreateVideoData == null || C366770EZn.LIZ(mvCreateVideoData.mvId) || (C570490MZb.LJ(mvCreateVideoData.mvResUnzipPath) && TEVideoUtils.nativeCheckMVResourceIntegrity(mvCreateVideoData.mvResUnzipPath) == 0)) ? C13BV.INSTANCE : C1697810uHb.LJ(mvCreateVideoData);
            }

            @Override // X.InterfaceC365900EWe
            public final int LIZIZ() {
                return this.LJFF;
            }

            @Override // X.AbstractC365860EWa
            public final InterfaceC1635410sex LJIIIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC365900EWe
            public final C554970Lpf getParams() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC365900EWe
            public final int getPriority() {
                return this.LJI;
            }

            {
                InterfaceC1635410sex interfaceC1635410sexLIZ;
                this.LIZLLL = c554970Lpf;
                if (C297340Bl6.LIZIZ()) {
                    interfaceC1635410sexLIZ = EffectService.Companion.getInstance().createMvEffectPlatform(C0CHQ.LIZ);
                    if (interfaceC1635410sexLIZ == null) {
                        interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, AFwS234S0000000_5.get$arr$(489));
                    }
                } else {
                    interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, AFwS234S0000000_5.get$arr$(490));
                }
                this.LJ = interfaceC1635410sexLIZ;
                this.LJFF = 6;
                this.LJI = 900;
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                MvCreateVideoData mvCreateVideoData = this.LIZLLL.LJ.LJJJJIZL.mvCreateVideoData;
                boolean z = true;
                if (mvCreateVideoData != null && !C366770EZn.LIZ(mvCreateVideoData.mvId)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
                String str;
                MvCreateVideoData mvCreateVideoData = awemeDraft.LJJJJIZL.mvCreateVideoData;
                if (mvCreateVideoData != null && (str = mvCreateVideoData.mvId) != null && (!C366770EZn.LIZ(str))) {
                    return C2097908Jt.LIZJ(new Pair(C0FAO.MV, Collections.singletonList(str)));
                }
                return C2097608Jq.LJ();
            }

            @Override // X.AbstractC365860EWa
            public final String LJIIJJI(MvCreateVideoData mvCreateVideoData) {
                return mvCreateVideoData.mvId;
            }

            @Override // X.AbstractC365860EWa
            public final void LJIIIIZZ(Effect effect, MvCreateVideoData mvCreateVideoData) {
                mvCreateVideoData.mvResUnzipPath = effect.getUnzipPath();
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final DraftFileRestoreResult LJI(Integer num, boolean z, DraftFileRestoreException draftFileRestoreException) {
                return C365890EWd.LIZ(this, 2131832452, true, draftFileRestoreException);
            }
        }, new AbstractC365860EWa<StickerItemModel>(c554970Lpf) { // from class: X.0EZm
            public final C554970Lpf LIZLLL;
            public final int LJ = 7;
            public final int LJFF = 250;

            @Override // X.AbstractC365860EWa
            public final void LJIIJ() {
                List<StickerItemModel> list;
                InfoStickerModel infoStickerModelLJFF = this.LIZLLL.LJ.LJFF();
                if (infoStickerModelLJFF == null || (list = infoStickerModelLJFF.stickers) == null) {
                    return;
                }
                list.removeAll(this.LIZ);
            }

            @Override // X.AbstractC365860EWa
            public final List<StickerItemModel> LJIIL() {
                List<StickerItemModel> list;
                InfoStickerModel infoStickerModelLJFF = this.LIZLLL.LJ.LJFF();
                if (infoStickerModelLJFF == null || (list = infoStickerModelLJFF.stickers) == null) {
                    return C13BV.INSTANCE;
                }
                List listLJJJJLI = C13LP.LJJJJLI(list);
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) listLJJJJLI) {
                    StickerItemModel stickerItemModel = (StickerItemModel) obj;
                    if (C1403820mdQ.LIZ(stickerItemModel) && !C366770EZn.LIZ(stickerItemModel.stickerId) && !C570490MZb.LJ(stickerItemModel.path)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            @Override // X.InterfaceC365900EWe
            public final int LIZIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC365900EWe
            public final C554970Lpf getParams() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC365900EWe
            public final int getPriority() {
                return this.LJFF;
            }

            {
                this.LIZLLL = c554970Lpf;
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                List<StickerItemModel> list;
                InfoStickerModel infoStickerModelLJFF = this.LIZLLL.LJ.LJFF();
                boolean z = false;
                if (infoStickerModelLJFF != null && (list = infoStickerModelLJFF.stickers) != null) {
                    ArrayList arrayList = (ArrayList) C13LP.LJJJJLI(list);
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            StickerItemModel stickerItemModel = (StickerItemModel) it2.next();
                            if (C1403820mdQ.LIZ(stickerItemModel) && !C366770EZn.LIZ(stickerItemModel.stickerId)) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                return Boolean.valueOf(!z);
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
                List<StickerItemModel> list;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                InfoStickerModel infoStickerModelLJFF = awemeDraft.LJFF();
                if (infoStickerModelLJFF != null && (list = infoStickerModelLJFF.stickers) != null) {
                    for (StickerItemModel stickerItemModel : (ArrayList) C13LP.LJJJJLI(list)) {
                        String str = stickerItemModel.path;
                        if (str != null && str.length() != 0) {
                            arrayList.add(stickerItemModel.path);
                        }
                        String str2 = stickerItemModel.pinAlgorithmFile;
                        if (str2 != null && str2.length() != 0) {
                            arrayList2.add("objectTracking");
                        }
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!arrayList.isEmpty()) {
                    linkedHashMap.put(C0FAO.EFFECT, arrayList);
                }
                if (!arrayList2.isEmpty()) {
                    linkedHashMap.put(C0FAO.EFFECT_MODEL, arrayList2);
                }
                return linkedHashMap;
            }

            @Override // X.AbstractC365860EWa
            public final String LJIIJJI(StickerItemModel stickerItemModel) {
                return stickerItemModel.stickerId;
            }

            @Override // X.AbstractC365860EWa
            public final void LJIIIIZZ(Effect effect, StickerItemModel stickerItemModel) {
                stickerItemModel.path = effect.getUnzipPath();
            }
        }, new AbstractC365860EWa<DraftVEAudioEffectParam>(c554970Lpf) { // from class: X.0EZo
            public final C554970Lpf LIZLLL;
            public final int LJ = 8;
            public final int LJFF = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

            @Override // X.AbstractC365860EWa
            public final void LJIIJ() {
                this.LIZLLL.LJ.LJJJJIZL.draftVEAudioEffectParam = null;
            }

            @Override // X.AbstractC365860EWa
            public final List<DraftVEAudioEffectParam> LJIIL() {
                String str;
                DraftVEAudioEffectParam draftVEAudioEffectParamLIZLLL = this.LIZLLL.LJ.LIZLLL();
                return (draftVEAudioEffectParamLIZLLL == null || C366770EZn.LIZ(draftVEAudioEffectParamLIZLLL.uploadId) || (str = draftVEAudioEffectParamLIZLLL.effectPath) == null || str.length() == 0 || C570490MZb.LJ(draftVEAudioEffectParamLIZLLL.effectPath)) ? C13BV.INSTANCE : C1697810uHb.LJ(draftVEAudioEffectParamLIZLLL);
            }

            @Override // X.InterfaceC365900EWe
            public final int LIZIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC365900EWe
            public final C554970Lpf getParams() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC365900EWe
            public final int getPriority() {
                return this.LJFF;
            }

            {
                this.LIZLLL = c554970Lpf;
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                String str;
                DraftVEAudioEffectParam draftVEAudioEffectParamLIZLLL = this.LIZLLL.LJ.LIZLLL();
                boolean z = true;
                if (draftVEAudioEffectParamLIZLLL != null && !C366770EZn.LIZ(draftVEAudioEffectParamLIZLLL.uploadId) && (str = draftVEAudioEffectParamLIZLLL.effectPath) != null && str.length() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
                String str;
                DraftVEAudioEffectParam draftVEAudioEffectParamLIZLLL = awemeDraft.LIZLLL();
                if (draftVEAudioEffectParamLIZLLL != null && (str = draftVEAudioEffectParamLIZLLL.effectPath) != null && str.length() != 0) {
                    return C2097908Jt.LIZJ(new Pair(C0FAO.EFFECT, Collections.singletonList(str)));
                }
                return C2097608Jq.LJ();
            }

            @Override // X.AbstractC365860EWa
            public final String LJIIJJI(DraftVEAudioEffectParam draftVEAudioEffectParam) {
                return draftVEAudioEffectParam.uploadId;
            }

            @Override // X.AbstractC365860EWa
            public final void LJIIIIZZ(Effect effect, DraftVEAudioEffectParam draftVEAudioEffectParam) {
                draftVEAudioEffectParam.effectPath = effect.getUnzipPath();
            }
        }, new AbstractC365860EWa<StickerItemModel>(c554970Lpf) { // from class: X.0EZv
            public final C554970Lpf LIZLLL;
            public final int LJ = 9;
            public final int LJFF = 350;

            @Override // X.AbstractC365860EWa
            public final void LJIIJ() {
                PublishCustomCoverModel publishCustomCoverModel;
                EffectTextModel effectTextModel;
                CoverPublishModel coverPublishModel = this.LIZLLL.LJ.LJJJJIZL.coverPublishModel;
                if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null) {
                    effectTextModel.setHasCoverText(false);
                }
                CreativeModel creativeModel = this.LIZLLL.LJ.LIZ;
                if (creativeModel == null || (publishCustomCoverModel = creativeModel.publishCustomCoverModel) == null) {
                    return;
                }
                publishCustomCoverModel.isCoverAddText = 0;
            }

            @Override // X.AbstractC365860EWa
            public final List<StickerItemModel> LJIIL() {
                EffectTextModel effectTextModel;
                StickerItemModel textSticker;
                CoverPublishModel coverPublishModel = this.LIZLLL.LJ.LJJJJIZL.coverPublishModel;
                return (coverPublishModel == null || (effectTextModel = coverPublishModel.getEffectTextModel()) == null || (textSticker = effectTextModel.getTextSticker()) == null || C366770EZn.LIZ(textSticker.stickerId) || C570490MZb.LJ(textSticker.path) || textSticker == null) ? C13BV.INSTANCE : C1697810uHb.LJ(textSticker);
            }

            @Override // X.InterfaceC365900EWe
            public final int LIZIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC365900EWe
            public final C554970Lpf getParams() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC365900EWe
            public final int getPriority() {
                return this.LJFF;
            }

            {
                this.LIZLLL = c554970Lpf;
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                boolean z;
                EffectTextModel effectTextModel;
                StickerItemModel textSticker;
                CoverPublishModel coverPublishModel = this.LIZLLL.LJ.LJJJJIZL.coverPublishModel;
                if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (textSticker = effectTextModel.getTextSticker()) != null && !C366770EZn.LIZ(textSticker.stickerId)) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
                EffectTextModel effectTextModel;
                StickerItemModel textSticker;
                String str;
                CoverPublishModel coverPublishModel = awemeDraft.LJJJJIZL.coverPublishModel;
                if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (textSticker = effectTextModel.getTextSticker()) != null && (str = textSticker.path) != null && str.length() != 0) {
                    return C2097908Jt.LIZJ(new Pair(C0FAO.EFFECT, Collections.singletonList(str)));
                }
                return C2097608Jq.LJ();
            }

            @Override // X.AbstractC365860EWa
            public final String LJIIJJI(StickerItemModel stickerItemModel) {
                return stickerItemModel.stickerId;
            }

            @Override // X.AbstractC365860EWa
            public final void LJIIIIZZ(Effect effect, StickerItemModel stickerItemModel) {
                stickerItemModel.path = effect.getUnzipPath();
            }
        }, new AbstractC365860EWa<Pair<? extends TextStickerModel, ? extends TextFontModel>>(c554970Lpf) { // from class: X.0FAM
            public final C554970Lpf LIZLLL;
            public final InterfaceC1635410sex LJ;
            public final int LJFF;
            public final int LJI;

            @Override // X.AbstractC365860EWa
            public final void LJIIJ() {
            }

            /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
            @Override // X.AbstractC365860EWa
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<kotlin.Pair<? extends com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel, ? extends com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel>> LJIIL() {
                /*
                    Method dump skipped, instruction units count: 226
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0FAM.LJIIL():java.util.List");
            }

            @Override // X.InterfaceC365900EWe
            public final int LIZIZ() {
                return this.LJFF;
            }

            @Override // X.AbstractC365860EWa
            public final InterfaceC1635410sex LJIIIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC365900EWe
            public final C554970Lpf getParams() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC365900EWe
            public final int getPriority() {
                return this.LJI;
            }

            {
                InterfaceC1635410sex interfaceC1635410sexLIZ;
                this.LIZLLL = c554970Lpf;
                if (C297340Bl6.LIZIZ()) {
                    interfaceC1635410sexLIZ = EffectService.Companion.getInstance().createFontEffectPlatform(C0CHQ.LIZ);
                    if (interfaceC1635410sexLIZ == null) {
                        interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, AFwS234S0000000_5.get$arr$(491));
                    }
                } else {
                    interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, AFwS234S0000000_5.get$arr$(492));
                }
                this.LJ = interfaceC1635410sexLIZ;
                this.LJFF = 10;
                this.LJI = 400;
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                return Boolean.valueOf(this.LIZLLL.LJ.LIZ.stickerModel.textStickerModels.isEmpty());
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
                List<TextStickerModel> list = awemeDraft.LIZ.stickerModel.textStickerModels;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<TextStickerModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getFontModel().fontId);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!C366770EZn.LIZ((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return C2097608Jq.LJ();
                }
                return C2097908Jt.LIZJ(new Pair(C0FAO.FONT, arrayList2));
            }

            @Override // X.AbstractC365860EWa
            public final String LJIIJJI(Pair<? extends TextStickerModel, ? extends TextFontModel> pair) {
                return pair.getSecond().fontId;
            }

            @Override // X.AbstractC365860EWa
            public final void LJIIIIZZ(Effect effect, Pair<? extends TextStickerModel, ? extends TextFontModel> pair) {
                Pair<? extends TextStickerModel, ? extends TextFontModel> pair2 = pair;
                List<TextStickerModel> list = this.LIZLLL.LJ.LIZ.stickerModel.textStickerModels;
                C1466090oFr.LJIILJJIL(list, new AwS584S0100000_5(pair2, (Pair<Integer, Integer>) 1028));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(effect.getUnzipPath());
                sbLIZ.append(File.separator);
                sbLIZ.append(pair2.getSecond().fileName);
                list.add(TextStickerModel.copy$default(pair2.getFirst(), null, null, null, null, null, 0, 0, 0, 0.0f, TextFontModel.LIZ(pair2.getFirst().getFontModel(), null, null, null, null, null, null, 0, 0, null, C2188811AlT.LIZIZ(sbLIZ), false, false, 0, 15871), false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -513, 65535, null));
                C0FI2.LJIJJLI(effect.getPanel()).LJJIJIL(effect);
            }
        }, new k1(c554970Lpf), new i1(c554970Lpf), new AbstractC365860EWa<Pair<? extends StickerItemModel, ? extends TextStickerData>>(c554970Lpf) { // from class: X.0FAL
            public final C554970Lpf LIZLLL;
            public final InterfaceC1635410sex LJ;
            public final int LJFF;
            public final int LJI;

            @Override // X.AbstractC365860EWa
            public final void LJIIJ() {
            }

            @Override // X.AbstractC365860EWa
            public final List<Pair<? extends StickerItemModel, ? extends TextStickerData>> LJIIL() {
                List<StickerItemModel> list;
                String fontId;
                String fontPath;
                InfoStickerModel infoStickerModelLJFF = this.LIZLLL.LJ.LJFF();
                if (infoStickerModelLJFF == null || (list = infoStickerModelLJFF.stickers) == null) {
                    return C13BV.INSTANCE;
                }
                ArrayList<StickerItemModel> arrayList = new ArrayList();
                for (StickerItemModel stickerItemModel : list) {
                    if (stickerItemModel.isTextSticker()) {
                        arrayList.add(stickerItemModel);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (StickerItemModel stickerItemModel2 : arrayList) {
                    TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel2.extra, TextStickerData.class);
                    String fontType = textStickerData.getFontType();
                    if (fontType != null && fontType.length() != 0 && ((fontId = textStickerData.getFontId()) == null || fontId.length() == 0 || (fontPath = textStickerData.getFontPath()) == null || fontPath.length() == 0)) {
                        textStickerData.setFontType(textStickerData.getFontType());
                    }
                    arrayList2.add(new Pair(stickerItemModel2, textStickerData));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    TextStickerData textStickerData2 = (TextStickerData) ((Pair) obj).getSecond();
                    if (!C366770EZn.LIZ(textStickerData2.getFontId()) && (textStickerData2.getFontPath() == null || !C570490MZb.LJ(textStickerData2.getFontPath()))) {
                        arrayList3.add(obj);
                    }
                }
                return arrayList3;
            }

            @Override // X.InterfaceC365900EWe
            public final int LIZIZ() {
                return this.LJFF;
            }

            @Override // X.AbstractC365860EWa
            public final InterfaceC1635410sex LJIIIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC365900EWe
            public final C554970Lpf getParams() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC365900EWe
            public final int getPriority() {
                return this.LJI;
            }

            {
                InterfaceC1635410sex interfaceC1635410sexLIZ;
                this.LIZLLL = c554970Lpf;
                if (C297340Bl6.LIZIZ()) {
                    interfaceC1635410sexLIZ = EffectService.Companion.getInstance().createFontEffectPlatform(C0CHQ.LIZ);
                    if (interfaceC1635410sexLIZ == null) {
                        interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, AFwS234S0000000_5.get$arr$(493));
                    }
                } else {
                    interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, AFwS234S0000000_5.get$arr$(494));
                }
                this.LJ = interfaceC1635410sexLIZ;
                this.LJFF = 10;
                this.LJI = 400;
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                List<StickerItemModel> list;
                InfoStickerModel infoStickerModelLJFF = this.LIZLLL.LJ.LJFF();
                boolean z = false;
                if (infoStickerModelLJFF != null && (list = infoStickerModelLJFF.stickers) != null && !list.isEmpty()) {
                    Iterator<StickerItemModel> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (it2.next().isTextSticker()) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(!z);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
                ?? arrayList;
                List<StickerItemModel> list;
                String fontId;
                TextStickerData textStickerData;
                InfoStickerModel infoStickerModelLJFF = awemeDraft.LJFF();
                if (infoStickerModelLJFF != null && (list = infoStickerModelLJFF.stickers) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (StickerItemModel stickerItemModel : list) {
                        if (stickerItemModel.isTextSticker()) {
                            arrayList2.add(stickerItemModel);
                        }
                    }
                    arrayList = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        try {
                            textStickerData = (TextStickerData) C0CHQ.LIZ().getGson().LJII(((StickerItemModel) it2.next()).extra, TextStickerData.class);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (textStickerData == null || (fontId = textStickerData.getFontId()) == null || !(!C366770EZn.LIZ(fontId))) {
                            fontId = null;
                        }
                        if (fontId != null) {
                            arrayList.add(fontId);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                if (arrayList.isEmpty()) {
                    return C2097608Jq.LJ();
                }
                return C2097908Jt.LIZJ(new Pair(C0FAO.FONT, arrayList));
            }

            @Override // X.AbstractC365860EWa
            public final String LJIIJJI(Pair<? extends StickerItemModel, ? extends TextStickerData> pair) {
                return pair.getSecond().getFontId();
            }

            @Override // X.AbstractC365860EWa
            public final void LJIIIIZZ(Effect effect, Pair<? extends StickerItemModel, ? extends TextStickerData> pair) {
                Pair<? extends StickerItemModel, ? extends TextStickerData> pair2 = pair;
                pair2.getSecond().setFontPath(effect.getUnzipPath());
                pair2.getFirst().extra = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), pair2.getSecond());
            }
        }, new AbstractC365860EWa<CanvasFilterParam>(c554970Lpf) { // from class: X.0EZp
            public final C554970Lpf LIZLLL;
            public final int LJ = 12;
            public final int LJFF = LSPassThroughRecordSizeConfig.DEFAULT;

            @Override // X.AbstractC365860EWa
            public final void LJIIJ() {
            }

            @Override // X.AbstractC365860EWa
            public final List<CanvasFilterParam> LJIIL() {
                List<CanvasFilterParam> transformList;
                String animPath;
                CanvasVideoData canvasVideoData = this.LIZLLL.LJ.LJJJJIZL.canvasVideoData;
                if (canvasVideoData == null || (transformList = canvasVideoData.getTransformList()) == null) {
                    return C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (CanvasFilterParam canvasFilterParam : transformList) {
                    CanvasFilterParam canvasFilterParam2 = canvasFilterParam;
                    String animPath2 = canvasFilterParam2.getAnimPath();
                    if (animPath2 != null && animPath2.length() != 0 && (animPath = canvasFilterParam2.getAnimPath()) != null && !C570490MZb.LJ(animPath)) {
                        arrayList.add(canvasFilterParam);
                    }
                }
                return arrayList;
            }

            @Override // X.InterfaceC365900EWe
            public final int LIZIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC365900EWe
            public final C554970Lpf getParams() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC365900EWe
            public final int getPriority() {
                return this.LJFF;
            }

            {
                this.LIZLLL = c554970Lpf;
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                List<CanvasFilterParam> transformList;
                CanvasVideoData canvasVideoData = this.LIZLLL.LJ.LJJJJIZL.canvasVideoData;
                boolean z = false;
                if (canvasVideoData != null && (transformList = canvasVideoData.getTransformList()) != null && !transformList.isEmpty()) {
                    Iterator<CanvasFilterParam> it2 = transformList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String animPath = it2.next().getAnimPath();
                        if (animPath != null && animPath.length() != 0) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(!z);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
                ?? arrayList;
                List<CanvasFilterParam> transformList;
                CanvasVideoData canvasVideoData = awemeDraft.LJJJJIZL.canvasVideoData;
                if (canvasVideoData != null && (transformList = canvasVideoData.getTransformList()) != null) {
                    arrayList = new ArrayList();
                    Iterator<CanvasFilterParam> it2 = transformList.iterator();
                    while (it2.hasNext()) {
                        String animPath = it2.next().getAnimPath();
                        if (animPath != null) {
                            arrayList.add(animPath);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                if (arrayList.isEmpty()) {
                    return C2097608Jq.LJ();
                }
                return C2097908Jt.LIZJ(new Pair(C0FAO.EFFECT, arrayList));
            }

            @Override // X.AbstractC365860EWa
            public final String LJIIJJI(CanvasFilterParam canvasFilterParam) {
                String effectId = canvasFilterParam.getEffectId();
                if (effectId == null) {
                    return "";
                }
                return effectId;
            }

            @Override // X.AbstractC365860EWa
            public final void LJIIIIZZ(Effect effect, CanvasFilterParam canvasFilterParam) {
                canvasFilterParam.setAnimPath(effect.getUnzipPath());
            }
        }, new C0MYQ(c554970Lpf), new C364750ERt(c554970Lpf), new C0EWG(c554970Lpf) { // from class: X.0ERu
            public final C554970Lpf LJI;
            public final int LJII;
            public final int LJIIIIZZ;

            @Override // X.C0EWG, X.AbstractC365860EWa
            public final List<EffectPointModel> LJIIL() {
                List<CombineEffectPointModel> list = this.LJI.LJ.LIZ.magicCombineEffectModel.magicCombineEffectModelList;
                ArrayList<CombineEffectPointModel> arrayList = new ArrayList();
                for (CombineEffectPointModel combineEffectPointModel : list) {
                    if (!Intrinsics.LJFF(combineEffectPointModel.getKey(), CardStruct.IStatusCode.DEFAULT)) {
                        arrayList.add(combineEffectPointModel);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (CombineEffectPointModel combineEffectPointModel2 : arrayList) {
                    EffectPointModel effectPointModel = new EffectPointModel();
                    effectPointModel.setKey(combineEffectPointModel2.getKey());
                    effectPointModel.setName(combineEffectPointModel2.getName());
                    effectPointModel.setResDir(combineEffectPointModel2.getResDir());
                    arrayList2.add(effectPointModel);
                }
                return arrayList2;
            }

            @Override // X.C0EWG, X.InterfaceC365900EWe
            public final int LIZIZ() {
                return this.LJII;
            }

            @Override // X.C0EWG, X.InterfaceC365900EWe
            public final C554970Lpf getParams() {
                return this.LJI;
            }

            @Override // X.C0EWG, X.InterfaceC365900EWe
            public final int getPriority() {
                return this.LJIIIIZZ;
            }

            {
                super(c554970Lpf);
                this.LJI = c554970Lpf;
                this.LJII = 16;
                this.LJIIIIZZ = 1400;
            }

            @Override // X.C0EWG, X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                return Boolean.valueOf(this.LJI.LJ.LIZ.magicCombineEffectModel.magicCombineEffectModelList.isEmpty());
            }

            @Override // X.C0EWG, X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
                List<CombineEffectPointModel> list = awemeDraft.LIZ.magicCombineEffectModel.magicCombineEffectModelList;
                ArrayList arrayList = new ArrayList();
                for (CombineEffectPointModel combineEffectPointModel : list) {
                    if (true ^ Intrinsics.LJFF(combineEffectPointModel.getKey(), CardStruct.IStatusCode.DEFAULT)) {
                        arrayList.add(combineEffectPointModel);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String resDir = ((CombineEffectPointModel) it2.next()).getResDir();
                    if (resDir != null && resDir.length() > 0) {
                        arrayList2.add(resDir);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return C2097608Jq.LJ();
                }
                return C2097908Jt.LIZJ(new Pair(C0FAO.EFFECT, arrayList2));
            }
        }, new C0F4T(c554970Lpf), new AbstractC365860EWa<LivePhotoTransitionEffectParam>(c554970Lpf) { // from class: X.0EZt
            public final C554970Lpf LIZLLL;
            public final int LJ = 22;
            public final int LJFF = 470;
            public final boolean LJI = !C297640Bla.LIZ();

            @Override // X.AbstractC365860EWa
            public final void LJIIJ() {
                LivePhotoModel livePhotoModel = this.LIZLLL.LJ.LIZ.livePhotoModel;
                if (livePhotoModel != null) {
                    livePhotoModel.livePhotoTransitionEffectParam = null;
                }
            }

            @Override // X.AbstractC365860EWa
            public final List<LivePhotoTransitionEffectParam> LJIIL() {
                LivePhotoTransitionEffectParam livePhotoTransitionEffectParam;
                String str;
                LivePhotoModel livePhotoModel = this.LIZLLL.LJ.LIZ.livePhotoModel;
                return (livePhotoModel == null || (livePhotoTransitionEffectParam = livePhotoModel.livePhotoTransitionEffectParam) == null || C366770EZn.LIZ(livePhotoTransitionEffectParam.effectId) || (str = livePhotoTransitionEffectParam.effectPath) == null || str.length() == 0 || C570490MZb.LJ(livePhotoTransitionEffectParam.effectPath) || livePhotoTransitionEffectParam == null) ? C13BV.INSTANCE : C1697810uHb.LJ(livePhotoTransitionEffectParam);
            }

            @Override // X.AbstractC365860EWa, X.AbstractC365870EWb
            public final boolean LIZ() {
                return this.LJI;
            }

            @Override // X.InterfaceC365900EWe
            public final int LIZIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC365900EWe
            public final C554970Lpf getParams() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC365900EWe
            public final int getPriority() {
                return this.LJFF;
            }

            {
                this.LIZLLL = c554970Lpf;
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Object LIZLLL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                String str;
                LivePhotoModel livePhotoModel = this.LIZLLL.LJ.LIZ.livePhotoModel;
                LivePhotoTransitionEffectParam livePhotoTransitionEffectParam = null;
                if (livePhotoModel != null) {
                    livePhotoTransitionEffectParam = livePhotoModel.livePhotoTransitionEffectParam;
                }
                boolean z = true;
                if (livePhotoTransitionEffectParam != null && !C366770EZn.LIZ(livePhotoTransitionEffectParam.effectId) && (str = livePhotoTransitionEffectParam.effectPath) != null && str.length() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // X.AbstractC365870EWb, X.InterfaceC365900EWe
            public final Map<C0FAO, List<String>> LJ(AwemeDraft awemeDraft) {
                LivePhotoTransitionEffectParam livePhotoTransitionEffectParam;
                String str;
                LivePhotoModel livePhotoModel = awemeDraft.LIZ.livePhotoModel;
                if (livePhotoModel != null && (livePhotoTransitionEffectParam = livePhotoModel.livePhotoTransitionEffectParam) != null && (str = livePhotoTransitionEffectParam.effectPath) != null && str.length() != 0) {
                    return C2097908Jt.LIZJ(new Pair(C0FAO.EFFECT, Collections.singletonList(str)));
                }
                return C2097608Jq.LJ();
            }

            @Override // X.AbstractC365860EWa
            public final String LJIIJJI(LivePhotoTransitionEffectParam livePhotoTransitionEffectParam) {
                String str = livePhotoTransitionEffectParam.effectId;
                if (str != null) {
                    return str;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }

            @Override // X.AbstractC365860EWa
            public final void LJIIIIZZ(Effect effect, LivePhotoTransitionEffectParam livePhotoTransitionEffectParam) {
                livePhotoTransitionEffectParam.effectPath = effect.getUnzipPath();
            }
        }, new C0EWV(c554970Lpf), new C0EWN(c554970Lpf), new C0EWJ(c554970Lpf), new C0EWR(c554970Lpf), new C364380EQi(c554970Lpf));
    }
}

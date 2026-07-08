package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.aicaption.AICaptionTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0EX8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.datasync.task.EPTextStickerEDASyncTask$onSyncData$2", f = "EPTextStickerEDASyncTask.kt", l = {}, m = "invokeSuspend")
public final class C0EX8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0EY3 LL;
    public final /* synthetic */ C0EX7 LLILLJJLI;
    public final /* synthetic */ List<NLETrackSlot> LLILLL;
    public final /* synthetic */ C0EXH LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0EX8(C0EY3 c0ey3, C0EX7 c0ex7, List<? extends NLETrackSlot> list, C0EXH c0exh, InterfaceC1364105Vn<? super C0EX8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ey3;
        this.LLILLJJLI = c0ex7;
        this.LLILLL = list;
        this.LLILZ = c0exh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0EX8(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List<NLETrackSlot> list;
        TextStickerModel textStickerModelDeepCopy;
        TextStickerModel textStickerModelYC;
        List<NLETrackSlot> list2;
        TextStickerModel next;
        TextStickerModel textStickerModelYC2;
        Integer numValueOf;
        Integer numValueOf2;
        C0FTJ<StickerModel> c0ftjTq;
        BaseStickerModel baseModel;
        TextStickerModel textStickerModelDeepCopy2;
        C0FTJ<StickerModel> c0ftjTq2;
        TextStickerModel textStickerModelYC3;
        C1C7U.LIZ("EPTextStickerEDASyncTask@9851.onSyncData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.LIZIZ.creativeModel.stickerModel.aiCaptionTagStickers.isEmpty()) {
            this.LLILLJJLI.LLJIJIL = (AICaptionTagStickerModel) C13LP.LJJJLZIJ(0, this.LL.LIZIZ.creativeModel.stickerModel.aiCaptionTagStickers);
        }
        if (this.LLILLL != null && (!r0.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0EX7 c0ex7 = this.LLILLJJLI;
            List<NLETrackSlot> list3 = this.LLILLL;
            VideoPublishEditModel videoPublishEditModel = this.LL.LIZIZ;
            c0ex7.getClass();
            for (NLETrackSlot nLETrackSlot : list3) {
                if (((Boolean) C284590BDl.LIZ.getValue()).booleanValue() && (textStickerModelYC3 = c0ex7.LJIIIZ().YC(nLETrackSlot.getUUID())) != null) {
                    C0EX7.LJIIIIZZ(nLETrackSlot, textStickerModelYC3);
                }
                TextStickerModel textStickerModelYC4 = c0ex7.LJIIIZ().YC(nLETrackSlot.getUUID());
                if (textStickerModelYC4 != null && (textStickerModelDeepCopy2 = textStickerModelYC4.deepCopy()) != null) {
                    textStickerModelDeepCopy2.getBaseStickerModel().setEnableNLEChange(false);
                    InterfaceC391240FVq interfaceC391240FVqLJIIJ = c0ex7.LJIIJ();
                    if (interfaceC391240FVqLJIIJ != null) {
                        interfaceC391240FVqLJIIJ.k3(textStickerModelDeepCopy2, EnumC356070Dxd.COMMIT);
                    }
                    InterfaceC391240FVq interfaceC391240FVqLJIIJ2 = c0ex7.LJIIJ();
                    if (interfaceC391240FVqLJIIJ2 != null && (c0ftjTq2 = interfaceC391240FVqLJIIJ2.tq(textStickerModelDeepCopy2.getId())) != null) {
                        c0ftjTq2.LJIJ(textStickerModelDeepCopy2.getBaseStickerModel(), true);
                    }
                    if (C0F8Y.LJII(textStickerModelDeepCopy2)) {
                        List<AICaptionTagStickerModel> list4 = videoPublishEditModel.creativeModel.stickerModel.aiCaptionTagStickers;
                        AICaptionTagStickerModel aICaptionTagStickerModel = (AICaptionTagStickerModel) C13LP.LJJJLZIJ(0, list4);
                        if (aICaptionTagStickerModel != null) {
                            list4.remove(aICaptionTagStickerModel);
                            list4.add(aICaptionTagStickerModel);
                            C0EX9.LLILZIL.getClass();
                            list4.add(C367320Eag.LIZ(textStickerModelDeepCopy2, aICaptionTagStickerModel));
                            InterfaceC391240FVq interfaceC391240FVqLJIIJ3 = c0ex7.LJIIJ();
                            if (interfaceC391240FVqLJIIJ3 != null) {
                                interfaceC391240FVqLJIIJ3.k3(aICaptionTagStickerModel, EnumC356070Dxd.COMMIT);
                            }
                        }
                        C1664740tQG c1664740tQG = c0ex7.LLILZLL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0EX7.LLJILJIL;
                        InterfaceC19530111b1 interfaceC19530111b1 = (InterfaceC19530111b1) c1664740tQG.getValue(c0ex7, interfaceC2217461BqaArr[2]);
                        if (interfaceC19530111b1 != null) {
                            interfaceC19530111b1.j7(textStickerModelDeepCopy2);
                        }
                        C0EXI c0exi = (C0EXI) c0ex7.LLIZ.getValue(c0ex7, interfaceC2217461BqaArr[3]);
                        if (c0exi != null) {
                            c0exi.j7(textStickerModelDeepCopy2);
                        }
                    }
                    C563650M8t c563650M8t = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("doTextStickerUpdate: doUpdate: ");
                    sbLIZ.append(nLETrackSlot.getUUID());
                    C201955140j.LIZLLL(c563650M8t, "EDADataSyncEngine", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        C0EXG c0exg = this.LLILZ.LIZJ;
        if (c0exg != null && (list2 = c0exg.LIZIZ) != null && (!list2.isEmpty())) {
            C0EX7 c0ex72 = this.LLILLJJLI;
            VideoPublishEditModel videoPublishEditModel2 = this.LL.LIZIZ;
            c0ex72.getClass();
            for (NLETrackSlot nLETrackSlot2 : list2) {
                String strLJLJL = C351220Dpo.LJLJL(nLETrackSlot2, "text_sticker_data", null);
                if (strLJLJL != null && strLJLJL.length() != 0) {
                    Iterator<TextStickerModel> it2 = c0ex72.LLILLJJLI.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.getUuid(), nLETrackSlot2.getUUID())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    TextStickerModel textStickerModel = next;
                    if ((textStickerModel == null || (numValueOf = Integer.valueOf(textStickerModel.getId())) == null) && ((textStickerModelYC2 = c0ex72.LJIIIZ().YC(nLETrackSlot2.getUUID())) == null || (numValueOf = Integer.valueOf(textStickerModelYC2.getId())) == null)) {
                        numValueOf = Integer.valueOf(C363430EMr.LIZIZ(strLJLJL).getIdInNewEngine());
                    }
                    InterfaceC391240FVq interfaceC391240FVqLJIIJ4 = c0ex72.LJIIJ();
                    if (interfaceC391240FVqLJIIJ4 != null && (c0ftjTq = interfaceC391240FVqLJIIJ4.tq(numValueOf.intValue())) != null) {
                        BaseStickerModel baseStickerModelLJJIIJZLJL = c0ftjTq.LJJIIJZLJL();
                        if (baseStickerModelLJJIIJZLJL != null) {
                            baseStickerModelLJJIIJZLJL.setEnableNLEChange(false);
                        }
                        StickerModel stickerModelLJLI = c0ftjTq.LJLI();
                        if (stickerModelLJLI != null && (baseModel = stickerModelLJLI.getBaseModel()) != null) {
                            baseModel.setEnableNLEChange(false);
                        }
                    }
                    InterfaceC391240FVq interfaceC391240FVqLJIIJ5 = c0ex72.LJIIJ();
                    if (interfaceC391240FVqLJIIJ5 != null) {
                        interfaceC391240FVqLJIIJ5.XJ(numValueOf.intValue(), null, EnumC356070Dxd.COMMIT);
                    }
                    AICaptionTagStickerModel aICaptionTagStickerModel2 = c0ex72.LLJIJIL;
                    if (aICaptionTagStickerModel2 != null) {
                        numValueOf2 = Integer.valueOf(aICaptionTagStickerModel2.getId());
                    } else {
                        numValueOf2 = null;
                    }
                    if (Intrinsics.LJFF(numValueOf, numValueOf2)) {
                        StickerNewEngineModel stickerNewEngineModel = videoPublishEditModel2.creativeModel.stickerModel;
                        stickerNewEngineModel.isAiCaptionAdded = false;
                        stickerNewEngineModel.aiCaptionTagStickers.clear();
                        C1664740tQG c1664740tQG2 = c0ex72.LLILZLL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C0EX7.LLJILJIL;
                        InterfaceC19530111b1 interfaceC19530111b12 = (InterfaceC19530111b1) c1664740tQG2.getValue(c0ex72, interfaceC2217461BqaArr2[2]);
                        if (interfaceC19530111b12 != null) {
                            interfaceC19530111b12.Bk();
                        }
                        C0EXI c0exi2 = (C0EXI) c0ex72.LLIZ.getValue(c0ex72, interfaceC2217461BqaArr2[3]);
                        if (c0exi2 != null) {
                            c0exi2.Bk();
                        }
                    }
                    C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("doDeleteTextSticker: doDelete: ");
                    sbLIZ2.append(nLETrackSlot2.getUUID());
                    C201955140j.LIZLLL(c563650M8t2, "EDADataSyncEngine", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        C0EXG c0exg2 = this.LLILZ.LIZ;
        if (c0exg2 != null && (list = c0exg2.LIZIZ) != null && (!list.isEmpty())) {
            C0EX7 c0ex73 = this.LLILLJJLI;
            VideoPublishEditModel videoPublishEditModel3 = this.LL.LIZIZ;
            c0ex73.getClass();
            for (NLETrackSlot nLETrackSlot3 : list) {
                if (((Boolean) C284590BDl.LIZ.getValue()).booleanValue() && (textStickerModelYC = c0ex73.LJIIIZ().YC(nLETrackSlot3.getUUID())) != null) {
                    C0EX7.LJIIIIZZ(nLETrackSlot3, textStickerModelYC);
                }
                TextStickerModel textStickerModelYC5 = c0ex73.LJIIIZ().YC(nLETrackSlot3.getUUID());
                if (textStickerModelYC5 != null && (textStickerModelDeepCopy = textStickerModelYC5.deepCopy()) != null) {
                    if (C0F8Y.LJII(textStickerModelDeepCopy)) {
                        StickerNewEngineModel stickerNewEngineModel2 = videoPublishEditModel3.creativeModel.stickerModel;
                        stickerNewEngineModel2.isAiCaptionAdded = true;
                        List<AICaptionTagStickerModel> list5 = stickerNewEngineModel2.aiCaptionTagStickers;
                        AICaptionTagStickerModel aICaptionTagStickerModel3 = c0ex73.LLJIJIL;
                        if (aICaptionTagStickerModel3 != null) {
                            list5.add(aICaptionTagStickerModel3);
                        }
                        C1664740tQG c1664740tQG3 = c0ex73.LLILZLL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = C0EX7.LLJILJIL;
                        InterfaceC19530111b1 interfaceC19530111b13 = (InterfaceC19530111b1) c1664740tQG3.getValue(c0ex73, interfaceC2217461BqaArr3[2]);
                        if (interfaceC19530111b13 != null) {
                            interfaceC19530111b13.j7(textStickerModelDeepCopy);
                        }
                        C0EXI c0exi3 = (C0EXI) c0ex73.LLIZ.getValue(c0ex73, interfaceC2217461BqaArr3[3]);
                        if (c0exi3 != null) {
                            c0exi3.j7(textStickerModelDeepCopy);
                        }
                    }
                    textStickerModelDeepCopy.getBaseStickerModel().setEnableNLEChange(false);
                    InterfaceC391240FVq interfaceC391240FVqLJIIJ6 = c0ex73.LJIIJ();
                    if (interfaceC391240FVqLJIIJ6 != null) {
                        interfaceC391240FVqLJIIJ6.f3(textStickerModelDeepCopy, EnumC356070Dxd.COMMIT);
                    }
                    C563650M8t c563650M8t3 = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("doAddTextSticker: doAdd: ");
                    sbLIZ3.append(nLETrackSlot3.getUUID());
                    C201955140j.LIZLLL(c563650M8t3, "EDADataSyncEngine", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
        this.LL.LIZIZ.creativeModel.stickerModel.textStickerModels = new ArrayList(this.LLILLJJLI.LJIIIZ().Sb());
        C0EX7 c0ex74 = this.LLILLJJLI;
        c0ex74.LLILLJJLI = new ArrayList(c0ex74.LJIIIZ().Sb());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPTextStickerEDASyncTask@9851.onSyncData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0F9P, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F9P {
    public final Activity LIZ;
    public final LifecycleOwner LIZIZ;
    public final Function0<C1462070o9N> LIZJ;
    public final InterfaceC1462140o9U LIZLLL;
    public final VideoPublishEditModel LJ;
    public final InterfaceC1455860nzM LJFF;
    public final InterfaceC391240FVq LJI;
    public final InterfaceC1456910o13 LJII;
    public final C0FVT LJIIIIZZ;
    public final C0EYP LJIIIZ;
    public boolean LJIIJ;

    public final void LIZ() {
        C1428470nHB.LLILZ(this.LJ);
        List<TextStickerModel> listLIZJ = LIZJ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
        for (TextStickerModel textStickerModel : listLIZJ) {
            BaseStickerModel baseStickerModel = textStickerModel.getBaseStickerModel();
            TextFontModel textFontModelLIZ = TextFontModel.LIZ(textStickerModel.getFontModel(), null, null, null, null, null, null, 0, 0, null, null, false, false, 0, 16383);
            TextMotionModel textMotionModelLIZ = TextMotionModel.LIZ(textStickerModel.getTextMotionModel(), null, 0.0f, 0, null, null, 0, false, 1023);
            Integer value = this.LJII.Rv().getValue();
            int iIntValue = value != null ? value.intValue() : textStickerModel.getMode();
            Integer value2 = this.LJII.Gl().getValue();
            int iIntValue2 = value2 != null ? value2.intValue() : textStickerModel.getAlign();
            Integer value3 = this.LJII.tk().getValue();
            TextStickerModel textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModel, baseStickerModel, null, null, null, null, iIntValue, value3 != null ? value3.intValue() : textStickerModel.getColor(), iIntValue2, 0.0f, textFontModelLIZ, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, textMotionModelLIZ, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -268436194, 65535, null);
            if (textStickerModelCopy$default.getMode() != 1 && textStickerModelCopy$default.getMode() != -1) {
                textStickerModelCopy$default.setTextStyle(null);
            }
            arrayList.add(textStickerModelCopy$default);
        }
        InterfaceC391240FVq interfaceC391240FVq = this.LJI;
        if (interfaceC391240FVq != null) {
            interfaceC391240FVq.T(arrayList, EnumC356070Dxd.COMMIT);
        }
    }

    public final List<TextStickerModel> LIZJ() {
        List<StickerModel> listLLLILZLLLI;
        InterfaceC391240FVq interfaceC391240FVq = this.LJI;
        if (interfaceC391240FVq == null || (listLLLILZLLLI = interfaceC391240FVq.LLLILZLLLI(EnumC1466150oFx.TEXT)) == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (StickerModel stickerModel : listLLLILZLLLI) {
            StickerModel stickerModel2 = stickerModel;
            if ((stickerModel2 instanceof TextStickerModel) && C0F8Y.LJIIIIZZ((TextStickerModel) stickerModel2)) {
                arrayList.add(stickerModel);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((StickerModel) it2.next());
        }
        return arrayList2;
    }

    public final void LIZLLL() {
        this.LJII.sF().LIZ(this.LIZIZ, new AObjectS240S0100000_5(this, 15));
        this.LJII.Rv().observe(this.LIZIZ, new AObserverS209S0100000_5(this, 9));
        this.LJII.Gl().observe(this.LIZIZ, new AObserverS209S0100000_5(this, 10));
        this.LJII.tk().observe(this.LIZIZ, new AObserverS209S0100000_5(this, 11));
        this.LJII.Vn().observe(this.LIZIZ, new AObserverS209S0100000_5(this, 12));
    }

    public final ArrayList<TextStickerData> LIZIZ() {
        List<TextStickerModel> listLIZJ = LIZJ();
        ArrayList<TextStickerData> arrayList = new ArrayList<>(C15438062q.LJIJJ(listLIZJ, 10));
        Iterator<TextStickerModel> it2 = listLIZJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(C0F7U.LIZJ(it2.next()));
        }
        return arrayList;
    }

    public final void LJ() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        TextStickerModel next;
        Integer numValueOf;
        List<TextStickerModel> listLIZJ = LIZJ();
        ArrayList arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : listLIZJ) {
            Iterator<TextStickerModel> it2 = this.LJIIIIZZ.Sb().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getId() == textStickerModel.getId()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TextStickerModel textStickerModel2 = next;
            if (textStickerModel2 != null && (numValueOf = Integer.valueOf(textStickerModel2.getId())) != null) {
                arrayList.add(numValueOf);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        InterfaceC391240FVq interfaceC391240FVq = this.LJI;
        if (interfaceC391240FVq != null) {
            interfaceC391240FVq.M3(arrayList, null, EnumC356070Dxd.COMMIT);
        }
        InterfaceC1452170ntP value = this.LJFF.g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null) {
            return;
        }
        for (NLETrack nLETrack : (ArrayList) C351220Dpo.LJLLI(model)) {
            for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
                if (C385050F7v.LJIIIZ(nLETrackSlot)) {
                    nLETrack.removeSlot(nLETrackSlot);
                }
                if (nLETrack.getSlots().isEmpty()) {
                    model.removeTrack(nLETrack);
                }
            }
        }
    }

    public final void LJFF(TextStickerModel textStickerModel) {
        List<TextStickerModel> listLIZJ = LIZJ();
        ArrayList<TextStickerModel> arrayList = new ArrayList();
        for (TextStickerModel textStickerModel2 : listLIZJ) {
            if (textStickerModel2.getId() != textStickerModel.getId()) {
                arrayList.add(textStickerModel2);
            }
        }
        ArrayList<TextStickerModel> arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (TextStickerModel textStickerModel3 : arrayList) {
            arrayList2.add(TextStickerModel.copy$default(textStickerModel3, BaseStickerModel.copy$default(textStickerModel3.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, textStickerModel.getBaseStickerModel().getTranslateX(), textStickerModel.getBaseStickerModel().getTranslateY(), textStickerModel.getBaseStickerModel().getScale(), textStickerModel.getBaseStickerModel().getRotation(), 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -31457281, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null));
        }
        InterfaceC391240FVq interfaceC391240FVq = this.LJI;
        if (interfaceC391240FVq != null) {
            interfaceC391240FVq.T(arrayList2, EnumC356070Dxd.COMMIT);
        }
        for (TextStickerModel textStickerModel4 : arrayList2) {
            InterfaceC391240FVq interfaceC391240FVq2 = this.LJI;
            if (interfaceC391240FVq2 != null) {
                interfaceC391240FVq2.h12(textStickerModel4);
            }
        }
    }

    public final void LJI(boolean z) {
        InlineCaptionModel inlineCaptionModel = this.LJ.creativeModel.inlineCaptionModel;
        if (inlineCaptionModel != null) {
            inlineCaptionModel.utterances = null;
        }
        if (LIZJ().isEmpty()) {
            if (z) {
                this.LJII.Xp2(null);
            }
            CreativeModel creativeModel = this.LJ.creativeModel;
            creativeModel.inlineCaptionModel = null;
            C1466090oFr.LJIILJJIL(creativeModel.stickerModel.textStickerModels, AFwS234S0000000_5.get$arr$(70));
        } else {
            this.LJII.Xp2(LIZIZ());
        }
        C201955140j.LIZ("EditStickerScene -> update caption details in publishEditModel");
    }

    public final void LJII(List<CaptionUtterance> list) {
        boolean z;
        Pair pair;
        Pair<Integer, Integer> pairAl;
        EditorProModel editorProModel;
        LJ();
        VideoPublishEditModel videoPublishEditModel = this.LJ;
        if (videoPublishEditModel != null && (editorProModel = videoPublishEditModel.getEditorProModel()) != null) {
            editorProModel.setCaptionMixTrackUsed(false);
        }
        ArrayList<TextStickerData> arrayList = new ArrayList();
        Iterator<CaptionUtterance> it2 = list.iterator();
        while (it2.hasNext()) {
            TextStickerData textStickerData = it2.next().inlineUtterance;
            if (textStickerData != null) {
                arrayList.add(textStickerData.m187clone());
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (TextStickerData textStickerData2 : arrayList) {
            textStickerData2.setAddToLayout(false);
            if (textStickerData2.getX() == 0.0f && textStickerData2.getY() == 0.0f) {
                z = false;
            } else {
                z = true;
            }
            InterfaceC391240FVq interfaceC391240FVq = this.LJI;
            if (interfaceC391240FVq != null && (pairAl = interfaceC391240FVq.al()) != null) {
                pair = new Pair(Integer.valueOf(pairAl.getFirst().intValue() / 2), Integer.valueOf(pairAl.getSecond().intValue() / 2));
            } else {
                pair = null;
            }
            TextStickerModel textStickerModelLIZLLL = C0F7U.LIZLLL(textStickerData2, z, pair);
            textStickerModelLIZLLL.setCaptionModel(new CaptionModel(false, 1, null));
            arrayList2.add(textStickerModelLIZLLL);
        }
        InterfaceC391240FVq interfaceC391240FVq2 = this.LJI;
        if (interfaceC391240FVq2 != null) {
            interfaceC391240FVq2.w3(arrayList2, EnumC356070Dxd.COMMIT);
        }
        InterfaceC391240FVq interfaceC391240FVq3 = this.LJI;
        if (interfaceC391240FVq3 != null) {
            interfaceC391240FVq3.JF2(null, null);
        }
    }

    public C0F9P(Activity activity, C0FVG c0fvg, Function0 function0, InterfaceC1462140o9U interfaceC1462140o9U, VideoPublishEditModel videoPublishEditModel, InterfaceC1455860nzM interfaceC1455860nzM, InterfaceC391240FVq interfaceC391240FVq, InterfaceC1456910o13 interfaceC1456910o13, C0FVG c0fvg2, C0EYP c0eyp) {
        this.LIZ = activity;
        this.LIZIZ = c0fvg;
        this.LIZJ = function0;
        this.LIZLLL = interfaceC1462140o9U;
        this.LJ = videoPublishEditModel;
        this.LJFF = interfaceC1455860nzM;
        this.LJI = interfaceC391240FVq;
        this.LJII = interfaceC1456910o13;
        this.LJIIIIZZ = c0fvg2;
        this.LJIIIZ = c0eyp;
    }
}

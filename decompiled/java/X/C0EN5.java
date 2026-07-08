package X;

import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyRecognizedWord;
import com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecInt;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.MemeSongTextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EN5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EN5 extends C0ERI {
    public final InterfaceC386690FEd LJIIJJI;
    public final VESize LJIIL;
    public final C1664680tQA<MemeSongTextStickerModel> LJIILIIL;
    public final LifecycleOwner LJIILJJIL;
    public final FrameLayout LJIILL;
    public final HashMap<String, String> LJIILLIIL;
    public final NLEEditor LJIIZILJ;
    public final int LJIJ;

    @Override // X.C0ERI, X.C0FFP
    public final void LIZIZ() {
        if (this.LJIILL.getLeft() == 0 && this.LJIILL.getTop() == 0) {
            this.LJIILL.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(this, 18));
        } else {
            LJIILIIL();
            super.LIZIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final NLESegmentTextSticker LJIIL() {
        NLESegmentTextSticker nLESegmentTextSticker = new NLESegmentTextSticker();
        nLESegmentTextSticker.setIsRichtext(true);
        MemeSongTextStickerModel memeSongTextStickerModel = this.LJIILIIL.LIZ;
        String str = this.LJIILLIIL.get("appLanguage");
        if (str == null) {
            str = "";
        }
        float fLIZIZ = C418440Gaw.LIZIZ(2);
        NLETextRichContent.Companion.getClass();
        float f = 0.0f;
        float f2 = 0.0f;
        NLETextRichContent nLETextRichContent = new NLETextRichContent(2, "", new C385070F7x(null, null == true ? 1 : 0, null == true ? 1 : 0, f, false, f, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, f, null == true ? 1 : 0, null == true ? 1 : 0, 4095, null == true ? 1 : 0), 0, 0, true, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)), true, fLIZIZ, true, true, C1697810uHb.LJ(Float.valueOf(12.0f / memeSongTextStickerModel.getFontModel().fontSize), Float.valueOf(6.0f / memeSongTextStickerModel.getFontModel().fontSize)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.0f, 0, 0.04f, 0.15f, 0.18f, 0.0f, 0.0f, 700.0f, C1697810uHb.LJ(Float.valueOf(-1.0f), Float.valueOf(-1.0f)), 1, 254, C0F8B.LIZIZ(str), false, "...", "", false, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), false, 1.0f, C1697810uHb.LJ(Float.valueOf(0.5f), Float.valueOf(0.7f), Float.valueOf(1.0f), Float.valueOf(0.8f)), true, false);
        nLETextRichContent.setRichTextData(new C385070F7x(memeSongTextStickerModel.getTextStr(), new Pair(memeSongTextStickerModel.getFontModel().fontResId, memeSongTextStickerModel.getFontModel().localPath), null, C341940Daq.LIZ(memeSongTextStickerModel.getFontModel().fontSize) * (720.0f / memeSongTextStickerModel.getBaseStickerModel().getContainerWidth()) * 0.24f, false, f2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, f2, null == true ? 1 : 0, null == true ? 1 : 0, 4084, null == true ? 1 : 0));
        nLETextRichContent.updateColor(1, memeSongTextStickerModel.getColor());
        nLETextRichContent.setRichText(nLETextRichContent.richTextData.toLabelStr());
        nLESegmentTextSticker.setRichContent(nLETextRichContent.toJsonStr());
        nLESegmentTextSticker.setContent(this.LJIILIIL.LIZ.getTextStr());
        NLEStyStickerAnim nLEStyStickerAnim = new NLEStyStickerAnim();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceFile(this.LJIILIIL.LIZ.getAnimationPath());
        nLEStyStickerAnim.setInAnim(nLEResourceNode);
        nLEStyStickerAnim.setInDuration(this.LJIILIIL.LIZ.getSongDuration() * LSPassThroughRecordSizeConfig.DEFAULT);
        nLEStyStickerAnim.setLoop(true);
        NLEStyRecognizedWord nLEStyRecognizedWord = new NLEStyRecognizedWord();
        nLEStyRecognizedWord.setText(new VecString(this.LJIILIIL.LIZ.getLyrics()));
        VecInt vecInt = new VecInt();
        VecInt vecInt2 = new VecInt();
        for (List<Double> list : this.LJIILIIL.LIZ.getTimeStamps()) {
            double dDoubleValue = ((Number) ListProtector.get(list, 0)).doubleValue();
            double d = LSPassThroughRecordSizeConfig.DEFAULT;
            vecInt.add(Integer.valueOf((int) (dDoubleValue * d)));
            vecInt2.add(Integer.valueOf((int) (((Number) ListProtector.get(list, 1)).doubleValue() * d)));
        }
        nLEStyRecognizedWord.setStartTime(vecInt);
        nLEStyRecognizedWord.setEndTime(vecInt2);
        nLEStyStickerAnim.setRecognizedWord(nLEStyRecognizedWord);
        nLESegmentTextSticker.setAnimation(nLEStyStickerAnim);
        return nLESegmentTextSticker;
    }

    public final void LJIILIIL() {
        NLETrackSlot next;
        for (NLETrack nLETrack : this.LJIIZILJ.getModel().getTracks()) {
            Iterator<NLETrackSlot> it2 = nLETrack.getSlots().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getUUID(), this.LJI)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot = next;
            if (nLETrackSlot != null) {
                NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                NLESegmentTextSticker nLESegmentTextStickerLJIIL = LJIIL();
                if (!nLESegmentTextStickerLJIIL.getRichContent().equals(nLESegmentTextStickerDynamicCast.getRichContent())) {
                    NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(true));
                    nLETrackSlotDynamicCast.setMainSegment(nLESegmentTextStickerLJIIL);
                    nLETrack.removeSlot(nLETrackSlot);
                    nLETrack.addSlot(nLETrackSlotDynamicCast);
                    C385050F7v.LJ(this.LJIIZILJ);
                    String uuid = nLETrackSlotDynamicCast.getUUID();
                    this.LJI = uuid;
                    this.LJIILIIL.LIZ.setUuid(uuid);
                }
            }
        }
    }

    @Override // X.C0ERI
    public final int LJFF() {
        return this.LJIJ;
    }

    public C0EN5(InterfaceC386690FEd interfaceC386690FEd, VESize vESize, C1664680tQA<MemeSongTextStickerModel> c1664680tQA, C1664680tQA<BaseStickerModel> c1664680tQA2, LifecycleOwner lifecycleOwner, FrameLayout frameLayout, HashMap<String, String> map) {
        boolean z;
        String uuid;
        super(interfaceC386690FEd, vESize, c1664680tQA2, lifecycleOwner, frameLayout);
        this.LJIIJJI = interfaceC386690FEd;
        this.LJIIL = vESize;
        this.LJIILIIL = c1664680tQA;
        this.LJIILJJIL = lifecycleOwner;
        this.LJIILL = frameLayout;
        this.LJIILLIIL = map;
        NLEEditor nLEEditorLIZ = (interfaceC386690FEd == null || (nLEEditorLIZ = interfaceC386690FEd.LJI()) == null) ? C346630DiP.LIZ() : nLEEditorLIZ;
        this.LJIIZILJ = nLEEditorLIZ;
        this.LJIJ = 2000;
        BaseStickerModel baseStickerModel = c1664680tQA.LIZ.getBaseStickerModel();
        NLEModel model = nLEEditorLIZ.getModel();
        NLETrack nLETrack = new NLETrack();
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        int iIntValue = 0;
        if (C123100dR.LIZ(c1664680tQA.LIZ.getUuid())) {
            z = true;
            for (NLETrack nLETrack2 : model.getTracks()) {
                Iterator<NLETrackSlot> it2 = nLETrack2.getSlots().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        NLETrackSlot next = it2.next();
                        if (Intrinsics.LJFF(next.getUUID(), this.LJIILIIL.LIZ.getUuid())) {
                            z = false;
                            nLETrack = nLETrack2;
                            nLETrackSlot = next;
                            break;
                        }
                    }
                }
            }
        } else {
            z = true;
        }
        nLETrack.setEnable(true);
        nLETrack.setExtra("StickerTrackType", "TEXT");
        nLETrack.setExtra("track_type", "sticker");
        nLETrack.setExtraTrackType(NLETrackType.STICKER);
        List<NLETrack> listLJIIIIZZ = C385050F7v.LJIIIIZZ(model);
        if (nLETrack.getLayer() == 0 && (z || ((ArrayList) listLJIIIIZZ).size() != 1)) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIIIZZ, 10));
            Iterator it3 = ((ArrayList) listLJIIIIZZ).iterator();
            while (it3.hasNext()) {
                arrayList.add(Integer.valueOf(((NLETimeSpaceNode) it3.next()).getLayer()));
            }
            Iterator it4 = arrayList.iterator();
            if (it4.hasNext()) {
                Integer numValueOf = Integer.valueOf(((Number) it4.next()).intValue());
                while (it4.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((Number) it4.next()).intValue());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue() + 1;
                }
            }
            nLETrack.setLayer(iIntValue);
        }
        nLETrackSlot.setStartTime((long) baseStickerModel.getStartTime());
        nLETrackSlot.setEndTime(model.getMaxTargetEnd());
        nLETrackSlot.setMainSegment(LJIIL());
        nLETrackSlot.setTransformX((2 * baseStickerModel.getTranslateX()) / this.LJIIL.width);
        nLETrackSlot.setTransformY(((-2) * baseStickerModel.getTranslateY()) / this.LJIIL.height);
        nLETrackSlot.setRotation((-baseStickerModel.getRotation()) % 360);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\nclientX=");
        sbLIZ.append(baseStickerModel.getTranslateX());
        sbLIZ.append(", clientY=");
        sbLIZ.append(baseStickerModel.getTranslateY());
        sbLIZ.append(",\nnleX=");
        sbLIZ.append(nLETrackSlot.getTransformX());
        sbLIZ.append(", nleY=");
        sbLIZ.append(nLETrackSlot.getTransformY());
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            nLETrack.addSlot(nLETrackSlot);
            this.LJIIZILJ.getModel().addTrack(nLETrack);
            uuid = nLETrackSlot.getUUID();
        } else {
            NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(true));
            nLETrack.removeSlot(nLETrackSlot);
            nLETrack.addSlot(nLETrackSlotDynamicCast);
            uuid = nLETrackSlotDynamicCast.getUUID();
        }
        this.LJI = uuid;
        C385050F7v.LJ(this.LJIIZILJ);
        this.LJIILIIL.LIZ.setUuid(this.LJI);
        super.LJIIIIZZ();
        this.LJIILIIL.LIZ(new C2217381BqS() { // from class: X.0EN6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((MemeSongTextStickerModel) obj).getVisible());
            }
        }).LJIIIZ(this.LJIILJJIL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1084));
        LIZIZ();
    }
}

package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DpI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350900DpI extends C350680Dow implements InterfaceC350930DpL {
    public C350900DpI(C0E48 c0e48) {
        super(c0e48);
        TimeUnit.SECONDS.toMicros(3L);
    }

    @Override // X.InterfaceC350930DpL
    public final Pair<NLETrack, NLETrackSlot> LJJJJI(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel) {
        NLETrack trackBySlot;
        boolean z;
        if (nLEModel == null) {
            nLEModel = C350870DpF.LJI(this.LIZ);
        }
        if (nLETrackSlot == null) {
            nLETrackSlot = LLJJI();
            trackBySlot = LLJJIII();
        } else {
            trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot);
        }
        if (trackBySlot != null && C351220Dpo.LLJLILLLLZIIL(trackBySlot)) {
            z = true;
        } else {
            z = false;
        }
        if (z || (trackBySlot != null && C351220Dpo.LLJJJJ(trackBySlot))) {
            trackBySlot.removeSlot(nLETrackSlot);
            LLJJ(null, enumC356070Dxd);
            return new Pair<>(trackBySlot, nLETrackSlot);
        }
        return new Pair<>(null, null);
    }

    @Override // X.InterfaceC350930DpL
    public final NLETrackSlot LJJJLL(C089X c089x, C350910DpJ c350910DpJ, EnumC356070Dxd enumC356070Dxd) {
        NLETrack nLETrackPt;
        NLETrackSlot nLETrackSlotDynamicCast;
        float fFloatValue;
        NLESegment nLESegment;
        float fFloatValue2;
        String str;
        NLETrackSlot nLETrackSlotLLLLLLIL = c350910DpJ.LJIIL;
        if ((nLETrackSlotLLLLLLIL == null && (nLETrackSlotLLLLLLIL = this.LIZ.LLLLLLIL()) == null) || (nLETrackPt = this.LIZ.Pt()) == null || (nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLLLLLLIL.deepClone(true))) == null) {
            return null;
        }
        nLETrackSlotDynamicCast.setExtra("previewIconPath", c350910DpJ.LIZ);
        if (c089x == C089X.INFO) {
            NLESegmentInfoSticker nLESegmentInfoSticker = new NLESegmentInfoSticker();
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceFile(c350910DpJ.LIZIZ);
            nLEResourceNode.setResourceType(NLEResType.INFO_STICKER);
            String str2 = c350910DpJ.LIZJ;
            if (str2 != null) {
                nLEResourceNode.setResourceId(str2);
            }
            if (C1452960nug.LJIIIZ && (str = c350910DpJ.LJIIIIZZ) != null && str.length() != 0) {
                nLEResourceNode.setExtra("biz_res_id", C0FGD.LIZ(c350910DpJ.LJII, c350910DpJ.LJIIIIZZ));
            }
            Float fLJIILIIL = C351220Dpo.LJIILIIL(nLETrackSlotLLLLLLIL);
            if (fLJIILIIL != null) {
                fFloatValue2 = fLJIILIIL.floatValue();
            } else {
                fFloatValue2 = 1.0f;
            }
            nLESegmentInfoSticker.setAlpha(fFloatValue2);
            nLESegmentInfoSticker.setEffectSDKFile(nLEResourceNode);
            nLESegment = nLESegmentInfoSticker;
        } else {
            NLESegmentImageSticker nLESegmentImageSticker = new NLESegmentImageSticker();
            NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
            nLEResourceNode2.setResourceFile(c350910DpJ.LIZIZ);
            nLEResourceNode2.setResourceType(NLEResType.IMAGE_STICKER);
            nLESegmentImageSticker.setImageFile(nLEResourceNode2);
            Float fLJIILIIL2 = C351220Dpo.LJIILIIL(nLETrackSlotLLLLLLIL);
            if (fLJIILIIL2 != null) {
                fFloatValue = fLJIILIIL2.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            nLESegmentImageSticker.setAlpha(fFloatValue);
            nLESegment = nLESegmentImageSticker;
        }
        nLETrackSlotDynamicCast.setMainSegment(nLESegment);
        if (c089x == C089X.IMAGE) {
            nLETrackSlotDynamicCast.setRelativeWidth(c350910DpJ.LIZLLL);
            nLETrackSlotDynamicCast.setRelativeHeight(c350910DpJ.LJ);
        }
        nLETrackSlotDynamicCast.setScale(1.0f);
        nLETrackPt.removeSlot(nLETrackSlotLLLLLLIL);
        C350870DpF.LIZ(this.LIZ, false);
        nLETrackPt.addSlot(nLETrackSlotDynamicCast);
        LLJJ(null, enumC356070Dxd);
        return nLETrackSlotDynamicCast;
    }
}

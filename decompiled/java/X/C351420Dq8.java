package X;

import Y.AComparatorS24S0000000_5;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESetting;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0Dq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351420Dq8 {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC355990DxV LIZIZ(NLETrackSlot nLETrackSlot) {
        NLEResType type;
        if (nLETrackSlot == null) {
            return null;
        }
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null) {
            type = mainSegment.getType();
        } else {
            type = null;
        }
        if (type != NLEResType.IMAGE && type != NLEResType.VIDEO) {
            if (C351220Dpo.LLJ(nLETrackSlot)) {
                return EnumC355990DxV.FILTER;
            }
            if (C351220Dpo.LLJJI(nLETrackSlot)) {
                return EnumC355990DxV.EFFECT;
            }
            if (Intrinsics.LJFF(nLETrackSlot.getExtra("text_slot_type"), "SUBTITLE")) {
                return EnumC355990DxV.CAPTION;
            }
            if (nLETrackSlot.hasExtra("text_slot_type") && Intrinsics.LJFF(nLETrackSlot.getExtra("text_slot_type"), "TEXT_STICKER")) {
                return EnumC355990DxV.TEXT;
            }
            if (C351220Dpo.LLJJIJIIJIL(nLETrackSlot)) {
                return EnumC355990DxV.ADJUST;
            }
            if (!C351220Dpo.LLJJLIIIJLLLLLLLZ(nLETrackSlot)) {
                return null;
            }
            return EnumC355990DxV.STICKER;
        }
        return EnumC355990DxV.OVERLAY;
    }

    public static boolean LIZLLL(NLEModel nLEModel) {
        NLESetting setting;
        if (nLEModel != null && (setting = nLEModel.getSetting()) != null && setting.getFreeRenderLayer()) {
            return true;
        }
        return false;
    }

    public static void LIZ(NLEModel nLEModel, NLEEditor nLEEditor) {
        EnumC355980DxU enumC355980DxULIZ;
        int iIntValue;
        NLESetting setting = nLEModel.getSetting();
        if (setting != null && setting.getFreeRenderLayer()) {
            return;
        }
        nLEEditor.updateRenderLayers(nLEModel);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLLJL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        for (NLETrackSlot nLETrackSlot : arrayList2) {
            NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentTextStickerDynamicCast != null && !nLESegmentTextStickerDynamicCast.getIsRichtext()) {
                nLETrackSlot.setTransformZ(nLETrackSlot.getTransformZ() + 100000);
            }
        }
        VecNLETrackSPtr tracks2 = nLEModel.getTracks();
        ArrayList arrayList3 = new ArrayList();
        for (NLETrack nLETrack2 : tracks2) {
            NLETrack nLETrack3 = nLETrack2;
            if (!nLETrack3.getMainTrack() && !C351220Dpo.LLIIZ(nLETrack3)) {
                arrayList3.add(nLETrack2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList4);
        }
        EnumC355980DxU enumC355980DxU = null;
        for (NLETrackSlot nLETrackSlot2 : C13LP.LJLLLL(new AComparatorS24S0000000_5(157), arrayList4)) {
            EnumC355990DxV enumC355990DxVLIZIZ = LIZIZ(nLETrackSlot2);
            if (enumC355990DxVLIZIZ != null) {
                enumC355980DxULIZ = C351430Dq9.LIZ(enumC355990DxVLIZIZ);
            } else {
                enumC355980DxULIZ = null;
            }
            if (C123100dR.LIZ(C351220Dpo.LJLJL(nLETrackSlot2, "lyric_id", null))) {
                enumC355980DxULIZ = EnumC355980DxU.STICKER;
            }
            if (enumC355980DxULIZ != null) {
                if (enumC355980DxU == null) {
                    enumC355980DxU = enumC355980DxULIZ;
                }
                if (enumC355980DxULIZ != enumC355980DxU && enumC355980DxULIZ.getLayerRange().getStart().intValue() > enumC355980DxU.getLayerRange().LJFF().intValue()) {
                    enumC355980DxU = enumC355980DxULIZ;
                }
                Integer num = (Integer) linkedHashMap.get(enumC355980DxU);
                if (num != null) {
                    iIntValue = num.intValue() + 1;
                } else {
                    iIntValue = enumC355980DxU.getLayerRange().getStart().intValue();
                }
                nLETrackSlot2.setTransformZ(iIntValue);
                linkedHashMap.put(enumC355980DxU, Integer.valueOf(iIntValue));
            }
        }
        for (EnumC355980DxU enumC355980DxU2 : EnumC355980DxU.values()) {
            Integer start = (Integer) linkedHashMap.get(enumC355980DxU2);
            if (start == null) {
                start = enumC355980DxU2.getLayerRange().getStart();
            }
            nLEModel.setExtra(enumC355980DxU2.name(), String.valueOf(start.intValue()));
        }
    }

    public static int LJ(NLEModel nLEModel, EnumC355980DxU enumC355980DxU) {
        NLESetting setting = nLEModel.getSetting();
        if (setting == null || !setting.getFreeRenderLayer()) {
            return 0;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (!nLETrack2.getMainTrack() && !C351220Dpo.LLIIZ(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            IntRange layerRange = enumC355980DxU.getLayerRange();
            int i = layerRange.LL;
            int i2 = layerRange.LLILLJJLI;
            int transformZ = ((NLETimeSpaceNode) obj).getTransformZ();
            if (i <= transformZ && transformZ <= i2) {
                arrayList3.add(obj);
            }
        }
        Iterator it3 = arrayList3.iterator();
        if (it3.hasNext()) {
            Integer numValueOf = Integer.valueOf(((NLETimeSpaceNode) it3.next()).getTransformZ());
            while (it3.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((NLETimeSpaceNode) it3.next()).getTransformZ());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            if (numValueOf != null) {
                return numValueOf.intValue() + 1;
            }
        }
        return enumC355980DxU.getLayerRange().getStart().intValue();
    }

    public static void LIZJ(NLETrackSlot nLETrackSlot, int i, NLEModel nLEModel, EnumC355980DxU enumC355980DxU) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (!nLETrack2.getMainTrack() && !C351220Dpo.LLIIZ(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
            IntRange layerRange = enumC355980DxU.getLayerRange();
            int i2 = layerRange.LL;
            int i3 = layerRange.LLILLJJLI;
            int transformZ = nLETimeSpaceNode.getTransformZ();
            if (i2 <= transformZ && transformZ <= i3 && !Intrinsics.LJFF(nLETimeSpaceNode.getUUID(), nLETrackSlot.getUUID())) {
                arrayList3.add(obj);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList3, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj2 : arrayList3) {
            linkedHashMap.put(Integer.valueOf(((NLETimeSpaceNode) obj2).getTransformZ()), obj2);
        }
        HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(linkedHashMap.keySet());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (hashSetLLIFFJFJJ.contains(Integer.valueOf(i))) {
            int i4 = i + 1;
            linkedHashMap2.put(Integer.valueOf(i), Integer.valueOf(i4));
            i = i4;
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) linkedHashMap.get(entry.getKey());
            if (nLETimeSpaceNode2 != null) {
                nLETimeSpaceNode2.setTransformZ(((Number) entry.getValue()).intValue());
            }
        }
    }
}

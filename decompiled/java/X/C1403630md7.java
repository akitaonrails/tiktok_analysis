package X;

import com.ss.android.ugc.aweme.effect.ReuploadMetaData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0md7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403630md7 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(62));

    public static void LIZ(C1403560md0 c1403560md0, VideoPublishEditModel videoPublishEditModel, boolean z, int i) {
        EnumC1403590md3[] enumC1403590md3ArrValues;
        if ((i & 2) != 0) {
            enumC1403590md3ArrValues = EnumC1403590md3.values();
        } else {
            enumC1403590md3ArrValues = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        ArrayList<Pair> arrayList = new ArrayList(enumC1403590md3ArrValues.length);
        for (EnumC1403590md3 enumC1403590md3 : enumC1403590md3ArrValues) {
            arrayList.add(new Pair(enumC1403590md3, new ArrayList()));
        }
        for (Pair pair : arrayList) {
            EnumC1403590md3 enumC1403590md32 = (EnumC1403590md3) pair.getFirst();
            List list = (List) pair.getSecond();
            int i2 = C1403610md5.LIZ[enumC1403590md32.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    C1403620md6.LIZ(videoPublishEditModel, list, enumC1403590md32, "nle_extra_resource_id", "ep_magic_resource_id");
                } else {
                    throw new C1954807lC();
                }
            } else {
                C1403620md6.LIZ(videoPublishEditModel, list, enumC1403590md32, "nleExtraEffectKey", "ep_magic_effect_id");
            }
        }
        for (Pair pair2 : arrayList) {
            EnumC1403590md3 enumC1403590md33 = (EnumC1403590md3) pair2.getFirst();
            pair2.getSecond();
            int i3 = C1403610md5.LIZ[enumC1403590md33.ordinal()];
            if (i3 != 1 && i3 != 2) {
                throw new C1954807lC();
            }
        }
        ArrayList<ReuploadMetaData> arrayListLJ = C1403710mdF.LJ(videoPublishEditModel, z);
        for (Pair pair3 : arrayList) {
            EnumC1403590md3 enumC1403590md34 = (EnumC1403590md3) pair3.getFirst();
            List list2 = (List) pair3.getSecond();
            for (ReuploadMetaData reuploadMetaData : arrayListLJ) {
                if (C1403650md9.LIZIZ[enumC1403590md34.ordinal()] == 1) {
                    String str = reuploadMetaData.effect_list;
                    if (C123100dR.LIZ(str)) {
                        list2.add(str);
                    }
                }
            }
        }
        for (Pair pair4 : arrayList) {
            ((C20584084o) c1403560md0.LIZ).putCoreParam$tools_camera_base_release(((EnumC1403590md3) pair4.getFirst()).getParamName(), C13LP.LJJLIIIJ((Iterable) pair4.getSecond(), ",", null, null, 0, null, null, 62));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(C1403560md0 c1403560md0, VideoPublishEditModel videoPublishEditModel, boolean z, int i) {
        EnumC1403640md8[] enumC1403640md8Arr;
        Map<String, Object> basicEventParam;
        if ((i & 2) != 0) {
            enumC1403640md8Arr = (EnumC1403640md8[]) EnumC1403640md8.getEntries().toArray(new EnumC1403640md8[0]);
        } else {
            enumC1403640md8Arr = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if (!C564320MBi.LIZIZ(videoPublishEditModel)) {
            ArrayList<Pair> arrayList = new ArrayList(enumC1403640md8Arr.length);
            for (EnumC1403640md8 enumC1403640md8 : enumC1403640md8Arr) {
                arrayList.add(new Pair(enumC1403640md8, new ArrayList()));
            }
            C1403670mdB.LIZJ(arrayList, videoPublishEditModel);
            C1403710mdF.LIZIZ(videoPublishEditModel, arrayList, z);
            C1403670mdB.LIZ(arrayList, videoPublishEditModel);
            for (Pair pair : arrayList) {
                ((C20584084o) c1403560md0.LIZ).putCoreParam$tools_camera_base_release(((EnumC1403640md8) pair.getFirst()).getParamName(), C13LP.LJJLIIIJ((Iterable) pair.getSecond(), ",", null, null, 0, null, null, 62));
            }
            StickerInfo stickerInfo = videoPublishEditModel.stickerInfo;
            if (stickerInfo != null && (basicEventParam = stickerInfo.getBasicEventParam()) != null) {
                C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addReportBasicParamToEditPublishPage, basicParamMap = ");
                sbLIZ.append(basicEventParam);
                C201955140j.LJIILL(c20012313Rx, "PropETReporter", C2188811AlT.LIZIZ(sbLIZ));
                Set setSingleton = Collections.singleton("prop_panel_model_request_id");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : basicEventParam.entrySet()) {
                    if (setSingleton.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
                }
                c1403560md0.LJI(linkedHashMap2);
            }
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = CardStruct.IStatusCode.DEFAULT;
            C1403670mdB.LIZLLL(videoPublishEditModel, new AwS601S0100000_22(c259800zU, (C259800zU<String>) 92));
            StickerInfo stickerInfo2 = videoPublishEditModel.stickerInfo;
            if (stickerInfo2 != null && Intrinsics.LJFF(stickerInfo2.isAigcPropApplied(), Boolean.TRUE)) {
                c259800zU.element = "1";
            }
            c1403560md0.LJ("is_aigc_prop_applied", (String) c259800zU.element);
        }
    }
}

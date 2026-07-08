package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Xkq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857740Xkq {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(AVTextExtraStruct aVTextExtraStruct, String str) {
        int i;
        if (aVTextExtraStruct.isTransient() && (i = aVTextExtraStruct.start) >= 0 && i < str.length()) {
            int i2 = aVTextExtraStruct.start;
            int i3 = aVTextExtraStruct.end;
            if (i2 < i3 && i3 <= str.length()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZ(String str, List list, AVTextExtraStruct aVTextExtraStruct) {
        if (LIZIZ(aVTextExtraStruct, str)) {
            ListProtector.add(list, 0, aVTextExtraStruct);
            return true;
        }
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add transient metadata failed, displayText: ");
        sbLIZ.append(str);
        sbLIZ.append(", transient metadata: ");
        sbLIZ.append(GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), list));
        sbLIZ.append(", chain boundary: ");
        sbLIZ.append(aVTextExtraStruct);
        c1437510nVlLJJLIIIJ.LIZ("CaptionBoundary", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public static void LIZJ(String str, String str2, List list, List list2) {
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("chain: ");
        sbLIZ.append(str);
        sbLIZ.append(", caption: ");
        sbLIZ.append(str2);
        sbLIZ.append(", transientMetadata: ");
        sbLIZ.append(list);
        sbLIZ.append(", metadata: ");
        sbLIZ.append(list2);
        c1437510nVlLJJLIIIJ.LIZ("CaptionBoundary", C2188811AlT.LIZIZ(sbLIZ));
        C0CHQ.LIZ().getPublishService().LJJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("resolveChainString", str);
        linkedHashMap.put("caption", str2);
        linkedHashMap.put("transientMetadata", list.toString());
        linkedHashMap.put("metadataForRendering", list2.toString());
        C857760Xks.LIZJ(linkedHashMap);
    }
}

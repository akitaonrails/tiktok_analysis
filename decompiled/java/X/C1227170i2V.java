package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227170i2V {
    public static Map LIZ(List list) {
        Iterator it2 = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it2.hasNext()) {
            String strValueOf = String.valueOf(((C1224840hyk) it2.next()).LLJI.get("tab_type"));
            if (Intrinsics.LJFF(strValueOf, EnumC1227210i2Z.TIME.getValue())) {
                i++;
            } else if (Intrinsics.LJFF(strValueOf, EnumC1227210i2Z.GIFT.getValue())) {
                i2++;
            } else if (Intrinsics.LJFF(strValueOf, EnumC1227210i2Z.SMB.getValue())) {
                i3++;
            } else if (Intrinsics.LJFF(strValueOf, EnumC1227210i2Z.TOP_GUEST.getValue())) {
                i4++;
            }
        }
        return C2097608Jq.LJIIIIZZ(new Pair("live_topviewer_add_member_cnt", String.valueOf(i)), new Pair("live_topgifter_add_member_cnt", String.valueOf(i2)), new Pair("live_top_interester_add_member_cnt", String.valueOf(i3)), new Pair("live_topguest_add_member_cnt", String.valueOf(i4)));
    }

    public static Map LIZIZ(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC1227200i2Y enumC1227200i2Y : EnumC1227200i2Y.values()) {
            for (EnumC1227180i2W enumC1227180i2W : EnumC1227180i2W.values()) {
                if (enumC1227180i2W != EnumC1227180i2W.RECOMMEND) {
                    linkedHashMap.put(new C1227160i2U(enumC1227200i2Y, enumC1227180i2W), 0);
                }
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1224840hyk c1224840hyk = (C1224840hyk) it2.next();
            IMUser iMUserLIZ = C1225230hzN.LIZ(c1224840hyk);
            if (iMUserLIZ != null) {
                C1227160i2U c1227160i2U = new C1227160i2U(C1227190i2X.LIZ(iMUserLIZ), C1227190i2X.LIZIZ(c1224840hyk, false));
                linkedHashMap.put(c1227160i2U, Integer.valueOf(C1527905yX.LIZ((Integer) linkedHashMap.get(c1227160i2U)) + 1));
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C1227160i2U c1227160i2U2 = (C1227160i2U) entry.getKey();
            c1227160i2U2.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1227160i2U2.LIZ.getKey());
            sbLIZ.append('_');
            sbLIZ.append(c1227160i2U2.LIZIZ.getKey());
            sbLIZ.append("_user_cnt");
            arrayList.add(new Pair(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(((Number) entry.getValue()).intValue())));
        }
        return C2097608Jq.LJIILLIIL(arrayList);
    }
}

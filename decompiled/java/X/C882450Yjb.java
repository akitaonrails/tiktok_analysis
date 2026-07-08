package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Yjb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882450Yjb {
    public static final C882450Yjb LIZ = new C882450Yjb();

    public static Map LIZJ() {
        Pair[] pairArr = new Pair[12];
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        int i2 = 0;
        do {
            arrayList.add(0);
            i2++;
        } while (i2 < 128);
        pairArr[0] = new Pair("input_ids", arrayList);
        ArrayList arrayList2 = new ArrayList(128);
        int i3 = 0;
        do {
            arrayList2.add(0);
            i3++;
        } while (i3 < 128);
        pairArr[1] = new Pair("attention_mask", arrayList2);
        pairArr[2] = new Pair("sender_followers", Collections.singletonList(0));
        pairArr[3] = new Pair("receiver_followers", Collections.singletonList(0));
        pairArr[4] = new Pair("send_time_duration", Collections.singletonList(0));
        pairArr[5] = new Pair("sender_blue_v", Collections.singletonList(0));
        pairArr[6] = new Pair("receiver_blue_v", Collections.singletonList(0));
        pairArr[7] = new Pair("relation_tag", Collections.singletonList(0));
        ArrayList arrayList3 = new ArrayList(18);
        int i4 = 0;
        do {
            arrayList3.add(0);
            i4++;
        } while (i4 < 18);
        pairArr[8] = new Pair("sender_account_type_one_hot", arrayList3);
        ArrayList arrayList4 = new ArrayList(18);
        int i5 = 0;
        do {
            arrayList4.add(0);
            i5++;
        } while (i5 < 18);
        pairArr[9] = new Pair("receiver_account_type_one_hot", arrayList4);
        ArrayList arrayList5 = new ArrayList(4);
        int i6 = 0;
        do {
            arrayList5.add(0);
            i6++;
        } while (i6 < 4);
        pairArr[10] = new Pair("entrance_type_one_hot", arrayList5);
        ArrayList arrayList6 = new ArrayList(4);
        do {
            arrayList6.add(0);
            i++;
        } while (i < 4);
        pairArr[11] = new Pair("message_type_one_hot", arrayList6);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static List LIZIZ(Map map) {
        int size = C882490Yjf.LIZIZ.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(0);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        for (String str : linkedHashMap.keySet()) {
            List list = (List) linkedHashMap.get(str);
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(iIntValue);
                Integer num = C882490Yjf.LIZIZ.get(C2188811AlT.LIZIZ(sbLIZ));
                if (num != null) {
                    ListProtector.set(arrayList, num.intValue(), 1);
                } else {
                    ListProtector.set(arrayList, 0, 1);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<X.C0Y8T> r24, X.InterfaceC1364105Vn<? super java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> r25) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C882450Yjb.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }
}

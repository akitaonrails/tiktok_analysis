package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderSku;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.034s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7848034s {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C752702wn c752702wn) {
        List<C719102rN> list;
        Map<String, Boolean> map;
        Map<String, Boolean> map2;
        StringBuffer stringBuffer = new StringBuffer();
        if (c752702wn != null && (list = c752702wn.LLILZLL) != null) {
            for (C719102rN c719102rN : list) {
                String str = c719102rN.LLLLIL;
                if (str == null) {
                    str = "";
                }
                String str2 = c719102rN.LLILZLL;
                if (str2 != null && (map = c752702wn.LLIZ) != null && map.containsKey(str2) && (map2 = c752702wn.LLIZ) != null && Intrinsics.LJFF(map2.get(str2), Boolean.TRUE)) {
                    stringBuffer.append(str);
                    stringBuffer.append(',');
                }
            }
        }
        String string = stringBuffer.toString();
        if (a0.LJJIJIIJIL(string, ',')) {
            return a0.LJLJJI(string, ',');
        }
        return string;
    }

    public static String LIZIZ(C752702wn c752702wn, Map map) {
        Map<String, Boolean> map2;
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (c752702wn != null && (map2 = c752702wn.LLIZ) != null) {
            for (Map.Entry<String, Boolean> entry : map2.entrySet()) {
                if (entry != null && entry.getValue().booleanValue() && (str = (String) ((HashMap) map).get(entry.getKey())) != null) {
                    stringBuffer.append(str);
                    stringBuffer.append(',');
                }
            }
        }
        String string = stringBuffer.toString();
        if (a0.LJJIJIIJIL(string, ',')) {
            return a0.LJLJJI(string, ',');
        }
        return string;
    }

    public static CreateOrderSku LJ(CreateOrderSku createOrderSku, String str, C817603Hi c817603Hi) {
        String strLJIIIIZZ = c817603Hi.LJIIIIZZ(str, null);
        if (C123100dR.LIZ(strLJIIIIZZ)) {
            return CreateOrderSku.LIZ(createOrderSku, null, strLJIIIIZZ, 8323071);
        }
        return createOrderSku;
    }

    public static List LIZJ(C752702wn c752702wn, Boolean bool, C719102rN c719102rN, Boolean bool2) {
        Map<String, Boolean> map;
        String str;
        String str2;
        if (c752702wn == null || (map = c752702wn.LLIZ) == null || map.isEmpty()) {
            return null;
        }
        if (Intrinsics.LJFF(bool2, Boolean.FALSE)) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                if (entry.getValue().booleanValue()) {
                    arrayList.add(entry.getKey());
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, Boolean> entry2 : map.entrySet()) {
            if (entry2.getValue().booleanValue()) {
                arrayList2.add(entry2.getKey());
            }
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            if (c719102rN != null && (str2 = c719102rN.LLILZLL) != null && !arrayList2.contains(str2)) {
                arrayList2.add(str2);
            }
        } else if (c719102rN != null && (str = c719102rN.LLILZLL) != null && arrayList2.contains(str)) {
            arrayList2.remove(str);
            return arrayList2;
        }
        return arrayList2;
    }
}

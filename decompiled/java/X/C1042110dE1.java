package X;

import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0dE1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042110dE1 {
    public static C1042120dE2 LIZ(String str, String str2, String str3, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (C1039940dAW.LIZ(((SSPResponse.Rule) obj).type, "GET")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (C1039940dAW.LIZ(((SSPResponse.Rule) obj2).type, "POST")) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            SSPResponse.Rule rule = (SSPResponse.Rule) obj3;
            if (!C1039940dAW.LIZ(rule.type, "GET") && !C1039940dAW.LIZ(rule.type, "POST")) {
                arrayList3.add(obj3);
            }
        }
        return new C1042120dE2(str, str2, str3, list, arrayList, arrayList2, arrayList3);
    }
}

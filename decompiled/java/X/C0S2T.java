package X;

import androidx.fragment.app.Fragment;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S2T, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S2T {
    public static C0S2U LIZ(String str) {
        C0S2U next;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Fragment fragmentLIZLLL;
        Iterator<C0S2U> it2 = C0S2U.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getEtString(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0S2U c0s2u = next;
        if (c0s2u == null) {
            c0s2u = C0S2U.UNKNOWN;
        }
        if (c0s2u == C0S2U.UNKNOWN) {
            C0W8I.LIZ.getClass();
            if (C0W8I.LIZIZ() && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZLLL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(str);
                sbLIZ.append("] is not added to QuickReplyTriggerReason. Please add it or contact @dongwoo.han!!!");
                c1389890mGx.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return c0s2u;
    }
}

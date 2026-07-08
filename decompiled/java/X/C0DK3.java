package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DK3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DK3 {
    public static final void LIZ(List<String> list, String str, EnumC325870Cq1 enumC325870Cq1, String str2) {
        Context contextLIZ;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String str3 : list) {
                if (!a0.LJJJIL(str3)) {
                    arrayList.add(str3);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(arrayList));
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ == null || (contextLIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) {
                C844470XAv.LIZ.getClass();
                contextLIZ = C844470XAv.LIZ();
            }
            c1331670kl3LJIIJ.LJJIJL(contextLIZ);
            if (str2 != null && str2.length() != 0) {
                c1331670kl3LJIIJ.LIZLLL(str2);
            }
            if (str != null && str.length() != 0) {
                c1331670kl3LJIIJ.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3LJIIJ.LJJJJJ = str;
            }
            int i = C325880Cq2.LIZ[enumC325870Cq1.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c1331670kl3LJIIJ.LJJIII();
                    return;
                }
                throw new C1954807lC();
            }
            c1331670kl3LJIIJ.LJIILL();
        }
    }
}

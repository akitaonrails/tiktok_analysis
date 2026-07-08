package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07nR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1968707nR {
    public final String LIZ;
    public final List<String> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\"");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("\":[");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZIZ != null) {
            for (int i = 0; i < ((ArrayList) this.LIZIZ).size(); i++) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("\"");
                sbLIZ2.append((String) ListProtector.get(this.LIZIZ, i));
                sbLIZ2.append("\"");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                if (i != ((ArrayList) this.LIZIZ).size() - 1) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append(",");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    public C1968707nR(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        this.LIZ = str;
        if (list != null) {
            arrayList.addAll(list);
        }
    }
}

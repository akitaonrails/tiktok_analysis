package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C219200sw extends AbstractC219400sy {
    public final Map<String, String> LIZIZ;
    public final Map<String, String> LIZJ;
    public final C01GW LIZLLL;

    @Override // X.AbstractC219600t0
    public final Map<String, String> LIZ() {
        Map<String, String> map = this.LIZJ;
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    @Override // X.AbstractC219600t0
    public final InterfaceC1498620p6K LIZIZ() {
        return new InterfaceC1498620p6K() { // from class: X.00sx
            @Override // X.InterfaceC1498620p6K
            public final String LIZ() {
                return (String) this.LIZ.LIZLLL.getValue();
            }

            @Override // X.InterfaceC1498620p6K
            public final String mimeType() {
                return this.LIZ.LIZ;
            }

            @Override // X.InterfaceC1498620p6K
            public final long length() {
                return u.LJIILLIIL(LIZ()).length;
            }
        };
    }

    public C219200sw(Map map) {
        Map<String, String> mapLJ = C2097608Jq.LJ();
        this.LIZIZ = map;
        this.LIZJ = mapLJ;
        this.LIZLLL = C452501pT.LIZIZ(new Function0() { // from class: X.00sv
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String strLIZIZ = "";
                int i = 0;
                for (Object obj : this.LL.LIZIZ.entrySet()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (i > 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append('&');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(C2101908Lh.LIZ(str));
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ2);
                    sbLIZ3.append('=');
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strLIZIZ3);
                    sbLIZ4.append(C2101908Lh.LIZ(str2));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                    i = i2;
                }
                return strLIZIZ;
            }
        });
    }
}

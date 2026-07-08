package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0dQG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049700dQG {
    public final C1049710dQH LIZ;
    public final Map<String, List<AbstractC1050010dQl>> LIZIZ;
    public final C19JH LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final List<AbstractC1050010dQl> LIZ(String str) {
        Map<String, List<AbstractC1050010dQl>> map = this.LIZIZ;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LIZIZ.get(str);
    }

    public C1049700dQG(C19JH c19jh, C1049710dQH c1049710dQH) {
        this.LIZJ = c19jh;
        this.LIZ = c1049710dQH;
        this.LIZIZ = c1049710dQH.LIZ;
    }

    public final void LIZIZ(final String str, List list) {
        AbstractC1049690dQF abstractC1049690dQFLIZ;
        if (list != null) {
            ArrayList<C1050000dQk> arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                for (final C1050000dQk c1050000dQk : arrayList) {
                    if (c1050000dQk != null) {
                        final C19JH c19jh = this.LIZJ;
                        C1021670ch3 c1021670ch3 = (C1021670ch3) ((HashMap) C1862507Rf.LIZ).get(c1050000dQk.LIZLLL);
                        if (c1021670ch3 == null || (abstractC1049690dQFLIZ = c1021670ch3.LIZ(c19jh, str, c1050000dQk)) == null) {
                            abstractC1049690dQFLIZ = new AbstractC1049690dQF(c19jh, str, c1050000dQk) { // from class: X.0dQI
                                @Override // X.AbstractC1049690dQF
                                public final void LIZIZ() {
                                    C19JH c19jh2 = this.LIZIZ;
                                    InterfaceC1049730dQJ interfaceC1049730dQJ = c19jh2.LLLLLIL;
                                    if (interfaceC1049730dQJ != null) {
                                        interfaceC1049730dQJ.LIZ(c19jh2, this.LIZ);
                                    }
                                }
                            };
                        }
                        abstractC1049690dQFLIZ.LIZIZ();
                        abstractC1049690dQFLIZ.LIZJ();
                    }
                }
            }
        }
    }
}

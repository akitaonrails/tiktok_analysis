package X;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0gMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1162990gMz {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final Context LIZ;
    public C21326518d5 LIZLLL;
    public C21326718d7 LJ;
    public C1156700gCq LJFF;
    public Map<String, ? extends Object> LJII;
    public volatile boolean LJIIIIZZ;
    public int LIZIZ = -1;
    public final C1162950gMv LIZJ = new C1162950gMv();
    public Map<String, ? extends Object> LJI = C2097608Jq.LJ();

    public final void LIZIZ() {
        C21326718d7 c21326718d7 = this.LJ;
        if (c21326718d7 == null) {
            c21326718d7 = null;
        }
        c21326718d7.LJII(false);
        Iterator<Map.Entry<Long, C21331518dt>> it2 = c21326718d7.LJJJJZ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LIZ();
        }
        c21326718d7.LJJJJZ.clear();
        C21323118cX c21323118cX = c21326718d7.LJJJLIIL;
        if (c21323118cX != null) {
            c21323118cX.LIZIZ();
        }
        c21326718d7.LJJJLIIL = null;
        C21326718d7 c21326718d72 = this.LJ;
        C21326718d7 c21326718d73 = c21326718d72 == null ? null : c21326718d72;
        c21326718d73.LJIIL = null;
        c21326718d73.LJIILIIL = false;
        if (c21326718d72 == null) {
            c21326718d72 = null;
        }
        c21326718d72.LJIILJJIL = null;
    }

    public C1162990gMz(Context context) {
        this.LIZ = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1162990gMz.LIZJ(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(String str, Map map) {
        Map map2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot bind data: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LJIIIIZZ) {
            if (map.isEmpty()) {
                map2 = this.LJI;
            } else {
                map2 = map;
            }
            if (this.LJI.isEmpty() && (!map.isEmpty())) {
                this.LJI = map;
            }
            C21326518d5 c21326518d5 = this.LIZLLL;
            C21326518d5 c21326518d52 = c21326518d5;
            if (c21326518d5 == null) {
                c21326518d52 = 0;
            }
            C1156700gCq c1156700gCq = this.LJFF;
            if (c1156700gCq == null) {
                c1156700gCq = null;
            }
            c21326518d52.LIZ(map2, null, str, c1156700gCq);
            return;
        }
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}

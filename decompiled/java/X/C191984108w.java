package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.108w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191984108w {
    public final String LIZ;
    public final String LIZIZ;
    public Boolean LIZJ;
    public boolean LIZLLL;

    public final void LIZJ(String str) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        Pair[] pairArr = new Pair[4];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("page_tag", str);
        pairArr[1] = new Pair("item_name", this.LIZ);
        pairArr[2] = new Pair("item_type", this.LIZIZ);
        pairArr[3] = new Pair("is_enabled", String.valueOf(this.LIZJ));
        C1913480ztS.LIZIZ("pns_tpsc_item_show", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public C191984108w(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    public final void LIZ(Integer num, String str) {
        Pair[] pairArr = new Pair[4];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("page_tag", str);
        pairArr[1] = new Pair("item_name", this.LIZ);
        pairArr[2] = new Pair("item_type", this.LIZIZ);
        pairArr[3] = new Pair("is_enabled", String.valueOf(this.LIZJ));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (num != null) {
            mapLJIIJ.put("option_value", num.toString());
        }
        C1913480ztS.LIZIZ("pns_tpsc_item_click", mapLJIIJ);
    }

    public final void LIZIZ(Integer num, String str, boolean z) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        Pair[] pairArr = new Pair[4];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("page_tag", str);
        pairArr[1] = new Pair("item_name", this.LIZ);
        pairArr[2] = new Pair("item_type", this.LIZIZ);
        pairArr[3] = new Pair("is_enabled", String.valueOf(this.LIZJ));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.put("is_checked", String.valueOf(z));
        if (num != null) {
            mapLJIIJ.put("option_value", num.toString());
        }
        C1913480ztS.LIZIZ("pns_tpsc_item_show", mapLJIIJ);
    }
}

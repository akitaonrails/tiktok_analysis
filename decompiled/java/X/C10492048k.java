package X;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.048k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10492048k extends C041O {
    public final boolean LIZJ;
    public final long LIZLLL;
    public final int LJ;

    @Override // X.C041O
    public final HashMap<String, Object> LIZ() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("style", this.LIZJ ? "full" : "half");
        pairArr[1] = new Pair("start_click_to_now", Long.valueOf(this.LIZLLL));
        pairArr[2] = new Pair("product_quantity", Integer.valueOf(this.LJ));
        return C2097608Jq.LJI(pairArr);
    }

    public C10492048k(boolean z, long j, int i) {
        super("rd_tiktokec_anchor_sku_duration");
        this.LIZJ = z;
        this.LIZLLL = j;
        this.LJ = i;
    }
}

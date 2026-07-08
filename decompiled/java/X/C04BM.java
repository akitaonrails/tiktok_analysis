package X;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.04BM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04BM extends C041O {
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final int LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;
    public final long LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final int LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;

    @Override // X.C041O
    public final HashMap<String, Object> LIZ() {
        Pair[] pairArr = new Pair[16];
        pairArr[0] = new Pair("style", this.LIZJ ? "full" : "half");
        pairArr[1] = new Pair("business", this.LIZLLL ? "video" : "");
        pairArr[2] = new Pair("retry_count", Integer.valueOf(this.LJ));
        pairArr[3] = new Pair("preload_type", Integer.valueOf(this.LJI));
        pairArr[4] = new Pair("template", this.LJFF);
        pairArr[5] = new Pair("start_click_to_now", Long.valueOf(this.LJII));
        pairArr[6] = new Pair("image_load_duration", Long.valueOf(this.LJIIIIZZ));
        pairArr[7] = new Pair("load_success", Integer.valueOf(this.LJIIIZ));
        pairArr[8] = new Pair("cold_start", Integer.valueOf(this.LJIIJ ? 1 : 0));
        pairArr[9] = new Pair("is_from_preview", Integer.valueOf(this.LJIIL ? 1 : 0));
        pairArr[10] = new Pair("hit_cache", Integer.valueOf(this.LJIILIIL ? 1 : 0));
        pairArr[11] = new Pair("start_scene_to_now", Long.valueOf(this.LJIIJJI));
        pairArr[12] = new Pair("has_first_screen_data", Integer.valueOf(this.LJIILJJIL ? 1 : 0));
        pairArr[13] = new Pair("lynx_card_count", Integer.valueOf(this.LJIILL));
        pairArr[14] = new Pair("search_jump_in_num", this.LJIIZILJ);
        pairArr[15] = new Pair("entrance_form", this.LJIILLIIL);
        return C2097608Jq.LJI(pairArr);
    }

    public C04BM(boolean z, boolean z2, int i, String str, int i2, long j, long j2, int i3, boolean z3, long j3, boolean z4, boolean z5, boolean z6, int i4, String str2, String str3) {
        super("rd_tiktokec_anchor_product_detail_duration");
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = i;
        this.LJFF = str;
        this.LJI = i2;
        this.LJII = j;
        this.LJIIIIZZ = j2;
        this.LJIIIZ = i3;
        this.LJIIJ = z3;
        this.LJIIJJI = j3;
        this.LJIIL = z4;
        this.LJIILIIL = z5;
        this.LJIILJJIL = z6;
        this.LJIILL = i4;
        this.LJIILLIIL = str2;
        this.LJIIZILJ = str3;
    }
}

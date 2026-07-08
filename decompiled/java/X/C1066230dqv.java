package X;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0dqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066230dqv extends C041O {
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;

    @Override // X.C041O
    public final HashMap<String, Object> LIZ() {
        return C2097608Jq.LJI(new Pair("enter2loaded_cost", Long.valueOf(this.LIZJ)), new Pair("load_cost", Long.valueOf(this.LIZLLL)), new Pair("load_success", Boolean.valueOf(this.LJI)), new Pair("ab", Integer.valueOf(this.LJ)), new Pair("cache", Boolean.valueOf(this.LJFF)), new Pair("preview_radio", Float.valueOf(this.LJII)), new Pair("radio", Float.valueOf(this.LJIIIIZZ)), new Pair("leak_preview_loading", Boolean.valueOf(this.LJIIIZ)), new Pair("leak_real_loading", Boolean.valueOf(this.LJIIJ)), new Pair("hit_pre_download", Boolean.valueOf(this.LJIIJJI)));
    }

    public C1066230dqv(float f, float f2, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super("rd_tiktokec_pdp_image_load");
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = i;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = f;
        this.LJIIIIZZ = f2;
        this.LJIIIZ = z3;
        this.LJIIJ = z4;
        this.LJIIJJI = z5;
    }
}

package X;

import android.net.Uri;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523430pkL {
    public static final /* synthetic */ int LJIIL = 0;
    public final Uri LIZ;
    public final String LIZIZ;
    public final C09AE LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public long LJFF = 0;
    public long LJI = 0;
    public long LJII = 0;
    public long LJIIIIZZ = 0;
    public String LJIIIZ = "";
    public boolean LJIIJ = false;
    public final float LJIIJJI;

    public final void LIZ() {
        C1018703yb.LIZIZ("rd_ec_deals_native_prefetch", C2097608Jq.LJIIIIZZ(new Pair("channel_name", this.LIZLLL), new Pair("start_time", Long.valueOf(this.LJ)), new Pair("init_data_time", Long.valueOf(this.LJFF)), new Pair("view_load_success_time", Long.valueOf(this.LJI)), new Pair("update_data_time", Long.valueOf(this.LJII)), new Pair("timeout_time", Long.valueOf(this.LJIIIIZZ)), new Pair("update_type", this.LJIIIZ), new Pair("shop_mall_destroy", Integer.valueOf(this.LJIIJ ? 1 : 0)), new Pair("mem_usage_percent", Float.valueOf(this.LJIIJJI))));
    }

    public C1523430pkL(Uri uri, String str, AnonymousClass0956 anonymousClass0956, String str2, long j, float f) {
        this.LIZ = uri;
        this.LIZIZ = str;
        this.LIZJ = anonymousClass0956;
        this.LIZLLL = str2;
        this.LJ = j;
        this.LJIIJJI = f;
    }
}

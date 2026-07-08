package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lVH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360330lVH {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;

    public final boolean LIZ() {
        return Intrinsics.LJFF(this.LIZ, "friends_v3_post_simple_detail") || Intrinsics.LJFF(this.LIZ, "friends_v3_post_normal_detail") || Intrinsics.LJFF(this.LIZ, "friends_v3_repost_detail");
    }

    public final Map<String, String> LIZIZ() {
        boolean z = true;
        if (this.LIZ.length() == 0) {
            return C2097608Jq.LJ();
        }
        C13DA c13da = new C13DA();
        if (!Intrinsics.LJFF(this.LIZ, "friends_v3_text_post_detail")) {
            c13da.put("enter_from", "homepage_friends");
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("friends_tab_version", "v3.0");
        pairArr[1] = new Pair("is_collapse_reposts", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZIZ(this.LIZ))));
        pairArr[2] = new Pair("is_detail_page", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZJ(this.LIZ))));
        if (!Intrinsics.LJFF(this.LIZ, "friends_v3_repost_detail") && !Intrinsics.LJFF(this.LIZ, "friends_v3_repost_feeds_detail") && !Intrinsics.LJFF(this.LIZLLL, Boolean.TRUE)) {
            z = false;
        }
        pairArr[3] = new Pair("is_recommend", C1360320lVG.LIZLLL(Boolean.valueOf(z)));
        c13da.putAll(C2097608Jq.LJIIIIZZ(pairArr));
        return c13da.build();
    }

    public C1360330lVH(String str, String str2, String str3, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = bool;
    }

    public /* synthetic */ C1360330lVH(String str, String str2, String str3, Boolean bool, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }
}

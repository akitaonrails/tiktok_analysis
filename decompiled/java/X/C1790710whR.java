package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0whR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790710whR {
    public static final Map<String, String> LIZ(C1810410xDD c1810410xDD) {
        if (c1810410xDD.LIZ == EnumC1811400xEo.GAME_RANK && !Intrinsics.LJFF(c1810410xDD.LIZIZ, c1810410xDD.LIZLLL)) {
            HashMap map = new HashMap();
            map.put("sub_rank_game_name", c1810410xDD.LIZIZ.rankName);
            return map;
        }
        return null;
    }
}

package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpStoreRecommendColorPair;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03xJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1010703xJ {
    public static final List<Integer> LIZ = C1697810uHb.LJIIJJI(8, 66, 67, 32);
    public static final Map<Integer, Map<Integer, Integer>> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(0, C2097608Jq.LJIIIIZZ(new Pair(0, 11), new Pair(1, 12), new Pair(2, 13))), new Pair(1, C2097608Jq.LJIIIIZZ(new Pair(0, 21), new Pair(1, 22), new Pair(2, 23))), new Pair(2, C2097608Jq.LJIIIIZZ(new Pair(0, 31), new Pair(1, 32), new Pair(2, 33))), new Pair(3, C2097608Jq.LJIIIIZZ(new Pair(0, 41), new Pair(1, 42), new Pair(2, 43))), new Pair(4, C2097608Jq.LJIIIIZZ(new Pair(0, 51), new Pair(1, 52), new Pair(2, 53))), new Pair(5, C2097608Jq.LJIIIIZZ(new Pair(0, 61), new Pair(1, 62), new Pair(2, 63))), new Pair(6, C2097608Jq.LJIIIIZZ(new Pair(0, 71), new Pair(1, 72), new Pair(2, 73))), new Pair(7, C2097608Jq.LJIIIIZZ(new Pair(0, 81), new Pair(1, 82), new Pair(2, 83))), new Pair(8, C2097608Jq.LJIIIIZZ(new Pair(0, 91), new Pair(1, 92), new Pair(2, 93))), new Pair(9, C2097608Jq.LJIIIIZZ(new Pair(0, 101), new Pair(1, 102), new Pair(2, 103))), new Pair(10, C2097608Jq.LJIIIIZZ(new Pair(0, 122), new Pair(1, 122), new Pair(2, 123))));
    public static final int LIZJ = 82;

    public static final Integer LIZIZ(Context context, EcPdpStoreRecommendColorPair ecPdpStoreRecommendColorPair) {
        String str;
        boolean z;
        Integer numValueOf = null;
        if (ecPdpStoreRecommendColorPair == null) {
            return null;
        }
        if (C1744700vVE.LJ(context, null)) {
            str = ecPdpStoreRecommendColorPair.dark;
        } else {
            str = ecPdpStoreRecommendColorPair.light;
        }
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            numValueOf = Integer.valueOf(Color.parseColor(str));
            return numValueOf;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return numValueOf;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(android.widget.LinearLayout r9, com.bytedance.lighten.loader.SmartImageView r10, com.bytedance.tux.input.TuxTextView r11, com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel r12, com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpStoreRecommendLogisticsTagStyleItem r13) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1010703xJ.LIZ(android.widget.LinearLayout, com.bytedance.lighten.loader.SmartImageView, com.bytedance.tux.input.TuxTextView, com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel, com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpStoreRecommendLogisticsTagStyleItem):void");
    }
}

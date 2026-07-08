package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.PromotionProperty;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19676311yb {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("coupon_id", "coupon_type_id", "coupon_type_info", "coupon_cost_role", "coupon_name", "coupon_type", "campaign_id", "campaign_channel", "campaign_user_tag", "campaign_type");
    public static final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(15, 16, 20, 19);

    public static final boolean LIZLLL(PromotionLabel promotionLabel) {
        List<PromotionProperty> list;
        if (3 != promotionLabel.type || (list = promotionLabel.extraProperty) == null) {
            return false;
        }
        for (PromotionProperty promotionProperty : list) {
            PromotionProperty promotionProperty2 = promotionProperty;
            if (Intrinsics.LJFF("is_fans_exclusive", promotionProperty2.propertyName) && Intrinsics.LJFF("1", promotionProperty2.propertyValue)) {
                if (promotionProperty == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final void LJ(Map<String, String> map, Map<String, String> map2) {
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (LIZ.contains(key)) {
                String str = (String) ((LinkedHashMap) map).get(key);
                if (str == null) {
                    map.put(key, value);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(',');
                    sbLIZ.append(value);
                    map.put(key, C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                map.put(key, value);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r2 = java.lang.Float.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r3 == 12) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        return new kotlin.Pair(r2, java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair LIZJ(android.content.Context r6, float r7, com.bytedance.tux.input.TuxTextView r8, com.bytedance.tux.input.TuxTextView r9, java.lang.String r10, java.lang.String r11) {
        /*
            android.graphics.Paint r5 = new android.graphics.Paint
            android.text.TextPaint r0 = r8.getPaint()
            r5.<init>(r0)
            android.graphics.Paint r2 = new android.graphics.Paint
            android.text.TextPaint r0 = r9.getPaint()
            r2.<init>(r0)
            r4 = 12
            r3 = 12
        L16:
            int r0 = X.C1210230hbB.LIZ(r3, r6)
            float r0 = (float) r0
            r5.setTextSize(r0)
            int r0 = X.C1210230hbB.LIZ(r3, r6)
            float r0 = (float) r0
            r2.setTextSize(r0)
            float r1 = r5.measureText(r10)
            float r0 = r2.measureText(r11)
            float r1 = r1 + r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4a
            r0 = 9
            if (r3 == r0) goto L4a
            if (r3 == r0) goto L3c
            int r3 = r3 + (-1)
            goto L16
        L3c:
            r0 = 1091567616(0x41100000, float:9.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L4a:
            float r0 = (float) r3
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            if (r3 == r4) goto L5c
            r0 = 1
        L52:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L5c:
            r0 = 0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19676311yb.LIZJ(android.content.Context, float, com.bytedance.tux.input.TuxTextView, com.bytedance.tux.input.TuxTextView, java.lang.String, java.lang.String):kotlin.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        return new kotlin.Pair<>(java.lang.Float.valueOf(r10), java.lang.Float.valueOf(java.lang.Math.min(r1, r5)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair<java.lang.Float, java.lang.Float> LIZIZ(android.content.Context r4, float r5, com.bytedance.tux.input.TuxTextView r6, com.bytedance.tux.input.TuxTextView r7, java.lang.String r8, java.lang.String r9, int r10, int r11) {
        /*
            android.graphics.Paint r3 = new android.graphics.Paint
            android.text.TextPaint r0 = r6.getPaint()
            r3.<init>(r0)
            android.graphics.Paint r2 = new android.graphics.Paint
            android.text.TextPaint r0 = r7.getPaint()
            r2.<init>(r0)
            if (r11 > r10) goto L4d
        L14:
            int r0 = X.C1210230hbB.LIZ(r10, r4)
            float r0 = (float) r0
            r3.setTextSize(r0)
            int r0 = X.C1210230hbB.LIZ(r10, r4)
            float r0 = (float) r0
            r2.setTextSize(r0)
            float r1 = r3.measureText(r8)
            float r0 = r2.measureText(r9)
            float r1 = r1 + r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r0 = 9
            if (r10 == r0) goto L3a
            if (r10 == r11) goto L4d
            int r10 = r10 + (-1)
            goto L14
        L3a:
            float r0 = (float) r10
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            float r0 = java.lang.Math.min(r1, r5)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L4d:
            r0 = 1091567616(0x41100000, float:9.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19676311yb.LIZIZ(android.content.Context, float, com.bytedance.tux.input.TuxTextView, com.bytedance.tux.input.TuxTextView, java.lang.String, java.lang.String, int, int):kotlin.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        return new X.C19676411yc(r11, r1 + r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C19676411yc LIZ(android.content.Context r5, float r6, com.bytedance.tux.input.TuxTextView r7, com.bytedance.tux.input.TuxTextView r8, java.lang.String r9, java.lang.String r10, int r11, int r12, float r13) {
        /*
            android.graphics.Paint r4 = new android.graphics.Paint
            android.text.TextPaint r0 = r7.getPaint()
            r4.<init>(r0)
            android.graphics.Paint r3 = new android.graphics.Paint
            android.text.TextPaint r0 = r8.getPaint()
            r3.<init>(r0)
            r2 = 9
            if (r12 > r11) goto L41
        L16:
            int r0 = X.C1210230hbB.LIZ(r11, r5)
            float r0 = (float) r0
            r4.setTextSize(r0)
            int r0 = X.C1210230hbB.LIZ(r11, r5)
            float r0 = (float) r0
            r3.setTextSize(r0)
            float r1 = r4.measureText(r9)
            float r0 = r3.measureText(r10)
            float r1 = r1 + r0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L3a
            if (r11 == r2) goto L3a
            if (r11 == r12) goto L41
            int r11 = r11 + (-1)
            goto L16
        L3a:
            X.11yc r0 = new X.11yc
            float r1 = r1 + r13
            r0.<init>(r11, r1)
            return r0
        L41:
            X.11yc r0 = new X.11yc
            float r6 = r6 + r13
            r0.<init>(r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19676311yb.LIZ(android.content.Context, float, com.bytedance.tux.input.TuxTextView, com.bytedance.tux.input.TuxTextView, java.lang.String, java.lang.String, int, int, float):X.11yc");
    }
}

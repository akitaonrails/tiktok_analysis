package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.11yZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19676111yZ {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("coupon_id", "coupon_type_id", "coupon_type_info", "coupon_cost_role", "coupon_name", "coupon_type", "campaign_id", "campaign_channel", "campaign_user_tag", "campaign_type");
    public static final List<String> LIZIZ = Collections.singletonList("label_type");
    public static final List<Integer> LIZJ = C1697810uHb.LJIIJJI(15, 16, 20, 19);

    public static final void LIZLLL(Map<String, String> map, Map<String, String> map2) {
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
            } else if (!LIZIZ.contains(key)) {
                map.put(key, value);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        return new kotlin.Pair(java.lang.Float.valueOf(r2), java.lang.Float.valueOf(java.lang.Math.min(r1, r6)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair LIZIZ(android.content.Context r5, float r6, com.bytedance.tux.input.TuxTextView r7, com.bytedance.tux.input.TuxTextView r8, java.lang.String r9, java.lang.String r10) {
        /*
            android.graphics.Paint r4 = new android.graphics.Paint
            android.text.TextPaint r0 = r7.getPaint()
            r4.<init>(r0)
            android.graphics.Paint r3 = new android.graphics.Paint
            android.text.TextPaint r0 = r8.getPaint()
            r3.<init>(r0)
            r2 = 12
        L14:
            int r0 = X.C1210230hbB.LIZ(r2, r5)
            float r0 = (float) r0
            r4.setTextSize(r0)
            int r0 = X.C1210230hbB.LIZ(r2, r5)
            float r0 = (float) r0
            r3.setTextSize(r0)
            float r1 = r4.measureText(r9)
            float r0 = r3.measureText(r10)
            float r1 = r1 + r0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L4a
            r0 = 9
            if (r2 == r0) goto L4a
            if (r2 == r0) goto L3a
            int r2 = r2 + (-1)
            goto L14
        L3a:
            r0 = 1091567616(0x41100000, float:9.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r6)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L4a:
            float r0 = (float) r2
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            float r0 = java.lang.Math.min(r1, r6)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19676111yZ.LIZIZ(android.content.Context, float, com.bytedance.tux.input.TuxTextView, com.bytedance.tux.input.TuxTextView, java.lang.String, java.lang.String):kotlin.Pair");
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
        throw new UnsupportedOperationException("Method not decompiled: X.C19676111yZ.LIZJ(android.content.Context, float, com.bytedance.tux.input.TuxTextView, com.bytedance.tux.input.TuxTextView, java.lang.String, java.lang.String):kotlin.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return new X.C19676211ya(r3, r2 + r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C19676211ya LIZ(android.content.Context r6, float r7, com.bytedance.tux.input.TuxTextView r8, com.bytedance.tux.input.TuxTextView r9, java.lang.String r10, java.lang.String r11, float r12) {
        /*
            android.graphics.Paint r5 = new android.graphics.Paint
            android.text.TextPaint r0 = r8.getPaint()
            r5.<init>(r0)
            android.graphics.Paint r4 = new android.graphics.Paint
            android.text.TextPaint r0 = r9.getPaint()
            r4.<init>(r0)
            r3 = 12
        L14:
            int r0 = X.C1210230hbB.LIZ(r3, r6)
            float r0 = (float) r0
            r5.setTextSize(r0)
            int r0 = X.C1210230hbB.LIZ(r3, r6)
            float r0 = (float) r0
            r4.setTextSize(r0)
            float r2 = r5.measureText(r10)
            float r0 = r4.measureText(r11)
            float r2 = r2 + r0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L41
            r1 = 9
            if (r3 == r1) goto L41
            if (r3 == r1) goto L3a
            int r3 = r3 + (-1)
            goto L14
        L3a:
            X.11ya r0 = new X.11ya
            float r7 = r7 + r12
            r0.<init>(r1, r7)
            return r0
        L41:
            X.11ya r0 = new X.11ya
            float r2 = r2 + r12
            r0.<init>(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19676111yZ.LIZ(android.content.Context, float, com.bytedance.tux.input.TuxTextView, com.bytedance.tux.input.TuxTextView, java.lang.String, java.lang.String, float):X.11ya");
    }
}

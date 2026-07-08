package X;

import kotlin.text.Regex;

/* JADX INFO: renamed from: X.00x0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C244400x0 {
    public static final C244400x0 LIZ = new C244400x0();
    public static final Regex LIZIZ = new Regex("\\{s_([^}]+)\\}");

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence LIZ(com.bytedance.android.livesdk.model.message.common.Text r10) {
        /*
            java.lang.String r9 = ""
            if (r10 != 0) goto L5
            return r9
        L5:
            java.lang.String r0 = r10.key
            if (r0 == 0) goto L7f
            X.0fNV r1 = X.C1124870fNV.LIZJ()
            java.lang.String r0 = r10.key
            r1.getClass()
            java.lang.String r0 = X.C1124870fNV.LIZIZ(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7f
            X.0fNV r1 = X.C1124870fNV.LIZJ()
            java.lang.String r0 = r10.key
            r1.getClass()
            java.lang.String r8 = X.C1124870fNV.LIZIZ(r0)
        L29:
            r7 = 0
            android.text.Spannable r5 = X.C1133830fbx.LJIILJJIL(r8, r10, r7)
            android.text.Spannable r6 = X.C1133830fbx.LIZ
            r4 = 0
            if (r5 != r6) goto L5f
            com.bytedance.android.livesdk.livesetting.gift.LiveGiftSupportNewPlaceHolderSetting r0 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftSupportNewPlaceHolderSetting.INSTANCE
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L5f
            int r0 = r8.length()
            if (r0 == 0) goto L5f
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            kotlin.text.Regex r2 = X.C244400x0.LIZIZ
            X.020f r1 = new X.020f
            r0 = 148(0x94, float:2.07E-43)
            r1.<init>(r3, r0)
            java.lang.String r1 = r2.replace(r8, r1)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L5f
            if (r1 == 0) goto L5f
            android.text.Spannable r5 = X.C1133830fbx.LJIILJJIL(r1, r10, r7)
        L5f:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L85
            if (r5 == r6) goto L85
            boolean r0 = X.C1125810fP1.LIZIZ()
            if (r0 == 0) goto L7e
            com.bytedance.android.livesdk.model.message.common.TextFormat r0 = r10.defaultFormat
            if (r0 == 0) goto L7e
            int r2 = r0.weight
            if (r2 <= 0) goto L7e
            int r1 = r5.length()
            r0 = 33
            X.C1119920fFW.LJIIIIZZ(r5, r4, r1, r0, r2)
        L7e:
            return r5
        L7f:
            java.lang.String r8 = r10.defaultPattern
            if (r8 != 0) goto L29
            r8 = r9
            goto L29
        L85:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244400x0.LIZ(com.bytedance.android.livesdk.model.message.common.Text):java.lang.CharSequence");
    }
}

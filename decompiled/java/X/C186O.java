package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.186O, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C186O implements AnonymousClass1865 {
    public final C186V LIZ;
    public boolean LIZIZ;
    public AnonymousClass1868 LIZJ;

    public C186O(C186V c186v) {
        this.LIZ = c186v;
    }

    @Override // X.AnonymousClass1865
    public final void LJIILIIL(AnonymousClass1868 anonymousClass1868) {
        List<String> list;
        this.LIZJ = anonymousClass1868;
        if (anonymousClass1868 != null && (list = anonymousClass1868.LJIIJJI) != null) {
            this.LIZ.LIZJ(list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    @Override // X.AnonymousClass1865
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(com.bytedance.tux.input.TuxTextView r4, com.bytedance.tux.input.TuxTextView r5, boolean r6) {
        /*
            r3 = this;
            X.1868 r0 = r3.LIZJ
            if (r0 == 0) goto L1b
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig r0 = r0.LIZJ
            if (r0 == 0) goto L1b
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.LabelColor r0 = r0.color
            if (r0 == 0) goto L1b
            java.lang.Integer r0 = r0.LIZ()
            if (r0 == 0) goto L1b
            int r0 = r0.intValue()
            if (r4 == 0) goto L1b
            r4.setTextColor(r0)
        L1b:
            if (r6 == 0) goto L8f
            X.1868 r0 = r3.LIZJ
            if (r0 == 0) goto L96
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag r2 = r0.LJIIIIZZ
        L23:
            if (r2 == 0) goto L3c
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig r0 = r2.text
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.LabelColor r0 = r0.color
            if (r0 == 0) goto L3c
            java.lang.Integer r0 = r0.LIZ()
            if (r0 == 0) goto L3c
            int r0 = r0.intValue()
            if (r5 == 0) goto L3c
            r5.setTextColor(r0)
        L3c:
            boolean r1 = r3.LIZIZ
            r0 = 0
            if (r1 == 0) goto L98
            r3.LIZIZ = r0
            if (r4 == 0) goto L5b
            X.1868 r0 = r3.LIZJ
            if (r0 == 0) goto L88
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig r0 = r0.LIZJ
            if (r0 == 0) goto L88
            int r1 = r0.font
            X.0cEQ r0 = X.InterfaceC1003930cER.LJIILIIL
            r0.getClass()
            int r0 = X.C1003920cEQ.LIZ(r1)
        L58:
            r4.setTuxFont(r0)
        L5b:
            if (r2 == 0) goto L7d
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig r0 = r2.text
            if (r0 == 0) goto L7d
            int r1 = r0.font
            X.0cEQ r0 = X.InterfaceC1003930cER.LJIILIIL
            r0.getClass()
            int r0 = X.C1003920cEQ.LIZ(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L70:
            if (r0 == 0) goto L7b
            int r0 = r0.intValue()
            if (r5 == 0) goto L7b
            r5.setTuxFont(r0)
        L7b:
            r0 = 1
            return r0
        L7d:
            X.186V r0 = r3.LIZ
            X.186X r0 = r0.LJIILL()
            java.lang.Integer r0 = r0.LJI()
            goto L70
        L88:
            X.186V r0 = r3.LIZ
            int r0 = r0.LJII()
            goto L58
        L8f:
            X.1868 r0 = r3.LIZJ
            if (r0 == 0) goto L96
            com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag r2 = r0.LJII
            goto L23
        L96:
            r2 = 0
            goto L3c
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C186O.LJIIIZ(com.bytedance.tux.input.TuxTextView, com.bytedance.tux.input.TuxTextView, boolean):boolean");
    }

    @Override // X.AnonymousClass1865
    public final void LJIIJ(TuxTextView tuxTextView, String str, DiscountTag discountTag) {
        LJIILL(this.LIZ.LJIILL().LJ(), tuxTextView, str, discountTag);
    }

    public static void LJIILL(EnumC19355010ns enumC19355010ns, TuxTextView tuxTextView, String str, DiscountTag discountTag) {
        StringBuilder sbLIZ;
        if (enumC19355010ns != EnumC19355010ns.NONE) {
            if (discountTag != null) {
                Boolean bool = discountTag.useBrackets;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(bool, bool2)) {
                    if (Intrinsics.LJFF(discountTag.useMinusPrefix, bool2)) {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("(-");
                    } else {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('(');
                    }
                    sbLIZ.append(str);
                    sbLIZ.append(')');
                    str = C2188811AlT.LIZIZ(sbLIZ);
                } else if (Intrinsics.LJFF(discountTag.useMinusPrefix, bool2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('-');
                    sbLIZ2.append(str);
                    str = C2188811AlT.LIZIZ(sbLIZ2);
                }
                tuxTextView.setText(str);
                return;
            }
            if (enumC19355010ns != EnumC19355010ns.COLOR_BG_WITHOUT_BRACKETS) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('(');
                sbLIZ3.append(str);
                sbLIZ3.append(')');
                str = C2188811AlT.LIZIZ(sbLIZ3);
            }
            tuxTextView.setText(str);
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
    }

    @Override // X.AnonymousClass1865
    public final boolean LJI(TuxTextView tuxTextView, TuxTextView tuxTextView2, Integer num, Integer num2) {
        if ((this.LIZ.LIZIZ() != EnumC1990607qy.V2 && this.LIZ.LIZIZ() != EnumC1990607qy.V3 && this.LIZ.LIZIZ() != EnumC1990607qy.V5) || (((tuxTextView == null || tuxTextView.getVisibility() != 0 || tuxTextView.getWidth() > 0) && (tuxTextView2 == null || tuxTextView2.getVisibility() != 0 || tuxTextView2.getWidth() > 0)) || this.LIZIZ)) {
            return false;
        }
        this.LIZIZ = true;
        if (num != null) {
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(num.intValue());
            }
        } else if (tuxTextView != null) {
            tuxTextView.LJJJJI(10.0f);
        }
        if (num2 != null) {
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(num2.intValue());
            }
        } else if (tuxTextView2 != null) {
            tuxTextView2.LJJJJI(10.0f);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // X.AnonymousClass1865
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(com.bytedance.tux.input.TuxTextView r12, X.C186X r13, java.lang.String r14, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag r15) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C186O.LJIIJJI(com.bytedance.tux.input.TuxTextView, X.186X, java.lang.String, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[PHI: r1 r10
      0x0044: PHI (r1v57 java.lang.Integer) = (r1v52 java.lang.Integer), (r1v60 java.lang.Integer) binds: [B:174:0x02b1, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r10v25 int) = (r10v23 int), (r10v26 int) binds: [B:174:0x02b1, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0272 A[PHI: r1 r16
      0x0272: PHI (r1v15 java.lang.Integer) = (r1v13 java.lang.Integer), (r1v18 java.lang.Integer) binds: [B:169:0x0299, B:162:0x0270] A[DONT_GENERATE, DONT_INLINE]
      0x0272: PHI (r16v3 int) = (r16v1 int), (r16v4 int) binds: [B:169:0x0299, B:162:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4 A[PHI: r6 r10
      0x00d4: PHI (r6v24 java.lang.Integer) = (r6v22 java.lang.Integer), (r6v27 java.lang.Integer) binds: [B:125:0x01dd, B:60:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00d4: PHI (r10v16 int) = (r10v14 int), (r10v17 int) binds: [B:125:0x01dd, B:60:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010a A[PHI: r6 r10
      0x010a: PHI (r6v13 java.lang.Integer) = (r6v11 java.lang.Integer), (r6v16 java.lang.Integer) binds: [B:121:0x01c8, B:76:0x0108] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r10v11 int) = (r10v9 int), (r10v12 int) binds: [B:121:0x01c8, B:76:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0140 A[PHI: r1 r9
      0x0140: PHI (r1v45 java.lang.Integer) = (r1v43 java.lang.Integer), (r1v48 java.lang.Integer) binds: [B:117:0x01b4, B:92:0x013e] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r9v10 int) = (r9v8 int), (r9v11 int) binds: [B:117:0x01b4, B:92:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014d  */
    @Override // X.AnonymousClass1865
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.bytedance.tux.input.TuxTextView r22, java.lang.String r23, java.lang.String r24, X.AnonymousClass1844 r25, android.content.Context r26) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C186O.LJIIL(com.bytedance.tux.input.TuxTextView, java.lang.String, java.lang.String, X.1844, android.content.Context):void");
    }
}

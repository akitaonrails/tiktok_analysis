package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import java.util.HashMap;

/* JADX INFO: renamed from: X.17zn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21212517zn extends C594100NRw {
    public C21212517zn(AbstractC21198517xX<AbstractC21202917yF> abstractC21198517xX) {
        super(abstractC21198517xX);
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x03a5 A[PHI: r7
      0x03a5: PHI (r7v10 java.lang.String) = (r7v0 java.lang.String), (r7v12 java.lang.String) binds: [B:55:0x00c6, B:53:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03af A[PHI: r18
      0x03af: PHI (r18v2 java.lang.String) = (r18v0 java.lang.String), (r18v3 java.lang.String) binds: [B:48:0x00b1, B:46:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.09AY, X.0sYq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r77) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212517zn.LIZIZ(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C593910NRd
            if (r0 == 0) goto L20
            r4 = r13
            X.0NRd r4 = (X.C593910NRd) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L7b
        L20:
            X.0NRd r4 = new X.0NRd
            r4.<init>(r12, r13)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.17xX<X.17yF> r0 = r12.LIZ
            X.0vTw r1 = r0.LLIZLLLIL
            if (r1 == 0) goto L3e
            java.lang.String r0 = "room_id"
            java.lang.String r7 = r1.LIZJ(r0)
            goto L3f
        L3e:
            r7 = 0
        L3f:
            X.01K1 r1 = X.C0NSL.LIZ()     // Catch: java.lang.Exception -> L81
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi> r0 = com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi.class
            java.lang.Object r2 = r1.create(r0)     // Catch: java.lang.Exception -> L81
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi r2 = (com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi) r2     // Catch: java.lang.Exception -> L81
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi$UnPinCardRequest r6 = new com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi$UnPinCardRequest     // Catch: java.lang.Exception -> L81
            X.17xX<X.17yF> r0 = r12.LIZ     // Catch: java.lang.Exception -> L81
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO r0 = r0.LL     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L5f
            long r0 = r0.productId     // Catch: java.lang.Exception -> L81
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> L81
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L81
            if (r8 != 0) goto L61
        L5f:
            java.lang.String r8 = ""
        L61:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L81
            java.lang.Long r9 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> L81
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L81
            java.lang.String r11 = ""
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L81
            r4.LLILLL = r3     // Catch: java.lang.Exception -> L81
            java.lang.Object r1 = r2.unpinCard(r6, r4)     // Catch: java.lang.Exception -> L81
            if (r1 != r5) goto L7e
            return r5
        L7b:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L81
        L7e:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> L81
            goto L85
        L81:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L85:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212517zn.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.09AY, X.0sYq] */
    @Override // X.InterfaceC21181417um
    public final void LIZ(String str, Product product, Integer num) {
        switch (str.hashCode()) {
            case -1377687758:
                if (!str.equals("button") || this.LIZ.LL == null) {
                    return;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C593900NRc(this, null), 3);
                ?? r0 = this.LIZ.LLJ;
                if (r0 == 0) {
                    return;
                }
                r0.invoke(str, null, null);
                return;
            case -1002552376:
                if (!str.equals("flip_card_lower_area")) {
                    return;
                }
                LIZJ(product, num, C19395610uQ.LJIJ);
                return;
            case 110986:
                if (!str.equals("pic")) {
                    return;
                }
                break;
            case 106069776:
                if (!str.equals("other")) {
                    return;
                }
                break;
            case 110371416:
                if (!str.equals("title")) {
                    return;
                }
                break;
            case 401568455:
                if (!str.equals("flip_card_upper_area")) {
                    return;
                }
                int i = C19395610uQ.LJIIZILJ;
                if (i == 1) {
                    LIZJ(product, num, C19395610uQ.LJIJ);
                    return;
                } else {
                    if (i != 2) {
                        return;
                    }
                    LIZIZ("title");
                    return;
                }
            case 1040297837:
                if (!str.equals("flip_card_pic")) {
                    return;
                }
                int i2 = C19395610uQ.LJIIZILJ;
                if (i2 == 1) {
                    LIZJ(product, num, C19395610uQ.LJIJ);
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    LIZIZ("pic");
                    return;
                }
            default:
                return;
        }
        LIZIZ(str);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.09AY, X.0sYq] */
    public final void LIZJ(Product product, Integer num, String str) {
        String strLIZJ;
        String str2;
        C1743900vTw c1743900vTw = this.LIZ.LLIZLLLIL;
        if (c1743900vTw == null || (strLIZJ = c1743900vTw.LIZJ("room_id")) == null) {
            strLIZJ = "";
        }
        if (str == null) {
            str2 = "live_popup_card";
        } else {
            str2 = str;
        }
        C1440005kM.LIZ(new C1726130v1H(strLIZJ, str2, "", new HashMap()));
        ?? r2 = this.LIZ.LLJ;
        if (r2 != 0) {
            r2.invoke("flip_card", null, str);
        }
    }
}

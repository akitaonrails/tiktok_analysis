package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;

/* JADX INFO: renamed from: X.0NRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594060NRs extends C594070NRt {
    @Override // X.C594070NRt, X.InterfaceC594230NSj
    public final int id() {
        return 1;
    }

    public C594060NRs(AbstractC21198617xY<AbstractC21202217y8> abstractC21198617xY) {
        super(abstractC21198617xY);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C594020NRo
            if (r0 == 0) goto L25
            r5 = r12
            X.0NRo r5 = (X.C594020NRo) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 2
            r10 = 1
            r3 = 0
            if (r0 == 0) goto L33
            if (r0 == r10) goto L6d
            if (r0 != r4) goto L2b
            goto La5
        L25:
            X.0NRo r5 = new X.0NRo
            r5.<init>(r11, r12)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            X.17xY<X.17y8> r0 = r11.LIZ
            X.0vTw r1 = r0.LLIZLLLIL
            if (r1 == 0) goto L43
            java.lang.String r0 = "room_id"
            java.lang.String r9 = r1.LIZJ(r0)
            goto L44
        L43:
            r9 = r3
        L44:
            X.01K1 r1 = X.C0NSL.LIZ()     // Catch: java.lang.Exception -> Lab
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi> r0 = com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi.class
            java.lang.Object r8 = r1.create(r0)     // Catch: java.lang.Exception -> Lab
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi r8 = (com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi) r8     // Catch: java.lang.Exception -> Lab
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi$UnPinCardListRequest r7 = new com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi$UnPinCardListRequest     // Catch: java.lang.Exception -> Lab
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lab
            java.lang.Long r2 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> Lab
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> Lab
            java.lang.String r0 = ""
            r7.<init>(r9, r2, r1, r0)     // Catch: java.lang.Exception -> Lab
            r5.LLILLL = r10     // Catch: java.lang.Exception -> Lab
            java.lang.Object r1 = r8.unpinCardList(r7, r5)     // Catch: java.lang.Exception -> Lab
            if (r1 != r6) goto L70
            return r6
        L6d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> Lab
        L70:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> Lab
            boolean r0 = r1.LIZJ()     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto Laf
            X.17xY<X.17y8> r0 = r11.LIZ     // Catch: java.lang.Exception -> Lab
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r0 = r0.LL     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L81
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig r1 = r0.anchorPinCardConfig     // Catch: java.lang.Exception -> Lab
            goto L82
        L81:
            r1 = r3
        L82:
            if (r0 == 0) goto L85
            goto L87
        L85:
            r0 = r3
            goto L8d
        L87:
            int r0 = r0.cardType     // Catch: java.lang.Exception -> Lab
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> Lab
        L8d:
            java.lang.String r2 = X.C594190NSf.LIZ(r1, r0)     // Catch: java.lang.Exception -> Lab
            if (r2 == 0) goto Laf
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Exception -> Lab
            X.08pq r1 = X.C2107308Nj.LIZ     // Catch: java.lang.Exception -> Lab
            X.0NRl r0 = new X.0NRl     // Catch: java.lang.Exception -> Lab
            r0.<init>(r11, r2, r3)     // Catch: java.lang.Exception -> Lab
            r5.LLILLL = r4     // Catch: java.lang.Exception -> Lab
            java.lang.Object r1 = X.C23250099c.LJI(r5, r1, r0)     // Catch: java.lang.Exception -> Lab
            if (r1 != r6) goto La8
            return r6
        La5:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> Lab
        La8:
            kotlin.Unit r1 = (kotlin.Unit) r1     // Catch: java.lang.Exception -> Lab
            goto Laf
        Lab:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Laf:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C594060NRs.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C594030NRp
            if (r0 == 0) goto L20
            r7 = r10
            X.0NRp r7 = (X.C594030NRp) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r6 = 1
            if (r0 == 0) goto L2e
            if (r0 != r6) goto L26
            goto L67
        L20:
            X.0NRp r7 = new X.0NRp
            r7.<init>(r9, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.17xY<X.17y8> r0 = r9.LIZ
            X.0vTw r1 = r0.LLIZLLLIL
            if (r1 == 0) goto L3e
            java.lang.String r0 = "room_id"
            java.lang.String r5 = r1.LIZJ(r0)
            goto L3f
        L3e:
            r5 = 0
        L3f:
            X.01K1 r1 = X.C0NSL.LIZ()     // Catch: java.lang.Exception -> L6d
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi> r0 = com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi.class
            java.lang.Object r4 = r1.create(r0)     // Catch: java.lang.Exception -> L6d
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi r4 = (com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi) r4     // Catch: java.lang.Exception -> L6d
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi$UnPinCardListRequest r3 = new com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi$UnPinCardListRequest     // Catch: java.lang.Exception -> L6d
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L6d
            java.lang.Long r2 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> L6d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = ""
            r3.<init>(r5, r2, r1, r0)     // Catch: java.lang.Exception -> L6d
            r7.LLILLL = r6     // Catch: java.lang.Exception -> L6d
            java.lang.Object r1 = r4.unpinCardList(r3, r7)     // Catch: java.lang.Exception -> L6d
            if (r1 != r8) goto L6a
            return r8
        L67:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L6d
        L6a:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> L6d
            goto L71
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L71:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C594060NRs.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.09AY, X.0sYq] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.09AY, X.0sYq] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.09AY, X.0sYq] */
    @Override // X.InterfaceC594230NSj
    public final void LIZ(String str, Product product, Integer num) {
        String strLIZJ;
        switch (str.hashCode()) {
            case -1572441828:
                if (!str.equals("pin_button") || this.LIZ.LL == null) {
                    return;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C594000NRm(this, null), 3);
                ?? r0 = this.LIZ.LLJ;
                if (r0 == 0) {
                    return;
                }
                r0.invoke(str, null, null);
                return;
            case -1377687758:
                if (!str.equals("button") || this.LIZ.LL == null) {
                    return;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C594010NRn(this, null), 3);
                ?? r02 = this.LIZ.LLJ;
                if (r02 == 0) {
                    return;
                }
                r02.invoke(str, null, null);
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
            default:
                return;
        }
        C1743900vTw c1743900vTw = this.LIZ.LLIZLLLIL;
        if (c1743900vTw == null || (strLIZJ = c1743900vTw.LIZJ("room_id")) == null) {
            strLIZJ = "";
        }
        C1440005kM.LIZ(new C1726130v1H(strLIZJ, "live_popup_list", "", null));
        ?? r03 = this.LIZ.LLJ;
        if (r03 == 0) {
            return;
        }
        r03.invoke(str, null, null);
    }
}

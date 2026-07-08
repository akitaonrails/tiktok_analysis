package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;

/* JADX INFO: renamed from: X.0NRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594090NRv extends C594100NRw {
    @Override // X.C594100NRw, X.InterfaceC21181417um
    public final int id() {
        return 1;
    }

    public C594090NRv(AbstractC21198517xX<AbstractC21202917yF> abstractC21198517xX) {
        super(abstractC21198517xX);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C593930NRf
            if (r0 == 0) goto L20
            r7 = r10
            X.0NRf r7 = (X.C593930NRf) r7
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
            X.0NRf r7 = new X.0NRf
            r7.<init>(r9, r10)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.17xX<X.17yF> r0 = r9.LIZ
            X.0vTw r1 = r0.LLIZLLLIL
            if (r1 == 0) goto L3e
            java.lang.String r0 = "room_id"
            java.lang.String r5 = r1.LIZJ(r0)
            goto L3f
        L3e:
            r5 = 0
        L3f:
            X.01K1 r1 = X.C0NSL.LIZ()     // Catch: java.lang.Exception -> L6d
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi> r0 = com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi.class
            java.lang.Object r4 = r1.create(r0)     // Catch: java.lang.Exception -> L6d
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi r4 = (com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi) r4     // Catch: java.lang.Exception -> L6d
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi$UnPinCardListRequest r3 = new com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi$UnPinCardListRequest     // Catch: java.lang.Exception -> L6d
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
        throw new UnsupportedOperationException("Method not decompiled: X.C594090NRv.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.09AY, X.0sYq] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.09AY, X.0sYq] */
    @Override // X.InterfaceC21181417um
    public final void LIZ(String str, Product product, Integer num) {
        String strLIZJ;
        switch (str.hashCode()) {
            case -1377687758:
                if (!str.equals("button") || this.LIZ.LL == null) {
                    return;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C593920NRe(this, null), 3);
                ?? r0 = this.LIZ.LLJ;
                if (r0 == 0) {
                    return;
                }
                r0.invoke(str, null, null);
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
        ?? r02 = this.LIZ.LLJ;
        if (r02 == 0) {
            return;
        }
        r02.invoke(str, null, null);
    }
}

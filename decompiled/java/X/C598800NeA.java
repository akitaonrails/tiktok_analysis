package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import webcast.data.oec_msg.ReqItem;

/* JADX INFO: renamed from: X.0NeA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C598800NeA {
    public final InterfaceC497601wk LIZ;
    public AnonymousClass0956 LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public C21182617uy LJ;

    public final void LJ() {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("resume refresh");
        this.LIZLLL = true;
    }

    public C598800NeA(C054G c054g) {
        this.LIZ = c054g;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super X.C0X52<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp>>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C598830NeD
            if (r0 == 0) goto L20
            r4 = r9
            X.0NeD r4 = (X.C598830NeD) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L46
        L20:
            X.0NeD r4 = new X.0NeD
            r4.<init>(r5, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C0NSL.LIZ()     // Catch: java.lang.Exception -> L4c
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi> r0 = com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4c
            com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi r0 = (com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ProductListApi) r0     // Catch: java.lang.Exception -> L4c
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L4c
            java.lang.Object r1 = r0.getLiveMoreAction(r6, r7, r8, r4)     // Catch: java.lang.Exception -> L4c
            if (r1 != r3) goto L49
            return r3
        L46:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L4c
        L49:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> L4c
            return r1
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598800NeA.LIZ(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, X.InterfaceC1364105Vn r26) {
        /*
            r20 = this;
            r3 = r26
            boolean r0 = r3 instanceof X.C598810NeB
            r5 = r20
            if (r0 == 0) goto L26
            r4 = r3
            X.0NeB r4 = (X.C598810NeB) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.LLILZ = r2
        L16:
            java.lang.Object r2 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.00zU r7 = r4.LL
            goto L6e
        L26:
            X.0NeB r4 = new X.0NeB
            r4.<init>(r5, r3)
            goto L16
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r2)
            X.00zU r7 = new X.00zU
            r7.<init>()
            java.lang.String r0 = "/aweme/v1/oec/live/product/pop"
            r7.element = r0
            X.01wk r14 = r5.LIZ     // Catch: java.lang.Exception -> L76
            r0 = 3
            r8 = r21
            com.bytedance.android.livesdk.model.message.DispersionInfo r16 = X.C598410NdX.LIZIZ(r0, r8)     // Catch: java.lang.Exception -> L76
            X.0NS9 r5 = new X.0NS9     // Catch: java.lang.Exception -> L76
            if (r25 == 0) goto L4f
            r6 = 1
            goto L50
        L4f:
            r6 = 0
        L50:
            r12 = 0
            r9 = r24
            r10 = r23
            r11 = r22
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L76
            r4.LL = r7     // Catch: java.lang.Exception -> L76
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L76
            X.0NdS r13 = X.C598360NdS.LIZ     // Catch: java.lang.Exception -> L76
            r15 = r8
            r17 = r12
            r18 = r5
            r19 = r4
            java.lang.Object r2 = r13.LJIIIIZZ(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L76
            if (r2 != r3) goto L71
            return r3
        L6e:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L74
        L71:
            X.0X52 r2 = (X.C0X52) r2     // Catch: java.lang.Exception -> L74
            goto L7b
        L74:
            r0 = move-exception
            goto L77
        L76:
            r0 = move-exception
        L77:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2 = 0
        L7b:
            T r1 = r7.element
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598800NeA.LIZIZ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, X.InterfaceC1364105Vn r25, boolean r26) {
        /*
            r19 = this;
            r3 = r25
            boolean r0 = r3 instanceof X.C598840NeE
            r5 = r19
            if (r0 == 0) goto L24
            r4 = r3
            X.0NeE r4 = (X.C598840NeE) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r0 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILLL
            r1 = 1
            if (r2 == 0) goto L32
            if (r2 != r1) goto L2a
            goto L63
        L24:
            X.0NeE r4 = new X.0NeE
            r4.<init>(r5, r3)
            goto L16
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r0)
            X.01wk r13 = r5.LIZ     // Catch: java.lang.Exception -> L69
            r0 = 3
            r7 = r21
            com.bytedance.android.livesdk.model.message.DispersionInfo r15 = X.C598410NdX.LIZIZ(r0, r7)     // Catch: java.lang.Exception -> L69
            X.0NS8 r5 = new X.0NS8     // Catch: java.lang.Exception -> L69
            if (r26 == 0) goto L44
            r12 = 1
            goto L45
        L44:
            r12 = 0
        L45:
            r11 = 0
            r8 = r24
            r9 = r23
            r10 = r22
            r6 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L69
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L69
            X.0NdS r12 = X.C598360NdS.LIZ     // Catch: java.lang.Exception -> L69
            r14 = r7
            r16 = r11
            r17 = r5
            r18 = r4
            java.lang.Object r0 = r12.LJIIIIZZ(r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Exception -> L69
            if (r0 != r3) goto L66
            return r3
        L63:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L69
        L66:
            X.0X52 r0 = (X.C0X52) r0     // Catch: java.lang.Exception -> L69
            return r0
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598800NeA.LIZJ(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, X.InterfaceC1364105Vn r27, boolean r28) {
        /*
            r21 = this;
            r3 = r27
            boolean r0 = r3 instanceof X.C598820NeC
            r5 = r21
            if (r0 == 0) goto L26
            r4 = r3
            X.0NeC r4 = (X.C598820NeC) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.LLILZ = r2
        L16:
            java.lang.Object r2 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.00zU r7 = r4.LL
            goto L71
        L26:
            X.0NeC r4 = new X.0NeC
            r4.<init>(r5, r3)
            goto L16
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r2)
            X.00zU r7 = new X.00zU
            r7.<init>()
            java.lang.String r0 = "/aweme/v1/oec/live/product/pop/promotion"
            r7.element = r0
            X.01wk r15 = r5.LIZ     // Catch: java.lang.Exception -> L79
            r0 = 6
            r8 = r23
            com.bytedance.android.livesdk.model.message.DispersionInfo r17 = X.C598410NdX.LIZIZ(r0, r8)     // Catch: java.lang.Exception -> L79
            X.0NSA r5 = new X.0NSA     // Catch: java.lang.Exception -> L79
            if (r28 == 0) goto L4f
            r6 = 1
            goto L50
        L4f:
            r6 = 0
        L50:
            r13 = 0
            r9 = r26
            r11 = r25
            r10 = r24
            r12 = r22
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L79
            r4.LL = r7     // Catch: java.lang.Exception -> L79
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L79
            X.0NdS r14 = X.C598360NdS.LIZ     // Catch: java.lang.Exception -> L79
            r16 = r8
            r18 = r13
            r19 = r5
            r20 = r4
            java.lang.Object r2 = r14.LJIIIIZZ(r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Exception -> L79
            if (r2 != r3) goto L74
            return r3
        L71:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L77
        L74:
            X.0X52 r2 = (X.C0X52) r2     // Catch: java.lang.Exception -> L77
            goto L7e
        L77:
            r0 = move-exception
            goto L7a
        L79:
            r0 = move-exception
        L7a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2 = 0
        L7e:
            T r1 = r7.element
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598800NeA.LIZLLL(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn, boolean):java.lang.Object");
    }

    public final void LJFF(AbstractC21198617xY abstractC21198617xY, String str, String str2, ReqItem reqItem, String str3, int i, boolean z, String str4, JSONObject jSONObject, Function1 function1) {
        PopupCardVO popupCardVO;
        if (!C292450BdD.LIZ()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJII("new refresh not enable");
        } else {
            if (reqItem == null || (popupCardVO = abstractC21198617xY.LL) == null) {
                return;
            }
            AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LIZIZ = C23250099c.LIZLLL(this.LIZ, null, null, new C21193417wi(abstractC21198617xY, reqItem, this, str, str3, z, popupCardVO, str2, i, jSONObject, str4, function1, null), 3);
        }
    }
}

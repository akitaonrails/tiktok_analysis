package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import webcast.data.oec_msg.CommerceInfo;
import webcast.data.oec_msg.ReqItem;

/* JADX INFO: renamed from: X.0Ne3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C598730Ne3 {
    public final InterfaceC497601wk LIZ;
    public AnonymousClass0956 LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public C21182517ux LJ;

    public final void LJFF() {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("resume refresh");
        this.LIZLLL = true;
    }

    public C598730Ne3(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = interfaceC497601wk;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super X.C0X52<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetLiveCreatorToolsData>>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C598770Ne7
            if (r0 == 0) goto L21
            r5 = r9
            X.0Ne7 r5 = (X.C598770Ne7) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            goto L50
        L21:
            X.0Ne7 r5 = new X.0Ne7
            r5.<init>(r6, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.01K1 r1 = X.C0NSL.LIZ()     // Catch: java.lang.Exception -> L56
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi> r0 = com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi.class
            java.lang.Object r1 = r1.create(r0)     // Catch: java.lang.Exception -> L56
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi r1 = (com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi) r1     // Catch: java.lang.Exception -> L56
            if (r8 == 0) goto L4d
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r8)     // Catch: java.lang.Exception -> L56
        L44:
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L56
            java.lang.Object r1 = r1.broadcastGetLiveCreatorTools(r7, r0, r2, r5)     // Catch: java.lang.Exception -> L56
            if (r1 != r4) goto L53
            goto L4f
        L4d:
            r0 = r3
            goto L44
        L4f:
            return r4
        L50:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L56
        L53:
            X.0X52 r1 = (X.C0X52) r1     // Catch: java.lang.Exception -> L56
            return r1
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598730Ne3.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r6, java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super X.C0X52<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp>>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C598780Ne8
            if (r0 == 0) goto L20
            r4 = r9
            X.0Ne8 r4 = (X.C598780Ne8) r4
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
            X.0Ne8 r4 = new X.0Ne8
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
            java.lang.Class<com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi> r0 = com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Exception -> L4c
            com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi r0 = (com.ss.android.ugc.aweme.ecommercelive.common.biz.us.api.UsProductListApi) r0     // Catch: java.lang.Exception -> L4c
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
        throw new UnsupportedOperationException("Method not decompiled: X.C598730Ne3.LIZIZ(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r24, java.lang.String r25, boolean r26, long r27, webcast.data.oec_msg.CommerceInfo r29, java.lang.String r30, java.lang.String r31, X.InterfaceC1364105Vn<? super kotlin.Pair<X.C0X52<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp>>, java.lang.String>> r32) {
        /*
            r23 = this;
            r3 = r32
            boolean r0 = r3 instanceof X.C598740Ne4
            r5 = r23
            if (r0 == 0) goto L26
            r4 = r3
            X.0Ne4 r4 = (X.C598740Ne4) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.LLILZ = r2
        L16:
            java.lang.Object r2 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L34
            if (r1 != r0) goto L2c
            X.00zU r1 = r4.LL
            goto L78
        L26:
            X.0Ne4 r4 = new X.0Ne4
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
            X.01wk r2 = r5.LIZ     // Catch: java.lang.Exception -> L80
            r0 = 3
            r8 = r24
            com.bytedance.android.livesdk.model.message.DispersionInfo r19 = X.C598410NdX.LIZIZ(r0, r8)     // Catch: java.lang.Exception -> L80
            X.0NSG r5 = new X.0NSG     // Catch: java.lang.Exception -> L80
            if (r26 == 0) goto L4e
            goto L50
        L4e:
            r6 = 0
            goto L51
        L50:
            r6 = 1
        L51:
            r15 = 0
            r21 = r5
            r1 = r7
            r14 = r31
            r9 = r30
            r10 = r27
            r13 = r25
            r12 = r29
            r5.<init>(r6, r7, r8, r9, r10, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L83
            r4.LL = r7     // Catch: java.lang.Exception -> L83
            r0 = 1
            r4.LLILZ = r0     // Catch: java.lang.Exception -> L83
            X.0NdS r16 = X.C598360NdS.LIZ     // Catch: java.lang.Exception -> L83
            r17 = r2
            r18 = r8
            r20 = r15
            r22 = r4
            java.lang.Object r2 = r16.LJIIIIZZ(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Exception -> L83
            if (r2 != r3) goto L7b
            return r3
        L78:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L7e
        L7b:
            X.0X52 r2 = (X.C0X52) r2     // Catch: java.lang.Exception -> L7e
            goto L88
        L7e:
            r0 = move-exception
            goto L84
        L80:
            r0 = move-exception
            r1 = r7
            goto L84
        L83:
            r0 = move-exception
        L84:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2 = 0
        L88:
            T r1 = r1.element
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598730Ne3.LIZJ(java.lang.String, java.lang.String, boolean, long, webcast.data.oec_msg.CommerceInfo, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, boolean r26, java.lang.String r27, java.lang.String r28, X.InterfaceC1364105Vn<? super kotlin.Pair<X.C0X52<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp>>, java.lang.String>> r29) {
        /*
            r21 = this;
            r3 = r29
            boolean r0 = r3 instanceof X.C598750Ne5
            r6 = r21
            if (r0 == 0) goto L26
            r5 = r3
            X.0Ne5 r5 = (X.C598750Ne5) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.LLILZ = r2
        L16:
            java.lang.Object r2 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L2c
            X.00zU r8 = r5.LL
            goto L74
        L26:
            X.0Ne5 r5 = new X.0Ne5
            r5.<init>(r6, r3)
            goto L16
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r2)
            X.00zU r8 = new X.00zU
            r8.<init>()
            java.lang.String r0 = "/aweme/v1/oec/live/product/pop/promotion"
            r8.element = r0
            X.01wk r1 = r6.LIZ     // Catch: java.lang.Exception -> L7c
            r0 = 6
            r9 = r22
            com.bytedance.android.livesdk.model.message.DispersionInfo r17 = X.C598410NdX.LIZIZ(r0, r9)     // Catch: java.lang.Exception -> L7c
            X.0NSB r6 = new X.0NSB     // Catch: java.lang.Exception -> L7c
            if (r26 == 0) goto L4f
            r7 = 1
            goto L50
        L4f:
            r7 = 0
        L50:
            r15 = 0
            r19 = r6
            r14 = r28
            r10 = r27
            r12 = r25
            r13 = r24
            r11 = r23
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L7c
            r5.LL = r8     // Catch: java.lang.Exception -> L7c
            r5.LLILZ = r3     // Catch: java.lang.Exception -> L7c
            X.0NdS r14 = X.C598360NdS.LIZ     // Catch: java.lang.Exception -> L7c
            r16 = r9
            r18 = r15
            r20 = r5
            r15 = r1
            java.lang.Object r2 = r14.LJIIIIZZ(r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Exception -> L7c
            if (r2 != r4) goto L77
            return r4
        L74:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L7a
        L77:
            X.0X52 r2 = (X.C0X52) r2     // Catch: java.lang.Exception -> L7a
            goto L81
        L7a:
            r0 = move-exception
            goto L7d
        L7c:
            r0 = move-exception
        L7d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2 = 0
        L81:
            T r1 = r8.element
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598730Ne3.LJ(java.lang.String, java.lang.String, int, java.lang.String, boolean, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r24, long r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, X.InterfaceC1364105Vn r33, webcast.data.oec_msg.CommerceInfo r34, boolean r35) {
        /*
            r23 = this;
            r3 = r33
            boolean r0 = r3 instanceof X.C598760Ne6
            r5 = r23
            if (r0 == 0) goto L24
            r4 = r3
            X.0Ne6 r4 = (X.C598760Ne6) r4
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
            goto L71
        L24:
            X.0Ne6 r4 = new X.0Ne6
            r4.<init>(r5, r3)
            goto L16
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r0)
            X.01wk r1 = r5.LIZ     // Catch: java.lang.Exception -> L77
            r0 = 3
            r9 = r27
            com.bytedance.android.livesdk.model.message.DispersionInfo r19 = X.C598410NdX.LIZIZ(r0, r9)     // Catch: java.lang.Exception -> L77
            X.0NSF r5 = new X.0NSF     // Catch: java.lang.Exception -> L77
            if (r35 == 0) goto L45
            r17 = 1
            goto L47
        L45:
            r17 = 0
        L47:
            r15 = 0
            r21 = r5
            r14 = r32
            r13 = r31
            r12 = r30
            r10 = r29
            r7 = r25
            r6 = r24
            r16 = r34
            r11 = r28
            r5.<init>(r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L77
            r0 = 1
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L77
            X.0NdS r16 = X.C598360NdS.LIZ     // Catch: java.lang.Exception -> L77
            r17 = r1
            r18 = r9
            r20 = r15
            r22 = r4
            java.lang.Object r0 = r16.LJIIIIZZ(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Exception -> L77
            if (r0 != r3) goto L74
            return r3
        L71:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Exception -> L77
        L74:
            X.0X52 r0 = (X.C0X52) r0     // Catch: java.lang.Exception -> L77
            return r0
        L77:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C598730Ne3.LIZLLL(int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn, webcast.data.oec_msg.CommerceInfo, boolean):java.lang.Object");
    }

    public static void LJI(C598730Ne3 c598730Ne3, AbstractC21198517xX abstractC21198517xX, String str, String str2, CommerceInfo commerceInfo, ReqItem reqItem, String str3, int i, boolean z, String str4, Map map, String str5, String str6, Boolean bool, JSONObject jSONObject, C1563990qnl c1563990qnl, Function1 function1, int i2) {
        UsPopupCardVO usPopupCardVO;
        C1563990qnl c1563990qnl2 = c1563990qnl;
        JSONObject jSONObject2 = jSONObject;
        Boolean bool2 = bool;
        Map linkedHashMap = map;
        String str7 = str5;
        Function1 function12 = function1;
        String str8 = str6;
        String str9 = str2;
        if ((i2 & 4) != 0) {
            str9 = null;
        }
        if ((i2 & 512) != 0) {
            linkedHashMap = new LinkedHashMap();
        }
        if ((i2 & 1024) != 0) {
            str7 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str8 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bool2 = Boolean.TRUE;
        }
        if ((i2 & 8192) != 0) {
            jSONObject2 = null;
        }
        if ((i2 & 16384) != 0) {
            c1563990qnl2 = null;
        }
        if ((i2 & 32768) != 0) {
            function12 = null;
        }
        c598730Ne3.getClass();
        if (!C292450BdD.LIZ()) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJII("new refresh not enable");
        } else {
            if (reqItem == null || (usPopupCardVO = abstractC21198517xX.LL) == null) {
                return;
            }
            AnonymousClass0956 anonymousClass0956 = c598730Ne3.LIZIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c598730Ne3.LIZIZ = C23250099c.LIZLLL(c598730Ne3.LIZ, null, null, new C21193317wh(str, usPopupCardVO, bool2, c1563990qnl2, abstractC21198517xX, reqItem, str7, c598730Ne3, str3, z, commerceInfo, str9, i, str8, jSONObject2, str4, linkedHashMap, function12, null), 3);
        }
    }
}

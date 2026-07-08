package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderFirstPageCacheV1;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderPendingCacheV1;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333640D6c {
    public final C1DEV LIZ = C2191201ApK.LIZ();
    public final LinkedHashSet<String> LIZIZ = new LinkedHashSet<>();

    public static OrderFirstPageCacheV1 LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("orders.list.first_page.v2.");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String string = C0D8X.LJ().getString(strLIZIZ, "");
        if (a0.LJJJIL(string)) {
            return new OrderFirstPageCacheV1(0, System.currentTimeMillis(), 0L, false, C13BV.INSTANCE, 13, null);
        }
        try {
            OrderFirstPageCacheV1 orderFirstPageCacheV1 = (OrderFirstPageCacheV1) C051K.LIZIZ(string, OrderFirstPageCacheV1.class);
            if (orderFirstPageCacheV1 == null) {
                return new OrderFirstPageCacheV1(0, System.currentTimeMillis(), 0L, false, C13BV.INSTANCE, 13, null);
            }
            return orderFirstPageCacheV1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadFirstPage failed: key=");
            sbLIZ2.append(strLIZIZ);
            C0D82.LIZ("OrdersV2Store", C2188811AlT.LIZIZ(sbLIZ2), e);
            return new OrderFirstPageCacheV1(0, System.currentTimeMillis(), 0L, false, C13BV.INSTANCE, 13, null);
        }
    }

    public static OrderPendingCacheV1 LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("orders.list.pending.v2.");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String string = C0D8X.LJ().getString(strLIZIZ, "");
        if (a0.LJJJIL(string)) {
            return new OrderPendingCacheV1(0, System.currentTimeMillis(), C13BV.INSTANCE, 1, null);
        }
        try {
            OrderPendingCacheV1 orderPendingCacheV1 = (OrderPendingCacheV1) C051K.LIZIZ(string, OrderPendingCacheV1.class);
            if (orderPendingCacheV1 == null) {
                return new OrderPendingCacheV1(0, System.currentTimeMillis(), C13BV.INSTANCE, 1, null);
            }
            return orderPendingCacheV1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("readList failed: key=");
            sbLIZ2.append(strLIZIZ);
            C0D82.LIZ("OrdersV2Store", C2188811AlT.LIZIZ(sbLIZ2), e);
            return new OrderPendingCacheV1(0, System.currentTimeMillis(), C13BV.INSTANCE, 1, null);
        }
    }

    public static void LIZLLL(Object obj, String str) {
        try {
            C0D8X.LJ().putString(str, C051K.LIZLLL(false, false, false, obj));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("persist failed: key=");
            sbLIZ.append(str);
            C0D82.LIZ("OrdersV2Store", C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static boolean LJFF(LocalOrderWrapper localOrderWrapper, long j) {
        CheckoutSession resolvedCheckoutSession;
        C0D6J checkoutState;
        if (!Intrinsics.LJFF(localOrderWrapper.state, C0D6M.INSTANCE) && ((resolvedCheckoutSession = localOrderWrapper.getResolvedCheckoutSession()) == null || (checkoutState = resolvedCheckoutSession.getCheckoutState()) == null || checkoutState == C0D6J.COMPLETED)) {
            return false;
        }
        long createAtTime = localOrderWrapper.getCreateAtTime();
        if (createAtTime > 0 && j - createAtTime >= ((C1276404z4) C333620D6a.LIZIZ.getValue()).LIZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r22, X.InterfaceC1364105Vn<? super X.C0D6Z> r23) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333640D6c.LJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r8, java.lang.String r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C333680D6g
            if (r0 == 0) goto L2c
            r6 = r10
            X.0D6g r6 = (X.C333680D6g) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r5 = r6.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r6.LLILZLL
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L3a
            if (r1 != r0) goto L32
            X.1DEV r3 = r6.LLILLL
            java.lang.Object r9 = r6.LLILLJJLI
            java.lang.Object r8 = r6.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r5)
            goto L4e
        L2c:
            X.0D6g r6 = new X.0D6g
            r6.<init>(r7, r10)
            goto L12
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            X.C155000ia.LIZIZ(r5)
            X.1DEV r3 = r7.LIZ
            r6.LL = r8
            r6.LLILLJJLI = r9
            r6.LLILLL = r3
            r6.LLILZLL = r0
            java.lang.Object r0 = r3.LIZLLL(r4, r6)
            if (r0 != r2) goto L4e
            return r2
        L4e:
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderPendingCacheV1 r0 = LIZJ(r8)     // Catch: java.lang.Throwable -> L9f
            java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper> r0 = r0.items     // Catch: java.lang.Throwable -> L9f
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L9f
        L58:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L99
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L9f
            r0 = r1
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper r0 = (com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper) r0     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r0.getOrderId()     // Catch: java.lang.Throwable -> L9f
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L58
        L6f:
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper r1 = (com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper) r1     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L9b
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderFirstPageCacheV1 r0 = LIZIZ(r8)     // Catch: java.lang.Throwable -> L9f
            java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper> r0 = r0.items     // Catch: java.lang.Throwable -> L9f
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L9f
        L7d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L97
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L9f
            r0 = r1
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper r0 = (com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper) r0     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r0.getOrderId()     // Catch: java.lang.Throwable -> L9f
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r9)     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L7d
        L94:
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper r1 = (com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper) r1     // Catch: java.lang.Throwable -> L9f
            goto L9b
        L97:
            r1 = r4
            goto L94
        L99:
            r1 = r4
            goto L6f
        L9b:
            r3.LIZIZ(r4)
            return r1
        L9f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9f
            r3.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333640D6c.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r8, kotlin.jvm.functions.Function1<? super java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper>, kotlin.Unit> r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderPendingCacheV1> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C333690D6h
            if (r0 == 0) goto L2c
            r6 = r10
            X.0D6h r6 = (X.C333690D6h) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r3 = r6.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r6.LLILZLL
            r5 = 0
            r0 = 1
            if (r1 == 0) goto L3a
            if (r1 != r0) goto L32
            X.1DEV r4 = r6.LLILLL
            kotlin.jvm.functions.Function1 r9 = r6.LLILLJJLI
            java.lang.Object r8 = r6.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r3)
            goto L4e
        L2c:
            X.0D6h r6 = new X.0D6h
            r6.<init>(r7, r10)
            goto L12
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            X.C155000ia.LIZIZ(r3)
            X.1DEV r4 = r7.LIZ
            r6.LL = r8
            r6.LLILLJJLI = r9
            r6.LLILLL = r4
            r6.LLILZLL = r0
            java.lang.Object r0 = r4.LIZLLL(r5, r6)
            if (r0 != r2) goto L4e
            return r2
        L4e:
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderPendingCacheV1 r6 = LIZJ(r8)     // Catch: java.lang.Throwable -> L83
            java.util.List<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper> r0 = r6.items     // Catch: java.lang.Throwable -> L83
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L83
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L83
            r9.invoke(r1)     // Catch: java.lang.Throwable -> L83
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L83
            r0 = 20
            java.util.List r1 = X.C13LP.LL(r1, r0)     // Catch: java.lang.Throwable -> L83
            int r0 = r6.version     // Catch: java.lang.Throwable -> L83
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderPendingCacheV1 r2 = r6.copy(r0, r2, r1)     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = "orders.list.pending.v2."
            r1.append(r0)     // Catch: java.lang.Throwable -> L83
            r1.append(r8)     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L83
            LIZLLL(r2, r0)     // Catch: java.lang.Throwable -> L83
            r4.LIZIZ(r5)
            return r2
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L83
            r4.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333640D6c.LJI(java.lang.String, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r20, long r21, boolean r23, kotlin.jvm.internal.AwS440S0200000_4 r24, X.InterfaceC1364105Vn r25) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333640D6c.LJII(java.lang.String, long, boolean, kotlin.jvm.internal.AwS440S0200000_4, X.05Vn):java.lang.Object");
    }
}

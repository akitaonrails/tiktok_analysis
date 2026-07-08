package X;

import Y.AComparatorS23S0000000_4;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutOrder;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.ShopOrderDisplayModelV2;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.ShopOrderItemModelV2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D6E, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D6E {
    public final C333640D6c LIZ;
    public final C0D6F LIZIZ;

    public C0D6E() {
        C333640D6c c333640D6c = new C333640D6c();
        C0D6F c0d6f = new C0D6F();
        this.LIZ = c333640D6c;
        this.LIZIZ = c0d6f;
    }

    public static int LIZIZ(C0D6J c0d6j) {
        int i = C0D6I.LIZ[c0d6j.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            throw new C1954807lC();
        }
        return 0;
    }

    public static int LIZJ(LocalOrderWrapper localOrderWrapper) {
        int i;
        CheckoutOrder checkoutOrder;
        String str;
        String str2;
        ShopOrderDisplayModelV2 shopOrderDisplayModelV2 = localOrderWrapper.order;
        String displayTitle = shopOrderDisplayModelV2.getDisplayTitle();
        if (displayTitle != null && !a0.LJJJIL(displayTitle)) {
            i = 0;
        } else {
            i = 1;
        }
        int i2 = i ^ 1;
        String displayMessage = shopOrderDisplayModelV2.getDisplayMessage();
        if (displayMessage != null && !a0.LJJJIL(displayMessage)) {
            i2++;
        }
        List<ShopOrderItemModelV2> orderItems = shopOrderDisplayModelV2.getOrderItems();
        if (orderItems == null) {
            orderItems = C13BV.INSTANCE;
        }
        if (!orderItems.isEmpty()) {
            i2 += 2;
        }
        CheckoutSession checkoutSession = localOrderWrapper.checkoutSession;
        if (checkoutSession != null && (str2 = checkoutSession.id) != null && !a0.LJJJIL(str2)) {
            i2++;
        }
        CheckoutSession checkoutSession2 = localOrderWrapper.checkoutSession;
        if (checkoutSession2 != null && (checkoutOrder = checkoutSession2.order) != null && (str = checkoutOrder.id) != null && !a0.LJJJIL(str)) {
            i2++;
        }
        String checkoutCreateOriginDataRaw = shopOrderDisplayModelV2.getCheckoutCreateOriginDataRaw();
        if (checkoutCreateOriginDataRaw != null && !a0.LJJJIL(checkoutCreateOriginDataRaw)) {
            i2 += 2;
        }
        String externalCheckoutId = shopOrderDisplayModelV2.getExternalCheckoutId();
        if (externalCheckoutId != null && !a0.LJJJIL(externalCheckoutId)) {
            i2++;
        }
        String outerOrderId = shopOrderDisplayModelV2.getOuterOrderId();
        if (outerOrderId != null && !a0.LJJJIL(outerOrderId)) {
            i2++;
        }
        if (localOrderWrapper.getResolvedTiktokOrderId() != null) {
            i2++;
        }
        String tiktokShopId = shopOrderDisplayModelV2.getTiktokShopId();
        if (tiktokShopId != null && !a0.LJJJIL(tiktokShopId)) {
            i2++;
        }
        String permalinkUrl = localOrderWrapper.getPermalinkUrl();
        if (permalinkUrl != null && !a0.LJJJIL(permalinkUrl)) {
            i2++;
        }
        String creativeID = localOrderWrapper.getCreativeID();
        if (creativeID != null && !a0.LJJJIL(creativeID)) {
            i2++;
        }
        String adLogExtra = localOrderWrapper.getAdLogExtra();
        if (adLogExtra != null && !a0.LJJJIL(adLogExtra)) {
            return i2 + 1;
        }
        return i2;
    }

    public static C0D6J LIZLLL(LocalOrderWrapper localOrderWrapper) {
        C0D6J checkoutState;
        CheckoutSession resolvedCheckoutSession = localOrderWrapper.getResolvedCheckoutSession();
        if (resolvedCheckoutSession != null) {
            checkoutState = resolvedCheckoutSession.getCheckoutState();
        } else {
            checkoutState = null;
        }
        C0D6K c0d6k = C0D6J.Companion;
        int status = localOrderWrapper.order.getStatus();
        c0d6k.getClass();
        C0D6J c0d6jLIZ = C0D6K.LIZ(status);
        if (checkoutState != null) {
            if (c0d6jLIZ == null || LIZIZ(c0d6jLIZ) <= LIZIZ(checkoutState)) {
                return checkoutState;
            }
        } else if (c0d6jLIZ == null) {
            return C0D6J.NORMAL;
        }
        return c0d6jLIZ;
    }

    public static long LJ(LocalOrderWrapper localOrderWrapper) {
        Long l;
        ShopOrderDisplayModelV2 shopOrderDisplayModelV2 = localOrderWrapper.order;
        if (Intrinsics.LJFF(localOrderWrapper.state, C0D6N.INSTANCE)) {
            Long lValueOf = Long.valueOf(shopOrderDisplayModelV2.getUpdatedTime());
            if (lValueOf.longValue() <= 0) {
                lValueOf = Long.valueOf(shopOrderDisplayModelV2.getExternalOrderCheckoutTime());
                if (lValueOf.longValue() <= 0) {
                    Long lValueOf2 = Long.valueOf(shopOrderDisplayModelV2.getCreatedTime());
                    if (lValueOf2.longValue() > 0) {
                        return lValueOf2.longValue();
                    }
                    return localOrderWrapper.getCreateAtTime();
                }
            }
            return lValueOf.longValue();
        }
        CheckoutSession checkoutSession = localOrderWrapper.checkoutSession;
        if (checkoutSession != null && (l = checkoutSession.lastCreatAtTime) != null && l.longValue() > 0) {
            return l.longValue();
        }
        return localOrderWrapper.getCreateAtTime();
    }

    public static LocalOrderWrapper LJI(LocalOrderWrapper localOrderWrapper) {
        LocalOrderWrapper localOrderWrapperCopy = localOrderWrapper.copy(localOrderWrapper.order, localOrderWrapper.internalTiktokOrderId, localOrderWrapper.checkoutSession, localOrderWrapper.checkoutIntent, localOrderWrapper.entryContext, C0D6N.INSTANCE, localOrderWrapper.pendingRetryCount, localOrderWrapper.lastRetryAt);
        CheckoutSession resolvedCheckoutSession = localOrderWrapperCopy.getResolvedCheckoutSession();
        C0D6K c0d6k = C0D6J.Companion;
        int status = localOrderWrapperCopy.order.getStatus();
        c0d6k.getClass();
        C0D6J c0d6jLIZ = C0D6K.LIZ(status);
        if (resolvedCheckoutSession != null && c0d6jLIZ != null && LIZIZ(c0d6jLIZ) >= LIZIZ(resolvedCheckoutSession.getCheckoutState())) {
            return localOrderWrapperCopy.copy(localOrderWrapperCopy.order, localOrderWrapperCopy.internalTiktokOrderId, resolvedCheckoutSession.copy(resolvedCheckoutSession.ucp, resolvedCheckoutSession.id, resolvedCheckoutSession.currency, resolvedCheckoutSession.buyer, resolvedCheckoutSession.lineItems, resolvedCheckoutSession.discounts, resolvedCheckoutSession.totals, resolvedCheckoutSession.fulfillment, resolvedCheckoutSession.expiresAt, resolvedCheckoutSession.links, resolvedCheckoutSession.payment, resolvedCheckoutSession.order, resolvedCheckoutSession.messages, resolvedCheckoutSession.status, resolvedCheckoutSession.continueUrl, c0d6jLIZ.getRawValue(), resolvedCheckoutSession.lastCreatAtTime), localOrderWrapperCopy.checkoutIntent, localOrderWrapperCopy.entryContext, localOrderWrapperCopy.state, localOrderWrapperCopy.pendingRetryCount, localOrderWrapperCopy.lastRetryAt);
        }
        return localOrderWrapperCopy;
    }

    public static boolean LJFF(LocalOrderWrapper localOrderWrapper, LocalOrderWrapper localOrderWrapper2) {
        int iLIZJ = LIZJ(localOrderWrapper);
        int iLIZJ2 = LIZJ(localOrderWrapper2);
        if (iLIZJ2 != iLIZJ) {
            if (iLIZJ2 > iLIZJ) {
                return true;
            }
            return false;
        }
        long jLJ = LJ(localOrderWrapper);
        long jLJ2 = LJ(localOrderWrapper2);
        if (jLJ2 != jLJ) {
            if (jLJ2 > jLJ) {
                return true;
            }
            return false;
        }
        long createAtTime = localOrderWrapper.getCreateAtTime();
        long createAtTime2 = localOrderWrapper2.getCreateAtTime();
        if (createAtTime2 != createAtTime && createAtTime2 > createAtTime) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIIZZ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper r5, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper r6) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D6E.LJIIIIZZ(com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper):boolean");
    }

    public static OrderSnapshotV2 LJII(OrderSnapshotV2 orderSnapshotV2, List list, long j, boolean z) {
        C13BV c13bv = C13BV.INSTANCE;
        List<LocalOrderWrapper> list2 = orderSnapshotV2.items;
        if (list2 == null) {
            list2 = c13bv;
        }
        return LIZ(z, j, c13bv, list2, list);
    }

    public static OrderSnapshotV2 LIZ(boolean z, long j, List list, List list2, List list3) {
        List listLJJJJLI = C13LP.LJJJJLI(list);
        List listLJJJJLI2 = C13LP.LJJJJLI(list2);
        List listLJJJJLI3 = C13LP.LJJJJLI(list3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (LocalOrderWrapper localOrderWrapper : (ArrayList) listLJJJJLI) {
            linkedHashMap.put(localOrderWrapper.getStableDisplayId(), localOrderWrapper);
        }
        for (LocalOrderWrapper localOrderWrapper2 : (ArrayList) listLJJJJLI2) {
            String stableDisplayId = localOrderWrapper2.getStableDisplayId();
            LocalOrderWrapper localOrderWrapper3 = (LocalOrderWrapper) linkedHashMap.get(stableDisplayId);
            if (localOrderWrapper3 == null) {
                linkedHashMap.put(stableDisplayId, localOrderWrapper2);
            } else if (LJIIIIZZ(localOrderWrapper3, localOrderWrapper2)) {
                linkedHashMap.put(stableDisplayId, localOrderWrapper2);
            }
        }
        for (LocalOrderWrapper localOrderWrapper4 : (ArrayList) listLJJJJLI3) {
            String stableDisplayId2 = localOrderWrapper4.getStableDisplayId();
            LocalOrderWrapper localOrderWrapper5 = (LocalOrderWrapper) linkedHashMap.get(stableDisplayId2);
            if (localOrderWrapper5 == null) {
                linkedHashMap.put(stableDisplayId2, localOrderWrapper4);
            } else if (LJIIIIZZ(localOrderWrapper5, localOrderWrapper4)) {
                linkedHashMap.put(stableDisplayId2, localOrderWrapper4);
            }
        }
        return new OrderSnapshotV2(C13LP.LJLLLL(new AComparatorS23S0000000_4(13), linkedHashMap.values()), Long.valueOf(j), Boolean.valueOf(z));
    }
}

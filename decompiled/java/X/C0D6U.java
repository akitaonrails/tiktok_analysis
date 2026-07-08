package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutLineItem;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutOrder;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.ShopOrderItemModelV2;
import java.util.List;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D6U, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D6U extends AbstractC333850D6x {
    public final LocalOrderWrapper LIZ;
    public final C0D6V LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D6U)) {
            return false;
        }
        C0D6U c0d6u = (C0D6U) obj;
        return Intrinsics.LJFF(this.LIZ, c0d6u.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d6u.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderCard(wrapper=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", viewState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC333850D6x
    public final int LIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC333850D6x
    public final String LIZIZ() {
        return this.LIZJ;
    }

    public C0D6U(LocalOrderWrapper localOrderWrapper, C0D6V c0d6v) {
        String strLJJLIIIJ;
        int rawValue;
        long jLongValue;
        Long l;
        CheckoutOrder checkoutOrder;
        String str;
        String str2;
        C0D6J checkoutState;
        List<CheckoutLineItem> list;
        this.LIZ = localOrderWrapper;
        this.LIZIZ = c0d6v;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("order_item:");
        sbLIZ.append(localOrderWrapper.getStableDisplayId());
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        List<ShopOrderItemModelV2> orderItems = localOrderWrapper.order.getOrderItems();
        if (orderItems != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(orderItems, ",", null, null, 0, null, AFwS232S0000000_4.get$arr$(191), 30);
        } else {
            strLJJLIIIJ = null;
        }
        strLJJLIIIJ = strLJJLIIIJ == null ? "" : strLJJLIIIJ;
        CheckoutSession checkoutSession = localOrderWrapper.checkoutSession;
        String strLJJLIIIJ2 = (checkoutSession == null || (list = checkoutSession.lineItems) == null || (strLJJLIIIJ2 = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS232S0000000_4.get$arr$(190), 30)) == null) ? "" : strLJJLIIIJ2;
        CheckoutSession checkoutSession2 = localOrderWrapper.checkoutSession;
        if (checkoutSession2 != null && (checkoutState = checkoutSession2.getCheckoutState()) != null) {
            rawValue = checkoutState.getRawValue();
        } else {
            rawValue = Integer.MIN_VALUE;
        }
        String[] strArr = new String[13];
        strArr[0] = localOrderWrapper.state.toString();
        strArr[1] = String.valueOf(localOrderWrapper.getCreateAtTime());
        String displayTitle = localOrderWrapper.order.getDisplayTitle();
        strArr[2] = displayTitle == null ? "" : displayTitle;
        String displayMessage = localOrderWrapper.order.getDisplayMessage();
        strArr[3] = displayMessage == null ? "" : displayMessage;
        String orderId = localOrderWrapper.getOrderId();
        strArr[4] = orderId == null ? "" : orderId;
        CheckoutSession checkoutSession3 = localOrderWrapper.checkoutSession;
        strArr[5] = (checkoutSession3 == null || (str2 = checkoutSession3.id) == null) ? "" : str2;
        strArr[6] = (checkoutSession3 == null || (checkoutOrder = checkoutSession3.order) == null || (str = checkoutOrder.id) == null) ? "" : str;
        String feedbackLink = localOrderWrapper.getFeedbackLink();
        strArr[7] = feedbackLink != null ? feedbackLink : "";
        strArr[8] = String.valueOf(rawValue);
        CheckoutSession checkoutSession4 = localOrderWrapper.checkoutSession;
        if (checkoutSession4 != null && (l = checkoutSession4.lastCreatAtTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        strArr[9] = String.valueOf(jLongValue);
        strArr[10] = strLJJLIIIJ;
        strArr[11] = strLJJLIIIJ2;
        strArr[12] = c0d6v.LIZJ;
        this.LIZLLL = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strArr), "|", null, null, 0, null, null, 62).hashCode();
    }
}

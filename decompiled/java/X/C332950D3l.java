package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutLineItemContext;
import java.util.List;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0D3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332950D3l {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:100:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent LIZ(android.content.Context r23, X.C0D3K r24, X.C332730D2p r25, int r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C332950D3l.LIZ(android.content.Context, X.0D3K, X.0D2p, int, java.lang.String):com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent");
    }

    public static void LIZIZ(Context context, C0D3K c0d3k, C332730D2p c332730D2p, int i, String str, AwS583S0100000_4 awS583S0100000_4) {
        CheckoutIntent checkoutIntentLIZ = LIZ(context, c0d3k, c332730D2p, i, str);
        List<CheckoutLineItemContext> list = checkoutIntentLIZ.items;
        if (list != null) {
            C13LP.LJJJLL(list);
        }
        C333050D3v c333050D3v = new C333050D3v();
        C332710D2n c332710D2n = c332730D2p.entryContext;
        C0D5I c0d5i = new C0D5I(new C0D5E(context, checkoutIntentLIZ, c332710D2n.copy(c332710D2n.entryCheckoutType, c332710D2n.paymentType, c332710D2n.viewSiteType, c332710D2n.viewSiteUrl)), awS583S0100000_4, c333050D3v.LIZ);
        c0d5i.LIZIZ(new AwS548S0100000_4(c0d5i, 541));
    }
}

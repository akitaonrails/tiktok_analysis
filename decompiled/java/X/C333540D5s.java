package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0D5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333540D5s {
    public static final CheckoutStoredUserAddress LIZIZ = new CheckoutStoredUserAddress("7631755384156636123", "OK", "TikToker", "1199 HERVEY SUNSIDE RD", "AA", "Cornwallville", "NY", "12418", "US", "+1", "6505550134", "testuser@bytedance.com", Boolean.TRUE, null, 0L);
    public final Function0<IECommerceAddressService> LIZ = AFwS190S0000000_4.get$arr$(210);

    public C333540D5s(Object obj) {
    }

    public static String LIZLLL(Object obj) {
        Object c098200Yq;
        try {
            c098200Yq = C051K.LIZLLL(true, false, true, obj);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("<json_encode_failed:");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            sbLIZ.append('>');
            c098200Yq = C2188811AlT.LIZIZ(sbLIZ);
        }
        return (String) c098200Yq;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super X.C189200o6<com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C333550D5t
            if (r0 == 0) goto L22
            r4 = r6
            X.0D5t r4 = (X.C333550D5t) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            X.0D5s r2 = r4.LL
            goto L5a
        L22:
            X.0D5t r4 = new X.0D5t
            r4.<init>(r5, r6)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            kotlin.jvm.functions.Function0<com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService> r0 = r5.LIZ
            java.lang.Object r0 = r0.invoke()
            com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService r0 = (com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService) r0
            if (r0 != 0) goto L4d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "IECommerceAddressService is not available."
            r1.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        L4d:
            r4.LL = r5     // Catch: java.lang.Throwable -> La2
            r4.LLILZ = r1     // Catch: java.lang.Throwable -> La2
            java.lang.Object r3 = r0.LIZIZ(r4)     // Catch: java.lang.Throwable -> La2
            if (r3 != r2) goto L58
            return r2
        L58:
            r2 = r5
            goto L5d
        L5a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> La2
        L5d:
            com.ss.android.ugc.aweme.ecommerce.service.HostAddressSnapshot r3 = (com.ss.android.ugc.aweme.ecommerce.service.HostAddressSnapshot) r3     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "getCurrentEffectiveAddress.raw="
            r1.append(r0)     // Catch: java.lang.Throwable -> La2
            r2.getClass()     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = LIZLLL(r3)     // Catch: java.lang.Throwable -> La2
            r1.append(r0)     // Catch: java.lang.Throwable -> La2
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> La2
            X.0D0r r0 = X.InterfaceC332180D0m.LIZ     // Catch: java.lang.Throwable -> La2
            r0.getClass()     // Catch: java.lang.Throwable -> La2
            X.0D0m r2 = X.C332230D0r.LIZ()     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = "ucp_demo.checkout_payment_use_row"
            java.lang.String r0 = "false"
            java.lang.String r1 = r2.getString(r1, r0)     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = "true"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L9c
            com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress r0 = X.C334940DBc.LIZ(r3)     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L98
            com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress r0 = X.C333540D5s.LIZIZ     // Catch: java.lang.Throwable -> La2
        L98:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> La2
            goto La1
        L9c:
            com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress r0 = X.C334940DBc.LIZ(r3)     // Catch: java.lang.Throwable -> La2
            goto L98
        La1:
            return r0
        La2:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C333540D5s.LIZ(X.05Vn):java.lang.Object");
    }

    public final boolean LIZIZ(Context context, InterfaceC980203sO interfaceC980203sO) {
        IECommerceAddressService iECommerceAddressServiceInvoke = this.LIZ.invoke();
        if (iECommerceAddressServiceInvoke == null) {
            return false;
        }
        return iECommerceAddressServiceInvoke.LIZLLL(context, new C980103sN("openAddressEditor", this, interfaceC980203sO));
    }

    public final boolean LIZJ(Context context, String str, InterfaceC980203sO interfaceC980203sO) {
        String str2;
        IECommerceAddressService iECommerceAddressServiceInvoke = this.LIZ.invoke();
        if (iECommerceAddressServiceInvoke == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("route.openShippingAddressPicker.openAddressManager selectedAddressId=");
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        return iECommerceAddressServiceInvoke.LIZJ(context, str, new C980103sN("openAddressManager", this, interfaceC980203sO));
    }
}

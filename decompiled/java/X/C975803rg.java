package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOnOrderStruct;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS36S0301000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03rg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C975803rg {
    public static boolean LIZIZ(InterfaceC975703rf interfaceC975703rf, Response<ChangeOrderShippingAddressResponseData> response) {
        String str;
        ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData = response.data;
        if (response.isCodeOK() && changeOrderShippingAddressResponseData != null) {
            Integer num = changeOrderShippingAddressResponseData.resultCode;
            if (num != null && num.intValue() == 0) {
                List<Error> list = changeOrderShippingAddressResponseData.errors;
                if (list != null && !list.isEmpty()) {
                    Error error = (Error) C13LP.LJJJLL(changeOrderShippingAddressResponseData.errors);
                    if (error != null) {
                        str = error.error;
                    } else {
                        str = null;
                    }
                    LJ(interfaceC975703rf, str);
                    LIZLLL(changeOrderShippingAddressResponseData.resultCode, str);
                    return false;
                }
                LIZLLL(changeOrderShippingAddressResponseData.resultCode, changeOrderShippingAddressResponseData.toastMessage);
                return true;
            }
            LJ(interfaceC975703rf, changeOrderShippingAddressResponseData.toastMessage);
            LIZLLL(changeOrderShippingAddressResponseData.resultCode, changeOrderShippingAddressResponseData.toastMessage);
            return false;
        }
        LJ(interfaceC975703rf, response.message);
        LIZLLL(Integer.valueOf(response.code), response.message);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZJ(X.C975903rh r5, X.InterfaceC1364105Vn r6) {
        /*
            boolean r0 = r6 instanceof X.C976603ro
            if (r0 == 0) goto L2f
            r4 = r6
            X.03ro r4 = (X.C976603ro) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLJJLI
            r0 = 1
            if (r1 == 0) goto L23
            if (r1 != r0) goto L35
            X.C155000ia.LIZIZ(r3)
        L22:
            return r3
        L23:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLJJLI = r0
            java.lang.Object r3 = r5.invoke(r4)
            if (r3 != r2) goto L22
            return r2
        L2f:
            X.03ro r4 = new X.03ro
            r4.<init>(r6)
            goto L12
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975803rg.LIZJ(X.03rh, X.05Vn):java.lang.Object");
    }

    public static void LIZLLL(Integer num, String str) {
        AnonymousClass0378.LIZ().LIZ("ec_change_address_on_order", C1741890vQh.LJIIIIZZ(new ChangeOnOrderStruct(num, str)));
    }

    public static void LJ(InterfaceC975703rf interfaceC975703rf, String str) {
        if (str != null && str.length() != 0) {
            interfaceC975703rf.LJJJZ(new AwS52S1000000_1(str, 2));
        }
    }

    public static void LJFF(InterfaceC975703rf interfaceC975703rf, AddressListData addressListData) {
        boolean z;
        int iIntValue;
        int i;
        int i2;
        String str;
        List<ReachableAddress> list = addressListData.addressList;
        int i3 = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            interfaceC975703rf.SB1(4);
        } else {
            interfaceC975703rf.SB1(-1);
        }
        Integer num = addressListData.addressThreshold;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 20;
        }
        interfaceC975703rf.Tc0(iIntValue);
        interfaceC975703rf.ft().clear();
        List<ReachableAddress> list2 = addressListData.addressList;
        if (list2 != null) {
            interfaceC975703rf.ft().addAll(list2);
        }
        int size = interfaceC975703rf.ft().size();
        C118300cf c118300cf = new C118300cf();
        List<ReachableAddress> listFt = interfaceC975703rf.ft();
        if ((listFt instanceof Collection) && listFt.isEmpty()) {
            i = 0;
        } else {
            Iterator<ReachableAddress> it2 = listFt.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().reachable, Boolean.FALSE) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        c118300cf.element = size - i;
        if (interfaceC975703rf.xW() && c118300cf.element == 0) {
            List<ReachableAddress> listFt2 = interfaceC975703rf.ft();
            if ((listFt2 instanceof Collection) && listFt2.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (ReachableAddress reachableAddress : listFt2) {
                    C973303rH.LL.getClass();
                    ArrayList<String> arrayList = C973303rH.LLILZ;
                    Address address = reachableAddress.address;
                    if (address != null) {
                        str = address.id;
                    } else {
                        str = null;
                    }
                    if (C13LP.LJJJJ(str, arrayList) && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            c118300cf.element += interfaceC975703rf.ft().size() - i2;
        }
        Integer numIV1 = interfaceC975703rf.iV1();
        if (numIV1 != null && numIV1.intValue() == 4) {
            List<ReachableAddress> listFt3 = interfaceC975703rf.ft();
            if (!(listFt3 instanceof Collection) || !listFt3.isEmpty()) {
                Iterator<ReachableAddress> it3 = listFt3.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(it3.next().availableForChange, Boolean.FALSE) && (i3 = i3 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            c118300cf.element -= i3;
        }
        interfaceC975703rf.jp1(addressListData);
        interfaceC975703rf.LJJJZ(new AwS36S0301000_1(interfaceC975703rf, addressListData, size, c118300cf, 1));
    }
}

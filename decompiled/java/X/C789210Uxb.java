package X;

import java.util.Comparator;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789210Uxb implements Comparator<InterfaceC1370310llN> {
    public static final C01GW<HashMap<String, Integer>> LL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(596));

    @Override // java.util.Comparator
    public final int compare(InterfaceC1370310llN interfaceC1370310llN, InterfaceC1370310llN interfaceC1370310llN2) {
        int iIntValue;
        int iIntValue2;
        InterfaceC1370310llN interfaceC1370310llN3 = interfaceC1370310llN;
        InterfaceC1370310llN interfaceC1370310llN4 = interfaceC1370310llN2;
        if (interfaceC1370310llN3 == interfaceC1370310llN4) {
            return 0;
        }
        if (interfaceC1370310llN3 == null) {
            return 1;
        }
        if (interfaceC1370310llN4 == null) {
            return -1;
        }
        String strKey = interfaceC1370310llN3.key();
        C01GW<HashMap<String, Integer>> c01gw = LL;
        Integer num = c01gw.getValue().get(strKey);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer num2 = c01gw.getValue().get(interfaceC1370310llN4.key());
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = Integer.MAX_VALUE;
        }
        if ((iIntValue == Integer.MAX_VALUE && iIntValue2 == Integer.MAX_VALUE) || iIntValue == iIntValue2) {
            return 0;
        }
        return Intrinsics.LJI(iIntValue, iIntValue2);
    }
}

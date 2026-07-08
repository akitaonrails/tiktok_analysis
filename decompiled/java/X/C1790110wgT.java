package X;

import com.bytedance.iap.service.mp.model.OrderStateResponse;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790110wgT {
    public static final C1787940wcy LIZ(OrderStateResponse orderStateResponse) {
        String str;
        EnumC1790230wgf next;
        EnumC1779760wPm enumC1779760wPm;
        String str2;
        C1790220wge c1790220wge = EnumC1790230wgf.Companion;
        OrderStateResponse.Data data = orderStateResponse.data;
        if (data != null) {
            str = data.status;
        } else {
            str = null;
        }
        c1790220wge.getClass();
        Iterator<EnumC1790230wgf> it2 = EnumC1790230wgf.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getValue(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC1790230wgf enumC1790230wgf = next;
        if (enumC1790230wgf == null) {
            enumC1790230wgf = EnumC1790230wgf.UNKNOWN;
        }
        switch (C1790240wgg.LIZ[enumC1790230wgf.ordinal()]) {
            case 1:
                enumC1779760wPm = EnumC1779760wPm.SUCCESS;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                enumC1779760wPm = EnumC1779760wPm.FAIL;
                break;
            default:
                enumC1779760wPm = EnumC1779760wPm.PENDING;
                break;
        }
        OrderStateResponse.Data data2 = orderStateResponse.data;
        if (data2 == null || (str2 = data2.status) == null) {
            str2 = "";
        }
        return new C1787940wcy(enumC1779760wPm, str2);
    }
}

package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03rA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C972603rA {
    public static void LIZ(InterfaceC972703rB interfaceC972703rB, boolean z, View view, Address address, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq) {
        List<ShippingAddressRichInfo> list = address.richInfoList;
        ShippingAddressRichInfo shippingAddressRichInfo = null;
        if (list != null) {
            Iterator<ShippingAddressRichInfo> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ShippingAddressRichInfo next = it2.next();
                Integer num = next.showType;
                if (num != null && num.intValue() == 0) {
                    shippingAddressRichInfo = next;
                    break;
                }
            }
            ShippingAddressRichInfo shippingAddressRichInfo2 = shippingAddressRichInfo;
            if (shippingAddressRichInfo2 != null) {
                interfaceC972703rB.X3(z, view, shippingAddressRichInfo2, interfaceC1631620sYq);
                return;
            }
        }
        interfaceC972703rB.LLLLLLLLL(z, view, address);
    }
}

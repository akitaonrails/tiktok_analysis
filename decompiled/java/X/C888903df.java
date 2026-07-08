package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C888903df implements InterfaceC892703eH, InterfaceC894303eX {
    public final PaymentMethod LL;
    public final Map<String, ElementDTO> LLILLJJLI;
    public String LLILLL;
    public final Object LLILZ;
    public C21588719eH LLILZIL = new C21588719eH(C679280Qkg.LIZ(16), 0, 0, 0, false, 0, true, 254);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C888903df)) {
            return false;
        }
        C888903df c888903df = (C888903df) obj;
        return Intrinsics.LJFF(this.LL, c888903df.LL) && Intrinsics.LJFF(this.LLILLJJLI, c888903df.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c888903df.LLILLL) && Intrinsics.LJFF(this.LLILZ, c888903df.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USRegionInputElementItemV2(ccdcPaymentMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", addressElementDTOMap=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", update=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC892703eH
    public final List<String> getIds() {
        Map<String, ElementDTO> map = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, ElementDTO>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getValue().id);
        }
        return arrayList;
    }

    @Override // X.InterfaceC894303eX
    public final void LIZIZ(C21588719eH c21588719eH) {
        this.LLILZIL = c21588719eH;
    }

    @Override // X.InterfaceC892703eH
    public final void LJJJJJL(Object obj) {
        String str;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        this.LLILLL = str;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public static C888903df LIZ(C888903df c888903df, Object obj, int i) {
        PaymentMethod paymentMethod;
        Map<String, ElementDTO> map;
        String str = null;
        if ((i & 1) != 0) {
            paymentMethod = c888903df.LL;
        } else {
            paymentMethod = null;
        }
        if ((i & 2) != 0) {
            map = c888903df.LLILLJJLI;
        } else {
            map = null;
        }
        if ((i & 4) != 0) {
            str = c888903df.LLILLL;
        }
        if ((i & 8) != 0) {
            obj = c888903df.LLILZ;
        }
        c888903df.getClass();
        return new C888903df(paymentMethod, map, str, obj);
    }

    public C888903df(PaymentMethod paymentMethod, Map<String, ElementDTO> map, String str, Object obj) {
        this.LL = paymentMethod;
        this.LLILLJJLI = map;
        this.LLILLL = str;
        this.LLILZ = obj;
    }
}

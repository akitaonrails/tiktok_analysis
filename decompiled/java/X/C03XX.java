package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03XX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03XX extends C09AY implements InterfaceC1631630sYr<Boolean, List<? extends PaymentElement>, String, Boolean, Unit> {
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, List<PaymentElement>, String, Unit> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ PaymentMethod LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03XX(long j, PaymentMethod paymentMethod, InterfaceC1631620sYq interfaceC1631620sYq) {
        super(4);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = j;
        this.LLILLL = paymentMethod;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Boolean bool, List<? extends PaymentElement> list, String str, Boolean bool2) {
        String str2;
        boolean zBooleanValue = bool.booleanValue();
        String str3 = str;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestVenmoElementsAndRiskInfo callback result: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(' ');
        sbLIZ.append(list);
        sbLIZ.append(' ');
        sbLIZ.append(str3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        this.LL.invoke(Boolean.valueOf(zBooleanValue), list, str3);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI;
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        PaymentMethod paymentMethod = this.LLILLL;
        if (paymentMethod != null) {
            str2 = paymentMethod.id;
        } else {
            str2 = null;
        }
        C03WD.LJIIJ(boolValueOf, lValueOf, str2, "native");
        return Unit.LIZ;
    }
}

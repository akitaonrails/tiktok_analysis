package X;

import Y.AfS137S0200000_1;
import Y.AfS170S0100000_1;
import android.content.Context;
import android.content.res.Resources;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipOpenCashierParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ListPaymentMethodRequest;
import kotlin.Unit;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.03bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C876203bc {
    public final Context LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1181));

    public final void LIZ() {
        try {
            C786410Ut5.LJIIJ((DialogC1389620mGW) this.LIZIZ.getValue());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public C876203bc(Context context) {
        this.LIZ = context;
    }

    public static void LIZJ(C876203bc c876203bc) {
        String string;
        boolean z;
        Resources resources = c876203bc.LIZ.getResources();
        if (resources != null) {
            string = resources.getString(2131832931);
        } else {
            string = null;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c876203bc.LIZ);
        C886203dE c886203dE = C886203dE.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showErrorToast hasActivity=");
        if (c19egLIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", message=");
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c886203dE.getClass();
        C886203dE.LJI(strLIZIZ);
        if (c19egLIZIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        } else {
            C1233040iBy c1233040iBy = new C1233040iBy(c876203bc.LIZ);
            c1233040iBy.LIZJ(string);
            c1233040iBy.LIZLLL();
        }
    }

    public final void LIZIZ(MembershipOpenCashierParams membershipOpenCashierParams) {
        boolean z;
        C886203dE c886203dE = C886203dE.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("open entrance=");
        sbLIZ.append(membershipOpenCashierParams.entrance);
        sbLIZ.append(", membershipMode=");
        sbLIZ.append(membershipOpenCashierParams.membershipMode);
        sbLIZ.append(", paymentMethodCode=");
        sbLIZ.append(membershipOpenCashierParams.paymentMethodCode);
        sbLIZ.append(", hasPaymentMethodToken=");
        String str = membershipOpenCashierParams.paymentMethodToken;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        sbLIZ.append(!z);
        sbLIZ.append(", source=");
        sbLIZ.append(membershipOpenCashierParams.source);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c886203dE.getClass();
        C886203dE.LJI(strLIZIZ);
        if (!C886203dE.LJ(membershipOpenCashierParams)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("open invalid params entrance=");
            sbLIZ2.append(membershipOpenCashierParams.entrance);
            sbLIZ2.append(", membershipMode=");
            sbLIZ2.append(membershipOpenCashierParams.membershipMode);
            C886203dE.LJI(C2188811AlT.LIZIZ(sbLIZ2));
            LIZJ(this);
            return;
        }
        C877403bo c877403bo = PaymentApi.LIZ;
        ListPaymentMethodRequest listPaymentMethodRequest = new ListPaymentMethodRequest(membershipOpenCashierParams.merchantUserId, membershipOpenCashierParams.region, membershipOpenCashierParams.currency, membershipOpenCashierParams.amount, null, membershipOpenCashierParams.entrance, membershipOpenCashierParams.addressId);
        c877403bo.getClass();
        ((PaymentApi) C877403bo.LIZIZ.create(PaymentApi.class)).LJIIIIZZ(listPaymentMethodRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIL(new AfS170S0100000_1(this, 9)).LJJLL(new AfS137S0200000_1(membershipOpenCashierParams, this, 5), new AfS170S0100000_1(this, 10));
    }
}

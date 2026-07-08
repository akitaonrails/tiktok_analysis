package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PayAuthHelper$initMerchantUserId$1$1$1", f = "PayAuthHelper.kt", l = {}, m = "invokeSuspend")
public final class C914503hn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PaymentData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914503hn(PaymentData paymentData, InterfaceC1364105Vn<? super C914503hn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = paymentData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C914503hn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Type type;
        Cashier cashier;
        String str;
        C1C7U.LIZ("PayAuthHelper@fb88.initMerchantUserId$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C914303hl c914303hl = C914303hl.LIZ;
        n nVar = this.LL.cashier;
        String str2 = null;
        if (nVar != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(Cashier.class));
                } else {
                    type = new TypeToken<Cashier>() { // from class: X.03i7
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, nVar, type);
                if (!(objFromJson instanceof Cashier)) {
                    objFromJson = null;
                }
                cashier = (Cashier) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                cashier = null;
            }
        } else {
            cashier = null;
        }
        c914303hl.getClass();
        C914303hl.LIZIZ = cashier;
        try {
            C931003kS c931003kS = C932203ke.LIZ;
            C914303hl.LIZ.getClass();
            Cashier cashier2 = C914303hl.LIZIZ;
            if (cashier2 != null) {
                str = cashier2.merchantUserId;
            } else {
                str = null;
            }
            c931003kS.getClass();
            C1724170uy7 c1724170uy7 = C1724150uy5.LJIIL.LIZ;
            if (c1724170uy7 != null && !TextUtils.isEmpty(str)) {
                c1724170uy7.LJIJJLI = str;
            }
            Cashier cashier3 = C914303hl.LIZIZ;
            if (cashier3 != null) {
                str2 = cashier3.nonce;
            }
            c931003kS.LJIIJ(str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PayAuthHelper@fb88.initMerchantUserId$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

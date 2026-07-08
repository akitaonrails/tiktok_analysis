package X;

import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.compliance.utils.PassportHelper$requestPassportLogin$1", f = "PassportHelper.kt", l = {43}, m = "invokeSuspend")
public final class C599610NfT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PassportLoginResponse>, Object> {
    public int LL;

    public C599610NfT(InterfaceC1364105Vn<? super C599610NfT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C599610NfT(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PassportHelper@b0c0.requestPassportLogin$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C599600NfS c599600NfS = InterfaceC599580NfQ.LIZ;
            this.LL = 1;
            obj = c599600NfS.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PassportHelper@b0c0.requestPassportLogin$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PassportHelper@b0c0.requestPassportLogin$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PassportLoginResponse> interfaceC1364105Vn) {
        return new C599610NfT(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

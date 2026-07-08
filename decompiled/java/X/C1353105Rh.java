package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMB2CBusinessInfoAvgResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Rh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.businessinfo.IMBusinessInfoHelper$fetchBusinessRespFromServer$1", f = "IMBusinessInfoHelper.kt", l = {63}, m = "invokeSuspend")
public final class C1353105Rh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ Function1<IMB2CBusinessInfoAvgResp, Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1353105Rh(Long l, Function1<? super IMB2CBusinessInfoAvgResp, Unit> function1, Function0<Unit> function0, InterfaceC1364105Vn<? super C1353105Rh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l;
        this.LLILLL = function1;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1353105Rh(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMBusinessInfoHelper@6afc.fetchBusinessRespFromServer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC15516065q interfaceC15516065q = (InterfaceC15516065q) C1353205Ri.LIZ.getValue();
                EnumC1725606pK enumC1725606pK = EnumC1725606pK.B2C_USER_AVG_RESP_TIME;
                String string = this.LLILLJJLI.toString();
                this.LL = 1;
                obj = interfaceC15516065q.LIZIZ(enumC1725606pK, string, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("IMBusinessInfoHelper@6afc.fetchBusinessRespFromServer$1");
                    return objLJFF;
                }
            }
            IMB2CBusinessInfoAvgResp iMB2CBusinessInfoAvgResp = (IMB2CBusinessInfoAvgResp) obj;
            Function1<IMB2CBusinessInfoAvgResp, Unit> function1 = this.LLILLL;
            if (iMB2CBusinessInfoAvgResp == null) {
                iMB2CBusinessInfoAvgResp = new IMB2CBusinessInfoAvgResp(null, null, null);
            }
            function1.invoke(iMB2CBusinessInfoAvgResp);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZ.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMBusinessInfoHelper@6afc.fetchBusinessRespFromServer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

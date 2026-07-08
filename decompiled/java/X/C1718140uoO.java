package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTViewModel;
import com.ss.android.ugc.aweme.foundation.network.PipoAccountApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTViewModel$requestConfirmApi$1", f = "CollectMobileFromTTViewModel.kt", l = {88, 96, 117}, m = "invokeSuspend")
public final class C1718140uoO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CollectMobileFromTTViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1718140uoO(CollectMobileFromTTViewModel collectMobileFromTTViewModel, InterfaceC1364105Vn<? super C1718140uoO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = collectMobileFromTTViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1718140uoO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        Object objConfirmRegisterMobile = obj;
        C1C7U.LIZ("CollectMobileFromTTViewModel@b51d.requestConfirmApi$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CollectMobileFromTTViewModel collectMobileFromTTViewModel = this.LLILLJJLI;
            Context applicationContext = C1717770unn.LIZJ().getApplicationContext();
            if (e instanceof C1494450ozb) {
                i = 2131832572;
            } else {
                i = 2131832569;
            }
            String string = applicationContext.getString(i);
            String localizedMessage = e.getLocalizedMessage();
            String localizedMessage2 = e.getLocalizedMessage();
            this.LL = 3;
            if (collectMobileFromTTViewModel.vQ2(string, localizedMessage, localizedMessage2, this) == objLJFF) {
                C1C7U.LIZIZ("CollectMobileFromTTViewModel@b51d.requestConfirmApi$1");
                return objLJFF;
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    C155000ia.LIZIZ(objConfirmRegisterMobile);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CollectMobileFromTTViewModel@b51d.requestConfirmApi$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objConfirmRegisterMobile);
        } else {
            C155000ia.LIZIZ(objConfirmRegisterMobile);
            C1717580unU c1717580unU = PipoAccountApi.LIZ;
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str = this.LLILLJJLI.LL;
            c1716550ulp.getClass();
            String strLIZJ = C1716550ulp.LIZJ(str);
            String strLJ = C1716550ulp.LJ(this.LLILLJJLI.LL);
            if (strLJ == null) {
                strLJ = "";
            }
            C1718110uoL c1718110uoL = C1718110uoL.LIZ;
            String str2 = this.LLILLJJLI.LL;
            c1718110uoL.getClass();
            JSONObject jSONObjectLIZJ = C1718110uoL.LIZJ(str2);
            if (jSONObjectLIZJ != null) {
                jSONObjectLIZJ.put("input_type", "Passport");
            } else {
                jSONObjectLIZJ = null;
            }
            String strValueOf = String.valueOf(jSONObjectLIZJ);
            this.LL = 1;
            c1717580unU.getClass();
            objConfirmRegisterMobile = C1717580unU.LIZ(strLIZJ).confirmRegisterMobile(strLJ, strValueOf, null, null, "true", this);
            if (objConfirmRegisterMobile == objLJFF) {
                C1C7U.LIZIZ("CollectMobileFromTTViewModel@b51d.requestConfirmApi$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1718150uoP c1718150uoP = new C1718150uoP((C0X52) objConfirmRegisterMobile, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1718150uoP) == objLJFF) {
            C1C7U.LIZIZ("CollectMobileFromTTViewModel@b51d.requestConfirmApi$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CollectMobileFromTTViewModel@b51d.requestConfirmApi$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

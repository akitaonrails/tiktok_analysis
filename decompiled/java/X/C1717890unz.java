package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.wallet.network.model.RegionMobileCodeItem;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberVM;
import com.ss.android.ugc.aweme.foundation.network.PipoAccountApi;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0unz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.phone.PhoneNumberVM$confirmAction$2", f = "PhoneNumberVM.kt", l = {150, 163, 200}, m = "invokeSuspend")
public final class C1717890unz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PhoneNumberVM LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ PhoneNumberVM LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717890unz(PhoneNumberVM phoneNumberVM, Map<String, String> map, InterfaceC1364105Vn<? super C1717890unz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = phoneNumberVM;
        this.LLILZIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1717890unz(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        PhoneNumberVM phoneNumberVM;
        Map<String, String> map;
        String alpha2;
        String str;
        Object objConfirmRegisterMobile = obj;
        C1C7U.LIZ("PhoneNumberVM@a690.confirmAction$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZ.AQ2("UNKNOWN_EXCEPTION", "exception: " + e.getMessage(), null);
            PhoneNumberVM phoneNumberVM2 = this.LLILZ;
            Context applicationContext = C1717770unn.LIZJ().getApplicationContext();
            if (e instanceof C1494450ozb) {
                i = 2131832572;
            } else {
                i = 2131832569;
            }
            String string = applicationContext.getString(i);
            this.LL = null;
            this.LLILLJJLI = null;
            this.LLILLL = 3;
            if (phoneNumberVM2.yQ2(string, null, this) == objLJFF) {
                C1C7U.LIZIZ("PhoneNumberVM@a690.confirmAction$2");
                return objLJFF;
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    C155000ia.LIZIZ(objConfirmRegisterMobile);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PhoneNumberVM@a690.confirmAction$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) this.LLILLJJLI;
            phoneNumberVM = this.LL;
            C155000ia.LIZIZ(objConfirmRegisterMobile);
        } else {
            C155000ia.LIZIZ(objConfirmRegisterMobile);
            C1717580unU c1717580unU = PipoAccountApi.LIZ;
            C1716550ulp c1716550ulp = C1716550ulp.LIZ;
            String str2 = this.LLILZ.xQ2().LLILLL;
            c1716550ulp.getClass();
            String strLIZJ = C1716550ulp.LIZJ(str2);
            c1717580unU.getClass();
            PipoAccountApi pipoAccountApiLIZ = C1717580unU.LIZ(strLIZJ);
            phoneNumberVM = this.LLILZ;
            map = this.LLILZIL;
            String strLJ = C1716550ulp.LJ(phoneNumberVM.xQ2().LLILLL);
            String str3 = "";
            if (strLJ == null) {
                strLJ = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(phoneNumberVM.LLILZIL);
            sbLIZ.append('-');
            sbLIZ.append(phoneNumberVM.LLILLJJLI);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Iterator<RegionMobileCodeItem> it2 = phoneNumberVM.LLILZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    alpha2 = "";
                    break;
                }
                RegionMobileCodeItem next = it2.next();
                if (TextUtils.equals(next.getAlpha2(), phoneNumberVM.LLILLL) && TextUtils.equals(next.getMobileCode(), phoneNumberVM.LLILZIL)) {
                    alpha2 = next.getAlpha2();
                    break;
                }
            }
            if (alpha2 == null) {
                alpha2 = "";
            }
            C1718110uoL c1718110uoL = C1718110uoL.LIZ;
            String str4 = phoneNumberVM.xQ2().LLILLL;
            c1718110uoL.getClass();
            JSONObject jSONObjectLIZJ = C1718110uoL.LIZJ(str4);
            if (jSONObjectLIZJ != null) {
                if (Intrinsics.LJFF(phoneNumberVM.LLJIJIL, "local_phone_auto_fill")) {
                    str = "SIM_Card";
                } else {
                    str = "Manual_Input";
                }
                jSONObjectLIZJ.put("input_type", str);
                String strJ3 = C786410Ut5.J3(jSONObjectLIZJ);
                if (strJ3 != null) {
                    str3 = strJ3;
                }
            }
            this.LL = phoneNumberVM;
            this.LLILLJJLI = map;
            this.LLILLL = 1;
            objConfirmRegisterMobile = pipoAccountApiLIZ.confirmRegisterMobile(strLJ, str3, strLIZIZ, alpha2, null, this);
            if (objConfirmRegisterMobile == objLJFF) {
                C1C7U.LIZIZ("PhoneNumberVM@a690.confirmAction$2");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1717880uny c1717880uny = new C1717880uny((C0X52) objConfirmRegisterMobile, phoneNumberVM, map, null);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1717880uny) == objLJFF) {
            C1C7U.LIZIZ("PhoneNumberVM@a690.confirmAction$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PhoneNumberVM@a690.confirmAction$2");
        return unit2;
    }
}

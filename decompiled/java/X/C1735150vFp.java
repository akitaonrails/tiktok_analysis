package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthData;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthRequest;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.ApplyAuthResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.compliance.manager.ComplianceDialogManager$applyAuth$1", f = "ComplianceDialogManager.kt", l = {328}, m = "invokeSuspend")
public final class C1735150vFp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1407900mk0 LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735150vFp(int i, C1407900mk0 c1407900mk0, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = c1407900mk0;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        return new C1735150vFp(this.LLILLL, this.LLILZIL, str, this.LLILZ, interfaceC1364105Vn, this.LLILZLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        ApplyAuthData applyAuthData;
        C1C7U.LIZ("ComplianceDialogManager@906c.applyAuth$1");
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
            C1735330vG7 c1735330vG7 = InterfaceC1735340vG8.LIZ;
            ApplyAuthRequest applyAuthRequest = new ApplyAuthRequest(C2286608xc.LJ(1));
            this.LL = 1;
            obj = c1735330vG7.LIZIZ(applyAuthRequest, Scene.SCENE_SERVICE, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ComplianceDialogManager@906c.applyAuth$1");
                return objLJFF;
            }
        }
        ApplyAuthResponse applyAuthResponse = (ApplyAuthResponse) obj;
        if (applyAuthResponse != null) {
            Integer num = applyAuthResponse.code;
            if ((num == null || num.intValue() != -1) && applyAuthResponse.data != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C1735240vFy.LIZ.getClass();
                C1735240vFy.LIZJ(false);
                String str = this.LLILLJJLI;
                int i2 = this.LLILLL;
                String str2 = this.LLILZ;
                C1407900mk0 c1407900mk0 = this.LLILZIL;
                Function1<Boolean, Unit> function1 = this.LLILZLL;
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ.LLIILII(), null, new C1735190vFt(i2, c1407900mk0, str, str2, null, function1), 2);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ComplianceDialogManager@906c.applyAuth$1");
                return unit;
            }
            if (applyAuthResponse != null && (applyAuthData = applyAuthResponse.data) != null) {
                String str3 = this.LLILLJJLI;
                int i3 = this.LLILLL;
                String str4 = this.LLILZ;
                C1407900mk0 c1407900mk02 = this.LLILZIL;
                Function1<Boolean, Unit> function12 = this.LLILZLL;
                C1735240vFy.LIZ.getClass();
                String strLJ = C1735240vFy.LJ();
                if (strLJ != null) {
                    C1735240vFy.LIZIZ.put(strLJ, applyAuthData);
                }
                C1257480ipO.LIZ.storeString("auth_data_disk_cache", C1741890vQh.LJIIIIZZ(C1735240vFy.LIZIZ));
                Integer num2 = applyAuthData.authStatus;
                if (num2 != null && num2.intValue() == 2) {
                    C1735240vFy.LIZJ(true);
                } else {
                    C1735240vFy.LJIIIIZZ(str3, applyAuthData.authPopup, i3, str4, c1407900mk02, function12);
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ComplianceDialogManager@906c.applyAuth$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

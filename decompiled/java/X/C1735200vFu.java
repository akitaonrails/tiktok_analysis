package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AuthPopup;
import com.ss.android.ugc.aweme.ecommerce.compliance.utils.ComplianceDialogActivity;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.compliance.manager.ComplianceDialogManager$showDialog$1", f = "ComplianceDialogManager.kt", l = {137}, m = "invokeSuspend")
public final class C1735200vFu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Function1 LLILLJJLI;
    public Object LLILLL;
    public C1735240vFy LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ AuthPopup LLJ;
    public final /* synthetic */ C1407900mk0 LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1735200vFu(String str, String str2, AuthPopup authPopup, C1407900mk0 c1407900mk0, int i, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C1735200vFu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = authPopup;
        this.LLJI = c1407900mk0;
        this.LLJIJIL = i;
        this.LLJILJIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1735200vFu(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        int i;
        Function1<Boolean, Unit> function1;
        String str3;
        C1735240vFy c1735240vFy;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Object objLIZ = obj;
        C1C7U.LIZ("ComplianceDialogManager@906c.showDialog$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZLL;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LLILZIL;
                c1735240vFy = this.LLILZ;
                str = (String) this.LLILLL;
                function1 = this.LLILLJJLI;
                str2 = (String) this.LL;
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            Activity activityLIZ = C036A.LIZ();
            if (activityLIZ != null) {
                str = this.LLIZ;
                str2 = this.LLIZLLLIL;
                AuthPopup authPopup = this.LLJ;
                C1407900mk0 c1407900mk0 = this.LLJI;
                i = this.LLJIJIL;
                function1 = this.LLJILJIL;
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                Pair[] pairArr = new Pair[2];
                String str4 = "";
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                pairArr[0] = new Pair("page_name", str3);
                if (str2 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "previous_page")) != null) {
                    str4 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }
                pairArr[1] = new Pair("previous_page", str4);
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                c1507790pL7.getClass();
                C1507790pL7.LIZJ("rd_tiktokec_apply_auth_dialog_show", mapLJIIIIZZ);
                c1735240vFy = C1735240vFy.LIZ;
                String str5 = ComplianceDialogActivity._pnsPageId;
                this.LL = str2;
                this.LLILLJJLI = function1;
                this.LLILLL = str;
                this.LLILZ = c1735240vFy;
                this.LLILZIL = i;
                this.LLILZLL = 1;
                objLIZ = C1735380vGC.LIZ(activityLIZ, authPopup, c1407900mk0, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("ComplianceDialogManager@906c.showDialog$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ComplianceDialogManager@906c.showDialog$1");
            return unit;
        }
        int iIntValue = ((Number) objLIZ).intValue();
        c1735240vFy.getClass();
        C1735240vFy.LJFF(iIntValue, i, str, str2, function1);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ComplianceDialogManager@906c.showDialog$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

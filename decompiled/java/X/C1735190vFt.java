package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.compliance.utils.ComplianceDialogActivity;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.compliance.manager.ComplianceDialogManager$showErrorDialog$1", f = "ComplianceDialogManager.kt", l = {193}, m = "invokeSuspend")
public final class C1735190vFt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public Object LLILLJJLI;
    public Function1 LLILLL;
    public Object LLILZ;
    public C1735240vFy LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C1407900mk0 LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ Function1<Boolean, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735190vFt(int i, C1407900mk0 c1407900mk0, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = c1407900mk0;
        this.LLJI = i;
        this.LLJIJIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLIZ;
        String str2 = this.LLIZLLLIL;
        return new C1735190vFt(this.LLJI, this.LLJ, str, str2, interfaceC1364105Vn, this.LLJIJIL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        String str2;
        Function1<Boolean, Unit> function1;
        C1735240vFy c1735240vFy;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        C1C7U.LIZ("ComplianceDialogManager@906c.showErrorDialog$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZLL;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LL;
                c1735240vFy = this.LLILZIL;
                str = (String) this.LLILZ;
                function1 = this.LLILLL;
                str2 = (String) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            Pair[] pairArr = new Pair[2];
            String str3 = this.LLIZ;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            pairArr[0] = new Pair("page_name", str3);
            String str5 = this.LLIZLLLIL;
            if (str5 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str5), "previous_page")) != null) {
                str4 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            }
            pairArr[1] = new Pair("previous_page", str4);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c1507790pL7.getClass();
            C1507790pL7.LIZJ("rd_tiktokec_error_auth_dialog_show", mapLJIIIIZZ);
            Activity activityLIZ = C036A.LIZ();
            if (activityLIZ != null) {
                str = this.LLIZ;
                C1407900mk0 c1407900mk0 = this.LLJ;
                i = this.LLJI;
                str2 = this.LLIZLLLIL;
                function1 = this.LLJIJIL;
                c1735240vFy = C1735240vFy.LIZ;
                String str6 = ComplianceDialogActivity._pnsPageId;
                this.LLILLJJLI = str2;
                this.LLILLL = function1;
                this.LLILZ = str;
                this.LLILZIL = c1735240vFy;
                this.LL = i;
                this.LLILZLL = 1;
                obj = C1735380vGC.LIZ(activityLIZ, null, c1407900mk0, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ComplianceDialogManager@906c.showErrorDialog$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ComplianceDialogManager@906c.showErrorDialog$1");
            return unit;
        }
        int iIntValue = ((Number) obj).intValue();
        c1735240vFy.getClass();
        C1735240vFy.LJFF(iIntValue, i, str, str2, function1);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ComplianceDialogManager@906c.showErrorDialog$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

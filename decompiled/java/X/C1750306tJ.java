package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.exp.BusinessLeadInfoConfigData;
import com.ss.android.ugc.aweme.im.b2c.notice.BusinessLeadInfoViewModel;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06tJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.notice.BusinessLeadInfoViewModel$onPrepared$1", f = "BusinessLeadInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1750306tJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BusinessLeadInfoViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750306tJ(BusinessLeadInfoViewModel businessLeadInfoViewModel, InterfaceC1364105Vn<? super C1750306tJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = businessLeadInfoViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1750306tJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BusinessLeadInfoViewModel@bcc3.onPrepared$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Keva keva = (Keva) this.LL.LL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_last_auto_fill");
        sbLIZ.append(C461720I8s.LIZIZ());
        if (jCurrentTimeMillis - keva.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L) > TimeUnit.DAYS.toMillis(((BusinessLeadInfoConfigData) C1750706tN.LIZIZ.getValue()).fetchAutoFillFrequency)) {
            IAdAutofillService iAdAutofillService = (IAdAutofillService) PluggableExtentionKt.pluggableSpiForReal(IAdAutofillService.class);
            if (iAdAutofillService != null) {
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ();
                iAdAutofillService.LJIJI(EnumC1059300dfk.DM);
            }
            Keva keva2 = (Keva) this.LL.LL.getValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key_last_auto_fill");
            sbLIZ2.append(C461720I8s.LIZIZ());
            keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), System.currentTimeMillis());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BusinessLeadInfoViewModel@bcc3.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05KH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.manager.EcProductAddShowManager$hideButtonIfConditionMet$1$1", f = "EcProductAddShowManager.kt", l = {80}, m = "invokeSuspend")
public final class C05KH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;

    public C05KH(InterfaceC1364105Vn<? super C05KH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05KH(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcProductAddShowManager@5747.hideButtonIfConditionMet$1$1");
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
            SettingsManager.LIZLLL().getClass();
            long jLJFF = SettingsManager.LJFF("ec_anchor_show_add_product_bottom_button_sql_timeout_config", 500L);
            C05KI c05ki = new C05KI(null);
            this.LL = 1;
            obj = C099A.LIZJ(jLJFF, c05ki, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcProductAddShowManager@5747.hideButtonIfConditionMet$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcProductAddShowManager@5747.hideButtonIfConditionMet$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C05KH(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

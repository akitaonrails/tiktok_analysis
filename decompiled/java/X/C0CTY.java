package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.popupclean.FCPPopupEnableRule;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.popupclean.FcpPopupEnableRulesSettings$storeConfig$1", f = "FcpPopupEnableRulesSettings.kt", l = {}, m = "invokeSuspend")
public final class C0CTY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FCPPopupEnableRule LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CTY(FCPPopupEnableRule fCPPopupEnableRule, InterfaceC1364105Vn<? super C0CTY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fCPPopupEnableRule;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CTY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpPopupEnableRulesSettings@5dc.storeConfig$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1227904rF.LIZ.getClass();
            C314140CTc.LIZIZ.storeString("new_fcp_popup_rules", C1227904rF.LIZLLL().LJIILL(this.LL));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C805380Via.LIZJ(e, "popup_enable_settings");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FcpPopupEnableRulesSettings@5dc.storeConfig$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZJW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.core.ActivityStatusServiceController$onSettingChangeListener$1$onChange$1", f = "ActivityStatusServiceController.kt", l = {}, m = "invokeSuspend")
public final class C0ZJW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C897570ZJb LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZJW(C897570ZJb c897570ZJb, boolean z, InterfaceC1364105Vn<? super C0ZJW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c897570ZJb;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZJW(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusServiceController@605d.onSettingChangeListener$1$onChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIJI().LJFF(C0ZH6.LIZ(this.LL.LIZ));
        if (this.LLILLJJLI) {
            this.LL.LIZIZ.LIZIZ();
            if (this.LL.LIZIZ()) {
                this.LL.LIZJ.LJ("turn_setting_on", EnumC595840NYo.ALL);
            }
        } else {
            this.LL.LIZIZ.LIZIZ();
            if (this.LL.LIZJ()) {
                this.LL.LIZJ.LIZLLL("turn_setting_off", EnumC595840NYo.ALL);
            }
            if (C1689706jX.LIZ()) {
                this.LL.LIZJ.LJ("turn_setting_off", EnumC595840NYo.FETCH);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusServiceController@605d.onSettingChangeListener$1$onChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

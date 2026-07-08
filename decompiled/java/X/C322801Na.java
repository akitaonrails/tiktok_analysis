package X;

import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent$OfflineModePushHandlerV2$registryEndTimeCallback$1$1", f = "OfflineModeSwitchComponent.kt", l = {}, m = "invokeSuspend")
public final class C322801Na extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322801Na(Function0<Unit> function0, InterfaceC1364105Vn<? super C322801Na> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322801Na(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeSwitchComponent$OfflineModePushHandlerV2@753f.registryEndTimeCallback$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        OfflineModeSwitchComponent.LLJLLIL.LIZ("registryEndTimeCallback callback", null);
        this.LL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineModeSwitchComponent$OfflineModePushHandlerV2@753f.registryEndTimeCallback$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

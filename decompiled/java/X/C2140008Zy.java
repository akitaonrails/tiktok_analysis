package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Zy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.asve.editor.ASNLEEditor$setNLEMonitor$1$onEvent$1", f = "ASNLEEditor.kt", l = {}, m = "invokeSuspend")
public final class C2140008Zy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2140008Zy(Map<String, String> map, InterfaceC1364105Vn<? super C2140008Zy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2140008Zy(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ASNLEEditor@ec40.setNLEMonitor$1$onEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2219091BtD.LJ().LIZ("nle_api_cost_event", this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ASNLEEditor@ec40.setNLEMonitor$1$onEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

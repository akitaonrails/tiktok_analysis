package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ON3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2$onCreate$1$1", f = "InboxFragmentV2.kt", l = {}, m = "invokeSuspend")
public final class C0ON3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0ON3(InterfaceC1364105Vn<? super C0ON3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ON3(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxFragmentV2@d7b5.onCreate$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C619130OQd.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ContentRegistryInitializer.init() failed: ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        }
        C622190Oan.LIZ.LJIIIIZZ(C0OJX.LIZ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxFragmentV2@d7b5.onCreate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0ON3(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

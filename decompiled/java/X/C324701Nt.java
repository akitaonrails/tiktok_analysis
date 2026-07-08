package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.logger.ColdBootToFeedExposureLogger$addMainActivityFirstOnStopListener$1$1$1", f = "ColdBootToFeedExposureLogger.kt", l = {}, m = "invokeSuspend")
public final class C324701Nt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C324701Nt(InterfaceC1364105Vn<? super C324701Nt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324701Nt(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ColdBootToFeedExposureLogger@1fbe.addMainActivityFirstOnStopListener$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1913090zsp.LIZ.getClass();
        C1913090zsp.LJIIJ = true;
        Function0<Unit> function0 = C1913090zsp.LJIIL;
        if (function0 != null) {
            function0.invoke();
            C1913090zsp.LJIIL = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ColdBootToFeedExposureLogger@1fbe.addMainActivityFirstOnStopListener$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C324701Nt(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

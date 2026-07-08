package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08ZG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.diagnosis.ColdBootLaunchBackgroundReporterTask$run$1", f = "ColdBootLaunchBackgroundReporterTask.kt", l = {}, m = "invokeSuspend")
public final class C08ZG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C08ZG(InterfaceC1364105Vn<? super C08ZG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08ZG(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ColdBootLaunchBackgroundReporterTask@4aca.run$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C202103146b.LIZ(0, "feed_total").stop();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ColdBootLaunchBackgroundReporterTask@4aca.run$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C08ZG(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05OD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.utils.SleepHourMusicManager$pause$1", f = "SleepHourMusicManager.kt", l = {}, m = "invokeSuspend")
public final class C05OD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05OD(InterfaceC1364105Vn<? super C05OD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05OD(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SleepHourMusicManager@9c2b.pause$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20498815Ja c20498815Ja = C05OG.LIZIZ;
        if (c20498815Ja != null) {
            c20498815Ja.pause();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SleepHourMusicManager@9c2b.pause$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05OD(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

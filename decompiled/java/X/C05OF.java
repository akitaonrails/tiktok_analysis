package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05OF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.utils.SleepHourMusicManager$release$1", f = "SleepHourMusicManager.kt", l = {}, m = "invokeSuspend")
public final class C05OF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05OF(InterfaceC1364105Vn<? super C05OF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05OF(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SleepHourMusicManager@9c2b.release$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass0956 anonymousClass0956 = C05OG.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C05OG.LIZJ = null;
        C20498815Ja c20498815Ja = C05OG.LIZIZ;
        if (c20498815Ja != null) {
            c20498815Ja.release();
        }
        C05OG.LIZIZ = null;
        C05OG.LJFF.clear();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SleepHourMusicManager@9c2b.release$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05OF(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

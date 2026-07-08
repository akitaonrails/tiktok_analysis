package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05OE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.utils.SleepHourMusicManager$playMusic$1", f = "SleepHourMusicManager.kt", l = {}, m = "invokeSuspend")
public final class C05OE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05OE(String str, Function0<Unit> function0, InterfaceC1364105Vn<? super C05OE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05OE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SleepHourMusicManager@9c2b.playMusic$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1485060okS c1485060okS = C05OG.LJFF.get(this.LL);
        if (c1485060okS != null) {
            Function0<Unit> function0 = this.LLILLJJLI;
            C20498815Ja c20498815Ja = C05OG.LIZIZ;
            if (c20498815Ja != null) {
                c20498815Ja.LIZIZ(c1485060okS);
            }
            if (function0 != null) {
                function0.invoke();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SleepHourMusicManager@9c2b.playMusic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

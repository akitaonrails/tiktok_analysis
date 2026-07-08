package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.PokerBundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.channel.poker.EffectPokerHandler$handle$1", f = "EffectPokerHandler.kt", l = {54}, m = "invokeSuspend")
public final class C1407620mjY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1407680mje LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407620mjY(int i, C1407680mje c1407680mje, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1407680mje;
        this.LLILLL = i;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407620mjY(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EffectPokerHandler@5799.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C1407680mje c1407680mje = this.LLILLJJLI;
                int i2 = this.LLILLL;
                String str = this.LLILZ;
                this.LL = 1;
                c1407680mje.getClass();
                Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C1407650mjb(i2, c1407680mje, str, null));
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("EffectPokerHandler@5799.handle$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C20012313Rx.LIZIZ, "EffectPokerHandler.handle error", e);
            C1407680mje c1407680mje2 = this.LLILLJJLI;
            long j = this.LLILLL;
            PokerBundle pokerBundle = new PokerBundle("", "", "", "", "");
            c1407680mje2.getClass();
            C1411250mpP.LIZIZ(c1407680mje2, j, C786410Ut5.J3(C1407680mje.LJ(1, pokerBundle)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectPokerHandler@5799.handle$1");
        return unit;
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xuv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.retry.LoopingNetworkRequestRetryScheduler$resume$2", f = "NetworkRequestRetryScheduler.kt", l = {613, 623}, m = "invokeSuspend")
public final class C863990Xuv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C863980Xuu LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C863980Xuu LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863990Xuv(C863980Xuu c863980Xuu, String str, InterfaceC1364105Vn<? super C863990Xuv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c863980Xuu;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C863990Xuv c863990Xuv = new C863990Xuv(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c863990Xuv.LLILZ = obj;
        return c863990Xuv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C863980Xuu c863980Xuu;
        C1DEV c1dev;
        C863980Xuu c863980Xuu2;
        C1DEV c1dev2;
        C1C7U.LIZ("LoopingNetworkRequestRetryScheduler@4605.resume$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        c863980Xuu2 = this.LLILLJJLI;
                        c1dev2 = this.LL;
                        interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
                        C155000ia.LIZIZ(obj);
                        try {
                            c863980Xuu2.LJIIIIZZ = EnumC864060Xv2.RUNNING;
                            c1dev.LIZIZ(null);
                            C863980Xuu c863980Xuu3 = this.LLILZIL;
                            c863980Xuu3.LJIIJ = C23250099c.LIZLLL(interfaceC497601wk, c863980Xuu3.LJI, null, new C863250Xtj(c863980Xuu3, this.LLILZLL, null), 2);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.resume$2");
                            return unit;
                        } finally {
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c863980Xuu = this.LLILLJJLI;
                c1dev = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZ;
                c863980Xuu = this.LLILZIL;
                if (!c863980Xuu.LJ.LIZ) {
                    c863980Xuu.LJIIIIZZ("resume() called but retry is disabled");
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.resume$2");
                    return unit2;
                }
                c1dev = c863980Xuu.LJII;
                this.LLILZ = interfaceC497601wk;
                this.LL = c1dev;
                this.LLILLJJLI = c863980Xuu;
                this.LLILLL = 1;
                if (c1dev.LIZLLL(null, this) == objLJFF) {
                    C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.resume$2");
                    return objLJFF;
                }
            }
            if (c863980Xuu.LJIIIIZZ == EnumC864060Xv2.RUNNING) {
                c863980Xuu.LJIIIIZZ("resume() called but is already running");
                Unit unit3 = Unit.LIZ;
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.resume$2");
                return unit3;
            }
            c1dev.LIZIZ(null);
            if (!this.LLILZIL.LIZ.LJ().LIZ().LIZIZ()) {
                this.LLILZIL.LJIIIIZZ("resume() called but network is not available");
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.resume$2");
                return unit4;
            }
            if (this.LLILZIL.LIZ.LJ().LJ().isAppBackground()) {
                this.LLILZIL.LJIIIIZZ("resume() called but app is background");
                Unit unit5 = Unit.LIZ;
                C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.resume$2");
                return unit5;
            }
            int i2 = C864070Xv3.LIZ[this.LLILZIL.LJIIIIZZ.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    this.LLILZIL.LJIIIZ("resume() called while stopped, waiting for completion");
                    this.LLILZIL.LJFF.LIZJ.clear();
                    this.LLILZIL.LJIIIIZZ("Cleared failure history on resume");
                    c863980Xuu2 = this.LLILZIL;
                    c1dev2 = c863980Xuu2.LJII;
                    this.LLILZ = interfaceC497601wk;
                    this.LL = c1dev2;
                    this.LLILLJJLI = c863980Xuu2;
                    this.LLILLL = 2;
                    if (c1dev2.LIZLLL(null, this) == objLJFF) {
                        C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.resume$2");
                        return objLJFF;
                    }
                    c863980Xuu2.LJIIIIZZ = EnumC864060Xv2.RUNNING;
                    c1dev.LIZIZ(null);
                    C863980Xuu c863980Xuu32 = this.LLILZIL;
                    c863980Xuu32.LJIIJ = C23250099c.LIZLLL(interfaceC497601wk, c863980Xuu32.LJI, null, new C863250Xtj(c863980Xuu32, this.LLILZLL, null), 2);
                    Unit unit6 = Unit.LIZ;
                    C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.resume$2");
                    return unit6;
                }
                throw new C1954807lC();
            }
            this.LLILZIL.LJIIIIZZ("resume() called but scheduler is already running");
            Unit unit62 = Unit.LIZ;
            C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.resume$2");
            return unit62;
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

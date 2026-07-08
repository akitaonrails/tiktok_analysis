package X;

import com.bytedance.scene.Scene;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O34, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.optimistic.base.BaseOptimisticService$optRequest$1$3$1", f = "BaseOptimisticService.kt", l = {}, m = "invokeSuspend")
public final class C0O34 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0O7A<C0O55<Object>> LL;
    public final /* synthetic */ C0O38<C0O35> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ InterfaceC1631620sYq<C0O35, Boolean, Throwable, Unit> LLILZIL;
    public final /* synthetic */ C0O35 LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ C259800zU<C0O35> LLIZLLLIL;
    public final /* synthetic */ Function2<C0O35, Boolean, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0O34(C0O7A<C0O55<Object>> c0o7a, C0O38<C0O35> c0o38, String str, C013C c013c, InterfaceC1631620sYq<C0O35, ? super Boolean, ? super Throwable, Unit> interfaceC1631620sYq, C0O35 c0o35, long j, C259800zU<C0O35> c259800zU, Function2<C0O35, ? super Boolean, Unit> function2, InterfaceC1364105Vn<? super C0O34> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0o7a;
        this.LLILLJJLI = c0o38;
        this.LLILLL = str;
        this.LLILZ = c013c;
        this.LLILZIL = interfaceC1631620sYq;
        this.LLILZLL = c0o35;
        this.LLIZ = j;
        this.LLIZLLLIL = c259800zU;
        this.LLJ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O34(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [T, X.0O35] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, X.0O35] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Throwable cause;
        String str;
        C1C7U.LIZ("BaseOptimisticService@8cd.optRequest$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0O7A<C0O55<Object>> c0o7a = this.LL;
        if (!(c0o7a instanceof C0O77)) {
            if (c0o7a instanceof C0O78) {
                C612230Nzp<STATE> c612230NzpLJI = this.LLILLJJLI.LJI();
                if (c612230NzpLJI != 0) {
                    String str2 = this.LLILLL;
                    boolean z = this.LLILZ.element;
                    Pair pair = (Pair) c612230NzpLJI.LIZ.LIZJ(str2);
                    if (pair != null) {
                        Object first = pair.getFirst();
                        c612230NzpLJI.LIZ.LIZLLL(str2, (Pair<S, S>) new Pair(first, first));
                        c612230NzpLJI.LIZ(first, z, EnumC612210Nzn.ROLLBACK);
                    }
                }
                InterfaceC1631620sYq<C0O35, Boolean, Throwable, Unit> interfaceC1631620sYq = this.LLILZIL;
                if (interfaceC1631620sYq != null) {
                    interfaceC1631620sYq.invoke(this.LLILZLL, Boolean.valueOf(this.LLILZ.element), ((C0O78) this.LL).LJFF);
                }
                C0O36 c0o36 = C0O36.LIZ;
                String strLIZ = this.LLILZLL.LIZ();
                String strLJFF = this.LLILLJJLI.LJFF();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
                C614090O6t c614090O6t = ((C0O78) this.LL).LJFF;
                c0o36.getClass();
                if (c614090O6t instanceof C614080O6s) {
                    cause = ((C614080O6s) c614090O6t).getE();
                } else {
                    cause = c614090O6t.getCause();
                }
                if (cause != null) {
                    str = (String) C2177408g0.LIZIZ(cause).getFirst();
                } else {
                    str = "unknown";
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, strLIZ);
                c2344009Gk.LJIIIIZZ("opt_type", strLJFF);
                c2344009Gk.LIZJ(0, "is_success");
                c2344009Gk.LJIIIIZZ("step", "net_end");
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                c2344009Gk.LJIIIIZZ("error_type", str);
                C20684815ws.LJIILLIIL("ttls_rd_net_request_optimistic", c2344009Gk.LIZ);
            } else if (c0o7a instanceof C0O79) {
                if (C0O7F.LIZJ(c0o7a.LIZJ) == EnumC614130O6x.Optimistic) {
                    this.LLILZ.element = true;
                    this.LLIZLLLIL.element = this.LLILLJJLI.LJII(this.LLILZLL);
                    C0O35 c0o35 = this.LLIZLLLIL.element;
                    if (c0o35 != null) {
                        C0O38<C0O35> c0o38 = this.LLILLJJLI;
                        String str3 = this.LLILLL;
                        C0O35 c0o352 = this.LLILZLL;
                        Function2<C0O35, Boolean, Unit> function2 = this.LLJ;
                        C612230Nzp<STATE> c612230NzpLJI2 = c0o38.LJI();
                        if (c612230NzpLJI2 != 0) {
                            Pair pair2 = (Pair) c612230NzpLJI2.LIZ.LIZJ(str3);
                            if (pair2 != null) {
                                c612230NzpLJI2.LIZ.LIZLLL(str3, (Pair<S, S>) new Pair(pair2.getFirst(), c0o35));
                                c612230NzpLJI2.LIZ(c0o35, true, EnumC612210Nzn.OPTIMISTIC);
                            } else {
                                c612230NzpLJI2.LIZ.LIZLLL(str3, (Pair<S, S>) new Pair(c0o352, c0o35));
                                c612230NzpLJI2.LIZ(c0o35, true, EnumC612210Nzn.OPTIMISTIC);
                            }
                        }
                        if (function2 != null) {
                            function2.invoke(c0o35, true);
                        }
                    }
                    C0O36 c0o362 = C0O36.LIZ;
                    String strLIZ2 = this.LLILZLL.LIZ();
                    String strLJFF2 = this.LLILLJJLI.LJFF();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLIZ;
                    c0o362.getClass();
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ(Scene.SCENE_SERVICE, strLIZ2);
                    c2344009Gk2.LJIIIIZZ("opt_type", strLJFF2);
                    c2344009Gk2.LIZJ(1, "is_success");
                    c2344009Gk2.LJIIIIZZ("step", "opt_end");
                    c2344009Gk2.LIZLLL(jCurrentTimeMillis2, "duration");
                    C20684815ws.LJIILLIIL("ttls_rd_net_request_optimistic", c2344009Gk2.LIZ);
                } else {
                    C259800zU<C0O35> c259800zU = this.LLIZLLLIL;
                    if (c259800zU.element == null) {
                        c259800zU.element = this.LLILLJJLI.LJII(this.LLILZLL);
                    }
                    C612230Nzp<STATE> c612230NzpLJI3 = this.LLILLJJLI.LJI();
                    if (c612230NzpLJI3 != 0) {
                        c612230NzpLJI3.LIZIZ(this.LLIZLLLIL.element, this.LLILLL, this.LLILZ.element);
                    }
                    Function2<C0O35, Boolean, Unit> function22 = this.LLJ;
                    if (function22 != 0) {
                        function22.invoke(this.LLIZLLLIL.element, false);
                    }
                    C0O36 c0o363 = C0O36.LIZ;
                    String strLIZ3 = this.LLILZLL.LIZ();
                    String strLJFF3 = this.LLILLJJLI.LJFF();
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - this.LLIZ;
                    c0o363.getClass();
                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                    c2344009Gk3.LJIIIIZZ(Scene.SCENE_SERVICE, strLIZ3);
                    c2344009Gk3.LJIIIIZZ("opt_type", strLJFF3);
                    c2344009Gk3.LIZJ(1, "is_success");
                    c2344009Gk3.LJIIIIZZ("step", "net_end");
                    c2344009Gk3.LIZLLL(jCurrentTimeMillis3, "duration");
                    C20684815ws.LJIILLIIL("ttls_rd_net_request_optimistic", c2344009Gk3.LIZ);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseOptimisticService@8cd.optRequest$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

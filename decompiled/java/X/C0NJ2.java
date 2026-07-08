package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.state.PdpUnifiedStateUpdater$update$1", f = "PdpUnifiedStateUpdater.kt", l = {51, 52, 53}, m = "invokeSuspend")
public final class C0NJ2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NJ5 LLILLJJLI;
    public final /* synthetic */ C0NJ3 LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJ2(C0NJ5 c0nj5, C0NJ3 c0nj3, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C0NJ2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nj5;
        this.LLILLL = c0nj3;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NJ2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("PdpUnifiedStateUpdater@923d.update$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        unit = Unit.LIZ;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    unit = Unit.LIZ;
                }
            } else {
                C155000ia.LIZIZ(obj);
                unit = Unit.LIZ;
            }
        } else {
            C155000ia.LIZIZ(obj);
            int i2 = C0NJ4.LIZ[this.LLILLJJLI.ordinal()];
            unit = null;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C0NJ1 c0nj1 = this.LLILLL.LIZ;
                        if (c0nj1 != null) {
                            Map<String, ? extends Object> map = this.LLILZ;
                            this.LL = 3;
                            if (c0nj1.LIZIZ(map, this) == objLJFF) {
                                C1C7U.LIZIZ("PdpUnifiedStateUpdater@923d.update$1");
                                return objLJFF;
                            }
                            unit = Unit.LIZ;
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C0NJ1 c0nj12 = this.LLILLL.LIZ;
                    if (c0nj12 != null) {
                        Map<String, ? extends Object> map2 = this.LLILZ;
                        this.LL = 2;
                        if (c0nj12.LIZLLL(map2, this) == objLJFF) {
                            C1C7U.LIZIZ("PdpUnifiedStateUpdater@923d.update$1");
                            return objLJFF;
                        }
                        unit = Unit.LIZ;
                    }
                }
            } else {
                C0NJ1 c0nj13 = this.LLILLL.LIZ;
                if (c0nj13 != null) {
                    Map<String, ? extends Object> map3 = this.LLILZ;
                    this.LL = 1;
                    if (c0nj13.LJFF(map3, this) == objLJFF) {
                        C1C7U.LIZIZ("PdpUnifiedStateUpdater@923d.update$1");
                        return objLJFF;
                    }
                    unit = Unit.LIZ;
                }
            }
        }
        C1C7U.LIZIZ("PdpUnifiedStateUpdater@923d.update$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

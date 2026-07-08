package X;

import com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NN5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem$onShow$1", f = "M2BannerAssem.kt", l = {173, 174}, m = "invokeSuspend")
public final class C0NN5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ M2BannerAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NN5(M2BannerAssem m2BannerAssem, InterfaceC1364105Vn<? super C0NN5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = m2BannerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NN5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("M2BannerAssem@ec5e.onShow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("M2BannerAssem@ec5e.onShow$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            M2BannerAssem m2BannerAssem = this.LLILLJJLI;
            this.LL = 1;
            if (m2BannerAssem.oo(this) == objLJFF) {
                C1C7U.LIZIZ("M2BannerAssem@ec5e.onShow$1");
                return objLJFF;
            }
        }
        M2BannerAssem m2BannerAssem2 = this.LLILLJJLI;
        this.LL = 2;
        if (m2BannerAssem2.mo(this) == objLJFF) {
            C1C7U.LIZIZ("M2BannerAssem@ec5e.onShow$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("M2BannerAssem@ec5e.onShow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

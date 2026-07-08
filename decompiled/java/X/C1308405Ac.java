package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.vh.DMAiGroupShotBannerVH$onBindItem$1$1$1", f = "DMAiGroupShotBannerVH.kt", l = {}, m = "invokeSuspend")
public final class C1308405Ac extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC497601wk LL;
    public final /* synthetic */ C05P0<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1308405Ac(InterfaceC497601wk interfaceC497601wk, C05P0<String> c05p0, InterfaceC1364105Vn<? super C1308405Ac> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1308405Ac(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMAiGroupShotBannerVH@2930.onBindItem$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LLILLJJLI.getValue() == null) {
            C23250099c.LIZLLL(this.LL, C0PEM.LIZJ, null, new C1308305Ab(this.LLILLJJLI, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMAiGroupShotBannerVH@2930.onBindItem$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

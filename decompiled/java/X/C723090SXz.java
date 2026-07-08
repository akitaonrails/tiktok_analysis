package X;

import com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM$preload$2$2", f = "MixBottomBarVM.kt", l = {}, m = "invokeSuspend")
public final class C723090SXz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MixBottomBarVM LL;
    public final /* synthetic */ AbstractC1623806Xk<C722990SXp> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C723090SXz(MixBottomBarVM mixBottomBarVM, AbstractC1623806Xk<C722990SXp> abstractC1623806Xk, InterfaceC1364105Vn<? super C723090SXz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mixBottomBarVM;
        this.LLILLJJLI = abstractC1623806Xk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C723090SXz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixBottomBarVM@eed6.preload$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixBottomBarVM@eed6.preload$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

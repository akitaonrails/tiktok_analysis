package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H8K, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder$doPrepareVideoOnMainThread$1", f = "SearchVideoHolder.kt", l = {}, m = "invokeSuspend")
public final class C0H8K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchVideoHolder LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H8K(SearchVideoHolder searchVideoHolder, boolean z, InterfaceC1364105Vn<? super C0H8K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchVideoHolder;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H8K(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("SearchVideoHolder@6f53.doPrepareVideoOnMainThread$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C661470Px3 c661470Px3I7 = this.LL.i7();
            if (c661470Px3I7 != null) {
                InterfaceC661540PxA interfaceC661540PxA = c661470Px3I7.LLJ;
                if (interfaceC661540PxA != null) {
                    interfaceC661540PxA.LIZJ();
                }
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoHolder@6f53.doPrepareVideoOnMainThread$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

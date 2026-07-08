package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.ViewObjectWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01UK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveWithVideoItemViewHolder$bindProductDynamicAnchor$1$viewObject$1", f = "SearchLiveWithVideoItemViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C01UK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ViewObjectWrapper>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01UK(String str, InterfaceC1364105Vn<? super C01UK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01UK c01uk = new C01UK(this.LLILLJJLI, interfaceC1364105Vn);
        c01uk.LL = obj;
        return c01uk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("SearchLiveWithVideoItemViewHolder@5e8a.bindProductDynamicAnchor$1$viewObject$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = (ViewObjectWrapper) C1227904rF.LIZIZ(str, ViewObjectWrapper.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("SearchLiveWithVideoItemViewHolder@5e8a.bindProductDynamicAnchor$1$viewObject$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ViewObjectWrapper> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

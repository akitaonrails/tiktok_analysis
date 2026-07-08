package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.ViewObjectWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01UI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.SearchLiveDynamicBottomAnchorAssem$bindDynamicAnchor$2$viewObject$1", f = "SearchLiveDynamicBottomAnchorAssem.kt", l = {}, m = "invokeSuspend")
public final class C01UI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ViewObjectWrapper>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01UI(String str, InterfaceC1364105Vn<? super C01UI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01UI c01ui = new C01UI(this.LLILLJJLI, interfaceC1364105Vn);
        c01ui.LL = obj;
        return c01ui;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("SearchLiveDynamicBottomAnchorAssem@a8c5.bindDynamicAnchor$2$viewObject$1");
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
        C1C7U.LIZIZ("SearchLiveDynamicBottomAnchorAssem@a8c5.bindDynamicAnchor$2$viewObject$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ViewObjectWrapper> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

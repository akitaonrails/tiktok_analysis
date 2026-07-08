package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.feed.platform.performance.ScopePerformanceVM;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.performance.ScopePerformanceVMKt$lazyAbilityInternal$1$1$1", f = "ScopePerformanceVM.kt", l = {}, m = "invokeSuspend")
public final class C1566190qrJ extends C09AX implements Function2<InterfaceC1565950qqv, InterfaceC1364105Vn<? super Unit>, Object> {

    /* JADX INFO: Incorrect field signature: TR; */
    public final /* synthetic */ AbstractC738140SxQ LL;

    /* JADX INFO: Incorrect field signature: TR; */
    public final /* synthetic */ AbstractC738140SxQ LLILLJJLI;
    public final /* synthetic */ C630740Ooa<T> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TR;TR;LX/0Ooa<+TT;>;LX/05Vn<-LX/0qrJ;>;)V */
    public C1566190qrJ(AbstractC738140SxQ abstractC738140SxQ, AbstractC738140SxQ abstractC738140SxQ2, C630740Ooa c630740Ooa, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC738140SxQ;
        this.LLILLJJLI = abstractC738140SxQ2;
        this.LLILLL = c630740Ooa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1566190qrJ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScopePerformanceVMKt@2a47.lazyAbilityInternal$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Fragment fragmentLJI = ((InterfaceC1565950qqv) this.LL).getPanelContext().LJ;
        if (fragmentLJI != null || (fragmentLJI = C724240Sb0.LJI(this.LL)) != null) {
            ScopePerformanceVM scopePerformanceVM = (ScopePerformanceVM) new ViewModelProvider(fragmentLJI).get(ScopePerformanceVM.class);
            AbstractC738140SxQ abstractC738140SxQ = this.LLILLJJLI;
            Object obj2 = this.LLILLL;
            List arrayList = (List) ((ConcurrentHashMap) scopePerformanceVM.LL.getValue()).get(abstractC738140SxQ);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((ConcurrentHashMap) scopePerformanceVM.LL.getValue()).put(abstractC738140SxQ, arrayList);
            }
            arrayList.add(obj2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScopePerformanceVMKt@2a47.lazyAbilityInternal$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1565950qqv interfaceC1565950qqv, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1565950qqv, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Y4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercebase.monitor.PageMonitor$monitorPageNode$1", f = "PageMonitor.kt", l = {}, m = "invokeSuspend")
public final class C09Y4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ InterfaceC1748820vbs LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09Y4(LifecycleOwner lifecycleOwner, InterfaceC1748820vbs interfaceC1748820vbs, InterfaceC1364105Vn<? super C09Y4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC1748820vbs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09Y4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PageMonitor@3af1.monitorPageNode$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PageMonitor.LIZ.LIZ(this.LL, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PageMonitor@3af1.monitorPageNode$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

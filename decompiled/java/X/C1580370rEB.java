package X;

import com.ss.android.ugc.aweme.sidebar.components.SideBarRootVM;
import com.ss.android.ugc.aweme.sidebar.model.SideBarRootComponentConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS603S0100000_24;
import njp.a;

/* JADX INFO: renamed from: X.0rEB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sidebar.components.SideBarRootVM$refreshSection$1", f = "SideBarRootVM.kt", l = {92}, m = "invokeSuspend")
public final class C1580370rEB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SideBarRootVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1580370rEB(SideBarRootVM sideBarRootVM, String str, InterfaceC1364105Vn<? super C1580370rEB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sideBarRootVM;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1580370rEB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SideBarRootVM@3e71.refreshSection$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1580480rEM c1580480rEM = this.LLILLJJLI.LL;
            String str = this.LLILLL;
            this.LL = 1;
            obj = c1580480rEM.LIZIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SideBarRootVM@3e71.refreshSection$1");
                return objLJFF;
            }
        }
        SideBarRootComponentConfig sideBarRootComponentConfig = (SideBarRootComponentConfig) obj;
        if (sideBarRootComponentConfig != null) {
            this.LLILLJJLI.setState(new AwS603S0100000_24(sideBarRootComponentConfig, 280));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SideBarRootVM@3e71.refreshSection$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.sidebar.components.SideBarRootVM;
import com.ss.android.ugc.aweme.sidebar.model.SideBarRootComponentConfig;
import com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS603S0100000_24;
import njp.a;

/* JADX INFO: renamed from: X.0rED, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sidebar.components.SideBarRootVM$updateData$1", f = "SideBarRootVM.kt", l = {45}, m = "invokeSuspend")
public final class C1580390rED extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SideBarRootVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1580390rED(SideBarRootVM sideBarRootVM, InterfaceC1364105Vn<? super C1580390rED> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sideBarRootVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1580390rED(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        List<SideBarSectionComponentConfig> list;
        C1C7U.LIZ("SideBarRootVM@3e71.updateData$1");
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
            EnumC1580500rEO enumC1580500rEO = EnumC1580500rEO.USER_OPEN;
            this.LL = 1;
            obj = c1580480rEM.LIZ(enumC1580500rEO, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SideBarRootVM@3e71.updateData$1");
                return objLJFF;
            }
        }
        SideBarRootComponentConfig sideBarRootComponentConfig = (SideBarRootComponentConfig) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData: ");
        if (sideBarRootComponentConfig != null && (list = sideBarRootComponentConfig.sections) != null) {
            numLJ = C2286608xc.LJ(list.size());
        } else {
            numLJ = null;
        }
        sbLIZ.append(numLJ);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI.setState(new AwS603S0100000_24(sideBarRootComponentConfig, 281));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SideBarRootVM@3e71.updateData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

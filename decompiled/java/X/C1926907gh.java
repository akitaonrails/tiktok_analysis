package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.PolicyUpdateVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1926907gh extends C2217421BqW implements Function1<InterfaceC1873807Vo, Unit> {
    public C1926907gh(Object obj) {
        super(1, obj, PolicyUpdateVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/support/cells/PolicyUpdateCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1873807Vo interfaceC1873807Vo) {
        InterfaceC1873807Vo interfaceC1873807Vo2 = interfaceC1873807Vo;
        PolicyUpdateVM policyUpdateVM = (PolicyUpdateVM) this.receiver;
        policyUpdateVM.getClass();
        if (interfaceC1873807Vo2 instanceof C1873707Vn) {
            policyUpdateVM.vQ2(((C1873707Vn) interfaceC1873807Vo2).LIZ);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}

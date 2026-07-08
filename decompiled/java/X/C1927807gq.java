package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.FeedbackCellVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1927807gq extends C2217421BqW implements Function1<InterfaceC1873607Vm, Unit> {
    public C1927807gq(Object obj) {
        super(1, obj, FeedbackCellVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/support/cells/FeedbackCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1873607Vm interfaceC1873607Vm) {
        InterfaceC1873607Vm interfaceC1873607Vm2 = interfaceC1873607Vm;
        FeedbackCellVM feedbackCellVM = (FeedbackCellVM) this.receiver;
        feedbackCellVM.getClass();
        if (interfaceC1873607Vm2 instanceof C1873507Vl) {
            feedbackCellVM.vQ2(((C1873507Vl) interfaceC1873607Vm2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}

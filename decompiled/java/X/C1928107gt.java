package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.SupportCellVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1928107gt extends C2217421BqW implements Function1<InterfaceC1874407Vu, Unit> {
    public C1928107gt(Object obj) {
        super(1, obj, SupportCellVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/support/cells/SupportCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1874407Vu interfaceC1874407Vu) {
        InterfaceC1874407Vu interfaceC1874407Vu2 = interfaceC1874407Vu;
        SupportCellVM supportCellVM = (SupportCellVM) this.receiver;
        supportCellVM.getClass();
        if (interfaceC1874407Vu2 instanceof C1874307Vt) {
            supportCellVM.vQ2(((C1874307Vt) interfaceC1874407Vu2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}

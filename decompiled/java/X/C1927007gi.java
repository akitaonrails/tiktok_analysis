package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.AccountDeletionVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1927007gi extends C2217421BqW implements Function1<InterfaceC1873207Vi, Unit> {
    public C1927007gi(Object obj) {
        super(1, obj, AccountDeletionVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/support/cells/AccountDeletionCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1873207Vi interfaceC1873207Vi) {
        InterfaceC1873207Vi interfaceC1873207Vi2 = interfaceC1873207Vi;
        AccountDeletionVM accountDeletionVM = (AccountDeletionVM) this.receiver;
        accountDeletionVM.getClass();
        if (interfaceC1873207Vi2 instanceof C1873107Vh) {
            accountDeletionVM.vQ2(((C1873107Vh) interfaceC1873207Vi2).LIZ);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}

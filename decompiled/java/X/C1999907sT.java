package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.TiktokPlusVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07sT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1999907sT extends C2217421BqW implements Function1<InterfaceC1871007Um, Unit> {
    public C1999907sT(Object obj) {
        super(1, obj, TiktokPlusVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/account/cell/TiktokPlusCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1871007Um interfaceC1871007Um) {
        InterfaceC1871007Um interfaceC1871007Um2 = interfaceC1871007Um;
        this.receiver.getClass();
        if (interfaceC1871007Um2 instanceof C1870907Ul) {
            ComplianceServiceProvider.LJIILIIL().LJJIJL(((C1870907Ul) interfaceC1871007Um2).LIZ, "main_settings");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}

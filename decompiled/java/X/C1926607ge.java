package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.BetaCellVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1926607ge extends C2217421BqW implements Function1<InterfaceC1873407Vk, Unit> {
    public C1926607ge(Object obj) {
        super(1, obj, BetaCellVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/support/cells/BetaCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1873407Vk interfaceC1873407Vk) {
        InterfaceC1873407Vk interfaceC1873407Vk2 = interfaceC1873407Vk;
        BetaCellVM betaCellVM = (BetaCellVM) this.receiver;
        betaCellVM.getClass();
        if (interfaceC1873407Vk2 instanceof C1873307Vj) {
            betaCellVM.vQ2(((C1873307Vj) interfaceC1873407Vk2).LIZ);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}

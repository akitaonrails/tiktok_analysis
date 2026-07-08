package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.OneStopMainAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.vm.OneStopPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xUL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821030xUL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ OneStopMainAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821030xUL(OneStopMainAssem oneStopMainAssem) {
        super(0);
        this.LL = oneStopMainAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OneStopPageVM oneStopPageVMHp = this.LL.hp();
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJFF(new C517550KRl(oneStopPageVMHp.LLILLJJLI));
        }
        this.LL.hp().vQ2(false);
        return Unit.LIZ;
    }
}

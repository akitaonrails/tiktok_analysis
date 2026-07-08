package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ScI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725040ScI extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ InterfaceC725030ScH<RECEIVER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C725040ScI(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH) {
        super(0);
        this.LL = interfaceC725030ScH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ReusedAssem reusedAssem;
        C03H5 receiverForHostVM = this.LL.getReceiverForHostVM();
        return Boolean.valueOf((!(receiverForHostVM instanceof ReusedAssem) || (reusedAssem = (ReusedAssem) receiverForHostVM) == null) ? true : reusedAssem.LLILLJJLI);
    }
}

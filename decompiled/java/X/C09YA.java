package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09YA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09YA implements C01GW<InterfaceC736910SvR<Object>> {
    public InterfaceC736910SvR<Object> LL;
    public final /* synthetic */ Function0<InterfaceC736910SvR<Object>> LLILLJJLI;
    public final /* synthetic */ AssemViewModel<Object> LLILLL;

    @Override // X.C01GW
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.C01GW
    public final InterfaceC736910SvR<Object> getValue() {
        InterfaceC736910SvR<Object> interfaceC736910SvR = this.LL;
        if (interfaceC736910SvR != null) {
            return interfaceC736910SvR;
        }
        InterfaceC736910SvR<Object> interfaceC736910SvRInvoke = this.LLILLJJLI.invoke();
        AssemViewModel<Object> assemViewModel = this.LLILLL;
        InterfaceC736910SvR<Object> interfaceC736910SvR2 = interfaceC736910SvRInvoke;
        this.LL = interfaceC736910SvR2;
        assemViewModel.putCreatedRepository(interfaceC736910SvR2);
        return interfaceC736910SvR2;
    }

    public C09YA(AssemViewModel assemViewModel, Function0 function0) {
        this.LLILLJJLI = function0;
        this.LLILLL = assemViewModel;
    }
}

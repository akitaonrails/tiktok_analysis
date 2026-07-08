package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: renamed from: X.0Stc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735780Stc<S> extends C09AY implements Function1<S, S> {
    public final /* synthetic */ AssemViewModel<S> LL;
    public final /* synthetic */ Function1<S, S> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C735780Stc(AssemViewModel<S> assemViewModel, Function1<? super S, ? extends S> function1) {
        super(1);
        this.LL = assemViewModel;
        this.LLILLJJLI = function1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        try {
            Object objInvoke = new C735790Std(this.LLILLJJLI, (InterfaceC0148002o) obj).invoke();
            AssemViewModel<S> assemViewModel = this.LL;
            Function2<Object, ? super S, ? extends Object> function2 = assemViewModel.syncState2Item;
            if (function2 != 0 && (obj2 = assemViewModel._item) != null && assemViewModel.onItemChangeCallback != null) {
                assemViewModel._item = function2.invoke(obj2, (Object) objInvoke);
                Object obj3 = this.LL.onItemChangeCallback;
                C19719512Dh.LJ(1, obj3);
                ((Function1) obj3).invoke(this.LL._item);
            }
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("set a new state ");
                        sbLIZ.append(objInvoke);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        int i = C2187451AjH.LIZ;
                        interfaceC723720SaA.log("assem_vm", strLIZIZ);
                        return objInvoke;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return objInvoke;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (!C725080ScM.LIZ) {
                InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
                if (interfaceC723720SaA2 != null) {
                    interfaceC723720SaA2.LIZIZ("assem catch exception", new Exception(th2));
                }
                throw th2;
            }
            C786410Ut5.LJJZZIII(C724640Sbe.LIZ(), new RunnableC514801zW(th2, 19));
            throw th2;
        }
    }
}

package X;

import Y.AgS199S0200000_8;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lvi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.AILiveTaskHandler$initObserver$1", f = "AILiveTaskHandler.kt", l = {158}, m = "invokeSuspend")
public final class C558720Lvi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C558710Lvh LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C558720Lvi(C558710Lvh c558710Lvh, InterfaceC1364105Vn<? super C558720Lvi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c558710Lvh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C558720Lvi c558720Lvi = new C558720Lvi(this.LLILLL, interfaceC1364105Vn);
        c558720Lvi.LLILLJJLI = obj;
        return c558720Lvi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C581150Mqn c581150Mqn;
        InterfaceC346201Wa<List<C0LSZ>> interfaceC346201WaLJJJJLI;
        C1C7U.LIZ("AILiveTaskHandler@e060.initObserver$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("edit flow cancelled, ");
            sbLIZ.append(e);
            C559010LwB.LIZIZ("AILiveTaskHandler", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (C2296808zG.LJI(interfaceC497601wk) && !this.LLILLL.getEditModel().getAILivePhotoModel().pageDataCache.publishDialogShowing) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("observer, ");
                sbLIZ2.append(interfaceC497601wk.getCoroutineContext().get(C09AE.LJJLJ));
                C559010LwB.LIZIZ("AILiveTaskHandler", C2188811AlT.LIZIZ(sbLIZ2));
                ICreationAsyncTaskManager iCreationAsyncTaskManagerO2 = this.LLILLL.o2();
                if (iCreationAsyncTaskManagerO2 != null && (interfaceC346201WaLJJJJLI = iCreationAsyncTaskManagerO2.LJJJJLI(this.LLILLL.getEditModel().getCreationId())) != null) {
                    c581150Mqn = new C581150Mqn(interfaceC346201WaLJJJJLI, this.LLILLL, 3);
                } else {
                    c581150Mqn = null;
                }
                if (c581150Mqn != null) {
                    AgS199S0200000_8 agS199S0200000_8 = new AgS199S0200000_8(interfaceC497601wk, this.LLILLL, 12);
                    this.LL = 1;
                    if (c581150Mqn.collect(agS199S0200000_8, this) == objLJFF) {
                        C1C7U.LIZIZ("AILiveTaskHandler@e060.initObserver$1");
                        return objLJFF;
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AILiveTaskHandler@e060.initObserver$1");
                return unit;
            }
            this.LLILLL.kj2();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AILiveTaskHandler@e060.initObserver$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AILiveTaskHandler@e060.initObserver$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

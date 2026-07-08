package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0911, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.utils.GlobalAsyncTaskHandler$runUntilAsync$job$1", f = "GlobalAsyncTaskHandler.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 73}, m = "invokeSuspend")
public final class AnonymousClass0911 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0911(String str, InterfaceC1364105Vn<? super AnonymousClass0911> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0911 anonymousClass0911 = new AnonymousClass0911(this.LLILLL, interfaceC1364105Vn);
        anonymousClass0911.LLILLJJLI = obj;
        return anonymousClass0911;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final InterfaceC497601wk interfaceC497601wk;
        InterfaceC346201Wa<C0LSZ> interfaceC346201WaLJJJJL;
        C1C7U.LIZ("GlobalAsyncTaskHandler@3a85.runUntilAsync$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GlobalAsyncTaskHandler@3a85.runUntilAsync$job$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            ICreationAsyncTaskManager iCreationAsyncTaskManager = (ICreationAsyncTaskManager) AnonymousClass0913.LIZJ.getValue();
            if (iCreationAsyncTaskManager != null) {
                List listSingletonList = Collections.singletonList(this.LLILLL);
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                if (iCreationAsyncTaskManager.LJIJI("GlobalAsyncTaskHandler", listSingletonList, this) == objLJFF) {
                    C1C7U.LIZIZ("GlobalAsyncTaskHandler@3a85.runUntilAsync$job$1");
                    return objLJFF;
                }
            }
        }
        ICreationAsyncTaskManager iCreationAsyncTaskManager2 = (ICreationAsyncTaskManager) AnonymousClass0913.LIZJ.getValue();
        if (iCreationAsyncTaskManager2 != null && (interfaceC346201WaLJJJJL = iCreationAsyncTaskManager2.LJJJJL(this.LLILLL)) != null) {
            final String str = this.LLILLL;
            InterfaceC346701Wf<? super C0LSZ> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0912
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    ICreationAsyncTaskManager iCreationAsyncTaskManager3;
                    C0LSZ c0lsz = (C0LSZ) obj2;
                    if (c0lsz == null) {
                        C2296808zG.LIZJ(interfaceC497601wk, null);
                        return Unit.LIZ;
                    }
                    if (C381270ExB.LIZ(c0lsz.LJFF)) {
                        ConcurrentHashMap<String, C13M7<String>> concurrentHashMap = AnonymousClass0913.LJI;
                        ArrayList arrayList = new ArrayList();
                        Iterator<Map.Entry<String, C13M7<String>>> it2 = concurrentHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            C19719612Di.LJJI(it2.next().getValue(), arrayList);
                        }
                        if (!arrayList.contains(c0lsz.LIZ) && (iCreationAsyncTaskManager3 = (ICreationAsyncTaskManager) AnonymousClass0913.LIZJ.getValue()) != null) {
                            iCreationAsyncTaskManager3.LJII(str);
                        }
                        AnonymousClass0913.LJ.remove(str);
                        C2296808zG.LIZJ(interfaceC497601wk, null);
                    }
                    return Unit.LIZ;
                }
            };
            this.LLILLJJLI = null;
            this.LL = 2;
            if (interfaceC346201WaLJJJJL.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("GlobalAsyncTaskHandler@3a85.runUntilAsync$job$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GlobalAsyncTaskHandler@3a85.runUntilAsync$job$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

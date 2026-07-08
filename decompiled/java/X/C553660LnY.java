package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl;
import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationServiceImpl$registerWorkflowWithScene$2", f = "AIGCWorkflowCreationServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C553660LnY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public final /* synthetic */ AIGCWorkflowCreationServiceImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553660LnY(AIGCWorkflowCreationServiceImpl aIGCWorkflowCreationServiceImpl, String str, String str2, InterfaceC1364105Vn<? super C553660LnY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIGCWorkflowCreationServiceImpl;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553660LnY(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        InterfaceC553510LnJ interfaceC553510LnJLIZ;
        Set<String> setPutIfAbsent;
        C1C7U.LIZ("AIGCWorkflowCreationServiceImpl@b066.registerWorkflowWithScene$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ConcurrentHashMap<String, Set<String>> concurrentHashMap = this.LL.LIZJ;
        String str = this.LLILLJJLI;
        Set<String> linkedHashSet = concurrentHashMap.get(str);
        if (linkedHashSet == null && (setPutIfAbsent = concurrentHashMap.putIfAbsent(str, (linkedHashSet = new LinkedHashSet<>()))) != null) {
            linkedHashSet = setPutIfAbsent;
        }
        linkedHashSet.add(this.LLILLL);
        C470601sO c470601sO = C470601sO.LIZ;
        AIGCWorkflowCreationServiceImpl aIGCWorkflowCreationServiceImpl = this.LL;
        String str2 = this.LLILLL;
        String str3 = this.LLILLJJLI;
        try {
            AIGCWorkflowManagementApi aIGCWorkflowManagementApi = aIGCWorkflowCreationServiceImpl.LIZ;
            c098200Yq = null;
            if (aIGCWorkflowManagementApi != null && (interfaceC553510LnJLIZ = C553670LnZ.LIZ(aIGCWorkflowManagementApi)) != null) {
                interfaceC553510LnJLIZ.LIZLLL(str2, str3, false);
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof CancellationException)) {
                c470601sO.getClass();
                C470601sO.LIZ(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                throw th;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("AIGCWorkflowCreationServiceImpl@b066.registerWorkflowWithScene$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

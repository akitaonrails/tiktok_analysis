package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationKvManager$batchGetString$$inlined$scopedIO$1", f = "DefaultConversationKvManager.kt", l = {}, m = "invokeSuspend")
public final class C865760Xxm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Map<String, Map<String, String>>>>, Object> {
    public final /* synthetic */ C865770Xxn LL;
    public final /* synthetic */ List LLILLJJLI;
    public final /* synthetic */ List LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865760Xxm(InterfaceC1364105Vn interfaceC1364105Vn, C865770Xxn c865770Xxn, List list, List list2) {
        super(2, interfaceC1364105Vn);
        this.LL = c865770Xxn;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865760Xxm(interfaceC1364105Vn, this.LL, this.LLILLJJLI, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Map<String, Map<String, String>>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("DefaultConversationKvManager@9ea8.batchGetString$$inlined$scopedIO$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            c098200Yq = C865670Xxd.LIZJ(this.LL.LIZ.invoke().LLIL(this.LLILLJJLI, this.LLILLL));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            this.LL.getClass();
            c098200Yq = C865670Xxd.LIZIZ(C865770Xxn.LJFF("batchGetString", thM5exceptionOrNullimpl));
        }
        C1C7U.LIZIZ("DefaultConversationKvManager@9ea8.batchGetString$$inlined$scopedIO$1");
        return c098200Yq;
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationKvManager$batchUpsertMultiple$$inlined$scopedIO$1", f = "DefaultConversationKvManager.kt", l = {}, m = "invokeSuspend")
public final class C865710Xxh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Boolean>>, Object> {
    public final /* synthetic */ C865770Xxn LL;
    public final /* synthetic */ Map LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865710Xxh(InterfaceC1364105Vn interfaceC1364105Vn, C865770Xxn c865770Xxn, Map map) {
        super(2, interfaceC1364105Vn);
        this.LL = c865770Xxn;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865710Xxh(interfaceC1364105Vn, this.LL, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("DefaultConversationKvManager@9ea8.batchUpsertMultiple$$inlined$scopedIO$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            InterfaceC865750Xxl interfaceC865750XxlInvoke = this.LL.LIZ.invoke();
            Map map = this.LLILLJJLI;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Object obj2 : map.entrySet()) {
                Object key = ((Map.Entry) obj2).getKey();
                Map map2 = (Map) ((Map.Entry) obj2).getValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                for (Object obj3 : map2.entrySet()) {
                    linkedHashMap2.put(((Map.Entry) obj3).getKey(), C865770Xxn.LJII((InterfaceC865840Xxu) ((Map.Entry) obj3).getValue()));
                }
                linkedHashMap.put(key, linkedHashMap2);
            }
            c098200Yq = C865670Xxd.LIZJ(Boolean.valueOf(interfaceC865750XxlInvoke.LLJL(linkedHashMap)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            this.LL.getClass();
            c098200Yq = C865670Xxd.LIZIZ(C865770Xxn.LJI("batchUpsertMultiple", thM5exceptionOrNullimpl));
        }
        C1C7U.LIZIZ("DefaultConversationKvManager@9ea8.batchUpsertMultiple$$inlined$scopedIO$1");
        return c098200Yq;
    }
}

package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.story.MessageRequestStoryAggregationSource$notifyStoryReactionsConvUpdate$1", f = "MessageRequestStoryAggregationSource.kt", l = {}, m = "invokeSuspend")
public final class C2194908ip extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C878880Ydq LL;
    public final /* synthetic */ Map<String, C0Y9G> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2194908ip(C878880Ydq c878880Ydq, Map<String, C0Y9G> map, InterfaceC1364105Vn<? super C2194908ip> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c878880Ydq;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2194908ip(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestStoryAggregationSource@b8bb.notifyStoryReactionsConvUpdate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLLIIII = C13LP.LLIIII(this.LLILLJJLI.keySet());
        for (InterfaceC2195108ir interfaceC2195108ir : this.LL.LJ) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ((String) it2.next());
                if (c0y8tLIZ != null) {
                    arrayList.add(c0y8tLIZ);
                }
            }
            interfaceC2195108ir.LIZIZ(arrayList);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestStoryAggregationSource@b8bb.notifyStoryReactionsConvUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

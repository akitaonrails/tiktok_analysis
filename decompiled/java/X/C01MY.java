package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01MY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.innerskylight.FollowingInnerContainerMonitor$monitorPerUser$1", f = "FollowingInnerContainerMonitor.kt", l = {}, m = "invokeSuspend")
public final class C01MY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1588970rS3 LL;
    public final /* synthetic */ Function1<String, Integer> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01MY(C1588970rS3 c1588970rS3, Function1<? super String, Integer> function1, InterfaceC1364105Vn<? super C01MY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1588970rS3;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01MY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingInnerContainerMonitor@d2cb.monitorPerUser$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1588970rS3 c1588970rS3 = this.LL;
        HashMap<String, Set<String>> map = c1588970rS3.LIZIZ;
        Function1<String, Integer> function1 = this.LLILLJJLI;
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            int size = entry.getValue().size();
            if (size > 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("count", String.valueOf(size));
                linkedHashMap.put("index", String.valueOf(c1588970rS3.LIZJ.get(key)));
                linkedHashMap.put("server_count", String.valueOf(function1.invoke(key).intValue()));
                C20684815ws.LJIILLIIL("follow_inner_feed_consumer", linkedHashMap);
            }
        }
        this.LL.LIZIZ.clear();
        this.LL.LIZJ.clear();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingInnerContainerMonitor@d2cb.monitorPerUser$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl$deleteOlderThan$2", f = "LiveRecordingsDatabaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C533590KwH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C533710KwT>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LiveRecordingsDatabaseImpl LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533590KwH(LiveRecordingsDatabaseImpl liveRecordingsDatabaseImpl, long j, InterfaceC1364105Vn<? super C533590KwH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveRecordingsDatabaseImpl;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533590KwH c533590KwH = new C533590KwH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c533590KwH.LL = obj;
        return c533590KwH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsDatabaseImpl@52f0.deleteOlderThan$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        ConcurrentHashMap<Long, C533710KwT> concurrentHashMap = this.LLILLJJLI.LIZJ;
        long j = this.LLILLL;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Long, C533710KwT>> it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Long, C533710KwT> next = it2.next();
            if (next.getValue().LIZIZ < j) {
                arrayList.add(next.getValue());
                it2.remove();
            }
        }
        ConcurrentHashMap<String, String> concurrentHashMap2 = C2400609au.LIZLLL;
        concurrentHashMap2.clear();
        ConcurrentHashMap<Long, C533710KwT> concurrentHashMap3 = this.LLILLJJLI.LIZJ;
        ArrayList arrayList2 = new ArrayList(concurrentHashMap3.size());
        for (Map.Entry<Long, C533710KwT> entry : concurrentHashMap3.entrySet()) {
            arrayList2.add(new Pair(String.valueOf(entry.getKey().longValue()), entry.getValue().LIZJ));
        }
        C2097608Jq.LJIILJJIL(arrayList2, concurrentHashMap2);
        C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ.plus(C2296908zH.LIZ()), null, new C533600KwI(this.LLILLJJLI, this.LLILLL, null), 2);
        C1C7U.LIZIZ("LiveRecordingsDatabaseImpl@52f0.deleteOlderThan$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C533710KwT>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

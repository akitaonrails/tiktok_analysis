package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl$clearAll$2", f = "LiveRecordingsDatabaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C533560KwE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C533710KwT>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LiveRecordingsDatabaseImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533560KwE(LiveRecordingsDatabaseImpl liveRecordingsDatabaseImpl, InterfaceC1364105Vn<? super C533560KwE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveRecordingsDatabaseImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533560KwE c533560KwE = new C533560KwE(this.LLILLJJLI, interfaceC1364105Vn);
        c533560KwE.LL = obj;
        return c533560KwE;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsDatabaseImpl@52f0.clearAll$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        ConcurrentHashMap<Long, C533710KwT> concurrentHashMap = this.LLILLJJLI.LIZJ;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<Long, C533710KwT>> it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getValue());
        }
        this.LLILLJJLI.LIZJ.clear();
        C2400609au.LIZLLL.clear();
        C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ.plus(C2296908zH.LIZ()), null, new C533570KwF(this.LLILLJJLI, null), 2);
        C1C7U.LIZIZ("LiveRecordingsDatabaseImpl@52f0.clearAll$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C533710KwT>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

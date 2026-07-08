package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRoomDatabaseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl$deleteOlderThan$2$2", f = "LiveRecordingsDatabaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C533600KwI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveRecordingsDatabaseImpl LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533600KwI(LiveRecordingsDatabaseImpl liveRecordingsDatabaseImpl, long j, InterfaceC1364105Vn<? super C533600KwI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveRecordingsDatabaseImpl;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C533600KwI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        Object c098200Yq;
        C1C7U.LIZ("LiveRecordingsDatabaseImpl@52f0.deleteOlderThan$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        LiveRecordingsRoomDatabaseAdapter liveRecordingsRoomDatabaseAdapterLIZIZ = LiveRecordingsDatabaseImpl.LIZIZ();
        long j = this.LLILLJJLI;
        synchronized (liveRecordingsRoomDatabaseAdapterLIZIZ) {
            list = null;
            try {
                if (LiveRecordingsRoomDatabaseAdapter.LLILLJJLI != null) {
                    c098200Yq = liveRecordingsRoomDatabaseAdapterLIZIZ.LIZIZ().LIZIZ(j);
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            List list2 = (List) c098200Yq;
            if (list2 != null) {
                list = list2;
            }
        }
        this.LL.getClass();
        LiveRecordingsDatabaseImpl.LIZIZ().LIZ(this.LLILLJJLI);
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C533710KwT) it2.next()).LIZJ);
            }
            this.LL.LIZJ(arrayList);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRecordingsDatabaseImpl@52f0.deleteOlderThan$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

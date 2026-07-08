package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRoomDatabaseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl$clearAll$2$1", f = "LiveRecordingsDatabaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C533570KwF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveRecordingsDatabaseImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533570KwF(LiveRecordingsDatabaseImpl liveRecordingsDatabaseImpl, InterfaceC1364105Vn<? super C533570KwF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveRecordingsDatabaseImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C533570KwF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int iClearAll;
        C1C7U.LIZ("LiveRecordingsDatabaseImpl@52f0.clearAll$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        LiveRecordingsRoomDatabaseAdapter liveRecordingsRoomDatabaseAdapterLIZIZ = LiveRecordingsDatabaseImpl.LIZIZ();
        synchronized (liveRecordingsRoomDatabaseAdapterLIZIZ) {
            try {
                if (LiveRecordingsRoomDatabaseAdapter.LLILLJJLI != null) {
                    iClearAll = liveRecordingsRoomDatabaseAdapterLIZIZ.LIZIZ().clearAll();
                } else {
                    iClearAll = 0;
                }
                c098200Yq = Integer.valueOf(iClearAll);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            if (num != null) {
                num.intValue();
            }
        }
        this.LL.LIZJ(Collections.singletonList(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.LIVE_RECORDINGS, "", false).getAbsolutePath()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRecordingsDatabaseImpl@52f0.clearAll$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

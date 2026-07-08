package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsRoomDatabaseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KwL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsDatabaseImpl$release$2$1", f = "LiveRecordingsDatabaseImpl.kt", l = {}, m = "invokeSuspend")
public final class C533630KwL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveRecordingsDatabaseImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533630KwL(LiveRecordingsDatabaseImpl liveRecordingsDatabaseImpl, InterfaceC1364105Vn<? super C533630KwL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveRecordingsDatabaseImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C533630KwL(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveRecordingsDatabaseImpl@52f0.release$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        synchronized (LiveRecordingsDatabaseImpl.LIZIZ()) {
            try {
                LiveRecordingsRoomDatabaseAdapter liveRecordingsRoomDatabaseAdapter = LiveRecordingsRoomDatabaseAdapter.LLILLJJLI;
                if (liveRecordingsRoomDatabaseAdapter != null) {
                    liveRecordingsRoomDatabaseAdapter.close();
                }
                LiveRecordingsRoomDatabaseAdapter.LLILLJJLI = null;
                LiveRecordingsRoomDatabaseAdapter.LLILLL = null;
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveRecordingsDatabaseImpl@52f0.release$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

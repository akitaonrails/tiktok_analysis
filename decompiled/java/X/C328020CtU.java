package X;

import com.bytedance.android.livesdk.api.BroadcastRoomApiKt;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.LiveTryModeUseTTLHSplitSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: renamed from: X.0CtU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.speedtest.PreScheduleRequest$requestAsync$2$1", f = "PreScheduleRequest.kt", l = {175}, m = "invokeSuspend")
public final class C328020CtU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C328040CtW>, Object> {
    public boolean LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C327950CtN LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328020CtU(C327950CtN c327950CtN, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = z;
        this.LLILZLL = c327950CtN;
        this.LLIZ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C328020CtU c328020CtU = new C328020CtU(this.LLILZLL, interfaceC1364105Vn, this.LLILZIL, this.LLIZ);
        c328020CtU.LLILZ = obj;
        return c328020CtU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean z;
        C327950CtN c327950CtN;
        boolean z2;
        long j;
        PreScheduleStream preScheduleStream;
        C328040CtW c328040CtW;
        C1C7U.LIZ("PreScheduleRequest@d280.requestAsync$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        String str = "";
        try {
            if (i != 0) {
                if (i == 1) {
                    z2 = this.LLILLJJLI;
                    z = this.LL;
                    c327950CtN = (C327950CtN) this.LLILZ;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                z = this.LLILZIL;
                c327950CtN = this.LLILZLL;
                z2 = this.LLIZ;
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                BroadcastRoomApiKt broadcastRoomApiKtLIZIZ = C01QD.LIZ().LIZIZ();
                if (LiveTryModeUseTTLHSplitSetting.INSTANCE.enable()) {
                    j = 1;
                } else {
                    j = 0;
                }
                this.LLILZ = c327950CtN;
                this.LL = z;
                this.LLILLJJLI = z2;
                this.LLILLL = 1;
                obj = broadcastRoomApiKtLIZIZ.preScheduleStream(j, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PreScheduleRequest@d280.requestAsync$2$1");
                    return objLJFF;
                }
            }
            C470590Icr c470590Icr = (C470590Icr) obj;
            if (c470590Icr != null) {
                preScheduleStream = (PreScheduleStream) c470590Icr.data;
            } else {
                preScheduleStream = null;
            }
            if (preScheduleStream != null) {
                C20441214yg.LIZIZ("PreScheduleRequest", "requestAsync");
                String str2 = c470590Icr.LIZIZ;
                if (str2 == null) {
                    str2 = "";
                }
                C328040CtW c328040CtW2 = new C328040CtW(preScheduleStream, str2, 0);
                if (z) {
                    c327950CtN.getClass();
                    C20441214yg.LIZIZ("PreScheduleRequest", "storeMemoryCacheData");
                    C327950CtN.LJII.put(Long.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()), c328040CtW2);
                }
                if (z2) {
                    c327950CtN.getClass();
                    C20441214yg.LIZIZ("PreScheduleRequest", "storeFileCacheData");
                    C2355009Kq.LJIILLIIL(preScheduleStream, "live_pre_schedule_stream_response");
                }
                c327950CtN.LIZIZ = c328040CtW2;
                c328040CtW = c328040CtW2;
            } else {
                C328040CtW c328040CtW3 = new C328040CtW(null, "", -1);
                c327950CtN.LIZIZ = c328040CtW3;
                c328040CtW = c328040CtW3;
            }
            C189200o6.m2constructorimpl(c328040CtW);
            obj2 = c328040CtW;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        C327950CtN c327950CtN2 = this.LLILZLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj2);
        Object obj3 = obj2;
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof C501470JlZ) {
                C501470JlZ c501470JlZ = (C501470JlZ) thM5exceptionOrNullimpl;
                String logId = c501470JlZ.getLogId();
                if (logId != null) {
                    str = logId;
                }
                C328040CtW c328040CtW4 = new C328040CtW(null, str, c501470JlZ.getErrorCode());
                c327950CtN2.LIZIZ = c328040CtW4;
                obj3 = c328040CtW4;
            } else if (thM5exceptionOrNullimpl instanceof C1811850xFX) {
                C328040CtW c328040CtW5 = new C328040CtW(null, "", ((C1811850xFX) thM5exceptionOrNullimpl).getCronetError());
                c327950CtN2.LIZIZ = c328040CtW5;
                obj3 = c328040CtW5;
            } else {
                C328040CtW c328040CtW6 = new C328040CtW(null, "", -1);
                c327950CtN2.LIZIZ = c328040CtW6;
                obj3 = c328040CtW6;
            }
        }
        C1C7U.LIZIZ("PreScheduleRequest@d280.requestAsync$2$1");
        return obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C328040CtW> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

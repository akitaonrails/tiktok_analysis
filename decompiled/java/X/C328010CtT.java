package X;

import com.bytedance.android.livesdk.game.broadcast.stream.quality.preschedule.api.GamePreScheduleApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: renamed from: X.0CtT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.stream.quality.preschedule.GamePreScheduleRequest$requestAsync$2$1", f = "GamePreScheduleRequest.kt", l = {85}, m = "invokeSuspend")
public final class C328010CtT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C783680Uog>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C328010CtT(InterfaceC1364105Vn<? super C328010CtT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C328010CtT c328010CtT = new C328010CtT(interfaceC1364105Vn);
        c328010CtT.LLILLJJLI = obj;
        return c328010CtT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        PreScheduleStream preScheduleStream;
        C1C7U.LIZ("GamePreScheduleRequest@966d.requestAsync$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = "";
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C480460Ism.LIZ().getClass();
                GamePreScheduleApi gamePreScheduleApi = (GamePreScheduleApi) C480460Ism.LIZLLL(GamePreScheduleApi.class);
                this.LL = 1;
                obj = gamePreScheduleApi.preScheduleStream(4L, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GamePreScheduleRequest@966d.requestAsync$2$1");
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
                String str2 = c470590Icr.LIZIZ;
                if (str2 == null) {
                    str2 = "";
                }
                c098200Yq = new C783680Uog(preScheduleStream, str2, 0);
            } else {
                c098200Yq = new C783680Uog(null, "", -1);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof C501470JlZ) {
                C501470JlZ c501470JlZ = (C501470JlZ) thM5exceptionOrNullimpl;
                String logId = c501470JlZ.getLogId();
                if (logId != null) {
                    str = logId;
                }
                c098200Yq = new C783680Uog(null, str, c501470JlZ.getErrorCode());
            } else if (thM5exceptionOrNullimpl instanceof C1811850xFX) {
                c098200Yq = new C783680Uog(null, "", ((C1811850xFX) thM5exceptionOrNullimpl).getCronetError());
            } else {
                c098200Yq = new C783680Uog(null, "", -1);
            }
        }
        C1C7U.LIZIZ("GamePreScheduleRequest@966d.requestAsync$2$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C783680Uog> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

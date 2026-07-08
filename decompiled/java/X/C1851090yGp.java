package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.api.LogTaskEventApi;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data.LogTaskEventRequest;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.data.TaskEvent;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.taskcard.FeedTaskCard$reportFeedTaskCardEvent$1", f = "FeedTaskCard.kt", l = {239}, m = "invokeSuspend")
public final class C1851090yGp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C183V LLILLJJLI;
    public final /* synthetic */ EnumC1779100wOi LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1851090yGp(C183V c183v, EnumC1779100wOi enumC1779100wOi, InterfaceC1364105Vn<? super C1851090yGp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c183v;
        this.LLILLL = enumC1779100wOi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1851090yGp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedTaskCard@49d7.reportFeedTaskCardEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C183V c183v = this.LLILLJJLI;
                EnumC1779100wOi enumC1779100wOi = this.LLILLL;
                c183v.getClass();
                String str = c183v.LLILZ;
                if (str == null) {
                    str = "";
                }
                LogTaskEventRequest logTaskEventRequest = new LogTaskEventRequest(Collections.singletonList(new TaskEvent(str, Integer.valueOf(enumC1779100wOi.getValue()), Integer.valueOf(EnumC035100Aj.FYP_LIVE.getValue()), c183v.LLILZIL)));
                C1851100yGq c1851100yGq = LogTaskEventApi.LIZ;
                this.LL = 1;
                c1851100yGq.getClass();
                obj = ((LogTaskEventApi) C0NSL.LIZ().create(LogTaskEventApi.class)).reportFeedTaskCardUserAction(logTaskEventRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("FeedTaskCard@49d7.reportFeedTaskCardEvent$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            String message = e.getMessage();
            c2341109Fh.getClass();
            C2341109Fh.LIZJ(message);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedTaskCard@49d7.reportFeedTaskCardEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

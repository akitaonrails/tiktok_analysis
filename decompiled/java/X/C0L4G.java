package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.EventStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L4G, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.liveevent.LiveEventOuterService$startStoryEditFromLiveEvent$1", f = "LiveEventOuterService.kt", l = {286, 287}, m = "invokeSuspend")
public final class C0L4G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EventStruct LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L4G(EventStruct eventStruct, Context context, InterfaceC1364105Vn<? super C0L4G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = eventStruct;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L4G(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEventOuterService@2504.startStoryEditFromLiveEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveEventOuterService@2504.startStoryEditFromLiveEvent$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C567020MLs c567020MLs = C567020MLs.LIZ;
            EventStruct eventStruct = this.LLILLJJLI;
            this.LL = 1;
            obj = c567020MLs.LIZ(eventStruct, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveEventOuterService@2504.startStoryEditFromLiveEvent$1");
                return objLJFF;
            }
        }
        Intent intent = (Intent) obj;
        if (intent == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("LiveEventOuterService@2504.startStoryEditFromLiveEvent$1");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C0L4F c0l4f = new C0L4F(this.LLILLL, intent, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c0l4f) == objLJFF) {
            C1C7U.LIZIZ("LiveEventOuterService@2504.startStoryEditFromLiveEvent$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("LiveEventOuterService@2504.startStoryEditFromLiveEvent$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

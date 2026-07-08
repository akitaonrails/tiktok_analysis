package X;

import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedMonitorImpl;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedMonitorImpl$startTask$1$1", f = "LandscapeFeedMonitorImpl.kt", l = {279}, m = "invokeSuspend")
public final class C1566560qru extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ C1569250qwF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566560qru(Long l, C1569250qwF c1569250qwF, InterfaceC1364105Vn<? super C1566560qru> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l;
        this.LLILLL = c1569250qwF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1566560qru(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandscapeFeedMonitorImpl@bc38.startTask$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long jLongValue = this.LLILLJJLI.longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("LandscapeFeedMonitorImpl@bc38.startTask$1$1");
                return objLJFF;
            }
        }
        C1569250qwF c1569250qwF = (C1569250qwF) ((LinkedHashMap) LandscapeFeedMonitorImpl.LJI).get(this.LLILLL.LIZ);
        if (c1569250qwF != null) {
            C1561780qkC.LIZ(new C1569240qwE(c1569250qwF, "time_out"));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LandscapeFeedMonitorImpl@bc38.startTask$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

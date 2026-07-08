package X;

import com.tiktok.ssc.event.SSCEvent;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05EK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.ssc.event.SSCEventCenter$postEvent$1$1", f = "SSCEventCenter.kt", l = {}, m = "invokeSuspend")
public final class C05EK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05EN LL;
    public final /* synthetic */ SSCEvent LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05EK(C05EN c05en, SSCEvent sSCEvent, String str, InterfaceC1364105Vn<? super C05EK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05en;
        this.LLILLJJLI = sSCEvent;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05EK(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SSCEventCenter@e397.postEvent$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LL.onEvent(this.LLILLJJLI);
        if (this.LL.LLILZ) {
            ConcurrentHashMap<String, C05EN> concurrentHashMap = C05EO.LIZ;
            C23250099c.LIZLLL(C05EO.LIZIZ, null, null, new C05EJ(this.LLILLL, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SSCEventCenter@e397.postEvent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.linkcore.tracker.TrackerImpl$realSendEvent$proxySender$1$doLogSend$1$1", f = "TrackerImpl.kt", l = {241}, m = "invokeSuspend")
public final class C315060CWq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;
    public final /* synthetic */ C945340ahw LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC315080CWs LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315060CWq(InterfaceC315080CWs interfaceC315080CWs, C945340ahw c945340ahw, String str, String str2, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
        this.LLILLL = c945340ahw;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = interfaceC315080CWs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        Map<String, String> map = this.LLILLJJLI;
        return new C315060CWq(this.LLILZLL, this.LLILLL, this.LLILZ, this.LLILZIL, map, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TrackerImpl@989c.realSendEvent$proxySender$1$doLogSend$1$1");
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
            C945340ahw c945340ahw = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            InterfaceC315080CWs interfaceC315080CWs = this.LLILZLL;
            Map<String, String> map = this.LLILLJJLI;
            this.LL = 1;
            if (C1304610k3P.LJ(interfaceC315080CWs, c945340ahw, str, str2, map, this) == objLJFF) {
                C1C7U.LIZIZ("TrackerImpl@989c.realSendEvent$proxySender$1$doLogSend$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TrackerImpl@989c.realSendEvent$proxySender$1$doLogSend$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

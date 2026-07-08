package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NJL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.ugen.handler.OneBigThreeSmallRenderDataBuilder$preloadSnapshotsAsync$1$1$1", f = "UgenOneBigThreeSmallRenderDataBuilder.kt", l = {}, m = "invokeSuspend")
public final class C0NJL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1015550cXB LL;
    public final /* synthetic */ JSONObject LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ ConcurrentHashMap<Integer, C1020840cfi> LLILZIL;
    public final /* synthetic */ ConcurrentHashMap<Integer, C09AE> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJL(C1015550cXB c1015550cXB, JSONObject jSONObject, JSONObject jSONObject2, int i, ConcurrentHashMap<Integer, C1020840cfi> concurrentHashMap, ConcurrentHashMap<Integer, C09AE> concurrentHashMap2, InterfaceC1364105Vn<? super C0NJL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1015550cXB;
        this.LLILLJJLI = jSONObject;
        this.LLILLL = jSONObject2;
        this.LLILZ = i;
        this.LLILZIL = concurrentHashMap;
        this.LLILZLL = concurrentHashMap2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NJL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OneBigThreeSmallRenderDataBuilder@f4f2.preloadSnapshotsAsync$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        System.currentTimeMillis();
        try {
            C1020900cfo c1020900cfo = C1020900cfo.LIZ;
            C1015550cXB c1015550cXB = this.LL;
            JSONObject jSONObject = this.LLILLJJLI;
            JSONObject jSONObject2 = this.LLILLL;
            int i = this.LLILZ;
            c1020900cfo.getClass();
            this.LLILZIL.putIfAbsent(C2286608xc.LJ(this.LLILZ), C1020900cfo.LIZJ(c1015550cXB, jSONObject, jSONObject2, i, false, false));
            this.LLILZLL.remove(C2286608xc.LJ(this.LLILZ));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OneBigThreeSmallRenderDataBuilder@f4f2.preloadSnapshotsAsync$1$1$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZLL.remove(C2286608xc.LJ(this.LLILZ));
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

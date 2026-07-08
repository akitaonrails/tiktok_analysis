package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS557S0100000_13;
import njp.a;

/* JADX INFO: renamed from: X.0Vmx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cache.core.BaseCacheManager$initialize$1", f = "BaseCacheManager.kt", l = {123}, m = "invokeSuspend")
public final class C808090Vmx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C808140Vn2<Object, Object> LLILLJJLI;
    public final /* synthetic */ Set<String> LLILLL;
    public final /* synthetic */ Function1<Map<Object, Object>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C808090Vmx(C808140Vn2<Object, Object> c808140Vn2, Set<String> set, Function1<? super Map<Object, Object>, Unit> function1, InterfaceC1364105Vn<? super C808090Vmx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c808140Vn2;
        this.LLILLL = set;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C808090Vmx(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<? extends Object, ? extends Object> mapLJ;
        C1C7U.LIZ("BaseCacheManager@1c16.initialize$1");
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
                InterfaceC808120Vn0<Object, Object> interfaceC808120Vn0 = this.LLILLJJLI.LIZ;
                Set<String> set = this.LLILLL;
                this.LL = 1;
                obj = interfaceC808120Vn0.LIZLLL(set, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaseCacheManager@1c16.initialize$1");
                    return objLJFF;
                }
            }
            mapLJ = (Map) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            InterfaceC808100Vmy interfaceC808100Vmy = this.LLILLJJLI.LIZIZ.LJ;
            if (interfaceC808100Vmy != null) {
                new AwS557S0100000_13(th, 151);
                interfaceC808100Vmy.e();
            }
            mapLJ = C2097608Jq.LJ();
        }
        this.LLILLJJLI.LJ.putAll(mapLJ);
        Function1<Map<Object, Object>, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(mapLJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCacheManager@1c16.initialize$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

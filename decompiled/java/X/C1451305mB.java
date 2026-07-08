package X;

import Y.AObjectS97S0400000_2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05mB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1451305mB extends C2217421BqW implements Function2<Boolean, Function1<Object, ? extends Unit>, Function0<? extends Unit>> {
    public final /* synthetic */ C1451205mA LL;
    public final /* synthetic */ C259800zU<Object> LLILLJJLI;
    public final /* synthetic */ C259800zU<List<Function1<Object, Unit>>> LLILLL;
    public final /* synthetic */ C259800zU<List<Function1<Object, Unit>>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1451305mB(C1451205mA c1451205mA, C259800zU<Object> c259800zU, C259800zU<List<Function1<Object, Unit>>> c259800zU2, C259800zU<List<Function1<Object, Unit>>> c259800zU3) {
        super(2, C1449605lu.class, "subscribe", "createReduxStore$subscribe(Lcom/tiktok/kmp/fcp/slotstrategy/core/PlatformLock;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;ZLkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", 0);
        this.LL = c1451205mA;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = c259800zU3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    public final Function0<? extends Unit> invoke(Boolean bool, Function1<Object, ? extends Unit> function1) {
        boolean zBooleanValue = bool.booleanValue();
        Function1<Object, ? extends Unit> function12 = function1;
        C1451205mA c1451205mA = this.LL;
        C259800zU<Object> c259800zU = this.LLILLJJLI;
        C259800zU<List<Function1<Object, Unit>>> c259800zU2 = this.LLILLL;
        C259800zU<List<Function1<Object, Unit>>> c259800zU3 = this.LLILZ;
        synchronized (c1451205mA.LIZ) {
            try {
                List<Function1<Object, Unit>> list = c259800zU2.element;
                List<Function1<Object, Unit>> list2 = c259800zU3.element;
                if (list == list2) {
                    c259800zU2.element = new ArrayList(list2);
                }
                c259800zU2.element.add(function12);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (zBooleanValue) {
            function12.invoke(c259800zU.element);
        }
        return new AObjectS97S0400000_2(c1451205mA, c259800zU2, function12, c259800zU3, 3);
    }
}

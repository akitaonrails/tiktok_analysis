package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05mi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1454605mi extends C2217421BqW implements Function1<InterfaceC1380500m1o, InterfaceC1380500m1o> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C259800zU<Object> LLILLJJLI;
    public final /* synthetic */ C259800zU<Function2<Object, InterfaceC1380500m1o, Object>> LLILLL;
    public final /* synthetic */ C259800zU<List<Function0<Unit>>> LLILZ;
    public final /* synthetic */ C259800zU<List<Function0<Unit>>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1454605mi(C013C c013c, C259800zU<Object> c259800zU, C259800zU<Function2<Object, InterfaceC1380500m1o, Object>> c259800zU2, C259800zU<List<Function0<Unit>>> c259800zU3, C259800zU<List<Function0<Unit>>> c259800zU4) {
        super(1, C1449605lu.class, "dispatch", "createStore$dispatch(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/ss/android/ugc/aweme/longpress/redux/AnyAction;)Lcom/ss/android/ugc/aweme/longpress/redux/AnyAction;", 0);
        this.LL = c013c;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = c259800zU3;
        this.LLILZIL = c259800zU4;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T] */
    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC1380500m1o invoke(InterfaceC1380500m1o interfaceC1380500m1o) {
        C013C c013c = this.LL;
        C259800zU<Object> c259800zU = this.LLILLJJLI;
        C259800zU<Function2<Object, InterfaceC1380500m1o, Object>> c259800zU2 = this.LLILLL;
        C259800zU<List<Function0<Unit>>> c259800zU3 = this.LLILZ;
        C259800zU<List<Function0<Unit>>> c259800zU4 = this.LLILZIL;
        if (!(interfaceC1380500m1o instanceof InterfaceC1451105m9)) {
            try {
                c013c.element = true;
                c259800zU.element = c259800zU2.element.invoke(c259800zU.element, interfaceC1380500m1o);
                c013c.element = false;
                ?? r1 = c259800zU3.element;
                c259800zU4.element = r1;
                Iterator it2 = ((List) r1).iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
                return interfaceC1380500m1o;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c013c.element = false;
                throw th;
            }
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}

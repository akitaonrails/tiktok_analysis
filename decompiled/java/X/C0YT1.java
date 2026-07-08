package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YT1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.preload.MessageRequestPreloader$triggerPreload$1", f = "MessageRequestPreloader.kt", l = {137}, m = "invokeSuspend")
public final class C0YT1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public Object LLILLJJLI;
    public EnumC871430YGn LLILLL;
    public int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ EnumC871430YGn LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YT1(String str, EnumC871430YGn enumC871430YGn, InterfaceC1364105Vn<? super C0YT1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = str;
        this.LLILZLL = enumC871430YGn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YT1(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEV c1dev;
        Object obj2;
        EnumC871430YGn enumC871430YGn;
        EnumC871430YGn first;
        C1C7U.LIZ("MessageRequestPreloader@c3c9.triggerPreload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                enumC871430YGn = this.LLILLL;
                obj2 = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1dev = C876590Ya9.LIZLLL;
            obj2 = this.LLILZIL;
            enumC871430YGn = this.LLILZLL;
            this.LL = c1dev;
            this.LLILLJJLI = obj2;
            this.LLILLL = enumC871430YGn;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("MessageRequestPreloader@c3c9.triggerPreload$1");
                return objLJFF;
            }
        }
        try {
            ConcurrentHashMap<String, Pair<EnumC871430YGn, C0YUD>> concurrentHashMap = C876590Ya9.LIZIZ;
            Pair<EnumC871430YGn, C0YUD> pair = concurrentHashMap.get(obj2);
            if (pair != null) {
                first = pair.getFirst();
            } else {
                first = null;
            }
            if (first == enumC871430YGn) {
                Unit unit = Unit.LIZ;
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("MessageRequestPreloader@c3c9.triggerPreload$1");
                return unit;
            }
            C0YRC c0yrcLIZ = C0YRM.LIZ(enumC871430YGn);
            C876590Ya9.LIZ.getClass();
            C876590Ya9.LIZ(false);
            concurrentHashMap.put((String) obj2, new Pair<>(enumC871430YGn, c0yrcLIZ));
            c0yrcLIZ.LJI(20, new C869380Y8q(null, null, null, null, 127));
            c1dev.LIZIZ(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MessageRequestPreloader@c3c9.triggerPreload$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

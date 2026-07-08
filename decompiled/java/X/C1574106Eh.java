package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.impl.pet.fe.event.StreakJsEventHandler;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Eh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.fe.event.StreakJsEventManager$registerJsEventHandler$1", f = "StreakJsEventManager.kt", l = {180}, m = "invokeSuspend")
public final class C1574106Eh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public StreakJsEventHandler LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ StreakJsEventHandler<?> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574106Eh(StreakJsEventHandler<?> streakJsEventHandler, InterfaceC1364105Vn<? super C1574106Eh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = streakJsEventHandler;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1574106Eh(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEV c1dev;
        StreakJsEventHandler<?> streakJsEventHandler;
        C1C7U.LIZ("StreakJsEventManager@367b.registerJsEventHandler$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                streakJsEventHandler = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1dev = C1574006Eg.LLILZIL;
            streakJsEventHandler = this.LLILZ;
            this.LL = c1dev;
            this.LLILLJJLI = streakJsEventHandler;
            this.LLILLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("StreakJsEventManager@367b.registerJsEventHandler$1");
                return objLJFF;
            }
        }
        try {
            ConcurrentHashMap<String, StreakJsEventHandler<?>> concurrentHashMap = C1574006Eg.LLILZLL;
            if (concurrentHashMap.containsKey(streakJsEventHandler.LL)) {
                C01GW c01gw = C1574706En.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("StreakPetJsEventManager, registerJsEventHandler: ");
                sbLIZ.append(streakJsEventHandler);
                sbLIZ.append(" already registered");
                C1574706En.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                Unit unit = Unit.LIZ;
                c1dev.LIZIZ(null);
                C1C7U.LIZIZ("StreakJsEventManager@367b.registerJsEventHandler$1");
                return unit;
            }
            concurrentHashMap.put(streakJsEventHandler.LL, streakJsEventHandler);
            C01GW c01gw2 = C1574706En.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("StreakPetJsEventManager, registerJsEventHandler: ");
            sbLIZ2.append(streakJsEventHandler);
            C1574706En.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c1dev.LIZIZ(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StreakJsEventManager@367b.registerJsEventHandler$1");
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

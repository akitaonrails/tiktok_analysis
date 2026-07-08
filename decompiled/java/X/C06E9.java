package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.monitor.RestoreDelayCallbackData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06E9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.monitor.RestoreDelayMonitor$receiveStreakStart$1", f = "RestoreDelayMonitor.kt", l = {}, m = "invokeSuspend")
public final class C06E9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StreakData LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06E9(StreakData streakData, long j, InterfaceC1364105Vn<? super C06E9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = streakData;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06E9(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RestoreDelayCallbackData restoreDelayCallbackData;
        C1C7U.LIZ("RestoreDelayMonitor@920.receiveStreakStart$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZIZ = C1566206Bg.LIZIZ(this.LL);
        ConcurrentHashMap<String, C06EH> concurrentHashMap = C06EC.LIZLLL;
        C06EH c06ehRemove = concurrentHashMap.remove(strLIZIZ);
        if (c06ehRemove != null && (restoreDelayCallbackData = c06ehRemove.LIZIZ) != null) {
            C06EC.LIZ(C06EC.LIZIZ, restoreDelayCallbackData, this.LLILLJJLI, true);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RestoreDelayMonitor@920.receiveStreakStart$1");
            return unit;
        }
        concurrentHashMap.put(strLIZIZ, new C06EH(C2286608xc.LJFF(this.LLILLJJLI), null, 2));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RestoreDelayMonitor@920.receiveStreakStart$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

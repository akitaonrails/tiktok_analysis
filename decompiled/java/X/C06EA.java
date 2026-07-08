package X;

import com.ss.android.ugc.aweme.im.streak.impl.monitor.RestoreDelayCallbackData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06EA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.monitor.RestoreDelayMonitor$receiveRestoreDelayCallbackData$1", f = "RestoreDelayMonitor.kt", l = {84}, m = "invokeSuspend")
public final class C06EA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ RestoreDelayCallbackData LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06EA(RestoreDelayCallbackData restoreDelayCallbackData, InterfaceC1364105Vn<? super C06EA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = restoreDelayCallbackData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06EA c06ea = new C06EA(this.LLILZ, interfaceC1364105Vn);
        c06ea.LLILLL = obj;
        return c06ea;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Object obj2;
        Long l;
        RestoreDelayCallbackData restoreDelayCallbackData;
        C1C7U.LIZ("RestoreDelayMonitor@920.receiveRestoreDelayCallbackData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                obj2 = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            RestoreDelayCallbackData restoreDelayCallbackData2 = this.LLILZ;
            if (restoreDelayCallbackData2.restoreResult == 0) {
                C06EC.LIZ(C06EC.LIZIZ, restoreDelayCallbackData2, System.currentTimeMillis(), false);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RestoreDelayMonitor@920.receiveRestoreDelayCallbackData$1");
                return unit;
            }
            obj2 = restoreDelayCallbackData2.peerId;
            ConcurrentHashMap<String, C06EH> concurrentHashMap = C06EC.LIZLLL;
            C06EH c06eh = concurrentHashMap.get(obj2);
            if (c06eh != null && (l = c06eh.LIZ) != null) {
                concurrentHashMap.remove(obj2);
                C06EC.LIZ(C06EC.LIZIZ, this.LLILZ, l.longValue(), true);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("RestoreDelayMonitor@920.receiveRestoreDelayCallbackData$1");
                return unit2;
            }
            RestoreDelayCallbackData restoreDelayCallbackData3 = this.LLILZ;
            concurrentHashMap.put(restoreDelayCallbackData3.peerId, new C06EH(null, restoreDelayCallbackData3, 1));
            long jLongValue = ((Number) C06EJ.LIZ.getValue()).longValue();
            this.LLILLL = interfaceC497601wk;
            this.LL = obj2;
            this.LLILLJJLI = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("RestoreDelayMonitor@920.receiveRestoreDelayCallbackData$1");
                return objLJFF;
            }
        }
        C2296808zG.LJFF(interfaceC497601wk);
        C06EC c06ec = C06EC.LIZIZ;
        C06EH c06ehRemove = C06EC.LIZLLL.remove(obj2);
        if (c06ehRemove != null && (restoreDelayCallbackData = c06ehRemove.LIZIZ) != null) {
            C06EC.LIZ(c06ec, restoreDelayCallbackData, System.currentTimeMillis(), false);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("RestoreDelayMonitor@920.receiveRestoreDelayCallbackData$1");
            return unit3;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("RestoreDelayMonitor@920.receiveRestoreDelayCallbackData$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

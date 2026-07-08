package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.StorageService$1", f = "StorageService.kt", l = {239}, m = "invokeSuspend")
public final class C1848710yCz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1848740yD2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1848710yCz(C1848740yD2 c1848740yD2, InterfaceC1364105Vn<? super C1848710yCz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1848740yD2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1848710yCz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("StorageService@d135.<init>$1");
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
            C1848740yD2 c1848740yD2 = this.LLILLJJLI;
            this.LL = 1;
            for (String str : ((ConcurrentHashMap) c1848740yD2.LIZIZ.LIZLLL).keySet()) {
                if (!C23118094a.LJIIIIZZ(C23271099x.INSTANCE)) {
                    unit = Unit.LIZ;
                    break;
                }
                Pair pair = (Pair) ((ConcurrentHashMap) c1848740yD2.LIZIZ.LIZLLL).get(str);
                if (pair != null) {
                    String str2 = (String) pair.getFirst();
                    String str3 = (String) pair.getSecond();
                    if (((long) c1848740yD2.LIZJ.LIZJ) + ((long) C1848700yCy.LIZ(str2)) > 262144 || c1848740yD2.LIZJ.LIZ.keySet().size() + 1 > 64) {
                        break;
                    }
                    synchronized (c1848740yD2) {
                        try {
                            C1848720yD0.LIZJ(c1848740yD2.LIZJ, str, str2, str3);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
            unit = Unit.LIZ;
            if (unit == objLJFF) {
                C1C7U.LIZIZ("StorageService@d135.<init>$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StorageService@d135.<init>$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

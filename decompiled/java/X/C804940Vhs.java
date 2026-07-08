package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Vhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804940Vhs extends C09AY implements Function0<Unit> {
    public C804940Vhs() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object c098200Yq;
        InterfaceC804960Vhu interfaceC804960Vhu;
        try {
            C804900Vho.LIZ.getClass();
            if (!C804900Vho.LIZLLL() && (interfaceC804960Vhu = (InterfaceC804960Vhu) C804900Vho.LIZJ.getValue()) != null) {
                interfaceC804960Vhu.LIZIZ(C804900Vho.LIZ());
            }
            C804950Vht.LIZ.getClass();
            C804950Vht.LIZJ(0L);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return Unit.LIZ;
    }
}

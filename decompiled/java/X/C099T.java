package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.099T, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C099T {
    public static void LIZ(Function2 function2, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        try {
            InterfaceC1364105Vn interfaceC1364105VnLIZLLL = C099M.LIZLLL(C099M.LIZIZ(function2, obj, interfaceC1364105Vn));
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            C2252641DEw.LIZ(unit, null, interfaceC1364105VnLIZLLL);
        } catch (Throwable th) {
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC1364105Vn.resumeWith(c098200Yq);
            throw th;
        }
    }
}

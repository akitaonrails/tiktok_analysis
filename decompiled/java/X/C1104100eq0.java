package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104100eq0 extends C09AY implements Function0<Boolean> {
    public C1104100eq0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Object c098200Yq;
        try {
            Object objLIZIZ = C1535630q41.LIZIZ("fix_spark_popup_nested_scroll");
            c098200Yq = objLIZIZ instanceof Boolean ? (Boolean) objLIZIZ : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}

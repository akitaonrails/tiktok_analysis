package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00Yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C097500Yj extends C09AY implements Function0<Set<? extends String>> {
    public C097500Yj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        Object c098200Yq;
        try {
            c098200Yq = a0.LJJLIIIJILLIZJL((String) C097600Yk.LIZ.getValue(), new String[]{","}, 0, 6);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Iterable iterable = (Iterable) c098200Yq;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        return C13LP.LLIIJI(iterable);
    }
}

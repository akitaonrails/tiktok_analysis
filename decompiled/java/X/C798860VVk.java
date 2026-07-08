package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798860VVk extends AbstractC791320V2k implements InterfaceC798870VVl {
    public final List<InterfaceC798880VVm> LLILLJJLI = new ArrayList();
    public boolean LLILLL;

    @Override // X.InterfaceC798870VVl
    public final void LJIIIZ(C799000VVy c799000VVy) {
        ((ArrayList) this.LLILLJJLI).remove(c799000VVy);
    }

    @Override // X.InterfaceC798870VVl
    public final void LJIIL(C799000VVy c799000VVy) {
        ((ArrayList) this.LLILLJJLI).add(c799000VVy);
        if (!this.LLILLL) {
            C791390V2r.LJJIII.LJ(this);
            this.LLILLL = true;
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILL(long j, long j2, long j3, long j4, boolean z) {
        Object c098200Yq;
        this.LL = false;
        if (!((ArrayList) this.LLILLJJLI).isEmpty() && z) {
            try {
                Field declaredField = C791390V2r.class.getDeclaredField("LJJ");
                declaredField.setAccessible(true);
                c098200Yq = Long.valueOf(((Long) declaredField.get(C791390V2r.LJJIII)).longValue());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                long jLongValue = ((Number) c098200Yq).longValue();
                if (jLongValue != -1) {
                    Iterator<InterfaceC798880VVm> it2 = this.LLILLJJLI.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(jLongValue, j3);
                    }
                }
            }
        }
    }
}

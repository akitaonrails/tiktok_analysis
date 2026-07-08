package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0qUg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1552160qUg<IN, OUT> extends AbstractC1552240qUo<IN, OUT> {
    public Map<String, C1552830qVl> LJI;

    @Override // X.AbstractC1552240qUo
    public final void LIZIZ(Object... objArr) {
        Object obj;
        if (objArr != null && objArr.length == 1 && (obj = objArr[0]) != null) {
            try {
                this.LJI = (Map) obj;
                return;
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalArgumentException(e);
            }
        }
        throw new IllegalStateException("args error");
    }
}

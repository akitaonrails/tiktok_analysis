package X;

import X.C06KX;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0qYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554620qYe<T extends C06KX> implements InterfaceC2753014t {
    public final List<T> LL = new ArrayList();
    public final List<T> LLILLJJLI = new ArrayList();
    public boolean LLILLL;

    public final List<T> LIZIZ() {
        ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = new ArrayList();
                arrayList.addAll(this.LL);
                arrayList.addAll(this.LLILLJJLI);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public final void LIZ(List<? extends T> list, boolean z) {
        List<T> list2;
        synchronized (this) {
            try {
                if (z) {
                    list2 = this.LL;
                } else {
                    list2 = this.LLILLJJLI;
                }
                list2.addAll(list);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

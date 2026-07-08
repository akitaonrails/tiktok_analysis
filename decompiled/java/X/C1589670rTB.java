package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0rTB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589670rTB implements InterfaceC1589880rTW, InterfaceC1589760rTK {
    public final InterfaceC1589760rTK LL;
    public final C21600519gB LLILLJJLI;

    @Override // X.InterfaceC1589880rTW
    public final Fragment LIZ() {
        Object c098200Yq;
        try {
            C21600519gB c21600519gB = this.LLILLJJLI;
            PagerAdapter adapter = c21600519gB != null ? c21600519gB.getAdapter() : null;
            C1581690rGJ c1581690rGJ = adapter instanceof C1581690rGJ ? (C1581690rGJ) adapter : null;
            c098200Yq = c1581690rGJ != null ? c1581690rGJ.getCurrentFragment() : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (Fragment) (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null ? c098200Yq : null);
    }

    @Override // X.InterfaceC1589760rTK
    public final InterfaceC665370Q7z at() {
        return this.LL.at();
    }

    @Override // X.InterfaceC1589880rTW
    public final int getCurrentItemCompat() {
        return this.LLILLJJLI.getCurrentItemCompat();
    }

    @Override // X.InterfaceC1589880rTW
    public final void LLIFFJFJJ(boolean z) {
        this.LLILLJJLI.LLLLZIL = z;
    }

    @Override // X.InterfaceC1589760rTK
    public final void Ti(int i) {
        this.LL.Ti(1);
    }

    public C1589670rTB(InterfaceC1589760rTK interfaceC1589760rTK, C21600519gB c21600519gB) {
        this.LL = interfaceC1589760rTK;
        this.LLILLJJLI = c21600519gB;
    }

    @Override // X.InterfaceC1589880rTW
    public final void LLFFF(int i, boolean z) {
        this.LLILLJJLI.LLFFF(i, z);
    }
}

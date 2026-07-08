package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Rwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712250Rwl extends AbstractC712240Rwk {
    public final List<AbstractC712240Rwk> LL = new ArrayList(3);

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        try {
            Iterator it2 = ((ArrayList) this.LL).iterator();
            while (it2.hasNext()) {
                ((AbstractC712240Rwk) it2.next()).onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        try {
            Iterator it2 = ((ArrayList) this.LL).iterator();
            while (it2.hasNext()) {
                ((AbstractC712240Rwk) it2.next()).onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        try {
            Iterator it2 = ((ArrayList) this.LL).iterator();
            while (it2.hasNext()) {
                ((AbstractC712240Rwk) it2.next()).onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}

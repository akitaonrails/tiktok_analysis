package X;

import android.database.Observable;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.0IeQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C471560IeQ extends Observable<AbstractC471570IeR> {
    public final boolean LIZ() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void LIZIZ() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC471570IeR) ListProtector.get(((Observable) this).mObservers, size)).LIZ();
        }
    }

    public final void LJI() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC471570IeR) ListProtector.get(((Observable) this).mObservers, size)).LJI();
        }
    }

    public final void LIZJ(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC471570IeR) ListProtector.get(((Observable) this).mObservers, size)).LJ(i, i2);
        }
    }

    public final void LJ(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC471570IeR) ListProtector.get(((Observable) this).mObservers, size)).LIZLLL(i, i2);
        }
    }

    public final void LJFF(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC471570IeR) ListProtector.get(((Observable) this).mObservers, size)).LJFF(i, i2);
        }
    }

    public final void LIZLLL(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC471570IeR) ListProtector.get(((Observable) this).mObservers, size)).LIZJ(i, i2, obj);
        }
    }
}

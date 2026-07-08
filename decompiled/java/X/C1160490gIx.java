package X;

import com.bytedance.ies.powerlist.layout.core.PowerLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0gIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160490gIx {
    public final ViewOnAttachStateChangeListenerC20604515jv LIZ;
    public PowerLayoutManager LIZIZ;
    public final List<AbstractC21686119tz> LIZJ = new ArrayList();
    public final List<AbstractC21686119tz> LIZLLL = new ArrayList();

    public C1160490gIx(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
    }

    public final void LIZ(AbstractC21685919tx abstractC21685919tx) {
        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
        int iLJI = 0;
        while (it2.hasNext()) {
            iLJI += ((AbstractC21686119tz) it2.next()).LJI();
        }
        if (abstractC21685919tx.LJI > 0) {
            abstractC21685919tx.LJIILLIIL(iLJI, (r1 + iLJI) - 1);
        } else {
            abstractC21685919tx.LJIILLIIL(-1, -1);
        }
        ((ArrayList) this.LIZJ).add(abstractC21685919tx);
        PowerLayoutManager powerLayoutManager = this.LIZIZ;
        if (powerLayoutManager != null) {
            powerLayoutManager.LJJII(this.LIZJ);
        }
        if (!(!(abstractC21685919tx instanceof C21685719tv))) {
            this.LIZ.setItemAnimator(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(int i) {
        int iIntValue = 0;
        if (i > 0) {
            C136N<Integer> c136n = ((AbstractC21686119tz) ListProtector.get(this.LIZJ, i - 1)).LIZ;
            if (((Number) c136n.LIZIZ).intValue() >= 0) {
                iIntValue = ((Number) c136n.LIZIZ).intValue() + 1;
            }
        }
        int size = ((ArrayList) this.LIZJ).size();
        while (i < size) {
            AbstractC21686119tz abstractC21686119tz = (AbstractC21686119tz) ListProtector.get(this.LIZJ, i);
            int iLJI = abstractC21686119tz.LJI();
            if (iLJI > 0) {
                int i2 = iLJI + iIntValue;
                abstractC21686119tz.LJIILLIIL(iIntValue, i2 - 1);
                iIntValue = i2;
            } else {
                abstractC21686119tz.LJIILLIIL(-1, -1);
            }
            i++;
        }
    }

    public final void LIZIZ(AbstractC21686119tz abstractC21686119tz, int i) {
        int iIndexOf = ((ArrayList) this.LIZJ).indexOf(abstractC21686119tz);
        if (iIndexOf >= 0) {
            abstractC21686119tz.LJIILL(i);
            LIZJ(iIndexOf);
            PowerLayoutManager powerLayoutManager = this.LIZIZ;
            if (powerLayoutManager != null) {
                powerLayoutManager.LJJII(this.LIZJ);
            }
        }
    }
}

package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Pjj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C653210Pjj implements C1DWH {
    public static final int[] LIZIZ = new int[2];
    public final boolean LIZ;

    @Override // X.C1DWH
    public final void LIZ() {
    }

    @Override // X.C1DWH
    public final void LIZJ() {
    }

    @Override // X.C1DWH
    public RecyclerView LJ() {
        return null;
    }

    @Override // X.C1DWH
    public void LJFF(boolean z) {
    }

    @Override // X.C1DWH
    public InterfaceC652740Piy LJI(int i, RecyclerView recyclerView, boolean z, boolean z2, Collection collection) {
        return null;
    }

    @Override // X.C1DWH
    public InterfaceC652740Piy LJII(RecyclerView recyclerView, RecyclerView recyclerView2, Collection<? extends InterfaceC652740Piy> collection) {
        return null;
    }

    @Override // X.C1DWH
    public InterfaceC652740Piy LJIIIIZZ(RecyclerView recyclerView, RecyclerView recyclerView2, Collection<? extends InterfaceC652740Piy> collection) {
        return null;
    }

    public C653210Pjj() {
        C844470XAv.LIZ.getClass();
        this.LIZ = C444960Hcc.LIZJ(C844470XAv.LIZ());
    }

    @Override // X.C1DWH
    public InterfaceC652740Piy LIZIZ(RecyclerView recyclerView, int i, Collection<? extends InterfaceC652740Piy> collection) {
        int i2;
        Object next = null;
        if (collection.isEmpty() || i != 0) {
            return null;
        }
        int i3 = 1;
        if (this.LIZ) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (!recyclerView.canScrollHorizontally(i2)) {
            Iterator<T> it2 = collection.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int position = ((InterfaceC652740Piy) next).getPosition();
                    do {
                        Object next2 = it2.next();
                        int position2 = ((InterfaceC652740Piy) next2).getPosition();
                        if (position > position2) {
                            next = next2;
                            position = position2;
                        }
                    } while (it2.hasNext());
                }
            }
            return (InterfaceC652740Piy) next;
        }
        if (this.LIZ) {
            i3 = -1;
        }
        if (!recyclerView.canScrollHorizontally(i3)) {
            Iterator<T> it3 = collection.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    int position3 = ((InterfaceC652740Piy) next).getPosition();
                    do {
                        Object next3 = it3.next();
                        int position4 = ((InterfaceC652740Piy) next3).getPosition();
                        if (position3 < position4) {
                            next = next3;
                            position3 = position4;
                        }
                    } while (it3.hasNext());
                }
            }
            return (InterfaceC652740Piy) next;
        }
        int[] iArr = LIZIZ;
        recyclerView.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        recyclerView.getLocationOnScreen(iArr);
        int width = (i4 + (iArr[0] + recyclerView.getWidth())) / 2;
        Iterator<T> it4 = collection.iterator();
        if (it4.hasNext()) {
            next = it4.next();
            if (it4.hasNext()) {
                InterfaceC652740Piy interfaceC652740Piy = (InterfaceC652740Piy) next;
                interfaceC652740Piy.getView().getLocationOnScreen(iArr);
                int iAbs = Math.abs(iArr[0] - width);
                View view = interfaceC652740Piy.getView();
                view.getLocationOnScreen(iArr);
                int iAbs2 = iAbs + Math.abs((iArr[0] + view.getWidth()) - width);
                do {
                    Object next4 = it4.next();
                    InterfaceC652740Piy interfaceC652740Piy2 = (InterfaceC652740Piy) next4;
                    interfaceC652740Piy2.getView().getLocationOnScreen(iArr);
                    int iAbs3 = Math.abs(iArr[0] - width);
                    View view2 = interfaceC652740Piy2.getView();
                    view2.getLocationOnScreen(iArr);
                    int iAbs4 = iAbs3 + Math.abs((iArr[0] + view2.getWidth()) - width);
                    if (iAbs2 > iAbs4) {
                        next = next4;
                        iAbs2 = iAbs4;
                    }
                } while (it4.hasNext());
            }
        }
        return (InterfaceC652740Piy) next;
    }
}

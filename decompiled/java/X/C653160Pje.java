package X;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Pje, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653160Pje extends C653150Pjd {
    public InterfaceC653170Pjf LJFF;
    public final C01GW LJI;

    @Override // X.C653150Pjd
    public final void LJFF() {
        this.LIZ.getLocationOnScreen(LJI());
        this.LIZLLL.left = LJI()[0];
        this.LIZLLL.top = LJI()[1];
        this.LIZLLL.right = LJI()[0] + this.LIZ.getWidth();
        this.LIZLLL.bottom = LJI()[1] + this.LIZ.getHeight();
        this.LIZJ.set(this.LIZLLL.left + ((Rect) this.LJI.getValue()).left, this.LIZLLL.top + ((Rect) this.LJI.getValue()).top, this.LIZLLL.left + ((Rect) this.LJI.getValue()).right, this.LIZLLL.top + ((Rect) this.LJI.getValue()).bottom);
    }

    public C653160Pje(RecyclerView recyclerView) {
        super(recyclerView);
        this.LJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(551));
    }

    @Override // X.C653150Pjd, X.InterfaceC653000PjO
    public final AbstractC653010PjP LIZJ(Collection<? extends AbstractC653010PjP> collection) {
        AbstractC653010PjP abstractC653010PjPLIZJ;
        InterfaceC653170Pjf interfaceC653170Pjf = this.LJFF;
        if (interfaceC653170Pjf != null && interfaceC653170Pjf.LIZIZ()) {
            InterfaceC653170Pjf interfaceC653170Pjf2 = this.LJFF;
            if (interfaceC653170Pjf2 != null) {
                abstractC653010PjPLIZJ = interfaceC653170Pjf2.LIZJ(collection);
            } else {
                return null;
            }
        } else {
            abstractC653010PjPLIZJ = super.LIZJ(collection);
        }
        if (abstractC653010PjPLIZJ != null) {
            int iLIZIZ = abstractC653010PjPLIZJ.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Algo result pos #");
            sbLIZ.append(iLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return abstractC653010PjPLIZJ;
    }
}

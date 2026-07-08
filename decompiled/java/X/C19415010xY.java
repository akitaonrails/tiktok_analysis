package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.10xY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19415010xY<T> {
    public static final List<Object> LIZIZ = Collections.emptyList();
    public final C1119470fEn<AbstractC1067910dtd<T>> LIZ = new C1119470fEn<>();

    public final void LIZJ() {
        if (this.LIZ == null) {
            return;
        }
        for (int i = 0; i < this.LIZ.LJII(); i++) {
            if (this.LIZ.LJIIIIZZ(i) != null) {
                this.LIZ.LJIIIIZZ(i).getClass();
            }
        }
    }

    public final void LJFF() {
        if (this.LIZ == null) {
            return;
        }
        for (int i = 0; i < this.LIZ.LJII(); i++) {
            if (this.LIZ.LJIIIIZZ(i) != null) {
                this.LIZ.LJIIIIZZ(i).getClass();
            }
        }
    }

    public final void LIZ(AbstractC1067910dtd abstractC1067910dtd) {
        int iLJII = this.LIZ.LJII();
        while (this.LIZ.LIZLLL(iLJII) != null) {
            iLJII++;
            if (iLJII == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        if (iLJII != 2147483646) {
            if (this.LIZ.LIZLLL(iLJII) == null) {
                this.LIZ.LJFF(iLJII, abstractC1067910dtd);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("An AdapterDelegate is already registered for the viewType = ");
            sbLIZ.append(iLJII);
            sbLIZ.append(". Already registered AdapterDelegate is ");
            sbLIZ.append(this.LIZ.LIZLLL(iLJII));
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
    }

    public final int LIZIZ(int i, Object obj) {
        if (obj != null) {
            if (this.LIZ.LJII() > 0) {
                this.LIZ.LJIIIIZZ(0).LIZ(obj);
                return this.LIZ.LJ(0);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No AdapterDelegate added that matches position=");
            sbLIZ.append(i);
            sbLIZ.append(" delegates=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" items=");
            sbLIZ.append(obj);
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new NullPointerException("Items datasource is null!");
    }

    public final RecyclerView.ViewHolder LJ(ViewGroup viewGroup, int i) {
        Object obj;
        C1119470fEn<AbstractC1067910dtd<T>> c1119470fEn = this.LIZ;
        c1119470fEn.getClass();
        int iLIZ = C830540Wi4.LIZ(c1119470fEn.LLILZ, i, c1119470fEn.LLILLJJLI);
        if (iLIZ < 0 || (obj = c1119470fEn.LLILLL[iLIZ]) == C1101530elr.LIZ) {
            obj = null;
        }
        AbstractC1067910dtd abstractC1067910dtd = (AbstractC1067910dtd) obj;
        if (abstractC1067910dtd != null) {
            RecyclerView.ViewHolder viewHolderLIZJ = abstractC1067910dtd.LIZJ(viewGroup);
            if (viewHolderLIZJ != null) {
                return viewHolderLIZJ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ViewHolder returned from AdapterDelegate ");
            sbLIZ.append(abstractC1067910dtd);
            sbLIZ.append(" for ViewType =");
            sbLIZ.append(i);
            sbLIZ.append(" is null!");
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("No AdapterDelegate added for ViewType ");
        sbLIZ2.append(i);
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LIZLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        Object obj2;
        int itemViewType = viewHolder.getItemViewType();
        C1119470fEn<AbstractC1067910dtd<T>> c1119470fEn = this.LIZ;
        c1119470fEn.getClass();
        int iLIZ = C830540Wi4.LIZ(c1119470fEn.LLILZ, itemViewType, c1119470fEn.LLILLJJLI);
        if (iLIZ < 0 || (obj2 = c1119470fEn.LLILLL[iLIZ]) == C1101530elr.LIZ) {
            obj2 = null;
        }
        AbstractC1067910dtd abstractC1067910dtd = (AbstractC1067910dtd) obj2;
        if (abstractC1067910dtd != null) {
            abstractC1067910dtd.LIZIZ(obj, i, viewHolder);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No delegate found for item at position = ");
        sbLIZ.append(i);
        sbLIZ.append(" for viewType = ");
        sbLIZ.append(viewHolder.getItemViewType());
        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
    }
}

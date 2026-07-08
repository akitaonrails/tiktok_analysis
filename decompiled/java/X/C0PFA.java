package X;

import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0PFA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PFA {
    public final ViewGroup LIZ;
    public final C0PFE LIZIZ;
    public final Map<Class<?>, C0PFI> LJII;
    public final Map<Integer, C0PFI> LJI = new LinkedHashMap();
    public final HandlerThread LJIIIIZZ = new HandlerThread("async-prefetch");
    public final C0PFG LIZLLL = new C0PFI() { // from class: X.0PFG
        @Override // X.C0PFI
        public final RecyclerView.ViewHolder LIZ() {
            C0PFE c0pfe;
            C0PFA c0pfa = this.LJ;
            ViewGroup viewGroup = c0pfa.LIZ;
            if (viewGroup == null || (c0pfe = c0pfa.LIZIZ) == null) {
                return null;
            }
            return c0pfe.LJJIL(viewGroup);
        }

        {
            super(8);
        }
    };
    public final C0PFD LIZJ = new C0PFI() { // from class: X.0PFD
        @Override // X.C0PFI
        public final RecyclerView.ViewHolder LIZ() {
            C0PFE c0pfe;
            C0PFA c0pfa = this.LJ;
            ViewGroup viewGroup = c0pfa.LIZ;
            if (viewGroup == null || (c0pfe = c0pfa.LIZIZ) == null) {
                return null;
            }
            return c0pfe.LLIFFJFJJ(viewGroup);
        }
    };
    public final C0PFF LJ = new C0PFI() { // from class: X.0PFF
        @Override // X.C0PFI
        public final RecyclerView.ViewHolder LIZ() {
            C0PFE c0pfe;
            C0PFA c0pfa = this.LJ;
            ViewGroup viewGroup = c0pfa.LIZ;
            if (viewGroup == null || (c0pfe = c0pfa.LIZIZ) == null) {
                return null;
            }
            return c0pfe.LJJJJ(viewGroup);
        }
    };
    public final C0PFB LJFF = new C0PFI() { // from class: X.0PFB
        @Override // X.C0PFI
        public final RecyclerView.ViewHolder LIZ() {
            C0PFE c0pfe;
            C0PFA c0pfa = this.LJ;
            ViewGroup viewGroup = c0pfa.LIZ;
            if (viewGroup == null || (c0pfe = c0pfa.LIZIZ) == null) {
                return null;
            }
            return c0pfe.LLILII(viewGroup);
        }
    };

    public final RecyclerView.ViewHolder LIZJ() {
        RecyclerView.ViewHolder viewHolderLIZIZ = LIZIZ();
        if (viewHolderLIZIZ == null) {
            viewHolderLIZIZ = LIZ();
        }
        if (C07C9.LIZ()) {
            return viewHolderLIZIZ == null ? LIZ(this.LIZ) : viewHolderLIZIZ;
        }
        if (viewHolderLIZIZ != null) {
            return viewHolderLIZIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final RecyclerView.ViewHolder LIZIZ() {
        int i;
        String strLIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        RecyclerView.ViewHolder viewHolderLIZIZ = LIZIZ();
        if (viewHolderLIZIZ == null) {
            viewHolderLIZIZ = LIZ();
            i = 0;
        } else {
            i = 1;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.LIZIZ.LLIIJLIL().length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ.LLIIJLIL());
            sbLIZ.append("_viewholder");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "viewholder";
        }
        C01V2.LIZ(i, strLIZIZ, jCurrentTimeMillis2, "SearchPhotoViewHolder");
        if (C07C9.LIZ()) {
            return viewHolderLIZIZ == null ? LIZ(this.LIZ) : viewHolderLIZIZ;
        }
        if (viewHolderLIZIZ != null) {
            return viewHolderLIZIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final RecyclerView.ViewHolder LIZLLL() {
        int i;
        String strLIZIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        RecyclerView.ViewHolder viewHolderLIZIZ = LIZIZ();
        if (viewHolderLIZIZ == null) {
            viewHolderLIZIZ = LIZ();
            i = 0;
        } else {
            i = 1;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (this.LIZIZ.LLIIJLIL().length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ.LLIIJLIL());
            sbLIZ.append("_viewholder");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "viewholder";
        }
        C01V2.LIZ(i, strLIZIZ, jCurrentTimeMillis2, "SearchVideoViewHolder");
        if (C07C9.LIZ()) {
            return viewHolderLIZIZ == null ? LIZ(this.LIZ) : viewHolderLIZIZ;
        }
        if (viewHolderLIZIZ != null) {
            return viewHolderLIZIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0PFO] */
    public static C0PFO LIZ(View view) {
        final View view2 = new View(view.getContext());
        return new RecyclerView.ViewHolder(view2) { // from class: X.0PFO
        };
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0PFG] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0PFD] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0PFF] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0PFB] */
    public C0PFA(RecyclerView recyclerView, C0PFE c0pfe) {
        this.LIZ = recyclerView;
        this.LIZIZ = c0pfe;
        C13DA c13da = new C13DA();
        for (final Class cls : (ArrayList) C13LQ.LJIJI(new Class[]{C0QG7.LIZ().LIZIZ(), C0QG7.LIZ().LIZLLL(), C0QG7.LIZ().LIZJ()})) {
            final ViewGroup viewGroup = this.LIZ;
            final C0PFE c0pfe2 = this.LIZIZ;
            final int iIntValue = ((Number) C0BDH.LIZ.getValue()).intValue();
            final boolean zBooleanValue = ((Boolean) C0BDG.LIZ.getValue()).booleanValue();
            c13da.put(cls, new C0PFI(viewGroup, c0pfe2, cls, iIntValue, zBooleanValue) { // from class: X.0PFH
                public final ViewGroup LJ;
                public final C0PFE LJFF;
                public final Class<?> LJI;

                @Override // X.C0PFI
                public final RecyclerView.ViewHolder LIZ() {
                    C0PFE c0pfe3;
                    ViewGroup viewGroup2 = this.LJ;
                    if (viewGroup2 == null || (c0pfe3 = this.LJFF) == null) {
                        return null;
                    }
                    return c0pfe3.LLJJIII(viewGroup2, this.LJI);
                }

                {
                    super(iIntValue, zBooleanValue);
                    this.LJ = viewGroup;
                    this.LJFF = c0pfe2;
                    this.LJI = cls;
                }
            });
        }
        this.LJII = c13da.build();
    }
}

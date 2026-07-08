package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;

/* JADX INFO: renamed from: X.0PME, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PME {
    public final C19EG LIZ;
    public final DynamicPatch LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final View LJ;
    public final Fragment LJFF;
    public final SearchStateViewModel LJI;
    public final C0P6Y LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicMaskData(activity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", patch=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scenario=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pageIndex=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rootView=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", curFragment=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", viewState=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", tnsMaskState=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PME(C19EG c19eg, DynamicPatch dynamicPatch, String str, int i, View view, Fragment fragment, SearchStateViewModel searchStateViewModel, C0P6Y c0p6y) {
        this.LIZ = c19eg;
        this.LIZIZ = dynamicPatch;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = view;
        this.LJFF = fragment;
        this.LJI = searchStateViewModel;
        this.LJII = c0p6y;
    }
}

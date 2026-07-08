package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.RefactorTTReviewCell;
import java.util.List;

/* JADX INFO: renamed from: X.0h7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1192060h7s {
    public void LIZ(RefactorTTReviewCell refactorTTReviewCell) {
    }

    public abstract void LIZIZ(RefactorTTReviewCell refactorTTReviewCell, PoiReviewsApi.PoiReviewModel poiReviewModel);

    public void LIZJ(RefactorTTReviewCell refactorTTReviewCell) {
    }

    public void LJ(RefactorTTReviewCell refactorTTReviewCell) {
    }

    public abstract int LJFF();

    public abstract void LJII(RefactorTTReviewCell refactorTTReviewCell);

    public abstract List<InterfaceC1192080h7u> LJIIIIZZ(RefactorTTReviewCell refactorTTReviewCell);

    public abstract C1192070h7t LJIIIZ(RefactorTTReviewCell refactorTTReviewCell);

    public abstract C1191750h7N LJIIJ(RefactorTTReviewCell refactorTTReviewCell);

    public void LJIIJJI(RefactorTTReviewCell refactorTTReviewCell) {
    }

    public void LJIIL(RefactorTTReviewCell refactorTTReviewCell) {
    }

    public abstract void LJIILIIL(RefactorTTReviewCell refactorTTReviewCell);

    public abstract boolean LJIILJJIL(List<? extends Object> list);

    public C587440N2g LIZLLL(RefactorTTReviewCell refactorTTReviewCell) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" scene has no binders; deleteConfig should not be called.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public View LJI(ViewGroup viewGroup) {
        return C1181430gqj.LIZIZ(viewGroup.getContext(), LJFF(), viewGroup, false);
    }
}

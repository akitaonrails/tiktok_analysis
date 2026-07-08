package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.vendor.RefactorTripAdvisorReviewCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0h82, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192160h82 extends AbstractC1192170h83 {
    public static final C1192160h82 LIZ = new C1192160h82();
    public static final int LIZIZ = R.layout.e21;
    public static final boolean LIZJ = true;

    @Override // X.AbstractC1192170h83
    public final boolean LJ() {
        return LIZJ;
    }

    @Override // X.AbstractC1192170h83
    public final int LJFF() {
        return LIZIZ;
    }

    @Override // X.AbstractC1192170h83
    public final void LIZIZ(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        if (!C297470BlJ.LIZ()) {
            return;
        }
        if (refactorTripAdvisorReviewCell.getBindingAdapterPosition() == 0) {
            refactorTripAdvisorReviewCell.itemView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        } else {
            refactorTripAdvisorReviewCell.itemView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
    }

    @Override // X.AbstractC1192170h83
    public final C1191730h7L LIZJ(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        return new C1191730h7L(AFwS256S0000000_18.get$arr$(626), AFwS206S0000000_18.get$arr$(501), true);
    }

    @Override // X.AbstractC1192170h83
    public final C1191680h7G LJI(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        return new C1191680h7G("poi_reviews", true, new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1974), new AwS597S0100000_18(refactorTripAdvisorReviewCell, 487), 2032);
    }

    @Override // X.AbstractC1192170h83
    public final void LJIIIIZZ(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        PoiReviewsListItemCell.PoiReviewCellVAbility poiReviewCellVAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(refactorTripAdvisorReviewCell);
        InterfaceC1191710h7J interfaceC1191710h7JR0 = null;
        if (fragmentLJIIJ != null && (poiReviewCellVAbility = (PoiReviewsListItemCell.PoiReviewCellVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiReviewsListItemCell.PoiReviewCellVAbility.class, null)) != null) {
            interfaceC1191710h7JR0 = poiReviewCellVAbility.r0();
        }
        refactorTripAdvisorReviewCell.LLILZLL = interfaceC1191710h7JR0;
    }

    @Override // X.AbstractC1192170h83
    public final InterfaceC1192080h7u LJIIIZ(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        final AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1975);
        return new C1191630h7B(awS562S0100000_18) { // from class: X.0h7V
            @Override // X.C1191630h7B
            public final void LJIIIZ(C1191650h7D c1191650h7D, PoiReviewsApi.PoiReviewModel poiReviewModel) {
                int iLIZLLL;
                PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
                if (content != null) {
                    iLIZLLL = (int) C1190820h5s.LIZLLL(content);
                } else {
                    iLIZLLL = 0;
                }
                c1191650h7D.setRating(new C1890307an(iLIZLLL, 5, null));
            }
        };
    }

    @Override // X.AbstractC1192170h83
    public final C1192070h7t LJIIJ(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        return new C1192070h7t(AFwS256S0000000_18.get$arr$(627), AFwS206S0000000_18.get$arr$(502), AFwS206S0000000_18.get$arr$(503), new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1976), new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1977), new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1978), AFwS206S0000000_18.get$arr$(504), null, null, 896);
    }

    @Override // X.AbstractC1192170h83
    public final C1191750h7N LJIIJJI(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        return new C1191750h7N(new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1979), AFwS206S0000000_18.get$arr$(505));
    }

    @Override // X.AbstractC1192170h83
    public final void LJIIL(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        String reviewId;
        InterfaceC1191710h7J interfaceC1191710h7J = refactorTripAdvisorReviewCell.LLILZLL;
        if (interfaceC1191710h7J != null) {
            PoiReviewsApi.PoiReviewModel poiReviewModel = refactorTripAdvisorReviewCell.LLIZ;
            if (poiReviewModel != null) {
                reviewId = poiReviewModel.getReviewId();
            } else {
                reviewId = null;
            }
            interfaceC1191710h7J.JM0(reviewId);
        }
    }

    @Override // X.AbstractC1192170h83
    public final C1192000h7m LJIILIIL(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        return new C1192000h7m(AFwS206S0000000_18.get$arr$(506), true);
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewCellVAbility;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.vendor.RefactorTripAdvisorReviewCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0h85, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192190h85 extends AbstractC1192170h83 {
    public static final C1192190h85 LIZ = new C1192190h85();
    public static final int LIZIZ = R.layout.e1x;

    @Override // X.AbstractC1192170h83
    public final boolean LJ() {
        return false;
    }

    @Override // X.AbstractC1192170h83
    public final int LJFF() {
        return LIZIZ;
    }

    @Override // X.AbstractC1192170h83
    public final void LIZ(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        View viewFindViewById = refactorTripAdvisorReviewCell.itemView.findViewById(R.id.m6p);
        if (viewFindViewById != null) {
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
        }
    }

    @Override // X.AbstractC1192170h83
    public final C1191730h7L LIZJ(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        return new C1191730h7L(AFwS256S0000000_18.get$arr$(624), new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1966), false);
    }

    @Override // X.AbstractC1192170h83
    public final void LIZLLL(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        View viewFindViewById = refactorTripAdvisorReviewCell.itemView.findViewById(R.id.ffs);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View viewFindViewById2 = refactorTripAdvisorReviewCell.itemView.findViewById(R.id.cpg);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View viewFindViewById3 = refactorTripAdvisorReviewCell.itemView.findViewById(R.id.mnd);
        if (viewFindViewById3 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
        }
        View viewFindViewById4 = refactorTripAdvisorReviewCell.itemView.findViewById(R.id.fxn);
        if (viewFindViewById4 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById4);
        }
        View viewFindViewById5 = refactorTripAdvisorReviewCell.itemView.findViewById(R.id.cpi);
        if (viewFindViewById5 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById5);
        }
        View viewFindViewById6 = refactorTripAdvisorReviewCell.itemView.findViewById(R.id.mnf);
        if (viewFindViewById6 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById6);
        }
        View viewFindViewById7 = refactorTripAdvisorReviewCell.itemView.findViewById(R.id.fxo);
        if (viewFindViewById7 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById7);
        }
        View viewFindViewById8 = refactorTripAdvisorReviewCell.itemView.findViewById(R.id.cpj);
        if (viewFindViewById8 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById8);
        }
        View viewFindViewById9 = refactorTripAdvisorReviewCell.itemView.findViewById(R.id.mng);
        if (viewFindViewById9 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById9);
        }
    }

    @Override // X.AbstractC1192170h83
    public final C1191680h7G LJI(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        return new C1191680h7G("poi_detail_reviews", false, null, null, 2044);
    }

    @Override // X.AbstractC1192170h83
    public final View LJII(ViewGroup viewGroup) {
        if (SlashComponentUIPreloadExp.LIZ("poi_review")) {
            return C1181430gqj.LIZIZ(viewGroup.getContext(), LIZIZ, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), LIZIZ, viewGroup, false);
    }

    @Override // X.AbstractC1192170h83
    public final void LJIIIIZZ(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        PoiReviewCellVAbility poiReviewCellVAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(refactorTripAdvisorReviewCell);
        InterfaceC1191710h7J interfaceC1191710h7JR0 = null;
        if (fragmentLJIIJ != null && (poiReviewCellVAbility = (PoiReviewCellVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiReviewCellVAbility.class, null)) != null) {
            interfaceC1191710h7JR0 = poiReviewCellVAbility.r0();
        }
        refactorTripAdvisorReviewCell.LLILZLL = interfaceC1191710h7JR0;
    }

    @Override // X.AbstractC1192170h83
    public final InterfaceC1192080h7u LJIIIZ(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        final AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1967);
        return new C1191690h7H(awS562S0100000_18) { // from class: X.0h7M
            {
                AFwS302S0000000_18 aFwS302S0000000_18 = AFwS302S0000000_18.get$arr$(25);
                AFwS302S0000000_18 aFwS302S0000000_182 = AFwS302S0000000_18.get$arr$(26);
                AFwS302S0000000_18 aFwS302S0000000_183 = AFwS302S0000000_18.get$arr$(27);
            }

            @Override // X.C1191630h7B
            public final void LJIIIZ(C1191650h7D c1191650h7D, PoiReviewsApi.PoiReviewModel poiReviewModel) {
                int color;
                Context context;
                View viewLJIIJJI = LJIIJJI();
                int iLIZLLL = 0;
                if (viewLJIIJJI != null && (context = viewLJIIJJI.getContext()) != null && C960203pA.LIZIZ(context)) {
                    color = ColorProtector.parseColor("#00EB5B");
                } else {
                    color = ColorProtector.parseColor("#00B747");
                }
                PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
                if (content != null) {
                    iLIZLLL = (int) C1190820h5s.LIZLLL(content);
                }
                c1191650h7D.setRating(new C1890307an(iLIZLLL, 5, Integer.valueOf(color)));
            }
        };
    }

    @Override // X.AbstractC1192170h83
    public final C1192070h7t LJIIJ(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        return new C1192070h7t(AFwS256S0000000_18.get$arr$(625), AFwS206S0000000_18.get$arr$(498), AFwS206S0000000_18.get$arr$(499), new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1968), new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1969), new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1970), AFwS206S0000000_18.get$arr$(500), null, null, 896);
    }

    @Override // X.AbstractC1192170h83
    public final C1191750h7N LJIIJJI(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        return new C1191750h7N(new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1971), new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1972));
    }

    @Override // X.AbstractC1192170h83
    public final C1192000h7m LJIILIIL(RefactorTripAdvisorReviewCell refactorTripAdvisorReviewCell) {
        return new C1192000h7m(new AwS562S0100000_18(refactorTripAdvisorReviewCell, 1973), false);
    }
}

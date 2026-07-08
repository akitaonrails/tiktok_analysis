package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewCellVAbility;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.vendor.RefactorTabelogReviewCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0h84, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192180h84 extends AbstractC1192150h81 {
    public static final C1192180h84 LIZ = new C1192180h84();
    public static final int LIZIZ = R.layout.e1x;

    @Override // X.AbstractC1192150h81
    public final boolean LJ() {
        return false;
    }

    @Override // X.AbstractC1192150h81
    public final int LJFF() {
        return LIZIZ;
    }

    @Override // X.AbstractC1192150h81
    public final void LIZ(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        View viewFindViewById = refactorTabelogReviewCell.itemView.findViewById(R.id.m6p);
        if (viewFindViewById != null) {
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
        }
    }

    @Override // X.AbstractC1192150h81
    public final C1191730h7L LIZJ(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        return new C1191730h7L(AFwS256S0000000_18.get$arr$(620), new AwS562S0100000_18(refactorTabelogReviewCell, 1951), false);
    }

    @Override // X.AbstractC1192150h81
    public final void LIZLLL(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        View viewFindViewById = refactorTabelogReviewCell.itemView.findViewById(R.id.ffs);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View viewFindViewById2 = refactorTabelogReviewCell.itemView.findViewById(R.id.cpg);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View viewFindViewById3 = refactorTabelogReviewCell.itemView.findViewById(R.id.mnd);
        if (viewFindViewById3 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
        }
        View viewFindViewById4 = refactorTabelogReviewCell.itemView.findViewById(R.id.fxn);
        if (viewFindViewById4 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById4);
        }
        View viewFindViewById5 = refactorTabelogReviewCell.itemView.findViewById(R.id.cpi);
        if (viewFindViewById5 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById5);
        }
        View viewFindViewById6 = refactorTabelogReviewCell.itemView.findViewById(R.id.mnf);
        if (viewFindViewById6 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById6);
        }
        View viewFindViewById7 = refactorTabelogReviewCell.itemView.findViewById(R.id.fxo);
        if (viewFindViewById7 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById7);
        }
        View viewFindViewById8 = refactorTabelogReviewCell.itemView.findViewById(R.id.cpj);
        if (viewFindViewById8 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById8);
        }
        View viewFindViewById9 = refactorTabelogReviewCell.itemView.findViewById(R.id.mng);
        if (viewFindViewById9 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById9);
        }
    }

    @Override // X.AbstractC1192150h81
    public final C1191680h7G LJI(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        return new C1191680h7G("poi_detail_reviews", false, null, null, 2044);
    }

    @Override // X.AbstractC1192150h81
    public final View LJII(ViewGroup viewGroup) {
        if (SlashComponentUIPreloadExp.LIZ("poi_review")) {
            return C1181430gqj.LIZIZ(viewGroup.getContext(), LIZIZ, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), LIZIZ, viewGroup, false);
    }

    @Override // X.AbstractC1192150h81
    public final void LJIIIIZZ(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        PoiReviewCellVAbility poiReviewCellVAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(refactorTabelogReviewCell);
        InterfaceC1191710h7J interfaceC1191710h7JR0 = null;
        if (fragmentLJIIJ != null && (poiReviewCellVAbility = (PoiReviewCellVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiReviewCellVAbility.class, null)) != null) {
            interfaceC1191710h7JR0 = poiReviewCellVAbility.r0();
        }
        refactorTabelogReviewCell.LLILZLL = interfaceC1191710h7JR0;
    }

    @Override // X.AbstractC1192150h81
    public final InterfaceC1192080h7u LJIIIZ(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        final AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(refactorTabelogReviewCell, 1952);
        return new C1191690h7H(awS562S0100000_18) { // from class: X.0h7e
            {
                AFwS302S0000000_18 aFwS302S0000000_18 = AFwS302S0000000_18.get$arr$(22);
                AFwS302S0000000_18 aFwS302S0000000_182 = AFwS302S0000000_18.get$arr$(23);
                AFwS302S0000000_18 aFwS302S0000000_183 = AFwS302S0000000_18.get$arr$(24);
            }

            @Override // X.C1191630h7B
            public final void LJIIJ(PoiReviewsApi.PoiReviewModel poiReviewModel) {
                C1191650h7D c1191650h7D = this.LIZIZ;
                if (c1191650h7D != null) {
                    c1191650h7D.setRatingActiveColor(ColorProtector.parseColor("#ED742E"));
                }
            }
        };
    }

    @Override // X.AbstractC1192150h81
    public final C1192070h7t LJIIJ(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        return new C1192070h7t(AFwS256S0000000_18.get$arr$(621), AFwS206S0000000_18.get$arr$(489), AFwS206S0000000_18.get$arr$(490), new AwS562S0100000_18(refactorTabelogReviewCell, 1953), new AwS562S0100000_18(refactorTabelogReviewCell, 1954), new AwS562S0100000_18(refactorTabelogReviewCell, 1955), AFwS206S0000000_18.get$arr$(491), null, null, 896);
    }

    @Override // X.AbstractC1192150h81
    public final C1191750h7N LJIIJJI(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        return new C1191750h7N(new AwS562S0100000_18(refactorTabelogReviewCell, 1956), new AwS562S0100000_18(refactorTabelogReviewCell, 1957));
    }

    @Override // X.AbstractC1192150h81
    public final C1192000h7m LJIILIIL(RefactorTabelogReviewCell refactorTabelogReviewCell) {
        return new C1192000h7m(new AwS562S0100000_18(refactorTabelogReviewCell, 1958), false);
    }
}

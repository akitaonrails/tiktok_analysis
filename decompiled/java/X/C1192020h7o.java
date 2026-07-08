package X;

import Y.ACListenerS153S0100000_18;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsFoldedReviewCell;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.RefactorTTReviewCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS70S0210000_18;

/* JADX INFO: renamed from: X.0h7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192020h7o extends AbstractC1192060h7s {
    public static final C1192020h7o LIZ = new C1192020h7o();
    public static final int LIZIZ = R.layout.e21;

    @Override // X.AbstractC1192060h7s
    public final int LJFF() {
        return LIZIZ;
    }

    @Override // X.AbstractC1192060h7s
    public final void LIZJ(RefactorTTReviewCell refactorTTReviewCell) {
        C1191980h7k.LIZ(refactorTTReviewCell);
        C1191980h7k.LIZLLL(refactorTTReviewCell);
    }

    @Override // X.AbstractC1192060h7s
    public final C587440N2g LIZLLL(RefactorTTReviewCell refactorTTReviewCell) {
        return new C587440N2g(new AwS562S0100000_18(refactorTTReviewCell, 1904), new AwS562S0100000_18(refactorTTReviewCell, 1905), true);
    }

    @Override // X.AbstractC1192060h7s
    public final void LJII(RefactorTTReviewCell refactorTTReviewCell) {
        PoiReviewsFoldedReviewCell.PoiReviewCellVAbility poiReviewCellVAbility;
        boolean z;
        C1190230h4v c1190230h4vG1;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(refactorTTReviewCell);
        InterfaceC1191710h7J interfaceC1191710h7JR0 = null;
        if (fragmentLJIIJ != null) {
            poiReviewCellVAbility = (PoiReviewsFoldedReviewCell.PoiReviewCellVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiReviewsFoldedReviewCell.PoiReviewCellVAbility.class, null);
            if (poiReviewCellVAbility != null) {
                interfaceC1191710h7JR0 = poiReviewCellVAbility.r0();
            }
        } else {
            poiReviewCellVAbility = null;
        }
        refactorTTReviewCell.LLILZLL = interfaceC1191710h7JR0;
        if (poiReviewCellVAbility != null && (c1190230h4vG1 = poiReviewCellVAbility.G1()) != null) {
            z = c1190230h4vG1.LIZ;
        } else {
            z = true;
        }
        refactorTTReviewCell.LLIZLLLIL = z;
    }

    @Override // X.AbstractC1192060h7s
    public final List<InterfaceC1192080h7u> LJIIIIZZ(RefactorTTReviewCell refactorTTReviewCell) {
        return C13LP.LJLILLLLZI(refactorTTReviewCell.U5(), C13LP.LJLILLLLZI(refactorTTReviewCell.V5(), C13LP.LJLILLLLZI(refactorTTReviewCell.T5(), C13LP.LJLILLLLZI(C1191980h7k.LJIIJ(refactorTTReviewCell, this), C13LP.LJLILLLLZI(C1191980h7k.LJIIIZ(refactorTTReviewCell), C1191980h7k.LJ(refactorTTReviewCell, this))))));
    }

    @Override // X.AbstractC1192060h7s
    public final C1192070h7t LJIIIZ(RefactorTTReviewCell refactorTTReviewCell) {
        return new C1192070h7t(AFwS256S0000000_18.get$arr$(618), new AwS562S0100000_18(refactorTTReviewCell, 1906), AFwS206S0000000_18.get$arr$(485), new AwS562S0100000_18(refactorTTReviewCell, 1907), new AwS562S0100000_18(refactorTTReviewCell, 1908), new AwS562S0100000_18(refactorTTReviewCell, 1909), new AwS562S0100000_18(refactorTTReviewCell, 1910), null, null, 896);
    }

    @Override // X.AbstractC1192060h7s
    public final C1191750h7N LJIIJ(RefactorTTReviewCell refactorTTReviewCell) {
        return new C1191750h7N(new AwS562S0100000_18(refactorTTReviewCell, 1911), AFwS206S0000000_18.get$arr$(486));
    }

    @Override // X.AbstractC1192060h7s
    public final void LJIILIIL(RefactorTTReviewCell refactorTTReviewCell) {
        C2211631BhB.LJ(refactorTTReviewCell.itemView, new AwS70S0210000_18(refactorTTReviewCell, (RefactorTTReviewCell) true, (boolean) AFwS206S0000000_18.get$arr$(753), (Function0<Unit>) 8));
        View viewFindViewById = refactorTTReviewCell.itemView.findViewById(R.id.ths);
        if (viewFindViewById != null) {
            C2211631BhB.LJ(viewFindViewById, new AwS597S0100000_18(refactorTTReviewCell, 965));
        }
    }

    @Override // X.AbstractC1192060h7s
    public final boolean LJIILJJIL(List<? extends Object> list) {
        Object objLJJJLL = C13LP.LJJJLL(list);
        if ((objLJJJLL instanceof C1190010h4Z) || (objLJJJLL instanceof C1190190h4r) || (objLJJJLL instanceof C00I5)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1192060h7s
    public final void LIZIZ(RefactorTTReviewCell refactorTTReviewCell, PoiReviewsApi.PoiReviewModel poiReviewModel) {
        String str;
        InterfaceC1191710h7J interfaceC1191710h7J;
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
        if (content != null) {
            str = content.translatedContent;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str) && (interfaceC1191710h7J = refactorTTReviewCell.LLILZLL) != null) {
            interfaceC1191710h7J.Ez1(poiReviewModel, !poiReviewModel.getWantTranslate());
        }
        C1191980h7k.LJIIIIZZ(poiReviewModel, refactorTTReviewCell);
        View view = refactorTTReviewCell.LLJILJILJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C1191980h7k.LIZIZ(poiReviewModel, refactorTTReviewCell);
        C786410Ut5.I7(new ACListenerS153S0100000_18(refactorTTReviewCell, 98), refactorTTReviewCell.itemView);
        refactorTTReviewCell.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(refactorTTReviewCell, 15));
        C1191980h7k.LIZJ(poiReviewModel, refactorTTReviewCell);
    }
}

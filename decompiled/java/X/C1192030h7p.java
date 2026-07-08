package X;

import Y.ACListenerS121S0200000_18;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192030h7p extends AbstractC1192060h7s {
    public static final C1192030h7p LIZ = new C1192030h7p();
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
        return new C587440N2g(new AwS562S0100000_18(refactorTTReviewCell, 1912), new AwS562S0100000_18(refactorTTReviewCell, 1913), true);
    }

    @Override // X.AbstractC1192060h7s
    public final void LJII(RefactorTTReviewCell refactorTTReviewCell) {
        boolean z;
        C1190690h5f c1190690h5fG1;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(refactorTTReviewCell);
        PoiReviewsListItemCell.PoiReviewCellVAbility poiReviewCellVAbility = null;
        if (fragmentLJIIJ != null) {
            poiReviewCellVAbility = (PoiReviewsListItemCell.PoiReviewCellVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiReviewsListItemCell.PoiReviewCellVAbility.class, null);
        }
        AssemVMLazy assemVMLazy = refactorTTReviewCell.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RefactorTTReviewCell.LLJLILLLLZIIL;
        refactorTTReviewCell.LLILZLL = (PoiReviewsListViewModel) assemVMLazy.getValue();
        if (poiReviewCellVAbility != null && (c1190690h5fG1 = poiReviewCellVAbility.G1()) != null) {
            z = c1190690h5fG1.LIZ;
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
        return new C1192070h7t(AFwS256S0000000_18.get$arr$(619), new AwS562S0100000_18(refactorTTReviewCell, 1914), AFwS206S0000000_18.get$arr$(487), new AwS562S0100000_18(refactorTTReviewCell, 1915), new AwS562S0100000_18(refactorTTReviewCell, 1916), new AwS562S0100000_18(refactorTTReviewCell, 1917), new AwS562S0100000_18(refactorTTReviewCell, 1918), null, null, 896);
    }

    @Override // X.AbstractC1192060h7s
    public final C1191750h7N LJIIJ(RefactorTTReviewCell refactorTTReviewCell) {
        return new C1191750h7N(new AwS562S0100000_18(refactorTTReviewCell, 1919), AFwS206S0000000_18.get$arr$(488));
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
        return C13LP.LJJJLL(list) instanceof C1190010h4Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1192060h7s
    public final void LIZIZ(RefactorTTReviewCell refactorTTReviewCell, PoiReviewsApi.PoiReviewModel poiReviewModel) {
        String str;
        PoiReviewsApi.PoiReviewModel poiReviewModel2;
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
            int i = 0;
            if (C1190820h5s.LJFF((PoiReviewsApi.PoiReviewModel) refactorTTReviewCell.getItem()) && !C1190820h5s.LJII((PoiReviewsApi.PoiReviewModel) refactorTTReviewCell.getItem()) && ((poiReviewModel2 = (PoiReviewsApi.PoiReviewModel) refactorTTReviewCell.getItem()) == null || !Intrinsics.LJFF(poiReviewModel2.isLocalAdded(), Boolean.TRUE))) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        C1191980h7k.LIZIZ(poiReviewModel, refactorTTReviewCell);
        if (C1191360h6k.LIZ() && poiReviewModel.getScene() == EnumC1189990h4X.POI_DETAIL_PAGE) {
            C786410Ut5.I7(new ACListenerS121S0200000_18(poiReviewModel, refactorTTReviewCell, 27), refactorTTReviewCell.itemView);
        }
        refactorTTReviewCell.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(refactorTTReviewCell, 16));
        C1191980h7k.LIZJ(poiReviewModel, refactorTTReviewCell);
    }
}

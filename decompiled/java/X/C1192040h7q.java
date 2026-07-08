package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.RefactorTTReviewCell;
import com.ss.android.ugc.aweme.poi.reviews.tab.adapter.PoiCommentReviewCellVAbility;
import com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS70S0210000_18;

/* JADX INFO: renamed from: X.0h7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192040h7q extends AbstractC1192060h7s {
    public static final C1192040h7q LIZ = new C1192040h7q();
    public static final int LIZIZ = R.layout.e21;

    @Override // X.AbstractC1192060h7s
    public final int LJFF() {
        return LIZIZ;
    }

    @Override // X.AbstractC1192060h7s
    public final void LIZ(RefactorTTReviewCell refactorTTReviewCell) {
        C427690Gpr.LJ(refactorTTReviewCell.itemView, 0.0f);
    }

    @Override // X.AbstractC1192060h7s
    public final void LJ(RefactorTTReviewCell refactorTTReviewCell) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.LayoutParams layoutParams;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        C1203280hPy c1203280hPy;
        C1202300hOO c1202300hOO;
        ViewGroup.MarginLayoutParams marginLayoutParams6;
        View viewFindViewById = refactorTTReviewCell.itemView.findViewById(R.id.ujd);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View viewFindViewById2 = refactorTTReviewCell.itemView.findViewById(R.id.cpg);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View viewFindViewById3 = refactorTTReviewCell.itemView.findViewById(R.id.cpi);
        if (viewFindViewById3 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
        }
        View viewFindViewById4 = refactorTTReviewCell.itemView.findViewById(R.id.tht);
        if (viewFindViewById4 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById4);
        }
        View viewFindViewById5 = refactorTTReviewCell.itemView.findViewById(R.id.ffv);
        if (viewFindViewById5 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById5);
        }
        View viewFindViewById6 = refactorTTReviewCell.itemView.findViewById(R.id.f707g3a);
        if (viewFindViewById6 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById6);
        }
        View viewFindViewById7 = refactorTTReviewCell.itemView.findViewById(R.id.g3b);
        if (viewFindViewById7 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById7);
        }
        View viewFindViewById8 = refactorTTReviewCell.itemView.findViewById(R.id.yky);
        if (viewFindViewById8 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById8);
        }
        View viewFindViewById9 = refactorTTReviewCell.itemView.findViewById(R.id.bpv);
        if (viewFindViewById9 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById9);
        }
        C1202300hOO c1202300hOO2 = (C1202300hOO) refactorTTReviewCell.LLLZIL("expandableText.tvContent");
        if (c1202300hOO2 != null) {
            int iLIZ = C295050BhP.LIZ();
            if (Build.VERSION.SDK_INT >= 26 && iLIZ > 0) {
                c1202300hOO2.setTypeface(C1697580uHE.LIZIZ(0.0f, iLIZ, 0.0f, 0.0f, null, 0.0f, 0, null, 253));
            } else {
                CommentService.LIZ.getClass();
                C523420Kfs.LIZ().LJLJI(c1202300hOO2);
                C523420Kfs.LIZ().LJJJ(c1202300hOO2);
            }
        }
        View viewFindViewById10 = refactorTTReviewCell.itemView.findViewById(R.id.text);
        if (viewFindViewById10 != null) {
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById10.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams6.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
                C786410Ut5.W5(viewFindViewById10, marginLayoutParams6);
            }
            if ((viewFindViewById10 instanceof C1202300hOO) && (c1202300hOO = (C1202300hOO) viewFindViewById10) != null) {
                c1202300hOO.setLimitedMaxLines(5);
            }
        }
        refactorTTReviewCell.itemView.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
        View viewFindViewById11 = refactorTTReviewCell.itemView.findViewById(R.id.bh2);
        if (viewFindViewById11 != null) {
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById11.getLayoutParams();
            layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            C786410Ut5.W5(viewFindViewById11, layoutParams3);
        }
        TuxTextView tuxTextView = (TuxTextView) refactorTTReviewCell.itemView.findViewById(R.id.p09);
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(62);
            tuxTextView.setTextColorRes(R.attr.a1k);
        }
        View viewFindViewById12 = refactorTTReviewCell.itemView.findViewById(R.id.srg);
        if (viewFindViewById12 != null && (viewFindViewById12 instanceof C1203280hPy) && (c1203280hPy = (C1203280hPy) viewFindViewById12) != null) {
            c1203280hPy.setRatingIconSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        View viewFindViewById13 = refactorTTReviewCell.itemView.findViewById(R.id.kc4);
        if (viewFindViewById13 != null) {
            ViewGroup.LayoutParams layoutParams4 = viewFindViewById13.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                marginLayoutParams5.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                C786410Ut5.W5(viewFindViewById13, marginLayoutParams5);
            }
        }
        View viewFindViewById14 = refactorTTReviewCell.itemView.findViewById(R.id.tgq);
        if (viewFindViewById14 != null) {
            viewFindViewById14.setPadding(viewFindViewById14.getPaddingStart(), 0, viewFindViewById14.getPaddingEnd(), viewFindViewById14.getPaddingBottom());
        }
        ViewGroup viewGroup = (ViewGroup) refactorTTReviewCell.itemView.findViewById(R.id.tgq);
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (!(childAt instanceof SmartImageView) && (i = (layoutParams = childAt.getLayoutParams()).width) != -1 && i != -2) {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                    C786410Ut5.W5(childAt, layoutParams);
                }
            }
        }
        View viewFindViewById15 = refactorTTReviewCell.itemView.findViewById(R.id.mnv);
        if (viewFindViewById15 != null) {
            ViewGroup.LayoutParams layoutParams5 = viewFindViewById15.getLayoutParams();
            layoutParams5.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            layoutParams5.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            C786410Ut5.W5(viewFindViewById15, layoutParams5);
        }
        TuxTextView tuxTextView2 = (TuxTextView) refactorTTReviewCell.itemView.findViewById(R.id.mnh);
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(71);
            ViewGroup.LayoutParams layoutParams6 = tuxTextView2.getLayoutParams();
            if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                marginLayoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                marginLayoutParams4.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                C786410Ut5.R6(tuxTextView2, marginLayoutParams4);
            }
        }
        View viewFindViewById16 = refactorTTReviewCell.itemView.findViewById(R.id.mnd);
        if (viewFindViewById16 != null) {
            viewFindViewById16.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            ViewGroup.LayoutParams layoutParams7 = viewFindViewById16.getLayoutParams();
            if ((layoutParams7 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                marginLayoutParams3.topMargin = 0;
                C786410Ut5.W5(viewFindViewById16, marginLayoutParams3);
            }
        }
        View viewFindViewById17 = refactorTTReviewCell.itemView.findViewById(R.id.olm);
        if (viewFindViewById17 != null) {
            viewFindViewById17.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
            ViewGroup.LayoutParams layoutParams8 = viewFindViewById17.getLayoutParams();
            if ((layoutParams8 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams8) != null) {
                marginLayoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                C786410Ut5.W5(viewFindViewById17, marginLayoutParams2);
            }
        }
        View viewFindViewById18 = refactorTTReviewCell.itemView.findViewById(R.id.oln);
        if (viewFindViewById18 != null) {
            ViewGroup.LayoutParams layoutParams9 = viewFindViewById18.getLayoutParams();
            layoutParams9.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            layoutParams9.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            C786410Ut5.W5(viewFindViewById18, layoutParams9);
        }
        View viewFindViewById19 = refactorTTReviewCell.itemView.findViewById(R.id.oln);
        if (viewFindViewById19 != null) {
            ViewGroup.LayoutParams layoutParams10 = viewFindViewById19.getLayoutParams();
            if ((layoutParams10 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams10) != null) {
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                C786410Ut5.W5(viewFindViewById19, marginLayoutParams);
            }
        }
    }

    @Override // X.AbstractC1192060h7s
    public final void LJII(RefactorTTReviewCell refactorTTReviewCell) {
        PoiCommentReviewCellVAbility poiCommentReviewCellVAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(refactorTTReviewCell);
        PoiCommentReviewListVM poiCommentReviewListVMJM2 = null;
        if (fragmentLJIIJ != null && (poiCommentReviewCellVAbility = (PoiCommentReviewCellVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiCommentReviewCellVAbility.class, null)) != null) {
            poiCommentReviewListVMJM2 = poiCommentReviewCellVAbility.jM2();
        }
        refactorTTReviewCell.LLILZLL = poiCommentReviewListVMJM2;
    }

    @Override // X.AbstractC1192060h7s
    public final List<InterfaceC1192080h7u> LJIIIIZZ(RefactorTTReviewCell refactorTTReviewCell) {
        return C13LP.LJLILLLLZI(refactorTTReviewCell.U5(), C13LP.LJLILLLLZI(refactorTTReviewCell.V5(), C13LP.LJLILLLLZI(C1191980h7k.LJIIIZ(refactorTTReviewCell), C1191980h7k.LJ(refactorTTReviewCell, this))));
    }

    @Override // X.AbstractC1192060h7s
    public final C1192070h7t LJIIIZ(RefactorTTReviewCell refactorTTReviewCell) {
        return new C1192070h7t(AFwS256S0000000_18.get$arr$(613), AFwS206S0000000_18.get$arr$(477), AFwS206S0000000_18.get$arr$(478), new AwS562S0100000_18(refactorTTReviewCell, 1891), new AwS562S0100000_18(refactorTTReviewCell, 1892), new AwS562S0100000_18(refactorTTReviewCell, 1893), AFwS206S0000000_18.get$arr$(479), AFwS206S0000000_18.get$arr$(480), AFwS256S0000000_18.get$arr$(614), 256);
    }

    @Override // X.AbstractC1192060h7s
    public final C1191750h7N LJIIJ(RefactorTTReviewCell refactorTTReviewCell) {
        return new C1191750h7N(AFwS206S0000000_18.get$arr$(481), AFwS206S0000000_18.get$arr$(482), AFwS206S0000000_18.get$arr$(483), AFwS256S0000000_18.get$arr$(615), AFwS256S0000000_18.get$arr$(616));
    }

    @Override // X.AbstractC1192060h7s
    public final void LJIIJJI(RefactorTTReviewCell refactorTTReviewCell) {
        InterfaceC1191710h7J interfaceC1191710h7J = refactorTTReviewCell.LLILZLL;
        if (interfaceC1191710h7J != null) {
            interfaceC1191710h7J.iC(null);
        }
    }

    @Override // X.AbstractC1192060h7s
    public final void LJIILIIL(RefactorTTReviewCell refactorTTReviewCell) {
        C2211631BhB.LJ(refactorTTReviewCell.itemView, new AwS70S0210000_18(refactorTTReviewCell, (RefactorTTReviewCell) false, (boolean) new AwS562S0100000_18(refactorTTReviewCell, 1894), (Function0<Unit>) 8));
    }

    @Override // X.AbstractC1192060h7s
    public final boolean LJIILJJIL(List<? extends Object> list) {
        return C13LP.LJJJLL(list) instanceof C1190190h4r;
    }

    @Override // X.AbstractC1192060h7s
    public final void LIZIZ(RefactorTTReviewCell refactorTTReviewCell, PoiReviewsApi.PoiReviewModel poiReviewModel) {
        String str;
        long jLongValue;
        Long l;
        int i;
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
            if (C1190820h5s.LJFF(poiReviewModel) && !C1190820h5s.LJII(poiReviewModel)) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        TuxTextView tuxTextView = (TuxTextView) refactorTTReviewCell.itemView.findViewById(R.id.ffs);
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            Context context = tuxTextView.getContext();
            PoiReviewsApi.PoiReviewBasicInfoModel basicInfo = poiReviewModel.getBasicInfo();
            if (basicInfo != null && (l = basicInfo.createTime) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            tuxTextView.setText(C1356610lPH.LIZJ(jLongValue * ((long) LSPassThroughRecordSizeConfig.DEFAULT), context));
        }
    }
}

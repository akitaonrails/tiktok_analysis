package X;

import Y.ACListenerS121S0200000_18;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.RefactorTTReviewCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191980h7k {
    public static final void LIZ(RefactorTTReviewCell refactorTTReviewCell) {
        View view;
        C19ME c19me;
        if (C297470BlJ.LIZ() && (view = (View) refactorTTReviewCell.LLLZIL("translate.areaSeeOriginal")) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                c19me.startToStart = R.id.ji7;
                c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                C786410Ut5.W5(view, c19me);
            }
        }
    }

    public static final void LIZLLL(RefactorTTReviewCell refactorTTReviewCell) {
        C19ME c19me;
        C19ME c19me2;
        TuxIconView tuxIconView;
        if (!C297470BlJ.LIZ()) {
            return;
        }
        View view = refactorTTReviewCell.LLJILLL;
        if (view != null) {
            if ((view instanceof TuxIconView) && (tuxIconView = (TuxIconView) view) != null) {
                tuxIconView.setTintColorRes(R.attr.a1j);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null) {
                c19me2.startToStart = R.id.ji7;
                c19me2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                C786410Ut5.W5(view, c19me2);
            }
        }
        View view2 = refactorTTReviewCell.LLJILJILJ;
        if (view2 != null) {
            C1189060h32.LJJII(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 0);
        }
        TuxIconView tuxIconView2 = (TuxIconView) refactorTTReviewCell.LLLZIL("like.icon");
        if (tuxIconView2 != null) {
            tuxIconView2.setTintColorRes(R.attr.a1j);
        }
        View viewFindViewById = refactorTTReviewCell.itemView.findViewById(R.id.tht);
        if (viewFindViewById != null) {
            C1189060h32.LJJII(viewFindViewById, 0, 0, 0, 0);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                c19me.startToStart = R.id.ji7;
                c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                c19me.endToStart = R.id.cpg;
                C786410Ut5.W5(viewFindViewById, c19me);
            }
        }
    }

    public static final boolean LJFF(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
        if (content != null && content.images != null && !poiReviewModel.getContent().images.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final C1191670h7F LJIIIZ(RefactorTTReviewCell refactorTTReviewCell) {
        C1191700h7I c1191700h7I;
        int i;
        int i2;
        int i3;
        AbstractC1192060h7s abstractC1192060h7sX5 = refactorTTReviewCell.X5();
        if (Intrinsics.LJFF(abstractC1192060h7sX5, C1192010h7n.LIZ)) {
            if (C1191340h6i.LIZIZ()) {
                i = R.id.mng;
            } else {
                i = R.id.mnf;
            }
            if (C1191340h6i.LIZIZ()) {
                i2 = R.id.mny;
            } else {
                i2 = R.id.mnx;
            }
            if (C1191340h6i.LIZIZ()) {
                i3 = R.id.mnj;
            } else {
                i3 = R.id.mni;
            }
            c1191700h7I = new C1191700h7I(i, i2, i3, new AwS597S0100000_18(refactorTTReviewCell, 962), refactorTTReviewCell.LLJIJIL, null, null, null, null, false, false, 16320);
        } else if (Intrinsics.LJFF(abstractC1192060h7sX5, C1192040h7q.LIZ)) {
            c1191700h7I = new C1191700h7I(R.id.mnd, R.id.mnv, R.id.mnh, AFwS256S0000000_18.get$arr$(981), false, AFwS206S0000000_18.get$arr$(750), AFwS256S0000000_18.get$arr$(983), AFwS256S0000000_18.get$arr$(984), AFwS206S0000000_18.get$arr$(751), true, true, 128);
        } else {
            c1191700h7I = new C1191700h7I(R.id.mnd, R.id.mnv, R.id.mnh, new AwS597S0100000_18(refactorTTReviewCell, 963), refactorTTReviewCell.LLJIJIL, null, null, null, null, false, false, 16320);
        }
        return new C1191670h7F(new AwS562S0100000_18(refactorTTReviewCell, 2656), new AwS562S0100000_18(refactorTTReviewCell, 2657), new AwS562S0100000_18(refactorTTReviewCell, 2658), c1191700h7I);
    }

    public static final void LIZIZ(PoiReviewsApi.PoiReviewModel poiReviewModel, RefactorTTReviewCell refactorTTReviewCell) {
        TuxTextView tuxTextView = (TuxTextView) refactorTTReviewCell.itemView.findViewById(R.id.ffv);
        TuxTextView tuxTextView2 = (TuxTextView) refactorTTReviewCell.itemView.findViewById(R.id.f707g3a);
        PoiReviewsApi.PoiReviewBasicInfoModel basicInfo = poiReviewModel.getBasicInfo();
        if (basicInfo != null && basicInfo.createTime != null) {
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
        } else {
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        }
        if (tuxTextView != null) {
            tuxTextView.setText(RefactorTTReviewCell.S5(poiReviewModel));
        }
    }

    public static final void LIZJ(PoiReviewsApi.PoiReviewModel poiReviewModel, RefactorTTReviewCell refactorTTReviewCell) {
        C19ME c19me;
        C19ME c19me2;
        C19ME c19me3;
        C19ME c19me4;
        C19ME c19me5;
        C19ME c19me6;
        if (!C297470BlJ.LIZ()) {
            return;
        }
        if (refactorTTReviewCell.getBindingAdapterPosition() == 0) {
            refactorTTReviewCell.itemView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        } else {
            refactorTTReviewCell.itemView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        }
        View viewFindViewById = refactorTTReviewCell.itemView.findViewById(R.id.tht);
        String str = null;
        if (poiReviewModel.getHasFoldedReviews()) {
            View view = refactorTTReviewCell.LLJILJILJ;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (c19me6 = (C19ME) layoutParams) != null) {
                    c19me6.topToTop = -1;
                    c19me6.topToBottom = R.id.kc4;
                    c19me6.endToEnd = 0;
                    ((ViewGroup.MarginLayoutParams) c19me6).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C786410Ut5.W5(view, c19me6);
                }
            }
            View view2 = refactorTTReviewCell.LLJILLL;
            if (view2 != null) {
                C1189060h32.LJJII(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 0);
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if ((layoutParams2 instanceof C19ME) && (c19me5 = (C19ME) layoutParams2) != null) {
                    c19me5.startToStart = -1;
                    c19me5.startToEnd = R.id.tht;
                    c19me5.endToStart = R.id.mnd;
                    C786410Ut5.W5(view2, c19me5);
                }
            }
            View view3 = refactorTTReviewCell.LLJILLL;
            if ((view3 != null && view3.isShown()) || viewFindViewById == null) {
                return;
            }
            C1189060h32.LJJII(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 0);
            return;
        }
        if (LJFF(poiReviewModel) && C1EDK.LIZIZ()) {
            PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
            if (content != null) {
                str = content.translatedContent;
            }
            if (C123100dR.LIZ(str)) {
                View view4 = refactorTTReviewCell.LLJILJILJ;
                if (view4 != null) {
                    ViewGroup.LayoutParams layoutParams3 = view4.getLayoutParams();
                    if ((layoutParams3 instanceof C19ME) && (c19me4 = (C19ME) layoutParams3) != null) {
                        c19me4.topToTop = R.id.ujd;
                        c19me4.topToBottom = -1;
                        c19me4.endToEnd = 0;
                        ((ViewGroup.MarginLayoutParams) c19me4).topMargin = 0;
                        C786410Ut5.W5(view4, c19me4);
                    }
                }
                View view5 = refactorTTReviewCell.LLJILLL;
                if (view5 == null) {
                    return;
                }
                C1189060h32.LJJII(view5, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), 0);
                ViewGroup.LayoutParams layoutParams4 = view5.getLayoutParams();
                if (!(layoutParams4 instanceof C19ME) || (c19me3 = (C19ME) layoutParams4) == null) {
                    return;
                }
                c19me3.startToStart = -1;
                c19me3.startToEnd = -1;
                c19me3.endToStart = R.id.mnd;
                C786410Ut5.W5(view5, c19me3);
                return;
            }
        }
        View view6 = refactorTTReviewCell.LLJILJILJ;
        if (view6 != null) {
            ViewGroup.LayoutParams layoutParams5 = view6.getLayoutParams();
            if ((layoutParams5 instanceof C19ME) && (c19me2 = (C19ME) layoutParams5) != null) {
                c19me2.topToTop = -1;
                c19me2.topToBottom = R.id.kc4;
                c19me2.endToEnd = 0;
                ((ViewGroup.MarginLayoutParams) c19me2).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                C786410Ut5.W5(view6, c19me2);
            }
        }
        View view7 = refactorTTReviewCell.LLJILLL;
        if (view7 == null) {
            return;
        }
        C1189060h32.LJJII(view7, 0, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams6 = view7.getLayoutParams();
        if (!(layoutParams6 instanceof C19ME) || (c19me = (C19ME) layoutParams6) == null) {
            return;
        }
        c19me.startToStart = R.id.ji7;
        c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        c19me.startToEnd = -1;
        c19me.endToStart = -1;
        C786410Ut5.W5(view7, c19me);
    }

    public static final List<InterfaceC1192080h7u> LJ(RefactorTTReviewCell refactorTTReviewCell, AbstractC1192060h7s abstractC1192060h7s) {
        C1191630h7B c1191630h7B;
        InterfaceC1192080h7u[] interfaceC1192080h7uArr = new InterfaceC1192080h7u[3];
        if (Intrinsics.LJFF(abstractC1192060h7s, C1192040h7q.LIZ)) {
            c1191630h7B = new C1191630h7B(new AwS562S0100000_18(refactorTTReviewCell, 2664)) { // from class: X.0h7K
                @Override // X.C1191630h7B
                public final void LIZLLL() {
                }

                @Override // X.C1191630h7B
                public final void LJII(C1191650h7D c1191650h7D, PoiReviewsApi.PoiReviewModel poiReviewModel) {
                }

                @Override // X.C1191630h7B
                public final void LJ(PoiReviewsApi.PoiReviewModel poiReviewModel) {
                    C1191650h7D c1191650h7D = this.LIZIZ;
                    if (c1191650h7D == null) {
                        return;
                    }
                    if ((!C1190820h5s.LJFF(poiReviewModel) || C1190820h5s.LJII(poiReviewModel) || Intrinsics.LJFF(poiReviewModel.isLocalAdded(), Boolean.TRUE)) && !poiReviewModel.isAnonymous()) {
                        c1191650h7D.h0(false, new ACListenerS153S0100000_18(this, 182));
                        c1191650h7D.setOnNameClick(new ACListenerS153S0100000_18(this, 183));
                        c1191650h7D.setOnRatingClick(new ACListenerS153S0100000_18(this, 184));
                    }
                }

                @Override // X.C1191630h7B
                public final void LJFF(PoiReviewsApi.PoiReviewModel poiReviewModel) {
                    SmartImageView smartImageView = this.LIZJ;
                    if (smartImageView != null) {
                        C786410Ut5.LLFF(8, smartImageView);
                    }
                }

                @Override // X.C1191630h7B
                public final void LJI(C1191650h7D c1191650h7D, PoiReviewsApi.PoiReviewModel poiReviewModel, boolean z) {
                    C339190DRl.LIZIZ(c1191650h7D.LLJIJIL);
                    C339190DRl.LIZIZ(c1191650h7D.LLJILJIL);
                }
            };
        } else {
            c1191630h7B = new C1191630h7B(new AwS562S0100000_18(refactorTTReviewCell, 2665));
        }
        interfaceC1192080h7uArr[0] = c1191630h7B;
        interfaceC1192080h7uArr[1] = LJII(refactorTTReviewCell, abstractC1192060h7s);
        interfaceC1192080h7uArr[2] = LJI(refactorTTReviewCell, abstractC1192060h7s);
        return C1697810uHb.LJIIJJI(interfaceC1192080h7uArr);
    }

    public static final C1191660h7E LJI(RefactorTTReviewCell refactorTTReviewCell, AbstractC1192060h7s abstractC1192060h7s) {
        C1191730h7L c1191730h7L;
        if (Intrinsics.LJFF(abstractC1192060h7s, C1192010h7n.LIZ)) {
            c1191730h7L = new C1191730h7L(AFwS256S0000000_18.get$arr$(982), new AwS562S0100000_18(refactorTTReviewCell, 2662), false);
        } else if (Intrinsics.LJFF(abstractC1192060h7s, C1192040h7q.LIZ)) {
            c1191730h7L = new C1191730h7L(AFwS256S0000000_18.get$arr$(985), AFwS206S0000000_18.get$arr$(752), false, true, new AwS597S0100000_18(refactorTTReviewCell, 964), false);
        } else {
            c1191730h7L = new C1191730h7L(AFwS256S0000000_18.get$arr$(986), AFwS206S0000000_18.get$arr$(754), true);
        }
        return new C1191660h7E(new AwS562S0100000_18(refactorTTReviewCell, 2659), new AwS562S0100000_18(refactorTTReviewCell, 2660), new AwS562S0100000_18(refactorTTReviewCell, 2661), c1191730h7L);
    }

    public static final C1191640h7C LJII(RefactorTTReviewCell refactorTTReviewCell, AbstractC1192060h7s abstractC1192060h7s) {
        C1191680h7G c1191680h7G;
        if (Intrinsics.LJFF(abstractC1192060h7s, C1192010h7n.LIZ)) {
            c1191680h7G = new C1191680h7G("poi_detail_reviews", false, null, null, 2044);
        } else if (Intrinsics.LJFF(abstractC1192060h7s, C1192040h7q.LIZ)) {
            c1191680h7G = new C1191680h7G("poi_reviews_comment", false, AFwS206S0000000_18.get$arr$(755), null, AnonymousClass0207.get$arr$(127), AnonymousClass0208.get$arr$(52), AFwS228S0000000_1.get$arr$(762), false, false, false, "fyp");
        } else {
            c1191680h7G = new C1191680h7G("poi_reviews", true, new AwS562S0100000_18(refactorTTReviewCell, 2654), new AwS597S0100000_18(refactorTTReviewCell, 961), 2032);
        }
        return new C1191640h7C(new AwS562S0100000_18(refactorTTReviewCell, 2667), new AwS562S0100000_18(refactorTTReviewCell, 2668), c1191680h7G, new AwS562S0100000_18(refactorTTReviewCell, 2669), new AwS562S0100000_18(refactorTTReviewCell, 2671), new AwS562S0100000_18(refactorTTReviewCell, 2672));
    }

    public static final void LJIIIIZZ(PoiReviewsApi.PoiReviewModel poiReviewModel, RefactorTTReviewCell refactorTTReviewCell) {
        View view;
        View view2 = refactorTTReviewCell.LLJILJILJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        C19M4 c19m4 = (C19M4) refactorTTReviewCell.itemView.findViewById(R.id.ths);
        if (c19m4 != null) {
            C786410Ut5.LLLLLZIL(c19m4, 8);
        }
        if (poiReviewModel.getHasFoldedReviews()) {
            if (c19m4 != null) {
                C786410Ut5.LLLLLZIL(c19m4, 0);
            }
            if (!C297470BlJ.LIZ()) {
                View view3 = refactorTTReviewCell.LLJILLL;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(8, view3);
                }
                refactorTTReviewCell.LLJILLL = refactorTTReviewCell.itemView.findViewById(R.id.cpi);
                refactorTTReviewCell.T5().LIZJ(poiReviewModel, C13BV.INSTANCE);
            }
            if (c19m4 != null) {
                c19m4.setText(2131846603);
                C786410Ut5.c9(c19m4, new ACListenerS121S0200000_18(poiReviewModel, refactorTTReviewCell, 63));
            }
        }
        if (C1191340h6i.LIZ() && (view = refactorTTReviewCell.LLJILJILJ) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (C1191340h6i.LIZIZ()) {
            if (poiReviewModel.getScene() == EnumC1189990h4X.REVIEW_LANDING_PAGE) {
                ConstraintLayout constraintLayout = refactorTTReviewCell.LLJJ;
                if (constraintLayout != null) {
                    constraintLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                }
                View view4 = (View) refactorTTReviewCell.LLLZIL("expandableText.tvContent");
                if (view4 != null) {
                    C1189060h32.LJJII(view4, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 0);
                }
                View view5 = (View) refactorTTReviewCell.LLLZIL("imageGrid.imageContainer");
                if (view5 != null) {
                    C1189060h32.LJJII(view5, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 0);
                }
            }
            View view6 = refactorTTReviewCell.LLJILJILJ;
            if (view6 != null) {
                C786410Ut5.LJLLLLLL(0, view6);
            }
        }
    }

    public static final C1191990h7l LJIIJ(RefactorTTReviewCell refactorTTReviewCell, AbstractC1192060h7s abstractC1192060h7s) {
        C1192000h7m c1192000h7m;
        if (abstractC1192060h7s == C1192010h7n.LIZ) {
            c1192000h7m = new C1192000h7m(new AwS562S0100000_18(refactorTTReviewCell, 2653), false);
        } else {
            c1192000h7m = new C1192000h7m(AFwS206S0000000_18.get$arr$(749), true);
        }
        return new C1191990h7l(new AwS562S0100000_18(refactorTTReviewCell, 2670), new AwS597S0100000_18(refactorTTReviewCell, 966), new AwS597S0100000_18(refactorTTReviewCell, 967), c1192000h7m);
    }
}

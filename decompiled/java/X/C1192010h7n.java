package X;

import Y.ACListenerS121S0200000_18;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ability.PoiReviewCellVAbility;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.RefactorTTReviewCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS70S0210000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192010h7n extends AbstractC1192060h7s {
    public static final C1192010h7n LIZ = new C1192010h7n();
    public static final int LIZIZ = R.layout.e1x;

    @Override // X.AbstractC1192060h7s
    public final int LJFF() {
        return LIZIZ;
    }

    @Override // X.AbstractC1192060h7s
    public final void LIZ(RefactorTTReviewCell refactorTTReviewCell) {
        ConstraintLayout constraintLayout = refactorTTReviewCell.LLJJ;
        if (constraintLayout != null) {
            C426750GoL.LJIIL(constraintLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 16);
        }
        C427690Gpr.LJ(refactorTTReviewCell.itemView, 0.0f);
    }

    @Override // X.AbstractC1192060h7s
    public final void LIZJ(RefactorTTReviewCell refactorTTReviewCell) {
        C19ME c19me;
        TuxIconView tuxIconView;
        C1191980h7k.LIZ(refactorTTReviewCell);
        if (C297470BlJ.LIZ()) {
            View viewF6 = refactorTTReviewCell.f6();
            if (viewF6 != null) {
                if ((viewF6 instanceof TuxIconView) && (tuxIconView = (TuxIconView) viewF6) != null) {
                    tuxIconView.setTintColorRes(R.attr.a1j);
                }
                ViewGroup.LayoutParams layoutParams = viewF6.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                    c19me.startToStart = R.id.ji7;
                    c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                    C786410Ut5.W5(viewF6, c19me);
                }
            }
            TuxIconView tuxIconView2 = (TuxIconView) refactorTTReviewCell.LLLZIL("like.icon");
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColorRes(R.attr.a1j);
            }
        }
    }

    @Override // X.AbstractC1192060h7s
    public final C587440N2g LIZLLL(RefactorTTReviewCell refactorTTReviewCell) {
        return new C587440N2g(new AwS562S0100000_18(refactorTTReviewCell, 1895), new AwS562S0100000_18(refactorTTReviewCell, 1896), false);
    }

    @Override // X.AbstractC1192060h7s
    public final void LJ(RefactorTTReviewCell refactorTTReviewCell) {
        int i;
        int i2 = 0;
        if (refactorTTReviewCell.LLJIJIL) {
            i = 0;
            i2 = 8;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i2, refactorTTReviewCell.itemView.findViewById(R.id.cpg));
        C786410Ut5.LJLLLLLL(i2, refactorTTReviewCell.itemView.findViewById(R.id.ffs));
        C786410Ut5.LJLLLLLL(i2, refactorTTReviewCell.itemView.findViewById(R.id.mnd));
        C786410Ut5.LJLLLLLL(i2, refactorTTReviewCell.itemView.findViewById(R.id.fxn));
        C786410Ut5.LJLLLLLL(i, refactorTTReviewCell.itemView.findViewById(R.id.cpi));
        C786410Ut5.LJLLLLLL(i, refactorTTReviewCell.itemView.findViewById(R.id.ffv));
        C786410Ut5.LJLLLLLL(i, refactorTTReviewCell.itemView.findViewById(R.id.mnf));
        C786410Ut5.LJLLLLLL(i, refactorTTReviewCell.itemView.findViewById(R.id.fxo));
        C786410Ut5.LJLLLLLL(i, refactorTTReviewCell.itemView.findViewById(R.id.f707g3a));
    }

    @Override // X.AbstractC1192060h7s
    public final View LJI(ViewGroup viewGroup) {
        if (SlashComponentUIPreloadExp.LIZ("poi_review")) {
            return C1181430gqj.LIZIZ(viewGroup.getContext(), LIZIZ, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), LIZIZ, viewGroup, false);
    }

    @Override // X.AbstractC1192060h7s
    public final void LJII(RefactorTTReviewCell refactorTTReviewCell) {
        PoiReviewCellVAbility poiReviewCellVAbility;
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(refactorTTReviewCell);
        InterfaceC1191710h7J interfaceC1191710h7JR0 = null;
        if (fragmentLJIIJ != null) {
            poiReviewCellVAbility = (PoiReviewCellVAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), PoiReviewCellVAbility.class, null);
            if (poiReviewCellVAbility != null) {
                interfaceC1191710h7JR0 = poiReviewCellVAbility.r0();
            }
        } else {
            poiReviewCellVAbility = null;
        }
        refactorTTReviewCell.LLILZLL = interfaceC1191710h7JR0;
        if (poiReviewCellVAbility != null) {
            poiReviewCellVAbility.G1();
        }
        refactorTTReviewCell.LLIZLLLIL = true;
    }

    @Override // X.AbstractC1192060h7s
    public final List<InterfaceC1192080h7u> LJIIIIZZ(RefactorTTReviewCell refactorTTReviewCell) {
        return C1697810uHb.LJIIJJI(new C1191690h7H(new AwS562S0100000_18(refactorTTReviewCell, 2655), new AwS632S0100000_18(refactorTTReviewCell, 288), new AwS632S0100000_18(refactorTTReviewCell, 289), new AwS632S0100000_18(refactorTTReviewCell, 290)), C1191980h7k.LJII(refactorTTReviewCell, this), C1191980h7k.LJI(refactorTTReviewCell, this), C1191980h7k.LJIIJ(refactorTTReviewCell, this), refactorTTReviewCell.T5(), C1191980h7k.LJIIIZ(refactorTTReviewCell), refactorTTReviewCell.a6(), refactorTTReviewCell.V5(), refactorTTReviewCell.U5());
    }

    @Override // X.AbstractC1192060h7s
    public final C1192070h7t LJIIIZ(RefactorTTReviewCell refactorTTReviewCell) {
        return new C1192070h7t(AFwS256S0000000_18.get$arr$(617), new AwS562S0100000_18(refactorTTReviewCell, 1897), AFwS206S0000000_18.get$arr$(484), new AwS562S0100000_18(refactorTTReviewCell, 1898), new AwS562S0100000_18(refactorTTReviewCell, 1899), new AwS562S0100000_18(refactorTTReviewCell, 1900), new AwS562S0100000_18(refactorTTReviewCell, 1901), null, null, 896);
    }

    @Override // X.AbstractC1192060h7s
    public final C1191750h7N LJIIJ(RefactorTTReviewCell refactorTTReviewCell) {
        return new C1191750h7N(new AwS562S0100000_18(refactorTTReviewCell, 1902), new AwS562S0100000_18(refactorTTReviewCell, 1903));
    }

    @Override // X.AbstractC1192060h7s
    public final void LJIIL(RefactorTTReviewCell refactorTTReviewCell) {
        View viewD6 = refactorTTReviewCell.d6();
        if (viewD6 != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(refactorTTReviewCell, 97), viewD6);
        }
        refactorTTReviewCell.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(refactorTTReviewCell, 14));
    }

    @Override // X.AbstractC1192060h7s
    public final void LJIILIIL(RefactorTTReviewCell refactorTTReviewCell) {
        C2211631BhB.LJ(refactorTTReviewCell.itemView, new AwS70S0210000_18(refactorTTReviewCell, (RefactorTTReviewCell) false, (boolean) AFwS206S0000000_18.get$arr$(753), (Function0<Unit>) 8));
        if (C305400By6.LIZ == 1) {
            C2211631BhB.LJ(refactorTTReviewCell.itemView, new AwS597S0100000_18(refactorTTReviewCell, 479));
        }
    }

    @Override // X.AbstractC1192060h7s
    public final boolean LJIILJJIL(List<? extends Object> list) {
        if ((!list.isEmpty()) && (ListProtector.get(list, 0) instanceof C1190010h4Z)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1192060h7s
    public final void LIZIZ(RefactorTTReviewCell refactorTTReviewCell, PoiReviewsApi.PoiReviewModel poiReviewModel) {
        String str;
        TuxTextView tuxTextView;
        TuxIconView tuxIconView;
        C19ME c19me;
        C19ME c19me2;
        C19ME c19me3;
        C19ME c19me4;
        TuxIconView tuxIconView2;
        View viewD6;
        InterfaceC1191710h7J interfaceC1191710h7J;
        PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
        String str2 = null;
        if (content != null) {
            str = content.translatedContent;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str) && (interfaceC1191710h7J = refactorTTReviewCell.LLILZLL) != null) {
            interfaceC1191710h7J.Ez1(poiReviewModel, !poiReviewModel.getWantTranslate());
        }
        if (C1191340h6i.LIZIZ()) {
            View view = refactorTTReviewCell.LLJJIJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else {
            View view2 = refactorTTReviewCell.LLJJJJLIIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
        }
        View viewD62 = refactorTTReviewCell.d6();
        if (viewD62 != null) {
            C786410Ut5.LJLLLLLL(8, viewD62);
        }
        View view3 = refactorTTReviewCell.LLJJJIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        View view4 = refactorTTReviewCell.LLJJJJ;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
        View view5 = refactorTTReviewCell.LLJJJJJIL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        if (refactorTTReviewCell.b6()) {
            View viewE6 = refactorTTReviewCell.e6();
            if (viewE6 != null) {
                C786410Ut5.LJLLLLLL(0, viewE6);
            }
            View viewD63 = refactorTTReviewCell.d6();
            if (viewD63 != null) {
                C786410Ut5.LJLLLLLL(0, viewD63);
            }
            if (C1191340h6i.LIZIZ() && (viewD6 = refactorTTReviewCell.d6()) != null) {
                C786410Ut5.LJLLLLLL(8, viewD6);
            }
        } else {
            View viewE62 = refactorTTReviewCell.e6();
            if (viewE62 != null) {
                C786410Ut5.LJLLLLLL(8, viewE62);
            }
            View viewD64 = refactorTTReviewCell.d6();
            if (viewD64 != null) {
                C786410Ut5.LJLLLLLL(8, viewD64);
            }
        }
        if (!C1191350h6j.LIZ()) {
            tuxTextView = refactorTTReviewCell.LLJILJIL;
        } else {
            tuxTextView = refactorTTReviewCell.LLJJIJIIJIL;
        }
        if (tuxTextView != null) {
            tuxTextView.setText(RefactorTTReviewCell.S5(poiReviewModel));
        }
        PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
        if (userStatus != null && Intrinsics.LJFF(userStatus.disliked, Boolean.TRUE)) {
            if (!C1191350h6j.LIZ()) {
                tuxIconView2 = refactorTTReviewCell.LLJJIII;
            } else {
                tuxIconView2 = refactorTTReviewCell.LLJJJ;
            }
            if (tuxIconView2 != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_thumbs_down_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                tuxIconView2.setTuxIcon(c419910GdJ);
            }
        } else {
            if (!C1191350h6j.LIZ()) {
                tuxIconView = refactorTTReviewCell.LLJJIII;
            } else {
                tuxIconView = refactorTTReviewCell.LLJJJ;
            }
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_thumbs_down;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
                tuxIconView.setTuxIcon(c419910GdJ2);
            }
        }
        if (C1191360h6k.LIZ()) {
            C786410Ut5.I7(new ACListenerS121S0200000_18(poiReviewModel, refactorTTReviewCell, 26), refactorTTReviewCell.itemView);
        }
        if (C297470BlJ.LIZ()) {
            if (C1191980h7k.LJFF(poiReviewModel) && C1EDK.LIZIZ()) {
                PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModel.getContent();
                if (content2 != null) {
                    str2 = content2.translatedContent;
                }
                if (C123100dR.LIZ(str2)) {
                    View viewF6 = refactorTTReviewCell.f6();
                    if (viewF6 != null) {
                        ViewGroup.LayoutParams layoutParams = viewF6.getLayoutParams();
                        if ((layoutParams instanceof C19ME) && (c19me4 = (C19ME) layoutParams) != null) {
                            c19me4.startToStart = -1;
                            c19me4.endToStart = R.id.mng;
                            c19me4.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                            C786410Ut5.W5(viewF6, c19me4);
                        }
                    }
                    View viewE63 = refactorTTReviewCell.e6();
                    if (viewE63 != null) {
                        ViewGroup.LayoutParams layoutParams2 = viewE63.getLayoutParams();
                        if ((layoutParams2 instanceof C19ME) && (c19me3 = (C19ME) layoutParams2) != null) {
                            c19me3.topToTop = R.id.ujd;
                            c19me3.topToBottom = -1;
                            c19me3.endToEnd = 0;
                            ((ViewGroup.MarginLayoutParams) c19me3).topMargin = 0;
                            C786410Ut5.W5(viewE63, c19me3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            View viewF62 = refactorTTReviewCell.f6();
            if (viewF62 != null) {
                ViewGroup.LayoutParams layoutParams3 = viewF62.getLayoutParams();
                if ((layoutParams3 instanceof C19ME) && (c19me2 = (C19ME) layoutParams3) != null) {
                    c19me2.startToStart = R.id.ji7;
                    c19me2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                    c19me2.endToStart = -1;
                    c19me2.setMarginEnd(0);
                    C786410Ut5.W5(viewF62, c19me2);
                }
            }
            View viewE64 = refactorTTReviewCell.e6();
            if (viewE64 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams4 = viewE64.getLayoutParams();
            if (!(layoutParams4 instanceof C19ME) || (c19me = (C19ME) layoutParams4) == null) {
                return;
            }
            c19me.topToTop = -1;
            c19me.topToBottom = R.id.kc4;
            c19me.endToEnd = 0;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            C786410Ut5.W5(viewE64, c19me);
        }
    }
}

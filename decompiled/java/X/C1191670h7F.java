package X;

import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191670h7F implements InterfaceC1192080h7u {
    public final Function0<InterfaceC1191710h7J> LIZ;
    public final Function0<Integer> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final C1191700h7I LIZLLL;
    public InterfaceC1191840h7W LJ;
    public View LJFF;
    public TuxIconView LJI;
    public TuxTextView LJII;
    public TuxIconView LJIIIIZZ;

    @Override // X.InterfaceC1192080h7u
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1192080h7u
    public final void onResume(boolean z) {
    }

    public final InterfaceC1191710h7J LIZLLL() {
        return this.LIZ.invoke();
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZIZ(InterfaceC1191840h7W interfaceC1191840h7W) {
        TuxIconView tuxIconView;
        this.LJ = interfaceC1191840h7W;
        View view = interfaceC1191840h7W.LLLLLLIL().itemView;
        this.LJFF = view.findViewById(this.LIZLLL.LIZ);
        this.LJI = (TuxIconView) view.findViewById(this.LIZLLL.LIZIZ);
        this.LJII = (TuxTextView) view.findViewById(this.LIZLLL.LIZJ);
        C1191700h7I c1191700h7I = this.LIZLLL;
        int i = c1191700h7I.LIZLLL;
        if (i == c1191700h7I.LIZIZ) {
            tuxIconView = this.LJI;
        } else {
            tuxIconView = (TuxIconView) view.findViewById(i);
        }
        this.LJIIIIZZ = tuxIconView;
        interfaceC1191840h7W.y5(this.LJFF, "like.container");
        interfaceC1191840h7W.y5(this.LJI, "like.icon");
        interfaceC1191840h7W.y5(this.LJII, "like.count");
        View view2 = this.LJFF;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 181), view2);
        }
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZJ(PoiReviewsApi.PoiReviewModel poiReviewModel, List<? extends Object> list) {
        long jLongValue;
        Context context;
        Long l;
        String string;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        View view;
        boolean z;
        TuxTextView tuxTextView;
        int i;
        Integer numValueOf;
        TuxTextView tuxTextView2;
        int i2;
        int i3;
        Long l2;
        PoiReviewsApi.PoiReviewStatisticsModel statistics = poiReviewModel.getStatistics();
        if (statistics != null && (l2 = statistics.likeCount) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        C1191700h7I c1191700h7I = this.LIZLLL;
        boolean z2 = true;
        if (!c1191700h7I.LJFF) {
            if (c1191700h7I.LJIIL) {
                i3 = 8;
            } else {
                i3 = 4;
            }
            TuxTextView tuxTextView3 = this.LJII;
            if (tuxTextView3 != null) {
                if (jLongValue > 0) {
                    i3 = 0;
                }
                C786410Ut5.LLLLZLL(tuxTextView3, i3);
            }
            TuxTextView tuxTextView4 = this.LJII;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(C1843500y4a.LIZIZ(jLongValue));
            }
        } else {
            TuxTextView tuxTextView5 = this.LJII;
            if (tuxTextView5 != null) {
                C786410Ut5.LLLLZLL(tuxTextView5, 0);
            }
            InterfaceC1191840h7W interfaceC1191840h7W = this.LJ;
            String string2 = null;
            if (interfaceC1191840h7W != null && (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W.LLLLLLIL()) != null && (view = abstractRefactorPoiReviewCellLLLLLLIL.itemView) != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            PoiReviewsApi.PoiReviewStatisticsModel statistics2 = poiReviewModel.getStatistics();
            if (statistics2 != null) {
                l = statistics2.likeCount;
            } else {
                l = null;
            }
            if (l != null && poiReviewModel.getStatistics().likeCount.longValue() > 0) {
                String strLIZIZ = C1843500y4a.LIZIZ(poiReviewModel.getStatistics().likeCount.longValue());
                if (context == null || (string = context.getString(2131835492)) == null) {
                    string = "";
                }
                if (C1191340h6i.LIZIZ()) {
                    TuxTextView tuxTextView6 = this.LJII;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setText(strLIZIZ);
                    }
                } else {
                    TuxTextView tuxTextView7 = this.LJII;
                    if (tuxTextView7 != null) {
                        tuxTextView7.setText(C786410Ut5.j4("%s %s", Arrays.copyOf(new Object[]{string, strLIZIZ}, 2)));
                    }
                }
            } else {
                TuxTextView tuxTextView8 = this.LJII;
                if (tuxTextView8 != null) {
                    if (context != null) {
                        string2 = context.getString(2131835492);
                    }
                    tuxTextView8.setText(string2);
                }
            }
        }
        C1191700h7I c1191700h7I2 = this.LIZLLL;
        if (!c1191700h7I2.LJFF && !c1191700h7I2.LJIILIIL) {
            z = false;
        } else {
            z = true;
        }
        PoiReviewsApi.PoiReviewUserStatusModel userStatus = poiReviewModel.getUserStatus();
        if (userStatus != null && Intrinsics.LJFF(userStatus.liked, Boolean.TRUE)) {
            TuxTextView tuxTextView9 = this.LJII;
            if (tuxTextView9 != null) {
                tuxTextView9.setTextColorRes(R.attr.a04);
            }
            TuxIconView tuxIconView = this.LJI;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                if (z) {
                    i2 = R.raw.icon_thumbs_up_fill;
                } else {
                    i2 = R.raw.icon_heart_fill;
                }
                c419910GdJ.LIZ = i2;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            if (this.LIZLLL.LJFF && (tuxTextView2 = this.LJII) != null) {
                tuxTextView2.setTuxFont(62);
                return;
            }
            return;
        }
        if (!this.LIZLLL.LJIIJJI || !C297470BlJ.LIZ()) {
            z2 = false;
        }
        if (z2) {
            TuxTextView tuxTextView10 = this.LJII;
            if (tuxTextView10 != null) {
                tuxTextView10.setTextColorRes(R.attr.a1j);
            }
        } else {
            TuxTextView tuxTextView11 = this.LJII;
            if (tuxTextView11 != null) {
                tuxTextView11.setTextColorRes(R.attr.a1k);
            }
        }
        TuxIconView tuxIconView2 = this.LJI;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            if (z) {
                i = R.raw.icon_thumbs_up;
            } else {
                i = R.raw.icon_heart;
            }
            c419910GdJ2.LIZ = i;
            if (z2) {
                numValueOf = Integer.valueOf(R.attr.a1j);
            } else {
                numValueOf = Integer.valueOf(R.attr.a1k);
            }
            c419910GdJ2.LJ = numValueOf;
            tuxIconView2.setTuxIcon(c419910GdJ2);
        }
        if (!this.LIZLLL.LJFF || (tuxTextView = this.LJII) == null) {
            return;
        }
        tuxTextView.setTuxFont(61);
    }

    public C1191670h7F(AwS562S0100000_18 awS562S0100000_18, AwS562S0100000_18 awS562S0100000_182, AwS562S0100000_18 awS562S0100000_183, C1191700h7I c1191700h7I) {
        this.LIZ = awS562S0100000_18;
        this.LIZIZ = awS562S0100000_182;
        this.LIZJ = awS562S0100000_183;
        this.LIZLLL = c1191700h7I;
    }
}

package X;

import Y.ACListenerS115S0200000_11;
import Y.ACallableS418S0100000_11;
import Y.ACallableS95S0101000_11;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.Content;
import com.bytedance.touchpoint.api.model.FeedButton;
import com.bytedance.touchpoint.api.model.IncentiveShareCard;
import com.bytedance.touchpoint.api.model.SharePanelInfo;
import com.bytedance.touchpoint.api.model.Title;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0SSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721680SSo implements InterfaceC690020R4u {
    public IncentiveShareCard LIZ;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public View LJ;
    public View LJFF;
    public LinearLayout LJI;
    public C1322110kVd LJII;
    public TuxTextView LJIIIIZZ;
    public TuxTextView LJIIIZ;
    public C1322110kVd LJIIJ;
    public TuxTextView LJIIJJI;
    public TuxTextView LJIIL;
    public LinearLayout LJIILIIL;
    public String LJIILJJIL = "";
    public int LJIILL = -16777216;
    public int LJIILLIIL = -16777216;
    public int LJIIZILJ = -16777216;
    public String LJIJ = "";
    public C0R5H LJIJI;
    public Context LJIJJ;

    @Override // X.InterfaceC690020R4u
    public final void LIZIZ() {
        View view = this.LIZIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZJ() {
        View view = this.LIZIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LIZJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LJ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LJFF;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LIZLLL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZLLL() {
        View view = this.LIZIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        LJ();
        C15O7.LIZJ(new ACallableS95S0101000_11(this, 2, 1));
        if (this.LIZ != null) {
            C15O7.LIZJ(new ACallableS418S0100000_11(this, 3));
        }
    }

    public final void LJ() {
        int iLJIILJJIL = C12ES.LJIILJJIL(C12ES.LJIIJJI(this.LJIJJ) + 0.0f, this.LJIJJ);
        if (this.LJIJJ != null) {
            iLJIILJJIL += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        }
        View view = this.LIZIZ;
        int height = ((view != null ? view.getHeight() : 0) - iLJIILJJIL) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        LinearLayout linearLayout = this.LJI;
        int height2 = (height - (linearLayout != null ? linearLayout.getHeight() : 0)) / 2;
        LinearLayout linearLayout2 = this.LJI;
        RelativeLayout.LayoutParams layoutParams = null;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) (linearLayout2 != null ? linearLayout2.getLayoutParams() : null);
        if (layoutParams2 != null) {
            layoutParams2.topMargin = iLJIILJJIL + height2;
            layoutParams = layoutParams2;
        }
        LinearLayout linearLayout3 = this.LJI;
        if (linearLayout3 != null) {
            C786410Ut5.d6(linearLayout3, layoutParams);
        }
    }

    @Override // X.InterfaceC690020R4u
    public final boolean isShowing() {
        View view = this.LIZIZ;
        return view != null && view.getVisibility() == 0;
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZ(ViewStub viewStub, String str, Context context, int i, View view, View view2, View view3, View view4, String str2) {
        int size;
        boolean z;
        String str3;
        boolean z2;
        TuxTextView tuxTextView;
        String str4;
        Content content;
        String str5;
        Content content2;
        String str6;
        C1322110kVd c1322110kVd;
        String str7;
        Content content3;
        String str8;
        Content content4;
        LinearLayout linearLayout;
        String str9;
        Content content5;
        String str10;
        Content content6;
        String str11;
        String str12;
        String str13;
        String str14;
        LinearLayout linearLayout2;
        C1322110kVd c1322110kVd2;
        TuxTextView tuxTextView2;
        LinearLayout linearLayout3;
        TuxTextView tuxTextView3;
        C1322110kVd c1322110kVd3;
        TuxTextView tuxTextView4;
        TuxTextView tuxTextView5;
        LIZJ();
        if (context == null) {
            return;
        }
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        IncentiveShareCard incentiveShareCard = (IncentiveShareCard) C2178808gE.LIZ().LJ(37);
        if (incentiveShareCard == null) {
            return;
        }
        this.LIZ = incentiveShareCard;
        this.LJIJJ = context;
        this.LIZJ = view;
        this.LIZLLL = view2;
        this.LJ = view3;
        this.LJFF = view4;
        View view5 = this.LIZIZ;
        String str15 = null;
        if (view5 == null) {
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            this.LIZIZ = viewLJLLLL;
            if (viewLJLLLL != null) {
                linearLayout2 = (LinearLayout) viewLJLLLL.findViewById(R.id.kkm);
            } else {
                linearLayout2 = null;
            }
            this.LJI = linearLayout2;
            View view6 = this.LIZIZ;
            if (view6 != null) {
                c1322110kVd2 = (C1322110kVd) view6.findViewById(R.id.video_cover);
            } else {
                c1322110kVd2 = null;
            }
            this.LJII = c1322110kVd2;
            View view7 = this.LIZIZ;
            if (view7 != null) {
                tuxTextView2 = (TuxTextView) view7.findViewById(R.id.dg9);
            } else {
                tuxTextView2 = null;
            }
            this.LJIIIIZZ = tuxTextView2;
            View view8 = this.LIZIZ;
            if (view8 != null) {
                linearLayout3 = (LinearLayout) view8.findViewById(R.id.uys);
            } else {
                linearLayout3 = null;
            }
            this.LJIILIIL = linearLayout3;
            View view9 = this.LIZIZ;
            if (view9 != null) {
                tuxTextView3 = (TuxTextView) view9.findViewById(R.id.uyq);
            } else {
                tuxTextView3 = null;
            }
            this.LJIIIZ = tuxTextView3;
            View view10 = this.LIZIZ;
            if (view10 != null) {
                c1322110kVd3 = (C1322110kVd) view10.findViewById(R.id.fm3);
            } else {
                c1322110kVd3 = null;
            }
            this.LJIIJ = c1322110kVd3;
            View view11 = this.LIZIZ;
            if (view11 != null) {
                tuxTextView4 = (TuxTextView) view11.findViewById(R.id.fof);
            } else {
                tuxTextView4 = null;
            }
            this.LJIIJJI = tuxTextView4;
            View view12 = this.LIZIZ;
            if (view12 != null) {
                tuxTextView5 = (TuxTextView) view12.findViewById(R.id.fq8);
            } else {
                tuxTextView5 = null;
            }
            this.LJIIL = tuxTextView5;
            View view13 = this.LIZIZ;
            if (view13 != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0SSq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view14) {
                    }
                }, view13);
            }
            View view14 = this.LIZIZ;
            if (view14 != null) {
                view14.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0SSr
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view15) {
                        return true;
                    }
                });
            }
        } else {
            C786410Ut5.LJLLLLLL(0, view5);
            LJ();
        }
        IncentiveShareCard incentiveShareCard2 = this.LIZ;
        if (incentiveShareCard2 != null) {
            List<String> list = incentiveShareCard2.backgroundColors;
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z && size >= 2) {
                C0SVC c0svc = C0SVC.LIZ;
                if (list != null) {
                    str13 = (String) ListProtector.get(list, 0);
                } else {
                    str13 = null;
                }
                this.LJIILLIIL = C0SVC.LIZIZ(c0svc, str13);
                if (list != null) {
                    str14 = (String) ListProtector.get(list, 1);
                } else {
                    str14 = null;
                }
                this.LJIIZILJ = C0SVC.LIZIZ(c0svc, str14);
            }
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.LJIILLIIL, this.LJIIZILJ});
            View view15 = this.LIZIZ;
            if (view15 != null) {
                view15.setBackground(gradientDrawable);
            }
            C1322110kVd c1322110kVd4 = this.LJII;
            if (c1322110kVd4 != null) {
                c1322110kVd4.setImageURI(this.LJIILJJIL);
            }
            TuxTextView tuxTextView6 = this.LJIIIIZZ;
            if (tuxTextView6 != null) {
                Title title = incentiveShareCard2.title;
                if (title != null) {
                    str12 = title.text;
                } else {
                    str12 = null;
                }
                tuxTextView6.setText(str12);
            }
            TuxTextView tuxTextView7 = this.LJIIIIZZ;
            if (tuxTextView7 != null) {
                C0SVC c0svc2 = C0SVC.LIZ;
                Title title2 = incentiveShareCard2.title;
                if (title2 != null) {
                    str11 = title2.color;
                } else {
                    str11 = null;
                }
                tuxTextView7.setTextColor(C0SVC.LIZIZ(c0svc2, str11));
            }
            TuxTextView tuxTextView8 = this.LJIIIZ;
            if (tuxTextView8 != null) {
                FeedButton feedButton = incentiveShareCard2.shareButton;
                if (feedButton != null && (content6 = feedButton.content) != null) {
                    str10 = content6.text;
                } else {
                    str10 = null;
                }
                tuxTextView8.setText(str10);
            }
            TuxTextView tuxTextView9 = this.LJIIIZ;
            if (tuxTextView9 != null) {
                C0SVC c0svc3 = C0SVC.LIZ;
                FeedButton feedButton2 = incentiveShareCard2.shareButton;
                if (feedButton2 != null && (content5 = feedButton2.content) != null) {
                    str9 = content5.color;
                } else {
                    str9 = null;
                }
                tuxTextView9.setTextColor(C0SVC.LIZIZ(c0svc3, str9));
            }
            LinearLayout linearLayout4 = this.LJIILIIL;
            if (linearLayout4 != null) {
                C786410Ut5.R7(linearLayout4, new ACListenerS115S0200000_11(incentiveShareCard2, this, 47));
            }
            FeedButton feedButton3 = incentiveShareCard2.shareButton;
            String str16 = "";
            if (feedButton3 == null || (str3 = feedButton3.bgColor) == null) {
                str3 = "";
            }
            if (str3.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (linearLayout = this.LJIILIIL) != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(C12ES.LIZJ(8.0f, this.LJIJJ));
                gradientDrawable2.setColor(C0SVC.LIZIZ(C0SVC.LIZ, str3));
                linearLayout.setBackground(gradientDrawable2);
            }
            TuxTextView tuxTextView10 = this.LJIIJJI;
            if (tuxTextView10 != null) {
                FeedButton feedButton4 = incentiveShareCard2.shareButton;
                if (feedButton4 != null && (content4 = feedButton4.description) != null) {
                    str8 = content4.text;
                } else {
                    str8 = null;
                }
                tuxTextView10.setText(str8);
            }
            TuxTextView tuxTextView11 = this.LJIIJJI;
            if (tuxTextView11 != null) {
                C0SVC c0svc4 = C0SVC.LIZ;
                FeedButton feedButton5 = incentiveShareCard2.shareButton;
                if (feedButton5 != null && (content3 = feedButton5.description) != null) {
                    str7 = content3.color;
                } else {
                    str7 = null;
                }
                tuxTextView11.setTextColor(C0SVC.LIZIZ(c0svc4, str7));
            }
            SharePanelInfo sharePanelInfo = (SharePanelInfo) C2178808gE.LIZ().LJ(33);
            if (sharePanelInfo != null && (str6 = sharePanelInfo.sharePanelIcon) != null && (c1322110kVd = this.LJIIJ) != null) {
                c1322110kVd.setImageURI(str6);
            }
            TuxTextView tuxTextView12 = this.LJIIL;
            if (tuxTextView12 != null) {
                FeedButton feedButton6 = incentiveShareCard2.detailButton;
                if (feedButton6 != null && (content2 = feedButton6.content) != null) {
                    str5 = content2.text;
                } else {
                    str5 = null;
                }
                tuxTextView12.setText(str5);
            }
            TuxTextView tuxTextView13 = this.LJIIL;
            if (tuxTextView13 != null) {
                C0SVC c0svc5 = C0SVC.LIZ;
                FeedButton feedButton7 = incentiveShareCard2.detailButton;
                if (feedButton7 != null && (content = feedButton7.content) != null) {
                    str15 = content.color;
                }
                tuxTextView13.setTextColor(C0SVC.LIZIZ(c0svc5, str15));
            }
            FeedButton feedButton8 = incentiveShareCard2.detailButton;
            if (feedButton8 != null && (str4 = feedButton8.bgColor) != null) {
                str16 = str4;
            }
            if (str16.length() > 0 && (tuxTextView = this.LJIIL) != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setCornerRadius(C12ES.LIZJ(8.0f, this.LJIJJ));
                gradientDrawable3.setColor(C0SVC.LIZIZ(C0SVC.LIZ, str16));
                tuxTextView.setBackground(gradientDrawable3);
            }
            TuxTextView tuxTextView14 = this.LJIIL;
            if (tuxTextView14 != null) {
                C786410Ut5.h9(tuxTextView14, new ACListenerS115S0200000_11(incentiveShareCard2, this, 48));
            }
            InterfaceC721690SSp interfaceC721690SSp = C0S4I.LIZ;
            if (interfaceC721690SSp != null) {
                interfaceC721690SSp.LIZ(this.LIZJ, EnumC1897360zTS.RISK_TOKEN_V_UG_REFER_INCENTIVE);
            }
            InterfaceC721690SSp interfaceC721690SSp2 = C0S4I.LIZ;
            if (interfaceC721690SSp2 != null) {
                interfaceC721690SSp2.LIZ(this.LIZLLL, EnumC1897360zTS.RISK_TOKEN_V_UG_REFER_INCENTIVE);
            }
            View view16 = this.LIZJ;
            if (view16 != null) {
                C786410Ut5.LJLLLLLL(8, view16);
            }
            View view17 = this.LJ;
            if (view17 != null) {
                C786410Ut5.LJLLLLLL(8, view17);
            }
            View view18 = this.LJFF;
            if (view18 != null) {
                C786410Ut5.LJLLLLLL(8, view18);
            }
            View view19 = this.LIZLLL;
            if (view19 != null) {
                C786410Ut5.LJLLLLLL(8, view19);
            }
        }
    }
}

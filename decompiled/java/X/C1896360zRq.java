package X;

import Y.ACListenerS15S1400000_28;
import Y.ACListenerS62S1200000_28;
import Y.ARunnableS39S0101000_28;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.touchpoint.api.model.Content;
import com.bytedance.touchpoint.api.model.ECReferralFeedPicture;
import com.bytedance.touchpoint.api.model.FeedButton;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.touchpoint.api.model.Title;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896360zRq implements InterfaceC690020R4u {
    public View LIZ;
    public ImageView LIZIZ;
    public TuxTextView LIZJ;
    public TuxTextView LIZLLL;
    public C1322110kVd LJ;
    public C1322110kVd LJFF;
    public C197039127h LJI;
    public C197039127h LJII;
    public TuxTextView LJIIIIZZ;
    public LinearLayout LJIIIZ;
    public LinearLayout LJIIJ;
    public FrameLayout LJIIJJI;
    public ReferralFeedBanner LJIIL;
    public View LJIILIIL;
    public View LJIILJJIL;
    public View LJIILL;
    public View LJIILLIIL;
    public Context LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI = -1;

    @Override // X.InterfaceC690020R4u
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZJ() {
        View view = this.LIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LJIILIIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LJIILL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LJIILLIIL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LJIILJJIL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZLLL() {
        Context context = this.LJIIZILJ;
        if (context != null) {
            LJ(context);
        }
        ReferralFeedBanner referralFeedBanner = this.LJIIL;
        if (referralFeedBanner != null) {
            C13054058y.LIZ(new ARunnableS39S0101000_28(2, referralFeedBanner, 6));
        }
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1894320zOY.getClass();
        C1894320zOY.LJIJJ(8, linkedHashMap, null, null, null, "");
    }

    @Override // X.InterfaceC690020R4u
    public final boolean isShowing() {
        View view = this.LIZ;
        return view != null && view.getVisibility() == 0;
    }

    public final void LJ(Context context) {
        DisplayMetrics displayMetrics;
        int i;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height;
        C1322110kVd c1322110kVd;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            int i2 = displayMetrics.heightPixels;
            float fLJIIJJI = C12ES.LJIIJJI(context) + 0.0f;
            float fLIZJ = C12ES.LIZJ(58.0f, context);
            if (C12ES.LJIILJJIL((i2 - fLJIIJJI) - fLIZJ, context) <= 360) {
                i = 16;
            } else {
                i = 32;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            LinearLayout linearLayout = this.LJIIJ;
            Integer numValueOf = null;
            if (linearLayout != null) {
                layoutParams = linearLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = (int) (fLJIIJJI + fLIZJ);
                }
            } else {
                marginLayoutParams = null;
            }
            LinearLayout linearLayout2 = this.LJIIJ;
            if (linearLayout2 != null) {
                C786410Ut5.d6(linearLayout2, marginLayoutParams);
            }
            LinearLayout linearLayout3 = this.LJIIIZ;
            if (linearLayout3 != null) {
                linearLayout3.setPadding(linearLayout3.getPaddingLeft(), iLIZIZ, linearLayout3.getPaddingRight(), iLIZIZ);
            }
            View view = this.LIZ;
            if (view != null) {
                height = view.getHeight();
            } else {
                height = 0;
            }
            if (height >= i2) {
                FrameLayout frameLayout = this.LJIIJJI;
                if (frameLayout != null) {
                    layoutParams2 = frameLayout.getLayoutParams();
                } else {
                    layoutParams2 = null;
                }
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
                    }
                } else {
                    marginLayoutParams2 = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("set bottom up bottomMargin: ");
                if (marginLayoutParams2 != null) {
                    numValueOf = Integer.valueOf(marginLayoutParams2.bottomMargin);
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                FrameLayout frameLayout2 = this.LJIIJJI;
                if (frameLayout2 != null) {
                    C786410Ut5.a6(frameLayout2, marginLayoutParams2);
                }
            }
            if (!this.LJIJ && (c1322110kVd = this.LJ) != null && c1322110kVd.getWidth() * c1322110kVd.getHeight() != 0 && C0SKB.LIZ()) {
                ViewGroup.LayoutParams layoutParams3 = c1322110kVd.getLayoutParams();
                layoutParams3.width = (int) (((double) c1322110kVd.getWidth()) * 0.75d);
                layoutParams3.height = (int) (((double) c1322110kVd.getHeight()) * 0.75d);
                C786410Ut5.c7(c1322110kVd, layoutParams3);
                TuxTextView tuxTextView = this.LIZJ;
                if (tuxTextView != null) {
                    tuxTextView.setMaxLines(2);
                }
                this.LJIJ = true;
            }
        }
    }

    public static void LJI(C1322110kVd c1322110kVd, String str) {
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ;
        if (c1322110kVd != null && str != null && str.length() != 0 && (interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ()) != null) {
            interfaceC1897260zTILIZIZ.LIZLLL(new C0VSJ(str), c1322110kVd, "ECReferralManager", null);
        }
    }

    public final void LJFF(Context context, C197039127h c197039127h, FeedButton feedButton, String str, ReferralFeedBanner referralFeedBanner) {
        if (c197039127h != null && feedButton != null) {
            c197039127h.setText(feedButton.content.text);
            C0SVC c0svc = C0SVC.LIZ;
            c197039127h.setTextColor(C0SVC.LIZIZ(c0svc, feedButton.content.color));
            String str2 = feedButton.bgColor;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(C12ES.LIZJ(8.0f, context));
                gradientDrawable.setColor(C0SVC.LIZIZ(c0svc, str2));
                c197039127h.setBackground(gradientDrawable);
            }
            if (Intrinsics.LJFF(feedButton.buttonAction, "close")) {
                C786410Ut5.U8(c197039127h, new ACListenerS62S1200000_28(this, referralFeedBanner, str, 4));
            } else {
                if (!Intrinsics.LJFF(feedButton.buttonAction, "url")) {
                    return;
                }
                C786410Ut5.U8(c197039127h, new ACListenerS15S1400000_28(this, str, referralFeedBanner, context, feedButton, 2));
            }
        }
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZ(ViewStub viewStub, String str, Context context, int i, View view, View view2, View view3, View view4, String str2) {
        ECReferralFeedPicture eCReferralFeedPicture;
        String str3;
        String str4;
        LinearLayout linearLayout;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        LIZJ();
        if (context == null) {
            return;
        }
        this.LJIIZILJ = context;
        viewStub.setLayoutResource(R.layout.fwf);
        this.LJIILIIL = view;
        this.LJIILJJIL = view2;
        this.LJIILL = view3;
        this.LJIILLIIL = view4;
        this.LJIJI = i;
        View view5 = this.LIZ;
        if (view5 == null) {
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            this.LIZ = viewLJLLLL;
            if (viewLJLLLL != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0zRr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                    }
                }, viewLJLLLL);
            }
            View view6 = this.LIZ;
            if (view6 != null) {
                view6.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0zRs
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view7) {
                        return true;
                    }
                });
            }
            View view7 = this.LIZ;
            if (view7 != null) {
                this.LJIIIZ = (LinearLayout) view7.findViewById(R.id.de4);
                this.LJIIJ = (LinearLayout) view7.findViewById(R.id.nct);
                this.LIZJ = (TuxTextView) view7.findViewById(R.id.tv_title);
                this.LIZLLL = (TuxTextView) view7.findViewById(R.id.tv_sub_title);
                this.LIZIZ = (ImageView) view7.findViewById(R.id.xvu);
                this.LJ = (C1322110kVd) view7.findViewById(R.id.gf6);
                this.LJFF = (C1322110kVd) view7.findViewById(R.id.gfp);
                this.LJIIIIZZ = (TuxTextView) view7.findViewById(R.id.tv_tips);
                this.LJI = (C197039127h) view7.findViewById(R.id.csh);
                this.LJII = (C197039127h) view7.findViewById(R.id.crt);
                view7.findViewById(R.id.nai);
                this.LJIIJJI = (FrameLayout) view7.findViewById(R.id.chs);
                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP != null) {
                    abstractC1896090zRP.LJ(this.LJII);
                }
                AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP2 != null) {
                    abstractC1896090zRP2.LJ(this.LJI);
                }
            }
            Context context2 = this.LJIIZILJ;
            if (context2 != null) {
                LJ(context2);
            }
        } else {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        ReferralFeedBanner referralFeedBannerLJII = C0T82.LIZJ(str2).LJII(str);
        if (referralFeedBannerLJII == null) {
            return;
        }
        this.LJIIL = referralFeedBannerLJII;
        C0T82.LIZJ(str2);
        List<ECReferralFeedPicture> list = referralFeedBannerLJII.ecReferralFeedPictures;
        if (list != null && (eCReferralFeedPicture = (ECReferralFeedPicture) C13LP.LJJJLZIJ(this.LJIJI, list)) != null) {
            C01U6.LIZIZ(new AwS272S0300000_28(this, context, eCReferralFeedPicture, 26));
            TuxTextView tuxTextView = this.LIZJ;
            String str10 = null;
            if (tuxTextView != null) {
                Title title = eCReferralFeedPicture.title;
                if (title != null) {
                    str9 = title.text;
                } else {
                    str9 = null;
                }
                tuxTextView.setText(str9);
            }
            TuxTextView tuxTextView2 = this.LIZJ;
            if (tuxTextView2 != null) {
                C0SVC c0svc = C0SVC.LIZ;
                Title title2 = eCReferralFeedPicture.title;
                if (title2 != null) {
                    str8 = title2.color;
                } else {
                    str8 = null;
                }
                tuxTextView2.setTextColor(C0SVC.LIZIZ(c0svc, str8));
            }
            TuxTextView tuxTextView3 = this.LIZLLL;
            if (tuxTextView3 != null) {
                Content content = eCReferralFeedPicture.subtitle;
                if (content != null) {
                    str7 = content.text;
                } else {
                    str7 = null;
                }
                tuxTextView3.setText(str7);
            }
            TuxTextView tuxTextView4 = this.LIZLLL;
            if (tuxTextView4 != null) {
                C0SVC c0svc2 = C0SVC.LIZ;
                Content content2 = eCReferralFeedPicture.subtitle;
                if (content2 != null) {
                    str6 = content2.color;
                } else {
                    str6 = null;
                }
                tuxTextView4.setTextColor(C0SVC.LIZIZ(c0svc2, str6));
            }
            LJFF(context, this.LJI, eCReferralFeedPicture.btnNotInterest, str2, referralFeedBannerLJII);
            LJFF(context, this.LJII, eCReferralFeedPicture.btnMainAction, str2, referralFeedBannerLJII);
            TuxTextView tuxTextView5 = this.LJIIIIZZ;
            if (tuxTextView5 != null) {
                Content content3 = eCReferralFeedPicture.description;
                if (content3 != null) {
                    str5 = content3.text;
                } else {
                    str5 = null;
                }
                tuxTextView5.setText(str5);
            }
            TuxTextView tuxTextView6 = this.LJIIIIZZ;
            if (tuxTextView6 != null) {
                C0SVC c0svc3 = C0SVC.LIZ;
                Content content4 = eCReferralFeedPicture.description;
                if (content4 != null) {
                    str10 = content4.color;
                }
                tuxTextView6.setTextColor(C0SVC.LIZIZ(c0svc3, str10));
            }
            String str11 = eCReferralFeedPicture.cardBgColor;
            String str12 = "";
            if (str11 == null) {
                str11 = "";
            }
            if (str11.length() > 0 && (linearLayout = this.LJIIIZ) != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(C12ES.LIZJ(12.0f, context));
                gradientDrawable.setColor(C0SVC.LIZIZ(C0SVC.LIZ, str11));
                linearLayout.setBackground(gradientDrawable);
            }
            String str13 = eCReferralFeedPicture.LIZIZ;
            if ((str13 == null || str13.length() == 0) && (str3 = eCReferralFeedPicture.backgroundImage) != null) {
                String strLJIILJJIL = C0T82.LIZJ(str2).LJIILJJIL(str3);
                if (strLJIILJJIL == null) {
                    strLJIILJJIL = "";
                }
                eCReferralFeedPicture.LIZIZ = strLJIILJJIL;
            }
            String str14 = eCReferralFeedPicture.LIZ;
            if ((str14 == null || str14.length() == 0) && (str4 = eCReferralFeedPicture.coverImage) != null) {
                String strLJIILJJIL2 = C0T82.LIZJ(str2).LJIILJJIL(str4);
                if (strLJIILJJIL2 != null) {
                    str12 = strLJIILJJIL2;
                }
                eCReferralFeedPicture.LIZ = str12;
            }
            LJI(this.LJFF, eCReferralFeedPicture.LIZIZ);
            LJI(this.LJ, eCReferralFeedPicture.LIZ);
            InterfaceC721690SSp interfaceC721690SSp = C0S4I.LIZ;
            if (interfaceC721690SSp != null) {
                interfaceC721690SSp.LIZ(this.LJIILIIL, EnumC1897360zTS.RISK_TOKEN_V_UG_REFER_EC);
            }
            InterfaceC721690SSp interfaceC721690SSp2 = C0S4I.LIZ;
            if (interfaceC721690SSp2 != null) {
                interfaceC721690SSp2.LIZ(this.LJIILJJIL, EnumC1897360zTS.RISK_TOKEN_V_UG_REFER_EC);
            }
            View view8 = this.LJIILIIL;
            if (view8 != null) {
                C786410Ut5.LJLLLLLL(8, view8);
            }
            View view9 = this.LJIILL;
            if (view9 != null) {
                C786410Ut5.LJLLLLLL(8, view9);
            }
            View view10 = this.LJIILLIIL;
            if (view10 != null) {
                C786410Ut5.LJLLLLLL(8, view10);
            }
            View view11 = this.LJIILJJIL;
            if (view11 != null) {
                C786410Ut5.LJLLLLLL(8, view11);
            }
        }
    }
}

package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zs4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912620zs4 extends AbstractC1903430zdF<C890690Ywt> implements C0Z37<C890690Ywt>, InterfaceC1508640pMU {
    public final Function0<Unit> LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "InboxTabPageStatusViewVH";
    }

    public final C1390410mHn T5() {
        return (C1390410mHn) this.LLJI.getValue();
    }

    public final C1390410mHn U5() {
        return (C1390410mHn) this.LLJIJIL.getValue();
    }

    public final TuxTextView V5() {
        return (TuxTextView) this.LLJJJ.getValue();
    }

    public final TuxTextView W5() {
        return (TuxTextView) this.LLJJIJIL.getValue();
    }

    public final ImageView X5() {
        return (ImageView) this.LLJJIII.getValue();
    }

    public final TuxTextView a6() {
        return (TuxTextView) this.LLJJIJIIJIL.getValue();
    }

    public final TuxTextView b6() {
        return (TuxTextView) this.LLJJIJI.getValue();
    }

    public final LinearLayout c6() {
        return (LinearLayout) this.LLJJI.getValue();
    }

    @Override // X.AbstractC1903430zdF
    public final void R5(AbstractC895380ZAq abstractC895380ZAq) {
        String strLIZJ;
        String strLIZJ2;
        String strLIZJ3;
        String quantityString;
        Resources resources;
        Resources resources2;
        String strLIZJ4;
        String strLIZJ5;
        String strLIZJ6;
        C890690Ywt c890690Ywt = (C890690Ywt) abstractC895380ZAq;
        int i = c890690Ywt.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C786410Ut5.LJZL(8, (LinearLayout) this.LLJILJILJ.getValue());
                            C786410Ut5.LJZL(8, (LinearLayout) this.LLJILJIL.getValue());
                            C786410Ut5.LLLZZIL(T5(), 8);
                            C786410Ut5.LLLZZIL(U5(), 8);
                            C786410Ut5.LJZL(0, c6());
                            C05RV c05rvLIZJ = C889930Yvf.LIZ.LIZJ();
                            switch (C880580Yga.LIZ[c890690Ywt.LLILLL.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                    ImageView imageViewX5 = X5();
                                    C0HTI c0hti = new C0HTI();
                                    c0hti.LIZ = R.drawable.mv;
                                    imageViewX5.setImageDrawable(c0hti.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131845356));
                                    a6().setText(C1618770sE7.LIZJ(2131845355));
                                    C786410Ut5.LLLLZLL(W5(), 8);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case 4:
                                    ImageView imageViewX52 = X5();
                                    C0HTI c0hti2 = new C0HTI();
                                    c0hti2.LIZ = R.drawable.n6;
                                    imageViewX52.setImageDrawable(c0hti2.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131845360));
                                    a6().setText(C1618770sE7.LIZJ(2131845359));
                                    C786410Ut5.LLLLZLL(W5(), 8);
                                    C786410Ut5.LLLLZLL(V5(), 0);
                                    V5().setText(C1618770sE7.LIZJ(2131845358));
                                    C1618770sE7.LJI(V5(), new AwS415S0200000_14(this, c890690Ywt, 86));
                                    break;
                                case 5:
                                    ImageView imageViewX53 = X5();
                                    C0HTI c0hti3 = new C0HTI();
                                    c0hti3.LIZ = R.drawable.my;
                                    imageViewX53.setImageDrawable(c0hti3.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131845328));
                                    a6().setText(C1618770sE7.LIZJ(2131845327));
                                    W5().setText(C1618770sE7.LIZJ(2131845321));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 105));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case 6:
                                    ImageView imageViewX54 = X5();
                                    C0HTI c0hti4 = new C0HTI();
                                    c0hti4.LIZ = R.drawable.mv;
                                    imageViewX54.setImageDrawable(c0hti4.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131845356));
                                    a6().setText(C1618770sE7.LIZJ(2131845361));
                                    TuxTextView tuxTextViewW5 = W5();
                                    if (c05rvLIZJ == C05RV.BUSINESS_INBOX) {
                                        strLIZJ = C1618770sE7.LIZJ(2131845272);
                                    } else {
                                        strLIZJ = C1618770sE7.LIZJ(2131845321);
                                    }
                                    tuxTextViewW5.setText(strLIZJ);
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 88));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case 7:
                                    ImageView imageViewX55 = X5();
                                    C0HTI c0hti5 = new C0HTI();
                                    c0hti5.LIZ = R.drawable.my;
                                    imageViewX55.setImageDrawable(c0hti5.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131845356));
                                    TuxTextView tuxTextViewA6 = a6();
                                    C05RV c05rv = C05RV.BUSINESS_INBOX;
                                    if (c05rvLIZJ == c05rv) {
                                        strLIZJ2 = C1618770sE7.LIZJ(2131845275);
                                    } else {
                                        strLIZJ2 = C1618770sE7.LIZJ(2131845322);
                                    }
                                    tuxTextViewA6.setText(strLIZJ2);
                                    TuxTextView tuxTextViewW52 = W5();
                                    if (c05rvLIZJ == c05rv) {
                                        strLIZJ3 = C1618770sE7.LIZJ(2131845272);
                                    } else {
                                        strLIZJ3 = C1618770sE7.LIZJ(2131845321);
                                    }
                                    tuxTextViewW52.setText(strLIZJ3);
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 89));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case 8:
                                    ImageView imageViewX56 = X5();
                                    C0HTI c0hti6 = new C0HTI();
                                    c0hti6.LIZ = R.drawable.ng;
                                    imageViewX56.setImageDrawable(c0hti6.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131845326));
                                    a6().setText(C1618770sE7.LIZJ(2131845325));
                                    W5().setText(C1618770sE7.LIZJ(2131845321));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 91));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    ImageView imageViewX57 = X5();
                                    C0HTI c0hti7 = new C0HTI();
                                    c0hti7.LIZ = R.drawable.my;
                                    imageViewX57.setImageDrawable(c0hti7.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131845318));
                                    a6().setText(C1618770sE7.LIZJ(2131845317));
                                    W5().setText(C1618770sE7.LIZJ(2131845321));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 92));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    ImageView imageViewX58 = X5();
                                    C0HTI c0hti8 = new C0HTI();
                                    c0hti8.LIZ = R.drawable.my;
                                    imageViewX58.setImageDrawable(c0hti8.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131845320));
                                    a6().setText(C1618770sE7.LIZJ(2131845319));
                                    W5().setText(C1618770sE7.LIZJ(2131845321));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 93));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    ImageView imageViewX59 = X5();
                                    C0HTI c0hti9 = new C0HTI();
                                    c0hti9.LIZ = R.drawable.my;
                                    imageViewX59.setImageDrawable(c0hti9.LIZ(this.itemView.getContext()));
                                    TuxTextView tuxTextViewB6 = b6();
                                    Activity activityL5 = L5();
                                    String quantityString2 = null;
                                    if (activityL5 != null && (resources2 = activityL5.getResources()) != null) {
                                        quantityString = resources2.getQuantityString(2131755633, 1, "1");
                                    } else {
                                        quantityString = null;
                                    }
                                    tuxTextViewB6.setText(quantityString);
                                    TuxTextView tuxTextViewA62 = a6();
                                    Activity activityL52 = L5();
                                    if (activityL52 != null && (resources = activityL52.getResources()) != null) {
                                        quantityString2 = resources.getQuantityString(2131755632, 1, "1");
                                    }
                                    tuxTextViewA62.setText(quantityString2);
                                    W5().setText(C1618770sE7.LIZJ(2131845321));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 94));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    ImageView imageViewX510 = X5();
                                    C0HTI c0hti10 = new C0HTI();
                                    c0hti10.LIZ = R.drawable.my;
                                    imageViewX510.setImageDrawable(c0hti10.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131850092));
                                    a6().setText(C1618770sE7.LIZJ(2131850091));
                                    W5().setText(C1618770sE7.LIZJ(2131845321));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 95));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    ImageView imageViewX511 = X5();
                                    C0HTI c0hti11 = new C0HTI();
                                    c0hti11.LIZ = R.drawable.my;
                                    imageViewX511.setImageDrawable(c0hti11.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131834815));
                                    a6().setText(C1618770sE7.LIZJ(2131834814));
                                    W5().setText(C1618770sE7.LIZJ(2131845321));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 96));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case 14:
                                    ImageView imageViewX512 = X5();
                                    C0HTI c0hti12 = new C0HTI();
                                    c0hti12.LIZ = R.drawable.my;
                                    imageViewX512.setImageDrawable(c0hti12.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131834813));
                                    a6().setText(C1618770sE7.LIZJ(2131834812));
                                    W5().setText(C1618770sE7.LIZJ(2131845321));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 97));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case 15:
                                    ImageView imageViewX513 = X5();
                                    C0HTI c0hti13 = new C0HTI();
                                    c0hti13.LIZ = R.drawable.my;
                                    imageViewX513.setImageDrawable(c0hti13.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131834817));
                                    a6().setText(C1618770sE7.LIZJ(2131834816));
                                    W5().setText(C1618770sE7.LIZJ(2131845321));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 98));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case 16:
                                    ImageView imageViewX514 = X5();
                                    C0HTI c0hti14 = new C0HTI();
                                    c0hti14.LIZ = R.drawable.n4;
                                    imageViewX514.setImageDrawable(c0hti14.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131845324));
                                    a6().setText(C1618770sE7.LIZJ(2131845323));
                                    W5().setText(C1618770sE7.LIZJ(2131845321));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 99));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    ImageView imageViewX515 = X5();
                                    C0HTI c0hti15 = new C0HTI();
                                    c0hti15.LIZ = R.drawable.nk;
                                    imageViewX515.setImageDrawable(c0hti15.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131845357));
                                    TuxTextView tuxTextViewA63 = a6();
                                    C05RV c05rv2 = C05RV.BUSINESS_INBOX;
                                    if (c05rvLIZJ == c05rv2) {
                                        strLIZJ4 = C1618770sE7.LIZJ(2131845274);
                                    } else {
                                        strLIZJ4 = C1618770sE7.LIZJ(2131845329);
                                    }
                                    tuxTextViewA63.setText(strLIZJ4);
                                    TuxTextView tuxTextViewW53 = W5();
                                    if (c05rvLIZJ == c05rv2) {
                                        strLIZJ5 = C1618770sE7.LIZJ(2131845272);
                                    } else {
                                        strLIZJ5 = C1618770sE7.LIZJ(2131845321);
                                    }
                                    tuxTextViewW53.setText(strLIZJ5);
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 100));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                    ImageView imageViewX516 = X5();
                                    C0HTI c0hti16 = new C0HTI();
                                    c0hti16.LIZ = R.drawable.n3;
                                    imageViewX516.setImageDrawable(c0hti16.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131845271));
                                    a6().setText(C1618770sE7.LIZJ(2131845270));
                                    Integer num = c890690Ywt.LLILZ;
                                    if (num != null && num.intValue() == 1) {
                                        C786410Ut5.LLLLZLL(W5(), 8);
                                        C786410Ut5.LLLLZLL(V5(), 0);
                                        V5().setText(C1618770sE7.LIZJ(2131845269));
                                        C891810Yyh.LIZIZ("professional_inbox_ads_sections", false);
                                        C1618770sE7.LJI(V5(), new AwS415S0200000_14(this, c890690Ywt, 85));
                                    } else if (c890690Ywt.LLILZ != null) {
                                        TuxTextView tuxTextViewW54 = W5();
                                        if (c05rvLIZJ == C05RV.BUSINESS_INBOX) {
                                            strLIZJ6 = C1618770sE7.LIZJ(2131845272);
                                        } else {
                                            strLIZJ6 = C1618770sE7.LIZJ(2131845321);
                                        }
                                        tuxTextViewW54.setText(strLIZJ6);
                                        C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 101));
                                        C786410Ut5.LLLLZLL(W5(), 0);
                                        C786410Ut5.LLLLZLL(V5(), 8);
                                    } else {
                                        C786410Ut5.LLLLZLL(V5(), 8);
                                        C786410Ut5.LLLLZLL(W5(), 8);
                                    }
                                    break;
                                case 19:
                                    ImageView imageViewX517 = X5();
                                    C0HTI c0hti17 = new C0HTI();
                                    c0hti17.LIZ = R.drawable.my;
                                    imageViewX517.setImageDrawable(c0hti17.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131827499));
                                    a6().setText(C1618770sE7.LIZJ(2131827498));
                                    W5().setText(C1618770sE7.LIZJ(2131845272));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 102));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                    ImageView imageViewX518 = X5();
                                    C0HTI c0hti18 = new C0HTI();
                                    c0hti18.LIZ = R.drawable.my;
                                    imageViewX518.setImageDrawable(c0hti18.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131855837));
                                    a6().setText(C1618770sE7.LIZJ(2131855836));
                                    W5().setText(C1618770sE7.LIZJ(2131845272));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 103));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case 21:
                                    ImageView imageViewX519 = X5();
                                    C0HTI c0hti19 = new C0HTI();
                                    c0hti19.LIZ = R.drawable.n4;
                                    imageViewX519.setImageDrawable(c0hti19.LIZ(this.itemView.getContext()));
                                    b6().setText(C1618770sE7.LIZJ(2131845356));
                                    a6().setText(C1618770sE7.LIZJ(2131845273));
                                    W5().setText(C1618770sE7.LIZJ(2131845272));
                                    C1618770sE7.LJI(W5(), new AwS429S0200000_28(this, c890690Ywt, 104));
                                    C786410Ut5.LLLLZLL(W5(), 0);
                                    C786410Ut5.LLLLZLL(V5(), 8);
                                    break;
                                case 22:
                                case 23:
                                    C786410Ut5.LJZL(8, c6());
                                    break;
                                default:
                                    throw new C1954807lC();
                            }
                        }
                    } else {
                        C786410Ut5.LLLZZIL(U5(), 0);
                        U5().LIZJ();
                        C786410Ut5.LJZL(8, (LinearLayout) this.LLJILJIL.getValue());
                        C786410Ut5.LJZL(8, (LinearLayout) this.LLJILJILJ.getValue());
                        C786410Ut5.LJZL(8, c6());
                        C786410Ut5.LLLZZIL(T5(), 8);
                    }
                } else {
                    C786410Ut5.LLLZZIL(T5(), 0);
                    T5().LIZJ();
                    C786410Ut5.LJZL(8, (LinearLayout) this.LLJILJIL.getValue());
                    C786410Ut5.LJZL(8, (LinearLayout) this.LLJILJILJ.getValue());
                    C786410Ut5.LJZL(8, c6());
                    C786410Ut5.LLLZZIL(U5(), 8);
                }
            } else {
                C786410Ut5.LJZL(0, (LinearLayout) this.LLJILJILJ.getValue());
                C1618770sE7.LJI((View) this.LLJILLL.getValue(), new AwS429S0200000_28(this, c890690Ywt, 90));
                C786410Ut5.LJZL(8, (LinearLayout) this.LLJILJIL.getValue());
                C786410Ut5.LJZL(8, c6());
                C786410Ut5.LLLZZIL(T5(), 8);
                C786410Ut5.LLLZZIL(U5(), 8);
            }
        } else {
            C786410Ut5.LJZL(0, (LinearLayout) this.LLJILJIL.getValue());
            ((TextView) this.LLJJ.getValue()).setText(C1618770sE7.LIZJ(C890100Yvw.LIZIZ.LJIIIZ()));
            C786410Ut5.LJZL(8, (LinearLayout) this.LLJILJILJ.getValue());
            C786410Ut5.LJZL(8, c6());
            C786410Ut5.LLLZZIL(T5(), 8);
            C786410Ut5.LLLZZIL(U5(), 8);
        }
        int i2 = c890690Ywt.LLILLJJLI;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    return;
                }
            } else {
                C889830YvV.LIZ(c890690Ywt.LLILLL, "show_loading");
                return;
            }
        }
        C889830YvV.LIZ(c890690Ywt.LLILLL, "show_empty");
    }

    public C1912620zs4(View view, AwS572S0100000_28 awS572S0100000_28) {
        super(view);
        this.LLJ = awS572S0100000_28;
        this.LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(view, 732));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 733));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 730));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 729));
        this.LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 728));
        this.LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 731));
        this.LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(view, 739));
        this.LLJJIII = C452501pT.LIZIZ(new AwS572S0100000_28(view, 736));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS572S0100000_28(view, 738));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 737));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(view, 735));
        this.LLJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(view, 734));
    }

    public static void d6(String str, String str2) {
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("type", str), new Pair("inbox_mode", C889930Yvf.LIZ.LIZJ().getMobValue()), new Pair("tab_name", str2));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("inbox_dm_tab_empty_page_btn_click", mapLJIIIIZZ);
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        I5(i, interfaceC1891350zJl);
    }
}

package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0000000_1;
import g1c.AjS20S0300000_1;
import g1c.AjS2S1100000_1;
import g1c.AjS7S0400000_1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03GO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GO extends FrameLayout {
    public static final /* synthetic */ int LLJJ = 0;
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public LinearLayout LLILZLL;
    public SmartImageView LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxIconView LLJ;
    public SmartImageView LLJI;
    public TuxIconView LLJIJIL;
    public LinearLayout LLJILJIL;
    public boolean LLJILJILJ;
    public final LinkedList<C03GP> LLJILLL;

    public final TuxTextView getDefaultOspSummaryItemOriginalPriceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fjz);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getDefaultOspSummaryItemSubListFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fk0);
            this.LLILZLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getDefaultOspSummaryItemTitleIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fk1);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.desc);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getDescIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fn_);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final SmartImageView getDescImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fnh);
            this.LLIZ = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final SmartImageView getIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jxe);
            this.LLJI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxIconView getIvArrowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l8u);
            this.LLJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getSubDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.we7);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.title);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getTitleLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y04);
            this.LLJILJIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxIconView getTitleRightIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y2v);
            this.LLJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final void LIZ() {
        C786410Ut5.LJLLLLLL(8, getDefaultOspSummaryItemTitleIconFromXml());
        C03DZ.LIZ(getDefaultOspSummaryItemSubListFromXml());
        C0H9H.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), getTitleFromXml());
    }

    public final void LIZLLL() {
        C786410Ut5.LLLLLLZZ(getIvArrowFromXml(), 8);
    }

    public final String getTitleText() {
        return getTitleFromXml().getText().toString();
    }

    public final boolean getSubItemIsExpand() {
        return this.LLJILJILJ;
    }

    public C03GO(Context context) {
        super(context, null, 0);
        this.LLJILLL = new LinkedList<>();
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.b3y, this, true);
    }

    public final void setDefaultOspSummaryItemOriginalPriceFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setDefaultOspSummaryItemSubListFromXml(LinearLayout linearLayout) {
        this.LLILZLL = linearLayout;
    }

    public final void setDefaultOspSummaryItemTitleIconFromXml(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setDescColor(int i) {
        getDescFromXml().setTextColor(i);
    }

    public final void setDescColorRes(int i) {
        getDescFromXml().setTextColorRes(i);
    }

    public final void setDescFont(int i) {
        getDescFromXml().setTuxFont(i);
    }

    public final void setDescFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setDescIconFromXml(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setDescImage(String str) {
        C786410Ut5.LLFF(0, getDescImgFromXml());
        if (str == null) {
            str = " ";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(getDescImgFromXml());
        C786410Ut5.h3(c1331670kl3LJIIIZ);
    }

    public final void setDescImageAlpha(float f) {
        if (getDescImgFromXml().getAlpha() == f) {
            return;
        }
        C786410Ut5.u5(getDescImgFromXml(), f);
    }

    public final void setDescImgFromXml(SmartImageView smartImageView) {
        this.LLIZ = smartImageView;
    }

    public final void setDescText(String str) {
        getDescFromXml().setText(str);
    }

    public final void setIconFromXml(SmartImageView smartImageView) {
        this.LLJI = smartImageView;
    }

    public final void setIvArrowFromXml(TuxIconView tuxIconView) {
        this.LLJ = tuxIconView;
    }

    public final void setSubDescFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setSubDescText(String str) {
        C786410Ut5.LLLLZLL(getSubDescFromXml(), 0);
        getSubDescFromXml().setText(str);
    }

    public final void setSubDescTextOrGone(String str) {
        if (str != null && str.length() != 0) {
            setSubDescText(str);
        } else {
            C03DZ.LIZ(getSubDescFromXml());
        }
    }

    public final void setSubItem(List<BillItem> list) {
        Integer priceTextColor;
        String priceStr;
        if (list != null) {
            LinearLayout defaultOspSummaryItemSubListFromXml = getDefaultOspSummaryItemSubListFromXml();
            LinkedList<C03GP> linkedList = this.LLJILLL;
            while (defaultOspSummaryItemSubListFromXml.getChildCount() > 0) {
                View childAt = defaultOspSummaryItemSubListFromXml.getChildAt(0);
                C786410Ut5.LJJJLZIJ(childAt, defaultOspSummaryItemSubListFromXml);
                if (childAt instanceof C03GP) {
                    linkedList.add((C03GP) childAt);
                }
            }
            C786410Ut5.LJLLLLLL(0, getDefaultOspSummaryItemSubListFromXml());
            for (BillItem billItem : list) {
                C03GP c03gp = (C03GP) C19719612Di.LJJIIZI(this.LLJILLL);
                if (c03gp == null) {
                    c03gp = new C03GP(getContext());
                }
                ECRichText eCRichText = billItem.itemNameRichText;
                String str = "";
                if (eCRichText != null) {
                    c03gp.setRichTextTitle(eCRichText);
                } else {
                    String str2 = billItem.itemName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c03gp.setTitle(str2);
                }
                c03gp.setTitleColorRes(C7736030k.LIZ(billItem.itemTextColor, null));
                Price price = billItem.itemPrice;
                if (price != null && (priceStr = price.getPriceStr()) != null) {
                    str = priceStr;
                }
                c03gp.setDesc(str);
                Price price2 = billItem.itemPrice;
                if (price2 != null) {
                    priceTextColor = price2.getPriceTextColor();
                } else {
                    priceTextColor = null;
                }
                c03gp.setDescColorRes(C7736030k.LIZ(priceTextColor, null));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = (int) C12ES.LIZJ(15.0f, getContext());
                getDefaultOspSummaryItemSubListFromXml().addView(c03gp, layoutParams);
            }
            return;
        }
        C786410Ut5.LJLLLLLL(8, getDefaultOspSummaryItemSubListFromXml());
    }

    public final void setSubItemIsExpand(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setTitleColor(int i) {
        getTitleFromXml().setTextColor(i);
    }

    public final void setTitleColorRes(int i) {
        getTitleFromXml().setTextColorRes(i);
    }

    public final void setTitleFont(int i) {
        getTitleFromXml().setTuxFont(i);
    }

    public final void setTitleFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setTitleLayoutFromXml(LinearLayout linearLayout) {
        this.LLJILJIL = linearLayout;
    }

    public final void setTitleLayoutHeight(int i) {
        C1744700vVE.LJIIIIZZ(i, getTitleLayoutFromXml());
    }

    public final void setTitleRightIconFromXml(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setTitleText(String str) {
        getTitleFromXml().setText(str);
    }

    public final void LIZJ(Fragment fragment, List list) {
        Integer priceTextColor;
        String priceStr;
        if (list != null) {
            LinearLayout defaultOspSummaryItemSubListFromXml = getDefaultOspSummaryItemSubListFromXml();
            LinkedList<C03GP> linkedList = this.LLJILLL;
            while (defaultOspSummaryItemSubListFromXml.getChildCount() > 0) {
                View childAt = defaultOspSummaryItemSubListFromXml.getChildAt(0);
                C786410Ut5.LJJJLZIJ(childAt, defaultOspSummaryItemSubListFromXml);
                if (childAt instanceof C03GP) {
                    linkedList.add((C03GP) childAt);
                }
            }
            C786410Ut5.LJLLLLLL(0, getDefaultOspSummaryItemSubListFromXml());
            C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), getDefaultOspSummaryItemSubListFromXml());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                BillItem billItem = (BillItem) it2.next();
                C03GP c03gp = (C03GP) C19719612Di.LJJIIZI(this.LLJILLL);
                if (c03gp == null) {
                    c03gp = new C03GP(getContext());
                }
                ECRichText eCRichText = billItem.itemNameRichText;
                String str = "";
                if (eCRichText != null) {
                    c03gp.setRichTextTitle(eCRichText);
                } else {
                    String str2 = billItem.itemName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c03gp.setTitle(str2);
                }
                c03gp.setTitleColorRes(C7736030k.LIZ(billItem.itemTextColor, null));
                c03gp.setTitleFont(71);
                Price price = billItem.itemPrice;
                if (price != null && (priceStr = price.getPriceStr()) != null) {
                    str = priceStr;
                }
                c03gp.setDesc(str);
                Price price2 = billItem.itemPrice;
                if (price2 != null) {
                    priceTextColor = price2.getPriceTextColor();
                } else {
                    priceTextColor = null;
                }
                c03gp.setDescColorRes(C7736030k.LIZ(priceTextColor, null));
                c03gp.setDescFont(71);
                c03gp.LIZ(-16777216, null);
                C786410Ut5.I7(new AjS10S0000000_1(13), c03gp);
                if (Intrinsics.LJFF(billItem.hasPopup, Boolean.TRUE)) {
                    c03gp.LIZ(C960203pA.LIZ(R.attr.a1j, c03gp.getContext()), Integer.valueOf(R.raw.icon_info_circle));
                    Integer num = billItem.popupStyle;
                    int value = C03GQ.WITH_BUTTON.getValue();
                    if (num != null && num.intValue() == value) {
                        C786410Ut5.I7(new AjS7S0400000_1(c03gp, C722002rq.LIZLLL(billItem), fragment, (Object) null, 14), c03gp);
                    } else {
                        int value2 = C03GQ.IMAGE_LIST.getValue();
                        if (num != null && num.intValue() == value2) {
                            C786410Ut5.I7(new AjS20S0300000_1(fragment, c03gp, C722002rq.LIZLLL(billItem), 41), c03gp);
                        }
                    }
                }
                getDefaultOspSummaryItemSubListFromXml().addView(c03gp, new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))));
            }
            return;
        }
        C786410Ut5.LJLLLLLL(8, getDefaultOspSummaryItemSubListFromXml());
    }

    public final void LJ(C03IT c03it, String str) {
        if (c03it != null && str != null) {
            C786410Ut5.LLFF(0, getIconFromXml());
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03it);
            c1331670kl3LJIIJ.LJJ(getIconFromXml());
            C786410Ut5.h3(c1331670kl3LJIIJ);
            C786410Ut5.I7(new AjS2S1100000_1(this, str, 10), getIconFromXml());
            return;
        }
        C03DZ.LIZ(getIconFromXml());
    }

    public final void LJFF(int i, Integer num) {
        if (num == null) {
            C786410Ut5.LLLLLLZZ(getTitleRightIconFromXml(), 8);
            return;
        }
        C786410Ut5.LLLLLLZZ(getTitleRightIconFromXml(), 0);
        getTitleRightIconFromXml().setIconRes(num.intValue());
        getTitleRightIconFromXml().setTintColor(i);
    }

    public final void LIZIZ(Integer num, Integer num2, String str) {
        TuxTextView defaultOspSummaryItemOriginalPriceFromXml = getDefaultOspSummaryItemOriginalPriceFromXml();
        if (C703302op.LIZ(str)) {
            C12ES.LJIILL(0, defaultOspSummaryItemOriginalPriceFromXml);
            defaultOspSummaryItemOriginalPriceFromXml.setText(str);
            defaultOspSummaryItemOriginalPriceFromXml.setTuxFont(C7736030k.LIZJ(num, null));
            defaultOspSummaryItemOriginalPriceFromXml.setTextColorRes(C7736030k.LIZ(num2, null));
            defaultOspSummaryItemOriginalPriceFromXml.getPaint().setFlags(16);
            defaultOspSummaryItemOriginalPriceFromXml.getPaint().setAntiAlias(true);
            return;
        }
        C03DZ.LIZ(defaultOspSummaryItemOriginalPriceFromXml);
    }
}

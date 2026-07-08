package X;

import Y.ARunnableS70S0200000_1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS685S0100000_1;

/* JADX INFO: renamed from: X.039j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7969039j {
    public static final C7969039j LIZ = new C7969039j();
    public static final Map<Integer, Boolean> LIZIZ = new LinkedHashMap();

    public static String LIZ(Integer num) {
        if (num == null) {
            return "";
        }
        if (num.intValue() == 2) {
            return "tax_detail";
        }
        if (num.intValue() == 1) {
            return "item_total_detail";
        }
        if (num.intValue() != 52) {
            return "";
        }
        return "item_discount_detail";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZLLL(java.lang.Integer r6) {
        /*
            r0 = 4
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "module_name"
            java.lang.String r5 = "order_summary"
            r1.<init>(r0, r5)
            r0 = 0
            r3[r0] = r1
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "button_name"
            java.lang.String r0 = "info"
            r2.<init>(r1, r0)
            r4 = 1
            r3[r4] = r2
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "option_type"
            r2.<init>(r0, r5)
            r1 = 2
            r3[r1] = r2
            if (r6 == 0) goto L6f
            int r0 = r6.intValue()
            if (r0 != r4) goto L3e
            java.lang.String r2 = "item_total"
        L2f:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "option_name"
            r1.<init>(r0, r2)
            r0 = 3
            r3[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIJ(r3)
            return r0
        L3e:
            int r0 = r6.intValue()
            if (r0 != r1) goto L47
            java.lang.String r2 = "taxes"
            goto L2f
        L47:
            int r1 = r6.intValue()
            r0 = 7
            if (r1 == r0) goto L6c
            int r1 = r6.intValue()
            r0 = 52
            if (r1 == r0) goto L6c
            int r1 = r6.intValue()
            r0 = 16
            if (r1 != r0) goto L61
            java.lang.String r2 = "shipping"
            goto L2f
        L61:
            int r1 = r6.intValue()
            r0 = 22
            if (r1 != r0) goto L6f
            java.lang.String r2 = "retail_delivery_fee"
            goto L2f
        L6c:
            java.lang.String r2 = "discounts"
            goto L2f
        L6f:
            java.lang.String r2 = ""
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7969039j.LIZLLL(java.lang.Integer):java.util.Map");
    }

    public static void LJ(C722302rt c722302rt, List list) {
        Integer num;
        List<BillItem> list2;
        boolean z;
        ((LinkedHashMap) LIZIZ).clear();
        if (c722302rt != null && (num = c722302rt.LLJJIJI) != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                for (C714302qb c714302qb : (ArrayList) list) {
                    if (C756302xN.LIZ(c714302qb.LJIIJ) && (list2 = c714302qb.LJIIJ) != null && list2.size() > 0 && !c714302qb.LJIILLIIL) {
                        Map<Integer, Boolean> map = LIZIZ;
                        Integer num2 = c714302qb.LJIIIIZZ;
                        if (iIntValue == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        map.put(num2, Boolean.valueOf(z));
                    }
                }
            }
        }
    }

    public static C7979039t LJFF(C7969039j c7969039j, String str, String str2, List list, Integer num, int i) {
        List list2 = list;
        String str3 = str2;
        Integer num2 = null;
        if ((i & 2) != 0) {
            str3 = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        if ((i & 8) == 0) {
            num2 = num;
        }
        c7969039j.getClass();
        int iIntValue = 1;
        C21717319z1 c21717319z1 = new C21717319z1(str, null, null, 1, 1, 6);
        C21717319z1 c21717319z12 = new C21717319z1(str3, null, null, 1, 2, 6);
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        return new C7979039t(c21717319z1, c21717319z12, list2, iIntValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.039k, android.view.View] */
    public static void LIZIZ(LinearLayout linearLayout, View view, List list, OrderSubmitAssemViewModel orderSubmitAssemViewModel, Fragment fragment, String str, Map map) {
        String priceStr;
        Integer priceTextColor;
        int i;
        if (list != null) {
            C786410Ut5.LJJJJJL(linearLayout);
            C12ES.LJIILL(0, linearLayout);
            C12ES.LJIILL(0, view);
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    BillItem billItem = (BillItem) obj;
                    final Context context = linearLayout.getContext();
                    ?? r12 = new FrameLayout(context) { // from class: X.039k
                        public final C01GW LL;
                        public final C01GW LLILLJJLI;
                        public final C01GW LLILLL;

                        public final TuxIconView getInfoIcon() {
                            return (TuxIconView) this.LLILLJJLI.getValue();
                        }

                        public final TuxTextView getPriceView() {
                            return (TuxTextView) this.LLILLL.getValue();
                        }

                        public final TuxTextView getTitleView() {
                            return (TuxTextView) this.LL.getValue();
                        }

                        {
                            super(context, null, 0);
                            this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1648));
                            this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1646));
                            this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1647));
                            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b4c, this, true);
                        }

                        public final void setDesc(String str2) {
                            getPriceView().setText(str2);
                        }

                        public final void setDescColorRes(int i4) {
                            getPriceView().setTextColorRes(i4);
                        }

                        public final void setDescFont(int i4) {
                            getPriceView().setTuxFont(i4);
                        }

                        public final void setTitle(String str2) {
                            getTitleView().setText(str2);
                        }

                        public final void setTitleColorRes(int i4) {
                            getTitleView().setTextColorRes(i4);
                        }

                        public final void setTitleFont(int i4) {
                            getTitleView().setTuxFont(i4);
                        }
                    };
                    r12.setTitle(billItem.itemName);
                    r12.setTitleColorRes(C7736030k.LIZ(billItem.itemTextColor, null));
                    r12.setTitleFont(71);
                    Price price = billItem.itemPrice;
                    if (price != null) {
                        priceStr = price.getPriceStr();
                    } else {
                        priceStr = null;
                    }
                    r12.setDesc(priceStr);
                    Price price2 = billItem.itemPrice;
                    if (price2 != null) {
                        priceTextColor = price2.getPriceTextColor();
                    } else {
                        priceTextColor = null;
                    }
                    r12.setDescColorRes(C7736030k.LIZ(priceTextColor, null));
                    r12.setDescFont(71);
                    boolean zLJFF = Intrinsics.LJFF(billItem.hasPopup, Boolean.TRUE);
                    C7940038g c7940038g = new C7940038g(billItem, fragment, orderSubmitAssemViewModel, r12, linearLayout, map, str);
                    TuxIconView infoIcon = r12.getInfoIcon();
                    if (zLJFF) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, infoIcon);
                    if (zLJFF) {
                        C786410Ut5.I7(new AbS685S0100000_1(c7940038g, 1), r12.getInfoIcon());
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    if (i2 != 0) {
                        layoutParams.topMargin = (int) C12ES.LIZJ(16.0f, linearLayout.getContext());
                    }
                    linearLayout.addView((View) r12, layoutParams);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            HandlerHook.viewPost(linearLayout, new ARunnableS70S0200000_1(view, linearLayout, 31));
            return;
        }
        C03DZ.LIZ(view);
        C03DZ.LIZ(linearLayout);
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DDN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DDN {
    public final C0DD8 LIZ;
    public final Map<String, Boolean> LIZIZ = new LinkedHashMap();

    public C0DDN(C0DD8 c0dd8) {
        this.LIZ = c0dd8;
    }

    public final void LIZ(C0D36 c0d36) {
        int iIntValue;
        int i;
        int iIntValue2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int iIntValue3;
        View viewFindViewById = this.LIZ.LL.findViewById(R.id.m73);
        if (viewFindViewById == null) {
            return;
        }
        if (c0d36 == null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            return;
        }
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
        Context context = viewFindViewById.getContext();
        String string = context.getString(2131857596);
        String string2 = context.getString(2131857595);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        TextView textView = (TextView) viewFindViewById.findViewById(R.id.z4n);
        LinearLayout linearLayout = (LinearLayout) viewFindViewById.findViewById(R.id.m7n);
        TuxTextView tuxTextView = (TuxTextView) viewFindViewById.findViewById(R.id.z6x);
        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById.findViewById(R.id.m7o);
        TuxTextView tuxTextView2 = (TuxTextView) viewFindViewById.findViewById(R.id.z6v);
        LinearLayout linearLayout3 = (LinearLayout) viewFindViewById.findViewById(R.id.m7m);
        View viewFindViewById2 = viewFindViewById.findViewById(R.id.z6s);
        LinearLayout linearLayout4 = (LinearLayout) viewFindViewById.findViewById(R.id.m7p);
        View viewFindViewById3 = viewFindViewById.findViewById(R.id.z6w);
        View viewFindViewById4 = viewFindViewById.findViewById(R.id.fz6);
        LinearLayout linearLayout5 = (LinearLayout) viewFindViewById.findViewById(R.id.m7c);
        TuxTextView tuxTextView3 = (TuxTextView) viewFindViewById.findViewById(R.id.z63);
        LinearLayout linearLayout6 = (LinearLayout) viewFindViewById.findViewById(R.id.m7d);
        if (textView != null) {
            textView.setText(c0d36.sectionTitle);
        }
        C332770D2t c332770D2t = c0d36.shippingSection;
        if (c332770D2t != null) {
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            if (tuxTextView != null) {
                tuxTextView.setText(c332770D2t.title);
            }
            if (c332770D2t.isFreeShipping()) {
                if (tuxTextView != null) {
                    tuxTextView.setTextColorRes(R.attr.g4);
                }
            } else if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.a1h);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("renderShippingSection: isFreeShipping=");
            sbLIZ.append(c332770D2t.isFreeShipping());
            sbLIZ.append(", hasPolicyDetail=");
            String str = c332770D2t.shippingPolicyDetail;
            if (str != null && !a0.LJJJIL(str)) {
                z = false;
            } else {
                z = true;
            }
            sbLIZ.append(!z);
            sbLIZ.append(", hasLegacyArrivalDays=");
            String str2 = c332770D2t.arrivalDaysDesc;
            if (str2 != null && !a0.LJJJIL(str2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            sbLIZ.append(!z2);
            sbLIZ.append(", hasLegacyShippingStrategy=");
            String str3 = c332770D2t.shippingStrategy;
            if (str3 != null && !a0.LJJJIL(str3)) {
                z3 = false;
            } else {
                z3 = true;
            }
            sbLIZ.append(!z3);
            sbLIZ.append(", hasLegacyViewBindings=");
            if (viewFindViewById2 != null && viewFindViewById3 != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            sbLIZ.append(z4);
            C2188811AlT.LIZIZ(sbLIZ);
            if (linearLayout3 != null) {
                C786410Ut5.LJZL(8, linearLayout3);
            }
            if (linearLayout4 != null) {
                C786410Ut5.LJZL(8, linearLayout4);
            }
            String str4 = c332770D2t.shippingPolicyDetail;
            if (str4 != null && !a0.LJJJIL(str4) && tuxTextView2 != null) {
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(0, linearLayout2);
                }
                tuxTextView2.setTextColorRes(R.attr.a1j);
                Context context2 = tuxTextView2.getContext();
                String string3 = context2.getString(2131857596);
                String string4 = context2.getString(2131857595);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context2);
                if (numLIZJ2 != null) {
                    iIntValue3 = numLIZJ2.intValue();
                } else {
                    iIntValue3 = -7829368;
                }
                C0DIU.LIZ(2, 5, iIntValue3, tuxTextView2, str4, string3, string4, "logic_shipping_strategy", this.LIZIZ);
            } else if (linearLayout2 != null) {
                C786410Ut5.LJZL(8, linearLayout2);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("renderShippingPolicyDetail: visible=");
            if (str4 != null && !a0.LJJJIL(str4)) {
                z5 = false;
            } else {
                z5 = true;
            }
            sbLIZ2.append(!z5);
            C2188811AlT.LIZIZ(sbLIZ2);
        } else if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        C0D37 c0d37 = c0d36.returnSection;
        if (c0d37 != null) {
            if (linearLayout5 != null) {
                C786410Ut5.LJZL(0, linearLayout5);
            }
            if (tuxTextView3 != null) {
                tuxTextView3.setText(c0d37.title);
            }
            if (c0d37.isFreeReturn()) {
                if (tuxTextView3 != null) {
                    tuxTextView3.setTextColorRes(R.attr.g4);
                }
            } else if (tuxTextView3 != null) {
                tuxTextView3.setTextColorRes(R.attr.a1h);
            }
            List<String> list = c0d37.requirements;
            if (linearLayout6 != null) {
                C786410Ut5.LJJJJJL(linearLayout6);
                if (list.isEmpty()) {
                    C786410Ut5.LJZL(8, linearLayout6);
                } else {
                    Context context3 = linearLayout6.getContext();
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1j, context3);
                    if (numLIZJ3 != null) {
                        iIntValue2 = numLIZJ3.intValue();
                    } else {
                        iIntValue2 = -16777216;
                    }
                    int i2 = 0;
                    for (String str5 : list) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            LinearLayout linearLayout7 = new LinearLayout(context3);
                            C786410Ut5.d6(linearLayout7, new LinearLayout.LayoutParams(-1, -2));
                            linearLayout7.setOrientation(0);
                            View view = new View(context3);
                            C786410Ut5.W5(view, new LinearLayout.LayoutParams((int) (20 * context3.getResources().getDisplayMetrics().density), 1));
                            TuxTextView tuxTextView4 = new TuxTextView(context3, null, 6, 0);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                            layoutParams.setMarginStart((int) (8 * context3.getResources().getDisplayMetrics().density));
                            C786410Ut5.R6(tuxTextView4, layoutParams);
                            tuxTextView4.setTextColor(iIntValue2);
                            linearLayout7.addView(view);
                            linearLayout7.addView(tuxTextView4);
                            linearLayout6.addView(linearLayout7);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("logic_return_requirement_");
                            sbLIZ3.append(i2);
                            C0DIU.LIZ(2, 4, iIntValue, tuxTextView4, str5, string, string2, C2188811AlT.LIZIZ(sbLIZ3), this.LIZIZ);
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    C786410Ut5.LJZL(0, linearLayout6);
                }
            }
        } else if (linearLayout5 != null) {
            C786410Ut5.LJZL(8, linearLayout5);
        }
        if (viewFindViewById4 != null) {
            if (c332770D2t != null && c0d37 != null) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById4);
        }
    }
}

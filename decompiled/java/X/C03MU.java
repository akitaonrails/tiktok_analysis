package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlaceOrderButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubtextArea;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import g1c.AjS40S0200000_1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS20S1400000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03MU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MU extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public C03MX LLILZIL;

    private final LinearLayout getDoubleButtonContainer() {
        return (LinearLayout) this.LLILLJJLI.getValue();
    }

    public final C197039127h getLeftButton() {
        return (C197039127h) this.LLILLL.getValue();
    }

    public final C197039127h getRightButton() {
        return (C197039127h) this.LLILZ.getValue();
    }

    public final C197039127h getSingleButton() {
        return (C197039127h) this.LL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C03MX c03mx = this.LLILZIL;
        if (c03mx != null) {
            c03mx.LIZ();
        }
    }

    public C03MU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1687));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1684));
        this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1685));
        this.LLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1686));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.avu, this, true);
    }

    public static void LIZIZ(C197039127h c197039127h, C03MY c03my) {
        int iLIZIZ;
        if (c03my == null) {
            return;
        }
        C830003Mc c830003Mc = c03my.LIZIZ;
        if (c830003Mc != null) {
            c197039127h.setButtonSize(c830003Mc.LIZ);
            ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
            Integer num = c830003Mc.LIZJ;
            if (num != null) {
                iLIZIZ = num.intValue();
            } else {
                iLIZIZ = C0H9H.LIZIZ(48);
            }
            layoutParams.height = iLIZIZ;
            C786410Ut5.J6(c197039127h, layoutParams);
            c197039127h.LJJJJL(new AwS367S0200000_1(c197039127h, c830003Mc, 49));
        }
        c197039127h.setEnabled(c03my.LIZLLL);
        c197039127h.setSupportClickWhenDisable(false);
        c197039127h.setLoading(c03my.LJFF);
    }

    public final void LIZJ(C03MY c03my, OspBottomViewModel ospBottomViewModel, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        boolean z;
        C03MY c03my2;
        C03MY c03my3;
        C03MQ c03mq;
        C03MY next;
        C03MY next2;
        C03MX c03mx = this.LLILZIL;
        if (c03mx != null) {
            c03mx.LIZ();
        }
        C833003Ng c833003Ng = c03my.LIZ;
        if (c833003Ng != null && c833003Ng.LIZ) {
            List<C03MY> list = c03my.LJII;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (!ospBottomViewModel.LLILZIL) {
                    C786410Ut5.LJLLLLLL(8, getSingleButton());
                    C786410Ut5.LJLLLLLL(0, getDoubleButtonContainer());
                    List<C03MY> list2 = c03my.LJII;
                    C03MQ c03mq2 = null;
                    if (list2 != null) {
                        Iterator<C03MY> it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (next2.LJI == C03MZ.DOUBLE_LEFT) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        c03my2 = next2;
                    } else {
                        c03my2 = null;
                    }
                    List<C03MY> list3 = c03my.LJII;
                    if (list3 != null) {
                        Iterator<C03MY> it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (next.LJI == C03MZ.DOUBLE_RIGHT) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        c03my3 = next;
                    } else {
                        c03my3 = null;
                    }
                    LIZIZ(getLeftButton(), c03my2);
                    C197039127h leftButton = getLeftButton();
                    if (c03my2 != null) {
                        c03mq = c03my2.LIZJ;
                    } else {
                        c03mq = null;
                    }
                    LIZ(leftButton, c03mq, true, orderSubmitAssemViewModel);
                    ospBottomViewModel.LLIZ.put("tag_text", getLeftButton().getText());
                    C786410Ut5.I7(new AjS20S0300000_1(ospBottomViewModel, this, orderSubmitAssemViewModel, 44), getLeftButton());
                    LIZIZ(getRightButton(), c03my3);
                    C197039127h rightButton = getRightButton();
                    if (c03my3 != null) {
                        c03mq2 = c03my3.LIZJ;
                    }
                    LIZ(rightButton, c03mq2, false, orderSubmitAssemViewModel);
                    C786410Ut5.I7(new AjS40S0200000_1(ospBottomViewModel, this, 79), getRightButton());
                    if (!ospBottomViewModel.LLJILLL) {
                        orderSubmitAssemViewModel.withState(new AwS580S0100000_1(ospBottomViewModel, 816));
                        return;
                    }
                    return;
                }
                return;
            }
            C786410Ut5.LJLLLLLL(8, getDoubleButtonContainer());
            C786410Ut5.LJLLLLLL(0, getSingleButton());
            LIZIZ(getSingleButton(), c03my);
            if (!ospBottomViewModel.LLILZIL) {
                LIZ(getSingleButton(), c03my.LIZJ, false, orderSubmitAssemViewModel);
                ospBottomViewModel.LLJIJIL = false;
                if (!ospBottomViewModel.LLJILJILJ) {
                    orderSubmitAssemViewModel.withState(new AwS210S0300000_1(ospBottomViewModel, orderSubmitAssemViewModel, this, 87));
                }
            }
            C786410Ut5.I7(new AjS40S0200000_1(ospBottomViewModel, this, 80), getSingleButton());
            return;
        }
        C197039127h singleButton = getSingleButton();
        if (singleButton != null) {
            C786410Ut5.LJLLLLLL(4, singleButton);
        }
        LinearLayout doubleButtonContainer = getDoubleButtonContainer();
        if (doubleButtonContainer == null) {
            return;
        }
        C03DZ.LIZ(doubleButtonContainer);
    }

    public final void LIZ(C197039127h c197039127h, C03MQ c03mq, boolean z, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        long jLongValue;
        String str;
        Long lValueOf;
        Long l;
        IECommerceHostService iECommerceHostService;
        String name;
        Long l2;
        ECRichText eCRichText;
        if (c03mq != null) {
            String str2 = c03mq.LIZ;
            c197039127h.setText(str2);
            ECRichText eCRichText2 = c03mq.LIZIZ;
            Icon icon = null;
            if (eCRichText2 != null) {
                C03B0 c03b0 = new C03B0(c197039127h, "order_submit_recommend_payment_button");
                C03B0.LIZ(c03b0, eCRichText2, null, null, false, null, null, 126);
                spannableStringBuilder = c03b0.LIZJ;
            } else {
                spannableStringBuilder = null;
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            if ((str2 == null || spannableStringBuilder3.append((CharSequence) str2) == null) && spannableStringBuilder != null) {
                spannableStringBuilder3.append((CharSequence) spannableStringBuilder);
            }
            SubtextArea subtextArea = c03mq.LIZJ;
            if (subtextArea != null && (eCRichText = subtextArea.contentRichText) != null) {
                C03B0 c03b02 = new C03B0(c197039127h, "order_submit_recommend_payment_button");
                C03B0.LIZ(c03b02, eCRichText, null, null, false, null, null, 126);
                spannableStringBuilder2 = c03b02.LIZJ;
            } else {
                spannableStringBuilder2 = null;
            }
            SubtextArea subtextArea2 = c03mq.LIZJ;
            c197039127h.setMaxLines(2);
            c197039127h.setLineSpacing(0.0f, 0.7f);
            c197039127h.setEllipsize(null);
            boolean z2 = false;
            c197039127h.setSingleLine(false);
            if (subtextArea2 != null && (l2 = subtextArea2.promotionUsableEndTime) != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
            if (subtextArea2 != null && subtextArea2.promotionUsableEndTime != null && jCurrentTimeMillis < 0) {
                return;
            }
            C812503Fj c812503Fj = C812503Fj.LIZ;
            Context context = c197039127h.getContext();
            if (context == null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    if (iECommerceHostService != null) {
                        z2 = true;
                    }
                    String name2 = IApplicationDependencyService.class.getName();
                    if (iECommerceHostService != null) {
                        name = iECommerceHostService.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                context = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
            }
            if (subtextArea2 != null) {
                str = subtextArea2.content;
            } else {
                str = null;
            }
            if (jCurrentTimeMillis > 0) {
                lValueOf = Long.valueOf(jCurrentTimeMillis);
            } else {
                lValueOf = null;
            }
            PlaceOrderButtonStyle placeOrderButtonStyle = c03mq.LIZLLL;
            if (subtextArea2 != null) {
                icon = subtextArea2.icon;
            }
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c197039127h, 115);
            c812503Fj.getClass();
            c197039127h.setText(C812503Fj.LIZ(context, str2, str, lValueOf, placeOrderButtonStyle, icon, awS545S0100000_1, spannableStringBuilder3, z, spannableStringBuilder2));
            if (subtextArea2 != null && (l = subtextArea2.promotionUsableEndTime) != null) {
                long jLongValue2 = l.longValue();
                C03MX c03mx = new C03MX();
                this.LLILZIL = c03mx;
                c03mx.LIZIZ(jLongValue2, new AwS545S0100000_1(orderSubmitAssemViewModel, 116), new AwS20S1400000_1(c197039127h, str2, subtextArea2, c03mq, spannableStringBuilder3, 1));
            }
        }
    }
}

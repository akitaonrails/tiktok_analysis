package X;

import Y.AObjectS208S0300000_1;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SwitchRichInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0000000_1;
import g1c.AjS7S0400000_1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03JP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03JP extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public ShippingAddressRichInfo LLJIJIL;
    public SwitchRichInfo LLJILJIL;
    public AnonymousClass0376 LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;

    public final void e0() {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        C786410Ut5.I7(new AjS10S0000000_1(2), getTitleContainer());
        getTitle().setTextColorRes(R.attr.a1p);
        getTitleIcon().setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
        ShippingAddressRichInfo shippingAddressRichInfo = this.LLJIJIL;
        if (shippingAddressRichInfo != null) {
            i0(this, false, shippingAddressRichInfo, null, false, null, false, 124);
        }
        l0(this, this.LLJILJIL, null, false, R.attr.zy, false, 16);
    }

    private final LinearLayout getContentContainer() {
        return (LinearLayout) this.LLIZLLLIL.getValue();
    }

    private final ConstraintLayout getDisableContainer() {
        return (ConstraintLayout) this.LLILZIL.getValue();
    }

    private final C03IW getDisableContainerNew() {
        return (C03IW) this.LLIZ.getValue();
    }

    private final TuxTextView getDisableText() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    private final C803403Bw getLlRichContainer() {
        return (C803403Bw) this.LLJ.getValue();
    }

    private final C1841350y17 getSelectRadio() {
        return (C1841350y17) this.LLILZ.getValue();
    }

    private final TuxTextView getSwitch() {
        return (TuxTextView) this.LLJI.getValue();
    }

    private final TuxTextView getTitle() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final ConstraintLayout getTitleContainer() {
        return (ConstraintLayout) this.LL.getValue();
    }

    private final TuxIconView getTitleIcon() {
        return (TuxIconView) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03JP.n0():void");
    }

    public final AnonymousClass0376 getItemVO() {
        return this.LLJILJILJ;
    }

    public final SwitchRichInfo getPudoRichTextInfo() {
        return this.LLJILJIL;
    }

    public final ShippingAddressRichInfo getRichTextInfo() {
        return this.LLJIJIL;
    }

    public final void setItemVO(AnonymousClass0376 anonymousClass0376) {
        this.LLJILJILJ = anonymousClass0376;
    }

    public final void setPudoRichTextInfo(SwitchRichInfo switchRichInfo) {
        this.LLJILJIL = switchRichInfo;
    }

    public final void setRichTextInfo(ShippingAddressRichInfo shippingAddressRichInfo) {
        this.LLJIJIL = shippingAddressRichInfo;
    }

    public final void setSelect(boolean z) {
        this.LLJILLL = z;
    }

    public C03JP(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C03JP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 561));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 562));
        this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 560));
        this.LLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 558));
        this.LLILZIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 554));
        this.LLILZLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 556));
        this.LLIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 555));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 553));
        this.LLJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 557));
        this.LLJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 559));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b2q, this, true);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    public final void h0(AnonymousClass0376 anonymousClass0376, OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str, Boolean bool) {
        String str2;
        Integer num;
        if (anonymousClass0376.LLJILJIL) {
            str2 = "edit_shipping";
        } else {
            str2 = "add_new_shipping";
        }
        C03O0 c03o0 = C03O0.LIZ;
        int iIntValue = 0;
        HashMap<String, Object> mapHi1 = orderSubmitAssemViewModel.hi1(false);
        DeliveryInstructionInfo deliveryInstructionInfo = anonymousClass0376.LLJJLIIIJLLLLLLLZ;
        if (deliveryInstructionInfo != null && (num = deliveryInstructionInfo.instructionType) != null) {
            iIntValue = num.intValue();
        }
        mapHi1.put("delivery_instruction_type", Integer.valueOf(iIntValue));
        C03O0.LJJJLZIJ(c03o0, str2, mapHi1, str, bool, null, null, null, null, null, null, null, null, null, null, null, null, 1048548);
    }

    public final void j0(AnonymousClass0376 anonymousClass0376, OrderSubmitAssemViewModel orderSubmitAssemViewModel, boolean z, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq, Function1<? super Boolean, Unit> function1) {
        boolean z2;
        ShippingAddressRichInfo shippingAddressRichInfo;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        GradientDrawable gradientDrawable;
        int iIntValue;
        boolean zBooleanValue;
        String str;
        Object obj;
        Integer num;
        int iLIZIZ;
        int iLIZIZ2;
        ECRichText eCRichText;
        boolean z3;
        ShippingAddressRichInfo next;
        int iIntValue2 = 0;
        if (!anonymousClass0376.LLJJIJIIJIL && !Intrinsics.LJFF(anonymousClass0376.LLJJIII, Boolean.FALSE)) {
            z2 = false;
        } else {
            z2 = true;
        }
        List<ShippingAddressRichInfo> list = anonymousClass0376.LLJJL;
        String string = null;
        if (list != null) {
            Iterator<ShippingAddressRichInfo> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Integer num2 = next.showType;
                    if (num2 != null && num2.intValue() == 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            shippingAddressRichInfo = next;
        } else {
            shippingAddressRichInfo = null;
        }
        SwitchRichInfo switchRichInfo = anonymousClass0376.LLJL;
        if (shippingAddressRichInfo != null) {
            this.LLJIJIL = shippingAddressRichInfo;
            boolean z4 = !z2;
            if (switchRichInfo != null) {
                eCRichText = switchRichInfo.text;
            } else {
                eCRichText = null;
            }
            if (!anonymousClass0376.LLJJIJIIJIL && switchRichInfo != null && switchRichInfo.text != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            i0(this, z4, shippingAddressRichInfo, (AObjectS208S0300000_1) interfaceC1631620sYq, z, eCRichText, z3, 4);
        }
        this.LLJILJILJ = anonymousClass0376;
        ViewGroup.LayoutParams layoutParams = getContentContainer().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            if (z) {
                iLIZIZ = C0H9H.LIZIZ(16);
            } else {
                iLIZIZ = C0H9H.LIZIZ(40);
            }
            marginLayoutParams.setMarginStart(iLIZIZ);
            marginLayoutParams.setMarginEnd(C0H9H.LIZIZ(16));
            if (z) {
                iLIZIZ2 = C0H9H.LIZIZ(12);
            } else {
                iLIZIZ2 = C0H9H.LIZIZ(8);
            }
            marginLayoutParams.topMargin = iLIZIZ2;
            C786410Ut5.d6(getContentContainer(), marginLayoutParams);
            if (z) {
                getContentContainer().setPaddingRelative(C0H9H.LIZIZ(8), C0H9H.LIZIZ(12), C0H9H.LIZIZ(8), C0H9H.LIZIZ(12));
            } else {
                getContentContainer().setPaddingRelative(0, 0, 0, 0);
            }
        }
        LinearLayout contentContainer = getContentContainer();
        if (!z) {
            gradientDrawable = null;
        } else {
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zr, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            gradientDrawable.setColor(iIntValue);
        }
        contentContainer.setBackground(gradientDrawable);
        getLlRichContainer().setBackground(null);
        n0();
        String str2 = anonymousClass0376.LLLFF;
        if (str2 != null) {
            getTitle().setText(str2);
        }
        Boolean bool = anonymousClass0376.LLLF;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LLJILLL = zBooleanValue;
        getSelectRadio().setChecked(zBooleanValue);
        if (zBooleanValue) {
            n0();
            C12ES.LJIILL(0, getContentContainer());
        } else {
            C03DZ.LIZ(getDisableContainer());
            C03DZ.LIZ(getContentContainer());
        }
        C786410Ut5.I7(new AjS7S0400000_1(this, anonymousClass0376, orderSubmitAssemViewModel, (AwS580S0100000_1) function1, 2), getTitleContainer());
        SwitchRichInfo switchRichInfo2 = anonymousClass0376.LLJL;
        this.LLJILJIL = switchRichInfo2;
        l0(this, switchRichInfo2, (AObjectS208S0300000_1) interfaceC1631620sYq, !anonymousClass0376.LLJJIJIIJIL, 0, z, 8);
        if (anonymousClass0376.LLJILJIL) {
            str = "edit_shipping";
        } else {
            str = "add_new_shipping";
        }
        if (!Intrinsics.LJFF(str, this.LLJJ)) {
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapHi1 = orderSubmitAssemViewModel.hi1(false);
            DeliveryInstructionInfo deliveryInstructionInfo = anonymousClass0376.LLJJLIIIJLLLLLLLZ;
            if (deliveryInstructionInfo != null && (num = deliveryInstructionInfo.instructionType) != null) {
                iIntValue2 = num.intValue();
            }
            mapHi1.put("delivery_instruction_type", Integer.valueOf(iIntValue2));
            Integer num3 = anonymousClass0376.LLJZIJLIL;
            Map<String, Object> map = anonymousClass0376.LLJLLL;
            if (map != null && (obj = map.get("invalid_reason_code")) != null) {
                string = obj.toString();
            }
            C03O0.LJJJZ(c03o0, str, mapHi1, null, null, null, num3, null, string, null, null, null, null, null, 1038332);
            this.LLJJ = str;
        }
    }

    public static void l0(C03JP c03jp, SwitchRichInfo switchRichInfo, AObjectS208S0300000_1 aObjectS208S0300000_1, boolean z, int i, boolean z2, int i2) {
        int i3 = i;
        boolean z3 = z;
        AObjectS208S0300000_1 aObjectS208S0300000_12 = aObjectS208S0300000_1;
        ECRichText eCRichText = null;
        if ((i2 & 2) != 0) {
            aObjectS208S0300000_12 = null;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        int i4 = 0;
        if ((i2 & 8) != 0) {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if (switchRichInfo != null) {
            c03jp.getClass();
            eCRichText = switchRichInfo.text;
        }
        TuxTextView tuxTextView = c03jp.getSwitch();
        if (z2 || eCRichText == null || !z3) {
            i4 = 8;
        }
        C786410Ut5.LJLLLLLL(i4, tuxTextView);
        C03C9.LIZIZ(c03jp.getSwitch(), eCRichText, z3, i3, "USPudoAddressPudoCardView", aObjectS208S0300000_12, false);
    }

    public static void i0(C03JP c03jp, boolean z, ShippingAddressRichInfo shippingAddressRichInfo, AObjectS208S0300000_1 aObjectS208S0300000_1, boolean z2, ECRichText eCRichText, boolean z3, int i) {
        int i2;
        AObjectS208S0300000_1 aObjectS208S0300000_12 = aObjectS208S0300000_1;
        boolean z4 = false;
        if ((i & 4) != 0) {
            i2 = R.attr.a1p;
        } else {
            i2 = 0;
        }
        ECRichText eCRichText2 = null;
        if ((i & 8) != 0) {
            aObjectS208S0300000_12 = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) == 0) {
            eCRichText2 = eCRichText;
        }
        if ((i & 64) != 0) {
            z3 = false;
        }
        C803403Bw llRichContainer = c03jp.getLlRichContainer();
        if (z3 && z2) {
            z4 = true;
        }
        llRichContainer.e0(i2, shippingAddressRichInfo, null, eCRichText2, aObjectS208S0300000_12, z, z4);
    }
}

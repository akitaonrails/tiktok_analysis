package X;

import Y.AObjectS364S0200000_1;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SwitchRichInfo;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BenefitItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.HintInvalidDynamicMessage;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0000000_1;
import g1c.AjS1S0500000_1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03JR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03JR extends ConstraintLayout {
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
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public ShippingAddressRichInfo LLJJ;
    public SwitchRichInfo LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;
    public AnonymousClass0376 LLJJJIL;

    public final void e0() {
        BenefitItem benefitItem;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        C786410Ut5.I7(new AjS10S0000000_1(3), getTitleContainer());
        getTitle().setTextColorRes(R.attr.a1p);
        getTitleIcon().setColorFilter(iIntValue, PorterDuff.Mode.SRC_IN);
        ShippingAddressRichInfo shippingAddressRichInfo = this.LLJJ;
        if (shippingAddressRichInfo != null) {
            AnonymousClass0376 anonymousClass0376 = this.LLJJJIL;
            i0(this, false, shippingAddressRichInfo, null, null, false, anonymousClass0376 != null ? anonymousClass0376.LLJLL : null, 60);
        }
        AnonymousClass0376 anonymousClass03762 = this.LLJJJIL;
        s0((anonymousClass03762 == null || (benefitItem = anonymousClass03762.LLJLILLLLZIIL) == null) ? null : benefitItem.benefitRichText, this.LLJJIJIL);
        AnonymousClass0376 anonymousClass03763 = this.LLJJJIL;
        l0(anonymousClass03763 != null ? anonymousClass03763.LLJLIL : null, this.LLJJIJIL);
        p0(this.LLJJI, null, false, R.attr.zy);
    }

    private final C425910Gmz getBenefitsContainer() {
        return (C425910Gmz) this.LLJILJILJ.getValue();
    }

    private final LinearLayout getContentContainer() {
        return (LinearLayout) this.LLJI.getValue();
    }

    private final ConstraintLayout getDisableContainer() {
        return (ConstraintLayout) this.LLIZ.getValue();
    }

    private final C03IW getDisableContainerNew() {
        return (C03IW) this.LLJ.getValue();
    }

    private final TuxTextView getDisableText() {
        return (TuxTextView) this.LLIZLLLIL.getValue();
    }

    private final C803403Bw getLlRichContainer() {
        return (C803403Bw) this.LLJIJIL.getValue();
    }

    private final C1841350y17 getSelectRadio() {
        return (C1841350y17) this.LLILZIL.getValue();
    }

    private final TuxTextView getSwitch() {
        return (TuxTextView) this.LLJILJIL.getValue();
    }

    private final TuxTextView getTitle() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final View getTitleActionBarrier() {
        return (View) this.LLILZLL.getValue();
    }

    private final TuxIconView getTitleArrow() {
        return (TuxIconView) this.LLJILLL.getValue();
    }

    private final TuxIconView getTitleIcon() {
        return (TuxIconView) this.LLILLJJLI.getValue();
    }

    public final TuxTextView getShippingPriceBenefitView() {
        return (TuxTextView) this.LLILZ.getValue();
    }

    public final ConstraintLayout getTitleContainer() {
        return (ConstraintLayout) this.LL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0() {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03JR.n0():void");
    }

    public final boolean u0() {
        Layout layout = getTitle().getLayout();
        int lineCount = layout != null ? layout.getLineCount() : 0;
        Layout layout2 = getShippingPriceBenefitView().getLayout();
        int lineCount2 = layout2 != null ? layout2.getLineCount() : 0;
        if (lineCount > 1 || lineCount2 > 1) {
            return true;
        }
        int left = getTitleActionBarrier().getLeft() - getTitle().getLeft();
        if (left <= 0) {
            return false;
        }
        Layout layout3 = getTitle().getLayout();
        float measuredWidth = (layout3 == null || layout3.getLineCount() <= 0) ? getTitle().getMeasuredWidth() : layout3.getLineWidth(0);
        Layout layout4 = getShippingPriceBenefitView().getLayout();
        return (measuredWidth + ((layout4 == null || layout4.getLineCount() <= 0) ? (float) getShippingPriceBenefitView().getMeasuredWidth() : layout4.getLineWidth(0))) + ((float) C0H9H.LIZIZ(8)) > ((float) left);
    }

    public final AnonymousClass0376 getItemVO() {
        return this.LLJJJIL;
    }

    public final boolean getNoPudoAddress() {
        return this.LLJJIJI;
    }

    public final SwitchRichInfo getPudoRichTextInfo() {
        return this.LLJJI;
    }

    public final ShippingAddressRichInfo getRichTextInfo() {
        return this.LLJJ;
    }

    public final void setItemVO(AnonymousClass0376 anonymousClass0376) {
        this.LLJJJIL = anonymousClass0376;
    }

    public final void setNoPudoAddress(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setPudoRichTextInfo(SwitchRichInfo switchRichInfo) {
        this.LLJJI = switchRichInfo;
    }

    public final void setRichTextInfo(ShippingAddressRichInfo shippingAddressRichInfo) {
        this.LLJJ = shippingAddressRichInfo;
    }

    public final void setSelect(boolean z) {
        this.LLJJIII = z;
    }

    public final void z0(boolean z) {
        C19MB c19mb;
        C19MB c19mb2 = new C19MB();
        c19mb2.LJII(getTitleContainer());
        c19mb2.LJI(R.id.us_order_submit_pudo_address_pudo_card_title_icon, 3);
        c19mb2.LJI(R.id.us_order_submit_pudo_address_pudo_card_title_icon, 4);
        c19mb2.LJI(R.id.us_order_submit_pudo_address_pudo_card_title, 7);
        c19mb2.LJI(R.id.us_order_submit_pudo_address_pudo_card_title, 4);
        c19mb2.LJI(R.id.us_order_submit_pudo_address_pudo_card_title_benefit, 6);
        c19mb2.LJI(R.id.us_order_submit_pudo_address_pudo_card_title_benefit, 3);
        c19mb2.LJI(R.id.us_order_submit_pudo_address_pudo_card_title_benefit, 4);
        c19mb2.LJIIIZ(R.id.us_order_submit_pudo_address_pudo_card_title_icon, 3, R.id.us_order_submit_pudo_address_pudo_card_title, 3, 0);
        c19mb2.LJIIIZ(R.id.us_order_submit_pudo_address_pudo_card_title_icon, 4, R.id.us_order_submit_pudo_address_pudo_card_title, 4, 0);
        c19mb2.LJIIIZ(R.id.us_order_submit_pudo_address_pudo_card_title_benefit, 7, R.id.us_order_submit_pudo_address_pudo_card_title_action_barrier, 6, 0);
        c19mb2.LJIIIZ(R.id.us_order_submit_pudo_address_pudo_card_title_benefit, 4, 0, 4, 0);
        if (z) {
            c19mb2.LJIIIZ(R.id.us_order_submit_pudo_address_pudo_card_title, 7, R.id.us_order_submit_pudo_address_pudo_card_title_action_barrier, 6, 0);
            c19mb2.LJI(R.id.us_order_submit_pudo_address_pudo_card_title_benefit, 7);
            c19mb2.LJI(R.id.us_order_submit_pudo_address_pudo_card_title_benefit, 4);
            c19mb2.LJIIIZ(R.id.us_order_submit_pudo_address_pudo_card_title_benefit, 6, R.id.us_order_submit_pudo_address_pudo_card_title, 6, C0H9H.LIZIZ(0));
            c19mb = c19mb2;
            c19mb.LJIIIZ(R.id.us_order_submit_pudo_address_pudo_card_title_benefit, 3, R.id.us_order_submit_pudo_address_pudo_card_title, 4, 0);
        } else {
            c19mb2.LJIIIZ(R.id.us_order_submit_pudo_address_pudo_card_title, 7, R.id.us_order_submit_pudo_address_pudo_card_title_benefit, 6, 0);
            c19mb2.LJIIIZ(R.id.us_order_submit_pudo_address_pudo_card_title, 4, 0, 4, 0);
            c19mb = c19mb2;
            c19mb.LJIIIZ(R.id.us_order_submit_pudo_address_pudo_card_title_benefit, 6, R.id.us_order_submit_pudo_address_pudo_card_title, 7, C0H9H.LIZIZ(8));
            c19mb.LJIIIZ(R.id.us_order_submit_pudo_address_pudo_card_title_benefit, 3, 0, 3, 0);
            c19mb.LJJIII(R.id.us_order_submit_pudo_address_pudo_card_title, 2);
            c19mb.LJJII(0.0f, R.id.us_order_submit_pudo_address_pudo_card_title);
        }
        c19mb.LIZIZ(getTitleContainer());
    }

    public C03JR(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void l0(List<BenefitItem> list, boolean z) {
        boolean z2;
        int i;
        Image imageRequireImage;
        C425910Gmz benefitsContainer = getBenefitsContainer();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(benefitsContainer, null);
        benefitsContainer.removeAllViews();
        int i2 = 0;
        if (z && list != null && !list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C425910Gmz benefitsContainer2 = getBenefitsContainer();
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, benefitsContainer2);
        if (!z2) {
            return;
        }
        getBenefitsContainer().setGravity(-1);
        if (list != null) {
            for (BenefitItem benefitItem : list) {
                if (benefitItem.icon != null || benefitItem.benefitRichText != null) {
                    LinearLayout linearLayout = new LinearLayout(getContext());
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(16);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams.setMarginEnd(C0H9H.LIZIZ(16));
                    marginLayoutParams.bottomMargin = C0H9H.LIZIZ(4);
                    C786410Ut5.d6(linearLayout, marginLayoutParams);
                    Icon icon = benefitItem.icon;
                    if (icon != null && (imageRequireImage = icon.requireImage(linearLayout.getContext())) != null) {
                        TuxIconView tuxIconView = new TuxIconView(linearLayout.getContext(), null, 0, 6, null);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C0H9H.LIZIZ(16), C0H9H.LIZIZ(16));
                        layoutParams.setMarginEnd(C0H9H.LIZIZ(4));
                        C786410Ut5.M6(tuxIconView, layoutParams);
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageRequireImage);
                        c1331670kl3LIZLLL.LJJI(tuxIconView);
                        C786410Ut5.h3(c1331670kl3LIZLLL);
                        linearLayout.addView(tuxIconView);
                    }
                    ECRichText eCRichText = benefitItem.benefitRichText;
                    if (eCRichText != null) {
                        TuxTextView tuxTextView = new TuxTextView(linearLayout.getContext(), null, 6, 0);
                        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
                        tuxTextView.setPaddingRelative(0, 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setText(C03C8.LIZ(tuxTextView, eCRichText, "USPudoAddressPudoCardView", null, null, false, 28));
                        linearLayout.addView(tuxTextView);
                    }
                    getBenefitsContainer().addView(linearLayout);
                }
            }
        }
        C425910Gmz benefitsContainer3 = getBenefitsContainer();
        if (getBenefitsContainer().getChildCount() == 0) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, benefitsContainer3);
    }

    public final void s0(ECRichText eCRichText, boolean z) {
        boolean z2;
        int i;
        if (z && eCRichText != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        TuxTextView shippingPriceBenefitView = getShippingPriceBenefitView();
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, shippingPriceBenefitView);
        if (!z2) {
            z0(false);
            return;
        }
        getShippingPriceBenefitView().setText(C03C8.LIZ(getShippingPriceBenefitView(), eCRichText, "USPudoAddressPudoCardView", null, null, false, 28));
        final int i2 = this.LLJJJ + 1;
        this.LLJJJ = i2;
        z0(false);
        ConstraintLayout titleContainer = getTitleContainer();
        if (titleContainer.isLaidOut() && !titleContainer.isLayoutRequested()) {
            if (i2 == this.LLJJJ && getShippingPriceBenefitView().getVisibility() == 0) {
                z0(u0());
                return;
            }
            return;
        }
        titleContainer.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.03JT
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                view.removeOnLayoutChangeListener(this);
                int i11 = i2;
                C03JR c03jr = this;
                if (i11 == c03jr.LLJJJ && c03jr.getShippingPriceBenefitView().getVisibility() == 0) {
                    C03JR c03jr2 = this;
                    c03jr2.z0(c03jr2.u0());
                }
            }
        });
    }

    public C03JR(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 575));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 576));
        this.LLILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 572));
        this.LLILZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 570));
        this.LLILZIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 569));
        this.LLILZLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 573));
        this.LLIZ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 565));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 567));
        this.LLJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 566));
        this.LLJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 564));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 568));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 571));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 563));
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 574));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b2r, this, true);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    public final void h0(AnonymousClass0376 anonymousClass0376, OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str, Boolean bool) {
        String str2;
        Object obj;
        String string;
        Object obj2;
        String string2;
        Object obj3;
        String string3;
        Object obj4;
        String string4;
        Integer num;
        if (!this.LLJJIJI) {
            str2 = "edit_pickup";
        } else {
            str2 = "add_new_pickup";
        }
        C03O0 c03o0 = C03O0.LIZ;
        int iIntValue = 0;
        HashMap<String, Object> mapHi1 = orderSubmitAssemViewModel.hi1(false);
        DeliveryInstructionInfo deliveryInstructionInfo = anonymousClass0376.LLJJLIIIJLLLLLLLZ;
        if (deliveryInstructionInfo != null && (num = deliveryInstructionInfo.instructionType) != null) {
            iIntValue = num.intValue();
        }
        mapHi1.put("delivery_instruction_type", Integer.valueOf(iIntValue));
        Map<String, Object> map = anonymousClass0376.LLJLLL;
        if (map != null && (obj4 = map.get("pudo_entrance_status")) != null && (string4 = obj4.toString()) != null) {
            mapHi1.put("pudo_entrance_status", string4);
        }
        Map<String, Object> map2 = anonymousClass0376.LLJLLL;
        if (map2 != null && (obj3 = map2.get("pudo_guide_text")) != null && (string3 = obj3.toString()) != null) {
            mapHi1.put("pudo_guide_text", string3);
        }
        Map<String, Object> map3 = anonymousClass0376.LLJLLL;
        if (map3 != null && (obj2 = map3.get("benefit_tag_name")) != null && (string2 = obj2.toString()) != null) {
            mapHi1.put("benefit_tag_name", string2);
        }
        Map<String, Object> map4 = anonymousClass0376.LLJLLL;
        if (map4 != null && (obj = map4.get("benefit_section_info")) != null && (string = obj.toString()) != null) {
            mapHi1.put("benefit_section_info", string);
        }
        C03O0.LJJJLZIJ(c03o0, str2, mapHi1, str, bool, null, null, null, null, null, null, null, null, null, null, null, null, 1048548);
    }

    public final void p0(SwitchRichInfo switchRichInfo, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq, boolean z, int i) {
        ECRichText eCRichText;
        int i2 = 0;
        if (this.LLJJIJI) {
            C12ES.LJIILL(0, getTitleArrow());
            C03DZ.LIZ(getSelectRadio());
            return;
        }
        C03DZ.LIZ(getTitleArrow());
        C12ES.LJIILL(0, getSelectRadio());
        if (switchRichInfo != null) {
            eCRichText = switchRichInfo.text;
        } else {
            eCRichText = null;
        }
        TuxTextView tuxTextView = getSwitch();
        if (eCRichText == null || !z || this.LLJJIJIL) {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, tuxTextView);
        if (eCRichText == null) {
            return;
        }
        C03C9.LIZIZ(getSwitch(), eCRichText, z, i, "USPudoAddressPudoCardView", interfaceC1631620sYq, false);
    }

    public final void j0(AnonymousClass0376 anonymousClass0376, OrderSubmitAssemViewModel orderSubmitAssemViewModel, boolean z, InterfaceC1631620sYq<? super View, ? super String, ? super ECRichTextExtraInfo, Unit> interfaceC1631620sYq, Function1<? super Boolean, Unit> function1) {
        boolean z2;
        ShippingAddressRichInfo shippingAddressRichInfo;
        boolean z3;
        ECRichText eCRichText;
        boolean z4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        GradientDrawable gradientDrawable;
        int iIntValue;
        ECRichText eCRichText2;
        boolean z5;
        String str;
        Object obj;
        Object obj2;
        String string;
        Object obj3;
        String string2;
        Object obj4;
        String string3;
        Object obj5;
        String string4;
        Integer num;
        int iLIZIZ;
        int iLIZIZ2;
        ShippingAddressRichInfo next;
        int iIntValue2 = 0;
        if (!anonymousClass0376.LLJJIJIIJIL && !Intrinsics.LJFF(anonymousClass0376.LLJJIII, Boolean.FALSE)) {
            z2 = false;
        } else {
            z2 = true;
        }
        List<ShippingAddressRichInfo> list = anonymousClass0376.LLJJL;
        String string5 = null;
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
        Boolean bool = anonymousClass0376.LLLI;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2) && C1533610q0l.LIZIZ(anonymousClass0376.LLLII)) {
            z3 = true;
        } else {
            z3 = false;
        }
        SwitchRichInfo switchRichInfo = anonymousClass0376.LLJL;
        this.LLJJJIL = anonymousClass0376;
        this.LLJJIJI = z3;
        this.LLJJIJIL = z;
        this.LLJJ = shippingAddressRichInfo;
        if (shippingAddressRichInfo != null || anonymousClass0376.LLJLL != null) {
            boolean z6 = !z2;
            if (switchRichInfo != null) {
                eCRichText = switchRichInfo.text;
            } else {
                eCRichText = null;
            }
            if (!anonymousClass0376.LLJJIJIIJIL && !z3 && switchRichInfo != null && switchRichInfo.text != null && z) {
                z4 = true;
            } else {
                z4 = false;
            }
            i0(this, z6, shippingAddressRichInfo, (AObjectS364S0200000_1) interfaceC1631620sYq, eCRichText, z4, anonymousClass0376.LLJLL, 4);
        }
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
        BenefitItem benefitItem = anonymousClass0376.LLJLILLLLZIIL;
        if (benefitItem != null) {
            eCRichText2 = benefitItem.benefitRichText;
        } else {
            eCRichText2 = null;
        }
        s0(eCRichText2, z);
        C786410Ut5.I7(new AjS1S0500000_1(this, (AObjectS364S0200000_1) interfaceC1631620sYq, anonymousClass0376, orderSubmitAssemViewModel, (AwS367S0200000_1) function1, 0), getTitleContainer());
        boolean zLJFF = Intrinsics.LJFF(anonymousClass0376.LLLF, bool2);
        this.LLJJIII = zLJFF;
        getSelectRadio().setChecked(zLJFF);
        if (this.LLJJIJI) {
            C03DZ.LIZ(getDisableContainer());
            C03DZ.LIZ(getDisableContainerNew());
            AnonymousClass0376 anonymousClass03762 = this.LLJJJIL;
            if (anonymousClass03762 != null && anonymousClass03762.LLJLL != null) {
                C12ES.LJIILL(0, getContentContainer());
            } else {
                C03DZ.LIZ(getContentContainer());
            }
        } else if (zLJFF) {
            n0();
            C12ES.LJIILL(0, getContentContainer());
        } else {
            C03DZ.LIZ(getDisableContainer());
            C03DZ.LIZ(getDisableContainerNew());
            AnonymousClass0376 anonymousClass03763 = this.LLJJJIL;
            if (anonymousClass03763 != null && anonymousClass03763.LLJLL != null) {
                C12ES.LJIILL(0, getContentContainer());
            } else {
                C03DZ.LIZ(getContentContainer());
            }
        }
        l0(anonymousClass0376.LLJLIL, z);
        this.LLJJI = switchRichInfo;
        if (!anonymousClass0376.LLJJIJIIJIL && !z) {
            z5 = true;
        } else {
            z5 = false;
        }
        p0(switchRichInfo, interfaceC1631620sYq, z5, 0);
        if (!this.LLJJIJI) {
            str = "edit_pickup";
        } else {
            str = "add_new_pickup";
        }
        if (!Intrinsics.LJFF(str, this.LLJJIJIIJIL)) {
            C03O0 c03o0 = C03O0.LIZ;
            HashMap<String, Object> mapHi1 = orderSubmitAssemViewModel.hi1(false);
            DeliveryInstructionInfo deliveryInstructionInfo = anonymousClass0376.LLJJLIIIJLLLLLLLZ;
            if (deliveryInstructionInfo != null && (num = deliveryInstructionInfo.instructionType) != null) {
                iIntValue2 = num.intValue();
            }
            mapHi1.put("delivery_instruction_type", Integer.valueOf(iIntValue2));
            Map<String, Object> map = anonymousClass0376.LLJLLL;
            if (map != null && (obj5 = map.get("pudo_entrance_status")) != null && (string4 = obj5.toString()) != null) {
                mapHi1.put("pudo_entrance_status", string4);
            }
            Map<String, Object> map2 = anonymousClass0376.LLJLLL;
            if (map2 != null && (obj4 = map2.get("pudo_guide_text")) != null && (string3 = obj4.toString()) != null) {
                mapHi1.put("pudo_guide_text", string3);
            }
            Map<String, Object> map3 = anonymousClass0376.LLJLLL;
            if (map3 != null && (obj3 = map3.get("benefit_tag_name")) != null && (string2 = obj3.toString()) != null) {
                mapHi1.put("benefit_tag_name", string2);
            }
            Map<String, Object> map4 = anonymousClass0376.LLJLLL;
            if (map4 != null && (obj2 = map4.get("benefit_section_info")) != null && (string = obj2.toString()) != null) {
                mapHi1.put("benefit_section_info", string);
            }
            Integer num3 = anonymousClass0376.LLJZIJLIL;
            Map<String, Object> map5 = anonymousClass0376.LLJLLL;
            if (map5 != null && (obj = map5.get("invalid_reason_code")) != null) {
                string5 = obj.toString();
            }
            C03O0.LJJJZ(c03o0, str, mapHi1, null, null, null, num3, null, string5, null, null, null, null, null, 1038332);
            this.LLJJIJIIJIL = str;
        }
    }

    public static void i0(C03JR c03jr, boolean z, ShippingAddressRichInfo shippingAddressRichInfo, AObjectS364S0200000_1 aObjectS364S0200000_1, ECRichText eCRichText, boolean z2, HintInvalidDynamicMessage hintInvalidDynamicMessage, int i) {
        int i2;
        boolean z3 = z2;
        ECRichText eCRichText2 = eCRichText;
        AObjectS364S0200000_1 aObjectS364S0200000_12 = aObjectS364S0200000_1;
        if ((i & 4) != 0) {
            i2 = R.attr.a1p;
        } else {
            i2 = 0;
        }
        HintInvalidDynamicMessage hintInvalidDynamicMessage2 = null;
        if ((i & 8) != 0) {
            aObjectS364S0200000_12 = null;
        }
        if ((i & 16) != 0) {
            eCRichText2 = null;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        if ((i & 64) == 0) {
            hintInvalidDynamicMessage2 = hintInvalidDynamicMessage;
        }
        C12ES.LJIILL(0, c03jr.getLlRichContainer());
        c03jr.getLlRichContainer().e0(i2, shippingAddressRichInfo, hintInvalidDynamicMessage2, eCRichText2, aObjectS364S0200000_12, z, z3);
    }
}

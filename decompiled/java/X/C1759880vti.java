package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonComponentData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.Padding;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponent;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759880vti extends AbstractC1759870vth<ButtonComponentData> {
    public final C01GW LJI;

    @Override // X.AbstractC1759870vth
    public final View LIZ() {
        return (View) this.LJI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019 A[PHI: r2
      0x0019: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:13:0x0017, B:11:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponent r1 = r4.LIZLLL
            java.lang.String r3 = ""
            if (r1 == 0) goto L16
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction r0 = r1.action
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo r0 = r0.extraInfo
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherInfo r0 = r0.voucherInfo
            if (r0 == 0) goto L16
            java.lang.String r2 = r0.voucherTypeId
            if (r2 != 0) goto L19
        L16:
            r2 = r3
            if (r1 == 0) goto L2a
        L19:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction r0 = r1.action
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpButtonExtraInfo r0 = r0.extraInfo
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VoucherInfo r0 = r0.voucherInfo
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.instanceKey
            if (r0 == 0) goto L2a
            r3 = r0
        L2a:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.CouponCache> r1 = X.C732802ta.LIZ
            java.lang.String r0 = X.C732802ta.LIZJ(r2, r3)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.CouponCache r0 = (com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.CouponCache) r0
            if (r0 == 0) goto L4d
            int r0 = r0.getClaimStatus()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L4d
            int r1 = r0.intValue()
            r0 = 3
            if (r1 != r0) goto L4d
            r0 = 1
            return r0
        L4d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1759880vti.LIZLLL():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a A[PHI: r3
      0x004a: PHI (r3v2 com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonComponentModel) = 
      (r3v1 com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonComponentModel)
      (r3v4 com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonComponentModel)
     binds: [B:25:0x0049, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonComponentData r6, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r7) {
        /*
            r5 = this;
            boolean r0 = r5.LIZLLL()
            r4 = 0
            if (r0 == 0) goto L44
            if (r6 == 0) goto L49
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonComponentModel r3 = r6.nextButton
        Lb:
            if (r3 == 0) goto L4a
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r1 = r3.text
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonStyle r0 = r3.buttonStyle
        L11:
            r5.LIZJ(r1, r0)
            if (r7 == 0) goto L25
            X.04H5 r2 = r7.LLLLL
            if (r2 == 0) goto L25
            kotlin.jvm.internal.AwS461S0200000_26 r1 = new kotlin.jvm.internal.AwS461S0200000_26
            r0 = 1
            r1.<init>(r5, r6, r0)
            java.util.List<kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.String, kotlin.Unit>> r0 = r2.LIZIZ
            r0.add(r1)
        L25:
            kotlin.jvm.functions.Function2<? super android.view.View, ? super java.lang.String, kotlin.Unit> r1 = r5.LJFF
            if (r1 == 0) goto L34
            android.view.View r0 = r5.LIZ()
            if (r3 == 0) goto L31
            java.lang.String r4 = r3.daInfo
        L31:
            r1.invoke(r0, r4)
        L34:
            android.view.View r2 = r5.LIZ()
            if (r2 == 0) goto L43
            g1c.AjS44S0200000_26 r1 = new g1c.AjS44S0200000_26
            r0 = 5
            r1.<init>(r5, r6, r0)
            X.C786410Ut5.I7(r1, r2)
        L43:
            return
        L44:
            if (r6 == 0) goto L49
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonComponentModel r3 = r6.button
            goto Lb
        L49:
            r3 = r4
        L4a:
            r1 = r4
            r0 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1759880vti.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.button.ButtonComponentData, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel):void");
    }

    public final void LIZJ(ECRichText eCRichText, ButtonStyle buttonStyle) {
        ViewGroup viewGroup;
        int iIntValue;
        Image icon;
        int iLIZIZ;
        ViewGroup viewGroup2;
        if (buttonStyle != null) {
            Integer num = buttonStyle.buttonType;
            int value = EnumC114500c3.FILLED_BUTTON.getValue();
            if (num != null && num.intValue() == value) {
                C977203ru c977203ru = new C977203ru(this.LIZ, null, 6);
                c977203ru.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)));
                Integer num2 = buttonStyle.width;
                int iLIZIZ2 = -2;
                if (num2 != null) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num2));
                } else {
                    iLIZIZ = -2;
                }
                Integer num3 = buttonStyle.height;
                if (num3 != null) {
                    iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num3));
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c977203ru);
                c977203ru.setLayoutParams(layoutParams);
                c977203ru.setIncludeFontPadding(false);
                c977203ru.setGravity(17);
                c977203ru.setTextAlignment(4);
                c977203ru.LJJJJL(new AwS235S0300000_26(c977203ru, this, buttonStyle, 0));
                if (eCRichText != null) {
                    C1759810vtb c1759810vtb = C1759810vtb.LIZ;
                    Integer num4 = this.LIZJ;
                    c1759810vtb.getClass();
                    C03B0 c03b0 = new C03B0(c977203ru, C1759810vtb.LIZ(num4));
                    C03B0.LIZ(c03b0, eCRichText, null, null, false, null, null, 126);
                    c977203ru.setText(c03b0.LIZJ);
                }
                Padding padding = buttonStyle.padding;
                if (padding != null) {
                    c977203ru.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(padding.left))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(padding.top))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(padding.right))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(padding.bottom))));
                }
                View viewLIZ = LIZ();
                if ((viewLIZ instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewLIZ) != null) {
                    C786410Ut5.LJJJJI(viewGroup2);
                    viewGroup2.addView(c977203ru);
                    return;
                }
                return;
            }
            int value2 = EnumC114500c3.ICON_BUTTON.getValue();
            if (num != null && num.intValue() == value2) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.as9, null, false);
                if (eCRichText != null) {
                    TextView textView = (TextView) viewTd.findViewById(R.id.d86);
                    C1759810vtb c1759810vtb2 = C1759810vtb.LIZ;
                    Integer num5 = this.LIZJ;
                    c1759810vtb2.getClass();
                    C03B0 c03b02 = new C03B0(textView, C1759810vtb.LIZ(num5));
                    C03B0.LIZ(c03b02, eCRichText, null, null, false, null, null, 126);
                    textView.setText(c03b02.LIZJ);
                }
                Icon icon2 = buttonStyle.icon;
                if (icon2 != null) {
                    SmartImageView smartImageView = (SmartImageView) viewTd.findViewById(R.id.vym);
                    Integer viewWidth = icon2.getViewWidth();
                    int iIntValue2 = 16;
                    if (viewWidth != null) {
                        iIntValue = viewWidth.intValue();
                    } else {
                        iIntValue = 16;
                    }
                    int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                    Integer viewHeight = icon2.getViewHeight();
                    if (viewHeight != null) {
                        iIntValue2 = viewHeight.intValue();
                    }
                    int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
                    smartImageView.getLayoutParams().width = iLIZIZ3;
                    smartImageView.getLayoutParams().height = iLIZIZ4;
                    if (C1744700vVE.LJ(this.LIZ, null)) {
                        icon = icon2.getIconDark();
                    } else {
                        icon = icon2.getIcon();
                    }
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon);
                    c1331670kl3LIZLLL.LJJ(smartImageView);
                    c1331670kl3LIZLLL.LJIIJJI();
                }
                View viewLIZ2 = LIZ();
                if (!(viewLIZ2 instanceof ViewGroup) || (viewGroup = (ViewGroup) viewLIZ2) == null) {
                    return;
                }
                C786410Ut5.LJJJJI(viewGroup);
                viewGroup.addView(viewTd);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ButtonComponent: bind style error: ");
            sbLIZ.append(this.LIZLLL);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        View viewLIZ3 = LIZ();
        if (viewLIZ3 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, viewLIZ3);
    }

    public C1759880vti(Context context, Map<String, ? extends Object> map, Integer num, PdpComponent pdpComponent) {
        super(context, map, num, pdpComponent);
        this.LJI = C452501pT.LIZIZ(new AwS570S0100000_26(context, 12));
    }
}

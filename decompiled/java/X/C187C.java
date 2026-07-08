package X;

import Y.ACListenerS166S0100000_32;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.business.popcard.common.model.VoucherButtonsColor;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BottomLabel;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Icon;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Status;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SurpriseVoucherExt;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.VoucherAction;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.ui.style.CommonColor;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.ui.style.TextStyle;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.187C, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C187C extends AnonymousClass1830 implements C187G {
    public SmartImageView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C197039127h LLJ;
    public TuxIconView LLJI;
    public TuxTextView LLJIJIL;
    public long LLJILJIL;
    public final C187F LLJILJILJ;
    public final C01GW LLJILLL;
    public C182N LLJJ;
    public final C212254184m LLJJI;

    private final Map<Integer, VoucherButtonsColor> getButtonStyleMap() {
        return (Map) this.LLJILLL.getValue();
    }

    @Override // X.C187G
    public final void LLLLIILL() {
        this.LLJILJILJ.LIZ();
        View.OnClickListener closeClickListener = getCloseClickListener();
        if (closeClickListener != null) {
            closeClickListener.onClick(getLabel());
        }
    }

    public final C197039127h getButton() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hvk);
            this.LLJ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final TuxIconView getCloseIcon() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hvm);
            this.LLJI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final SmartImageView getImage() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hvh);
            this.LLILZIL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final TuxTextView getInfo() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hvn);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getLabel() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hvj);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTerm() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hvo);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getTitle() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hvp);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.AnonymousClass1830
    public final void onDestroy() {
        this.LLJILJILJ.LIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJI.LIZIZ();
        this.LLJILJILJ.LIZ();
    }

    private final void setButton(LiveVoucher liveVoucher) {
        boolean z;
        Map<Integer, VoucherButtonsColor> buttonStyleMap;
        int i;
        Integer color;
        Integer color2;
        Integer num;
        VoucherAction voucherAction;
        VoucherAction voucherAction2;
        Integer num2;
        Integer num3;
        Integer num4;
        VoucherAction voucherAction3 = liveVoucher.action;
        if (voucherAction3 != null && (num4 = voucherAction3.type) != null && num4.intValue() == 8) {
            z = true;
        } else {
            z = false;
        }
        if (z || (((voucherAction = liveVoucher.action) != null && (num3 = voucherAction.type) != null && num3.intValue() == 7) || ((voucherAction2 = liveVoucher.action) != null && (num2 = voucherAction2.type) != null && num2.intValue() == 4))) {
            try {
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_live_preview_voucher_card_style_type", true) > 0) {
                    VoucherAction voucherAction4 = liveVoucher.action;
                    if (voucherAction4 != null && (num = voucherAction4.type) != null && num.intValue() == 7) {
                        buttonStyleMap = getButtonStyleMap();
                        i = 1;
                    } else {
                        buttonStyleMap = getButtonStyleMap();
                        i = 0;
                    }
                    VoucherButtonsColor voucherButtonsColor = buttonStyleMap.get(i);
                    C197039127h button = getButton();
                    if (button != null) {
                        C786410Ut5.LLLLLLJ(button, 0);
                        button.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                        String str = null;
                        if (voucherAction4 != null) {
                            str = voucherAction4.text;
                        }
                        button.setText(str);
                        InterfaceC1003930cER.LJIILIIL.getClass();
                        button.setTuxFont(C1003920cEQ.LIZ(10));
                        button.setMinTextSize(12.0f);
                        if (voucherButtonsColor != null) {
                            CommonColor commonColor = voucherButtonsColor.textColor;
                            if (commonColor != null && (color2 = commonColor.parseColor(button.getContext(), true)) != null) {
                                button.setTextColor(color2.intValue());
                            }
                            CommonColor commonColor2 = voucherButtonsColor.backgroundColor;
                            if (commonColor2 != null && (color = commonColor2.parseColor(getContext(), true)) != null) {
                                int iIntValue = color.intValue();
                                C384050F3z c384050F3z = new C384050F3z();
                                c384050F3z.LIZ = Integer.valueOf(iIntValue);
                                c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(8));
                                c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(8));
                                c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                                c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(8));
                                button.setBackground(c384050F3z.LIZ(getContext()));
                            }
                        }
                        C786410Ut5.U8(button, new ACListenerS166S0100000_32(this, 72));
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C197039127h button2 = getButton();
        if (button2 != null) {
            C786410Ut5.LLLLLLJ(button2, 4);
        }
    }

    private final void setImage(LiveVoucher liveVoucher) {
        String str;
        SmartImageView image = getImage();
        if (image != null) {
            Icon icon = liveVoucher.bigIcon;
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            if (icon != null) {
                str = icon.lightUrl;
            } else {
                str = null;
            }
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LIZLLL.LJJIIZ(R.drawable.bmx);
            c1331670kl3LIZLLL.LJJ(image);
            c1331670kl3LIZLLL.LJIIJ(null);
            if (C426750GoL.LJFF() && icon != null && icon.rtl) {
                C786410Ut5.fc(image, -1.0f);
            } else {
                C786410Ut5.fc(image, 1.0f);
            }
        }
    }

    private final void setInfo(LiveVoucher liveVoucher) {
        String str;
        Status status;
        Integer num;
        boolean z = false;
        if (liveVoucher.LIZJ() && ((!C123100dR.LIZ(liveVoucher.voucherTypeId) || ((status = liveVoucher.status) != null && (num = status.status) != null && num.intValue() == 3)) && liveVoucher.surpriseVoucherExt != null)) {
            z = true;
        }
        TextStyle textStyle = new TextStyle(new CommonColor(null, "#A6000000", "#A6000000"), 9);
        SurpriseVoucherExt surpriseVoucherExt = liveVoucher.surpriseVoucherExt;
        if (surpriseVoucherExt != null) {
            str = surpriseVoucherExt.desc;
        } else {
            str = null;
        }
        String str2 = liveVoucher.threshold;
        TuxTextView info = getInfo();
        if (info != null) {
            if (!z) {
                str = str2;
            }
            info.setText(str);
            C187E.LIZ(textStyle, info);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.187D, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setLabel(com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher r12) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187C.setLabel(com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveVoucher):void");
    }

    private final void setTitle(LiveVoucher liveVoucher) {
        boolean z;
        SurpriseVoucherExt surpriseVoucherExt;
        TuxTextView term;
        String str;
        if (liveVoucher.LIZJ() && !C123100dR.LIZ(liveVoucher.voucherTypeId) && liveVoucher.surpriseVoucherExt != null) {
            z = true;
        } else {
            z = false;
        }
        String strLJJIFFI = "";
        if (z) {
            SurpriseVoucherExt surpriseVoucherExt2 = liveVoucher.surpriseVoucherExt;
            if (surpriseVoucherExt2 != null && (str = surpriseVoucherExt2.title) != null) {
                strLJJIFFI = str;
            }
        } else {
            String str2 = liveVoucher.formatTitle;
            if (str2 != null) {
                String str3 = liveVoucher.faceValue;
                if (str3 != null) {
                    strLJJIFFI = str3;
                }
                strLJJIFFI = u.LJJIFFI(str2, "{{face_value}}", strLJJIFFI, false);
            }
        }
        TuxTextView title = getTitle();
        if (title != null) {
            title.setText(strLJJIFFI);
        }
        if (z && (surpriseVoucherExt = liveVoucher.surpriseVoucherExt) != null && surpriseVoucherExt.termSchema != null && (term = getTerm()) != null) {
            C786410Ut5.LLLLZLL(term, 0);
        }
    }

    @Override // X.C187G
    public final void LLLLLILLIL(long j) {
        String str;
        String strLJJIFFI;
        LiveVoucher liveVoucher;
        BottomLabel bottomLabel;
        TuxTextView label = getLabel();
        if (label != null) {
            C182N c182n = this.LLJJ;
            if (c182n != null && (liveVoucher = c182n.LIZJ) != null && (bottomLabel = liveVoucher.bottomLabel) != null) {
                str = bottomLabel.cdtFormatText;
            } else {
                str = null;
            }
            String strK4 = C786410Ut5.k4(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{0, 0, 0}, 3));
            if (j > 0) {
                long j2 = (j + ((long) 999)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                long j3 = 3600;
                long j4 = j2 / j3;
                long j5 = j2 % j3;
                long j6 = 60;
                strK4 = C786410Ut5.k4(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5 / j6), Long.valueOf(j2 % j6)}, 3));
            }
            if (str != null && (strLJJIFFI = u.LJJIFFI(str, "{{countdown}}", strK4, false)) != null) {
                strK4 = strLJJIFFI;
            }
            label.setText(strK4);
        }
    }

    @Override // X.AnonymousClass1830
    public final String e0(View view) {
        if (Intrinsics.LJFF(view, getButton())) {
            return "c10917.d96580";
        }
        return "c10917.d0";
    }

    @Override // X.AnonymousClass1830
    public final Map<String, String> h0(View view) {
        String str;
        String str2;
        LiveVoucher liveVoucher;
        Map<String, String> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("card_type", "2");
        linkedHashMap.put("card_name", "pin_voucher");
        linkedHashMap.put("coupon_zone", "preview_card");
        if (i0(view) == 23) {
            str = "c10917.d96580";
            str2 = "button";
        } else {
            str = "c10917.d0";
            str2 = "body";
        }
        Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str, PageFinder.via((View) this), null, 4, null);
        if (!mapCreateReportParams$default.isEmpty()) {
            for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        linkedHashMap.put("click_area", str2);
        C182N c182n = this.LLJJ;
        if (c182n != null && (liveVoucher = c182n.LIZJ) != null && (map = liveVoucher.daInfo) != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    @Override // X.AnonymousClass1830
    public final int i0(View view) {
        if (Intrinsics.LJFF(view, getButton())) {
            return 23;
        }
        return 24;
    }

    public final void setCloseIcon(TuxIconView tuxIconView) {
        this.LLJI = tuxIconView;
    }

    public final void setTerm(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public final void setButton(C197039127h c197039127h) {
        this.LLJ = c197039127h;
    }

    public final void setImage(SmartImageView smartImageView) {
        this.LLILZIL = smartImageView;
    }

    public final void setInfo(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setLabel(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setTitle(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    @Override // X.AnonymousClass1830
    public final void j0(C182N c182n, long j) {
        this.LLJJ = c182n;
        this.LLJILJIL = j;
        LiveVoucher liveVoucher = c182n.LIZJ;
        if (liveVoucher == null) {
            return;
        }
        setImage(liveVoucher);
        setTitle(liveVoucher);
        setInfo(liveVoucher);
        setButton(liveVoucher);
        setLabel(liveVoucher);
    }

    public C187C(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJILJILJ = new C187F(this);
        this.LLJILLL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(153));
        this.LLJJI = new C212254184m();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.z5);
        C786410Ut5.Sd(R.layout.bwe, C786410Ut5.ne(contextThemeWrapper), this);
        setBackground(C800330VaR.LIZIZ(contextThemeWrapper, R.drawable.bmh));
        TuxIconView closeIcon = getCloseIcon();
        if (closeIcon != null) {
            C786410Ut5.a9(closeIcon, new ACListenerS166S0100000_32(this, 71));
        }
        C2271391DvN.LIZ(getButton(), C2271381DvM.b0);
    }
}

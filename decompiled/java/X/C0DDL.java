package X;

import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.core.settings.UcpShopThemeConfigModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0DDL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DDL extends ConstraintLayout {
    public final C0DDV LL;
    public Function0<Unit> LLILLJJLI;
    public Function0<Unit> LLILLL;

    public final Function0<Unit> getOnDisclaimerInfoClick() {
        return this.LLILLL;
    }

    public final Function0<Unit> getOnPlaceOrderClick() {
        return this.LLILLJJLI;
    }

    public final void e0(C335070DBp c335070DBp) {
        SpannableStringBuilder spannableStringBuilder;
        int iIntValue;
        TuxTextView tuxTextView = this.LL.LLILLL;
        String str = c335070DBp.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0D9L.LIZ(2131857507));
        sbLIZ.append(' ');
        sbLIZ.append(str);
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LLLLZLL(this.LL.LLILLL, 0);
        TuxTextView tuxTextView2 = this.LL.LLILLJJLI;
        String strLJJIFFI = u.LJJIFFI(C0D9L.LIZ(2131857506), "{domain}", "", false);
        if (!u.LJIIZILJ(strLJJIFFI, " ", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLJJIFFI);
            sbLIZ2.append(' ');
            strLJJIFFI = C2188811AlT.LIZIZ(sbLIZ2);
        }
        String str2 = c335070DBp.LIZ;
        if (strLJJIFFI != null && strLJJIFFI.length() != 0) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, getContext());
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1o, getContext());
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) strLJJIFFI);
            if (numLIZJ != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), 0, strLJJIFFI.length(), 33);
            }
            if (str2 != null && str2.length() != 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str2);
                if (numLIZJ2 != null) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ2.intValue()), length, spannableStringBuilder.length(), 33);
                }
            }
        } else {
            spannableStringBuilder = null;
        }
        tuxTextView2.setText(spannableStringBuilder);
        this.LL.LLILZLL.setText(c335070DBp.LIZIZ);
        this.LL.LLILZIL.setText(c335070DBp.LIZJ);
        AbstractC334720DAg abstractC334720DAg = c335070DBp.LIZLLL;
        if (abstractC334720DAg instanceof C0DA5) {
            this.LL.LLILZ.setEnabled(true);
            this.LL.LLILZ.setText(((C0DA5) abstractC334720DAg).LIZ);
        } else if (abstractC334720DAg instanceof C0DA6) {
            this.LL.LLILZ.setEnabled(false);
            this.LL.LLILZ.setText(((C0DA6) abstractC334720DAg).LIZ);
        } else if (abstractC334720DAg instanceof C334730DAh) {
            this.LL.LLILZ.setEnabled(false);
            this.LL.LLILZ.setText(((C334730DAh) abstractC334720DAg).LIZ);
        } else {
            throw new C1954807lC();
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        UcpShopThemeConfigModel ucpShopThemeConfigModel = C0D33.LIZ;
        UcpShopThemeConfigModel ucpShopThemeConfigModel2 = (UcpShopThemeConfigModel) c0c64LJIILLIIL.LJJII(UcpShopThemeConfigModel.class, ucpShopThemeConfigModel, "ucp_shop_theme_config", true);
        if (ucpShopThemeConfigModel2 != null) {
            ucpShopThemeConfigModel = ucpShopThemeConfigModel2;
        }
        int iLIZ = C0DHA.LIZ(getContext(), ucpShopThemeConfigModel.buttonColor);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a0p, getContext());
        if (numLIZJ3 != null) {
            iIntValue = numLIZJ3.intValue();
        } else {
            iIntValue = -1;
        }
        C0DG3.LIZIZ(this.LL.LLILZ, iLIZ, iIntValue);
    }

    public final void setOnDisclaimerInfoClick(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public final void setOnPlaceOrderClick(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    public C0DDL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0DDL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i5r, this, false);
        addView(viewTd);
        int i2 = R.id.l5m;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.l5m, viewTd);
        if (tuxIconView != null) {
            i2 = R.id.m6t;
            if (C1616006Uk.LIZ(R.id.m6t, viewTd) != null) {
                i2 = R.id.z2m;
                TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.z2m, viewTd);
                if (tuxTextView != null) {
                    i2 = R.id.ucp_checkout_pay_title;
                    TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_pay_title, viewTd);
                    if (tuxTextView2 != null) {
                        i2 = R.id.ucp_checkout_place_order;
                        C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.ucp_checkout_place_order, viewTd);
                        if (c197039127h != null) {
                            i2 = R.id.ucp_checkout_total_amount;
                            TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_total_amount, viewTd);
                            if (tuxTextView3 != null) {
                                i2 = R.id.ucp_checkout_total_label;
                                TuxTextView tuxTextView4 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_total_label, viewTd);
                                if (tuxTextView4 != null) {
                                    this.LL = new C0DDV((LinearLayout) viewTd, tuxIconView, tuxTextView, tuxTextView2, c197039127h, tuxTextView3, tuxTextView4);
                                    TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.zp});
                                    try {
                                        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
                                        typedArrayObtainStyledAttributes.recycle();
                                        setBackgroundColor(color);
                                        C786410Ut5.U8(c197039127h, new ACListenerS139S0100000_4(this, 16));
                                        C786410Ut5.a9(tuxIconView, new ACListenerS139S0100000_4(this, 17));
                                        return;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        typedArrayObtainStyledAttributes.recycle();
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i2)));
    }
}

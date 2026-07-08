package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.osp.repo.model.Guidelines;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SectionInfoItem;
import com.zhiliaoapp.musically.R;
import defpackage.LsResourceTokenMapSettings;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS255S0000000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: renamed from: X.0h9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193190h9h extends ConstraintLayout {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final C166U LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1193190h9h.class, "binding", "getBinding()Lcom/ss/android/ugc/tiktok/poi/databinding/PoiOrderSubmitSkuViewBinding;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final C1193210h9j getBinding() {
        C166U c166u = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return (C1193210h9j) c166u.LIZ(this);
    }

    public final void e0() {
        C337180DJs.LIZ(getBinding().LLJILJILJ);
    }

    public final EditText getInputView() {
        return getBinding().LLJILLL.getInputView();
    }

    public final C1195550hDV getSkuCounterView() {
        return getBinding().LLJILLL;
    }

    public final boolean h0() {
        return getBinding().LLJILJILJ.getVisibility() == 0;
    }

    public final void setClickProductQuantityListener(Function0<Unit> function0) {
        getBinding().LLJILLL.setClickProductQuantityListener(function0);
    }

    public final void setExclusiveDealText(String str) {
        if (str != null && str.length() != 0) {
            getBinding().LLIZ.setText(str);
            C337180DJs.LIZJ(getBinding().LLIZ);
            getBinding().LLJJI.setMaxLines(1);
        } else {
            C337180DJs.LIZ(getBinding().LLIZ);
            getBinding().LLJJI.setMaxLines(2);
        }
    }

    public final void setQuantityChangeListener(Function2<? super Integer, ? super String, Unit> function2) {
        getBinding().LLJILLL.setQuantityChangeListener(function2);
    }

    public final void setQuantityHint(String str) {
        if (C123100dR.LIZ(str)) {
            getBinding().LLJILJIL.setText(str);
            C337180DJs.LIZJ(getBinding().LLJILJIL);
        } else {
            C337180DJs.LIZ(getBinding().LLJILJIL);
        }
    }

    public final void setQuantityHitLimitListener(Function1<? super C1193540hAG, Unit> function1) {
        getBinding().LLJILLL.setQuantityHitLimitListener(function1);
    }

    public final void setSkuId(String str) {
        getBinding().LLJILLL.setSkuId(str);
    }

    public final void setSkuImage(UrlModel urlModel) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c7, getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJIJJ = new ColorDrawable(iIntValue);
            C1189400h3a.LIZ(c1331670kl3LJIIIIZZ, "poi_order_submit", "poi_order_submit_sku_image");
            c1331670kl3LJIIIIZZ.LJJ(getBinding().LLJJ);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
    }

    public final void setSkuSubtitle(String str) {
        getBinding().LLJJI.setText(str);
    }

    public final void setSkuTitle(String str) {
        getBinding().LLJJIII.setText(str);
    }

    public final void setUIForSheet(boolean z) {
        int i;
        int i2;
        TuxTextView tuxTextView = getBinding().LLJJIII;
        if (z) {
            i = 32;
        } else {
            i = 16;
        }
        C426750GoL.LJIIL(tuxTextView, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), 0, 16);
        TuxTextView tuxTextView2 = getBinding().LLJJIII;
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        tuxTextView2.setMaxLines(i2);
    }

    public final void u0(String str) {
        if (C123100dR.LIZ(str)) {
            C337180DJs.LIZJ(getBinding().LLJILJILJ);
            getBinding().LLJILJILJ.setText(str);
        }
    }

    public final void i0(String str, String str2) {
        C041W c041w = new C041W();
        c041w.LIZJ(0, str, str2, "");
        c041w.LJ = 72;
        c041w.LJFF = 32;
        c041w.LJII = R.attr.a1h;
        c041w.LJIIIIZZ = false;
        getBinding().LLILLJJLI.setText(c041w.LIZIZ(getContext()));
    }

    public final void j0(String str, String str2) {
        if (C123100dR.LIZ(str2)) {
            C337180DJs.LIZJ(getBinding().LLILLL);
            TuxTextView tuxTextView = getBinding().LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('-');
            sbLIZ.append(str2);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            C337180DJs.LIZ(getBinding().LLILZIL);
            return;
        }
        if (C123100dR.LIZ(str)) {
            getBinding().LLILZIL.setText(str);
            C337180DJs.LIZJ(getBinding().LLILZIL);
            C337180DJs.LIZ(getBinding().LLILLL);
        } else {
            C337180DJs.LIZ(getBinding().LLILLL);
            C337180DJs.LIZ(getBinding().LLILZIL);
        }
    }

    public final void l0(Guidelines guidelines, C1192940h9I c1192940h9I) {
        int iIntValue;
        Integer numValueOf;
        Integer numValueOf2;
        if (guidelines != null) {
            List<SectionInfoItem> list = guidelines.infoItems;
            int i = 0;
            if (list != null && !list.isEmpty()) {
                C337180DJs.LIZJ(getBinding().LLJ);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                View viewSd = C786410Ut5.Sd(R.layout.e5e, C786410Ut5.ne(getContext()), null);
                for (SectionInfoItem sectionInfoItem : guidelines.infoItems) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        SectionInfoItem sectionInfoItem2 = sectionInfoItem;
                        if (i > 0) {
                            spannableStringBuilder.append((CharSequence) " ");
                            C786410Ut5.q2(spannableStringBuilder, new C430750Gun(viewSd), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        }
                        LsResourceTokenMapSettings.ResourceTokenModel resourceTokenModel = LsResourceTokenMapSettings.LIZ;
                        String str = sectionInfoItem2.iconUrl;
                        if (str == null) {
                            str = "";
                        }
                        C698190Ra5 c698190Ra5LIZ = LsResourceTokenMapSettings.LIZ(getContext(), str);
                        if (c698190Ra5LIZ != null) {
                            spannableStringBuilder.append((CharSequence) " ");
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = c698190Ra5LIZ.LIZ;
                            Integer num = sectionInfoItem2.colorType;
                            if (num != null && num.intValue() == 2) {
                                numValueOf2 = Integer.valueOf(R.attr.a1s);
                            } else {
                                numValueOf2 = Integer.valueOf(R.attr.a1j);
                            }
                            c419910GdJ.LJ = numValueOf2;
                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                            C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, getContext()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        spannableStringBuilder.append((CharSequence) sectionInfoItem2.value);
                        Integer num2 = sectionInfoItem2.colorType;
                        if (num2 != null && num2.intValue() == 2) {
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1s, getContext());
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = -1;
                            }
                            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iIntValue);
                            int length = spannableStringBuilder.length();
                            String str2 = sectionInfoItem2.value;
                            if (str2 != null) {
                                numValueOf = Integer.valueOf(str2.length());
                            } else {
                                numValueOf = null;
                            }
                            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, length - C1175120ggY.LIZJ(numValueOf), spannableStringBuilder.length(), 33);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                getBinding().LLJI.setText(spannableStringBuilder);
                C786410Ut5.I7(new AbS699S0100000_18(c1192940h9I, 40, 42), getBinding().LLJ);
                return;
            }
        }
        C337180DJs.LIZ(getBinding().LLJ);
    }

    public final void n0(String str, String str2) {
        C041W c041w = new C041W();
        c041w.LIZJ(0, str, str2, "");
        c041w.LJ = 71;
        c041w.LJFF = 71;
        c041w.LJII = R.attr.a1p;
        c041w.LJIIIIZZ = true;
        getBinding().LLJIJIL.setText(c041w.LIZIZ(getContext()));
    }

    public final void p0(int i, boolean z) {
        C1195550hDV c1195550hDV = getBinding().LLJILLL;
        c1195550hDV.LLILLJJLI = i;
        c1195550hDV.LIZ(z);
    }

    public C1193190h9h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new C166U(new AwS255S0000000_18(8));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e5q, this, true);
    }

    public final void s0(int i, int i2, int i3) {
        C1195550hDV c1195550hDV = getBinding().LLJILLL;
        c1195550hDV.getClass();
        if (i3 <= 0) {
            i3 = 1;
        }
        c1195550hDV.LLIZ = i3;
        c1195550hDV.LLILZLL = (i / i3) * i3;
        if (i2 < i3) {
            i2 = i3;
        }
        c1195550hDV.LLILZIL = i2;
    }
}

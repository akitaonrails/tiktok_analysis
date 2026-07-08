package X;

import Y.ACListenerS136S0100000_1;
import Y.ARunnableS101S0100000_1;
import Y.ARunnableS70S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.CCDCAddCardLongTextAdjust;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentAddCardConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Configuration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C958503ot extends FrameLayout {
    public final C1237400iJ0 LL;
    public final C1748440vbG LLILLJJLI;
    public final C1748300vb2 LLILLL;
    public final C1748330vb5 LLILZ;
    public TextView LLILZIL;
    public TuxIconView LLILZLL;
    public Function1<? super List<PaymentElement>, String> LLIZ;
    public Function0<Unit> LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public Integer LLJILJIL;

    private final int getIconSize() {
        Integer num = this.LLJILJIL;
        return (num == null || num.intValue() != 3) ? 20 : 14;
    }

    public final EditText getEditText() {
        return this.LLILLJJLI.LLJLILLLLZIIL;
    }

    public final int getHeaderHeight() {
        return this.LLILLL.getHeight();
    }

    public final TextView getHeaderTitleTextView() {
        TextView textView = this.LLILZIL;
        if (textView == null) {
            textView = (TextView) this.LLILLL.findViewById(R.id.hws);
            if (textView == null) {
                return null;
            }
            this.LLILZIL = textView;
        }
        return textView;
    }

    public final boolean getDelayKeyBoardClearFocus() {
        return this.LLJI;
    }

    public final boolean getInlineNotification() {
        return this.LLJIJIL;
    }

    public final Integer getInputBoxSizeVariant() {
        return this.LLJILJIL;
    }

    public final boolean getNoTitle() {
        return this.LLJ;
    }

    public final Function0<Unit> getOnErrorClear() {
        return this.LLIZLLLIL;
    }

    public final Function1<List<PaymentElement>, String> getOnVerify() {
        return this.LLIZ;
    }

    public List<PaymentElement> getValue() {
        return C13BV.INSTANCE;
    }

    public static void LIZIZ(TextView textView) {
        int width = textView.getWidth();
        if (width <= 0) {
            return;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = textView.getMeasuredHeight();
        int height = textView.getHeight();
        if (measuredHeight > 0) {
            if (height <= 0 || height < measuredHeight) {
                HandlerHook.viewPost(textView, new ARunnableS101S0100000_1((Object) textView, 66));
            }
        }
    }

    public static void LIZJ(TextView textView) {
        if (textView.getTag(R.id.dkn) != null) {
            return;
        }
        ViewOnLayoutChangeListenerC958603ou viewOnLayoutChangeListenerC958603ou = new View.OnLayoutChangeListener() { // from class: X.03ou
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                TextView textView2;
                if ((view instanceof TextView) && (textView2 = (TextView) view) != null) {
                    C1071804Hc.LIZIZ(textView2);
                    if (textView2.getMaxLines() != 2) {
                        textView2.setMaxLines(2);
                    }
                    TextUtils.TruncateAt ellipsize = textView2.getEllipsize();
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    if (ellipsize != truncateAt) {
                        textView2.setEllipsize(truncateAt);
                    }
                }
            }
        };
        textView.addOnLayoutChangeListener(viewOnLayoutChangeListenerC958603ou);
        textView.setTag(R.id.dkn, viewOnLayoutChangeListenerC958603ou);
    }

    public final void LIZ(Function0<Unit> function0) {
        this.LLILLL.setInfoIcon(null);
        this.LLILLJJLI.LJFF(null);
        TextView headerTitleTextView = getHeaderTitleTextView();
        if (headerTitleTextView == null) {
            return;
        }
        if (function0 == null) {
            TuxIconView tuxIconView = this.LLILZLL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                C21370518kB.LIZIZ(tuxIconView, headerTitleTextView);
                C786410Ut5.Jc(tuxIconView, 0.0f);
                C786410Ut5.ed(tuxIconView, 0.0f);
            }
            headerTitleTextView.setPaddingRelative(headerTitleTextView.getPaddingStart(), headerTitleTextView.getPaddingTop(), 0, headerTitleTextView.getPaddingBottom());
            return;
        }
        int iLIZIZ = C0H9H.LIZIZ(16);
        int iLIZIZ2 = C0H9H.LIZIZ(4);
        TuxIconView tuxIconView2 = this.LLILZLL;
        if (tuxIconView2 == null) {
            tuxIconView2 = new TuxIconView(getContext(), null, 0, 6, null);
            tuxIconView2.setId(R.id.dko);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_info_circle;
            c419910GdJ.LIZIZ = iLIZIZ;
            c419910GdJ.LIZJ = iLIZIZ;
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, tuxIconView2.getContext());
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            tuxIconView2.setTuxIcon(c419910GdJ);
            tuxIconView2.setFocusable(true);
            tuxIconView2.setClickable(true);
            tuxIconView2.setBackground(null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
            layoutParams.gravity = 8388659;
            addView(tuxIconView2, layoutParams);
            this.LLILZLL = tuxIconView2;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        C786410Ut5.a9(tuxIconView2, new ACListenerS136S0100000_1(function0, 23));
        int i = (iLIZIZ2 * 2) + iLIZIZ;
        if (headerTitleTextView.getPaddingEnd() != i) {
            headerTitleTextView.setPaddingRelative(headerTitleTextView.getPaddingStart(), headerTitleTextView.getPaddingTop(), i, headerTitleTextView.getPaddingBottom());
        }
        C21370518kB.LIZ(headerTitleTextView, tuxIconView2, this, iLIZIZ, iLIZIZ2);
    }

    public final void LJ(String str) {
        ViewGroup viewGroup;
        if (str != null) {
            this.LL.setFooter(this.LLILZ);
            this.LLILZ.setMessage(str);
            this.LLILLJJLI.setValidationStatus(3);
            return;
        }
        this.LL.setFooter(null);
        this.LLILLJJLI.setValidationStatus(0);
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        while (it2.hasNext()) {
            it2.next().forceLayout();
        }
    }

    public final void setDelayKeyBoardClearFocus(boolean z) {
        this.LLJI = z;
    }

    public final void setEndInfoIcon(Function0<Unit> function0) {
        if (function0 != null) {
            TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_camera;
            c419910GdJ.LIZJ = C0H9H.LIZIZ(20);
            c419910GdJ.LIZIZ = C0H9H.LIZIZ(20);
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ub, tuxIconView.getContext());
            c419910GdJ.LJ = Integer.valueOf(R.attr.ub);
            tuxIconView.setTuxIcon(c419910GdJ);
            C786410Ut5.a9(tuxIconView, new ACListenerS136S0100000_1(function0, 24));
            this.LLILLJJLI.LJFF(tuxIconView);
        }
    }

    public final void setExtraPaddingTop(int i) {
        C0H1U.LJIIJ(i, this.LL);
    }

    public final void setInlineInfoIcon(Function0<Unit> function0) {
        if (function0 != null) {
            TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_info_circle;
            c419910GdJ.LIZJ = C0H9H.LIZIZ(getIconSize());
            c419910GdJ.LIZIZ = C0H9H.LIZIZ(getIconSize());
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, tuxIconView.getContext());
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            tuxIconView.setTuxIcon(c419910GdJ);
            C786410Ut5.a9(tuxIconView, new ACListenerS136S0100000_1(function0, 25));
            this.LLILLJJLI.LJFF(tuxIconView);
        }
    }

    public final void setInlineNotification(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setInputBoxSizeVariant(Integer num) {
        this.LLJILJIL = num;
    }

    public final void setNoTitle(boolean z) {
        this.LLJ = z;
    }

    public final void setOnErrorClear(Function0<Unit> function0) {
        this.LLIZLLLIL = function0;
    }

    public final void setOnVerify(Function1<? super List<PaymentElement>, String> function1) {
        this.LLIZ = function1;
    }

    public final void setPlaceHolderText(String str) {
        this.LLILLJJLI.setPlaceholderText(str);
    }

    public final void setSizeVariantForInputBox(int i) {
        this.LLILLJJLI.setSizeVariant(i);
        this.LLJILJIL = Integer.valueOf(i);
    }

    public final void setTitle(String str) {
        this.LL.setHeader(this.LLILLL);
        this.LLILLL.setName(str);
        if (CCDCAddCardLongTextAdjust.LIZ()) {
            TextView headerTitleTextView = getHeaderTitleTextView();
            if (headerTitleTextView != null) {
                headerTitleTextView.setPaddingRelative(headerTitleTextView.getPaddingStart(), headerTitleTextView.getPaddingTop(), 0, headerTitleTextView.getPaddingBottom());
                C1071804Hc.LIZIZ(headerTitleTextView);
                C1071804Hc.LIZ(headerTitleTextView);
                LIZJ(headerTitleTextView);
            }
            LIZ(null);
            if (headerTitleTextView == null || headerTitleTextView.getWidth() <= 0 || headerTitleTextView.getLayout() == null) {
                if (isAttachedToWindow()) {
                    if (isLaidOut() && !isLayoutRequested()) {
                        TextView headerTitleTextView2 = getHeaderTitleTextView();
                        if (headerTitleTextView2 != null) {
                            C1071804Hc.LIZIZ(headerTitleTextView2);
                            C1071804Hc.LIZ(headerTitleTextView2);
                            LIZJ(headerTitleTextView2);
                            if (headerTitleTextView2.getLayout() == null && headerTitleTextView2.getWidth() > 0) {
                                LIZIZ(headerTitleTextView2);
                            }
                            if (headerTitleTextView2.getLayout() == null) {
                                headerTitleTextView2.requestLayout();
                                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(headerTitleTextView2, new ARunnableS70S0200000_1(headerTitleTextView2, this, 24));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    addOnLayoutChangeListener(new C04JJ(this, 2));
                    return;
                }
                addOnAttachStateChangeListener(new C04JQ(this, this, 0));
            }
        }
    }

    public final void setTitleIcon(Function0<Unit> function0) {
        if (CCDCAddCardLongTextAdjust.LIZ()) {
            LIZ(function0);
        } else if (function0 != null) {
            this.LLILLL.setInfoIcon(C958803ow.LIZ);
            this.LLILLL.setInfoIconClickListener(new ACListenerS136S0100000_1(function0, 26));
        } else {
            this.LLILLL.setInfoIcon(null);
        }
    }

    public final void setEndInfoIcon(TuxIconView tuxIconView) {
        this.LLILLJJLI.LJFF(tuxIconView);
    }

    public C958503ot(Context context, AttributeSet attributeSet, int i) {
        C19FO c19fo;
        super(context, attributeSet, i);
        this.LLIZ = AFwS228S0000000_1.get$arr$(728);
        this.LLIZLLLIL = AFwS185S0000000_1.get$arr$(463);
        C1237400iJ0 c1237400iJ0 = new C1237400iJ0(context, null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1237400iJ0);
        c1237400iJ0.setLayoutParams(layoutParams);
        this.LL = c1237400iJ0;
        C1748440vbG c1748440vbG = new C1748440vbG(context, null, 6);
        C786410Ut5.L6(c1748440vbG, new FrameLayout.LayoutParams(-1, -2));
        this.LLILLJJLI = c1748440vbG;
        C1748300vb2 c1748300vb2 = new C1748300vb2(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1748300vb2);
        c1748300vb2.setLayoutParams(layoutParams2);
        c1748300vb2.setHasRequiredMark(false);
        this.LLILLL = c1748300vb2;
        C1748330vb5 c1748330vb5 = new C1748330vb5(context, null, 6);
        C786410Ut5.K6(c1748330vb5, new FrameLayout.LayoutParams(-1, -2));
        c1748330vb5.setMessageIcon(C958703ov.LIZ);
        this.LLILZ = c1748330vb5;
        c1237400iJ0.setContent(c1748440vbG);
        if (Intrinsics.LJFF(EcPaymentAddCardConfigSettings.LIZ().formOpti, Boolean.TRUE)) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 80;
            addView(c1237400iJ0, layoutParams3);
        } else {
            addView(c1237400iJ0);
        }
        LJ(null);
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if ((activityLIZ instanceof C19GS) && (c19fo = (C19FO) activityLIZ) != null) {
            new KeyBoardVisibilityUtil(c19fo, (Integer) 32, (Function2<? super Boolean, ? super Integer, Unit>) new AwS615S0100000_1(this, 202));
        }
    }

    public void LIZLLL(ElementDTO elementDTO, List<PaymentElement> list, String str) {
        Integer num;
        int inputType;
        EditText editText;
        String str2;
        if (!this.LLJ && (str2 = elementDTO.displayName) != null) {
            setTitle(str2);
        }
        if (C1533950q1J.LJ(elementDTO.notificationUrl)) {
            if (this.LLJIJIL) {
                setInlineInfoIcon(new AwS402S0200000_1(this, elementDTO, 79));
            } else {
                setTitleIcon(new AwS402S0200000_1(this, elementDTO, 80));
            }
        }
        String str3 = elementDTO.placeholderDisplayName;
        if (str3 != null) {
            setPlaceHolderText(str3);
        }
        if (CCDCAddCardLongTextAdjust.LIZ() && (editText = getEditText()) != null) {
            editText.setSingleLine(true);
            editText.setMaxLines(1);
            editText.setEllipsize(TextUtils.TruncateAt.END);
        }
        EditText editText2 = getEditText();
        Configuration configuration = elementDTO.configuration;
        if (configuration != null) {
            num = configuration.inputType;
        } else {
            num = null;
        }
        int iOrdinal = EnumC941503m9.NUMBER.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            inputType = 2;
        } else {
            int iOrdinal2 = EnumC941503m9.PHONE.ordinal();
            if (num != null && num.intValue() == iOrdinal2) {
                inputType = 3;
            } else {
                int iOrdinal3 = EnumC941503m9.TEXT.ordinal();
                if (num != null && num.intValue() == iOrdinal3) {
                    inputType = 1;
                } else {
                    inputType = getEditText().getInputType();
                }
            }
        }
        editText2.setInputType(inputType);
        getEditText().setMaxLines(1);
        LJ(null);
        if (str != null) {
            LJ(str);
        }
    }
}

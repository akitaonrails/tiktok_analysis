package X;

import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ab.PipoCashierElementVerifierSettings;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.utils.KeyBoardVisibilityUtil;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: renamed from: X.0ueL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1711910ueL extends FrameLayout {
    public static boolean LLJIJIL;
    public final C1237400iJ0 LL;
    public C1748440vbG LLILLJJLI;
    public final C1748300vb2 LLILLL;
    public final C1748330vb5 LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public Function1<? super String, C1710830ucb> LLIZ;
    public Function0<Unit> LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    public void LIZIZ() {
        this.LLIZ = AFwS268S0000000_26.get$arr$(560);
        this.LLIZLLLIL = AFwS215S0000000_26.get$arr$(360);
        this.LLJ = false;
        this.LLJI = false;
        LIZJ(null);
        this.LLILLJJLI.LJIILLIIL(false);
        setTitleIcon(null);
        setEndInfoIcon(null);
        this.LL.setHeader(null);
        this.LLILLJJLI.setPlaceholderText(null);
        getEditText().setOnFocusChangeListener(null);
        getEditText().setText("");
        getEditText().setInputType(1);
        getEditText().setMaxLines(1);
        getEditText().setImeOptions(6);
    }

    public final EditText getEditText() {
        return this.LLILLJJLI.LLJLILLLLZIIL;
    }

    public final C1748440vbG getContentView() {
        return this.LLILLJJLI;
    }

    public final boolean getDelayKeyBoardClearFocus() {
        return this.LLJI;
    }

    public final boolean getNoTitle() {
        return this.LLJ;
    }

    public final Function0<Unit> getOnErrorClear() {
        return this.LLIZLLLIL;
    }

    public final Function1<String, C1710830ucb> getOnVerify() {
        return this.LLIZ;
    }

    public final void LIZJ(C1710830ucb c1710830ucb) {
        ViewGroup viewGroup;
        if (c1710830ucb != null) {
            this.LL.setFooter(this.LLILZ);
            this.LLILZ.setMessage(c1710830ucb.LIZ);
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

    public final void setContentView(C1748440vbG c1748440vbG) {
        this.LLILLJJLI = c1748440vbG;
    }

    public final void setDelayKeyBoardClearFocus(boolean z) {
        this.LLJI = z;
    }

    public final void setEndInfoIcon(Function0<Unit> function0) {
        if (function0 != null) {
            TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_info_circle;
            c419910GdJ.LIZJ = C1722120uuo.LIZJ(20);
            c419910GdJ.LIZIZ = C1722120uuo.LIZJ(20);
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ud, tuxIconView.getContext());
            tuxIconView.setTuxIcon(c419910GdJ);
            C786410Ut5.a9(tuxIconView, new ACListenerS160S0100000_26(function0, 47));
            this.LLILLJJLI.LJFF(tuxIconView);
            return;
        }
        this.LLILLJJLI.LJFF(null);
    }

    public final void setNoTitle(boolean z) {
        this.LLJ = z;
    }

    public final void setOnErrorClear(Function0<Unit> function0) {
        this.LLIZLLLIL = function0;
    }

    public final void setOnVerify(Function1<? super String, C1710830ucb> function1) {
        this.LLIZ = function1;
    }

    public final void setPlaceHolderText(String str) {
        this.LLILLJJLI.setPlaceholderText(str);
    }

    public final void setTitle(String str) {
        this.LL.setHeader(this.LLILLL);
        this.LLILLL.setName(str);
    }

    public final void setTitleIcon(Function0<Unit> function0) {
        if (function0 != null) {
            this.LLILLL.setInfoIcon(C958803ow.LIZ);
            this.LLILLL.setInfoIconClickListener(new ACListenerS160S0100000_26(function0, 48));
        } else {
            this.LLILLL.setInfoIcon(null);
        }
    }

    public final void setTitleViewTracker(Function1<? super TextView, Unit> function1) {
        View viewFindViewById;
        TextView textView;
        ViewTreeObserver viewTreeObserver;
        try {
            if (!this.LLILZIL) {
                this.LLILZIL = true;
                if (function1 != null && (viewFindViewById = this.LLILLL.findViewById(R.id.hws)) != null && (viewFindViewById instanceof TextView) && (textView = (TextView) viewFindViewById) != null && (viewTreeObserver = textView.getViewTreeObserver()) != null) {
                    ViewTreeObserverOnGlobalLayoutListenerC1775930wJb viewTreeObserverOnGlobalLayoutListenerC1775930wJb = new ViewTreeObserverOnGlobalLayoutListenerC1775930wJb(viewFindViewById, this, function1, 4);
                    viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775930wJb);
                    C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775930wJb, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1708710uZB.LIZ("Cashier").LIZ(4, "fail to add view tracker");
        }
    }

    public C1711910ueL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1711910ueL(Context context, AttributeSet attributeSet, int i) {
        C19FO c19fo;
        super(context, attributeSet, i);
        this.LLIZ = AFwS268S0000000_26.get$arr$(559);
        this.LLIZLLLIL = AFwS215S0000000_26.get$arr$(359);
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
        c1237400iJ0.setContent(this.LLILLJJLI);
        addView(c1237400iJ0);
        LIZJ(null);
        if (PipoCashierElementVerifierSettings.LIZ().keyboardSwitch) {
            Context context2 = getContext();
            if ((context2 instanceof C19FO) && (c19fo = (C19FO) context2) != null) {
                new KeyBoardVisibilityUtil(c19fo, 32, new AwS640S0100000_26(this, 83));
            }
        }
    }

    public void LIZ(Element element, C1709570uaZ c1709570uaZ, String str, int i) {
        String str2;
        if (!this.LLJ && (str2 = element.displayName) != null) {
            setTitle(str2);
        }
        String str3 = element.placeholderRawText;
        if (str3 != null) {
            setPlaceHolderText(str3);
        }
        EditText editText = getEditText();
        int i2 = C1710560ucA.LIZ[element.LIZ().ordinal()];
        int inputType = 2;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            inputType = getEditText().getInputType();
        }
        editText.setInputType(inputType);
        getEditText().setMaxLines(1);
        getEditText().setImeOptions(i);
        LIZJ(null);
    }
}

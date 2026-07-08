package X;

import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03IC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03IC extends ConstraintLayout {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C1841350y17 LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public FrameLayout LLIZLLLIL;
    public TuxTextView LLJ;
    public C803403Bw LLJI;
    public TuxTextView LLJIJIL;
    public C20627315nb LLJILJIL;
    public C20627315nb LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;

    public final TuxTextView getAddressDetailFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ags);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getChangeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dn7);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final FrameLayout getCommerceFramelayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ego);
            this.LLIZLLLIL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxTextView getEditFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gnd);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getForwardFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iib);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getHintTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jow);
            this.LLJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C803403Bw getLlRichContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n_z);
            this.LLJI = (C803403Bw) callbackFindViewById;
        }
        return (C803403Bw) callbackFindViewById;
    }

    public final TuxTextView getNameAndContactFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p0b);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C20627315nb getOrderSubmitAddressSkeleton1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pr6);
            this.LLJILJIL = (C20627315nb) callbackFindViewById;
        }
        return (C20627315nb) callbackFindViewById;
    }

    public final C20627315nb getOrderSubmitAddressSkeleton2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.pr7);
            this.LLJILJILJ = (C20627315nb) callbackFindViewById;
        }
        return (C20627315nb) callbackFindViewById;
    }

    public final TuxIconView getPrefixFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ro6);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final C1841350y17 getRadioFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sp_);
            this.LLILZ = (C1841350y17) callbackFindViewById;
        }
        return (C1841350y17) callbackFindViewById;
    }

    public final TuxTextView getZipcodeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zipcode);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final void setHasPrefix(boolean z) {
        int i;
        this.LLJILLL = z;
        TuxIconView prefixFromXml = getPrefixFromXml();
        if (this.LLJILLL) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(prefixFromXml, i);
        if (this.LLJILLL) {
            TuxTextView nameAndContactFromXml = getNameAndContactFromXml();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getNameAndContactFromXml().getLayoutParams();
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            C786410Ut5.R6(nameAndContactFromXml, marginLayoutParams);
            return;
        }
        TuxTextView nameAndContactFromXml2 = getNameAndContactFromXml();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getNameAndContactFromXml().getLayoutParams();
        marginLayoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        C786410Ut5.R6(nameAndContactFromXml2, marginLayoutParams2);
    }

    private final void setSuffixType(int i) {
        int i2;
        int i3;
        int i4;
        this.LLJJ = i;
        C1841350y17 radioFromXml = getRadioFromXml();
        int i5 = 0;
        if (this.LLJJ == 3) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, radioFromXml);
        TuxIconView forwardFromXml = getForwardFromXml();
        if (this.LLJJ == 2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LJLLLLLL(i3, forwardFromXml);
        TuxTextView editFromXml = getEditFromXml();
        if (this.LLJJ == 1) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        C786410Ut5.LJLLLLLL(i4, editFromXml);
        TuxTextView changeFromXml = getChangeFromXml();
        if (this.LLJJ != 4) {
            i5 = 8;
        }
        C786410Ut5.LJLLLLLL(i5, changeFromXml);
        if (this.LLJJ == 1) {
            HandlerHook.viewPost(this, new ARunnableS101S0100000_1((Object) this, 28));
        } else {
            getCommerceFramelayoutFromXml().setTouchDelegate(null);
        }
    }

    public final void setAddressDetailFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAddressInfo(X.AnonymousClass0376 r12) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03IC.setAddressInfo(X.0376):void");
    }

    public final void setChangeFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setCommerceFramelayoutFromXml(FrameLayout frameLayout) {
        this.LLIZLLLIL = frameLayout;
    }

    public final void setEditFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setForwardFromXml(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setHintTextFromXml(TuxTextView tuxTextView) {
        this.LLJ = tuxTextView;
    }

    public final void setLlRichContainerFromXml(C803403Bw c803403Bw) {
        this.LLJI = c803403Bw;
    }

    public final void setNameAndContactFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setOrderSubmitAddressSkeleton1FromXml(C20627315nb c20627315nb) {
        this.LLJILJIL = c20627315nb;
    }

    public final void setOrderSubmitAddressSkeleton2FromXml(C20627315nb c20627315nb) {
        this.LLJILJILJ = c20627315nb;
    }

    public final void setPaddingVertical(int i) {
        float f = i;
        setPadding(0, (int) C12ES.LIZJ(f, getContext()), 0, (int) C12ES.LIZJ(f, getContext()));
    }

    public final void setPrefixFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setRadioFromXml(C1841350y17 c1841350y17) {
        this.LLILZ = c1841350y17;
    }

    public final void setZipcodeFromXml(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public C03IC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C03IC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJILLL = true;
        this.LLJJ = 2;
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.ais, this, true);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new C19ME(-1, -2);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.commerce_AddressInfoCard);
        setHasPrefix(typedArrayObtainStyledAttributes.getBoolean(R$styleable.commerce_AddressInfoCard_commerce_hasPrefix, true));
        setSuffixType(typedArrayObtainStyledAttributes.getInt(R$styleable.commerce_AddressInfoCard_commerce_suffixType, 2));
        typedArrayObtainStyledAttributes.recycle();
        setPaddingVertical(16);
        C427690Gpr.LJ(this, 0.0f);
        getEditFromXml().setOnTouchListener(new C03ID());
    }
}

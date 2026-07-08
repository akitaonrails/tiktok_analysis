package X;

import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03rD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C972903rD extends ConstraintLayout {
    public TuxTextView LL;
    public RadioButton LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public LinearLayout LLILZIL;
    public TuxIconView LLILZLL;
    public TuxIconView LLIZ;
    public TuxTextView LLIZLLLIL;
    public FrameLayout LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public String LLJJIJIIJIL;
    public List<String> LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;

    public final TuxTextView getAddressDetailFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ags);
            this.LLJILJILJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getChangeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dn7);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final FrameLayout getCommerceFramelayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ego);
            this.LLJ = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final TuxTextView getDefaultLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fj0);
            this.LLJJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getDefaultRichInfoListLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fk8);
            this.LLILZIL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView getEditFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gnd);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getEmailFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gy5);
            this.LLJIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getForwardFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iib);
            this.LLIZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getHintTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jow);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p09);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getPhoneFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qa_);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getPrefixFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ro6);
            this.LLILZLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final RadioButton getRadioFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sp_);
            this.LLILLJJLI = (RadioButton) callbackFindViewById;
        }
        return (RadioButton) callbackFindViewById;
    }

    public final TuxTextView getRegionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.t3d);
            this.LLJILJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getUnavailableLabelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.unavailable_label);
            this.LLJJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getZipcodeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.zipcode);
            this.LLJILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final String getAddressDetailText() {
        return this.LLJJJJ;
    }

    public final String getEmailText() {
        return this.LLJJJ;
    }

    public final boolean getHasPrefix() {
        return this.LLJJIII;
    }

    public final String getHintText() {
        return this.LLJLIL;
    }

    public final String getNameText() {
        return this.LLJJIJIIJIL;
    }

    public final List<String> getPhoneList() {
        return this.LLJJIJIL;
    }

    public final boolean getReachable() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final String getRegionText() {
        return this.LLJJJIL;
    }

    public final int getSuffixType() {
        return this.LLJJIJI;
    }

    public final String getUiMode() {
        return this.LLJL;
    }

    public final String getZipcodeText() {
        return this.LLJJJJJIL;
    }

    public /* synthetic */ C972903rD(Context context) {
        this(context, null, 0);
    }

    public final void setAddressDetailFromXml(TuxTextView tuxTextView) {
        this.LLJILJILJ = tuxTextView;
    }

    public final void setAddressDetailText(String str) {
        this.LLJJJJ = str;
        getAddressDetailFromXml().setText(this.LLJJJJ);
        TuxTextView addressDetailFromXml = getAddressDetailFromXml();
        String str2 = this.LLJJJJ;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(addressDetailFromXml, i);
    }

    public final void setChangeFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setCommerceFramelayoutFromXml(FrameLayout frameLayout) {
        this.LLJ = frameLayout;
    }

    public final void setDefault(boolean z) {
        int i;
        this.LLJJJJLIIL = z;
        TuxTextView defaultLabelFromXml = getDefaultLabelFromXml();
        if (this.LLJJJJLIIL) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(defaultLabelFromXml, i);
    }

    public final void setDefaultLabelFromXml(TuxTextView tuxTextView) {
        this.LLJJ = tuxTextView;
    }

    public final void setDefaultRichInfoListLayoutFromXml(LinearLayout linearLayout) {
        this.LLILZIL = linearLayout;
    }

    public final void setEditFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setEmailFromXml(TuxTextView tuxTextView) {
        this.LLJIJIL = tuxTextView;
    }

    public final void setEmailText(String str) {
        this.LLJJJ = str;
        getEmailFromXml().setText(this.LLJJJ);
        TuxTextView emailFromXml = getEmailFromXml();
        String str2 = this.LLJJJ;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(emailFromXml, i);
    }

    public final void setForwardFromXml(TuxIconView tuxIconView) {
        this.LLIZ = tuxIconView;
    }

    public final void setHasPrefix(boolean z) {
        int i;
        this.LLJJIII = z;
        TuxIconView prefixFromXml = getPrefixFromXml();
        if (this.LLJJIII) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(prefixFromXml, i);
        if (this.LLJJIII) {
            TuxTextView nameFromXml = getNameFromXml();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getNameFromXml().getLayoutParams();
            marginLayoutParams.setMarginStart((int) C12ES.LIZJ(12.0f, getContext()));
            C786410Ut5.R6(nameFromXml, marginLayoutParams);
            return;
        }
        TuxTextView nameFromXml2 = getNameFromXml();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getNameFromXml().getLayoutParams();
        marginLayoutParams2.setMarginStart((int) C12ES.LIZJ(16.0f, getContext()));
        C786410Ut5.R6(nameFromXml2, marginLayoutParams2);
    }

    public final void setHintText(String str) {
        this.LLJLIL = str;
        if (str != null && str.length() != 0) {
            C03DZ.LIZJ(getHintTextFromXml());
        } else {
            C03DZ.LIZ(getHintTextFromXml());
        }
    }

    public final void setHintTextFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setNameFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setNameText(String str) {
        this.LLJJIJIIJIL = str;
        getNameFromXml().setText(this.LLJJIJIIJIL);
    }

    public final void setPaddingVertical(int i) {
        float f = i;
        setPadding(0, (int) C12ES.LIZJ(f, getContext()), 0, (int) C12ES.LIZJ(f, getContext()));
    }

    public final void setPhoneFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public final void setPhoneList(List<String> list) {
        this.LLJJIJIL = list;
        TuxTextView phoneFromXml = getPhoneFromXml();
        List<String> listLJLJJLL = this.LLJJIJIL;
        C1360500lVY c1360500lVY = null;
        int i = 0;
        if (listLJLJJLL != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            if (C426750GoL.LIZLLL(getContext())) {
                listLJLJJLL = C13LP.LJLJJLL(listLJLJJLL);
            }
            int i2 = 0;
            for (String str : listLJLJJLL) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str2 = str;
                    if (str2 != null) {
                        c1360520lVa.LIZLLL(str2);
                    }
                    if (i2 != listLJLJJLL.size() - 1) {
                        c1360520lVa.LIZIZ(" , ");
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c1360500lVY = c1360520lVa.LIZ;
        }
        phoneFromXml.setText(c1360500lVY);
        TuxTextView phoneFromXml2 = getPhoneFromXml();
        List<String> list2 = this.LLJJIJIL;
        if (list2 == null || list2.isEmpty()) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(phoneFromXml2, i);
    }

    public final void setPrefixFromXml(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    public final void setRadioFromXml(RadioButton radioButton) {
        this.LLILLJJLI = radioButton;
    }

    public final void setReachable(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
        int iLIZ = C960203pA.LIZ(R.attr.a1h, getContext());
        int iLIZ2 = C960203pA.LIZ(R.attr.a1j, getContext());
        if (!this.LLJJLIIIJLLLLLLLZ) {
            iLIZ = C960203pA.LIZ(R.attr.a1p, getContext());
            iLIZ2 = C960203pA.LIZ(R.attr.a1p, getContext());
        }
        getNameFromXml().setTextColor(iLIZ);
        getPhoneFromXml().setTextColor(iLIZ2);
        getRegionFromXml().setTextColor(iLIZ2);
        getAddressDetailFromXml().setTextColor(iLIZ2);
        getZipcodeFromXml().setTextColor(iLIZ2);
        getEmailFromXml().setTextColor(iLIZ2);
    }

    public final void setRegionFromXml(TuxTextView tuxTextView) {
        this.LLJILJIL = tuxTextView;
    }

    public final void setRegionText(String str) {
        this.LLJJJIL = str;
        getRegionFromXml().setText(this.LLJJJIL);
        TuxTextView regionFromXml = getRegionFromXml();
        String str2 = this.LLJJJIL;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(regionFromXml, i);
    }

    public final void setSuffixType(int i) {
        int i2;
        int i3;
        int i4;
        this.LLJJIJI = i;
        RadioButton radioFromXml = getRadioFromXml();
        int i5 = 0;
        if (this.LLJJIJI == 3) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, radioFromXml);
        TuxIconView forwardFromXml = getForwardFromXml();
        if (this.LLJJIJI == 2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LJLLLLLL(i3, forwardFromXml);
        TuxTextView editFromXml = getEditFromXml();
        if (this.LLJJIJI == 1) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        C786410Ut5.LJLLLLLL(i4, editFromXml);
        TuxTextView changeFromXml = getChangeFromXml();
        if (this.LLJJIJI != 4) {
            i5 = 8;
        }
        C786410Ut5.LJLLLLLL(i5, changeFromXml);
        if (this.LLJJIJI == 1) {
            HandlerHook.viewPost(this, new ARunnableS101S0100000_1((Object) this, 59));
        } else {
            getCommerceFramelayoutFromXml().setTouchDelegate(null);
        }
    }

    public final void setUiMode(String str) {
        this.LLJL = str;
        if (Intrinsics.LJFF(str, "simple")) {
            getNameFromXml().setMaxLines(1);
            getPhoneFromXml().setMaxLines(1);
            getAddressDetailFromXml().setMaxLines(2);
            getRegionFromXml().setMaxLines(1);
            getZipcodeFromXml().setMaxLines(1);
            return;
        }
        getNameFromXml().setMaxLines(Integer.MAX_VALUE);
        getPhoneFromXml().setMaxLines(1);
        getAddressDetailFromXml().setMaxLines(Integer.MAX_VALUE);
        getRegionFromXml().setMaxLines(Integer.MAX_VALUE);
        getZipcodeFromXml().setMaxLines(1);
    }

    public final void setUnavailable(boolean z) {
        int i;
        this.LLJJL = z;
        TuxTextView unavailableLabelFromXml = getUnavailableLabelFromXml();
        if (this.LLJJL) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLZLL(unavailableLabelFromXml, i);
    }

    public final void setUnavailableLabelFromXml(TuxTextView tuxTextView) {
        this.LLJJI = tuxTextView;
    }

    public final void setZipcodeFromXml(TuxTextView tuxTextView) {
        this.LLJILLL = tuxTextView;
    }

    public final void setZipcodeText(String str) {
        this.LLJJJJJIL = str;
        getZipcodeFromXml().setText(this.LLJJJJJIL);
        TuxTextView zipcodeFromXml = getZipcodeFromXml();
        String str2 = this.LLJJJJJIL;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        C786410Ut5.LLLLZLL(zipcodeFromXml, i);
    }

    public C972903rD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJIII = true;
        this.LLJJIJI = 2;
        this.LLJJIJIIJIL = "";
        this.LLJJJ = "";
        this.LLJJJIL = "";
        this.LLJJJJ = "";
        this.LLJJJJJIL = "";
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJL = "simple";
        this.LLJLIL = "";
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.air, this, true);
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

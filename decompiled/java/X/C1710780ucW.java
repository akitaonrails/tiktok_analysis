package X;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.EditText;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: renamed from: X.0ucW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710780ucW extends C1711910ueL {
    public C1710820uca LLJILJIL;
    public Function1<? super Boolean, Unit> LLJILJILJ;
    public Function1<? super String, Unit> LLJILLL;
    public Function1<? super String, Unit> LLJJ;
    public Function1<? super Boolean, Unit> LLJJI;
    public String LLJJIII;
    public EnumC1710490uc3 LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;

    public C1710780ucW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.C1711910ueL
    public final void LIZIZ() {
        C1710820uca c1710820uca = this.LLJILJIL;
        if (c1710820uca != null) {
            getEditText().removeTextChangedListener(c1710820uca);
        }
        this.LLJILJIL = null;
        super.LIZIZ();
        this.LLJILJILJ = AFwS268S0000000_26.get$arr$(413);
        this.LLJILLL = AFwS268S0000000_26.get$arr$(414);
        this.LLJJ = AFwS268S0000000_26.get$arr$(415);
        this.LLJJI = AFwS268S0000000_26.get$arr$(416);
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = "ccdc_card_info";
        this.LLJJIJIL = "ccdc";
    }

    public final String getValue() {
        return C2204961BRm.LLJILLL(getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CA3zMRkEGe2F3/FRz8DHtueHA4i57+swHAT/GA9lW1CFXaxMPvdCxUvDvI34Ddt8aM4A==", null)).toString();
    }

    public final Function1<String, Unit> getAfterValueChanged() {
        return this.LLJJ;
    }

    public final EnumC1710490uc3 getEleType() {
        return this.LLJJIJI;
    }

    public final Function1<Boolean, Unit> getFocusChange() {
        return this.LLJJI;
    }

    public final Function1<Boolean, Unit> getOnFocusChange() {
        return this.LLJILJILJ;
    }

    public final Function1<String, Unit> getOnValueChange() {
        return this.LLJILLL;
    }

    public final String getOptionNameForTrack() {
        return this.LLJJIJIL;
    }

    public final String getPageName() {
        return this.LLJJIJIIJIL;
    }

    public final String getPrefilledValue() {
        return this.LLJJIII;
    }

    public final void setAfterValueChanged(Function1<? super String, Unit> function1) {
        this.LLJJ = function1;
    }

    public final void setEleType(EnumC1710490uc3 enumC1710490uc3) {
        this.LLJJIJI = enumC1710490uc3;
    }

    public final void setFocusChange(Function1<? super Boolean, Unit> function1) {
        this.LLJJI = function1;
    }

    public final void setOnFocusChange(Function1<? super Boolean, Unit> function1) {
        this.LLJILJILJ = function1;
    }

    public final void setOnValueChange(Function1<? super String, Unit> function1) {
        this.LLJILLL = function1;
    }

    public final void setOptionNameForTrack(String str) {
        this.LLJJIJIL = str;
    }

    public final void setPageName(String str) {
        this.LLJJIJIIJIL = str;
    }

    public final void setPrefilledValue(String str) {
        this.LLJJIII = str;
    }

    public C1710780ucW(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJILJILJ = AFwS268S0000000_26.get$arr$(411);
        this.LLJILLL = AFwS268S0000000_26.get$arr$(412);
        this.LLJJ = AFwS268S0000000_26.get$arr$(408);
        this.LLJJI = AFwS268S0000000_26.get$arr$(409);
        this.LLJJIJIIJIL = "ccdc_card_info";
        this.LLJJIJIL = "ccdc";
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0uca] */
    @Override // X.C1711910ueL
    public final void LIZ(Element element, C1709570uaZ c1709570uaZ, String str, int i) {
        String str2;
        super.LIZ(element, c1709570uaZ, str, i);
        C1710820uca c1710820uca = this.LLJILJIL;
        if (c1710820uca != null) {
            getEditText().removeTextChangedListener(c1710820uca);
        }
        EditText editText = getEditText();
        String str3 = this.LLJJIII;
        if (str3 == null) {
            str3 = "";
        }
        editText.setText(str3);
        int i2 = C1710530uc7.LIZ[element.LIZ().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            str2 = "unknown";
                        } else {
                            str2 = "billing_postal_code";
                        }
                    } else {
                        str2 = "billing_street";
                    }
                } else {
                    str2 = "billing_city";
                }
            } else {
                str2 = "holder_name";
            }
        } else {
            str2 = "cvv";
        }
        getEditText().setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775810wJP(this, new C1710380ubs(str, str2, this.LLJJIJIIJIL, this.LLJJIJIL), 0));
        this.LLJILJIL = new C1710740ucS() { // from class: X.0uca
            @Override // X.C1710740ucS, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                this.LL.getAfterValueChanged().invoke(this.LL.getValue());
                C1708710uZB.LIZ("Cashier").LIZ(4, "CCDCNormalView afterValueChanged");
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                this.LL.getOnValueChange().invoke(this.LL.getValue());
                C1708710uZB.LIZ("Cashier").LIZ(4, "CCDCNormalView onValueChanged");
            }
        };
        getEditText().addTextChangedListener(this.LLJILJIL);
        if (this.LLJJIJI == EnumC1710490uc3.CVV) {
            setTitleViewTracker(AFwS268S0000000_26.get$arr$(410));
        }
    }
}

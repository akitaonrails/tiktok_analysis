package X;

import android.content.Context;
import android.text.Editable;
import android.widget.EditText;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0ucZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710810ucZ extends C1711910ueL {
    public C1710800ucY LLJILJIL;
    public Function1<? super Boolean, Unit> LLJILJILJ;
    public boolean LLJILLL;
    public Function1<? super String, Unit> LLJJ;
    public Function1<? super String, Unit> LLJJI;
    public String LLJJIII;

    @Override // X.C1711910ueL
    public final void LIZIZ() {
        C1710800ucY c1710800ucY = this.LLJILJIL;
        if (c1710800ucY != null) {
            getEditText().removeTextChangedListener(c1710800ucY);
        }
        this.LLJILJIL = null;
        super.LIZIZ();
        this.LLJILJILJ = AFwS268S0000000_26.get$arr$(555);
        this.LLJILLL = false;
        this.LLJJ = AFwS268S0000000_26.get$arr$(556);
        this.LLJJI = AFwS268S0000000_26.get$arr$(557);
        this.LLJJIII = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object c098200Yq;
        super.onAttachedToWindow();
        try {
            EventBus.LIZLLL().LJIJJ(this);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        try {
            EventBus.LIZLLL().LJJI(this);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.onDetachedFromWindow();
    }

    public final Function1<String, Unit> getAfterTextChanged() {
        return this.LLJJI;
    }

    public final Function1<Boolean, Unit> getFocusChange() {
        return this.LLJILJILJ;
    }

    public final Function1<String, Unit> getOnValueChange() {
        return this.LLJJ;
    }

    public final String getPrefilledValue() {
        return this.LLJJIII;
    }

    public final boolean getTextHasFocus() {
        return this.LLJILLL;
    }

    public C1710810ucZ(Context context) {
        super(context, null, 0);
        this.LLJILJILJ = AFwS231S0000000_3.get$arr$(147);
        this.LLJJ = AFwS268S0000000_26.get$arr$(558);
        this.LLJJI = AFwS268S0000000_26.get$arr$(553);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.00EA] */
    @C14EU
    public final void onEvent(C1710980ucq c1710980ucq) {
        EditText editText = getEditText();
        final String str = c1710980ucq.LIZIZ;
        final String str2 = c1710980ucq.LIZJ;
        editText.setText(new Object(str, str2) { // from class: X.00EA
            public final String LIZ;
            public final String LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C00EA)) {
                    return false;
                }
                C00EA c00ea = (C00EA) obj;
                return Intrinsics.LJFF(this.LIZ, c00ea.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00ea.LIZIZ);
            }

            public final int hashCode() {
                String str3 = this.LIZ;
                int iHashCode = (str3 == null ? 0 : str3.hashCode()) * 31;
                String str4 = this.LIZIZ;
                return iHashCode + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                String str3 = this.LIZIZ;
                if (str3 == null) {
                    str3 = "";
                }
                sbLIZ.append(str3);
                sbLIZ.append('/');
                String str4 = this.LIZ;
                sbLIZ.append(str4 != null ? str4 : "");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = str;
                this.LIZIZ = str2;
            }
        }.toString());
        getEditText().requestFocus();
    }

    public final void setAfterTextChanged(Function1<? super String, Unit> function1) {
        this.LLJJI = function1;
    }

    public final void setFocusChange(Function1<? super Boolean, Unit> function1) {
        this.LLJILJILJ = function1;
    }

    public final void setOnValueChange(Function1<? super String, Unit> function1) {
        this.LLJJ = function1;
    }

    public final void setPrefilledValue(String str) {
        this.LLJJIII = str;
    }

    public final void setTextHasFocus(boolean z) {
        this.LLJILLL = z;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0ucY] */
    @Override // X.C1711910ueL
    public final void LIZ(Element element, C1709570uaZ c1709570uaZ, String str, int i) {
        super.LIZ(element, c1709570uaZ, str, i);
        C1710800ucY c1710800ucY = this.LLJILJIL;
        if (c1710800ucY != null) {
            getEditText().removeTextChangedListener(c1710800ucY);
        }
        EditText editText = getEditText();
        String str2 = this.LLJJIII;
        if (str2 == null) {
            str2 = "";
        }
        editText.setText(str2);
        final EditText editText2 = getEditText();
        this.LLJILJIL = new C754920TjO(editText2) { // from class: X.0ucY
            @Override // X.C754920TjO, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                this.LLILZIL.getAfterTextChanged().invoke(C2204961BRm.LLJILLL(this.LLILZIL.getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CA3zMRkEGe2F3/FRz8DHtueHA4i57+swHAT/GA9lW1CFXaxMPvdCxUtjXO17fYhNg=", null)).toString());
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                this.LLILZIL.getOnValueChange().invoke(C2204961BRm.LLJILLL(this.LLILZIL.getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CA3zMRkEGe2F3/FRz8DHtueHA4i57+swHAT/GA9lW1CFXaxMPvdCxUtjXO17fYhNg=", null)).toString());
            }
        };
        getEditText().addTextChangedListener(this.LLJILJIL);
        getEditText().setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775810wJP(this, new C1710380ubs(str, "date", "ccdc_card_info", "ccdc"), 2));
        setTitleViewTracker(AFwS268S0000000_26.get$arr$(554));
    }
}

package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.RadioGroup;
import com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton$SavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18yR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21458918yR extends C21412018qs {
    public boolean LLILZIL;
    public final List<InterfaceC21459018yS> LLILZLL;

    @Override // android.widget.RadioButton, android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        Iterator it2 = ((ArrayList) this.LLILZLL).iterator();
        while (it2.hasNext()) {
            if (!((InterfaceC21459018yS) it2.next()).LIZ(this)) {
                return;
            }
        }
        if (this.LLILZIL) {
            setChecked(!isChecked());
            getId();
            ViewParent parent = getParent();
            if (isChecked() || !(parent instanceof RadioGroup)) {
                return;
            }
            ((RadioGroup) getParent()).clearCheck();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        CanCancelRadioButton$SavedState canCancelRadioButton$SavedState = new CanCancelRadioButton$SavedState(super.onSaveInstanceState());
        canCancelRadioButton$SavedState.LL = this.LLILZIL;
        return canCancelRadioButton$SavedState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        CanCancelRadioButton$SavedState canCancelRadioButton$SavedState = (CanCancelRadioButton$SavedState) parcelable;
        super.onRestoreInstanceState(canCancelRadioButton$SavedState.getSuperState());
        setCanChecked(canCancelRadioButton$SavedState.LL);
    }

    public void setCanChecked(boolean z) {
        this.LLILZIL = z;
    }

    public C21458918yR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = true;
        this.LLILZLL = new ArrayList();
        setTypeface(C1697580uHE.LIZ(400, 17.0f, 0.0f, Float.valueOf(16.0f)));
    }
}

package X;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.18pK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21402418pK {
    public final TextView LIZ;
    public final C21402318pJ LIZIZ;

    public C21402418pK(TextView textView) {
        this.LIZ = textView;
        this.LIZIZ = new C21402318pJ(textView);
    }

    public final InputFilter[] LIZ(InputFilter[] inputFilterArr) {
        return this.LIZIZ.LIZ.LIZ(inputFilterArr);
    }

    public final void LIZJ(boolean z) {
        this.LIZIZ.LIZ.LIZJ(z);
    }

    public final void LIZLLL(boolean z) {
        this.LIZIZ.LIZ.LIZLLL(z);
    }

    public final void LIZIZ(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.LIZ.getContext().obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i, 0);
        try {
            boolean z = true;
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.AppCompatTextView_emojiCompatEnabled)) {
                z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AppCompatTextView_emojiCompatEnabled, true);
            }
            typedArrayObtainStyledAttributes.recycle();
            LIZLLL(z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}

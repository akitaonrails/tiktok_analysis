package X;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.e;

/* JADX INFO: renamed from: X.18pJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21402318pJ {
    public final C21402218pI LIZ;

    public C21402318pJ(final TextView textView) {
        C08IF.LIZLLL(textView, "textView cannot be null");
        this.LIZ = new C21402218pI(textView) { // from class: X.18pH
            public final C21402018pG LIZ;

            @Override // X.C21402218pI
            public final boolean LIZIZ() {
                return this.LIZ.LIZJ;
            }

            {
                this.LIZ = new C21402018pG(textView);
            }

            @Override // X.C21402218pI
            public final InputFilter[] LIZ(InputFilter[] inputFilterArr) {
                if (!e.LJ()) {
                    return inputFilterArr;
                }
                return this.LIZ.LIZ(inputFilterArr);
            }

            @Override // X.C21402218pI
            public final void LIZJ(boolean z) {
                if (!e.LJ()) {
                    return;
                }
                this.LIZ.LIZJ(z);
            }

            @Override // X.C21402218pI
            public final void LIZLLL(boolean z) {
                if (!e.LJ()) {
                    this.LIZ.LIZJ = z;
                } else {
                    this.LIZ.LIZLLL(z);
                }
            }

            @Override // X.C21402218pI
            public final TransformationMethod LJ(TransformationMethod transformationMethod) {
                if (!e.LJ()) {
                    return transformationMethod;
                }
                return this.LIZ.LJ(transformationMethod);
            }
        };
    }
}

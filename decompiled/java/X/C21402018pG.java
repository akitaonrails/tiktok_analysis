package X;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.18pG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21402018pG extends C21402218pI {
    public final TextView LIZ;
    public final C21401718pD LIZIZ;
    public boolean LIZJ = true;

    @Override // X.C21402218pI
    public final boolean LIZIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.18pD] */
    public C21402018pG(final TextView textView) {
        this.LIZ = textView;
        this.LIZIZ = new InputFilter(textView) { // from class: X.18pD
            public final TextView LL;
            public C21401618pC LLILLJJLI;

            {
                this.LL = textView;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [X.18pC] */
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (this.LL.isInEditMode()) {
                    return charSequence;
                }
                int iLIZJ = e.LIZ().LIZJ();
                if (iLIZJ != 0) {
                    if (iLIZJ != 1) {
                        if (iLIZJ != 3) {
                            return charSequence;
                        }
                    } else {
                        if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.LL.getText()) || charSequence == null) {
                            return charSequence;
                        }
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return e.LIZ().LJIIIIZZ(0, charSequence.length(), charSequence, 0);
                    }
                }
                e eVarLIZ = e.LIZ();
                if (this.LLILLJJLI == null) {
                    this.LLILLJJLI = new AbstractC20101313kx(this.LL, this) { // from class: X.18pC
                        public final Reference<TextView> LIZ;
                        public final Reference<C21401718pD> LIZIZ;

                        @Override // X.AbstractC20101313kx
                        public final void LIZIZ() {
                            InputFilter[] filters;
                            CharSequence text;
                            CharSequence charSequenceLJIIIZ;
                            TextView textView2 = this.LIZ.get();
                            C21401718pD c21401718pD = this.LIZIZ.get();
                            if (c21401718pD == null || textView2 == null || (filters = textView2.getFilters()) == null) {
                                return;
                            }
                            for (InputFilter inputFilter : filters) {
                                if (inputFilter == c21401718pD) {
                                    if (!textView2.isAttachedToWindow() || text == (charSequenceLJIIIZ = e.LIZ().LJIIIZ((text = textView2.getText())))) {
                                        return;
                                    }
                                    int selectionStart = Selection.getSelectionStart(charSequenceLJIIIZ);
                                    int selectionEnd = Selection.getSelectionEnd(charSequenceLJIIIZ);
                                    textView2.setText(charSequenceLJIIIZ);
                                    if (charSequenceLJIIIZ instanceof Spannable) {
                                        Spannable spannable = (Spannable) charSequenceLJIIIZ;
                                        if (selectionStart < 0) {
                                            if (selectionEnd >= 0) {
                                                Selection.setSelection(spannable, selectionEnd);
                                                return;
                                            }
                                            return;
                                        } else if (selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                                            return;
                                        } else {
                                            Selection.setSelection(spannable, selectionStart);
                                            return;
                                        }
                                    }
                                    return;
                                }
                            }
                        }

                        {
                            this.LIZ = new WeakReference(textView);
                            this.LIZIZ = new WeakReference(this);
                        }
                    };
                }
                eVarLIZ.LJIIJ(this.LLILLJJLI);
                return charSequence;
            }
        };
    }

    @Override // X.C21402218pI
    public final InputFilter[] LIZ(InputFilter[] inputFilterArr) {
        if (!this.LIZJ) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C21401718pD) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            return inputFilterArr;
        }
        int length2 = inputFilterArr.length;
        for (InputFilter inputFilter2 : inputFilterArr) {
            if (inputFilter2 == this.LIZIZ) {
                return inputFilterArr;
            }
        }
        InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
        System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
        inputFilterArr3[length2] = this.LIZIZ;
        return inputFilterArr3;
    }

    @Override // X.C21402218pI
    public final void LIZJ(boolean z) {
        if (z) {
            this.LIZ.setTransformationMethod(LJ(this.LIZ.getTransformationMethod()));
        }
    }

    @Override // X.C21402218pI
    public final void LIZLLL(boolean z) {
        this.LIZJ = z;
        this.LIZ.setTransformationMethod(LJ(this.LIZ.getTransformationMethod()));
        this.LIZ.setFilters(LIZ(this.LIZ.getFilters()));
    }

    @Override // X.C21402218pI
    public final TransformationMethod LJ(TransformationMethod transformationMethod) {
        if (this.LIZJ) {
            if (!(transformationMethod instanceof C21401918pF) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new C21401918pF(transformationMethod);
            }
            return transformationMethod;
        }
        if (transformationMethod instanceof C21401918pF) {
            return ((C21401918pF) transformationMethod).LL;
        }
        return transformationMethod;
    }
}

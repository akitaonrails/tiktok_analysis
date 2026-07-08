package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuCounterReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelCounterWidget;
import kotlin.jvm.internal.AwS109S0101000_1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04JY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JY implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void beforeTextChanged$0(C04JY c04jy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C04JY c04jy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C04JY c04jy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C04JY c04jy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C04JY c04jy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C04JY c04jy, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Throwable {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void afterTextChanged$0(C04JY c04jy, Editable editable) {
        String str;
        InterfaceViewOnFocusChangeListenerC946003ms interfaceViewOnFocusChangeListenerC946003ms = (InterfaceViewOnFocusChangeListenerC946003ms) c04jy.l0;
        if (interfaceViewOnFocusChangeListenerC946003ms != null) {
            ((EditText) c04jy.l1).getSelectionEnd();
            boolean zHasFocus = ((EditText) c04jy.l1).hasFocus();
            C945103mj c945103mj = (C945103mj) interfaceViewOnFocusChangeListenerC946003ms;
            C945403mm c945403mm = (C945403mm) c945103mj;
            String string = editable.toString();
            C138400fu c138400fuLIZ = ((C945603mo) c945403mm.LLJ).LIZ(string);
            if (!Intrinsics.LJFF(c138400fuLIZ.LIZ, string)) {
                c138400fuLIZ.LIZIZ = -1;
            }
            c945403mm.LIZLLL(c945403mm.LLILZ, new AwS580S0100000_1(c138400fuLIZ, 387));
            if (c138400fuLIZ instanceof C161600je) {
                C903803g4.LIZ.getClass();
                PaymentMethod paymentMethodLIZIZ = C903803g4.LIZIZ.LIZIZ(((C161600je) c138400fuLIZ).value().toString());
                c945403mm.LJFF(new C943703mV(paymentMethodLIZIZ, c945403mm.LLJI));
                c945403mm.LLJI = paymentMethodLIZIZ;
                if (paymentMethodLIZIZ != null) {
                    str = paymentMethodLIZIZ.iconUrl;
                } else {
                    str = null;
                }
                c945403mm.LIZIZ(c945403mm.LLILZ, new AwS52S1000000_1(str, 29));
            }
            c945403mm.LL.setValue(0);
            if (Intrinsics.LJFF(string, c138400fuLIZ.LIZ) && ((Number) C0BA8.LIZ.getValue()).intValue() == 2) {
                new AwS580S0100000_1(c945403mm, 493).invoke(c945403mm.LLILZ.LIZ);
            }
            c945103mj.LIZIZ(c945103mj.LLILZ, new AwS16S0010000_1(zHasFocus, 16));
        }
    }

    public static final void afterTextChanged$1(C04JY c04jy, Editable editable) throws Throwable {
        String string;
        int iIntValue;
        ((SkuPanelCounterWidget) c04jy.l0).LJII().LLJJJJLIIL = ((SkuPanelCounterWidget) c04jy.l0).LJII().hf();
        if (!((EditText) c04jy.l1).isFocused()) {
            return;
        }
        ((SkuPanelCounterWidget) c04jy.l0).LLJJI++;
        if (editable != null) {
            string = editable.toString();
        } else {
            string = null;
        }
        int length = 0;
        if (string != null && string.length() != 0) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(string);
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            SkuPanelCounterWidget skuPanelCounterWidget = (SkuPanelCounterWidget) c04jy.l0;
            skuPanelCounterWidget.withState(skuPanelCounterWidget.LJII(), new AwS109S0101000_1(iIntValue, (SkuPanelCounterWidget) c04jy.l0, 2));
            EditText editText = (EditText) c04jy.l1;
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LATlr0v2Khs74snINyJPPe4Oz0CzdNdG7y2bnfoOPzfnkzycQ==", null));
            if (editableLLJILLL != null) {
                length = editableLLJILLL.length();
            }
            editText.setSelection(length);
            return;
        }
        ((SkuPanelCounterWidget) c04jy.l0).LJII().Fl(0, new C044L(true, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void afterTextChanged$2(C04JY c04jy, Editable editable) throws Throwable {
        String string;
        int iIntValue;
        ((SkuPanelBaseReusedAssem) ((C044M) c04jy.l0)).getViewModel().LLJL = ((SkuPanelBaseReusedAssem) ((C044M) c04jy.l0)).getViewModel().hf();
        if (!((SkuCounterReusedAssem) ((C044M) c04jy.l0)).Bp().isFocused()) {
            return;
        }
        ((SkuCounterReusedAssem) ((C044M) c04jy.l0)).LLJZIJLIL++;
        if (editable != null) {
            string = editable.toString();
        } else {
            string = null;
        }
        int length = 0;
        if (string != null && string.length() != 0) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(string);
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = 0;
            }
            C044M c044m = (C044M) c04jy.l0;
            C736680Sv4.LJIJJ(((SkuPanelBaseReusedAssem) c044m).getViewModel(), new AwS109S0101000_1(iIntValue, c044m, 5));
            EditText editText = (EditText) c04jy.l1;
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LATlr0r1K0lrfvMGj7bE74A3MbN3g8RTHMa6Jw=", null));
            if (editableLLJILLL != null) {
                length = editableLLJILLL.length();
            }
            editText.setSelection(length);
            return;
        }
        ((SkuPanelBaseReusedAssem) ((C044M) c04jy.l0)).getViewModel().Fl(0, new C044L(true, false));
    }

    public C04JY(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}

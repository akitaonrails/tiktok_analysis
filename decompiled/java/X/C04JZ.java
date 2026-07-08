package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.counter.SeaSkuCounterCell;

/* JADX INFO: renamed from: X.04JZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JZ implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$0(C04JZ c04jz, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C04JZ c04jz, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C04JZ c04jz, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C04JZ c04jz, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C04JZ c04jz, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C04JZ c04jz, CharSequence charSequence, int i, int i2, int i3) {
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

    public C04JZ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C04JZ c04jz, Editable editable) throws Throwable {
        C7735030j c7735030jL5;
        String string;
        int iIntValue;
        SeaSkuCounterCell seaSkuCounterCell = (SeaSkuCounterCell) c04jz.l0;
        EditText editText = seaSkuCounterCell.LLJILJIL;
        if (editText == null || seaSkuCounterCell.LLJJI || seaSkuCounterCell.LLJJIII || !editText.isFocused() || (c7735030jL5 = ((SeaSkuCounterCell) c04jz.l0).L5()) == null) {
            return;
        }
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
            if (iIntValue > c7735030jL5.LIZIZ) {
                ((SeaSkuCounterCell) c04jz.l0).P5(c7735030jL5);
                SeaSkuCounterCell seaSkuCounterCell2 = (SeaSkuCounterCell) c04jz.l0;
                int i = c7735030jL5.LIZIZ;
                seaSkuCounterCell2.LLJJIJIIJIL = i;
                seaSkuCounterCell2.U5(String.valueOf(i));
            } else {
                ((SeaSkuCounterCell) c04jz.l0).LLJJIJIIJIL = iIntValue;
            }
            EditText editText2 = ((SeaSkuCounterCell) c04jz.l0).LLJILJIL;
            if (editText2 == null) {
                return;
            }
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LATlr0v2KgsoZVe3BNsdmL048/41rHcPJpfvFAuDOqfhKm6iw==", null));
            if (editableLLJILLL != null) {
                length = editableLLJILLL.length();
            }
            editText2.setSelection(length);
            SeaSkuCounterCell seaSkuCounterCell3 = (SeaSkuCounterCell) c04jz.l0;
            seaSkuCounterCell3.T5(C13LZ.LJ(seaSkuCounterCell3.LLJJIJIIJIL, c7735030jL5.LIZ, c7735030jL5.LIZIZ), c7735030jL5);
            return;
        }
        SeaSkuCounterCell seaSkuCounterCell4 = (SeaSkuCounterCell) c04jz.l0;
        seaSkuCounterCell4.LLJJIJIIJIL = 0;
        seaSkuCounterCell4.T5(C13LZ.LJ(0, c7735030jL5.LIZ, c7735030jL5.LIZIZ), c7735030jL5);
    }

    public static final void afterTextChanged$1(C04JZ c04jz, Editable editable) {
        String string = editable.toString();
        C939603lq c939603lq = (C939603lq) c04jz.l0;
        c939603lq.LLJJI++;
        int i = 0;
        if (string.length() != 0) {
            i = CastIntegerProtector.parseInt(string);
        }
        c939603lq.LLILZLL = i;
    }

    public static final void afterTextChanged$2(C04JZ c04jz, Editable editable) {
        String string = editable.toString();
        C939703lr c939703lr = (C939703lr) c04jz.l0;
        c939703lr.LLJJ++;
        int i = 0;
        if (string.length() != 0) {
            i = CastIntegerProtector.parseInt(string);
        }
        c939703lr.LLILZIL = i;
    }
}

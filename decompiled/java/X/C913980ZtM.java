package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.assem.EditGroupNameEditTextAssem;
import com.ss.android.ugc.aweme.verify.pi.PiVerifyAssem;
import com.ss.android.ugc.aweme.verify.pi.VerifyViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AwS15S2000000_14;
import kotlin.jvm.internal.AwS65S1000000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZtM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C913980ZtM implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void beforeTextChanged$0(C913980ZtM c913980ZtM, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C913980ZtM c913980ZtM, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C913980ZtM c913980ZtM, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void afterTextChanged$0(C913980ZtM c913980ZtM, Editable editable) {
        String strValueOf = String.valueOf(editable);
        TuxIconView tuxIconView = (TuxIconView) ((C259800zU) c913980ZtM.l0).element;
        if (tuxIconView != null) {
            int i = 0;
            if (strValueOf.length() != 0) {
                i = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
        }
        VerifyViewModel verifyViewModelBp = ((PiVerifyAssem) c913980ZtM.l1).bp();
        String str = verifyViewModelBp.LLILZ;
        if (Intrinsics.LJFF(str, "##/##")) {
            verifyViewModelBp.setState(new AwS15S2000000_14(strValueOf, str, 4));
        } else {
            verifyViewModelBp.setState(new AwS65S1000000_14(strValueOf, 11));
        }
    }

    public static final void afterTextChanged$1(C913980ZtM c913980ZtM, Editable editable) {
        int i;
        CharSequence charSequenceLJLIIIL;
        View view = (View) ((EditGroupNameEditTextAssem) c913980ZtM.l0).LLJI.getValue();
        boolean z = false;
        if (editable != null && editable.length() != 0) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        C197039127h c197039127h = (C197039127h) ((EditGroupNameEditTextAssem) c913980ZtM.l0).LLJILJIL.getValue();
        if (editable == null || (charSequenceLJLIIIL = a0.LJLIIIL(editable)) == null || charSequenceLJLIIIL.length() == 0) {
            z = true;
        }
        c197039127h.setEnabled(!z);
    }

    public C913980ZtM(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final void onTextChanged$1(C913980ZtM c913980ZtM, CharSequence charSequence, int i, int i2, int i3) {
        Integer numValueOf;
        TextView textView = (TextView) ((EditGroupNameEditTextAssem) c913980ZtM.l0).LLJIJIL.getValue();
        Locale locale = Locale.US;
        String string = ((C0I7D) c913980ZtM.l1).getContext().getString(2131835242);
        Object[] objArr = new Object[2];
        Integer numValueOf2 = null;
        if (charSequence != null) {
            numValueOf = Integer.valueOf(charSequence.length());
        } else {
            numValueOf = null;
        }
        objArr[0] = Integer.valueOf(C1527905yX.LIZ(numValueOf));
        objArr[1] = 30;
        textView.setText(C786410Ut5.k4(locale, string, Arrays.copyOf(objArr, 2)));
        EditGroupNameEditTextAssem editGroupNameEditTextAssem = (EditGroupNameEditTextAssem) c913980ZtM.l0;
        if (charSequence != null) {
            numValueOf2 = Integer.valueOf(charSequence.length());
        }
        int iLIZ = C1527905yX.LIZ(numValueOf2);
        if (editGroupNameEditTextAssem.LLJJI && iLIZ < 30) {
            editGroupNameEditTextAssem.LLJJI = false;
            C786410Ut5.LJLLLLLL(8, (View) editGroupNameEditTextAssem.LLJILJILJ.getValue());
            C786410Ut5.LJLLLLLL(8, (View) editGroupNameEditTextAssem.LLJILLL.getValue());
            ((TuxTextView) editGroupNameEditTextAssem.LLJIJIL.getValue()).setTextColorRes(R.attr.a1k);
            C0I7D c0i7dGo = editGroupNameEditTextAssem.Go();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c0i7dGo.setBackground(c384050F3z.LIZ(editGroupNameEditTextAssem.Go().getContext()));
        }
    }
}

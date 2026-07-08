package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.ss.android.ugc.aweme.AnchorSearchFragment;
import com.ss.android.ugc.tools.utils.KeyboardUtils;

/* JADX INFO: renamed from: X.12YA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YA implements TextView.OnEditorActionListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$t) {
            case 0:
                return onEditorAction$0(this, textView, i, keyEvent);
            case 1:
                return onEditorAction$1(this, textView, i, keyEvent);
            case 2:
                return onEditorAction$2(this, textView, i, keyEvent);
            case 3:
                return onEditorAction$3(this, textView, i, keyEvent);
            default:
                return false;
        }
    }

    public C12YA(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onEditorAction$0(C12YA c12ya, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3 && i != 4 && (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        ((AnchorSearchFragment) c12ya.l0).ZR();
        return true;
    }

    public static final boolean onEditorAction$1(C12YA c12ya, TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        Integer numValueOf;
        if (((C11BJ) c12ya.l0).LLILLJJLI != EnumC19360310oj.LLILLJJLI) {
            return false;
        }
        if (i == 6) {
            z = true;
        } else {
            z = false;
        }
        if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[CheckoutUnifiedStepperView] [stepper.input.editor_action] actionId=");
        sbLIZ.append(i);
        sbLIZ.append(" keyCode=");
        if (keyEvent != null) {
            numValueOf = Integer.valueOf(keyEvent.getKeyCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        ((C11BJ) c12ya.l0).LJ();
        return true;
    }

    public static final boolean onEditorAction$2(C12YA c12ya, TextView textView, int i, KeyEvent keyEvent) {
        InputMethodManager inputMethodManager;
        if (i != 4) {
            return false;
        }
        ((C19577711ih) c12ya.l0).LJFF();
        ((C19577711ih) c12ya.l0).getReplyArea().clearFocus();
        Object objH2 = C786410Ut5.H2(textView.getContext(), "input_method");
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
            inputMethodManager.hideSoftInputFromWindow(textView.getWindowToken(), 0);
        }
        return true;
    }

    public static final boolean onEditorAction$3(C12YA c12ya, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            C21285918Rt c21285918Rt = (C21285918Rt) c12ya.l0;
            Context sceneContext = c21285918Rt.getSceneContext();
            if (sceneContext != null) {
                KeyboardUtils.LIZ(sceneContext, c21285918Rt.LLLLLLL());
                return true;
            }
            return true;
        }
        return false;
    }
}

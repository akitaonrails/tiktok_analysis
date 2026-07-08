package X;

import Y.ARunnableS73S0200000_4;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0DXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340780DXo {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxSearchGenericUtils", "hideKeyboard() begin.");
        C844470XAv.LIZ.getClass();
        ((InputMethodManager) C786410Ut5.H2(C844470XAv.LIZ(), "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void LIZIZ(View view) {
        View view2;
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            HandlerHook.viewPost(view2, new ARunnableS73S0200000_4(view, view2, 2));
        }
    }

    public static void LIZJ(EditText editText) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxSearchGenericUtils", "showKeyboard");
        if (editText.getParent() == null) {
            return;
        }
        editText.requestFocus();
        C844470XAv.LIZ.getClass();
        ((InputMethodManager) C786410Ut5.H2(C844470XAv.LIZ(), "input_method")).showSoftInput(editText, 1);
    }
}

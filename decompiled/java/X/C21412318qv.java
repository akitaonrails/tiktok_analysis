package X;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: X.18qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21412318qv {
    public static void LIZ(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof InterfaceC21412818r0) {
                    editorInfo.hintText = ((InterfaceC21412818r0) parent).LIZIZ();
                    return;
                }
            }
        }
    }
}

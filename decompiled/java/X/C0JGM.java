package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Stack;

/* JADX INFO: renamed from: X.0JGM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JGM implements C0IR4 {
    public final /* synthetic */ int LIZ;

    public C0JGM(int i) {
        this.LIZ = i;
    }

    @Override // X.C0IR4
    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        Stack stack = (Stack) ((LinkedHashMap) C0JGL.LIZIZ).get(Integer.valueOf(this.LIZ));
        if (stack != null) {
            stack.push(view);
        }
    }
}

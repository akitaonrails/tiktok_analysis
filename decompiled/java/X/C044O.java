package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.044O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C044O {
    public static final C1163430gNh LIZ = new C1163430gNh(new InterfaceC201986141o() { // from class: X.044P
        @Override // X.InterfaceC201986141o
        public final void LIZ(Context context, int i, View view, Function1 function1) {
            ViewGroup viewGroup;
            C03XA c03xa = C03XA.LIZ;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            c03xa.getClass();
            function1.invoke(C03XA.LIZJ(context, i, viewGroup, false));
        }
    });
}

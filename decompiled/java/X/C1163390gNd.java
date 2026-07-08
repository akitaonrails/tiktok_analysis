package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163390gNd {
    public static final C1163430gNh LIZ = C1163420gNg.LIZ(new InterfaceC201986141o() { // from class: X.0gNc
        @Override // X.InterfaceC201986141o
        public final void LIZ(Context context, int i, View view, Function1 function1) {
            ViewGroup viewGroup;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            function1.invoke(C21146717pB.LIZIZ(context, i, viewGroup, false));
        }
    });
}

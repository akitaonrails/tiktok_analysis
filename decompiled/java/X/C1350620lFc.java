package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350620lFc {
    public static final C1163430gNh LIZ = C1163420gNg.LIZ(new InterfaceC201986141o() { // from class: X.0lFb
        @Override // X.InterfaceC201986141o
        public final void LIZ(Context context, int i, View view, Function1 function1) {
            ViewGroup viewGroup;
            if (!C295780Bia.LIZIZ) {
                context = C1354730lMF.LIZIZ(context);
            }
            C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
            Context contextLJ = C1356320lOo.LJ(i, context);
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            function1.invoke(C21146717pB.LIZIZ(contextLJ, i, viewGroup, false));
        }
    });
}

package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0goy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180340goy implements InterfaceC201986141o {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new C1181430gqj();
    }

    @Override // X.InterfaceC201986141o
    public final void LIZ(Context context, int i, View view, Function1 function1) {
        ViewGroup viewGroup;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        function1.invoke(C1181430gqj.LIZIZ(context, i, viewGroup, false));
    }
}

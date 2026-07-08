package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PrP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C657970PrP implements InterfaceC201986141o {
    public static final C1163430gNh LIZ = C1163420gNg.LIZ(new C657970PrP());

    @Override // X.InterfaceC201986141o
    public final void LIZ(Context context, int i, View view, Function1 function1) {
        if ((view instanceof ViewGroup) && view != null) {
            C650520PfO.LIZ.getClass();
            function1.invoke(C650520PfO.LIZ(i, (ViewGroup) view));
        }
    }
}

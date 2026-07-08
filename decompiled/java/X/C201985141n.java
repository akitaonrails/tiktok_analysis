package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.141n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201985141n implements InterfaceC201986141o {
    public static final C201985141n LIZ = new C201985141n();

    @Override // X.InterfaceC201986141o
    public final void LIZ(Context context, int i, View view, Function1 function1) {
        ViewGroup viewGroup;
        C01GW c01gw = C954703oH.LIZ;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        function1.invoke(C954703oH.LIZ(context, i, viewGroup, false));
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15tW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20664015tW extends C2217421BqW implements Function0<Unit> {
    public C20664015tW(Object obj) {
        super(0, obj, C20663915tV.class, "callAfterAnimation", "callAfterAnimation()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ViewGroup viewGroup;
        C20663915tV c20663915tV = (C20663915tV) this.receiver;
        PopupWindow.OnDismissListener onDismissListener = c20663915tV.LLILZIL;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
        View decorView = c20663915tV.LL.getWindow().getDecorView();
        if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
            if (c20663915tV.LLILLL.getParent() != null) {
                C786410Ut5.LJJJLZIJ(c20663915tV.LLILLL, viewGroup);
            }
            Function0<Unit> function0 = c20663915tV.LLILZLL;
            if (function0 != null) {
                function0.invoke();
            }
            c20663915tV.LLILZLL = null;
        }
        return Unit.LIZ;
    }
}

package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eVO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091320eVO extends C09AY implements Function1<View, Boolean> {
    public final /* synthetic */ C1822910xXN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1091320eVO(C1822910xXN c1822910xXN) {
        super(1);
        this.LL = c1822910xXN;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(View view) {
        View viewInvoke;
        boolean z;
        View view2 = view;
        Function0<View> function0 = this.LL.LLIZLLLIL;
        if (function0 != null) {
            viewInvoke = function0.invoke();
        } else {
            viewInvoke = null;
        }
        if (view2.isAttachedToWindow() && view2.isShown()) {
            if (viewInvoke != null) {
                Rect rect = new Rect();
                if (view2.getGlobalVisibleRect(rect) && !rect.isEmpty()) {
                    Rect rect2 = new Rect();
                    if (viewInvoke.getGlobalVisibleRect(rect2) && !rect2.isEmpty()) {
                        if (new Rect(rect).intersect(rect2)) {
                            if ((r2 - (r3.width() * r3.height())) / (rect.width() * rect.height()) >= 0.5f) {
                            }
                        }
                    }
                }
                z = false;
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

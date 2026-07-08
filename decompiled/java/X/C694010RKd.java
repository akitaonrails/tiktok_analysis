package X;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694010RKd implements Function0<View> {
    public final Function0<View> LL;
    public View LLILLJJLI;

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        View view = this.LLILLJJLI;
        if (view != null) {
            return view;
        }
        View viewInvoke = this.LL.invoke();
        this.LLILLJJLI = viewInvoke;
        return viewInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C694010RKd(Function0<? extends View> function0) {
        this.LL = function0;
    }
}

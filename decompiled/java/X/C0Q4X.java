package X;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Q4X, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q4X implements InterfaceC111300bX {
    public final View LL;
    public C0QER LLILLJJLI;
    public Function0<Integer> LLILLL;
    public final InterfaceC671440QVi LLILZ;
    public View LLILZIL;
    public C0Q7B LLILZLL;

    public C0Q4X() {
        this(null, null, null, 63);
    }

    public C0Q4X(C0QER c0qer, View view, C0Q7B c0q7b, int i) {
        c0qer = (i & 2) != 0 ? null : c0qer;
        view = (i & 16) != 0 ? null : view;
        c0q7b = (i & 32) != 0 ? C0Q7B.NORMAL : c0q7b;
        this.LL = null;
        this.LLILLJJLI = c0qer;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = view;
        this.LLILZLL = c0q7b;
    }
}

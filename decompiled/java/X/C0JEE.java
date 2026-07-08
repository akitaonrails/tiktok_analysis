package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JEE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JEE implements View.OnFocusChangeListener {
    public long LL;
    public long LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final Function2<Long, Long, Unit> LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C0JEE(Function0<Unit> function0, Function2<? super Long, ? super Long, Unit> function2) {
        this.LLILLL = function0;
        this.LLILZ = function2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.LL = System.currentTimeMillis();
            this.LLILLL.invoke();
        } else {
            this.LLILLJJLI = System.currentTimeMillis();
            this.LLILZ.invoke(Long.valueOf(this.LL), Long.valueOf(this.LLILLJJLI));
        }
    }
}

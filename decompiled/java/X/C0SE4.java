package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SE4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SE4 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final View LL;
    public final Function0<Unit> LLILLJJLI;
    public boolean LLILLL = true;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.LLILLL) {
            this.LLILLL = false;
            C0CNO.LIZLLL(2000L, new AwS555S0100000_11(this, 1378));
        }
        this.LLILLJJLI.invoke();
    }

    public C0SE4(TuxTextView tuxTextView, AwS555S0100000_11 awS555S0100000_11) {
        this.LL = tuxTextView;
        this.LLILLJJLI = awS555S0100000_11;
    }
}

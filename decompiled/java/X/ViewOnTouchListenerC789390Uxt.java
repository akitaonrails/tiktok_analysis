package X;

import Y.ARunnableS113S0100000_13;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Uxt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ViewOnTouchListenerC789390Uxt implements View.OnTouchListener {
    public boolean LL = true;
    public final ARunnableS113S0100000_13 LLILLJJLI = new ARunnableS113S0100000_13(this, 262);
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0 && this.LL) {
            this.LL = false;
            HandlerHook.viewPostDelay(this.LLILLL, this.LLILLJJLI, this.LLILZ);
            this.LLILZIL.invoke();
        }
        return true;
    }

    public ViewOnTouchListenerC789390Uxt(long j, TuxIconView tuxIconView, Function0 function0) {
        this.LLILLL = tuxIconView;
        this.LLILZ = j;
        this.LLILZIL = function0;
    }
}

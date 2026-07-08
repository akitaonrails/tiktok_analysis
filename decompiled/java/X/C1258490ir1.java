package X;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ir1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258490ir1 implements InterfaceC21676019sM {
    public final Function0<Boolean> LL;
    public final C0P6P LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final int LLILZIL;
    public float LLILZLL;

    @Override // X.InterfaceC21676019sM
    public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC21676019sM
    public final void LJIIZILJ(boolean z) {
    }

    @Override // X.InterfaceC21676019sM
    public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LLILZLL = motionEvent.getY();
            this.LLILZ = true;
        }
        if (this.LLILLL && this.LLILZ && this.LL.invoke().booleanValue() && this.LLILZLL - motionEvent.getY() > this.LLILZIL) {
            C0P6P c0p6p = this.LLILLJJLI;
            if (c0p6p != null) {
                c0p6p.LJJIFFI();
            }
            this.LLILLL = false;
            this.LLILZ = false;
        }
        return false;
    }

    public C1258490ir1(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C484940J0a c484940J0a, C1258500ir2 c1258500ir2) {
        this.LL = c484940J0a;
        this.LLILLJJLI = c1258500ir2;
        this.LLILZIL = ViewConfiguration.get(viewOnAttachStateChangeListenerC20604515jv.getContext()).getScaledTouchSlop();
        viewOnAttachStateChangeListenerC20604515jv.addOnItemTouchListener(this);
    }
}

package X;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Oj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C627300Oj2 implements InterfaceC21676019sM {
    public final RecyclerView LL;
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

    public C627300Oj2(RecyclerView recyclerView, C0P6P c0p6p) {
        this.LL = recyclerView;
        this.LLILLJJLI = c0p6p;
        this.LLILZIL = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        recyclerView.addOnItemTouchListener(this);
    }

    @Override // X.InterfaceC21676019sM
    public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LLILZLL = motionEvent.getY();
            this.LLILZ = true;
        }
        RecyclerView recyclerView2 = this.LL;
        if (recyclerView2 != null && this.LLILLL && this.LLILZ && !recyclerView2.canScrollVertically(1) && this.LLILZLL - motionEvent.getY() > this.LLILZIL) {
            C0P6P c0p6p = this.LLILLJJLI;
            if (c0p6p != null) {
                c0p6p.LJJIFFI();
            }
            this.LLILLL = false;
            this.LLILZ = false;
        }
        return false;
    }
}

package X;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.10xG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19413210xG implements InterfaceC21676019sM {
    public final RecyclerView LL;
    public final InterfaceC19413110xF LLILLJJLI;
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

    public C19413210xG(RecyclerView recyclerView, C194324110w c194324110w) {
        this.LL = recyclerView;
        this.LLILLJJLI = c194324110w;
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
            InterfaceC19413110xF interfaceC19413110xF = this.LLILLJJLI;
            if (interfaceC19413110xF != null) {
                interfaceC19413110xF.LJJIFFI();
            }
            this.LLILLL = false;
            this.LLILZ = false;
        }
        return false;
    }
}

package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.11D1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11D1 implements InterfaceC21676019sM {
    public final C19461911Cf LL;
    public float LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public volatile boolean LLIZLLLIL;
    public final C11D6 LLILLJJLI = new C11D6(0);
    public boolean LLILZLL = true;
    public final AtomicBoolean LLIZ = new AtomicBoolean(false);

    @Override // X.InterfaceC21676019sM
    public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC21676019sM
    public final void LJIIZILJ(boolean z) {
    }

    public C11D1(C19461911Cf c19461911Cf) {
        this.LL = c19461911Cf;
    }

    @Override // X.InterfaceC21676019sM
    public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean zCanScrollHorizontally;
        if (motionEvent.getAction() == 0) {
            this.LLILLL = motionEvent.getY();
            this.LLILZ = true;
        }
        RecyclerView recyclerView2 = this.LLILLJJLI.LLILLL;
        if (recyclerView2 != null && this.LLIZLLLIL && this.LLILZ && this.LLILLL - motionEvent.getY() > this.LLILZIL) {
            if (this.LLILZLL) {
                zCanScrollHorizontally = recyclerView2.canScrollVertically(1);
            } else {
                zCanScrollHorizontally = recyclerView2.canScrollHorizontally(1);
            }
            if (!zCanScrollHorizontally) {
                C19461911Cf c19461911Cf = this.LL;
                if (c19461911Cf.LJIIIIZZ == 244) {
                    c19461911Cf.LJFF(244);
                } else {
                    c19461911Cf.LJFF(241);
                }
                this.LLIZLLLIL = false;
                this.LLILZ = false;
            }
        }
        return false;
    }
}

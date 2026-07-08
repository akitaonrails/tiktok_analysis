package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0UpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C784210UpX implements InterfaceC21676019sM {
    public final GestureDetector LL;
    public final InterfaceC773360UVi LLILLJJLI;

    @Override // X.InterfaceC21676019sM
    public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC21676019sM
    public final void LJIIZILJ(boolean z) {
    }

    @Override // X.InterfaceC21676019sM
    public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.LL.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public C784210UpX(Context context, final C784250Upb c784250Upb, C0UTZ c0utz) {
        this.LLILLJJLI = c0utz;
        this.LL = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: X.0Upa
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                View viewFindChildViewUnder;
                InterfaceC773360UVi interfaceC773360UVi;
                RecyclerView recyclerView = c784250Upb;
                if (recyclerView == null || (viewFindChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null || (interfaceC773360UVi = this.LLILLJJLI.LLILLJJLI) == null) {
                    return false;
                }
                interfaceC773360UVi.LIZ(c784250Upb.getChildLayoutPosition(viewFindChildViewUnder) - 1);
                return true;
            }
        });
    }
}

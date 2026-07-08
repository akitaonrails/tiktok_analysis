package X;

import Y.AsS15S0110000_5;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0F5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384320F5a {
    public final C0F5K LIZ;
    public final C0F5L LIZIZ;
    public boolean LIZJ;
    public AnonymousClass0956 LIZLLL;
    public boolean LJ;
    public final AsS15S0110000_5 LJFF = new AsS15S0110000_5(this, 1);
    public final C384360F5e LJI = new InterfaceC21676019sM() { // from class: X.0F5e
        @Override // X.InterfaceC21676019sM
        public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // X.InterfaceC21676019sM
        public final void LJIIZILJ(boolean z) {
        }

        @Override // X.InterfaceC21676019sM
        public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                this.LL.LIZJ = false;
            } else {
                C384320F5a c384320F5a = this.LL;
                if (!c384320F5a.LIZJ) {
                    c384320F5a.LIZJ = true;
                    return false;
                }
            }
            return false;
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0F5e] */
    public C384320F5a(C0F5K c0f5k, C0F5L c0f5l) {
        this.LIZ = c0f5k;
        this.LIZIZ = c0f5l;
    }
}

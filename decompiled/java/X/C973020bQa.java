package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973020bQa extends C0J8P<C960780b6q, C973030bQb> {
    public final InterfaceC973040bQc LIZIZ;

    public C973020bQa(InterfaceC973040bQc interfaceC973040bQc) {
        this.LIZIZ = interfaceC973040bQc;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @Override // X.C0J8P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(androidx.recyclerview.widget.RecyclerView.ViewHolder r5, X.C960780b6q r6) {
        /*
            r4 = this;
            X.0bQb r5 = (X.C973030bQb) r5
            X.01GW r0 = r5.LL
            java.lang.Object r3 = r0.getValue()
            X.16F5 r3 = (X.C16F5) r3
            Y.ACListenerS150S0100000_15 r2 = new Y.ACListenerS150S0100000_15
            X.0bQa r1 = r5.LLILLL
            r0 = 226(0xe2, float:3.17E-43)
            r2.<init>(r1, r0)
            X.C786410Ut5.l8(r3, r2)
            X.01GW r0 = r5.LLILLJJLI
            java.lang.Object r2 = r0.getValue()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.14i1<java.util.List<java.lang.String>> r1 = X.InterfaceC960800b6s.LLLLJI
            java.lang.Object r0 = r1.LIZIZ()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r1.LIZIZ()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L37
            int r0 = r0.size()
            if (r0 != 0) goto L37
        L35:
            r1 = 8
        L37:
            X.C786410Ut5.LJLZ(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973020bQa.LIZJ(androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object):void");
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C973030bQb(this, C786410Ut5.Td(layoutInflater, R.layout.gh5, viewGroup, false));
    }
}

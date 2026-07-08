package X;

import Y.AsS56S0100000_31;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: X.15X8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15X8 extends AbstractC1847360yAo {
    public final RecyclerView LIZIZ;
    public final View LIZJ;
    public boolean LIZLLL;
    public final AsS56S0100000_31 LJ = new AsS56S0100000_31(this, 11);

    @Override // X.C05PU
    public final String getId() {
        return "TakoHighLightChatListAnim";
    }

    @Override // X.C05PU
    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.LJ);
        }
        Object objLIZJ = LIZJ(interfaceC1364105Vn);
        if (objLIZJ == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15X8.LIZJ(X.05Vn):java.lang.Object");
    }

    public C15X8(RecyclerView recyclerView, View view) {
        this.LIZIZ = recyclerView;
        this.LIZJ = view;
    }
}

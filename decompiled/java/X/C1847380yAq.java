package X;

import Y.AsS53S0100000_27;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0yAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847380yAq extends AbstractC1847360yAo {
    public final RecyclerView LIZIZ;
    public final int LIZJ;
    public final Pair<Integer, Integer> LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final Pair<Integer, Integer> LJI;
    public final AsS53S0100000_27 LJII;

    @Override // X.C05PU
    public final String getId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoHighLightVideoListAnim");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C05PU
    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        this.LIZIZ.addOnScrollListener(this.LJII);
        Object objLIZLLL = LIZLLL(interfaceC1364105Vn);
        if (objLIZLLL == C099R.LJFF()) {
            return objLIZLLL;
        }
        return Unit.LIZ;
    }

    public final Pair<Integer, Integer> LIZJ(View view) {
        if (C426750GoL.LJ(this.LIZIZ)) {
            return new Pair<>(Integer.valueOf(view.getRight()), Integer.valueOf(view.getLeft()));
        }
        return new Pair<>(Integer.valueOf(view.getLeft()), Integer.valueOf(view.getRight()));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1847380yAq.LIZLLL(X.05Vn):java.lang.Object");
    }

    public C1847380yAq(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, int i, View view, Integer num, Pair pair) {
        int i2;
        this.LIZIZ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZJ = i;
        this.LIZLLL = pair;
        Pair<Integer, Integer> pair2 = null;
        if (view != null) {
            Integer numValueOf = Integer.valueOf(view.getWidth());
            if (num != null) {
                if (viewOnAttachStateChangeListenerC20604515jv.getLayoutDirection() == 1) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                int iIntValue = i - num.intValue();
                this.LJFF = iIntValue < 0;
                int iIntValue2 = iIntValue * (((Number) pair.getFirst()).intValue() + ((Number) pair.getSecond()).intValue() + (numValueOf != null ? numValueOf.intValue() : 0)) * i2;
                pair2 = new Pair<>(Integer.valueOf(view.getLeft() + iIntValue2), Integer.valueOf(iIntValue2 + view.getRight()));
            }
        }
        this.LJI = pair2;
        this.LJII = new AsS53S0100000_27(this, 7);
    }
}

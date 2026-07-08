package X;

import com.bytedance.als.h0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nDN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426110nDN {
    public static final /* synthetic */ int LIZIZ = 0;
    public final h0<Pair<Integer, Integer>> LIZ = new h0<>(new Pair(0, 0));

    public final int LIZ() {
        return this.LIZ.LIZJ().getSecond().intValue();
    }

    public final boolean LIZIZ(int i) {
        if ((LIZ() & i) == i) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(int i) {
        if (LIZ() != i && C13LQ.LJLIIL(new Integer[]{0, 1, 2, 3, 4, 8}).contains(Integer.valueOf(i))) {
            this.LIZ.LJII(new Pair<>(Integer.valueOf(LIZ()), Integer.valueOf(i)));
        }
    }

    public final void LIZJ(int i, Function1<? super Integer, Boolean> function1) {
        if (function1.invoke(Integer.valueOf(LIZ())).booleanValue()) {
            LIZLLL(i | LIZ());
        } else {
            LIZLLL((~i) & LIZ());
        }
    }
}

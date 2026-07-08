package X;

import android.os.Handler;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.187F, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C187F {
    public final C187G LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(144));
    public C187D LIZJ;

    public final void LIZ() {
        C187D c187d = this.LIZJ;
        if (c187d != null) {
            ((Handler) this.LIZIZ.getValue()).removeCallbacks(c187d);
        }
        this.LIZJ = null;
    }

    public C187F(C187G c187g) {
        this.LIZ = c187g;
    }
}

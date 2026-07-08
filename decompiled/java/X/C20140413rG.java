package X;

import Y.ARunnableS41S0101000_30;
import Y.ARunnableS99S0200000_30;
import android.graphics.Typeface;
import android.os.Handler;

/* JADX INFO: renamed from: X.13rG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20140413rG {
    public final C20140913rL LIZ;
    public final Handler LIZIZ;

    public final void LIZ(C20140013rC c20140013rC) {
        int i = c20140013rC.LIZIZ;
        if (i == 0) {
            Typeface typeface = c20140013rC.LIZ;
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS99S0200000_30(this.LIZ, typeface, 19));
        } else {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS41S0101000_30(this.LIZ, i, 2));
        }
    }

    public C20140413rG(C20140713rJ c20140713rJ, Handler handler) {
        this.LIZ = c20140713rJ;
        this.LIZIZ = handler;
    }
}

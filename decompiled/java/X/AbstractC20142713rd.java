package X;

import Y.ARunnableS41S0101000_30;
import Y.ARunnableS99S0200000_30;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: X.13rd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20142713rd {
    public abstract void LIZJ(int i);

    public abstract void LIZLLL(Typeface typeface);

    public final void LIZ(int i) {
        C786410Ut5.LJJZZIII(new Handler(Looper.getMainLooper()), new ARunnableS41S0101000_30(this, i, 1));
    }

    public final void LIZIZ(Typeface typeface) {
        C786410Ut5.LJJZZIII(new Handler(Looper.getMainLooper()), new ARunnableS99S0200000_30(this, typeface, 8));
    }
}

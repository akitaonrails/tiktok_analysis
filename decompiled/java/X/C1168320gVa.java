package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1168320gVa {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;

    public static final boolean LIZIZ() {
        return Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper());
    }

    public static void LIZ(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = (int) ((displayMetrics.heightPixels / context.getResources().getDisplayMetrics().density) + 0.5f);
        int i2 = (int) ((displayMetrics.widthPixels / context.getResources().getDisplayMetrics().density) + 0.5f);
        if (i > i2) {
            LIZLLL = i;
            LIZJ = i2;
        } else {
            LIZLLL = i2;
            LIZJ = i;
        }
    }

    public static final void LIZJ(Function0<Unit> function0) {
        C786410Ut5.LJJZZIII(LIZ, new ARunnableS116S0100000_16(function0, (Function0<Unit>) 163));
    }
}

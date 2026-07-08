package X;

import Y.ARunnableS120S0100000_20;
import android.os.Looper;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296260jpw {
    public static final void LIZ(C1295960jpS c1295960jpS) {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            HandlerHook.viewPost(c1295960jpS, new ARunnableS120S0100000_20(c1295960jpS, 257));
            return;
        }
        AwS564S0100000_20 awS564S0100000_20 = new AwS564S0100000_20(c1295960jpS, 37);
        if (c1295960jpS.isAttachedToWindow() && c1295960jpS.getWidth() != 0 && c1295960jpS.getHeight() != 0) {
            awS564S0100000_20.invoke();
        } else {
            HandlerHook.viewPost(c1295960jpS, new ARunnableS120S0100000_20(awS564S0100000_20, 258));
        }
    }
}

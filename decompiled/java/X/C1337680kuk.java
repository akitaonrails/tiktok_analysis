package X;

import android.graphics.drawable.Animatable;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0kuk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337680kuk {
    public static boolean LIZIZ;
    public static final WeakHashMap<SmartImageView, int[]> LIZ = new WeakHashMap<>();
    public static final WeakHashMap<SmartImageView, Boolean> LIZJ = new WeakHashMap<>();
    public static final WeakHashMap<SmartImageView, Runnable> LIZLLL = new WeakHashMap<>();
    public static final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());

    public static final void LIZ(C424580Gkq c424580Gkq, Animatable animatable) {
        AnimatedDrawable2 animatedDrawable2;
        if (c424580Gkq == null) {
            return;
        }
        C01GW c01gw = C294420BgO.LIZ;
        if ((((Number) c01gw.getValue()).intValue() & 2) != 0 && (animatable instanceof AnimatedDrawable2) && (animatedDrawable2 = (AnimatedDrawable2) animatable) != null) {
            WeakHashMap<SmartImageView, int[]> weakHashMap = LIZ;
            int[] iArr = weakHashMap.get(c424580Gkq);
            if (iArr == null) {
                iArr = new int[1];
                weakHashMap.put(c424580Gkq, iArr);
            }
            final int[] iArr2 = iArr;
            iArr2[0] = 0;
            animatedDrawable2.LJII(new C0I9J() { // from class: X.0kuj
                @Override // X.C0I9J, X.InterfaceC1331000kjy
                public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                    if (C1337680kuk.LIZIZ) {
                        animatedDrawable22.stop();
                        animatedDrawable22.LJ(0);
                        iArr2[0] = 0;
                    }
                }

                @Override // X.C0I9J, X.InterfaceC1331000kjy
                public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                    iArr2[0] = i;
                }
            });
        }
        if ((((Number) c01gw.getValue()).intValue() & 4) != 0) {
            WeakHashMap<SmartImageView, Boolean> weakHashMap2 = LIZJ;
            if (!weakHashMap2.containsKey(c424580Gkq)) {
                c424580Gkq.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1339220kxE(1));
                weakHashMap2.put(c424580Gkq, Boolean.TRUE);
            }
            Runnable runnableRemove = LIZLLL.remove(c424580Gkq);
            if (runnableRemove != null) {
                LJ.removeCallbacks(runnableRemove);
            }
        }
    }
}

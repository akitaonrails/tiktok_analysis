package X;

import Y.ARunnableS86S0200000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0eM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085590eM9 {
    public final DataChannel LIZ;
    public ViewGroup LIZIZ;
    public Context LIZJ;
    public C1085630eMD<C1126540fQC> LJFF;
    public boolean LJI;
    public Animator LJII;
    public final List<AnimatorSet> LIZLLL = new ArrayList();
    public final C11NJ LJ = new C11NJ();
    public long LJIIIIZZ = -1;

    public C1085590eM9(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZ(C1126540fQC c1126540fQC) {
        ViewGroup viewGroup = this.LIZIZ;
        if (viewGroup != null) {
            HandlerHook.viewPost(viewGroup, new ARunnableS86S0200000_17(this, c1126540fQC, 82));
        }
    }
}

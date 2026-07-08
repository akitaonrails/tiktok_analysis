package X;

import Y.ARunnableS14S0400000_5;
import android.view.SurfaceView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import kotlin.jvm.internal.AwS165S0400000_5;

/* JADX INFO: renamed from: X.0E9S, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E9S {
    public static final void LIZ(C0EGB c0egb) {
        C0EHI value;
        C0ELJ c0elj;
        PairIntInt pairIntInt;
        INLEMediaRuntime mediaRuntimeApi;
        C0E48 c0e48O3 = c0egb.O3();
        if (c0e48O3 != null && (value = c0egb.o4().zu2().getValue()) != null && (c0elj = value.LJ) != null) {
            INLEMediaSession iNLEMediaSessionF1 = c0e48O3.f1();
            int width = 0;
            if (iNLEMediaSessionF1 == null || (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) == null || (pairIntInt = mediaRuntimeApi.getInitSize()) == null) {
                pairIntInt = new PairIntInt(0, 0);
            }
            AwS165S0400000_5 awS165S0400000_5 = new AwS165S0400000_5(pairIntInt, c0egb, c0elj, c0e48O3, 1);
            C118300cf c118300cf = new C118300cf();
            SurfaceView surfaceViewLJIJJLI = c0egb.D5().LJIJJLI();
            if (surfaceViewLJIJJLI != null) {
                width = surfaceViewLJIJJLI.getWidth();
            }
            c118300cf.element = width;
            C118300cf c118300cf2 = new C118300cf();
            int height = c0egb.LLILZ.Wq().getHeight();
            c118300cf2.element = height;
            int i = c118300cf.element;
            if (i != 0 && height != 0) {
                awS165S0400000_5.invoke(Integer.valueOf(i), Integer.valueOf(c118300cf2.element));
            } else {
                HandlerHook.viewPost(c0egb.LLILZ.Wq(), new ARunnableS14S0400000_5(c0egb, c118300cf, c118300cf2, awS165S0400000_5, 8));
            }
        }
    }
}

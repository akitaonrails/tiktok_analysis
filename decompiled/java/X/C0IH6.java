package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0IH6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IH6 {
    public static C464740IKi LIZ;
    public static ImageModel LIZIZ;
    public static C11JL LIZJ;
    public static LivePlayFragment LJI;
    public static LivePlayFragment LJII;
    public static C21601619gM LJIIIIZZ;
    public static volatile boolean LJIIIZ;
    public static volatile boolean LJIIJ;
    public static volatile boolean LJIIJJI;
    public static volatile boolean LJIIL;
    public static volatile boolean LJIILIIL;
    public static volatile boolean LJIILL;
    public static volatile boolean LJIILLIIL;
    public static volatile Bitmap LJIIZILJ;
    public static int LIZLLL = -1;
    public static final List<C0IH2> LJ = new ArrayList();
    public static int LJFF = -1;
    public static volatile boolean LJIILJJIL = true;

    public static void LIZIZ() {
        C21601619gM c21601619gM = LJIIIIZZ;
        if (c21601619gM != null) {
            c21601619gM.LLILLL = true;
        }
        LivePlayFragment livePlayFragment = LJI;
        if (livePlayFragment != null) {
            livePlayFragment.iS();
        }
        LivePlayFragment livePlayFragment2 = LJII;
        if (livePlayFragment2 != null) {
            livePlayFragment2.iS();
        }
        LJI = null;
        LJII = null;
        LJIIIIZZ = null;
        LJIIJ = false;
        LJIIIZ = false;
        LJIIJJI = false;
        LJIIL = false;
        LJIILIIL = false;
        LJFF = -1;
        C11JL c11jl = LIZJ;
        if (c11jl != null) {
            c11jl.dispose();
        }
        LIZIZ = null;
        LJIILJJIL = true;
        LJIILL = false;
        LJIILLIIL = false;
        if (C463850IGx.LIZJ || C463850IGx.LIZLLL) {
            C20441214yg.LJIIIZ("LiveEndMgFeedInjector", "reset: clear mg feed inject session state");
        }
        C463850IGx.LIZJ = false;
        C463850IGx.LIZLLL = false;
        RunnableC463140IEe runnableC463140IEe = C463850IGx.LJ;
        if (runnableC463140IEe != null) {
            C463850IGx.LIZIZ.removeCallbacks(runnableC463140IEe);
        }
        C463850IGx.LJ = null;
        ((ArrayList) LJ).remove(C463850IGx.LJI);
        C463850IGx.LJFF = null;
        LJIIZILJ = null;
        C464740IKi c464740IKi = LIZ;
        if (c464740IKi == null || !c464740IKi.LJIIIIZZ) {
            return;
        }
        LIZ = null;
    }

    public static void LIZJ() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        LivePlayFragment livePlayFragment = LJI;
        if (livePlayFragment != null) {
            livePlayFragment.oV(bitmapCreateBitmap);
        }
        LivePlayFragment livePlayFragment2 = LJII;
        if (livePlayFragment2 != null) {
            livePlayFragment2.oV(bitmapCreateBitmap);
        }
        C464740IKi c464740IKi = LIZ;
        if (c464740IKi != null && c464740IKi.LJIIIIZZ) {
            LJIIZILJ = bitmapCreateBitmap;
        }
        LIZ(C0III.BLUR_FRAME_BITMAP_READY);
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x032b A[PHI: r0
      0x032b: PHI (r0v94 X.11Kz) = (r0v71 X.11Kz), (r0v83 X.11Kz), (r0v96 X.11Kz) binds: [B:287:0x03dc, B:274:0x0394, B:253:0x0329] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C0III r12) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IH6.LIZ(X.0III):void");
    }
}

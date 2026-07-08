package X;

import android.app.Activity;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.10Si, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19249010Si implements C0XQU {
    public final BPEAHandler LIZ;
    public boolean LIZIZ;
    public final Activity LIZJ;

    public C19249010Si() {
        this.LIZ = new BPEAHandler(Looper.getMainLooper());
        this.LIZIZ = false;
        this.LIZJ = null;
    }

    public C19249010Si(Activity activity) {
        this.LIZ = new BPEAHandler(Looper.getMainLooper());
        this.LIZIZ = false;
        this.LIZJ = null;
        this.LIZJ = activity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r9 == 4) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // X.C0XQU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r8, int r9) {
        /*
            r7 = this;
            java.lang.Class<com.ss.android.ugc.aweme.video.IPlayerManagerService> r0 = com.ss.android.ugc.aweme.video.IPlayerManagerService.class
            java.lang.Object r6 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi(r0)
            com.ss.android.ugc.aweme.video.IPlayerManagerService r6 = (com.ss.android.ugc.aweme.video.IPlayerManagerService) r6
            r0 = 9
            r5 = 1
            if (r8 != r0) goto L32
            if (r9 != r5) goto L7f
            if (r6 == 0) goto L20
            r6.LIZIZ()
            r6.LIZ()
        L17:
            X.0SzN r0 = new X.0SzN
            r0.<init>(r5)
            X.C1440005kM.LIZ(r0)
        L1f:
            return
        L20:
            X.0OBD r0 = X.C585570Mxv.LIZ
            java.lang.ref.WeakReference<com.ss.android.ugc.playerkit.videoview.VideoViewComponent> r0 = r0.LL
            if (r0 == 0) goto L17
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = (com.ss.android.ugc.playerkit.videoview.VideoViewComponent) r0
            if (r0 == 0) goto L17
            r0.pause()
            goto L17
        L32:
            r1 = 4
            if (r8 != r5) goto L50
            r2 = 500(0x1f4, double:2.47E-321)
            if (r9 != r5) goto L5c
            if (r6 == 0) goto L17
            boolean r0 = r6.LIZJ()
            if (r0 == 0) goto L17
            com.bytedance.bpea.transmit.delegate.BPEAHandler r4 = r7.LIZ
            Y.ARunnableS109S0100000_9 r1 = new Y.ARunnableS109S0100000_9
            r0 = 225(0xe1, float:3.15E-43)
            r1.<init>(r6, r0)
            X.C786410Ut5.LJLIIL(r2, r4, r1)
            r7.LIZIZ = r5
            goto L17
        L50:
            if (r8 == r5) goto L59
            r0 = 7
            if (r8 == r0) goto L59
            r0 = 10
            if (r8 != r0) goto L7f
        L59:
            if (r9 != r1) goto L7f
            goto L6e
        L5c:
            if (r9 != r1) goto L59
            boolean r0 = r7.LIZIZ
            if (r0 == 0) goto L6e
            com.bytedance.bpea.transmit.delegate.BPEAHandler r4 = r7.LIZ
            Y.ARunnableS97S0200000_28 r1 = new Y.ARunnableS97S0200000_28
            r0 = 41
            r1.<init>(r7, r6, r0)
            X.C786410Ut5.LJLIIL(r2, r4, r1)
        L6e:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            r3.<init>()
            Y.ARunnableS91S0000000_12 r2 = new Y.ARunnableS91S0000000_12
            r0 = 4
            r2.<init>(r0)
            r0 = 200(0xc8, double:9.9E-322)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
            return
        L7f:
            if (r9 != r5) goto L1f
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19249010Si.LIZ(int, int):void");
    }
}

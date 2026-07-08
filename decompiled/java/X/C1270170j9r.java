package X;

import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.Surface;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0j9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1270170j9r extends AbstractC1268600j7K implements InterfaceC1270400jAE {
    public final Intent LLILZLL;
    public final InterfaceC1270200j9u LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public VirtualDisplay LLJIJIL;
    public SurfaceTextureHelper LLJILJIL;
    public MediaProjection LLJILJILJ;
    public boolean LLJILLL;
    public MediaProjectionManager LLJJ;
    public int LLJJIJI;
    public long LLJJIJIIJIL;
    public Context LLJJIJIL;
    public volatile int LLJJJ;
    public int LLJJJIL;
    public final boolean LLJJJJ;
    public C1269250j8N LLJJJJJIL;
    public final C1270160j9q LLIZ = new MediaProjection.Callback() { // from class: X.0j9q
        @Override // android.media.projection.MediaProjection.Callback
        public final void onStop() {
            InterfaceC1270200j9u interfaceC1270200j9u = this.LIZ.LLIZLLLIL;
            if (interfaceC1270200j9u != null) {
                interfaceC1270200j9u.LJI(-201, new Exception("mediaProjection session is no longer valid"));
            }
            MediaProjection mediaProjection = this.LIZ.LLJILJILJ;
            if (mediaProjection != null) {
                mediaProjection.unregisterCallback(this);
            }
        }
    };
    public final ARunnableS120S0100000_20 LLJJIII = new ARunnableS120S0100000_20(this, 241);
    public int LLJJI = 2;

    @Override // X.AbstractC1268600j7K, com.ss.ttlivestreamer.core.engine.VideoSource
    public final boolean isScreenCast() {
        return true;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
        synchronized (this) {
            this.LLJILLL = true;
        }
        super.release();
        this.LLJJI = 2;
    }

    @Override // X.AbstractC1268600j7K
    public void stop() {
        synchronized (this) {
            LLJIJIL();
            C1283100jUi.LIZIZ(this.LLJILJIL.getHandler(), new ARunnableS120S0100000_20(this, 242));
        }
    }

    public final void LLJIJIL() {
        if (this.LLJILLL) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    public final void LLJILJIL() {
        this.LLJILJIL.getSurfaceTexture().setDefaultBufferSize(this.LLJ, this.LLJI);
        try {
            this.LLJIJIL = C0TPY.LIZ(this.LLJILJILJ, "WebRTC_ScreenCapture", this.LLJ, this.LLJI, 400, new Surface(this.LLJILJIL.getSurfaceTexture()), null, CertProviderManagerKt.findCert("ttls_screen_video_record_start_record", 1476411393));
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MediaProjection createVirtualDisplay failed(): ");
            sbLIZ.append(this.LLJILJILJ);
            AVLog.logKibana(6, "ScreenVideoCapturer", C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public final int status() {
        return this.LLJJI;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0j9q] */
    public C1270170j9r(Intent intent, InterfaceC1270200j9u interfaceC1270200j9u) {
        this.LLJJJJ = true;
        this.LLILZLL = intent;
        this.LLIZLLLIL = interfaceC1270200j9u;
        this.LLJJJJ = intent.getBooleanExtra("screen_capture_enable_e2e", true);
    }

    public final synchronized void LLJILJILJ(SurfaceTextureHelper surfaceTextureHelper, Context context) {
        LLJIJIL();
        this.LLJJIJIL = context;
        if (surfaceTextureHelper != null) {
            this.LLJILJIL = surfaceTextureHelper;
            this.LLJJ = (MediaProjectionManager) C786410Ut5.H2(context, "media_projection");
            this.LLJJI = 0;
        } else {
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    @Override // X.InterfaceC1270400jAE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLII(long r22, int r24, float[] r25) {
        /*
            r21 = this;
            r19 = r22
            r14 = r21
            com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper r0 = r14.LLJILJIL
            android.os.Handler r1 = r0.getHandler()
            Y.ARunnableS120S0100000_20 r0 = r14.LLJJIII
            r1.removeCallbacks(r0)
            int r0 = r14.LLJJJ
            if (r0 != 0) goto L49
            com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper r0 = r14.LLJILJIL
            android.os.Handler r3 = r0.getHandler()
            Y.ARunnableS120S0100000_20 r2 = r14.LLJJIII
            int r0 = r14.LLJJIJI
            long r0 = (long) r0
            X.C786410Ut5.LJLIIL(r0, r3, r2)
        L21:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 / r0
            long r2 = r19 / r0
            long r5 = r14.LLJJIJIIJIL
            r12 = 0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            r4 = 0
            r9 = 1
            if (r0 <= 0) goto L5c
            long r5 = r5 - r2
            long r10 = java.lang.Math.abs(r5)
            int r8 = r14.LLJJIJI
            int r0 = r8 * 2
            long r0 = (long) r0
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 >= 0) goto L5c
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 <= 0) goto L65
            com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper r0 = r14.LLJILJIL
            r0.returnTextureFrame(r9)
            return
        L49:
            int r0 = r14.LLJJJ
            if (r0 <= 0) goto L21
            com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper r0 = r14.LLJILJIL
            android.os.Handler r3 = r0.getHandler()
            Y.ARunnableS120S0100000_20 r2 = r14.LLJJIII
            int r0 = r14.LLJJJ
            long r0 = (long) r0
            X.C786410Ut5.LJLIIL(r0, r3, r2)
            goto L21
        L5c:
            int r0 = r14.LLJJIJI
            int r0 = r0 / 2
            long r0 = (long) r0
            long r2 = r2 + r0
            r14.LLJJIJIIJIL = r2
            goto L6b
        L65:
            long r2 = r14.LLJJIJIIJIL
            long r0 = (long) r8
            long r2 = r2 + r0
            r14.LLJJIJIIJIL = r2
        L6b:
            r0 = r25
            android.graphics.Matrix r3 = X.C1273010jER.LIZJ(r4, r0)
            int r0 = r14.LLJJJIL
            int r0 = r0 % 180
            if (r0 == 0) goto L87
            r0 = 1056964608(0x3f000000, float:0.5)
            r3.preTranslate(r0, r0)
            int r0 = r14.LLJJJIL
            float r0 = (float) r0
            r3.preRotate(r0)
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
            r3.preTranslate(r0, r0)
        L87:
            com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper r2 = r14.LLJILJIL
            int r1 = r14.LLJ
            int r0 = r14.LLJI
            X.0jC6 r15 = r2.createTextureBuffer(r1, r0, r3)
            if (r15 == 0) goto La9
            boolean r0 = r14.LLJJJJ
            if (r0 == 0) goto La9
        L98:
            long r2 = com.ss.ttlivestreamer.core.utils.TimeUtils.nativeTimeUTCMicros()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            r15.updateCaptureServerNtpMs(r2)
            long r0 = r15.getCaptureServerNtpMs()
            r15.updateEffectServerNtpMs(r0)
        La9:
            int r1 = r14.LLJ
            int r0 = r14.LLJI
            r17 = r0
            r18 = r4
            r16 = r1
            r14.LLJ(r15, r16, r17, r18, r19)
            r15.release()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270170j9r.LLII(long, int, float[]):void");
    }

    @Override // X.AbstractC1268600j7K
    public final void LLJI(int i, int i2, int i3) {
        synchronized (this) {
            LLJIJIL();
            this.LLJ = i;
            this.LLJI = i2;
            this.LLJJIJI = LSPassThroughRecordSizeConfig.DEFAULT / i3;
            try {
                this.LLJILJILJ = C0TPX.LIZLLL(this.LLJJ, -1, this.LLILZLL, CertProviderManagerKt.findCert("ttls_screen_video_record_start_record", 1476411393));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MediaProjectionManager getMediaProjection ");
                sbLIZ.append(this.LLJILJILJ);
                AVLog.ioi("ScreenVideoCapturer", C2188811AlT.LIZIZ(sbLIZ));
                MediaProjection mediaProjection = this.LLJILJILJ;
                if (mediaProjection == null) {
                    this.LLIZLLLIL.LJI(-203, new Exception("mediaProjection is null, please check permission"));
                    return;
                }
                mediaProjection.registerCallback(this.LLIZ, this.LLJILJIL.getHandler());
                LLJILJIL();
                this.LLJILJIL.setInterruptChecker(this.LLJJJJJIL);
                this.LLJILJIL.startListening(this);
                this.LLJJI = 1;
                InterfaceC1270200j9u interfaceC1270200j9u = this.LLIZLLLIL;
                if (interfaceC1270200j9u != null) {
                    interfaceC1270200j9u.LJIIJ();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MediaProjectionManager getMediaProjection fail(): ");
                sbLIZ2.append(e.getMessage());
                AVLog.logKibana(6, "ScreenVideoCapturer", C2188811AlT.LIZIZ(sbLIZ2), e);
                this.LLIZLLLIL.LJI(-202, e);
            }
        }
    }
}

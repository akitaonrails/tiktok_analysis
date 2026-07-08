package X;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262651DhH {
    public int LIZ;
    public MediaCodec LIZLLL;
    public MediaExtractor LJ;
    public Surface LJFF;
    public SurfaceTexture LJI;
    public Surface LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public long LJIIJJI;
    public String LIZIZ = "";
    public EnumC2262661DhI LIZJ = EnumC2262661DhI.LL;
    public final AtomicBoolean LJIIL = new AtomicBoolean(false);
    public final AtomicBoolean LJIILIIL = new AtomicBoolean(false);
    public final AtomicBoolean LJIILJJIL = new AtomicBoolean(false);

    public final void LIZ() {
        if (this.LJIIL.get()) {
            return;
        }
        this.LJI = new SurfaceTexture(hashCode());
        this.LJII = new Surface(this.LJI);
        this.LJIIL.set(true);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoDecoderWrapper(dataSource='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', dataIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", decoderState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", presentationTimeUs=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", videoWidth=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", videoHeight=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(String str) {
        if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableMulti()) {
            try {
                MediaExtractor mediaExtractor = this.LJ;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VideoDecoderWrapper#releaseDecoder, error, source=");
                sbLIZ.append(str);
                C20441214yg.LJFF("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ), e);
            }
            try {
                MediaCodec mediaCodec = this.LIZLLL;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                MediaCodec mediaCodec2 = this.LIZLLL;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        } else {
            try {
                MediaExtractor mediaExtractor2 = this.LJ;
                if (mediaExtractor2 != null) {
                    mediaExtractor2.release();
                }
                MediaCodec mediaCodec3 = this.LIZLLL;
                if (mediaCodec3 != null) {
                    mediaCodec3.stop();
                }
                MediaCodec mediaCodec4 = this.LIZLLL;
                if (mediaCodec4 != null) {
                    mediaCodec4.release();
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("VideoDecoderWrapper#releaseDecoder, error, source=");
                sbLIZ2.append(str);
                C20441214yg.LJFF("TTMultiplePlayerImplV2_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2), e4);
            }
        }
        this.LIZJ = EnumC2262661DhI.LLILZLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r6) {
        /*
            r5 = this;
            X.1DhI r1 = r5.LIZJ
            r1.getClass()
            X.1DhI r0 = X.EnumC2262661DhI.LLILLL
            r4 = 0
            if (r1 == r0) goto L13
            X.1DhI r1 = r5.LIZJ
            r1.getClass()
            X.1DhI r0 = X.EnumC2262661DhI.LLILZ
            if (r1 != r0) goto L8a
        L13:
            com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting r0 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting.INSTANCE
            boolean r0 = r0.isEnableMulti()
            java.lang.String r3 = "VideoDecoderWrapper#stopDecoder, error, source="
            java.lang.String r2 = "TTMultiplePlayerImplV2_gift_video_engine"
            if (r0 == 0) goto L5a
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.LJIILJJIL     // Catch: java.lang.Exception -> L2c
            r0.set(r4)     // Catch: java.lang.Exception -> L2c
            android.media.MediaExtractor r0 = r5.LJ     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L41
            r0.release()     // Catch: java.lang.Exception -> L2c
            goto L41
        L2c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            X.C20441214yg.LJFF(r2, r0, r1)
        L41:
            android.media.MediaCodec r0 = r5.LIZLLL     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L4d
            r0.stop()     // Catch: java.lang.Exception -> L49
            goto L4d
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4d:
            android.media.MediaCodec r0 = r5.LIZLLL     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L8a
            r0.release()     // Catch: java.lang.Exception -> L55
            goto L8a
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L8a
        L5a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.LJIILJJIL     // Catch: java.lang.Exception -> L75
            r0.set(r4)     // Catch: java.lang.Exception -> L75
            android.media.MediaExtractor r0 = r5.LJ     // Catch: java.lang.Exception -> L75
            if (r0 == 0) goto L66
            r0.release()     // Catch: java.lang.Exception -> L75
        L66:
            android.media.MediaCodec r0 = r5.LIZLLL     // Catch: java.lang.Exception -> L75
            if (r0 == 0) goto L6d
            r0.stop()     // Catch: java.lang.Exception -> L75
        L6d:
            android.media.MediaCodec r0 = r5.LIZLLL     // Catch: java.lang.Exception -> L75
            if (r0 == 0) goto L8a
            r0.release()     // Catch: java.lang.Exception -> L75
            goto L8a
        L75:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r3)
            r0.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            X.C20441214yg.LJFF(r2, r0, r1)
        L8a:
            X.1DhI r0 = X.EnumC2262661DhI.LLILZIL
            r5.LIZJ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2262651DhH.LIZLLL(java.lang.String):void");
    }

    public final void LIZJ(int i, String str) {
        if (this.LJIILIIL.get() && Intrinsics.LJFF(this.LIZIZ, str) && this.LIZ == i) {
            return;
        }
        LIZIZ("setDataSource");
        this.LIZIZ = str;
        this.LIZ = i;
        this.LJIILIIL.set(true);
        LIZ();
    }
}

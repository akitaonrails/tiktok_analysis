package X;

import Y.ARunnableS120S0100000_20;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0j93, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1269670j93 extends C1270350jA9 {
    public int LLJJIJIIJIL;
    public float[] LLJJIJIL;
    public final VideoFrameStatics LLJJJ;
    public boolean LLJJJIL;
    public final /* synthetic */ LiveStreamVideoCapture LLJJJJ;

    @Override // X.C1270350jA9, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        if (this.LLJJ) {
            GLES20.glFinish();
        } else {
            C786410Ut5.LJJZZIII(this.LLJJJJ.LLJILJIL, new ARunnableS120S0100000_20(this, 126));
        }
        this.LLJJJIL = false;
        super.release();
    }

    @Override // X.AbstractC1268600j7K
    public final float LLIZLLLIL() {
        return this.LLJJJ.getRealRatePerSecond();
    }

    public final int LLJJIII(long j) {
        String str;
        C1271390jBp c1271390jBp = this.LLJJJJ.LLJJJJ;
        if (c1271390jBp == null) {
            return -1;
        }
        int i = c1271390jBp.LIZJ;
        int i2 = c1271390jBp.LIZLLL;
        if (i >= 1 && i2 >= 1 && this.LLJJ) {
            return super.LLJIJIL(c1271390jBp.LIZIZ, false, c1271390jBp.LIZJ, c1271390jBp.LIZLLL, this.LLJJIJIIJIL, this.LLJJIJIL, j, null, TimeUtils.currentTimeMs(), 0L);
        }
        if (this.LLJJ) {
            str = "never push any frame.";
        } else {
            str = "current texture not return.";
        }
        AVLog.w("LiveStreamVideoCapture", str);
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1269670j93(LiveStreamVideoCapture liveStreamVideoCapture, InterfaceC1270200j9u interfaceC1270200j9u, Handler handler) {
        super(interfaceC1270200j9u, handler, null);
        this.LLJJJJ = liveStreamVideoCapture;
        this.LLJI = true;
        this.LLJJJ = new VideoFrameStatics(LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.AbstractC1268600j7K
    public final int LLJ(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        return this.LLJJJJ.LLJ(buffer, i, i2, 0, j);
    }

    @Override // X.C1270350jA9
    public final int LLJIJIL(final int i, final boolean z, final int i2, final int i3, int i4, float[] fArr, final long j, final Bundle bundle, long j2, final long j3) {
        final int[] iArr = {-1};
        this.LLJJJ.add();
        if (!this.LLJJJIL) {
            this.LLJJJIL = true;
        }
        if ((this.LLJJ || !this.LLJI) && this.LLJ == 1) {
            LiveStreamVideoCapture liveStreamVideoCapture = this.LLJJJJ;
            if (liveStreamVideoCapture.LLJJIII == 1) {
                this.LLJJIJIIJIL = i4;
                this.LLJJIJIL = fArr;
                C1283100jUi.LIZIZ(liveStreamVideoCapture.LLJILJIL, new Runnable() { // from class: X.0j94
                    public final void LIZ() {
                        InterfaceC1269420j8e interfaceC1269420j8e;
                        LiveStreamVideoCapture liveStreamVideoCapture2 = this.LLJ.LLJJJJ;
                        C1271390jBp c1271390jBp = liveStreamVideoCapture2.LLJJJJ;
                        if (c1271390jBp == null || liveStreamVideoCapture2.LLJJJIL == null) {
                            if (AVLog.enableLogToIODevice2()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("drop frame: mTextureFrameBuffer ");
                                sbLIZ.append(this.LLJ.LLJJJJ.LLJJJJ);
                                sbLIZ.append(", mDrawer ");
                                sbLIZ.append(this.LLJ.LLJJJJ.LLJJJIL);
                                AVLog.logToIODevice2(5, "LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ), null, 24, 10000);
                                return;
                            }
                            return;
                        }
                        int i5 = c1271390jBp.LIZLLL;
                        int i6 = i3;
                        if (i5 != i6 || c1271390jBp.LIZJ != i2) {
                            try {
                                c1271390jBp.LIZLLL(i2, i6);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                if (AVLog.enableLogToIODevice2()) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("drop frame: textureFrameBuffer setSize failed (");
                                    sbLIZ2.append(e.getMessage());
                                    sbLIZ2.append(") w ");
                                    sbLIZ2.append(i2);
                                    sbLIZ2.append(" h ");
                                    sbLIZ2.append(i3);
                                    AVLog.logToIODevice2(6, "LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ2), null, 25, 10000);
                                }
                                WeakReference<InterfaceC1269420j8e> weakReference = this.LLJ.LLJJJJ.LLIZLLLIL;
                                if (weakReference == null || (interfaceC1269420j8e = weakReference.get()) == null) {
                                    return;
                                }
                                interfaceC1269420j8e.LJI(-200, e);
                                return;
                            }
                        }
                        GLES20.glBindFramebuffer(36160, this.LLJ.LLJJJJ.LLJJJJ.LIZ);
                        try {
                            GLES20.glGetError();
                            int i7 = i;
                            if (i7 <= 0) {
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                GLES20.glClear(16384);
                            } else if (z) {
                                this.LLJ.LLJJJJ.LLJJJIL.drawOes(i7, null, null, 0, 0, i2, i3);
                            } else {
                                this.LLJ.LLJJJJ.LLJJJIL.drawRgb(i7, null, null, 0, 0, i2, i3);
                            }
                            GLES20.glFlush();
                            GLES20.glBindFramebuffer(36160, 0);
                            try {
                                GLES20.glGetError();
                                int[] iArr2 = iArr;
                                C1269670j93 c1269670j93 = this.LLJ;
                                iArr2[0] = super/*X.0jA9*/.LLJIJIL(c1269670j93.LLJJJJ.LLJJJJ.LIZIZ, false, i2, i3, c1269670j93.LLJJIJIIJIL, c1269670j93.LLJJIJIL, j, bundle, TimeUtils.currentTimeMs(), j3);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (AVLog.enableLogToIODevice2()) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("drop frame: Drawer is error with ignore frame timestamp ");
                                    sbLIZ3.append(j);
                                    AVLog.logToIODevice2(6, "LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ3), null, 27, 10000);
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            if (AVLog.enableLogToIODevice2()) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("drop frame: bindFrameBuffer faild (tex:");
                                sbLIZ4.append(this.LLJ.LLJJJJ.LLJJJJ.LIZIZ);
                                sbLIZ4.append(" fb:");
                                sbLIZ4.append(this.LLJ.LLJJJJ.LLJJJJ.LIZ);
                                sbLIZ4.append(" w:");
                                sbLIZ4.append(i2);
                                sbLIZ4.append(" h:");
                                sbLIZ4.append(i3);
                                AVLog.logToIODevice2(6, "LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ4), null, 26, 10000);
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveStreamVideoCapture$ExternWrapper@1416.pushVideoFrame$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveStreamVideoCapture$ExternWrapper@1416.pushVideoFrame$1");
                    }
                });
                return iArr[0];
            }
        }
        if (AVLog.enableLogToIODevice2()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("drop frame: mBufferAlreadyReturn ");
            sbLIZ.append(this.LLJJ);
            sbLIZ.append(", mStatus ");
            sbLIZ.append(this.LLJ);
            sbLIZ.append(", LiveStreamVideoCapture.this.mStatus ");
            sbLIZ.append(this.LLJJJJ.LLJJIII);
            AVLog.logToIODevice2(5, "LiveStreamVideoCapture", C2188811AlT.LIZIZ(sbLIZ), null, 23, 10000);
        }
        return iArr[0];
    }
}

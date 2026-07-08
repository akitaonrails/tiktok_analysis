package X;

import Y.ARunnableS131S0100000_31;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord.TtliveGameInternalRecordDetectConfigSetting;
import com.bytedance.android.livesdk.game.common.datachannel.GameLiveInternalRecordFallbackChannel;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.151e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204524151e implements InterfaceC1272460jDY {
    public static final long[] LJIJI = {60000, 120000, 180000, 240000, 300000};
    public final AbstractC1273900jFs LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZLLL;
    public int LJ;
    public long LJFF;
    public long LJI;
    public volatile long LJIIIIZZ;
    public final long LJIIIZ;
    public final long[] LJIIJ;
    public final String[] LJIIJJI;
    public final ARunnableS131S0100000_31 LJIIL;
    public final Object LJIILIIL;
    public HandlerThread LJIILJJIL;
    public volatile BPEAHandler LJIILL;
    public final Object LJIILLIIL;
    public final C13E8<ByteBuffer> LJIIZILJ;
    public int LJIJ;
    public volatile boolean LIZJ = true;
    public volatile String LJII = "";

    @Override // X.InterfaceC1272460jDY
    public final void LIZ(Exception exc) {
    }

    public C204524151e(AbstractC1273900jFs abstractC1273900jFs) {
        boolean z;
        long jLongValue;
        this.LIZ = abstractC1273900jFs;
        TtliveGameInternalRecordDetectConfigSetting ttliveGameInternalRecordDetectConfigSetting = TtliveGameInternalRecordDetectConfigSetting.INSTANCE;
        Long lValueOf = Long.valueOf(ttliveGameInternalRecordDetectConfigSetting.getConfig().getSilentDurationMs());
        if (lValueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 30000;
        }
        this.LJIIIZ = jLongValue;
        long[] pauseGradientMs = ttliveGameInternalRecordDetectConfigSetting.getConfig().getPauseGradientMs();
        this.LJIIJ = pauseGradientMs.length == 0 ? LJIJI : pauseGradientMs;
        this.LJIIJJI = ttliveGameInternalRecordDetectConfigSetting.getConfig().getExcludedGameNames();
        this.LJIIL = new ARunnableS131S0100000_31(this, 111);
        this.LJIILIIL = new Object();
        this.LJIILLIIL = new Object();
        this.LJIIZILJ = new C13E8<>(4);
        new ConcurrentHashMap();
    }

    public final ByteBuffer LIZIZ(int i) {
        synchronized (this.LJIILLIIL) {
            try {
                if (this.LJIJ != i) {
                    this.LJIIZILJ.clear();
                    this.LJIJ = i;
                }
                ByteBuffer byteBufferLJIILJJIL = this.LJIIZILJ.LJIILJJIL();
                if (byteBufferLJIILJJIL != null) {
                    byteBufferLJIILJJIL.clear();
                    return byteBufferLJIILJJIL;
                }
                return ByteBuffer.allocate(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(ByteBuffer byteBuffer) {
        synchronized (this.LJIILLIIL) {
            try {
                if (byteBuffer.capacity() == this.LJIJ && this.LJIIZILJ.size() < 4) {
                    this.LJIIZILJ.addLast(byteBuffer);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(ByteBuffer byteBuffer, int i, int i2) {
        String string;
        int i3;
        if (this.LIZ != null && this.LIZJ && !this.LIZIZ && !this.LIZLLL) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.LJI;
            if (j == 0 || jElapsedRealtime - j >= 500) {
                this.LJI = jElapsedRealtime;
                boolean zIsAppBackground = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground();
                Object feature = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).getFeature("g_interaction_fusion_tag_name");
                String str = "";
                if (feature == null || (string = feature.toString()) == null) {
                    string = "";
                }
                boolean z = !C13LQ.LJIILLIIL(string, this.LJIIJJI);
                if (!zIsAppBackground) {
                    str = "app_foreground";
                } else if (!z) {
                    str = "not_gaming";
                }
                this.LJII = str;
            }
            if (this.LJII.length() > 0) {
                if (this.LJFF == 0) {
                    Map<String, Object> map = C1338270kvh.LIZ;
                    return;
                }
                SystemClock.elapsedRealtime();
                this.LJFF = 0L;
                Map<String, Object> map2 = C1338270kvh.LIZ;
                return;
            }
            if (byteBuffer != null && i > 0 && ((i2 == 1 || i2 == 2) && byteBuffer.limit() >= (i3 = i * i2 * 2))) {
                ByteOrder byteOrderOrder = byteBuffer.order();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    try {
                        if (byteBuffer.getShort(i4) != 0) {
                            byteBuffer.order(byteOrderOrder);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        byteBuffer.order(byteOrderOrder);
                        throw th;
                    }
                }
                byteBuffer.order(byteOrderOrder);
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j2 = this.LJFF;
                if (j2 == 0) {
                    this.LJFF = jElapsedRealtime2;
                    Map<String, Object> map3 = C1338270kvh.LIZ;
                    return;
                }
                if (jElapsedRealtime2 - j2 >= this.LJIIIZ) {
                    this.LIZ.LJLL(true);
                    DataChannelGlobal.LLILZ.HQ2(GameLiveInternalRecordFallbackChannel.class, Boolean.TRUE);
                    this.LIZIZ = true;
                    Map<String, Object> map4 = C1338270kvh.LIZ;
                    this.LIZJ = false;
                    BPEAHandler bPEAHandler = this.LJIILL;
                    if (bPEAHandler != null) {
                        bPEAHandler.removeCallbacksAndMessages(null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.LJFF != 0) {
                SystemClock.elapsedRealtime();
            }
            this.LJFF = 0L;
            int i5 = this.LJ + 1;
            this.LJ = i5;
            int i6 = i5 - 1;
            long[] jArr = this.LJIIJ;
            int length = jArr.length - 1;
            if (i6 > length) {
                i6 = length;
            }
            long j3 = jArr[i6];
            this.LIZLLL = true;
            BPEAHandler bPEAHandler2 = this.LJIILL;
            if (bPEAHandler2 != null) {
                bPEAHandler2.removeCallbacks(this.LJIIL);
                C786410Ut5.LJLIIL(j3, bPEAHandler2, this.LJIIL);
            }
            Map<String, Object> map5 = C1338270kvh.LIZ;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r0 == null) goto L38;
     */
    @Override // X.InterfaceC1272460jDY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.nio.ByteBuffer r14, int r15, int r16, int r17, long r18) {
        /*
            r13 = this;
            r8 = r13
            X.0jFs r0 = r8.LIZ
            if (r0 == 0) goto Laa
            boolean r0 = r8.LIZJ
            if (r0 == 0) goto Laa
            boolean r0 = r8.LIZIZ
            if (r0 != 0) goto Laa
            boolean r0 = r8.LIZLLL
            if (r0 != 0) goto Laa
            if (r14 == 0) goto Laa
            java.lang.String r0 = r8.LJII
            int r0 = r0.length()
            r5 = 0
            if (r0 <= 0) goto L2f
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r8.LJIIIIZZ
            long r6 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2d
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            return
        L2d:
            r8.LJIIIIZZ = r3
        L2f:
            r11 = r17
            r10 = r15
            int r0 = r10 * r11
            int r1 = r0 * 2
            if (r1 <= 0) goto La7
            int r0 = r14.limit()
            if (r0 < r1) goto La7
            java.nio.ByteBuffer r9 = r8.LIZIZ(r1)     // Catch: java.lang.Throwable -> La0
            java.nio.ByteBuffer r0 = r14.duplicate()     // Catch: java.lang.Throwable -> La0
            r0.position(r5)     // Catch: java.lang.Throwable -> La0
            r0.limit(r1)     // Catch: java.lang.Throwable -> La0
            r9.put(r0)     // Catch: java.lang.Throwable -> La0
            r9.flip()     // Catch: java.lang.Throwable -> La0
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r8.LJIILL
            if (r0 != 0) goto L8e
            java.lang.Object r3 = r8.LJIILIIL
            monitor-enter(r3)
            boolean r0 = r8.LIZJ     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L5e
            goto L81
        L5e:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r8.LJIILL     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L7b
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ     // Catch: java.lang.Throwable -> L88
            android.os.HandlerThread r2 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "GameLiveAudioSilentDetect"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L88
            r2.start()     // Catch: java.lang.Throwable -> L88
            r8.LJIILJJIL = r2     // Catch: java.lang.Throwable -> L88
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = new com.bytedance.bpea.transmit.delegate.BPEAHandler     // Catch: java.lang.Throwable -> L88
            android.os.Looper r0 = X.C786410Ut5.W2(r2)     // Catch: java.lang.Throwable -> L88
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L88
            r8.LJIILL = r1     // Catch: java.lang.Throwable -> L88
        L7b:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r8.LJIILL     // Catch: java.lang.Throwable -> L88
            monitor-exit(r3)
            if (r0 != 0) goto L8e
            goto L82
        L81:
            monitor-exit(r3)
        L82:
            r8.LJ(r9)
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            return
        L88:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r3)
            throw r0
        L8e:
            Y.ARunnableS11S0202000_31 r7 = new Y.ARunnableS11S0202000_31
            r12 = 2
            r7.<init>(r8, r9, r10, r11, r12)
            boolean r0 = X.C786410Ut5.LJJZZIII(r0, r7)
            if (r0 != 0) goto L9f
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            r8.LJ(r9)
        L9f:
            return
        La0:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            return
        La7:
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            return
        Laa:
            boolean r0 = r8.LIZIZ
            if (r0 == 0) goto Lb1
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            return
        Lb1:
            boolean r0 = r8.LIZLLL
            if (r0 == 0) goto Lb8
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            return
        Lb8:
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204524151e.LIZJ(java.nio.ByteBuffer, int, int, int, long):void");
    }
}

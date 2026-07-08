package X;

import com.bytedance.android.livesdk.livesetting.game.GameAudioInferConfigSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.151f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204525151f implements InterfaceC1272460jDY {
    public static final int LJIIJJI = GameAudioInferConfigSetting.INSTANCE.getConfig().ringBufferMaxCacheNum;
    public final String LIZ;
    public final InterfaceC785730Urz LIZIZ;
    public int LIZJ;
    public C204527151h LIZLLL;
    public HandlerThreadC204526151g LJ;
    public boolean LJFF;
    public double LJI;
    public int LJII;
    public C204528151i LJIIIIZZ;
    public final boolean LJIIIZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline();
    public int LJIIJ;

    @Override // X.InterfaceC1272460jDY
    public final void LIZ(Exception exc) {
    }

    public C204525151f(String str, C151O c151o) {
        this.LIZ = str;
        this.LIZIZ = c151o;
    }

    @Override // X.InterfaceC1272460jDY
    public final void LIZJ(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        ByteBuffer byteBuffer2;
        C204528151i c204528151i;
        ReentrantLock reentrantLock;
        boolean[] zArr;
        int i4;
        if (byteBuffer != null) {
            if (!this.LJFF) {
                int i5 = i2 * i3 * 2;
                this.LIZJ = i5;
                C204527151h c204527151h = new C204527151h(LJIIJJI, i5);
                HandlerThreadC204526151g handlerThreadC204526151g = new HandlerThreadC204526151g(c204527151h, this.LIZ, i2, i3, this.LIZIZ);
                handlerThreadC204526151g.start();
                this.LJ = handlerThreadC204526151g;
                this.LIZLLL = c204527151h;
                if (this.LJIIIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sample_rate  = ");
                    sbLIZ.append(i2);
                    sbLIZ.append(",channel=");
                    sbLIZ.append(i3);
                    sbLIZ.append(",samples_per_channel= ");
                    sbLIZ.append(i);
                    C20441214yg.LJIIIZ("Sonava#GameAudioObserver", C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("buffer capacity  = ");
                    sbLIZ2.append(byteBuffer.capacity());
                    C20441214yg.LJIIIZ("Sonava#GameAudioObserver", C2188811AlT.LIZIZ(sbLIZ2));
                }
                this.LJFF = true;
            }
            if (this.LJIIIIZZ == null) {
                C204527151h c204527151h2 = this.LIZLLL;
                try {
                    try {
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            c204527151h2.LJI.unlock();
                            throw th;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (c204527151h2 != null) {
                    try {
                        c204527151h2.LJI.lockInterruptibly();
                        zArr = c204527151h2.LIZLLL;
                        i4 = c204527151h2.LJFF;
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        reentrantLock = c204527151h2.LJI;
                    }
                    if (zArr[i4]) {
                        reentrantLock = c204527151h2.LJI;
                    } else {
                        c204528151i = c204527151h2.LIZJ[i4];
                        try {
                            c204527151h2.LJI.unlock();
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                        this.LJIIIIZZ = c204528151i;
                    }
                    reentrantLock.unlock();
                    c204528151i = null;
                    this.LJIIIIZZ = c204528151i;
                } else {
                    c204528151i = null;
                    this.LJIIIIZZ = c204528151i;
                }
            }
            C204528151i c204528151i2 = this.LJIIIIZZ;
            if (c204528151i2 != null) {
                byteBuffer2 = c204528151i2.LIZ;
            } else {
                byteBuffer2 = null;
            }
            if (byteBuffer2 != null && this.LJII == 0) {
                if (c204528151i2 != null) {
                    byteBuffer.position(0);
                    byteBuffer2.put(byteBuffer);
                    if (byteBuffer2.position() == byteBuffer2.limit()) {
                        int iCapacity = byteBuffer2.capacity();
                        C204528151i c204528151i3 = this.LJIIIIZZ;
                        if (c204528151i3 != null) {
                            c204528151i3.LIZIZ = this.LJI;
                            c204528151i3.LIZJ = System.currentTimeMillis();
                        }
                        this.LJIIIIZZ = null;
                        C204527151h c204527151h3 = this.LIZLLL;
                        try {
                            if (c204527151h3 != null) {
                                try {
                                    c204527151h3.LJI.lockInterruptibly();
                                    ByteBuffer byteBuffer3 = c204527151h3.LIZJ[c204527151h3.LJFF].LIZ;
                                    if (byteBuffer3 != null) {
                                        byteBuffer3.position(0);
                                    }
                                    boolean[] zArr2 = c204527151h3.LIZLLL;
                                    int i6 = c204527151h3.LJFF;
                                    zArr2[i6] = true;
                                    c204527151h3.LJFF = (i6 + 1) % c204527151h3.LIZ;
                                    c204527151h3.LJII.signal();
                                } catch (Exception e5) {
                                    TryCatchGuardChecker.doCheck(e5);
                                }
                                try {
                                    c204527151h3.LJI.unlock();
                                } catch (Exception e6) {
                                    TryCatchGuardChecker.doCheck(e6);
                                }
                            }
                            if (this.LJIIIZ) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("capacity  = ");
                                sbLIZ3.append(iCapacity);
                                sbLIZ3.append(",time=");
                                sbLIZ3.append(this.LJI);
                                C20441214yg.LJIIIZ("Sonava#GameAudioObserver", C2188811AlT.LIZIZ(sbLIZ3));
                            }
                            this.LJI += 1.0d;
                            return;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            try {
                                c204527151h3.LJI.unlock();
                                throw th2;
                            } catch (Exception e7) {
                                TryCatchGuardChecker.doCheck(e7);
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            int iCapacity2 = this.LJII + byteBuffer.capacity();
            this.LJII = iCapacity2;
            if (iCapacity2 >= this.LIZJ) {
                this.LJII = 0;
                this.LJI += 1.0d;
                this.LJIIJ++;
            }
        }
    }
}

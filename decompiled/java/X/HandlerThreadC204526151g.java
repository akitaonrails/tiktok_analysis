package X;

import ci3.a;
import com.bytedance.android.livesdk.game.multidevicesdk.sonava.GameSonavaSdk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.151g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class HandlerThreadC204526151g extends a implements InterfaceC204530151k {
    public final C204527151h LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public InterfaceC785730Urz LLILZIL;
    public GameSonavaSdk LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public C204528151i LLJ;

    public final void LIZIZ() {
        ReentrantLock reentrantLock;
        int i;
        if (!this.LLIZ) {
            GameSonavaSdk gameSonavaSdk = new GameSonavaSdk(this.LLILLJJLI, this);
            int iInitSdk = gameSonavaSdk.initSdk();
            InterfaceC785730Urz interfaceC785730Urz = this.LLILZIL;
            if (interfaceC785730Urz != null) {
                interfaceC785730Urz.LIZIZ(iInitSdk, "sdk_init");
            }
            gameSonavaSdk.initFormat(this.LLILLL, this.LLILZ);
            InterfaceC785730Urz interfaceC785730Urz2 = this.LLILZIL;
            if (interfaceC785730Urz2 != null) {
                interfaceC785730Urz2.LIZIZ(this.LLILLL, "audio_sample_rate");
            }
            InterfaceC785730Urz interfaceC785730Urz3 = this.LLILZIL;
            if (interfaceC785730Urz3 != null) {
                interfaceC785730Urz3.LIZIZ(this.LLILZ, "audio_channel");
            }
            this.LLILZLL = gameSonavaSdk;
            this.LLIZ = true;
        }
        while (this.LLIZLLLIL) {
            C204527151h c204527151h = this.LL;
            c204527151h.getClass();
            try {
                try {
                    c204527151h.LJI.lockInterruptibly();
                    while (true) {
                        boolean[] zArr = c204527151h.LIZLLL;
                        i = c204527151h.LJ;
                        if (zArr[i]) {
                            break;
                        } else {
                            c204527151h.LJII.await();
                        }
                    }
                    C204528151i c204528151i = c204527151h.LIZJ[i];
                    try {
                        c204527151h.LJI.unlock();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (c204528151i != null) {
                        ByteBuffer byteBuffer = c204528151i.LIZ;
                        if (byteBuffer == null) {
                            return;
                        }
                        this.LLJ = c204528151i;
                        GameSonavaSdk gameSonavaSdk2 = this.LLILZLL;
                        if (gameSonavaSdk2 != null) {
                            gameSonavaSdk2.onPCMData(byteBuffer, byteBuffer.capacity(), c204528151i.LIZIZ);
                        }
                        this.LLJ = null;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    try {
                        c204527151h.LJI.unlock();
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
                C204527151h c204527151h2 = this.LL;
                c204527151h2.getClass();
                try {
                    try {
                        c204527151h2.LJI.lockInterruptibly();
                        ByteBuffer byteBuffer2 = c204527151h2.LIZJ[c204527151h2.LJ].LIZ;
                        if (byteBuffer2 != null) {
                            byteBuffer2.position(0);
                        }
                        boolean[] zArr2 = c204527151h2.LIZLLL;
                        int i2 = c204527151h2.LJ;
                        zArr2[i2] = false;
                        c204527151h2.LJ = (i2 + 1) % c204527151h2.LIZ;
                        reentrantLock = c204527151h2.LJI;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            c204527151h2.LJI.unlock();
                            throw th;
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            throw th;
                        }
                    }
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    try {
                        reentrantLock = c204527151h2.LJI;
                    } catch (Exception e6) {
                        TryCatchGuardChecker.doCheck(e6);
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                try {
                    c204527151h.LJI.unlock();
                    throw th2;
                } catch (Exception e7) {
                    TryCatchGuardChecker.doCheck(e7);
                    throw th2;
                }
            }
        }
        GameSonavaSdk gameSonavaSdk3 = this.LLILZLL;
        if (gameSonavaSdk3 != null) {
            gameSonavaSdk3.releaseSdk();
        }
        this.LLILZLL = null;
        this.LLILZIL = null;
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("GameAudioObserver$GameAudioConsumeThread@c162.run");
        try {
            LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameAudioObserver$GameAudioConsumeThread@c162.run");
    }

    @Override // X.InterfaceC204530151k
    public final void LIZ(C204529151j c204529151j) {
        Long lValueOf;
        C204528151i c204528151i = this.LLJ;
        if (c204528151i != null) {
            lValueOf = Long.valueOf(c204528151i.LIZJ);
        } else {
            lValueOf = null;
        }
        C151Q c151q = new C151Q(lValueOf, c204529151j.LIZ);
        InterfaceC785730Urz interfaceC785730Urz = this.LLILZIL;
        if (interfaceC785730Urz != null) {
            interfaceC785730Urz.LIZLLL(c151q);
        }
    }

    public HandlerThreadC204526151g(C204527151h c204527151h, String str, int i, int i2, InterfaceC785730Urz interfaceC785730Urz) {
        super("Game-live-audio-infer", 10);
        this.LL = c204527151h;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = interfaceC785730Urz;
        this.LLIZLLLIL = true;
    }
}

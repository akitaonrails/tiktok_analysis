package X;

import android.os.Handler;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.player.NativeRenderObserver;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.Buffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0jBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271310jBh extends C1269960j9W implements InterfaceC1271360jBm {
    public InterfaceC1271360jBm LLILLL;
    public final String LLILZ;
    public C1272390jDR LLILZIL;
    public final EnumC1269640j90 LLILZLL;
    public C1271330jBj LLIZ;
    public final InterfaceC1271370jBn LLIZLLLIL;
    public C1271390jBp LLJ;
    public GlRenderDrawer LLJI;
    public boolean LLJIJIL;
    public final C0VVR LLJILJIL;

    @Override // X.C1271610jCB
    public final void release() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release streamID:");
        sbLIZ.append(this.LLILZ);
        AVLog.logKibana(4, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ), null);
        synchronized (this) {
            try {
                if (this.LLJIJIL) {
                    return;
                }
                this.LLJIJIL = true;
                InterfaceC1271360jBm interfaceC1271360jBm = this.LLILLL;
                C1272390jDR c1272390jDR = this.LLILZIL;
                C1271330jBj c1271330jBj = this.LLIZ;
                GlRenderDrawer glRenderDrawer = this.LLJI;
                C1271390jBp c1271390jBp = this.LLJ;
                C0VVR c0vvr = this.LLJILJIL;
                this.LLILLL = null;
                this.LLILZIL = null;
                this.LLIZ = null;
                this.LLJI = null;
                this.LLJ = null;
                if (interfaceC1271360jBm != null) {
                    interfaceC1271360jBm.stop();
                }
                if (c1272390jDR != null) {
                    AudioDeviceModule.AudioRenderSink audioRenderSink = c1272390jDR.LIZ;
                    if (audioRenderSink != null) {
                        audioRenderSink.stop();
                    }
                    c1272390jDR.LIZLLL = false;
                    c1272390jDR.LIZJ = new CountDownLatch(1);
                }
                if (interfaceC1271360jBm != null) {
                    interfaceC1271360jBm.release();
                }
                if (c1272390jDR != null) {
                    AudioDeviceModule.AudioRenderSink audioRenderSink2 = c1272390jDR.LIZ;
                    if (audioRenderSink2 != null) {
                        audioRenderSink2.LLJILLL();
                        c1272390jDR.LIZ.release();
                        c1272390jDR.LIZ = null;
                    }
                    NativeRenderObserver nativeRenderObserver = c1272390jDR.LIZIZ;
                    if (nativeRenderObserver != null) {
                        nativeRenderObserver.release();
                        c1272390jDR.LIZIZ = null;
                    }
                    c1272390jDR.LIZLLL = false;
                    c1272390jDR.LIZJ = new CountDownLatch(1);
                }
                if (c1271330jBj != null) {
                    c1271330jBj.LIZ();
                }
                if (glRenderDrawer != null) {
                    glRenderDrawer.release();
                }
                if (c1271390jBp != null) {
                    c1271390jBp.LIZJ();
                }
                if (c0vvr != null) {
                    c0vvr.LIZIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1271360jBm
    public final void stop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop streamID:");
        sbLIZ.append(this.LLILZ);
        AVLog.logKibana(4, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ), null);
        C0VVR c0vvr = this.LLJILJIL;
        if (c0vvr != null && c0vvr.LIZ == EnumC1271350jBl.STOPPED) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("stop streamID:");
            sbLIZ2.append(this.LLILZ);
            sbLIZ2.append(" already stopped, skip");
            AVLog.logKibana(5, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ2), null);
            return;
        }
        InterfaceC1271360jBm interfaceC1271360jBm = this.LLILLL;
        if (interfaceC1271360jBm != null) {
            interfaceC1271360jBm.stop();
        }
        C1272390jDR c1272390jDR = this.LLILZIL;
        if (c1272390jDR != null) {
            AudioDeviceModule.AudioRenderSink audioRenderSink = c1272390jDR.LIZ;
            if (audioRenderSink != null) {
                audioRenderSink.stop();
            }
            c1272390jDR.LIZLLL = false;
            c1272390jDR.LIZJ = new CountDownLatch(1);
        }
        C0VVR c0vvr2 = this.LLJILJIL;
        if (c0vvr2 != null) {
            c0vvr2.LIZ = EnumC1271350jBl.STOPPED;
        }
    }

    @Override // X.InterfaceC1271360jBm
    public final void LIZIZ(C1271320jBi c1271320jBi) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCallback streamID:");
        sbLIZ.append(this.LLILZ);
        AVLog.logKibana(4, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ), null);
        InterfaceC1271360jBm interfaceC1271360jBm = this.LLILLL;
        if (interfaceC1271360jBm != null) {
            interfaceC1271360jBm.LIZIZ(c1271320jBi);
        }
    }

    @Override // X.InterfaceC1271360jBm
    public final void setDataSource(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDataSource streamID:");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" url:");
        sbLIZ.append(str);
        AVLog.logKibana(4, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ), null);
        C0VVR c0vvr = this.LLJILJIL;
        if (c0vvr != null) {
            c0vvr.LIZ = EnumC1271350jBl.PREPARING;
        }
        InterfaceC1271360jBm interfaceC1271360jBm = this.LLILLL;
        if (interfaceC1271360jBm != null) {
            interfaceC1271360jBm.setDataSource(str);
        }
    }

    @Override // X.InterfaceC1271360jBm
    public final void setSurface(Surface surface) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurface streamID:");
        sbLIZ.append(this.LLILZ);
        AVLog.logKibana(4, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ), null);
        InterfaceC1271360jBm interfaceC1271360jBm = this.LLILLL;
        if (interfaceC1271360jBm != null) {
            interfaceC1271360jBm.setSurface(surface);
        }
    }

    @Override // X.InterfaceC1271360jBm
    public final void start(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start: offset = ");
        sbLIZ.append(i);
        sbLIZ.append(" streamID:");
        sbLIZ.append(this.LLILZ);
        AVLog.logKibana(4, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ), null);
        C0VVR c0vvr = this.LLJILJIL;
        if (c0vvr != null && c0vvr.LIZ == EnumC1271350jBl.PLAYING) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start streamID:");
            sbLIZ2.append(this.LLILZ);
            sbLIZ2.append(" already playing, skip");
            AVLog.logKibana(5, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ2), null);
            return;
        }
        InterfaceC1271360jBm interfaceC1271360jBm = this.LLILLL;
        if (interfaceC1271360jBm != null) {
            interfaceC1271360jBm.start(i);
        }
        C1272390jDR c1272390jDR = this.LLILZIL;
        if (c1272390jDR != null && c1272390jDR.LIZ != null) {
            c1272390jDR.LIZLLL = false;
            c1272390jDR.LIZJ = new CountDownLatch(1);
            c1272390jDR.LIZ.start();
        }
        C0VVR c0vvr2 = this.LLJILJIL;
        if (c0vvr2 != null) {
            c0vvr2.LIZ = EnumC1271350jBl.PLAYING;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0jBi] */
    public C1271310jBh(InterfaceC1271360jBm interfaceC1271360jBm, String str, InterfaceC1273910jFt interfaceC1273910jFt, EnumC1269640j90 enumC1269640j90, C947150akr c947150akr) {
        C1272810jE7 c1272810jE7;
        C1268700j7U c1268700j7U;
        Handler handlerLIZIZ;
        this.LLILZLL = EnumC1269640j90.LOCAL_RENDER;
        C1271290jBf c1271290jBf = new C1271290jBf(this);
        ?? r5 = new InterfaceC1271370jBn() { // from class: X.0jBi
            @Override // X.InterfaceC1271370jBn
            public final void LJJZ() {
                C0VVR c0vvr = this.LIZ.LLJILJIL;
                if (c0vvr != null) {
                    c0vvr.LIZ = EnumC1271350jBl.PLAYING;
                }
                InterfaceC1271370jBn interfaceC1271370jBn = this.LIZ.LLIZLLLIL;
                if (interfaceC1271370jBn != null) {
                    interfaceC1271370jBn.LJJZ();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlaying:");
                sbLIZ.append(this.LIZ.LLILZ);
                AVLog.logKibana(4, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ), null);
            }

            @Override // X.InterfaceC1271370jBn
            public final void onCompletion() {
                C0VVR c0vvr = this.LIZ.LLJILJIL;
                if (c0vvr != null) {
                    c0vvr.LIZ = EnumC1271350jBl.COMPLETED;
                }
                InterfaceC1271370jBn interfaceC1271370jBn = this.LIZ.LLIZLLLIL;
                if (interfaceC1271370jBn != null) {
                    interfaceC1271370jBn.onCompletion();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCompletion:");
                sbLIZ.append(this.LIZ.LLILZ);
                AVLog.logKibana(4, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ), null);
            }

            @Override // X.InterfaceC1271370jBn
            public final void onPrepared() {
                C0VVR c0vvr = this.LIZ.LLJILJIL;
                if (c0vvr != null) {
                    c0vvr.LIZ = EnumC1271350jBl.PREPARED;
                }
                InterfaceC1271370jBn interfaceC1271370jBn = this.LIZ.LLIZLLLIL;
                if (interfaceC1271370jBn != null) {
                    interfaceC1271370jBn.onPrepared();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPrepared:");
                sbLIZ.append(this.LIZ.LLILZ);
                AVLog.logKibana(4, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ), null);
            }

            @Override // X.InterfaceC1271370jBn
            public final void LIZ(long j, long j2) {
                C0VVR c0vvr = this.LIZ.LLJILJIL;
                if (c0vvr != null) {
                    c0vvr.LIZJ.set(j);
                    this.LIZ.LLJILJIL.LIZLLL.set(j2);
                }
                InterfaceC1271370jBn interfaceC1271370jBn = this.LIZ.LLIZLLLIL;
                if (interfaceC1271370jBn != null) {
                    interfaceC1271370jBn.LIZ(j, j2);
                }
            }

            @Override // X.InterfaceC1271370jBn
            public final void onVideoSizeChanged(int i, int i2) {
                synchronized (this.LIZ) {
                    try {
                        C1271310jBh c1271310jBh = this.LIZ;
                        if (c1271310jBh.LLJIJIL) {
                            return;
                        }
                        c1271310jBh.getClass();
                        this.LIZ.getClass();
                        C1271310jBh c1271310jBh2 = this.LIZ;
                        C1271330jBj c1271330jBj = c1271310jBh2.LLIZ;
                        C0VVR c0vvr = c1271310jBh2.LLJILJIL;
                        InterfaceC1271370jBn interfaceC1271370jBn = c1271310jBh2.LLIZLLLIL;
                        if (c0vvr != null) {
                            c0vvr.LJ = i;
                            c0vvr.LJFF = i2;
                        }
                        if (c1271330jBj != null && i > 0 && i2 > 0) {
                            c1271330jBj.LIZIZ(i, i2);
                        }
                        if (interfaceC1271370jBn != null) {
                            interfaceC1271370jBn.onVideoSizeChanged(i, i2);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // X.InterfaceC1271370jBn
            public final void LIZIZ(Buffer buffer, int i, int i2, int i3, long j) {
                synchronized (this.LIZ) {
                    try {
                        C1271310jBh c1271310jBh = this.LIZ;
                        if (c1271310jBh.LLJIJIL) {
                            return;
                        }
                        C1272390jDR c1272390jDR = c1271310jBh.LLILZIL;
                        if (c1272390jDR != null && c1272390jDR.LIZ != null) {
                            if (!c1272390jDR.LIZLLL) {
                                try {
                                    c1272390jDR.LIZJ.await(2L, TimeUnit.SECONDS);
                                } catch (InterruptedException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C786410Ut5.u3().interrupt();
                                    return;
                                }
                            }
                            c1272390jDR.LIZ.onData(buffer, i, i2, i3, j);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        };
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaPlayer streamId:");
        sbLIZ.append(str);
        sbLIZ.append(" mediaPlayerMode:");
        sbLIZ.append(enumC1269640j90);
        Surface surface = null;
        AVLog.logKibana(4, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LLILLL = interfaceC1271360jBm;
        this.LLILZ = str;
        this.LLILZLL = enumC1269640j90;
        this.LLJILJIL = new C0VVR(str);
        LIZIZ(r5);
        C1267500j5Y c1267500j5YLJJIIJZLJL = interfaceC1273910jFt.LJJIIJZLJL();
        if (c1267500j5YLJJIIJZLJL != null && (c1272810jE7 = c1267500j5YLJJIIJZLJL.LIZJ) != null && (c1268700j7U = (C1268700j7U) c1272810jE7.getService(C1268700j7U.class)) != null && (handlerLIZIZ = c1268700j7U.LIZIZ()) != null) {
            this.LLIZ = new C1271330jBj(handlerLIZIZ, c1271290jBf);
            this.LLILZIL = new C1272390jDR(interfaceC1273910jFt);
            C1271330jBj c1271330jBj = this.LLIZ;
            synchronized (c1271330jBj.LJII) {
                try {
                    if (!c1271330jBj.LJIIIIZZ) {
                        surface = c1271330jBj.LIZIZ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            setSurface(surface);
            this.LLIZLLLIL = c947150akr;
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MediaPlayer streamId:");
        sbLIZ2.append(str);
        sbLIZ2.append(" glHandler null");
        AVLog.logKibana(6, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ2), null);
    }
}

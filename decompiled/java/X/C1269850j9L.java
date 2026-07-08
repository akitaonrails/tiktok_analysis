package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS78S0200000_9;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.statics.VideoFrameStaticsManager;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0j9L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269850j9L implements InterfaceC1272840jEA {
    public final C0N3P LL;
    public final double LLILLJJLI;
    public final Map<EnumC1269840j9K, C1269860j9M> LLILLL;
    public VideoFrameStaticsManager LLILZ;
    public boolean LLILZIL;
    public final ARunnableS120S0100000_20 LLILZLL;

    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
        C0N3P c0n3p = this.LL;
        if (c0n3p != null) {
            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = this.LLILZLL;
            Handler handler = c0n3p.LLILLJJLI;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS78S0200000_9(c0n3p, aRunnableS120S0100000_20, 74));
            }
        }
        VideoFrameStaticsManager videoFrameStaticsManager = this.LLILZ;
        if (videoFrameStaticsManager != null) {
            videoFrameStaticsManager.release();
        }
        this.LLILZ = null;
    }

    public C1269850j9L(C1267500j5Y c1267500j5Y) {
        C0N3P c0n3p = (C0N3P) c1267500j5Y.LIZJ.getService(C0N3P.class);
        this.LL = c0n3p;
        c1267500j5Y.LIZ.ttlhABSettingsConfigs.getClass();
        this.LLILLJJLI = 2000.0d;
        c1267500j5Y.LIZ.ttlhABSettingsConfigs.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LLILLL = linkedHashMap;
        this.LLILZ = new VideoFrameStaticsManager();
        this.LLILZIL = true;
        final ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 299);
        this.LLILZLL = aRunnableS120S0100000_20;
        EnumC1269840j9K enumC1269840j9K = EnumC1269840j9K.DURATION_TYPE_CAPTURE;
        enumC1269840j9K.getType();
        linkedHashMap.put(enumC1269840j9K, new C1269860j9M());
        EnumC1269840j9K enumC1269840j9K2 = EnumC1269840j9K.DURATION_TYPE_PRE_EFFECT;
        enumC1269840j9K2.getType();
        linkedHashMap.put(enumC1269840j9K2, new C1269860j9M());
        EnumC1269840j9K enumC1269840j9K3 = EnumC1269840j9K.DURATION_TYPE_PRE_ENCODE;
        enumC1269840j9K3.getType();
        linkedHashMap.put(enumC1269840j9K3, new C1269860j9M());
        if (c0n3p != null) {
            final long j = (long) 2000.0d;
            if (c0n3p.LLILLJJLI == null) {
                synchronized (C0N3P.class) {
                    try {
                        if (c0n3p.LLILLJJLI == null) {
                            SafeHandlerThread safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(0, c0n3p.LL);
                            safeHandlerThreadLIZIZ.start();
                            c0n3p.LLILLJJLI = safeHandlerThreadLIZIZ.getHandler();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            final Handler handler = c0n3p.LLILLJJLI;
            Runnable runnable = new Runnable(j, handler, aRunnableS120S0100000_20) { // from class: X.0N3O
                public final Runnable LL;
                public final Handler LLILLJJLI;
                public final long LLILLL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TaskLooperService$WorkTaskWrapper@c39e.run");
                    try {
                        Handler handler2 = this.LLILLJJLI;
                        if (handler2 != null) {
                            C786410Ut5.LJLIIL(this.LLILLL, handler2, this);
                        }
                        this.LL.run();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TaskLooperService$WorkTaskWrapper@c39e.run");
                }

                {
                    this.LL = aRunnableS120S0100000_20;
                    this.LLILLJJLI = handler;
                    this.LLILLL = j;
                }
            };
            c0n3p.LLILLL.put(aRunnableS120S0100000_20, (C0N3O) runnable);
            Handler handler2 = c0n3p.LLILLJJLI;
            if (handler2 != null) {
                C786410Ut5.LJLIIL(j, handler2, runnable);
            }
        }
    }

    public final void LIZIZ(EnumC1269840j9K enumC1269840j9K, long j) {
        C1269860j9M c1269860j9M = (C1269860j9M) ((LinkedHashMap) this.LLILLL).get(enumC1269840j9K);
        if (c1269860j9M == null) {
            return;
        }
        synchronized (c1269860j9M) {
            try {
                LIZ(enumC1269840j9K, c1269860j9M.LIZ, c1269860j9M.LIZIZ, j);
                c1269860j9M.LIZ = 0;
                c1269860j9M.LIZIZ = 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(EnumC1269840j9K enumC1269840j9K, int i, int i2) {
        int type = enumC1269840j9K.getType();
        EnumC1269840j9K enumC1269840j9K2 = EnumC1269840j9K.DURATION_TYPE_LIVE;
        if (type == enumC1269840j9K2.getType()) {
            if (this.LLILZIL) {
                if (enumC1269840j9K == enumC1269840j9K2) {
                    LIZ(enumC1269840j9K, i, i2, (long) this.LLILLJJLI);
                    return;
                }
                return;
            } else {
                if (enumC1269840j9K != EnumC1269840j9K.DURATION_TYPE_LINKMIC) {
                    return;
                }
                LIZ(enumC1269840j9K, i, i2, (long) this.LLILLJJLI);
                return;
            }
        }
        C1269860j9M c1269860j9M = (C1269860j9M) ((LinkedHashMap) this.LLILLL).get(enumC1269840j9K);
        if (c1269860j9M == null) {
            return;
        }
        synchronized (c1269860j9M) {
            try {
                c1269860j9M.LIZ = i;
                c1269860j9M.LIZIZ = i2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ(EnumC1269840j9K enumC1269840j9K, int i, int i2, long j) {
        VideoFrameStaticsManager videoFrameStaticsManager;
        if (i > 0 && i2 > 0 && (videoFrameStaticsManager = this.LLILZ) != null) {
            videoFrameStaticsManager.record(enumC1269840j9K.getType(), i, i2, j);
        }
    }
}

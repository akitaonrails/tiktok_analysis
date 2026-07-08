package X;

import Y.ARunnableS0S0513200_20;
import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: X.0jBL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271090jBL implements InterfaceC1268830j7h, InterfaceC1267860j68 {
    public final AbstractC1273900jFs LL;
    public final C1271110jBN LLILLJJLI;
    public C1271130jBP LLILLL;
    public C1272750jE1 LLILZ;
    public final C1274250jGR LLILZIL;
    public boolean LLILZLL;
    public C589900NBs<InterfaceC1268830j7h> LLJIJIL;
    public C589900NBs<InterfaceC1267860j68> LLJILJIL;
    public C1271150jBR LLJILLL;
    public final C1267500j5Y LLJJ;
    public final C1270590jAX LLJJI;
    public final boolean LLJJIII;
    public final Object LLIZ = new Object();
    public final Object LLIZLLLIL = new Object();
    public final List<InterfaceC1268830j7h> LLJ = new ArrayList();
    public final List<InterfaceC1267860j68> LLJI = new ArrayList();
    public final RunnableC1270580jAW LLJILJILJ = new RunnableC1270580jAW(this);

    @Override // X.C0UHD
    public final void u(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
    }

    public final boolean LIZIZ() {
        AbstractC1273900jFs abstractC1273900jFs = this.LL;
        return abstractC1273900jFs != null && abstractC1273900jFs.LLD().LJLJI.LIZIZ && this.LLILZLL;
    }

    public final void LJ() {
        AbstractC1273900jFs abstractC1273900jFs = this.LL;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LLJZ(this);
            this.LL.LLJLL(this);
            C1270590jAX c1270590jAX = this.LLJJI;
            if (c1270590jAX != null && c1270590jAX.LLILLL == this) {
                c1270590jAX.LLILLL = null;
            }
            Handler handlerLLIL = this.LL.LLIL();
            if (handlerLLIL != null && this.LLJILJILJ.LL != null) {
                handlerLLIL.removeCallbacksAndMessages(this.LLJILJILJ);
                C786410Ut5.LJJZZIII(handlerLLIL, new ARunnableS120S0100000_20(this, 320));
            }
        }
        this.LLILZLL = false;
    }

    public final void LIZ(InterfaceC1268830j7h interfaceC1268830j7h) {
        if (this.LLJJIII) {
            C589900NBs<InterfaceC1268830j7h> c589900NBs = this.LLJIJIL;
            if (c589900NBs != null) {
                c589900NBs.LIZIZ(interfaceC1268830j7h);
                if (LIZIZ()) {
                    this.LL.LLLI(1);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this.LLIZ) {
            if (interfaceC1268830j7h != null) {
                try {
                    if (!((ArrayList) this.LLJ).contains(interfaceC1268830j7h)) {
                        ((ArrayList) this.LLJ).add(interfaceC1268830j7h);
                        if (LIZIZ()) {
                            this.LL.LLLI(1);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LIZLLL(InterfaceC1268830j7h interfaceC1268830j7h) {
        if (this.LLJJIII) {
            C589900NBs<InterfaceC1268830j7h> c589900NBs = this.LLJIJIL;
            if (c589900NBs != null) {
                c589900NBs.LIZJ(interfaceC1268830j7h);
                if (((ArrayList) c589900NBs.LIZ()).isEmpty() && LIZIZ()) {
                    this.LL.LLLI(0);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this.LLIZ) {
            if (interfaceC1268830j7h != null) {
                try {
                    ((ArrayList) this.LLJ).remove(interfaceC1268830j7h);
                    if (((ArrayList) this.LLJ).size() == 0 && LIZIZ()) {
                        this.LL.LLLI(0);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1271090jBL(X.C1274850jHP r4, X.AbstractC1273900jFs r5, X.C1274250jGR r6) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.LLIZ = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.LLIZLLLIL = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.LLJ = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.LLJI = r0
            X.0jAW r0 = new X.0jAW
            r0.<init>(r3)
            r3.LLJILJILJ = r0
            r3.LL = r5
            if (r5 == 0) goto L5f
            X.0j5Y r2 = r5.LJJIIJZLJL()
            r3.LLJJ = r2
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r2.LIZ
            com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs r0 = r0.ttlhABSettingsConfigs
            r0.getClass()
            com.ss.lyrax.video.MemoryConfig r1 = com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs.LJI
            boolean r0 = r1.getEnableMemoryOpt()
            if (r0 == 0) goto Lb3
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r2.LIZ
            com.ss.ttlivestreamer.livestreamv2.sdkparams.TTLHABSettingsConfigs r0 = r0.ttlhABSettingsConfigs
            r0.getClass()
            boolean r0 = r1.getDisableFrameListenerOpt()
            if (r0 != 0) goto Lb3
            r0 = 1
        L4d:
            r3.LLJJIII = r0
            X.0jE8 r1 = r5.LLIIIL()
            if (r1 == 0) goto L5f
            java.lang.Class<X.0jAX> r0 = X.C1270590jAX.class
            X.0jEA r0 = r1.getService(r0)
            X.0jAX r0 = (X.C1270590jAX) r0
            r3.LLJJI = r0
        L5f:
            X.0jBN r1 = new X.0jBN
            X.0j8W r0 = r5.LLD()
            r0.LJJIIZI()
            X.0j8W r0 = r5.LLD()
            r0.LJJIIJ()
            r1.<init>()
            r3.LLILLJJLI = r1
            r3.LLILZIL = r6
            X.0jE1 r0 = new X.0jE1
            r0.<init>(r3)
            r3.LLILZ = r0
            X.0jBP r0 = new X.0jBP
            r0.<init>(r3)
            r3.LLILLL = r0
            X.0j8W r0 = r5.LLD()
            X.0j8C r0 = r0.LJLJI
            boolean r0 = r0.LIZIZ
            if (r0 == 0) goto La0
            X.0jBR r2 = new X.0jBR
            X.0jBM r1 = new X.0jBM
            r1.<init>(r3)
            X.0j8W r0 = r5.LLD()
            int r0 = r0.LJJJ
            r2.<init>(r1, r0)
            r3.LLJILLL = r2
        La0:
            boolean r0 = r3.LLJJIII
            if (r0 == 0) goto Lb2
            X.0NBs r0 = new X.0NBs
            r0.<init>()
            r3.LLJIJIL = r0
            X.0NBs r0 = new X.0NBs
            r0.<init>()
            r3.LLJILJIL = r0
        Lb2:
            return
        Lb3:
            r0 = 0
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1271090jBL.<init>(X.0jHP, X.0jFs, X.0jGR):void");
    }

    @Override // X.InterfaceC1267860j68
    public final void LLILLIZIL(Buffer buffer, int i, int i2, int i3, long j) {
        ArrayList arrayList;
        if (this.LLJJIII) {
            C589900NBs<InterfaceC1267860j68> c589900NBs = this.LLJILJIL;
            if (c589900NBs != null) {
                Iterator it2 = ((ArrayList) c589900NBs.LIZ()).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1267860j68) it2.next()).LLILLIZIL(buffer, i, i2, i3, j);
                }
                return;
            }
            return;
        }
        synchronized (this.LLIZLLLIL) {
            try {
                arrayList = new ArrayList(this.LLJI);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC1267860j68) it3.next()).LLILLIZIL(buffer, i, i2, i3, j);
        }
    }

    @Override // X.InterfaceC1268830j7h
    public final void q0(ByteBuffer byteBuffer, int i, int i2, long j, Object... objArr) {
        ArrayList<InterfaceC1268830j7h> arrayList;
        if (this.LLJJIII) {
            C589900NBs<InterfaceC1268830j7h> c589900NBs = this.LLJIJIL;
            if (c589900NBs != null) {
                Iterator it2 = ((ArrayList) c589900NBs.LIZ()).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1268830j7h) it2.next()).q0(byteBuffer, i, i2, j, objArr);
                }
                return;
            }
            return;
        }
        synchronized (this.LLIZ) {
            try {
                arrayList = new ArrayList(this.LLJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (InterfaceC1268830j7h interfaceC1268830j7h : arrayList) {
            if (interfaceC1268830j7h != null) {
                interfaceC1268830j7h.q0(byteBuffer, i, i2, j, objArr);
            }
        }
    }

    public final void LIZJ(EGLContext eGLContext, int i, boolean z, InterfaceC1272490jDb interfaceC1272490jDb, int i2, int i3, long j, float[] fArr, long j2, Object... objArr) {
        ArrayList<C0UHD> arrayList;
        if (this.LLJJIII) {
            C589900NBs<InterfaceC1268830j7h> c589900NBs = this.LLJIJIL;
            if (c589900NBs != null) {
                Iterator it2 = ((ArrayList) c589900NBs.LIZ()).iterator();
                while (it2.hasNext()) {
                    ((C0UHD) it2.next()).LLLLZLL(eGLContext, i, z, interfaceC1272490jDb, i2, i3, j, fArr, j2, objArr);
                }
                return;
            }
            return;
        }
        synchronized (this.LLIZ) {
            try {
                arrayList = new ArrayList(this.LLJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (C0UHD c0uhd : arrayList) {
            if (c0uhd != null) {
                c0uhd.LLLLZLL(eGLContext, i, z, interfaceC1272490jDb, i2, i3, j, fArr, j2, objArr);
            }
        }
    }

    @Override // X.C0UHD
    public final void LLLLZLL(EGLContext eGLContext, int i, boolean z, InterfaceC1272490jDb interfaceC1272490jDb, int i2, int i3, long j, float[] fArr, long j2, Object... objArr) {
        long j3;
        C1267500j5Y c1267500j5Y = this.LLJJ;
        if (c1267500j5Y != null && c1267500j5Y.LIZIZ.LJ && this.LLILZLL) {
            long jCurrentTimeMs = TimeUtils.currentTimeMs();
            long millis = TimeUnit.NANOSECONDS.toMillis(j);
            if (millis > 10 + jCurrentTimeMs) {
                j3 = millis - jCurrentTimeMs;
            } else if (this.LLJILJILJ.LL != null) {
                j3 = 0;
            } else {
                j3 = -1;
            }
            Handler handlerLLIL = this.LL.LLIL();
            if (handlerLLIL != null && j3 >= 0) {
                if (this.LLJILJILJ.LL != null) {
                    InterfaceC1272490jDb interfaceC1272490jDb2 = this.LLJILJILJ.LLILLJJLI;
                    if (interfaceC1272490jDb2 != null) {
                        interfaceC1272490jDb2.release();
                    }
                    handlerLLIL.removeCallbacks(this.LLJILJILJ);
                }
                this.LLJILJILJ.LL = new ARunnableS0S0513200_20(objArr, this, eGLContext, i, z, i2, i3, j, interfaceC1272490jDb, j2, fArr, 1);
                this.LLJILJILJ.getClass();
                this.LLJILJILJ.LLILLJJLI = interfaceC1272490jDb;
                interfaceC1272490jDb.retain();
                if (!C786410Ut5.LJLIIL(j3, handlerLLIL, this.LLJILJILJ)) {
                    interfaceC1272490jDb.release();
                    this.LLJILJILJ.LL = null;
                    this.LLJILJILJ.LLILLJJLI = null;
                } else {
                    return;
                }
            }
        } else if (LIZIZ()) {
            C1271150jBR c1271150jBR = this.LLJILLL;
            if (c1271150jBR != null) {
                C1271090jBL c1271090jBL = ((C1271100jBM) c1271150jBR.LIZ).LIZ;
                C589900NBs<InterfaceC1268830j7h> c589900NBs = c1271090jBL.LLJIJIL;
                if (!c1271090jBL.LLJJIII || c589900NBs == null ? ((ArrayList) c1271090jBL.LLJ).size() <= 0 : !(!((ArrayList) c589900NBs.LIZ()).isEmpty())) {
                    ((C1271100jBM) c1271150jBR.LIZ).LIZ.LL.LLLI(0);
                    return;
                }
                ((C1271100jBM) c1271150jBR.LIZ).LIZ.LL.LLLI(1);
                synchronized (c1271150jBR) {
                    try {
                        if (c1271150jBR.LJIIIIZZ) {
                            return;
                        }
                        if (c1271150jBR.LJ == null) {
                            c1271150jBR.LJ = c1271150jBR.LIZLLL.getHandler();
                        }
                        interfaceC1272490jDb.retain();
                        if (!C786410Ut5.LJJZZIII(c1271150jBR.LJ, new ARunnableS0S0513200_20(c1271150jBR, interfaceC1272490jDb, eGLContext, i, z, i2, i3, j, fArr, j2, objArr, 0))) {
                            interfaceC1272490jDb.release();
                        }
                        if (c1271150jBR.LJFF == null) {
                            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(c1271150jBR, 318);
                            c1271150jBR.LJFF = aRunnableS120S0100000_20;
                            C786410Ut5.LJJZZIII(c1271150jBR.LJ, aRunnableS120S0100000_20);
                        }
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return;
        }
        LIZJ(eGLContext, i, z, interfaceC1272490jDb, i2, i3, j, fArr, j2, objArr);
    }
}

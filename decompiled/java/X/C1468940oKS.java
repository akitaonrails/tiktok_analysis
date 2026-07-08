package X;

import Y.ARunnableS10S0102000_23;
import Y.ARunnableS11S2100000_23;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS1S0200200_23;
import Y.ARunnableS23S0210000_23;
import Y.ARunnableS28S1100000_23;
import Y.ARunnableS29S0201000_23;
import Y.ARunnableS34S0101000_23;
import Y.ARunnableS42S0110000_23;
import Y.ARunnableS4S0111000_23;
import Y.ARunnableS56S0300000_23;
import Y.ARunnableS6S1101000_23;
import Y.ARunnableS6S2200000_23;
import Y.ARunnableS8S0100002_23;
import Y.ARunnableS92S0200000_23;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.AudioProcessor;
import com.ss.ttm.player.TraitObject;
import com.ss.ttm.player.s;
import com.ss.ttvideoengine.TTVideoEngineLooperThread2;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import cxo.s0;
import fyo.e;
import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0oKS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468940oKS extends C1466990oHJ {
    public boolean A6;
    public final TTVideoEngineLooperThread2 z6;

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJIILL() {
        this.LJLIIL.LJIJI = true;
        this.LJJIIJ = false;
        this.LJJIIJZLJL = true;
        this.z6.LJ(new ARunnableS123S0100000_23(this, 67));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final boolean LJIJJ() {
        if (!this.z6.LIZ(true)) {
            return LLILIL();
        }
        this.z6.LJI(156, -1L, null);
        this.z6.LIZLLL.setDataPosition(0);
        return this.z6.LIZLLL.readInt() == 1;
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJJIIJZLJL() {
        this.z6.LJ(new ARunnableS123S0100000_23(this, 75));
    }

    @Override // X.C1466990oHJ
    public final int LLIIZ() {
        if (this.G3 || !this.z6.LIZ(true)) {
            return LJJLIIIJ();
        }
        if (!this.z6.LJI(151, this.L3, null)) {
            return -1;
        }
        this.z6.LIZLLL.setDataPosition(0);
        return this.z6.LIZLLL.readInt();
    }

    @Override // X.C1466990oHJ
    public final void LLL() {
        this.z6.LJFF(new ARunnableS123S0100000_23(this, 73));
    }

    @Override // X.C1466990oHJ
    public final void LLLFZ() {
        this.z6.LJFF(new ARunnableS123S0100000_23(this, 81));
    }

    @Override // X.C1466990oHJ
    public final void LLLIIIIL() {
        this.z6.LJFF(new ARunnableS123S0100000_23(this, 69));
    }

    @Override // X.C1466990oHJ
    public final void LLLIIIL() {
        this.z6.LJFF(new ARunnableS123S0100000_23(this, 71));
    }

    @Override // X.C1466990oHJ
    public final void LLLIIL() {
        this.z6.LJFF(new ARunnableS123S0100000_23(this, 70));
    }

    @Override // X.C1466990oHJ
    public final void LLLIILIL() {
        if (this.z6.LIZIZ()) {
            this.z6.LIZLLL(406, 0, 0, this.LJLIIL.LJIL);
        } else {
            this.LLLLLZL.LJ(this.y5);
        }
    }

    @Override // X.C1466990oHJ
    public final void LLLILZ() {
        this.z6.LJFF(new ARunnableS123S0100000_23(this, 74));
    }

    @Override // X.AbstractC1467000oHK, X.InterfaceC1467390oHx
    public final boolean isMute() {
        C1467070oHR c1467070oHR = this.LJLIIL;
        if (c1467070oHR.LIZIZ != 3 || (!c1467070oHR.LJIJ && this.LJIILL != 2)) {
            return this.LJJJJ;
        }
        if (!this.z6.LIZ(true)) {
            return LJIIIZ();
        }
        this.z6.LJI(155, -1L, null);
        this.z6.LIZLLL.setDataPosition(0);
        return this.z6.LIZLLL.readInt() == 1;
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void pause() {
        this.z6.LJ(new ARunnableS123S0100000_23(this, 79));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void play() {
        this.z6.LJ(new ARunnableS123S0100000_23(this, 68));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void prepare() {
        this.z6.LJ(new ARunnableS123S0100000_23(this, 76));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void release() {
        this.LJLIIL.LJIJI = true;
        this.LJJIIJ = false;
        this.LJJIIJZLJL = true;
        this.z6.LJ(new ARunnableS123S0100000_23(this, 78));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void start() {
        this.z6.LJ(new ARunnableS123S0100000_23(this, 80));
    }

    @Override // X.C1466990oHJ
    public final void LJJLIIIJJI() {
        super.LJJLIIIJJI();
        TTVideoEngineLooperThread2 tTVideoEngineLooperThread2 = this.z6;
        tTVideoEngineLooperThread2.getClass();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" closeEngineLooperThread, handlerThread:");
        sbLIZ.append(tTVideoEngineLooperThread2.LIZ);
        sbLIZ.append(" ---TTVideoEnginePool");
        TTVideoEngineLog.d("TTVideoEngineLooperThread", C2188811AlT.LIZIZ(sbLIZ));
        Lock lock = tTVideoEngineLooperThread2.LIZJ;
        if (lock != null) {
            ((ReentrantLock) lock).lock();
            List<Condition> list = tTVideoEngineLooperThread2.LJIIIIZZ;
            if (list != null && !((ArrayList) list).isEmpty()) {
                for (int i2 = 0; i2 < ((ArrayList) tTVideoEngineLooperThread2.LJIIIIZZ).size(); i2++) {
                    ((Condition) ListProtector.get(tTVideoEngineLooperThread2.LJIIIIZZ, i2)).signalAll();
                }
                ((ArrayList) tTVideoEngineLooperThread2.LJIIIIZZ).clear();
            }
            TTVideoEngineLooperThread2.MessageHandler messageHandler = tTVideoEngineLooperThread2.LIZIZ;
            if (messageHandler != null) {
                messageHandler.removeCallbacksAndMessages(null);
                Looper looper = tTVideoEngineLooperThread2.LIZIZ.getLooper();
                if (!tTVideoEngineLooperThread2.LJIIJ || !tTVideoEngineLooperThread2.LJIIJJI) {
                    looper.quit();
                }
                tTVideoEngineLooperThread2.LIZIZ = null;
            }
            ((ReentrantLock) tTVideoEngineLooperThread2.LIZJ).unlock();
        }
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void stop() {
        boolean zLJI = MethodIDManager.LJI(71891);
        this.z6.LJ(new ARunnableS123S0100000_23(this, 72));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1468940oKS(X.C1467420oI0 r9) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1468940oKS.<init>(X.0oI0):void");
    }

    public static /* synthetic */ void LLLZL(C1468940oKS c1468940oKS) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.start$1L");
        super.start();
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.start$1L");
    }

    public static /* synthetic */ void LLLZLL(C1468940oKS c1468940oKS) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.prepare$1L");
        super.prepare();
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.prepare$1L");
    }

    public static /* synthetic */ void LLZL(C1468940oKS c1468940oKS) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.releaseAsync$1L");
        super.LJIILL();
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.releaseAsync$1L");
    }

    public static /* synthetic */ void LLZLL(C1468940oKS c1468940oKS) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.release$1L");
        super.release();
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.release$1L");
    }

    public static /* synthetic */ void LLZLLIL(C1468940oKS c1468940oKS) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.pause$1L");
        super.pause();
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.pause$1L");
    }

    public static /* synthetic */ void LLZZ(C1468940oKS c1468940oKS) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.play$1L");
        super.play();
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.play$1L");
    }

    public static /* synthetic */ void g(C1468940oKS c1468940oKS) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifySecondFrame$1L");
        super.LLLILZ();
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifySecondFrame$1L");
    }

    public static /* synthetic */ void h(C1468940oKS c1468940oKS) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.stop$1L");
        super.stop();
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.stop$1L");
    }

    public static /* synthetic */ void l(C1468940oKS c1468940oKS) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifyFirstAVSyncFrame$1L");
        super.LLLFZ();
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifyFirstAVSyncFrame$1L");
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LIZLLL(s sVar) {
        if (sVar != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setPlaybackParams:");
            sbLIZ.append(sVar);
            sbLIZ.append(", speed:");
            sbLIZ.append(sVar.LIZLLL);
            sbLIZ.append(", pitch:");
            sbLIZ.append(sVar.LIZJ);
            TTVideoEngineLog.d("TTVideoEngine", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LJIILLIIL = sVar;
        this.z6.LJ(new ARunnableS92S0200000_23(this, sVar, 52));
    }

    @Override // X.AbstractC1467000oHK, X.InterfaceC1467390oHx
    public final void LJ(boolean z) {
        this.z6.LJ(new ARunnableS42S0110000_23(this, z, 0));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJIJ(String str) {
        this.z6.LJ(new ARunnableS28S1100000_23(this, str, 13));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJIJI(String str) {
        this.z6.LJ(new ARunnableS28S1100000_23(this, str, 10));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJIL(InterfaceC1467050oHP interfaceC1467050oHP) {
        if (interfaceC1467050oHP == null) {
            return;
        }
        this.z6.LJ(new ARunnableS92S0200000_23(this, interfaceC1467050oHP, 42));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJJII(AudioProcessor audioProcessor) {
        if (this.T == 1) {
            this.z6.LJ(new ARunnableS92S0200000_23(this, audioProcessor, 56));
        } else {
            super.LJJII(audioProcessor);
        }
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJJIIJ(C1469110oKj c1469110oKj) {
        this.z6.LJ(new ARunnableS92S0200000_23(this, c1469110oKj, 44));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJJIIZ(String str) {
        this.z6.LJ(new ARunnableS28S1100000_23(this, str, 11));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJJIIZI(C1467630oIL c1467630oIL) {
        this.z6.LJ(new ARunnableS92S0200000_23(this, c1467630oIL, 43));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJJIJ(int[] iArr) {
        if (!LJJIJIIJIL()) {
            return;
        }
        this.z6.LJ(new ARunnableS92S0200000_23(this, iArr, 41));
    }

    @Override // X.C1466990oHJ, X.AbstractC1467000oHK
    public final void LJJJIL(InterfaceC1470080oMI interfaceC1470080oMI) {
        super.LJJJIL(interfaceC1470080oMI);
        if (this.F3 && !this.A6) {
            this.z6.LIZJ(24, null);
            this.A6 = true;
        }
    }

    @Override // X.C1466990oHJ
    public final void LJLIL(String str) {
        this.z6.LJ(new ARunnableS28S1100000_23(this, str, 12));
    }

    @Override // X.C1466990oHJ
    public final void LJLILLLLZI(InterfaceC1467050oHP interfaceC1467050oHP) {
        this.z6.LJ(new ARunnableS92S0200000_23(this, interfaceC1467050oHP, 57));
    }

    @Override // X.C1466990oHJ
    public final boolean LLIIIILZ(InterfaceC1467050oHP interfaceC1467050oHP) {
        if (this.z6.LIZIZ()) {
            if (this.LLLLIIL) {
                TTVideoEngineLooperThread2 tTVideoEngineLooperThread2 = this.z6;
                if (tTVideoEngineLooperThread2.LJ != null) {
                    HashMap map = new HashMap();
                    Condition conditionNewCondition = ((ReentrantLock) tTVideoEngineLooperThread2.LJFF).newCondition();
                    Message messageObtainMessage = tTVideoEngineLooperThread2.LJ.obtainMessage(411, 0, 0);
                    map.put("paramObj", interfaceC1467050oHP);
                    map.put("msgCond", conditionNewCondition);
                    try {
                        try {
                            ((ReentrantLock) tTVideoEngineLooperThread2.LJFF).lock();
                            tTVideoEngineLooperThread2.LJII = true;
                            messageObtainMessage.obj = map;
                            messageObtainMessage.sendToTarget();
                            conditionNewCondition.await();
                            tTVideoEngineLooperThread2.LJII = false;
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        ((ReentrantLock) tTVideoEngineLooperThread2.LJFF).unlock();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        ((ReentrantLock) tTVideoEngineLooperThread2.LJFF).unlock();
                        throw th;
                    }
                }
                this.z6.LJI.setDataPosition(0);
                if (this.z6.LJI.readInt() == 1) {
                    return true;
                }
            } else {
                this.z6.LIZLLL(411, 0, 0, interfaceC1467050oHP);
            }
        } else if (interfaceC1467050oHP instanceof C1470240oMY) {
            return this.LLLLZIL.LJJIIZI((C1470240oMY) interfaceC1467050oHP);
        }
        return false;
    }

    @Override // X.C1466990oHJ
    public final void LLIL(e eVar) {
        this.z6.LJFF(new ARunnableS92S0200000_23(this, eVar, 49));
    }

    @Override // X.C1466990oHJ
    public final void LLJLLIL(Map map) {
        this.z6.LJFF(new ARunnableS92S0200000_23(this, map, 51));
    }

    @Override // X.C1466990oHJ
    public final void LLJLLL(int i) {
        this.z6.LJFF(new ARunnableS34S0101000_23(this, i, 8));
    }

    @Override // X.C1466990oHJ
    public final void LLJZIJLIL(int i) {
        this.z6.LJFF(new ARunnableS34S0101000_23(this, i, 7));
        LJJLIIIJILLIZJL();
    }

    @Override // X.C1466990oHJ
    public final void LLLF(int i) {
        this.z6.LJFF(new ARunnableS34S0101000_23(this, i, 14));
    }

    @Override // X.C1466990oHJ
    public final void LLLFFI(InterfaceC1467050oHP interfaceC1467050oHP) {
        if (this.LLLLZIL == null) {
            return;
        }
        this.z6.LJFF(new ARunnableS92S0200000_23(this, interfaceC1467050oHP, 47));
    }

    @Override // X.C1466990oHJ
    public final void LLLII(int i) {
        this.z6.LJFF(new ARunnableS34S0101000_23(this, i, 13));
    }

    @Override // X.C1466990oHJ
    public final void LLLIIII(C1467860oIi c1467860oIi) {
        this.z6.LJFF(new ARunnableS92S0200000_23(this, c1467860oIi, 46));
    }

    @Override // X.C1466990oHJ
    public final void LLLILZJ(boolean z) {
        if (this.LJJIL == null) {
            return;
        }
        this.z6.LJFF(new ARunnableS42S0110000_23(this, z, 2));
    }

    @Override // X.C1466990oHJ
    public final void LLLILZLLLI(int i) {
        this.z6.LJFF(new ARunnableS34S0101000_23(this, i, 6));
    }

    @Override // X.C1466990oHJ
    public final void LLLJ(int i) {
        this.z6.LJFF(new ARunnableS34S0101000_23(this, i, 5));
    }

    @Override // X.C1466990oHJ
    public final void LLLJL(e eVar) {
        this.z6.LJFF(new ARunnableS92S0200000_23(this, eVar, 50));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void setLooping(boolean z) {
        this.z6.LJ(new ARunnableS42S0110000_23(this, z, 1));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void setSurface(Surface surface) {
        this.z6.LJ(new ARunnableS92S0200000_23(this, surface, 55));
    }

    public static /* synthetic */ void LLLZLZ(C1468940oKS c1468940oKS, InterfaceC1467050oHP interfaceC1467050oHP) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424._parseIPAddress$1L");
        super.LJLILLLLZI(interfaceC1467050oHP);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424._parseIPAddress$1L");
    }

    public static /* synthetic */ void LLLZZ(C1468940oKS c1468940oKS, int i) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifyLoadStateChanged$1L");
        super.LLLII(i);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifyLoadStateChanged$1L");
    }

    public static /* synthetic */ void LLZ(C1468940oKS c1468940oKS, String str) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setDirectURL$1L");
        super.LJIJI(str);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setDirectURL$1L");
    }

    public static /* synthetic */ void LLZILL(C1468940oKS c1468940oKS, String str) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setVideoID$1L");
        super.LJJIIZ(str);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setVideoID$1L");
    }

    public static /* synthetic */ void LLZLLLL(C1468940oKS c1468940oKS, boolean z) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setIsMute$1L");
        super.LJ(z);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setIsMute$1L");
    }

    public static /* synthetic */ void LLZZJLIL(C1468940oKS c1468940oKS, boolean z) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setLooping$1L");
        super.setLooping(z);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setLooping$1L");
    }

    public static /* synthetic */ void LLZZZIL(C1468940oKS c1468940oKS, String str) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setLocalURL$1L");
        super.LJIJ(str);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setLocalURL$1L");
    }

    public static /* synthetic */ void c(C1468940oKS c1468940oKS, AudioProcessor audioProcessor) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setAudioProcessor$1L");
        super.LJJII(audioProcessor);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setAudioProcessor$1L");
    }

    public static /* synthetic */ void e(C1468940oKS c1468940oKS, Surface surface) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setSurface$1L");
        super.setSurface(surface);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setSurface$1L");
    }

    public static /* synthetic */ void j(C1468940oKS c1468940oKS, InterfaceC1467050oHP interfaceC1467050oHP) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setVideoModel$1L");
        super.LJIL(interfaceC1467050oHP);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setVideoModel$1L");
    }

    public static /* synthetic */ void k(C1468940oKS c1468940oKS, int[] iArr) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setUnSupportSampleRates$1L");
        super.LJJIJ(iArr);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setUnSupportSampleRates$1L");
    }

    public static /* synthetic */ void m(C1468940oKS c1468940oKS, String str) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424._parseDNSComplete$1L");
        super.LJLIL(str);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424._parseDNSComplete$1L");
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LIZ(int i, String str) {
        this.z6.LJ(new ARunnableS6S1101000_23(this, i, str, 2));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LIZIZ(final int i, final long j) {
        this.z6.LJ(new Runnable() { // from class: X.0oKT
            @Override // java.lang.Runnable
            public final void run() {
                C1468940oKS.f(this.LL, i, j);
            }
        });
    }

    @Override // X.C1466990oHJ, X.AbstractC1467000oHK, X.InterfaceC1467390oHx
    public final void LIZJ(int i, int i2) {
        this.z6.LJ(new ARunnableS10S0102000_23(this, i, i2, 4));
    }

    @Override // X.AbstractC1467000oHK, X.InterfaceC1467390oHx
    public final void LJIILLIIL(float f, float f2) {
        this.z6.LJ(new ARunnableS8S0100002_23(this, f, f2, 0));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJIJJLI(int i, s0 s0Var) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("seek to time:");
        sbLIZ.append(i);
        C1471660oOq.LIZJ("TTVideoEngine", C2188811AlT.LIZIZ(sbLIZ));
        this.LJJIL = s0Var;
        if (this.LJIIIIZZ != null && this.LJLIIL.LJIIJ) {
            LLD(i, false);
        }
        this.z6.LJ(new ARunnableS34S0101000_23(this, i, 9));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJJ(int i, TraitObject traitObject) {
        this.z6.LJ(new ARunnableS29S0201000_23(i, this, traitObject, 1));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJJI(int i, String str) {
        this.z6.LJ(new ARunnableS6S1101000_23(this, i, str, 1));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJJIFFI(int i, boolean z) {
        this.z6.LJ(new ARunnableS4S0111000_23(this, i, z, 2));
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJJIII(String str, String str2) {
        this.z6.LJ(new ARunnableS11S2100000_23(this, str, str2, 6));
    }

    @Override // X.C1466990oHJ
    public final void LLILL(EnumC2281151EQn enumC2281151EQn, Map<Integer, String> map) {
        this.z6.LJ(new ARunnableS56S0300000_23(map, this, enumC2281151EQn, 12));
    }

    @Override // X.C1466990oHJ
    public final void LLLFF(C1467470oI5 c1467470oI5, boolean z) {
        if (this.LLLLZLL == null) {
            return;
        }
        if (this.z6.LIZIZ()) {
            if (z) {
                this.z6.LIZLLL(412, 0, 0, c1467470oI5);
                return;
            } else {
                this.z6.LIZJ(412, c1467470oI5);
                return;
            }
        }
        this.LLLLZLL.LJJJIL(c1467470oI5);
    }

    @Override // X.C1466990oHJ
    public final void LLLIL(int i, int i2) {
        this.z6.LJFF(new ARunnableS10S0102000_23(this, i, i2, 5));
    }

    @Override // X.C1466990oHJ
    public final void LLLIZZ(int i, int i2) {
        this.z6.LJFF(new ARunnableS10S0102000_23(this, i, i2, 6));
    }

    @Override // X.C1466990oHJ
    public final void LLLJIL(int i, EnumC2281151EQn enumC2281151EQn) {
        this.z6.LJFF(new ARunnableS29S0201000_23(i, this, enumC2281151EQn, 2));
    }

    @Override // X.C1466990oHJ
    public final void LLLLZI(SurfaceHolder surfaceHolder, boolean z) {
        this.z6.LJ(new ARunnableS23S0210000_23(this, surfaceHolder, 2));
    }

    public static /* synthetic */ void LLLZZIL(C1468940oKS c1468940oKS, int i, int i2) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setIntOption$1L");
        super.LIZJ(i, i2);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setIntOption$1L");
    }

    public static /* synthetic */ void LLZIL(C1468940oKS c1468940oKS, float f, float f2) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setVolume$1L");
        super.LJIILLIIL(f, f2);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setVolume$1L");
    }

    public static /* synthetic */ void LLZLI(C1468940oKS c1468940oKS, SurfaceHolder surfaceHolder, boolean z) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setSurfaceHolder$1L");
        super.LLLLZI(surfaceHolder, z);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setSurfaceHolder$1L");
    }

    public static /* synthetic */ void LLZZLLIL(C1468940oKS c1468940oKS, int i, String str) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setStringOption$1L");
        super.LIZ(i, str);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setStringOption$1L");
    }

    public static /* synthetic */ void LLZZZZ(C1468940oKS c1468940oKS, int i, TraitObject traitObject) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setTraitObject$1L");
        super.LJJ(i, traitObject);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setTraitObject$1L");
    }

    public static /* synthetic */ void a(C1468940oKS c1468940oKS, boolean z, int i) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setAsyncInit$1L");
        super.LJJIFFI(i, z);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setAsyncInit$1L");
    }

    public static /* synthetic */ void b(C1468940oKS c1468940oKS, String str, String str2) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setCustomHeader$1L");
        super.LJJIII(str, str2);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setCustomHeader$1L");
    }

    public static /* synthetic */ void f(C1468940oKS c1468940oKS, int i, long j) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setLongOption$1L");
        super.LIZIZ(i, j);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setLongOption$1L");
    }

    public static /* synthetic */ void i(C1468940oKS c1468940oKS, int i, String str) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setPlayAPIVersion$1L");
        super.LJJI(i, str);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.setPlayAPIVersion$1L");
    }

    @Override // X.C1466990oHJ, X.InterfaceC1467390oHx
    public final void LJIIZILJ(FileDescriptor fileDescriptor, long j, long j2) {
        this.z6.LJ(new ARunnableS1S0200200_23(this, fileDescriptor, j, j2, 1));
    }

    @Override // X.C1466990oHJ
    public final void LJLLLLLL(long j, Surface surface, boolean z) {
        if (surface == null) {
            this.E0 = System.currentTimeMillis();
        }
        try {
            if (this.z6.LIZ(false)) {
                if (this.v5 > 0) {
                    EngineThreadPool.addExecuteTaskSync(new ARunnableS92S0200000_23(this, surface, 45), j);
                    return;
                } else {
                    if (!this.z6.LJI(54, j, surface) && surface != null) {
                        this.F0 = 1;
                        return;
                    }
                    return;
                }
            }
            if (z) {
                EngineThreadPool.addExecuteTaskSync(new ARunnableS92S0200000_23(this, surface, 48), j);
            } else {
                LJJLIIIJLLLLLLLZ(surface);
            }
        } catch (TimeoutException e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC1467950oIr interfaceC1467950oIr = this.LJIIIIZZ;
            if (interfaceC1467950oIr != null) {
                ((C1470430oMr) interfaceC1467950oIr).LIZJ(35001, 1);
            }
        }
    }

    @Override // X.C1466990oHJ
    public final void LLJZ(int i, int i2, int i3) {
        if (this.z6.LIZIZ()) {
            HashMap map = new HashMap();
            map.put("bufferStartAction", Integer.valueOf(i3));
            map.put("traceid", this.LJLIIL.LJIL);
            this.z6.LIZLLL(415, i, i2, map);
            return;
        }
        this.LLLLLZL.LJJJLIIL(i, i2, i3);
    }

    @Override // X.C1466990oHJ
    public final void LLLLLLJ(String str, String str2, String[] strArr) {
        this.z6.LJ(new ARunnableS6S2200000_23(this, str, strArr, str2, 3));
    }

    public static /* synthetic */ void d(C1468940oKS c1468940oKS, FileDescriptor fileDescriptor, long j, long j2) {
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.setDataSource$1L");
        super.LJIIZILJ(fileDescriptor, j, j2);
        throw null;
    }

    @Override // X.C1466990oHJ
    public final void LLLI(final int i, final long j, final long j2, final Map<Integer, String> map) {
        this.z6.LJFF(new Runnable() { // from class: X.0oJ9
            @Override // java.lang.Runnable
            public final void run() {
                C1468940oKS c1468940oKS = this.LL;
                int i2 = i;
                long j3 = j;
                long j4 = j2;
                Map<Integer, String> map2 = map;
                c1468940oKS.getClass();
                C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifyFrameAboutToBeRendered$1L");
                c1468940oKS.LLLLLZL.LJJJJJL(c1468940oKS.y5, i2, j3, j4, map2);
                C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifyFrameAboutToBeRendered$1L");
            }
        });
    }
}

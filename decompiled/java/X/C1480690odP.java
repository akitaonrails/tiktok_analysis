package X;

import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.psmv3.DynamicConfig;
import com.ss.android.ugc.aweme.player.sdk.v3.MultimediaThreadPoolConfigV2;
import com.ss.android.ugc.aweme.player.sdk.v3.playsessionmanagerv5.AcceleratePlayHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0odP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480690odP implements InterfaceC1480570odD, InterfaceC1480720odS {
    public static volatile int LJIL;
    public static int LJJ;
    public final int LIZ;
    public final EnumC1479760obu LIZIZ;
    public final List<InterfaceC1480710odR> LIZJ;
    public List<InterfaceC1480710odR> LIZLLL;
    public InterfaceC1480710odR LJ;
    public InterfaceC1480710odR LJFF;
    public InterfaceC1480710odR LJI;
    public boolean LJII;
    public final boolean LJIIIIZZ;
    public InterfaceC1480330ocp LJIIIZ;
    public final C1480730odT LJIIJ;
    public volatile boolean LJIIJJI;
    public volatile boolean LJIIL;
    public final C1480750odV LJIILIIL;
    public final C1480780odY LJIILJJIL;
    public final C1480800oda LJIILL;
    public final C1480790odZ LJIILLIIL;
    public HandlerThread LJIIZILJ;
    public AcceleratePlayHandler LJIJ;
    public InterfaceC1472880oQo LJIJI;
    public final Object LJIJJ;
    public C1480770odX LJIJJLI;

    @Override // X.InterfaceC1480720odS
    public final InterfaceC1480710odR LIZLLL() {
        C1480440od0 c1480440od0LJIJI = LJIJI(null);
        this.LJFF = c1480440od0LJIJI;
        return c1480440od0LJIJI;
    }

    @Override // X.InterfaceC1480720odS
    public final InterfaceC1480710odR LJI() {
        C1480440od0 c1480440od0LJIJI = LJIJI(null);
        this.LJ = c1480440od0LJIJI;
        return c1480440od0LJIJI;
    }

    @Override // X.InterfaceC1480720odS
    public final void LJIIIIZZ() {
        this.LJIILIIL.LIZJ(this);
        this.LJIILIIL.LIZLLL();
    }

    @Override // X.InterfaceC1480720odS
    public final List<InterfaceC1480710odR> LJIIIZ() {
        ArrayList arrayList = new ArrayList(this.LIZJ);
        List<InterfaceC1480710odR> list = this.LIZLLL;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC1480710odR interfaceC1480710odR : this.LIZLLL) {
                if (!interfaceC1480710odR.LJJIJIIJIL()) {
                    arrayList.add(interfaceC1480710odR);
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1480720odS
    public final void LJIIL() {
        InterfaceC1480710odR interfaceC1480710odR = this.LJFF;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.release();
        }
        this.LJFF = null;
        InterfaceC1480710odR interfaceC1480710odR2 = this.LJI;
        if (interfaceC1480710odR2 != null) {
            interfaceC1480710odR2.release();
        }
        this.LJI = null;
        AcceleratePlayHandler acceleratePlayHandler = this.LJIJ;
        if (acceleratePlayHandler == null || acceleratePlayHandler.LLILLL) {
            return;
        }
        acceleratePlayHandler.sendEmptyMessage(3);
    }

    public final void LJIILL() {
        if (this.LJIIZILJ == null || this.LJIJ == null) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay acceleratePlayInit");
            }
            if (C1474810oTv.LLIILII()) {
                C1480770odX c1480770odXLIZ = C1484670ojp.LIZ.LIZ(EnumC1482310og1.VOD);
                this.LJIJJLI = c1480770odXLIZ;
                if (c1480770odXLIZ != null) {
                    this.LJIIZILJ = c1480770odXLIZ.LIZ;
                }
                if (this.LJIIZILJ == null) {
                    HandlerThread handlerThread = new HandlerThread("acceleratePlayHandlerThread", ((MultimediaThreadPoolConfigV2) C1474810oTv.N4.getValue()).vodThreadPriority);
                    this.LJIIZILJ = handlerThread;
                    handlerThread.start();
                    if (this.LJIJJLI == null) {
                        this.LJIJJLI = new C1480770odX(this.LJIIZILJ, "");
                    }
                    this.LJIJJLI.LIZ = this.LJIIZILJ;
                }
            } else {
                HandlerThread handlerThread2 = new HandlerThread("acceleratePlayHandlerThread");
                this.LJIIZILJ = handlerThread2;
                handlerThread2.start();
            }
            this.LJIJ = new AcceleratePlayHandler(this.LJIIZILJ, this);
        }
    }

    public final void LJIILLIIL() {
        synchronized (this.LJIJJ) {
            try {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("AcceleratePlay accelerateReset, acceleratePlayHandler");
                    sbLIZ.append(this.LJIJ);
                    sbLIZ.append("acceleratePlayHandlerThread");
                    sbLIZ.append(this.LJIIZILJ);
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LJIJ = null;
                this.LJIIZILJ = null;
                this.LJIIJJI = false;
                this.LJIIL = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJIJJ() {
        if (((Boolean) C1474810oTv.G4.getValue()).booleanValue() && this.LJIIJ.LIZ) {
            return false;
        }
        return this.LJIIJ.LIZIZ;
    }

    @Override // X.InterfaceC1480720odS
    public final void clean() {
        InterfaceC1480710odR interfaceC1480710odR;
        InterfaceC1480710odR interfaceC1480710odR2;
        if (((Boolean) C1474810oTv.LL.getValue()).booleanValue() && (interfaceC1480710odR2 = this.LJ) != null) {
            interfaceC1480710odR2.LJIL();
            this.LJ.release();
            this.LJ = null;
        }
        if (!((Boolean) C1474810oTv.LLD.getValue()).booleanValue() || (interfaceC1480710odR = this.LJFF) == null) {
            return;
        }
        interfaceC1480710odR.LJIL();
        this.LJFF.release();
        this.LJFF = null;
    }

    @Override // X.InterfaceC1480720odS
    public final void release() {
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release mCurrentSession:");
            sbLIZ.append(this.LJ);
            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1480710odR interfaceC1480710odR = this.LJ;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.release();
        }
        this.LJ = null;
        InterfaceC1480710odR interfaceC1480710odR2 = this.LJFF;
        if (interfaceC1480710odR2 != null) {
            interfaceC1480710odR2.release();
        }
        this.LJFF = null;
        InterfaceC1480710odR interfaceC1480710odR3 = this.LJI;
        if (interfaceC1480710odR3 != null) {
            interfaceC1480710odR3.release();
        }
        this.LJI = null;
        AcceleratePlayHandler acceleratePlayHandler = this.LJIJ;
        if (acceleratePlayHandler != null) {
            if (!acceleratePlayHandler.LLILLL) {
                acceleratePlayHandler.sendEmptyMessage(3);
            }
            if (C1474810oTv.LJ()) {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay release");
                }
                LJIILLIIL();
            }
        }
        if (this.LIZLLL != null) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("release session pool:");
                sbLIZ2.append(((CopyOnWriteArrayList) this.LIZLLL).size());
                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (((CopyOnWriteArrayList) this.LIZLLL).size() > 0) {
                Iterator it2 = ((CopyOnWriteArrayList) this.LIZLLL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1480710odR) it2.next()).release();
                }
            }
            ((CopyOnWriteArrayList) this.LIZLLL).clear();
        }
        ((CopyOnWriteArrayList) this.LIZJ).clear();
        this.LJII = true;
        this.LJIILIIL.LIZ();
        C1480750odV c1480750odV = this.LJIILIIL;
        c1480750odV.LJIIJJI = null;
        c1480750odV.LIZIZ(false);
        LJIL--;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("sessionManager release, mLocalManagerSessionId=");
            sbLIZ3.append(this.LIZ);
            sbLIZ3.append(", PlaySessionManagerCnt=");
            sbLIZ3.append(LJIL);
            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public final void LJIL() {
        if (C1474810oTv.LJ()) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AcceleratePlay resetAccelerateStatusInternal, acceleratePlayHandler");
                sbLIZ.append(this.LJIJ);
                sbLIZ.append("acceleratePlayHandlerThread");
                sbLIZ.append(this.LJIIZILJ);
                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LJIJ = null;
            if (this.LJIIZILJ != null) {
                if (C1474810oTv.LLIILII()) {
                    C1484670ojp.LIZ.LIZIZ(this.LJIJJLI);
                    this.LJIJJLI = null;
                } else {
                    this.LJIIZILJ.quitSafely();
                }
            }
            this.LJIIZILJ = null;
            this.LJIIJJI = false;
            this.LJIIL = false;
        }
    }

    @Override // X.InterfaceC1480720odS
    public final void LJJLIIIJLJLI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release prerender session:");
        sbLIZ.append(this.LJFF);
        C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1480710odR interfaceC1480710odR = this.LJFF;
        if (interfaceC1480710odR != null) {
            interfaceC1480710odR.release();
        }
        this.LJFF = null;
        InterfaceC1480710odR interfaceC1480710odR2 = this.LJI;
        if (interfaceC1480710odR2 != null) {
            interfaceC1480710odR2.release();
        }
        this.LJI = null;
    }

    @Override // X.InterfaceC1480720odS
    public final InterfaceC1480710odR LJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1480720odS
    public final List<InterfaceC1480710odR> LJIIJJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1480720odS
    public final void LIZIZ(InterfaceC1472880oQo interfaceC1472880oQo) {
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preCreateAccelerateSession ");
        }
        synchronized (this.LJIJJ) {
            try {
                if (this.LJIIJJI) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preCreateAccelerateSession return");
                    }
                    return;
                }
                LJIILL();
                if (!this.LJIJ.LLILLL) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preCreateAccelerateSession go");
                    }
                    this.LJIJI = interfaceC1472880oQo;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.obj = interfaceC1472880oQo;
                    this.LJIJ.sendMessage(messageObtain);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1480720odS
    public final void LJFF(Surface surface) {
        if (surface != null && surface.isValid()) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preCreateSurfaceSet ");
            }
            synchronized (this.LJIJJ) {
                try {
                    if (this.LJIIJJI) {
                        if (C1481110oe5.LIZ) {
                            C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preCreateSurfaceSet return");
                        }
                        return;
                    }
                    LJIILL();
                    if (!this.LJIJ.LLILLL) {
                        if (C1481110oe5.LIZ) {
                            C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preCreateSurfaceSet go");
                        }
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 4;
                        messageObtain.obj = surface;
                        this.LJIJ.sendMessage(messageObtain);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC1480720odS
    public final void LJIIJ(InterfaceC1480330ocp interfaceC1480330ocp) {
        this.LJIIIZ = interfaceC1480330ocp;
    }

    @Override // X.InterfaceC1480720odS
    public final void LJIILJJIL(boolean z) {
        InterfaceC1480710odR interfaceC1480710odR;
        this.LJIILIIL.LIZJ = z;
        if (!z && (interfaceC1480710odR = this.LJ) != null) {
            if (interfaceC1480710odR.isPlaying() || this.LJ.isLoading()) {
                LJIIIIZZ();
            }
        }
    }

    public final void LJIIZILJ(InterfaceC1480710odR interfaceC1480710odR) {
        C1480790odZ c1480790odZ = this.LJIILLIIL;
        if (interfaceC1480710odR != null) {
            List<InterfaceC1480710odR> list = c1480790odZ.LIZ.LIZLLL;
            if (list != null && !list.contains(interfaceC1480710odR)) {
                int size = c1480790odZ.LIZ.LIZLLL.size();
                C1480690odP c1480690odP = c1480790odZ.LIZ;
                if (size < c1480690odP.LJIIJ.LJFF) {
                    c1480690odP.LIZLLL.add(interfaceC1480710odR);
                    return;
                }
                ArrayList arrayList = new ArrayList(3);
                for (InterfaceC1480710odR interfaceC1480710odR2 : c1480790odZ.LIZ.LIZLLL) {
                    if (interfaceC1480710odR2.LJIIIZ() == interfaceC1480710odR.LJIIIZ()) {
                        interfaceC1480710odR.release();
                        return;
                    } else {
                        if (arrayList.contains(Integer.valueOf(interfaceC1480710odR2.LJIIIZ()))) {
                            c1480790odZ.LIZ.LIZLLL.remove(interfaceC1480710odR2);
                            interfaceC1480710odR2.release();
                            c1480790odZ.LIZ.LIZLLL.add(interfaceC1480710odR);
                            return;
                        }
                        arrayList.add(Integer.valueOf(interfaceC1480710odR2.LJIIIZ()));
                    }
                }
                if (1 == c1480790odZ.LIZ.LIZLLL.size()) {
                    InterfaceC1480710odR interfaceC1480710odR3 = (InterfaceC1480710odR) ListProtector.get(c1480790odZ.LIZ.LIZLLL, 0);
                    if (interfaceC1480710odR3 != null) {
                        interfaceC1480710odR3.release();
                    }
                    ListProtector.remove(c1480790odZ.LIZ.LIZLLL, 0);
                    c1480790odZ.LIZ.LIZLLL.add(interfaceC1480710odR);
                    return;
                }
                interfaceC1480710odR.release();
                return;
            }
            return;
        }
        c1480790odZ.getClass();
    }

    public final boolean LJIJ(InterfaceC1480710odR interfaceC1480710odR) {
        C1480790odZ c1480790odZ = this.LJIILLIIL;
        c1480790odZ.getClass();
        if (interfaceC1480710odR != null) {
            if (C1474810oTv.LJJIJIL() && !interfaceC1480710odR.LJIIZILJ()) {
                interfaceC1480710odR.reset();
                interfaceC1480710odR.release();
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "cacheSessionToPoolForNormalPlay: should not cache session for software decode");
                    return false;
                }
                return false;
            }
            if (((DynamicConfig) C1474810oTv.LJZI.getValue()).getDisableSRRecycle() && interfaceC1480710odR.LJ()) {
                interfaceC1480710odR.reset();
                interfaceC1480710odR.release();
                if (!C1481110oe5.LIZ) {
                    return false;
                }
                C1481110oe5.LIZIZ("PlaySessionManager", "cacheSessionToPoolForNormalPlay: should not cache session for sr decode");
                return false;
            }
            if (C1474810oTv.LJJJJL() && interfaceC1480710odR.LJIILJJIL()) {
                interfaceC1480710odR.reset();
                interfaceC1480710odR.release();
                if (!C1481110oe5.LIZ) {
                    return false;
                }
                C1481110oe5.LIZIZ("PlaySessionManager", "session force not reuse");
                return false;
            }
            if (c1480790odZ.LIZ.LJIIJ.LJIIJJI && interfaceC1480710odR.LJIIIZ() == 0) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cacheSessionToPoolForNormalPlay: should not cache session for 264, sessionId:");
                    sbLIZ.append(interfaceC1480710odR.getSessionId());
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
                }
                interfaceC1480710odR.reset();
                interfaceC1480710odR.release();
                return false;
            }
            ((CopyOnWriteArrayList) c1480790odZ.LIZ.LIZLLL).add(interfaceC1480710odR);
            return true;
        }
        return false;
    }

    public final C1480440od0 LJIJI(C1479510obV c1479510obV) {
        HandlerThread handlerThread;
        boolean z;
        HandlerThread handlerThread2;
        C1480780odY c1480780odY = this.LJIILJJIL;
        c1480780odY.getClass();
        C1480840ode c1480840ode = new C1480840ode();
        c1480840ode.LIZ = 0;
        C1480690odP c1480690odP = c1480780odY.LIZ;
        if (c1480690odP.LJII) {
            c1480690odP.LJII = false;
            c1480840ode.LIZ = 1;
        }
        C1480770odX c1480770odXLIZ = C1484670ojp.LIZ.LIZ(EnumC1482310og1.VOD);
        if (c1480770odXLIZ != null && (handlerThread2 = c1480770odXLIZ.LIZ) != null && C786410Ut5.W2(handlerThread2) != null) {
            handlerThread = c1480770odXLIZ.LIZ;
        } else {
            handlerThread = null;
        }
        C1480690odP c1480690odP2 = c1480780odY.LIZ;
        C1480730odT c1480730odT = c1480690odP2.LJIIJ;
        if (c1480730odT != null && c1480730odT.LJIILJJIL) {
            z = true;
        } else {
            z = false;
        }
        C1480440od0 c1480440od0 = new C1480440od0(c1480690odP2.LIZIZ, handlerThread, c1479510obV, c1480690odP2, c1480690odP2.LJIIIZ, c1480840ode, z, c1480690odP2.LIZ);
        c1480780odY.LIZ.LJIIJ.getClass();
        if (c1480770odXLIZ != null) {
            c1480440od0.LJJI = c1480770odXLIZ.LIZJ;
            HandlerThread handlerThread3 = c1480770odXLIZ.LIZ;
            if (handlerThread3 != null && C786410Ut5.W2(handlerThread3) != null) {
                c1480440od0.LJIJJ = c1480770odXLIZ.LIZIZ;
            }
        }
        return c1480440od0;
    }

    public final boolean LJJ(InterfaceC1480710odR interfaceC1480710odR) {
        boolean z;
        C1480790odZ c1480790odZ = this.LJIILLIIL;
        c1480790odZ.getClass();
        if (interfaceC1480710odR != null && !interfaceC1480710odR.LJIJJ() && !interfaceC1480710odR.LJII()) {
            C1480690odP c1480690odP = c1480790odZ.LIZ;
            if (c1480690odP.LJIIIIZZ) {
                c1480690odP.LJIIJ.getClass();
                C1480690odP c1480690odP2 = c1480790odZ.LIZ;
                C1480730odT c1480730odT = c1480690odP2.LJIIJ;
                if (c1480730odT.LJIIIIZZ ? c1480690odP2.LIZLLL == null : c1480690odP2.LJI != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (c1480730odT.LJII && c1480690odP2.LIZLLL != null && interfaceC1480710odR.LJIIIZ() == 0 && !((CopyOnWriteArrayList) c1480790odZ.LIZ.LIZLLL).isEmpty()) {
                    z = false;
                }
                if (c1480790odZ.LIZ.LJIIJ.LJIIJJI && interfaceC1480710odR.LJIIIZ() == 0) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("should not cache session for 264 codec, sessionId:");
                        sbLIZ.append(interfaceC1480710odR.getSessionId());
                        C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    z = false;
                }
                if (C1474810oTv.LJJIJIL() && !interfaceC1480710odR.LJIIZILJ()) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySessionManager", "should not cache session for software decode");
                    }
                    z = false;
                }
                if (((DynamicConfig) C1474810oTv.LJZI.getValue()).getDisableSRRecycle() && interfaceC1480710odR.LJ()) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySessionManager", "should not cache session for sr");
                    }
                    z = false;
                }
                if (C1474810oTv.LJJJJL() && interfaceC1480710odR.LJIILJJIL()) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySessionManager", "session force not reusable");
                    }
                } else {
                    return z;
                }
            }
        }
        return false;
    }

    public C1480690odP(EnumC1479760obu enumC1479760obu, C1480730odT c1480730odT) {
        this.LIZ = -1;
        ((Number) C1474810oTv.K3.getValue()).intValue();
        this.LJIIL = false;
        this.LJIJJ = new Object();
        this.LIZIZ = enumC1479760obu;
        this.LIZJ = new CopyOnWriteArrayList();
        this.LJIIJ = c1480730odT;
        if (c1480730odT == null) {
            this.LJIIJ = new C1480730odT();
        }
        C1480730odT c1480730odT2 = this.LJIIJ;
        if (c1480730odT2.LIZIZ && c1480730odT2.LJFF > 0) {
            this.LIZLLL = new CopyOnWriteArrayList();
        }
        C1480730odT c1480730odT3 = this.LJIIJ;
        if (c1480730odT3.LIZ) {
            c1480730odT3.LIZLLL = 1;
            c1480730odT3.LJ = 1;
        }
        if (c1480730odT3.LIZLLL == 1 && c1480730odT3.LJ == 1 && c1480730odT3.LIZIZ) {
            c1480730odT3.LJFF = 0;
        }
        if (c1480730odT.LIZLLL < 1) {
            c1480730odT.LIZLLL = 5;
        }
        int i = c1480730odT.LJ;
        int i2 = c1480730odT.LIZLLL;
        if (i > i2 || i < 1) {
            c1480730odT.LJ = i2;
        }
        if (c1480730odT3.LIZIZ) {
            int i3 = c1480730odT3.LJFF;
            int i4 = c1480730odT3.LJ;
            if (i3 > i4) {
                c1480730odT3.LJFF = i4;
            }
        }
        this.LJIIIIZZ = c1480730odT3.LJI;
        C1486540omq.LIZ();
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlaySessionMgr, config: ");
            sbLIZ.append(this.LJIIJ.toString());
            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        LJIL++;
        int i5 = LJJ + 1;
        LJJ = i5;
        this.LIZ = i5;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sessionManager create, mLocalManagerSessionId=");
            sbLIZ2.append(i5);
            sbLIZ2.append(", PlaySessionManagerCnt=");
            sbLIZ2.append(LJIL);
            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LJIILIIL = new C1480750odV();
        this.LJIILJJIL = new C1480780odY(this);
        this.LJIILL = new C1480800oda(this);
        this.LJIILLIIL = new C1480790odZ(this);
    }

    @Override // X.InterfaceC1480720odS
    public final void LIZ(C1479510obV c1479510obV, InterfaceC1480060ocO interfaceC1480060ocO) {
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preRenderAccelerateSession");
        }
        synchronized (this.LJIJJ) {
            try {
                if (this.LJIIJJI) {
                    if (C1481110oe5.LIZ) {
                        C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay preRenderAccelerateSession return");
                    }
                    return;
                }
                LJIILL();
                if (!this.LJIJ.LLILLL) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("AcceleratePlay preRenderAccelerateSession prepareData id ");
                        sbLIZ.append(c1479510obV.LJIIIZ);
                        C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 2;
                    c1479510obV.LIZ = interfaceC1480060ocO;
                    messageObtain.obj = c1479510obV;
                    this.LJIJ.sendMessage(messageObtain);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1480570odD
    public final void LIZJ(C1480440od0 c1480440od0, HandlerThread handlerThread) {
        Object objValueOf;
        ((CopyOnWriteArrayList) this.LIZJ).remove(c1480440od0);
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSessionRelease session:");
            sbLIZ.append(c1480440od0);
            sbLIZ.append(", session list size:");
            sbLIZ.append(((CopyOnWriteArrayList) this.LIZJ).size());
            sbLIZ.append(", session pool size:");
            List<InterfaceC1480710odR> list = this.LIZLLL;
            if (list == null) {
                objValueOf = "null";
            } else {
                objValueOf = Integer.valueOf(((CopyOnWriteArrayList) list).size());
            }
            sbLIZ.append(objValueOf);
            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1484670ojp.LIZ.LIZIZ(new C1480770odX(handlerThread, c1480440od0.LJIJJ));
    }

    @Override // X.InterfaceC1480720odS
    public final void LJII(C1479510obV c1479510obV, InterfaceC1480060ocO interfaceC1480060ocO) {
        InterfaceC1480710odR interfaceC1480710odR;
        InterfaceC1480710odR interfaceC1480710odR2;
        AcceleratePlayHandler acceleratePlayHandler;
        C1480590odF c1480590odFLJ;
        if (this.LJII) {
            return;
        }
        if (((Boolean) C1474810oTv.H2.getValue()).booleanValue() && (acceleratePlayHandler = this.LJIJ) != null && this.LJIIZILJ != null && !acceleratePlayHandler.LLILLL && !this.LJIJ.LL && (c1480590odFLJ = this.LJIJ.LJ()) != null) {
            if (TextUtils.equals(c1479510obV.LJIIIZ, c1480590odFLJ.LIZ)) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aps current or preparing, ignore id:");
                    sbLIZ.append(c1479510obV.LJIIIZ);
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            if (c1480590odFLJ.LJIJ()) {
                LJIJJLI(c1480590odFLJ, c1479510obV, interfaceC1480060ocO, false);
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("aps current precreate , prerender id:");
                    sbLIZ2.append(c1479510obV.LJIIIZ);
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                return;
            }
        }
        InterfaceC1480710odR interfaceC1480710odR3 = this.LJFF;
        InterfaceC1480710odR interfaceC1480710odR4 = null;
        if (interfaceC1480710odR3 != null && !interfaceC1480710odR3.LJIJJ() && !this.LJFF.LJII()) {
            if (TextUtils.equals(c1479510obV.LJIIIZ, this.LJFF.getKey()) || ((interfaceC1480710odR = this.LJ) != null && TextUtils.equals(c1479510obV.LJIIIZ, interfaceC1480710odR.getKey()))) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("current or preparing, ignore id:");
                    sbLIZ3.append(c1479510obV.LJIIIZ);
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                return;
            }
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("prepareSession drop missed mNextSession:");
                sbLIZ4.append(this.LJFF);
                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ4));
            }
            if (LJJ(this.LJFF) && ((interfaceC1480710odR2 = this.LJFF) == null || !interfaceC1480710odR2.LJIJ())) {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "prerender enable reuse ses: prepare session miss, will cache session");
                }
                this.LJFF.LJIL();
                if (!this.LJIIJ.LJIIIIZZ) {
                    this.LJI = this.LJFF;
                } else {
                    LJIIZILJ(this.LJFF);
                }
                ((CopyOnWriteArrayList) this.LIZJ).remove(this.LJFF);
                this.LJFF = null;
            } else if (!this.LJFF.LJIJ()) {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "prerender disable reuse ses: prepare session miss, will release session");
                }
                this.LJFF.reset();
                this.LJFF.release();
                this.LJFF = null;
            }
        }
        InterfaceC1480710odR interfaceC1480710odR5 = this.LJFF;
        if (interfaceC1480710odR5 == null || !interfaceC1480710odR5.LJIJ()) {
            C1480790odZ c1480790odZ = this.LJIILLIIL;
            C1480690odP c1480690odP = c1480790odZ.LIZ;
            if (c1480690odP.LJIIIIZZ) {
                c1480690odP.LJIIJ.getClass();
                C1480690odP c1480690odP2 = c1480790odZ.LIZ;
                if (!c1480690odP2.LJIIJ.LJIIIIZZ) {
                    InterfaceC1480710odR interfaceC1480710odR6 = c1480690odP2.LJI;
                    c1480690odP2.LJI = null;
                    interfaceC1480710odR4 = interfaceC1480710odR6;
                } else {
                    List<InterfaceC1480710odR> list = c1480690odP2.LIZLLL;
                    if (list != null && !((CopyOnWriteArrayList) list).isEmpty() && c1479510obV != null) {
                        c1480790odZ.LIZ.LJIIJ.getClass();
                        C1480690odP c1480690odP3 = c1480790odZ.LIZ;
                        if (!c1480690odP3.LJIIJ.LIZJ) {
                            interfaceC1480710odR4 = (InterfaceC1480710odR) ListProtector.get(c1480690odP3.LIZLLL, 0);
                            ((CopyOnWriteArrayList) c1480790odZ.LIZ.LIZLLL).remove(interfaceC1480710odR4);
                        } else {
                            String str = c1479510obV.LJIIIZ;
                            Iterator it2 = ((CopyOnWriteArrayList) c1480690odP3.LIZLLL).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    InterfaceC1480710odR interfaceC1480710odR7 = (InterfaceC1480710odR) it2.next();
                                    if (!TextUtils.isEmpty(str) && TextUtils.equals(interfaceC1480710odR7.getKey(), str)) {
                                        interfaceC1480710odR4 = interfaceC1480710odR7;
                                        break;
                                    }
                                    if (C1480530od9.LIZ(c1479510obV, interfaceC1480710odR7)) {
                                        interfaceC1480710odR4 = interfaceC1480710odR7;
                                    } else {
                                        interfaceC1480710odR7.LJIILIIL();
                                        if (C1481110oe5.LIZ) {
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("getSessionFromPollForPrerender shouldPreciseReuse is false, id:");
                                            sbLIZ5.append(c1479510obV.LJIIIZ);
                                            sbLIZ5.append(", sessionId:");
                                            sbLIZ5.append(interfaceC1480710odR7.getSessionId());
                                            sbLIZ5.append(", missMatchCnt:");
                                            sbLIZ5.append(interfaceC1480710odR7.LJIJI());
                                            sbLIZ5.append(", codecType:");
                                            sbLIZ5.append(interfaceC1480710odR7.LJIIIZ());
                                            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ5));
                                        }
                                        if (c1480790odZ.LIZ.LJIIJ.LJIIL > 0) {
                                            int iLJIJI = interfaceC1480710odR7.LJIJI();
                                            C1480690odP c1480690odP4 = c1480790odZ.LIZ;
                                            if (iLJIJI > c1480690odP4.LJIIJ.LJIIL) {
                                                ((CopyOnWriteArrayList) c1480690odP4.LIZLLL).remove(interfaceC1480710odR7);
                                                interfaceC1480710odR7.release();
                                                if (C1481110oe5.LIZ) {
                                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                    sbLIZ6.append("getSessionFromPollForPrerender release session because of missMatchCnt., sessionId:");
                                                    sbLIZ6.append(interfaceC1480710odR7.getSessionId());
                                                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ6));
                                                }
                                            }
                                        }
                                    }
                                } else if (interfaceC1480710odR4 != null) {
                                    break;
                                }
                            }
                            ((CopyOnWriteArrayList) c1480790odZ.LIZ.LIZLLL).remove(interfaceC1480710odR4);
                            interfaceC1480710odR4.LJIIJJI();
                        }
                    }
                }
            }
            this.LJFF = interfaceC1480710odR4;
        }
        InterfaceC1480710odR interfaceC1480710odR8 = this.LJFF;
        if (interfaceC1480710odR8 != null && interfaceC1480710odR8.LJIJ() && !interfaceC1480710odR8.LJII() && !interfaceC1480710odR8.LJIJJ()) {
            c1479510obV.LLIIII = 102;
            C1481110oe5.LIZIZ("AccelerateSessionMonitor", "updateStatus：render with rendered session");
        }
        if (this.LJFF == null) {
            this.LJFF = LJIJI(c1479510obV);
        }
        if (c1479510obV != null) {
            c1479510obV.LJIJJ = 1;
        }
        LJIJJLI(this.LJFF, c1479510obV, interfaceC1480060ocO, true);
    }

    @Override // X.InterfaceC1480720odS
    public final void LJIILIIL(C1479510obV c1479510obV, OnUIPlayListener onUIPlayListener, InterfaceC1480060ocO interfaceC1480060ocO) {
        boolean z;
        InterfaceC1480710odR interfaceC1480710odR;
        Object objValueOf;
        InterfaceC1480710odR interfaceC1480710odRLJIJI;
        Object objValueOf2;
        InterfaceC1480710odR interfaceC1480710odR2;
        C1480800oda c1480800oda = this.LJIILL;
        if (c1479510obV != null) {
            c1480800oda.getClass();
            System.currentTimeMillis();
        }
        InterfaceC1480710odR interfaceC1480710odR3 = c1480800oda.LIZ.LJ;
        boolean z2 = true;
        if (interfaceC1480710odR3 != null && interfaceC1480710odR3.LJJ()) {
            c1480800oda.LIZ.LJIIJ.getClass();
            if (((Boolean) C1474810oTv.g5.getValue()).booleanValue() && TextUtils.equals(c1479510obV.LJIIIZ, c1480800oda.LIZ.LJ.getKey())) {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay startSession skip reset");
                }
            } else {
                c1479510obV.LLIIII = 3;
                c1480800oda.LIZ.LJ = null;
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay startSession AcceleratePlaySession reset");
                }
                AcceleratePlayHandler acceleratePlayHandler = c1480800oda.LIZ.LJIJ;
                if (!acceleratePlayHandler.LLILLL) {
                    acceleratePlayHandler.sendEmptyMessage(3);
                }
                if (C1474810oTv.LJ()) {
                    c1480800oda.LIZ.LJIILLIIL();
                }
            }
        } else if (!c1480800oda.LIZ.LJIIJJI) {
            synchronized (c1480800oda.LIZ.LJIJJ) {
                try {
                    if (!c1480800oda.LIZ.LJIIL) {
                        c1480800oda.LIZ.LJIIJJI = true;
                        c1480800oda.LIZ.LJIIL = true;
                    }
                    C1480690odP c1480690odP = c1480800oda.LIZ;
                    AcceleratePlayHandler acceleratePlayHandler2 = c1480690odP.LJIJ;
                    if (acceleratePlayHandler2 != null && c1480690odP.LJIIZILJ != null && !acceleratePlayHandler2.LLILLL && !c1480800oda.LIZ.LJIJ.LL) {
                        C1480590odF c1480590odFLJ = c1480800oda.LIZ.LJIJ.LJ();
                        if (c1480590odFLJ != null && C1481110oe5.LIZ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("AcceleratePlay startSession AcceleratePlaySession ");
                            sbLIZ.append(c1480590odFLJ);
                            sbLIZ.append(", key is ");
                            sbLIZ.append(c1480590odFLJ.LIZ);
                            sbLIZ.append(", prepareData id ");
                            sbLIZ.append(c1479510obV.LJIIIZ);
                            sbLIZ.append(" ; AcceleratePlaySession is PreRendered ");
                            sbLIZ.append(c1480590odFLJ.LJJIFFI);
                            sbLIZ.append("; AcceleratePlaySession is preCreated ");
                            sbLIZ.append(c1480590odFLJ.LJJII);
                            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        c1480800oda.LIZ.LJIJ.LL = true;
                        if (c1480590odFLJ != null) {
                            if ((!c1480590odFLJ.LJJIFFI || !TextUtils.equals(c1479510obV.LJIIIZ, c1480590odFLJ.LIZ)) && !c1480590odFLJ.LJJII) {
                                if (C1481110oe5.LIZ) {
                                    C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay startSession1 release");
                                }
                                c1479510obV.LLIIII = 4;
                                AcceleratePlayHandler acceleratePlayHandler3 = c1480800oda.LIZ.LJIJ;
                                if (!acceleratePlayHandler3.LLILLL) {
                                    acceleratePlayHandler3.sendEmptyMessage(3);
                                }
                                if (C1474810oTv.LJ()) {
                                    if (C1481110oe5.LIZ) {
                                        C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay startSession AcceleratePlaySession reset, not match prerender");
                                    }
                                    c1480800oda.LIZ.LJIILLIIL();
                                }
                                if (onUIPlayListener != null) {
                                    onUIPlayListener.onPreRenderSessionMissed(c1480590odFLJ.LIZ);
                                }
                                C1481110oe5.LJFF(new Exception(), "AcceleratePlay startSession1 release not right");
                            } else {
                                if (C1481110oe5.LIZ) {
                                    C1481110oe5.LIZIZ("PlaySessionManager", "AcceleratePlay startSession prepare");
                                }
                                c1480800oda.LIZ.LJ = c1480590odFLJ;
                                c1480590odFLJ.LJJIJ(onUIPlayListener);
                                c1480800oda.LIZ.LJ.LJJLL(interfaceC1480060ocO);
                                if (c1480590odFLJ.LJJIFFI) {
                                    c1479510obV.LLIIII = 2;
                                } else if (c1480590odFLJ.LJJII) {
                                    c1479510obV.LLIIII = 1;
                                }
                                c1480800oda.LIZ.LJ.LJLIL(c1479510obV);
                                if (!c1479510obV.LJJI) {
                                    c1480800oda.LIZ.LJIIIIZZ();
                                }
                                return;
                            }
                        } else {
                            c1479510obV.LLIIII = 5;
                            c1480800oda.LIZ.LJIL();
                        }
                    } else if (c1480800oda.LIZ.LJIIJJI && C1474810oTv.LJ()) {
                        c1480800oda.LIZ.LJIL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        InterfaceC1480710odR interfaceC1480710odR4 = c1480800oda.LIZ.LJFF;
        if (interfaceC1480710odR4 != null && !interfaceC1480710odR4.LJIJJ() && !c1480800oda.LIZ.LJFF.LJII()) {
            if (TextUtils.equals(c1479510obV.LJIIIZ, c1480800oda.LIZ.LJFF.getKey())) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("startSession mNextSession:");
                    sbLIZ2.append(c1480800oda.LIZ.LJFF);
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ2));
                }
                C1480690odP c1480690odP2 = c1480800oda.LIZ;
                InterfaceC1480710odR interfaceC1480710odR5 = c1480690odP2.LJ;
                if (interfaceC1480710odR5 != null) {
                    if (c1480690odP2.LJJ(interfaceC1480710odR5)) {
                        if (C1481110oe5.LIZ) {
                            C1481110oe5.LIZIZ("PlaySessionManager", "prerender enable reuse ses, will cache session");
                        }
                        c1480800oda.LIZ.LJ.LJIL();
                        C1480690odP c1480690odP3 = c1480800oda.LIZ;
                        if (!c1480690odP3.LJIIJ.LJIIIIZZ) {
                            c1480690odP3.LJI = c1480690odP3.LJ;
                        } else {
                            c1480690odP3.LJIIZILJ(c1480690odP3.LJ);
                        }
                        C1480690odP c1480690odP4 = c1480800oda.LIZ;
                        ((CopyOnWriteArrayList) c1480690odP4.LIZJ).remove(c1480690odP4.LJ);
                    } else {
                        if (C1481110oe5.LIZ) {
                            C1481110oe5.LIZIZ("PlaySessionManager", "prerender disable reuse ses: will release session");
                        }
                        c1480800oda.LIZ.LJ.reset();
                        c1480800oda.LIZ.LJ.release();
                    }
                    c1480800oda.LIZ.LJ = null;
                }
                C1480690odP c1480690odP5 = c1480800oda.LIZ;
                InterfaceC1480710odR interfaceC1480710odR6 = c1480690odP5.LJFF;
                c1480690odP5.LJ = interfaceC1480710odR6;
                c1480690odP5.LJFF = null;
                interfaceC1480710odR6.LJJIJ(onUIPlayListener);
                c1480800oda.LIZ.LJ.LJJLL(interfaceC1480060ocO);
                c1480800oda.LIZ.LJ.LJLIL(c1479510obV);
                C1480690odP c1480690odP6 = c1480800oda.LIZ;
                if (!((CopyOnWriteArrayList) c1480690odP6.LIZJ).contains(c1480690odP6.LJ)) {
                    C1480690odP c1480690odP7 = c1480800oda.LIZ;
                    ((CopyOnWriteArrayList) c1480690odP7.LIZJ).add(c1480690odP7.LJ);
                }
                if (!c1479510obV.LJJI) {
                    c1480800oda.LIZ.LJIIIIZZ();
                    return;
                }
                return;
            }
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("startSession mNextSession missed, release:");
                sbLIZ3.append(c1480800oda.LIZ.LJFF);
                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (onUIPlayListener != null) {
                onUIPlayListener.onPreRenderSessionMissed(c1480800oda.LIZ.LJFF.getKey());
            }
            C1480690odP c1480690odP8 = c1480800oda.LIZ;
            if (c1480690odP8.LJJ(c1480690odP8.LJFF) && ((interfaceC1480710odR2 = c1480800oda.LIZ.LJFF) == null || !interfaceC1480710odR2.LJIJ())) {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "prerender enable reuse ses: start session miss, will cache session");
                }
                c1480800oda.LIZ.LJFF.LJIL();
                C1480690odP c1480690odP9 = c1480800oda.LIZ;
                if (!c1480690odP9.LJIIJ.LJIIIIZZ) {
                    c1480690odP9.LJI = c1480690odP9.LJFF;
                } else {
                    c1480690odP9.LJIIZILJ(c1480690odP9.LJFF);
                }
                C1480690odP c1480690odP10 = c1480800oda.LIZ;
                ((CopyOnWriteArrayList) c1480690odP10.LIZJ).remove(c1480690odP10.LJFF);
                c1480800oda.LIZ.LJFF = null;
            } else {
                if (C1481110oe5.LIZ) {
                    C1481110oe5.LIZIZ("PlaySessionManager", "prerender disable reuse ses: start session miss, will release session");
                }
                InterfaceC1480710odR interfaceC1480710odR7 = c1480800oda.LIZ.LJFF;
                if (interfaceC1480710odR7 != null && interfaceC1480710odR7.LJIJ() && !c1480800oda.LIZ.LJFF.LJIJJ() && !c1480800oda.LIZ.LJFF.LJII()) {
                    c1480800oda.LIZ.LJFF.LJIL();
                    C1480690odP c1480690odP11 = c1480800oda.LIZ;
                    InterfaceC1480710odR interfaceC1480710odR8 = c1480690odP11.LJFF;
                    c1480690odP11.LJ = interfaceC1480710odR8;
                    c1480690odP11.LJFF = null;
                    interfaceC1480710odR8.LJJIJ(onUIPlayListener);
                    c1480800oda.LIZ.LJ.LJJLL(interfaceC1480060ocO);
                    c1480800oda.LIZ.LJ.LJLIL(c1479510obV);
                    C1480690odP c1480690odP12 = c1480800oda.LIZ;
                    if (!((CopyOnWriteArrayList) c1480690odP12.LIZJ).contains(c1480690odP12.LJ)) {
                        C1480690odP c1480690odP13 = c1480800oda.LIZ;
                        ((CopyOnWriteArrayList) c1480690odP13.LIZJ).add(c1480690odP13.LJ);
                    }
                    c1479510obV.LLIIII = 101;
                    C1481110oe5.LIZIZ("AccelerateSessionMonitor", "updateStatus：play with created session");
                    if (c1479510obV.LJJI) {
                        return;
                    }
                    c1480800oda.LIZ.LJIIIIZZ();
                    return;
                }
                c1480800oda.LIZ.LJFF.reset();
                c1480800oda.LIZ.LJFF.release();
                c1480800oda.LIZ.LJFF = null;
            }
        }
        InterfaceC1480710odR interfaceC1480710odR9 = c1480800oda.LIZ.LJ;
        if (interfaceC1480710odR9 != null && ((TextUtils.equals(c1479510obV.LJIIIZ, interfaceC1480710odR9.getKey()) || c1480800oda.LIZ.LJ.LJIJ()) && !c1480800oda.LIZ.LJ.LJIJJ() && !c1480800oda.LIZ.LJ.LJII())) {
            z = false;
            c1480800oda.LIZ.LJ.LJIL();
        } else {
            z = true;
            if (c1480800oda.LIZ.LJIJJ()) {
                if (c1480800oda.LIZ.LJIIJ.LJFF == 0) {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("startSession single session reuse enabled, mCurrentSession:");
                        sbLIZ4.append(c1480800oda.LIZ.LJ);
                        C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    InterfaceC1480710odR interfaceC1480710odR10 = c1480800oda.LIZ.LJ;
                    if (interfaceC1480710odR10 != null) {
                        if (!interfaceC1480710odR10.LJIJJ() && !c1480800oda.LIZ.LJ.LJII()) {
                            z = false;
                            c1480800oda.LIZ.LJ.LJIL();
                            C1480690odP c1480690odP14 = c1480800oda.LIZ;
                            if (c1480690odP14.LJIIJ.LIZJ) {
                                if (c1480690odP14.LIZLLL == null) {
                                    c1480690odP14.LIZLLL = new CopyOnWriteArrayList();
                                }
                                int i = c1479510obV.LJIILIIL;
                                if (i == c1480800oda.LIZ.LJ.LJIIIZ()) {
                                    if (C1481110oe5.LIZ) {
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("startSession single session reuse, do reuse mCurrentSession:");
                                        sbLIZ5.append(c1480800oda.LIZ.LJ);
                                        sbLIZ5.append(", codecType:");
                                        sbLIZ5.append(i);
                                        sbLIZ5.append(", pool size:");
                                        sbLIZ5.append(((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).size());
                                        C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ5));
                                    }
                                } else {
                                    Iterator it2 = ((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        InterfaceC1480710odR interfaceC1480710odR11 = (InterfaceC1480710odR) it2.next();
                                        if (C1480530od9.LIZ(c1479510obV, interfaceC1480710odR11)) {
                                            if (interfaceC1480710odR11 != null) {
                                                C1480690odP c1480690odP15 = c1480800oda.LIZ;
                                                c1480690odP15.LJIJ(c1480690odP15.LJ);
                                                C1480690odP c1480690odP16 = c1480800oda.LIZ;
                                                c1480690odP16.LJ = interfaceC1480710odR11;
                                                ((CopyOnWriteArrayList) c1480690odP16.LIZLLL).remove(interfaceC1480710odR11);
                                                if (C1481110oe5.LIZ) {
                                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                    sbLIZ6.append("startSession single session reuse, do reuse same codec session:");
                                                    sbLIZ6.append(c1480800oda.LIZ.LJ);
                                                    sbLIZ6.append(", codecType:");
                                                    sbLIZ6.append(i);
                                                    sbLIZ6.append(", pool size:");
                                                    sbLIZ6.append(((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).size());
                                                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ6));
                                                }
                                            }
                                        }
                                    }
                                    C1480690odP c1480690odP17 = c1480800oda.LIZ;
                                    c1480690odP17.LJIJ(c1480690odP17.LJ);
                                    c1480800oda.LIZ.LJ = null;
                                    if (C1481110oe5.LIZ) {
                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                        sbLIZ7.append("startSession single session reuse, no same codec session reuse create. codecType:");
                                        sbLIZ7.append(i);
                                        sbLIZ7.append(", pool size:");
                                        sbLIZ7.append(((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).size());
                                        C1481110oe5.LIZLLL("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ7));
                                    }
                                    z = true;
                                    if (((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).size() > 1) {
                                        if (C1481110oe5.LIZ) {
                                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                            sbLIZ8.append("startSession single session reuse, pool unexpected size:");
                                            sbLIZ8.append(((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).size());
                                            C1481110oe5.LIZLLL("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ8));
                                        }
                                        Iterator it3 = ((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).iterator();
                                        while (it3.hasNext()) {
                                            ((InterfaceC1480710odR) it3.next()).release();
                                        }
                                        ((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).clear();
                                    }
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                } else {
                    if (C1481110oe5.LIZ) {
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append("startSession session pool enabled, session pool size:");
                        List<InterfaceC1480710odR> list = c1480800oda.LIZ.LIZLLL;
                        if (list == null) {
                            objValueOf = "null";
                        } else {
                            objValueOf = Integer.valueOf(((CopyOnWriteArrayList) list).size());
                        }
                        sbLIZ9.append(objValueOf);
                        C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ9));
                    }
                    C1480690odP c1480690odP18 = c1480800oda.LIZ;
                    C1480730odT c1480730odT = c1480690odP18.LJIIJ;
                    if (c1480730odT.LJIIIZ && !c1480730odT.LJIIJ && 1 == c1479510obV.LJIILIIL) {
                        InterfaceC1480710odR interfaceC1480710odR12 = c1480690odP18.LJ;
                        if (interfaceC1480710odR12 != null) {
                            interfaceC1480710odR12.release();
                            c1480800oda.LIZ.LJ = null;
                        }
                    } else {
                        c1480730odT.getClass();
                        C1480690odP c1480690odP19 = c1480800oda.LIZ;
                        if (c1480690odP19.LJIIJ.LJII && (interfaceC1480710odR = c1480690odP19.LJ) != null && c1479510obV.LJIILIIL == 0 && interfaceC1480710odR.LJIIIZ() == 0) {
                            c1480800oda.LIZ.LJ.reset();
                            z = false;
                        } else {
                            C1480690odP c1480690odP20 = c1480800oda.LIZ;
                            InterfaceC1480710odR interfaceC1480710odR13 = c1480690odP20.LJ;
                            List<InterfaceC1480710odR> list2 = c1480690odP20.LIZLLL;
                            if (list2 != null && ((CopyOnWriteArrayList) list2).size() > 0) {
                                String str = c1479510obV.LJIIIZ;
                                int i2 = c1479510obV.LJIILIIL;
                                Iterator it4 = ((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).iterator();
                                InterfaceC1480710odR interfaceC1480710odR14 = null;
                                while (true) {
                                    if (it4.hasNext()) {
                                        InterfaceC1480710odR interfaceC1480710odR15 = (InterfaceC1480710odR) it4.next();
                                        if (!TextUtils.isEmpty(str) && TextUtils.equals(interfaceC1480710odR15.getKey(), str)) {
                                            interfaceC1480710odR15.LJIIJJI();
                                            C1480690odP c1480690odP21 = c1480800oda.LIZ;
                                            c1480690odP21.LJ = interfaceC1480710odR15;
                                            ((CopyOnWriteArrayList) c1480690odP21.LIZLLL).remove(interfaceC1480710odR15);
                                            if (C1481110oe5.LIZ) {
                                                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                                sbLIZ10.append("startSession reuse session same key in pool:");
                                                sbLIZ10.append(c1480800oda.LIZ.LJ);
                                                sbLIZ10.append(", session pool size:");
                                                sbLIZ10.append(((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).size());
                                                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ10));
                                            }
                                        } else if (C1480530od9.LIZ(c1479510obV, interfaceC1480710odR15)) {
                                            interfaceC1480710odR14 = interfaceC1480710odR15;
                                        } else {
                                            interfaceC1480710odR15.LJIILIIL();
                                            if (C1481110oe5.LIZ) {
                                                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                                sbLIZ11.append("startSession shouldPreciseReuse is false, sessionId:");
                                                sbLIZ11.append(interfaceC1480710odR15.getSessionId());
                                                sbLIZ11.append("， missMatchCnt:");
                                                sbLIZ11.append(interfaceC1480710odR15.LJIJI());
                                                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ11));
                                            }
                                        }
                                    } else if (interfaceC1480710odR14 != null) {
                                        interfaceC1480710odR14.LJIIJJI();
                                        C1480690odP c1480690odP22 = c1480800oda.LIZ;
                                        c1480690odP22.LJ = interfaceC1480710odR14;
                                        ((CopyOnWriteArrayList) c1480690odP22.LIZLLL).remove(interfaceC1480710odR14);
                                        if (C1481110oe5.LIZ) {
                                            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                            sbLIZ12.append("startSession reuse session same codec in pool:");
                                            sbLIZ12.append(c1480800oda.LIZ.LJ);
                                            sbLIZ12.append(", codecType:");
                                            sbLIZ12.append(i2);
                                            sbLIZ12.append(", session pool size:");
                                            sbLIZ12.append(((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).size());
                                            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ12));
                                        }
                                    } else {
                                        c1480800oda.LIZ.LJ = null;
                                        if (C1481110oe5.LIZ) {
                                            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                            sbLIZ13.append("startSession reuse session no match, create codecType:");
                                            sbLIZ13.append(i2);
                                            sbLIZ13.append(", session pool size:");
                                            sbLIZ13.append(((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).size());
                                            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ13));
                                        }
                                        z = true;
                                    }
                                }
                                z = false;
                                if (C1481110oe5.LIZ) {
                                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                    sbLIZ14.append("startSession reuse session:");
                                    sbLIZ14.append(c1480800oda.LIZ.LJ);
                                    sbLIZ14.append(", session pool size:");
                                    sbLIZ14.append(((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).size());
                                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ14));
                                }
                                if (interfaceC1480710odR13 != null) {
                                    if (!((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).contains(interfaceC1480710odR13)) {
                                        if (((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).size() < c1480800oda.LIZ.LJIIJ.LJFF) {
                                            interfaceC1480710odR13.LJIL();
                                            c1480800oda.LIZ.LJIJ(interfaceC1480710odR13);
                                            if (C1481110oe5.LIZ) {
                                                StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                                                sbLIZ15.append("startSession recycle session:");
                                                sbLIZ15.append(interfaceC1480710odR13);
                                                sbLIZ15.append(", session pool size:");
                                                sbLIZ15.append(((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).size());
                                                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ15));
                                            }
                                        } else {
                                            ArrayList arrayList = new ArrayList(3);
                                            Iterator it5 = ((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    InterfaceC1480710odR interfaceC1480710odR16 = (InterfaceC1480710odR) it5.next();
                                                    if (interfaceC1480710odR16.LJIIIZ() == interfaceC1480710odR13.LJIIIZ()) {
                                                        interfaceC1480710odR13.release();
                                                        if (C1481110oe5.LIZ) {
                                                            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                                                            sbLIZ16.append("startSession pool full, release session1:");
                                                            sbLIZ16.append(interfaceC1480710odR13);
                                                            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ16));
                                                        }
                                                    } else if (arrayList.contains(Integer.valueOf(interfaceC1480710odR16.LJIIIZ()))) {
                                                        C1480690odP c1480690odP23 = c1480800oda.LIZ;
                                                        if (c1480690odP23.LJIIJ.LJIILIIL) {
                                                            if (c1480690odP23.LJIJ(interfaceC1480710odR13)) {
                                                                ((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).remove(interfaceC1480710odR16);
                                                                interfaceC1480710odR16.release();
                                                                c1480800oda.LIZ.getClass();
                                                                interfaceC1480710odR13.LJIL();
                                                            } else if (C1481110oe5.LIZ) {
                                                                C1481110oe5.LIZIZ("PlaySessionManager", "don't delete dupcodec because of cache session failed");
                                                            }
                                                        } else {
                                                            ((CopyOnWriteArrayList) c1480690odP23.LIZLLL).remove(interfaceC1480710odR16);
                                                            interfaceC1480710odR16.release();
                                                            c1480800oda.LIZ.getClass();
                                                            interfaceC1480710odR13.LJIL();
                                                            c1480800oda.LIZ.LJIJ(interfaceC1480710odR13);
                                                        }
                                                        if (C1481110oe5.LIZ) {
                                                            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                                                            sbLIZ17.append("startSession pool full, release session3:");
                                                            sbLIZ17.append(interfaceC1480710odR16);
                                                            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ17));
                                                        }
                                                    } else {
                                                        arrayList.add(Integer.valueOf(interfaceC1480710odR16.LJIIIZ()));
                                                    }
                                                } else if (1 == ((CopyOnWriteArrayList) c1480800oda.LIZ.LIZLLL).size()) {
                                                    C1480690odP c1480690odP24 = c1480800oda.LIZ;
                                                    if (c1480690odP24.LJIIJ.LJIILIIL) {
                                                        if (c1480690odP24.LJIJ(interfaceC1480710odR13)) {
                                                            InterfaceC1480710odR interfaceC1480710odR17 = (InterfaceC1480710odR) ListProtector.get(c1480800oda.LIZ.LIZLLL, 0);
                                                            if (interfaceC1480710odR17 != null) {
                                                                interfaceC1480710odR17.release();
                                                            }
                                                            ListProtector.remove(c1480800oda.LIZ.LIZLLL, 0);
                                                            c1480800oda.LIZ.getClass();
                                                            interfaceC1480710odR13.LJIL();
                                                        } else if (C1481110oe5.LIZ) {
                                                            C1481110oe5.LIZIZ("PlaySessionManager", "don't delete session when size is 1 because of cache session failed");
                                                        }
                                                    } else {
                                                        InterfaceC1480710odR interfaceC1480710odR18 = (InterfaceC1480710odR) ListProtector.get(c1480690odP24.LIZLLL, 0);
                                                        if (interfaceC1480710odR18 != null) {
                                                            interfaceC1480710odR18.release();
                                                        }
                                                        ListProtector.remove(c1480800oda.LIZ.LIZLLL, 0);
                                                        c1480800oda.LIZ.getClass();
                                                        interfaceC1480710odR13.LJIL();
                                                        c1480800oda.LIZ.LJIJ(interfaceC1480710odR13);
                                                    }
                                                    if (C1481110oe5.LIZ) {
                                                        StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                                                        sbLIZ18.append("startSession pool full, release session4:");
                                                        sbLIZ18.append((Object) null);
                                                        C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ18));
                                                    }
                                                } else {
                                                    interfaceC1480710odR13.release();
                                                    if (C1481110oe5.LIZ) {
                                                        StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                                                        sbLIZ19.append("startSession pool full, release session2:");
                                                        sbLIZ19.append(interfaceC1480710odR13);
                                                        C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ19));
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        c1480800oda.LIZ.getClass();
                                        interfaceC1480710odR13.LJIL();
                                    }
                                }
                            } else {
                                C1480690odP c1480690odP25 = c1480800oda.LIZ;
                                if (c1480690odP25.LIZLLL != null && interfaceC1480710odR13 != null) {
                                    if (c1480690odP25.LJIJ(interfaceC1480710odR13)) {
                                        c1480800oda.LIZ.getClass();
                                        interfaceC1480710odR13.LJIL();
                                    }
                                } else {
                                    InterfaceC1480710odR interfaceC1480710odR19 = c1480690odP25.LJ;
                                    if (interfaceC1480710odR19 != null && !interfaceC1480710odR19.LJIJJ() && !c1480800oda.LIZ.LJ.LJII()) {
                                        z2 = false;
                                    }
                                }
                                if (C1481110oe5.LIZ) {
                                    StringBuilder sbLIZ20 = C2188811AlT.LIZ();
                                    sbLIZ20.append("startSession pool empty, current session:");
                                    sbLIZ20.append(c1480800oda.LIZ.LJ);
                                    sbLIZ20.append(", createNewSession:");
                                    sbLIZ20.append(z2);
                                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ20));
                                }
                                z = z2;
                            }
                        }
                    }
                }
            } else {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ21 = C2188811AlT.LIZ();
                    sbLIZ21.append("startSession session reuse not enabled release current session:");
                    sbLIZ21.append(c1480800oda.LIZ.LJ);
                    C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ21));
                }
                InterfaceC1480710odR interfaceC1480710odR20 = c1480800oda.LIZ.LJ;
                if (interfaceC1480710odR20 != null) {
                    interfaceC1480710odR20.release();
                }
            }
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append("startSession createNewSession:");
            sbLIZ22.append(z);
            sbLIZ22.append(", session list size:");
            sbLIZ22.append(((CopyOnWriteArrayList) c1480800oda.LIZ.LIZJ).size());
            sbLIZ22.append(", session pool size:");
            List<InterfaceC1480710odR> list3 = c1480800oda.LIZ.LIZLLL;
            if (list3 == null) {
                objValueOf2 = "null";
            } else {
                objValueOf2 = Integer.valueOf(((CopyOnWriteArrayList) list3).size());
            }
            sbLIZ22.append(objValueOf2);
            C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ22));
        }
        if (z || (interfaceC1480710odRLJIJI = c1480800oda.LIZ.LJ) == null) {
            interfaceC1480710odRLJIJI = c1480800oda.LIZ.LJIJI(c1479510obV);
        }
        c1480800oda.LIZ.LJ = interfaceC1480710odRLJIJI;
        interfaceC1480710odRLJIJI.LJJIJ(onUIPlayListener);
        interfaceC1480710odRLJIJI.LJJLL(interfaceC1480060ocO);
        interfaceC1480710odRLJIJI.LJLIL(c1479510obV);
        if (!((CopyOnWriteArrayList) c1480800oda.LIZ.LIZJ).contains(interfaceC1480710odRLJIJI)) {
            ((CopyOnWriteArrayList) c1480800oda.LIZ.LIZJ).add(interfaceC1480710odRLJIJI);
        }
        if (c1479510obV.LJJI) {
            return;
        }
        c1480800oda.LIZ.LJIIIIZZ();
    }

    public final void LJIJJLI(InterfaceC1480710odR interfaceC1480710odR, C1479510obV c1479510obV, InterfaceC1480060ocO interfaceC1480060ocO, boolean z) {
        if (interfaceC1480710odR != null && c1479510obV != null) {
            Surface surface = c1479510obV.LJJIFFI;
            if (surface != null) {
                c1479510obV.LJIJJ = 2;
                interfaceC1480710odR.setSurface(surface);
            }
            interfaceC1480710odR.LJJLL(interfaceC1480060ocO);
            interfaceC1480710odR.LJLIL(c1479510obV);
            if (z && !((CopyOnWriteArrayList) this.LIZJ).contains(interfaceC1480710odR)) {
                ((CopyOnWriteArrayList) this.LIZJ).add(interfaceC1480710odR);
            }
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prepareSession mNextSession:");
                sbLIZ.append(interfaceC1480710odR);
                C1481110oe5.LIZIZ("PlaySessionManager", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!c1479510obV.LJJI) {
                LJIIIIZZ();
            }
        }
    }
}

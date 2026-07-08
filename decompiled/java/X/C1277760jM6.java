package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS21S0100100_20;
import Y.ARunnableS72S0200000_3;
import Y.ARunnableS89S0200000_20;
import android.os.Build;
import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.pusher.core.engine.AdaptiveController;
import com.ss.pusher.core.engine.MediaEncodeStream;
import com.ss.pusher.core.engine.VeLiveVideoAdapter;
import com.ss.pusher.core.opengl.GLThreadManager;
import com.ss.pusher.core.params.ProbeSpeedGear;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.params.PushStreamData;
import com.ss.pusher.core.params.StrategyConfiguration;
import com.ss.pusher.core.transport.LibRTMPTransport;
import com.ss.pusher.core.utils.AVLog;
import com.ss.pusher.core.utils.SafeHandlerThread;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.AwS634S0100000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0jM6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277760jM6 extends AbstractC1277570jLn implements InterfaceC1278410jN9 {
    public final String LIZ;
    public final SafeHandlerThread LIZIZ;
    public final SafeHandlerThread LIZJ;
    public final C1278910jNx LIZLLL;
    public final C1277960jMQ LJ;
    public final C1278760jNi LJFF;
    public final C1278740jNg LJI;
    public final C1277770jM7 LJII;
    public AdaptiveController LJIIIIZZ;
    public final boolean LJIIIZ;

    @Override // X.AbstractC1277570jLn
    public final int enableCalculateAudioLoudness(boolean z) {
        return -1;
    }

    public final boolean LIZIZ() {
        C1278920jNy c1278920jNy = this.LJFF.LLJ;
        return Intrinsics.LJFF(c1278920jNy, C1278920jNy.LJFF) || Intrinsics.LJFF(c1278920jNy, C1278920jNy.LJ);
    }

    @Override // X.AbstractC1277570jLn
    public final void doStopPush() {
        if (this.LJIIIZ) {
            synchronized (this.LIZLLL) {
                try {
                    AdaptiveController adaptiveController = this.LJIIIIZZ;
                    if (adaptiveController != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("stop: ");
                        sbLIZ.append(adaptiveController);
                        AVLog.iod("AdaptiveController", C2188811AlT.LIZIZ(sbLIZ));
                        adaptiveController.LJIIJJI();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            AdaptiveController adaptiveController2 = this.LJIIIIZZ;
            if (adaptiveController2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("stop: ");
                sbLIZ2.append(adaptiveController2);
                AVLog.iod("AdaptiveController", C2188811AlT.LIZIZ(sbLIZ2));
                adaptiveController2.LJIIJJI();
            }
        }
        this.LJFF.LJII();
    }

    @Override // X.AbstractC1277570jLn
    public final boolean isPushing() {
        return this.LJFF.LLJ == C1278920jNy.LJFF;
    }

    @Override // X.AbstractC1277570jLn
    public final void release() {
        super.release();
        this.LJI.LIZLLL(false);
        if (this.LJIIIZ) {
            synchronized (this.LIZLLL) {
                try {
                    AdaptiveController adaptiveController = this.LJIIIIZZ;
                    if (adaptiveController != null) {
                        adaptiveController.LJII();
                    }
                    this.LJIIIIZZ = null;
                    C1278910jNx c1278910jNx = this.LIZLLL;
                    c1278910jNx.getClass();
                    c1278910jNx.LJIJ = new WeakReference<>(null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            AdaptiveController adaptiveController2 = this.LJIIIIZZ;
            if (adaptiveController2 != null) {
                adaptiveController2.LJII();
            }
        }
        this.LJFF.LJII();
        this.LJ.LIZ.set(true);
        this.LJFF.LJFF();
        SafeHandlerThread safeHandlerThread = this.LIZIZ;
        LIZJ(safeHandlerThread, (SafeHandlerThread.SafeHandler) safeHandlerThread.getHandler());
        SafeHandlerThread safeHandlerThread2 = this.LIZJ;
        LIZJ(safeHandlerThread2, (SafeHandlerThread.SafeHandler) safeHandlerThread2.getHandler());
        setObserver(null);
        setStatisticsObserver(null, 0);
        this.config.LJI.mPushBase.getClass();
        AVLog.iow(this.LIZ, "GLThreadManager dispose. The singleton shall be destroyed if this is the last VeLivePusher instance.");
        GLThreadManager.LIZJ();
        AVLog.iow(this.LIZ, "GLThreadManager dispose done");
    }

    @Override // X.AbstractC1277570jLn
    public final EnumC1277890jMJ getSessionVersion() {
        return EnumC1277890jMJ.LiveStreamSession_V1;
    }

    @Override // X.AbstractC1277570jLn
    public final EnumC1277950jMP resetLiveVideoPerformanceConfig() {
        return EnumC1277950jMP.Success;
    }

    public C1277760jM6(C1277590jLp c1277590jLp) {
        super(c1277590jLp);
        this.LIZ = "VeLivePusherImp";
        this.LJIIIZ = c1277590jLp.LJI.switchParams.LJFF;
        AVLog.disableLogFile(true);
        AVLog.ioi("VeLivePusherImp", "SDK: 7.22.0.93900/release");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Android OS: ");
        sbLIZ.append(Build.VERSION.SDK_INT);
        sbLIZ.append('(');
        sbLIZ.append(Build.VERSION.RELEASE);
        sbLIZ.append(')');
        AVLog.ioi("VeLivePusherImp", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("DevicesName: ");
        sbLIZ2.append(Build.MODEL);
        AVLog.ioi("VeLivePusherImp", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("create VeLivePusher ");
        sbLIZ3.append(this);
        AVLog.ioi("VeLivePusherImp", C2188811AlT.LIZIZ(sbLIZ3));
        C1279370jOh.LIZ = this.config.LJI.mPushBase.LJJJJ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("GLThreadManager using auto recycler ");
        sbLIZ4.append(false);
        AVLog.iow("VeLivePusherImp", C2188811AlT.LIZIZ(sbLIZ4));
        GLThreadManager.LIZ();
        SafeHandlerThread safeHandlerThread = new SafeHandlerThread("VeLiveWorkThread");
        this.LIZIZ = safeHandlerThread;
        SafeHandlerThread safeHandlerThread2 = new SafeHandlerThread("VeLiveMiscThread");
        this.LIZJ = safeHandlerThread2;
        safeHandlerThread.start();
        safeHandlerThread2.setPriority(1);
        safeHandlerThread2.start();
        C1278910jNx c1278910jNx = new C1278910jNx((SafeHandlerThread.SafeHandler) safeHandlerThread.getHandler(), (SafeHandlerThread.SafeHandler) safeHandlerThread2.getHandler(), c1277590jLp);
        this.LIZLLL = c1278910jNx;
        c1278910jNx.LIZLLL = this;
        C1278740jNg c1278740jNg = new C1278740jNg(c1277590jLp, this.LIZLLL);
        this.LJI = c1278740jNg;
        InterfaceC1278600jNS interfaceC1278600jNS = c1277590jLp.LJ;
        if (interfaceC1278600jNS != null) {
            c1278740jNg.LJ(interfaceC1278600jNS, c1277590jLp.LJI.mPushBase.LJJIZ);
        }
        this.LJFF = new C1278760jNi(c1277590jLp, this.LIZLLL);
        this.LJ = new C1277960jMQ(this.LIZLLL);
        c1278740jNg.LIZLLL(true);
        this.LJII = new C1277770jM7(this.LIZLLL);
        StrategyConfiguration strategyConfiguration = c1277590jLp.LJI.strategyConfiguration;
        String str = c1277590jLp.LIZJ;
        AwS634S0100000_20 awS634S0100000_20 = new AwS634S0100000_20(this, 6);
        if (strategyConfiguration != null && str != null) {
            awS634S0100000_20.invoke(strategyConfiguration, str);
        }
    }

    @Override // X.AbstractC1277570jLn
    public final int doPushExternalAudioFrame(C1278180jMm c1278180jMm) {
        MediaEncodeStream mediaEncodeStream;
        C1278760jNi c1278760jNi = this.LJFF;
        if (c1278760jNi.LLJILLL != null && c1278760jNi.LLJ == C1278920jNy.LJFF && (mediaEncodeStream = c1278760jNi.LLJILLL) != null) {
            ByteBuffer byteBuffer = c1278180jMm.LIZLLL;
            mediaEncodeStream.LIZLLL(byteBuffer, byteBuffer.remaining() / ((c1278180jMm.LIZIZ.getChannel() * 16) / 8), c1278180jMm.LIZ.getSampleRate(), c1278180jMm.LIZIZ.getChannel(), c1278180jMm.LIZJ / 1000);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c7  */
    @Override // X.AbstractC1277570jLn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int doPushExternalVideoFrame(X.C1277560jLm r30) {
        /*
            Method dump skipped, instruction units count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1277760jM6.doPushExternalVideoFrame(X.0jLm):int");
    }

    @Override // X.AbstractC1277570jLn
    public final void setObserver(InterfaceC1277660jLw interfaceC1277660jLw) {
        C1277770jM7 c1277770jM7 = this.LJII;
        if (interfaceC1277660jLw == null) {
            interfaceC1277660jLw = c1277770jM7.LIZJ;
        }
        c1277770jM7.LIZLLL = interfaceC1277660jLw;
    }

    @Override // X.AbstractC1277570jLn
    public final int setProperty(InterfaceC1277930jMN interfaceC1277930jMN) {
        if (!interfaceC1277930jMN.isValid()) {
            return -100;
        }
        if (interfaceC1277930jMN instanceof C1268990j7x) {
            C1278760jNi c1278760jNi = this.LJFF;
            long j = ((C1268990j7x) interfaceC1277930jMN).LIZ;
            C1278930jNz c1278930jNz = c1278760jNi.LLILLL.LJFF;
            if (c1278930jNz.LIZ.LJJ) {
                C786410Ut5.LJJZZIII(c1278930jNz.LIZIZ.LIZ, new ARunnableS21S0100100_20(j, c1278930jNz, 15));
            }
            this.enableNTPTiming = true;
        } else if (interfaceC1277930jMN instanceof C1278210jMp) {
            C1278210jMp c1278210jMp = (C1278210jMp) interfaceC1277930jMN;
            handleUserMetadata(c1278210jMp);
            C1278760jNi c1278760jNi2 = this.LJFF;
            c1278760jNi2.getClass();
            if (c1278210jMp.isValid()) {
                C1278940jO0 c1278940jO0 = c1278760jNi2.LLILLL;
                C1278930jNz c1278930jNz2 = c1278940jO0.LJFF;
                LibRTMPTransport libRTMPTransport = c1278940jO0.LJIIL;
                c1278930jNz2.LIZJ.put(c1278210jMp.LIZ, c1278210jMp);
                C786410Ut5.LJJZZIII(c1278930jNz2.LIZIZ.LIZ, new ARunnableS89S0200000_20(c1278210jMp, libRTMPTransport, 245));
                return 0;
            }
        } else {
            if (interfaceC1277930jMN instanceof C1278520jNK) {
                C1278760jNi c1278760jNi3 = this.LJFF;
                C1278520jNK c1278520jNK = (C1278520jNK) interfaceC1277930jMN;
                c1278760jNi3.LLIZLLLIL.LIZJ(c1278520jNK.LIZ);
                c1278520jNK.LIZ.release();
                return 0;
            }
            if (interfaceC1277930jMN instanceof C1278540jNM) {
                if (LIZIZ()) {
                    return -1;
                }
                PushBase pushBase = this.config.LJI.mPushBase;
                C1278540jNM c1278540jNM = (C1278540jNM) interfaceC1277930jMN;
                pushBase.width = c1278540jNM.LIZ;
                pushBase.height = c1278540jNM.LIZIZ;
                String str = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setOutputImageSize: (");
                sbLIZ.append(c1278540jNM.LIZ);
                sbLIZ.append('x');
                sbLIZ.append(c1278540jNM.LIZIZ);
                sbLIZ.append(')');
                AVLog.logKibana(4, str, C2188811AlT.LIZIZ(sbLIZ), null);
                ProbeSpeedGear probeSpeedGearLIZ = C1277620jLs.LIZ(this.config.LJI, c1278540jNM.LIZ, c1278540jNM.LIZIZ, pushBase.fps);
                if (probeSpeedGearLIZ != null) {
                    pushBase.defaultBitrate = probeSpeedGearLIZ.defaultBitrate;
                    pushBase.minBitrate = probeSpeedGearLIZ.minBitrate;
                    int i = probeSpeedGearLIZ.maxBitrate;
                    pushBase.maxBitrate = i;
                    updatePerformanceMaxVideoBitrate(i);
                }
                if (this.LJIIIZ) {
                    synchronized (this.LIZLLL) {
                        try {
                            AdaptiveController adaptiveController = this.LJIIIIZZ;
                            if (adaptiveController != null) {
                                adaptiveController.LJIIIIZZ(((C1278540jNM) interfaceC1277930jMN).LIZ, ((C1278540jNM) interfaceC1277930jMN).LIZIZ);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    return 0;
                }
                AdaptiveController adaptiveController2 = this.LJIIIIZZ;
                if (adaptiveController2 != null) {
                    adaptiveController2.LJIIIIZZ(c1278540jNM.LIZ, c1278540jNM.LIZIZ);
                    return 0;
                }
            } else {
                if (interfaceC1277930jMN instanceof C1279350jOf) {
                    this.config.LJI.mPushBase.LIZ = 0;
                    return 0;
                }
                if (interfaceC1277930jMN instanceof C1269290j8R) {
                    if (LIZIZ()) {
                        return 0;
                    }
                    this.config.LJI.mPushBase.fps = ((C1269290j8R) interfaceC1277930jMN).LIZ;
                    String str2 = this.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("set ");
                    sbLIZ2.append(interfaceC1277930jMN);
                    AVLog.logKibana(4, str2, C2188811AlT.LIZIZ(sbLIZ2), null);
                    return 0;
                }
                if (interfaceC1277930jMN instanceof C1270090j9j) {
                    if (LIZIZ()) {
                        return -1;
                    }
                    PushBase pushBase2 = this.config.LJI.mPushBase;
                    C1270090j9j c1270090j9j = (C1270090j9j) interfaceC1277930jMN;
                    pushBase2.minBitrate = c1270090j9j.LIZ;
                    pushBase2.maxBitrate = c1270090j9j.LIZJ;
                    pushBase2.defaultBitrate = c1270090j9j.LIZIZ;
                    String str3 = this.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("set ");
                    sbLIZ3.append(interfaceC1277930jMN);
                    AVLog.logKibana(4, str3, C2188811AlT.LIZIZ(sbLIZ3), null);
                    return 0;
                }
                if (interfaceC1277930jMN instanceof C1936907iJ) {
                    if (LIZIZ()) {
                        return -1;
                    }
                    C1908507dj c1908507dj = PushStreamData.LIZIZ;
                    String str4 = ((C1936907iJ) interfaceC1277930jMN).LIZ;
                    c1908507dj.getClass();
                    PushStreamData pushStreamDataLIZ = C1908507dj.LIZ(str4);
                    String str5 = this.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("set property: ");
                    sbLIZ4.append(interfaceC1277930jMN);
                    AVLog.iod(str5, C2188811AlT.LIZIZ(sbLIZ4));
                    this.config.LJII = pushStreamDataLIZ;
                    return 0;
                }
            }
        }
        return 0;
    }

    @Override // X.AbstractC1277570jLn
    public final void setVideoStrategyRunner(Object obj) {
        AVLog.ioi(this.LIZ, "VeLivePusherImp don't support setVideoStrategyRunner");
    }

    @Override // X.AbstractC1277570jLn
    public final int updateExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) {
        AVLog.ioi(this.LIZ, "VElivePusherImp don't support updateExternalStats");
        return 0;
    }

    public final synchronized void LIZJ(SafeHandlerThread safeHandlerThread, SafeHandlerThread.SafeHandler safeHandler) {
        Object obj = new Object();
        int i = 0;
        boolean[] zArr = {true};
        synchronized (obj) {
            try {
                C786410Ut5.LJJZZIII(safeHandler, new ARunnableS72S0200000_3(obj, zArr, 54));
                Thread[] threadArr = {this.LIZIZ, this.LIZJ};
                try {
                    obj.wait(500L);
                    if (zArr[0]) {
                        C0WQF.LIZ(safeHandlerThread, this.LIZ);
                        do {
                            Thread thread = threadArr[i];
                            if (thread != safeHandlerThread) {
                                C0WQF.LIZ(thread, this.LIZ);
                            }
                            i++;
                        } while (i < 2);
                    }
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (safeHandlerThread != null) {
            safeHandlerThread.release();
        }
    }

    @Override // X.AbstractC1277570jLn
    public final void doStartPush(String[] strArr, boolean z) {
        String strLIZIZ;
        C1278760jNi c1278760jNi = this.LJFF;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String strLIZIZ2 : strArr) {
            if (strLIZIZ2 == null) {
                strLIZIZ2 = "";
            } else {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZIZ2, new String[]{"?"}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() == 2) {
                    strLIZIZ2 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
                    Iterator it2 = a0.LJJLIIIJILLIZJL((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 1), new String[]{"&"}, 0, 6).iterator();
                    boolean z2 = false;
                    while (it2.hasNext()) {
                        List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                        if (listLJJLIIIJILLIZJL2.size() == 2 && !this.config.LJI.anchorNetUrlQueryItems.contains(ListProtector.get(listLJJLIIIJILLIZJL2, 0))) {
                            if (!z2) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(strLIZIZ2);
                                sbLIZ.append('?');
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                z2 = true;
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(strLIZIZ2);
                                sbLIZ2.append('&');
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLIZIZ);
                            sbLIZ3.append((String) ListProtector.get(listLJJLIIIJILLIZJL2, 0));
                            sbLIZ3.append('=');
                            sbLIZ3.append((String) ListProtector.get(listLJJLIIIJILLIZJL2, 1));
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        }
                    }
                }
            }
            arrayList.add(strLIZIZ2);
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
        if (c1278760jNi.LLJ != C1278920jNy.LJIIIIZZ && c1278760jNi.LLJ != C1278920jNy.LJ && c1278760jNi.LLJ != C1278920jNy.LJFF) {
            C786410Ut5.LJJZZIII(c1278760jNi.LLILLJJLI.LIZ, new ARunnableS89S0200000_20(strArr2, c1278760jNi, 244));
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Try to start live stream while ");
            sbLIZ4.append(c1278760jNi.LLJ);
            AVLog.ioe("VeLiveMediaStreamWrapper", C2188811AlT.LIZIZ(sbLIZ4));
        }
        if (this.LJIIIZ) {
            synchronized (this.LIZLLL) {
                try {
                    AdaptiveController adaptiveController = this.LJIIIIZZ;
                    if (adaptiveController != null) {
                        adaptiveController.LJIIJ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        AdaptiveController adaptiveController2 = this.LJIIIIZZ;
        if (adaptiveController2 != null) {
            adaptiveController2.LJIIJ();
        }
    }

    @Override // X.AbstractC1277570jLn
    public final void doSwitchScene(EnumC1277920jMM enumC1277920jMM, long j) {
        int i = C1277880jMI.LIZ[enumC1277920jMM.ordinal()];
        if (i != 1) {
            if (i == 2 && this.pushStarted) {
                this.pushStarted = false;
                this.switchingToLinkMic = true;
                doStopPush();
                return;
            }
            return;
        }
        if (this.pushStarted) {
            return;
        }
        this.pushStarted = true;
        this.switchingToLive = true;
        this.pushState.LIZJ = j;
        doStartPush(this.pushUrlsWithSessionId, true);
    }

    @Override // X.AbstractC1277570jLn
    public final void setStatisticsObserver(InterfaceC1278600jNS interfaceC1278600jNS, int i) {
        super.setStatisticsObserver(interfaceC1278600jNS, i);
        this.LJI.LJ(this.statsObserver, i);
    }

    @Override // X.InterfaceC1278410jN9
    public final void LIZ(EnumC1270070j9h enumC1270070j9h, C1268030j6P c1268030j6P, C1278660jNY c1278660jNY) {
        EnumC1270230j9x enumC1270230j9x;
        Object c098200Yq;
        int i;
        C1278740jNg c1278740jNg;
        C1277770jM7 c1277770jM7 = this.LJII;
        C1278910jNx c1278910jNx = c1277770jM7.LIZIZ;
        PushBase pushBase = c1278910jNx.LIZJ.LJI.mPushBase;
        int i2 = pushBase.fps;
        int i3 = pushBase.width;
        int i4 = c1268030j6P.LIZIZ;
        if (i4 > i3) {
            enumC1270230j9x = EnumC1270230j9x.Up;
        } else if (i4 == i3) {
            int i5 = c1268030j6P.LIZ;
            if (i5 > i2) {
                enumC1270230j9x = EnumC1270230j9x.Up;
            } else if (i5 == i2) {
                enumC1270230j9x = EnumC1270230j9x.Keep;
            } else {
                enumC1270230j9x = EnumC1270230j9x.Down;
            }
        } else {
            enumC1270230j9x = EnumC1270230j9x.Down;
        }
        try {
            WeakReference<C1278740jNg> weakReference = c1278910jNx.LJI;
            if (weakReference != null && (c1278740jNg = weakReference.get()) != null) {
                C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, new ARunnableS89S0200000_20(c1278740jNg.LIZIZ(null, System.currentTimeMillis()).put("event_key", "adjust_callback").put("from", enumC1270070j9h.getCode()).put("adjustment", enumC1270230j9x.getCode()).put("result", c1268030j6P.toString()).put("api", "onLiveStreamChangeFrom"), c1278740jNg, 4));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            thM5exceptionOrNullimpl.printStackTrace();
        }
        if (enumC1270230j9x != EnumC1270230j9x.Keep) {
            c1277770jM7.LIZLLL.LJFF(enumC1270070j9h, enumC1270230j9x, c1268030j6P);
        }
        C1278760jNi c1278760jNi = this.LJFF;
        c1278760jNi.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAdjustResult: ");
        sbLIZ.append(c1268030j6P);
        sbLIZ.append(", ");
        sbLIZ.append(c1278660jNY);
        AVLog.iod("VeLiveMediaStreamWrapper", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (c1278760jNi.LL) {
            try {
                PushBase pushBase2 = c1278760jNi.LL;
                i = c1268030j6P.LIZ;
                pushBase2.fps = i;
                pushBase2.width = c1268030j6P.LIZIZ;
                pushBase2.height = c1268030j6P.LIZJ;
                int i6 = c1278660jNY.LIZ;
                if (i6 != 0) {
                    pushBase2.defaultBitrate = i6;
                }
                pushBase2.maxBitrate = c1278660jNY.LIZIZ;
                pushBase2.minBitrate = c1278660jNY.LIZJ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        VeLiveVideoAdapter veLiveVideoAdapter = c1278760jNi.LLJI;
        if (veLiveVideoAdapter != null) {
            veLiveVideoAdapter.LIZJ(i);
        }
        Handler handler = c1278760jNi.LLILLJJLI.LIZ;
        C1278780jNk c1278780jNk = c1278760jNi.LLIZLLLIL;
        Objects.requireNonNull(c1278780jNk);
        C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1278780jNk, 472));
    }

    @Override // X.AbstractC1277570jLn
    public final EnumC1277950jMP setVideoPerformanceConfig(int i, int i2, int i3) {
        EnumC1277950jMP enumC1277950jMPLJIIIZ;
        ProbeSpeedGear probeSpeedGearLIZ = C1277620jLs.LIZ(this.config.LJI, i, i2, i3);
        if (probeSpeedGearLIZ != null) {
            updatePerformanceMaxVideoBitrate(probeSpeedGearLIZ.maxBitrate);
        }
        if (this.LJIIIZ) {
            synchronized (this.LIZLLL) {
                try {
                    AdaptiveController adaptiveController = this.LJIIIIZZ;
                    if (adaptiveController == null || (enumC1277950jMPLJIIIZ = adaptiveController.LJIIIZ(i3, i, i2)) == null) {
                        enumC1277950jMPLJIIIZ = EnumC1277950jMP.OtherError;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            AdaptiveController adaptiveController2 = this.LJIIIIZZ;
            if (adaptiveController2 == null || (enumC1277950jMPLJIIIZ = adaptiveController2.LJIIIZ(i3, i, i2)) == null) {
                enumC1277950jMPLJIIIZ = EnumC1277950jMP.OtherError;
            }
        }
        AVLog.iod(this.LIZ, "setVideoPerformanceConfig(" + i + ", " + i2 + ", " + i3 + ")-> " + enumC1277950jMPLJIIIZ);
        return enumC1277950jMPLJIIIZ;
    }

    @Override // X.AbstractC1277570jLn
    public final void insertStandardLevel(int i, int i2, int i3, int i4) {
        AdaptiveController adaptiveController = this.LJIIIIZZ;
        if (adaptiveController != null) {
            adaptiveController.LIZLLL(i, i2, i3, i4);
        }
    }

    @Override // X.AbstractC1277570jLn
    public final int sendSeiMessage(String str, Object obj, int i, boolean z, boolean z2) {
        if (this.config.LJI.mPushBase.LJJJ) {
            return sendSeiMessage(str, obj, i, z, z2, 0);
        }
        return this.LJFF.LLILLL.LJFF.LIZ(str, obj, i, z, z2, 0);
    }

    @Override // X.AbstractC1277570jLn
    public final int sendSeiMessage(String str, Object obj, int i, boolean z, boolean z2, int i2) {
        if (this.config.LJI.mPushBase.LJJJ) {
            return this.LJFF.LLILLL.LJFF.LIZ(str, obj, i, z, z2, i2);
        }
        return 0;
    }
}

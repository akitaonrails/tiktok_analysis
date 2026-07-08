package Y;

import X.AbstractC791470V2z;
import X.AbstractC803200Vf4;
import X.C089N;
import X.C08SE;
import X.C0V2D;
import X.C0V2K;
import X.C0V2M;
import X.C0V30;
import X.C0V36;
import X.C0VDB;
import X.C0VES;
import X.C0VQB;
import X.C0VQC;
import X.C0VSJ;
import X.C0VSM;
import X.C0VU9;
import X.C0VVJ;
import X.C0VX9;
import X.C0W1T;
import X.C0W1V;
import X.C0WI0;
import X.C0WI1;
import X.C0WI2;
import X.C0WSJ;
import X.C0X37;
import X.C0X38;
import X.C0XGC;
import X.C0XQ5;
import X.C13WZ;
import X.C1409905fV;
import X.C1C7U;
import X.C2179971ATj;
import X.C2260008tK;
import X.C786410Ut5;
import X.C790230UzF;
import X.C791390V2r;
import X.C791560V3i;
import X.C792600V7i;
import X.C793770VBv;
import X.C794240VDq;
import X.C795480VIk;
import X.C797990VSb;
import X.C798140VSq;
import X.C799170VWp;
import X.C799900VZk;
import X.C802300Vdc;
import X.C802510Vdx;
import X.C802640VeA;
import X.C803060Veq;
import X.C803290VfD;
import X.C804280Vgo;
import X.C807630VmD;
import X.C809440Vp8;
import X.C809980Vq0;
import X.C810420Vqi;
import X.C827030WcP;
import X.C827520WdC;
import X.C838890WvX;
import X.C838980Wvg;
import X.C839000Wvi;
import X.C844470XAv;
import X.C848440XQc;
import X.EnumC799980VZs;
import X.EnumC805430Vif;
import X.InterfaceC800100Va4;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.graphics.GraphicsMonitor;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.dex.DexTricksNativeHolder;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.resource.NativeResourceMonitor;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.monitor.collector.LockMonitorManager;
import com.bytedance.monitor.collector.c;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.lancet.DeviceManagerLancet;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS92S0000000_13 implements Runnable {
    public final int $t;

    public final synchronized void LIZ$7() throws Throwable {
        ARunnableS92S0000000_13 aRunnableS92S0000000_13;
        C0W1T c0w1tLJII;
        ObjectOutputStream objectOutputStream;
        try {
            try {
                synchronized (C794240VDq.LIZIZ) {
                    try {
                        C795480VIk.LIZJ();
                        for (Runnable runnable : C794240VDq.LIZ) {
                            String strValueOf = String.valueOf(runnable.hashCode());
                            C0W1V c0w1v = C795480VIk.LIZ;
                            if (c0w1v != null) {
                                ObjectOutputStream objectOutputStream2 = null;
                                try {
                                    try {
                                        c0w1tLJII = c0w1v.LJII(strValueOf);
                                        objectOutputStream = new ObjectOutputStream(c0w1tLJII.LIZIZ());
                                    } catch (Exception e) {
                                        e = e;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    objectOutputStream.writeObject(runnable);
                                    c0w1tLJII.LIZ();
                                    C2260008tK.LIZ(objectOutputStream);
                                } catch (Exception e2) {
                                    e = e2;
                                    objectOutputStream2 = objectOutputStream;
                                    TryCatchGuardChecker.doCheck(e);
                                    C2260008tK.LIZ(objectOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    objectOutputStream2 = objectOutputStream;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            C2260008tK.LIZ(objectOutputStream2);
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                }
                            }
                            ((ArrayList) C794240VDq.LIZIZ).add(strValueOf);
                        }
                        C794240VDq.LIZ.clear();
                    } catch (Throwable th4) {
                        th = th4;
                        aRunnableS92S0000000_13 = this;
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                            throw th;
                        }
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            aRunnableS92S0000000_13 = this;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
            case 27:
                run$27(this);
                break;
            case 28:
                run$28(this);
                break;
            case 29:
                run$29(this);
                break;
            case 30:
                run$30(this);
                break;
            case 31:
                run$31(this);
                break;
            case 32:
                run$32(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                run$33(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                run$34(this);
                break;
            case 35:
                run$35(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                run$36(this);
                break;
            case 37:
                run$37(this);
                break;
            case 38:
                run$38(this);
                break;
            case 39:
                run$39(this);
                break;
            case 40:
                run$40(this);
                break;
            case 41:
                run$41(this);
                break;
            case 42:
                run$42(this);
                break;
            case 43:
                run$43(this);
                break;
            case 44:
                run$44(this);
                break;
            case 45:
                run$45(this);
                break;
            case 46:
                run$46(this);
                break;
            case 47:
                run$47(this);
                break;
            case 48:
                run$48(this);
                break;
            case 49:
                run$49(this);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                run$50(this);
                break;
            case 51:
                run$51(this);
                break;
            case 52:
                run$52(this);
                break;
            case 53:
                run$53(this);
                break;
            case 54:
                run$54(this);
                break;
            case 55:
                run$55(this);
                break;
            case 56:
                run$56(this);
                break;
            case 57:
                run$57(this);
                break;
            case 58:
                NetworkComponent.lambda$semisugar$updateSettings$lambda$0$0();
                break;
            case 59:
                run$59(this);
                break;
            case 60:
                run$60(this);
                break;
            case 61:
                run$61(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static void LIZ$0() {
        try {
            if (GraphicsMonitor.isPause) {
                GraphicsMonitor.gpuLoadDataOnce = -1.0d;
                return;
            }
            GraphicsMonitor.openStatistical();
            Thread.sleep(GraphicsMonitor.sCollectWindow);
            GraphicsMonitor.closeStatistical();
            GraphicsMonitor.gpuLoadDataOnce = GraphicsMonitor.getStatisticOnceData();
            for (C0VVJ c0vvj : GraphicsMonitor.graphicsUpdateListeners) {
                CopyOnWriteArrayList<C0VVJ> copyOnWriteArrayList = GraphicsMonitor.graphicsUpdateListeners;
                c0vvj.LIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (0 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r6 = ((java.util.concurrent.CopyOnWriteArrayList) X.C0VBB.LIZ).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r6.hasNext() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r5 = (X.C0VBC) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r4.isValid() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        r5.LIZ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (X.C792190V5t.LIZ() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("monitorable invalid. ignored. ");
        r1.append(r4);
        X.C2188811AlT.LIZIZ(r1);
        r0 = X.C792910V8n.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        r0.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        r1 = X.C2188811AlT.LIZ();
        r1.append("monitorableHandler ");
        r1.append(r5);
        r1.append(" handle monitorable ");
        r1.append(r4);
        r1.append("failed.");
        X.C792910V8n.LIZJ("APM-Monitor", X.C2188811AlT.LIZIZ(r1), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        r2 = ((java.util.concurrent.CopyOnWriteArrayList) X.C0VBB.LIZJ).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
    
        if (r2.hasNext() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
    
        ((X.C0VB0) r2.next()).LIZ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
    
        if (X.C792190V5t.LIZ() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        X.C792910V8n.LIZJ("APM-Monitor", "MonitorableHandleListener throws a Throwable", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ$2() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS92S0000000_13.LIZ$2():void");
    }

    public static void LIZ$4() {
        while (true) {
            try {
                if (C0V2K.LJIJ || C0V2K.LIZ <= -1) {
                    Object obj = C0V2K.LJIIZILJ;
                    synchronized (obj) {
                        try {
                            obj.wait();
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } else {
                    C0V2K.LJI = SystemClock.uptimeMillis() - C0V2K.LJII;
                    C0V2K.LJI &= 2199023255551L;
                    SystemClock.sleep(5L);
                }
            } catch (InterruptedException th) {
                return;
            }
        }
    }

    public static void LIZ$5() {
        C0V2K.LJIIJJI.removeCallbacksAndMessages(null);
        C0V2M c0v2m = C0V2K.LJIJJ;
        if (c0v2m == null) {
            boolean z = C0V30.LIZ;
        } else {
            CopyOnWriteArrayList<AbstractC791470V2z> copyOnWriteArrayList = C0V30.LIZLLL;
            synchronized (copyOnWriteArrayList) {
                try {
                    copyOnWriteArrayList.remove(c0v2m);
                    C791390V2r c791390V2r = C791390V2r.LJJIII;
                    if (c791390V2r.LJIJ && copyOnWriteArrayList.isEmpty() && c791390V2r.LJIIJ() == 0) {
                        C0V30.LIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C0V2K.LJIIJ.quit();
        C0V2K.LIZLLL = null;
    }

    public static void LIZ$8() {
        List<String> list = C794240VDq.LIZIZ;
        synchronized (list) {
            try {
                if (((ArrayList) list).size() != 0) {
                    Iterator it2 = ((ArrayList) list).iterator();
                    while (it2.hasNext()) {
                        C794240VDq.LIZJ.submit(C795480VIk.LIZIZ((String) it2.next()));
                    }
                    ((ArrayList) C794240VDq.LIZIZ).clear();
                    try {
                        C0W1V c0w1v = C795480VIk.LIZ;
                        c0w1v.close();
                        C0W1V.LJFF(c0w1v.LL);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ$3() {
        BPEAHandler bPEAHandler;
        if (C0VU9.LIZ > 80) {
            ((LinkedHashMap) C0VU9.LIZIZ).clear();
            ((LinkedHashMap) C0VU9.LIZJ).clear();
            C799170VWp c799170VWp = C799170VWp.LIZ;
            C799170VWp.LJII = true;
            HandlerThread handlerThread = C799170VWp.LJFF;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                return;
            }
            return;
        }
        System.currentTimeMillis();
        try {
            C799170VWp.LIZ.getClass();
            C799170VWp.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        System.currentTimeMillis();
        if (!C799170VWp.LIZJ.get() || (bPEAHandler = C799170VWp.LJ) == null) {
            return;
        }
        C786410Ut5.LJLIIL(C799170VWp.LJIIIZ.LIZ, bPEAHandler, this);
    }

    public static void LIZ$1() {
        try {
            String strLIZIZ = C0V36.LIZIZ(ThreadMethodProxy.getStackTrace(Looper.getMainLooper().getThread()));
            BlockingQueue<String> blockingQueue = LockMonitorManager.sStackBlockingQueue;
            synchronized (blockingQueue) {
                try {
                    if (blockingQueue.size() != 0) {
                        blockingQueue.clear();
                    }
                    blockingQueue.put(strLIZIZ);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th) {
        }
    }

    public static void LIZ$6() {
        try {
            File[] fileArrListFiles = C0VX9.LJFF().listFiles();
            JSONObject jSONObject = new JSONObject();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileArrListFiles) {
                    jSONObject.put(file.getName(), C0VES.LIZ(file));
                }
            }
            try {
                IApmAgent iApmAgent = (IApmAgent) C792600V7i.LIZ(IApmAgent.class);
                if (iApmAgent != null) {
                    iApmAgent.monitorEvent("npth_disk_event", jSONObject, null, null);
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        TryCatchGuardChecker.doCheck(th);
    }

    public ARunnableS92S0000000_13(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("InitializationMonitor@7cda.handleMsg$1");
        try {
            C809440Vp8.LIZIZ(201, System.currentTimeMillis() - C809440Vp8.LIZLLL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InitializationMonitor@7cda.handleMsg$1");
    }

    public static final void run$1(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("VmMonitorAdapter@a852.dumpNative$1");
        try {
            C802300Vdc.LIZ();
            C803060Veq.LJIIJ.LIZLLL = 5;
            C803060Veq.LJII(0, 0, NativeResourceMonitor.LJIIIIZZ(0, 1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VmMonitorAdapter@a852.dumpNative$1");
    }

    public static final void run$10(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ApmDelegate@ccc.pause$1");
        try {
            C791560V3i c791560V3iLIZLLL = C791560V3i.LIZLLL();
            for (int i = 0; i < ((CopyOnWriteArrayList) c791560V3iLIZLLL.LIZ).size(); i++) {
                ((c) ListProtector.get(c791560V3iLIZLLL.LIZ, i)).LIZLLL();
            }
            c791560V3iLIZLLL.LIZJ = false;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmDelegate@ccc.pause$1");
    }

    public static final void run$11(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("GraphicsMonitor@f4aa.start$1");
        try {
            LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GraphicsMonitor@f4aa.start$1");
    }

    public static final void run$12(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.disableClassVerify$1");
        try {
            C0X38.LIZIZ(JatoXL.sConfig.mContext, JatoXL.sEnableVerifyApexArt);
            C0X38.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.disableClassVerify$1");
    }

    public static final void run$13(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.enableClassVerify$1");
        try {
            if (C0X38.LIZIZ) {
                int i = Build.VERSION.SDK_INT;
                int iLIZ = DeviceInfoUtils.LIZ();
                boolean z = false;
                try {
                    if (CastIntegerProtector.parseInt(DeviceInfoUtils.LIZIZ("ro.build.version.preview_sdk")) != 0) {
                        z = true;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if ((!C0X38.LIZJ || iLIZ == i || iLIZ < 35) && i < 35 && (!z || i != 34)) {
                    if (i >= 21) {
                        DexTricksNativeHolder.verifyEnable();
                    } else if (i == 19 && !DeviceInfoUtils.LIZJ()) {
                        DexTricksNativeHolder.dvmVerifyEnable();
                    }
                } else {
                    DexTricksNativeHolder.verifyEnable15();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.enableClassVerify$1");
    }

    public static final void run$14(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("LockMonitorManager@e65a.nativeGetJavaStack$1");
        try {
            LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LockMonitorManager@e65a.nativeGetJavaStack$1");
    }

    public static final void run$15(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ALog@eae2.syncFlush$1");
        try {
            C827520WdC.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ALog@eae2.syncFlush$1");
    }

    public static final void run$16(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ALog@eae2.timedSyncFlush$1");
        try {
            C827520WdC.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ALog@eae2.timedSyncFlush$1");
    }

    public static final void run$17(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ALog@eae2.flush$1");
        try {
            C827520WdC.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ALog@eae2.flush$1");
    }

    public static final void run$18(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ALog@eae2.asyncFlush$1");
        try {
            C827520WdC.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ALog@eae2.asyncFlush$1");
    }

    public static final void run$19(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("DeviceManagerLancet@7c56.report$1$onFailure$1");
        try {
            C844470XAv.LIZ.getClass();
            DeviceManagerLancet.LIZLLL(C844470XAv.LIZ(), "network_failed");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DeviceManagerLancet@7c56.report$1$onFailure$1");
    }

    public static final void run$2(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("LegoAppLifecycleCallbacks@122.onActivityResumed$1L");
        C799900VZk c799900VZk = C799900VZk.LIZ;
        EnumC799980VZs enumC799980VZs = EnumC799980VZs.TASK_FIRST_WINDOW_FOCUS;
        c799900VZk.getClass();
        InterfaceC800100Va4 interfaceC800100Va4 = C799900VZk.LJIIIIZZ.get(enumC799980VZs);
        if (interfaceC800100Va4 != null) {
            interfaceC800100Va4.LJFF();
        }
        C1C7U.LIZIZ("LegoAppLifecycleCallbacks@122.onActivityResumed$1L");
    }

    public static final void run$20(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("InitLocalNotifyTask@73a5.run$1L");
        C0VQC.LIZIZ.LIZIZ();
        C1C7U.LIZIZ("InitLocalNotifyTask@73a5.run$1L");
    }

    public static final void run$21(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("InitLocalNotifyTask@73a5.run$2L");
        C0VQB.LIZIZ.init();
        C1C7U.LIZIZ("InitLocalNotifyTask@73a5.run$2L");
    }

    public static final void run$22(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("ObserveDeviceRegister@c4ca.<field>$1$onDeviceRegistrationInfoChanged$2L");
        AppLog.flush();
        C1C7U.LIZIZ("ObserveDeviceRegister@c4ca.<field>$1$onDeviceRegistrationInfoChanged$2L");
    }

    public static final void run$23(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("BaseAccountService@5871.<field>$1$onReceiveAccountEvent$1L");
        C0XGC c0xgc = C0XGC.LIZ;
        String curUserId = C0XQ5.LIZ().getCurUserId();
        c0xgc.getClass();
        C0XGC.LIZ(curUserId);
        C1C7U.LIZIZ("BaseAccountService@5871.<field>$1$onReceiveAccountEvent$1L");
    }

    public static final void run$24(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("OptimizerHelper@3f44.stopGCBlock$1");
        try {
            JatoXL.stopBlockGc("beginBlockGC");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OptimizerHelper@3f44.stopGCBlock$1");
    }

    public static final void run$25(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        try {
            if (!C810420Vqi.LIZ) {
                synchronized (C809980Vq0.class) {
                    try {
                        if (!C810420Vqi.LIZ) {
                            C810420Vqi.LIZIZ();
                            C810420Vqi.LIZ = true;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public static final void run$26(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        try {
            if (!C810420Vqi.LIZ) {
                synchronized (C809980Vq0.class) {
                    try {
                        if (!C810420Vqi.LIZ) {
                            C810420Vqi.LIZIZ();
                            C810420Vqi.LIZ = true;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public static final void run$27(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("CloudMessageWidget@597c.onReady$1");
        try {
            C0VDB.LIZIZ().LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CloudMessageWidget@597c.onReady$1");
    }

    public static final void run$28(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("CloudMessageWidget@597c.onBackground$1");
        try {
            C0VDB.LIZIZ().LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CloudMessageWidget@597c.onBackground$1");
    }

    public static final void run$29(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("MessageShowHandler@5daa.showNotificationInner$2L");
        C1C7U.LIZIZ("MessageShowHandler@5daa.showNotificationInner$2L");
    }

    public static final void run$3(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("AOPEnvironment@8156.active$1L");
        synchronized (C0VSM.LIZ) {
            C0VSM.LIZ();
        }
        C1C7U.LIZIZ("AOPEnvironment@8156.active$1L");
    }

    public static final void run$30(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("MessageShowHandler@5daa.showNotificationInner$4L");
        C1C7U.LIZIZ("MessageShowHandler@5daa.showNotificationInner$4L");
    }

    public static final void run$31(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("Monitor@4568.startWork$1");
        try {
            LIZ$2();
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C2179971ATj.LIZ(th)) {
                C1C7U.LIZIZ("Monitor@4568.startWork$1");
                return;
            }
            throw th;
        }
    }

    public static final void run$32(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("TerminateMonitor@c1b1.forceStart$2");
        try {
            try {
                new C0VSJ(C802510Vdx.LJFF, "custom_data").listFiles(new C803290VfD());
            } finally {
            }
            C802510Vdx.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
            }
        }
        C1C7U.LIZIZ("TerminateMonitor@c1b1.forceStart$2");
    }

    public static final void run$33(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("TerminateMonitor@c1b1.upload$2");
        try {
            try {
                new C0VSJ(C802510Vdx.LJFF, "custom_data").listFiles(new C803290VfD());
            } finally {
            }
            C802510Vdx.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
            }
        }
        C1C7U.LIZIZ("TerminateMonitor@c1b1.upload$2");
    }

    public static final void run$34(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ThreadCpuDiagnose@83c4.periodTask$1");
        try {
            aRunnableS92S0000000_13.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ThreadCpuDiagnose@83c4.periodTask$1");
    }

    public static final void run$35(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("MethodCollector@59d0.<field>$2");
        try {
            LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MethodCollector@59d0.<field>$2");
    }

    public static final void run$36(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("MethodCollector@59d0.<field>$3");
        try {
            synchronized (C0V2K.LIZJ) {
                try {
                    if (C0V2K.LIZ == Integer.MAX_VALUE || C0V2K.LIZ == -4) {
                        C0V2K.LIZ = -3;
                        C0V2K.LIZIZ = true;
                        C0V2K.LJIIIZ = new ARunnableS92S0000000_13(37);
                    }
                } finally {
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MethodCollector@59d0.<field>$3");
    }

    public static final void run$37(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("MethodCollector@59d0.realRelease$1");
        try {
            LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MethodCollector@59d0.realRelease$1");
    }

    public static final void run$38(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("MethodCollector@59d0.realExecute$1");
        try {
            synchronized (C0V2K.LIZJ) {
                try {
                    if (C0V2K.LIZ == Integer.MAX_VALUE || C0V2K.LIZ == 1) {
                        C0V2K.LIZ = -2;
                        C0V2K.LIZIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MethodCollector@59d0.realExecute$1");
    }

    public static final void run$39(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("LaunchScanner@8990.run$1");
        try {
            ConcurrentLinkedQueue<AbstractC803200Vf4> concurrentLinkedQueue = AbstractC803200Vf4.LIZ;
            if (!concurrentLinkedQueue.isEmpty()) {
                Iterator<AbstractC803200Vf4> it2 = concurrentLinkedQueue.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().getClass();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        } finally {
            if (!zLIZ) {
            }
            C1C7U.LIZIZ("LaunchScanner@8990.run$1");
        }
        C1C7U.LIZIZ("LaunchScanner@8990.run$1");
    }

    public static final void run$4(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("SearchPreloadLancet@a104.asyncRace$2L");
        try {
            Class<?> cls = Class.forName("com.ss.android.ugc.aweme.property.AVSettingsWrapper");
            C1409905fV.LJI = (Float) cls.getDeclaredMethod("getRecordBitrate", new Class[0]).invoke(cls, new Object[0]);
            C1409905fV.LJII = (Integer) cls.getDeclaredMethod("getRecordQuality", new Class[0]).invoke(cls, new Object[0]);
            Class<?> cls2 = Class.forName("com.ss.android.ugc.aweme.shortvideo.ScreenUtils");
            C1409905fV.LJIIIIZZ = (Integer) cls2.getDeclaredMethod("getNavigationBarHeight", Context.class).invoke(cls2, C798140VSq.LIZ);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("SearchPreloadLancet@a104.asyncRace$2L");
    }

    public static final void run$40(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("MethodIDRuntimeInfoCenter@b9f9.startCollect$1L");
        try {
            if (MethodIDManager.LIZLLL) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<Integer, Integer> entry : C838980Wvg.LIZ.entrySet()) {
                    jSONObject2.put(String.valueOf(entry.getKey().intValue()), entry.getValue().intValue());
                }
                jSONObject.put("method_id_count", jSONObject2);
                C839000Wvi c839000Wvi = C838980Wvg.LJ;
                jSONObject.put("push_cost", c839000Wvi.LIZ());
                C839000Wvi c839000Wvi2 = C838980Wvg.LJFF;
                jSONObject.put("pop_cost", c839000Wvi2.LIZ());
                C839000Wvi c839000Wvi3 = C838980Wvg.LJI;
                jSONObject.put("get_cost", c839000Wvi3.LIZ());
                long j = C838980Wvg.LIZJ + 1;
                C838980Wvg.LIZJ = j;
                jSONObject.put("collect_time", j * 5);
                C838980Wvg.LIZIZ = jSONObject;
                c839000Wvi.LIZ.set(0L);
                c839000Wvi.LIZIZ.set(0L);
                c839000Wvi2.LIZ.set(0L);
                c839000Wvi2.LIZIZ.set(0L);
                c839000Wvi3.LIZ.set(0L);
                c839000Wvi3.LIZIZ.set(0L);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("MethodIDRuntimeInfoCenter@b9f9.startCollect$1L");
    }

    public static final void run$41(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("MethodIDSampleCenter@7a47.setConfig$1L");
        boolean z = MethodIDManager.LIZ;
        C1C7U.LIZIZ("MethodIDSampleCenter@7a47.setConfig$1L");
    }

    public static final void run$42(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("MethodIDSampleCenter@7a47.startResetTask$1L");
        C838890WvX.LJIIIIZZ.clear();
        C1C7U.LIZIZ("MethodIDSampleCenter@7a47.startResetTask$1L");
    }

    public static final void run$43(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("UtilsKt@4d4f.killAllPackageProcesses$1L");
        Process.killProcess(Process.myPid());
        C1C7U.LIZIZ("UtilsKt@4d4f.killAllPackageProcesses$1L");
    }

    public static final void run$44(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("NpthDiskMonitor@1bb2.setConfig$1");
        try {
            LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NpthDiskMonitor@1bb2.setConfig$1");
    }

    public static final void run$45(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("StatisticLoggerFixer@a785.reportPendingSession$1L");
        WeakReference<Activity> weakReference = C827030WcP.LIZIZ;
        if (weakReference != null) {
            Activity activity = weakReference.get();
            if (activity != null && C807630VmD.LIZ.LIZIZ.get()) {
                AppLog.onResume(activity);
            }
            C827030WcP.LIZIZ = null;
        }
        C1C7U.LIZIZ("StatisticLoggerFixer@a785.reportPendingSession$1L");
    }

    public static final void run$46(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("StatisticLoggerFixer@a785.onInited$1$accept$1L");
        AppLog.flush();
        C1C7U.LIZIZ("StatisticLoggerFixer@a785.onInited$1$accept$1L");
    }

    public static final void run$47(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("ApiCallCountRecorder@5d1b.init$1L");
        C0WSJ.LIZIZ(false);
        C1C7U.LIZIZ("ApiCallCountRecorder@5d1b.init$1L");
    }

    public static final void run$48(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("GeckoBlockHelper@3dae.endBlock$1");
        try {
            C797990VSb.LIZ.LJIILJJIL();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeckoBlockHelper@3dae.endBlock$1");
    }

    public static final void run$49(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("DownloadPreconnecterImpl@82ba.<field>$1");
        try {
            Process.setThreadPriority(10);
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("DownloadPreconnecterImpl@82ba.<field>$1");
    }

    public static final void run$5(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("AnrDumper@9bf0.testMainThread$1$1");
        try {
            C802640VeA.LJJJJJL = System.currentTimeMillis();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnrDumper@9bf0.testMainThread$1$1");
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r2v0 Y.ARunnableS92S0000000_13) */
    public static final synchronized void run$50(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        synchronized (aRunnableS92S0000000_13) {
            C1C7U.LIZ("TerminalMonitor@5bdf.postRunnble$1");
            try {
                aRunnableS92S0000000_13.LIZ$7();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("TerminalMonitor@5bdf.postRunnble$1");
        }
    }

    public static final void run$51(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("TerminalMonitor@5bdf.doCacheRunnable$1");
        try {
            LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TerminalMonitor@5bdf.doCacheRunnable$1");
    }

    public static final void run$52(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("SecShareDataReadManager@2eae.<clinit>$1L");
        C0WI2 c0wi2 = new C0WI2();
        c0wi2.LIZIZ("share_sdk_read_time_out");
        c0wi2.LIZJ();
        C0WI0 c0wi0 = C0WI0.LIZ;
        C0WI1 c0wi1 = new C0WI1("", "time out", false, 8);
        c0wi0.getClass();
        C0WI0.LIZIZ(c0wi1);
        C1C7U.LIZIZ("SecShareDataReadManager@2eae.<clinit>$1L");
    }

    public static final void run$53(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("LaunchEvilMethodManager@486e.startMonitorEvilMethod$1");
        try {
            C0V2D.LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LaunchEvilMethodManager@486e.startMonitorEvilMethod$1");
    }

    public static final void run$54(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("BaseI18nLoginDialog@2e52.dismiss$1L");
        if (!C0XQ5.LJFF()) {
            C0XQ5.LJIIJJI(1, 3, "");
            C0XQ5.LJIIIIZZ();
        }
        C1C7U.LIZIZ("BaseI18nLoginDialog@2e52.dismiss$1L");
    }

    public static final void run$55(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C804280Vgo.LIZ(EnumC805430Vif.FEED_FORYOU_5VV);
        C804280Vgo.LIZ(EnumC805430Vif.FEED_FORYOU);
    }

    public static final void run$56(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("AccountUserChangeListener@dc67.checkSharedAccount$1L");
        C1C7U.LIZIZ("AccountUserChangeListener@dc67.checkSharedAccount$1L");
    }

    public static final void run$57(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("Apm@2a9a.start$1");
        try {
            C793770VBv.LJIIZILJ("Apm#start", "Apm start");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Apm@2a9a.start$1");
    }

    public static final void run$59(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("ColdBootHelper@3c45.doAtTheEndOfMeasure$1L");
        C1C7U.LIZIZ("ColdBootHelper@3c45.doAtTheEndOfMeasure$1L");
    }

    public static final void run$6(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("AnrProfiler@27ce.startJvmLockMonitor$1");
        try {
            try {
            } finally {
            }
            if (!"true".equals(C08SE.LIZJ(new C0VSJ(C0VX9.LIZLLL(), "anr_profiler.config")))) {
                try {
                    NativeBridge.LJJL();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (!C2179971ATj.LIZ(th2)) {
            }
        }
        C1C7U.LIZIZ("AnrProfiler@27ce.startJvmLockMonitor$1");
    }

    public static final void run$60(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("ColdBootHelper@3c45.notifyFullColdBootEnd$1L");
        C13WZ c13wz = C089N.LIZ;
        c13wz.LJIILLIIL(C0X37.Pdp);
        c13wz.LIZ();
        C1C7U.LIZIZ("ColdBootHelper@3c45.notifyFullColdBootEnd$1L");
    }

    public static final void run$61(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("ColdBootHelper@3c45.notifyFullColdBootEnd$2L");
        C13WZ c13wz = C089N.LIZ;
        c13wz.LJIILLIIL(C0X37.Profile);
        c13wz.LIZ();
        C1C7U.LIZIZ("ColdBootHelper@3c45.notifyFullColdBootEnd$2L");
    }

    public static final void run$7(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("ApiVodNetController@80f0.stopVodNetControl$1L");
        C790230UzF.LIZ.LIZJ().businessEvent(11007, 1);
        C1C7U.LIZIZ("ApiVodNetController@80f0.stopVodNetControl$1L");
    }

    public static final void run$8(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        C1C7U.LIZ("ApiVodNetController@80f0.startVodNetControl$1L");
        C790230UzF.LIZ.LIZJ().businessEvent(11006, 1);
        C1C7U.LIZIZ("ApiVodNetController@80f0.startVodNetControl$1L");
    }

    public static final void run$9(ARunnableS92S0000000_13 aRunnableS92S0000000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ApmDelegate@ccc.initBlockMonitor$1");
        try {
            C0V30.LIZLLL();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmDelegate@ccc.initBlockMonitor$1");
    }

    public ARunnableS92S0000000_13(C848440XQc c848440XQc, int i) {
        this.$t = i;
    }

    public ARunnableS92S0000000_13(Context context, int i) {
        this.$t = i;
    }
}

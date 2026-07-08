package X;

import Y.ARunnableS72S0200000_3;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0Uyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790010Uyt extends BroadcastReceiver {
    public static C790010Uyt LJIIIIZZ;
    public int LIZ = LSPassThroughRecordSizeConfig.DEFAULT;
    public int LIZIZ = 10;
    public final Lock LIZJ = new ReentrantLock();
    public final ArrayList<WeakReference<InterfaceC790020Uyu>> LIZLLL = new ArrayList<>();
    public int LJ = 0;
    public C789990Uyr LJFF = null;
    public boolean LJI = false;
    public boolean LJII;

    public static int LIZJ(int i) {
        if (i == 20) {
            return 4;
        }
        switch (i) {
            case 1:
            case 2:
            case 7:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case 16:
                return 2;
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case 14:
            case 15:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return 3;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return 1;
            default:
                return 6;
        }
    }

    public static synchronized C790010Uyt LJ() {
        if (LJIIIIZZ == null) {
            LJIIIIZZ = new C790010Uyt();
        }
        return LJIIIIZZ;
    }

    public static void LIZLLL(Context context) {
        int iLIZLLL = C790040Uyw.LIZLLL();
        if (iLIZLLL == 1 || iLIZLLL == 2 || iLIZLLL == 3) {
            LJ().LJI = true;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is wifi sensitive mode:");
            sbLIZ.append(iLIZLLL);
            C1471660oOq.LIZJ("TTNetWorkListener", C2188811AlT.LIZIZ(sbLIZ));
        }
        C790010Uyt c790010UytLJ = LJ();
        c790010UytLJ.getClass();
        try {
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("TTNetWorkListener", "enter start listen");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
            C786410Ut5.LJIJJ(context, c790010UytLJ, intentFilter);
            c790010UytLJ.LJIIIZ(LJFF(context));
            if (c790010UytLJ.LIZ == 0) {
                c790010UytLJ.LIZIZ = c790010UytLJ.LJI(context, null);
            }
            C789990Uyr c789990Uyr = new C789990Uyr(context, c790010UytLJ);
            c790010UytLJ.LJFF = c789990Uyr;
            if (!c790010UytLJ.LJI) {
                c789990Uyr.LIZ();
            }
            c790010UytLJ.LJ = 1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e);
            TTVideoEngineLog.d("TTNetWorkListener", "start listen network state failed");
        }
    }

    public static int LJFF(Context context) throws Throwable {
        NetworkInfo.State state;
        if (context == null) {
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
        if (connectivityManager == null) {
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("TTNetWorkListener", "disconnect");
            return -1;
        }
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager);
            if (networkInfoLJIJ != null && networkInfoLJIJ.isAvailable()) {
                NetworkInfo networkInfoY4 = C786410Ut5.y4(connectivityManager, 1);
                if (networkInfoY4 != null && (state = networkInfoY4.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                    int i2 = C2187451AjH.LIZ;
                    TTVideoEngineLog.d("TTNetWorkListener", "wifi");
                    return 0;
                }
                NetworkInfo networkInfoY42 = C786410Ut5.y4(connectivityManager, 0);
                if (networkInfoY42 != null) {
                    NetworkInfo.State state2 = networkInfoY42.getState();
                    int iLJLL = C2204961BRm.LJLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFgfamkEiHWSoOWe4IxY190E4=", null));
                    int i3 = C2187451AjH.LIZ;
                    TTVideoEngineLog.d("TTNetWorkListener", "state: " + state2 + ", subtype: " + iLJLL);
                    if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                        return LIZJ(iLJLL);
                    }
                }
                return LSPassThroughRecordSizeConfig.DEFAULT;
            }
            int i4 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("TTNetWorkListener", "disconnect 1");
            return -1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i5 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("TTNetWorkListener", e.toString());
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
    }

    public final void LIZ(int i) {
        if (i != this.LIZIZ) {
            ((ReentrantLock) this.LIZJ).lock();
            int i2 = this.LIZIZ;
            this.LIZIZ = i;
            if (!this.LJII) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("strength changed, from: ");
                sbLIZ.append(i2);
                sbLIZ.append(" to: ");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(" callback list size: ");
                sbLIZ.append(this.LIZLLL.size());
                C1471660oOq.LIZJ("TTNetWorkListener", C2188811AlT.LIZIZ(sbLIZ));
            }
            Iterator<WeakReference<InterfaceC790020Uyu>> it2 = this.LIZLLL.iterator();
            while (it2.hasNext()) {
                InterfaceC790020Uyu interfaceC790020Uyu = it2.next().get();
                if (interfaceC790020Uyu == null) {
                    it2.remove();
                } else {
                    interfaceC790020Uyu.LIZ(1, i2, this.LIZIZ);
                }
            }
            ((ReentrantLock) this.LIZJ).unlock();
        }
    }

    public final synchronized void LJII(final Context context) {
        if (this.LJ != 0) {
            return;
        }
        this.LJ = 1;
        this.LJII = C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 128L);
        C01GW c01gw = C1474810oTv.E4;
        if (((Number) c01gw.getValue()).intValue() == 1) {
            new BPEAThread(context) { // from class: X.082M
                public final WeakReference<Context> LL;

                @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("TTNetWorkListener$MyThread2@b77a.run");
                    boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                    try {
                        C790010Uyt c790010UytLJ = C790010Uyt.LJ();
                        Context context2 = this.LL.get();
                        c790010UytLJ.getClass();
                        C790010Uyt.LIZLLL(context2);
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("TTNetWorkListener$MyThread2@b77a.run");
                }

                {
                    this.LL = new WeakReference<>(context);
                }
            }.start();
        } else if (((Number) c01gw.getValue()).intValue() == 2) {
            C1475000oUE.LIZLLL.execute(new ARunnableS72S0200000_3(this, context, 20));
        } else {
            new BPEAThread(context, this) { // from class: X.0Uys
                public final WeakReference<Context> LL;
                public final WeakReference<C790010Uyt> LLILLJJLI;

                @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("TTNetWorkListener$MyThread@75f5.run");
                    boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                    try {
                        LIZJ();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("TTNetWorkListener$MyThread@75f5.run");
                }

                public final void LIZJ() throws Throwable {
                    Context context2;
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    C790010Uyt c790010UytLJ = C790010Uyt.LJ();
                    Context context3 = this.LL.get();
                    c790010UytLJ.getClass();
                    C790010Uyt.LIZLLL(context3);
                    Looper.loop();
                    C790010Uyt c790010Uyt = this.LLILLJJLI.get();
                    if (c790010Uyt == null || (context2 = this.LL.get()) == null || c790010Uyt.LJFF == null) {
                        return;
                    }
                    try {
                        C786410Ut5.LJJIFFI(context2, c790010Uyt);
                        C789990Uyr c789990Uyr = c790010Uyt.LJFF;
                        TelephonyManager telephonyManager = c789990Uyr.LIZ;
                        if (telephonyManager != null) {
                            C2204961BRm.LLILIL(telephonyManager, c789990Uyr, 0, new C0WZX("dzBzEhEpEd7IQ14lQB2BaMaCmTvFgfamkEiHWSoOWe4IxY190E4=", null));
                        }
                        int i = C2187451AjH.LIZ;
                        C1471660oOq.LIZIZ("TTNetWorkListener", "Receiver has been unregistered!");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i2 = C2187451AjH.LIZ;
                        C1471660oOq.LIZIZ("TTNetWorkListener", "Receiver has been unregistered exception !");
                    }
                }

                {
                    this.LL = new WeakReference<>(context);
                    this.LLILLJJLI = new WeakReference<>(this);
                }
            }.start();
        }
    }

    public final void LJIIIIZZ(WeakReference<InterfaceC790020Uyu> weakReference) {
        if (weakReference == null) {
            return;
        }
        ((ReentrantLock) this.LIZJ).lock();
        this.LIZLLL.add(weakReference);
        ((ReentrantLock) this.LIZJ).unlock();
    }

    public final void LJIIIZ(int i) {
        if (i != this.LIZ) {
            ((ReentrantLock) this.LIZJ).lock();
            int i2 = this.LIZ;
            this.LIZ = i;
            if (!this.LJII) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("access changed, from: ");
                sbLIZ.append(i2);
                sbLIZ.append(" to: ");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(" callback list size: ");
                sbLIZ.append(this.LIZLLL.size());
                TTVideoEngineLog.d("TTNetWorkListener", C2188811AlT.LIZIZ(sbLIZ));
            }
            Iterator<WeakReference<InterfaceC790020Uyu>> it2 = this.LIZLLL.iterator();
            while (it2.hasNext()) {
                InterfaceC790020Uyu interfaceC790020Uyu = it2.next().get();
                if (interfaceC790020Uyu == null) {
                    it2.remove();
                } else {
                    interfaceC790020Uyu.LIZ(0, i2, this.LIZ);
                }
            }
            ((ReentrantLock) this.LIZJ).unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isInitialStickyBroadcast()
            if (r0 != 0) goto L86
            if (r6 == 0) goto L86
            java.lang.String r1 = "android.net.wifi.RSSI_CHANGED"
            java.lang.String r0 = r6.getAction()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            int r0 = r4.LIZ
            if (r0 != 0) goto L2c
            X.0oJ2 r0 = X.C790030Uyv.LIZ
            long r2 = r0.LJIIIIZZ
            r0 = 32
            boolean r0 = X.C790040Uyw.LJ(r2, r0)
            if (r0 != 0) goto L2b
            int r0 = r4.LJI(r5, r6)
            r4.LIZ(r0)
        L2b:
            return
        L2c:
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            java.lang.String r0 = r6.getAction()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L39
            return
        L39:
            X.0oJ2 r0 = X.C790030Uyv.LIZ
            long r2 = r0.LJIIIIZZ
            r0 = 128(0x80, double:6.3E-322)
            boolean r0 = X.C790040Uyw.LJ(r2, r0)
            r4.LJII = r0
            if (r0 == 0) goto L7f
            java.lang.String r0 = "networkType"
            r2 = -1
            int r1 = r6.getIntExtra(r0, r2)
            java.lang.String r0 = "networkInfo"
            android.os.Parcelable r3 = r6.getParcelableExtra(r0)
            android.net.NetworkInfo r3 = (android.net.NetworkInfo) r3
            if (r3 == 0) goto L62
            boolean r0 = r3.isConnected()
            if (r0 != 0) goto L62
        L5e:
            r4.LJIIIZ(r2)
            return
        L62:
            if (r1 != 0) goto L77
            if (r3 == 0) goto L7c
            X.0WZX r2 = new X.0WZX
            java.lang.String r1 = "dzBzEhEpEd7IQ14lQB2BaMaCmTvFgfamkEiHWSoOWe4IxY190E4="
            r0 = 0
            r2.<init>(r1, r0)
            int r0 = X.C2204961BRm.LJLL(r3, r2)
            int r2 = LIZJ(r0)
            goto L5e
        L77:
            r0 = 1
            if (r1 != r0) goto L7c
            r2 = 0
            goto L5e
        L7c:
            r2 = 1000(0x3e8, float:1.401E-42)
            goto L5e
        L7f:
            int r0 = LJFF(r5)
            r4.LJIIIZ(r0)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C790010Uyt.LIZIZ(android.content.Context, android.content.Intent):void");
    }

    public final int LJI(Context context, Intent intent) {
        int iIntValue;
        int i = 10;
        if (context == null) {
            return 10;
        }
        try {
            if (((ConnectivityManager) C786410Ut5.H2(context, "connectivity")) == null) {
                return 10;
            }
            if (intent == null) {
                if (!this.LJI) {
                    try {
                        iIntValue = C786600UtO.LIZIZ((WifiManager) C786410Ut5.H2(C786410Ut5.N3(context), "wifi")).intValue();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        iIntValue = -1;
                    }
                } else {
                    iIntValue = -1;
                }
            } else {
                iIntValue = intent.getIntExtra("newRssi", -70);
            }
            int iCalculateSignalLevel = WifiManager.calculateSignalLevel(iIntValue, 4);
            if (!this.LJII) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("wifi dbm:");
                sbLIZ.append(iIntValue);
                sbLIZ.append(", level:");
                sbLIZ.append(iCalculateSignalLevel);
                TTVideoEngineLog.d("TTNetWorkListener", C2188811AlT.LIZIZ(sbLIZ));
            }
            i = iCalculateSignalLevel + 1;
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("TTNetWorkListener", e.toString());
            return i;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZIZ(context, intent);
        }
    }
}

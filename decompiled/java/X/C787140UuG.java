package X;

import X.C1C7U;
import X.C786410Ut5;
import X.C787140UuG;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0UuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787140UuG {
    public static final Object LJIJI = new Object();
    public static C787140UuG LJIJJ;
    public final Context LIZIZ;
    public boolean LJII;
    public TelephonyManager LJIILIIL;
    public final ConnectivityManager LJIILJJIL;
    public int LIZ = -2;
    public String LIZJ = "NOT_REGISTERED";
    public String LIZLLL = "NOT_REGISTERED";
    public int LJ = -2;
    public int LJFF = -2;
    public int LJI = -2;
    public final Object LJIIIIZZ = new Object();
    public final Object LJIIIZ = new Object();
    public final Object LJIIJ = new Object();
    public final Object LJIIJJI = new Object();
    public final Object LJIIL = new Object();
    public C787150UuH LJIILL = null;
    public C787160UuI LJIILLIIL = null;
    public InterfaceC786740Utc LJIIZILJ = null;
    public int LJIJ = -2;

    public static String LIZ(int i) {
        switch (i) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "CDMA - EvDo rev. 0";
            case 6:
                return "CDMA - EvDo rev. A";
            case 7:
                return "CDMA - 1xRTT";
            case 8:
                return "HSDPA";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "HSUPA";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "HSPA";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "iDEN";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "CDMA - EvDo rev. B";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "LTE";
            case 14:
                return "CDMA - eHRPD";
            case 15:
                return "HSPA+";
            case 16:
                return "GSM";
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return "TD_SCDMA";
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return "IWLAN";
            case 19:
                return "LTE_CA";
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return "NR";
            default:
                return "UNKNOWN";
        }
    }

    public final boolean LIZJ() throws Throwable {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        try {
            int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            if (this.LJIJ == defaultDataSubscriptionId) {
                return true;
            }
            TelephonyManager telephonyManagerCreateForSubscriptionId = this.LJIILIIL.createForSubscriptionId(defaultDataSubscriptionId);
            this.LJIILIIL = telephonyManagerCreateForSubscriptionId;
            C2204961BRm.LLILIL(telephonyManagerCreateForSubscriptionId, this.LJIILL, 321, new C0WZX("dzBzEgAjS8/YVFkiQFyKY8zPZD4zA4u+NOlD1YUhBZFpVIHXRzO+/SBbowEqZ3aohW8CN+9P", null));
            this.LJIJ = defaultDataSubscriptionId;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkQualityCollect{mGSMType='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mNetworkType='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mDataLevel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mWifiLevel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", lastDataSim=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C787140UuG(Context context) {
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        try {
            this.LIZIZ = context;
            this.LJIILIIL = (TelephonyManager) C786410Ut5.H2(context, "phone");
            this.LJIILJJIL = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
            HandlerThread handlerThread = new HandlerThread("listener_thread");
            handlerThread.start();
            final Looper looperW2 = C786410Ut5.W2(handlerThread);
            C786410Ut5.LJLILLLLZI(new BPEAHandler(looperW2) { // from class: com.bytedance.networkstackapplib.NetworkQualityCollect$1
                /* JADX WARN: Type inference failed for: r1v0, types: [X.0UuH] */
                /* JADX WARN: Type inference failed for: r1v1, types: [X.0UuI] */
                @Override // android.os.Handler
                public final void handleMessage(Message message) throws Exception {
                    C1C7U.LIZ("NetworkQualityCollect@cc24.initForRegister$1");
                    if (message == null) {
                        C1C7U.LIZIZ("NetworkQualityCollect@cc24.initForRegister$1");
                        return;
                    }
                    super.handleMessage(message);
                    C787140UuG c787140UuG = this.LL;
                    final C787140UuG c787140UuG2 = this.LL;
                    c787140UuG.LJIILL = new PhoneStateListener() { // from class: X.0UuH
                        @Override // android.telephony.PhoneStateListener
                        public final void onServiceStateChanged(ServiceState serviceState) {
                            super.onServiceStateChanged(serviceState);
                            try {
                                c787140UuG2.LIZIZ(serviceState.toString());
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }

                        @Override // android.telephony.PhoneStateListener
                        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
                            super.onSignalStrengthsChanged(signalStrength);
                            synchronized (c787140UuG2.LJIIIZ) {
                                try {
                                    try {
                                        c787140UuG2.LJ = signalStrength.getLevel();
                                    } finally {
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }

                        @Override // android.telephony.PhoneStateListener
                        public final void onDataConnectionStateChanged(int i, int i2) {
                            super.onDataConnectionStateChanged(i, i2);
                            synchronized (c787140UuG2.LJIIIIZZ) {
                                try {
                                    try {
                                        C787140UuG c787140UuG3 = c787140UuG2;
                                        c787140UuG3.LIZ = i2;
                                        c787140UuG3.LIZJ = C787140UuG.LIZ(i2);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    };
                    C787140UuG c787140UuG3 = this.LL;
                    final C787140UuG c787140UuG4 = this.LL;
                    c787140UuG3.LJIILLIIL = new BroadcastReceiver() { // from class: X.0UuI
                        public final void LIZ(Intent intent) {
                            int i;
                            try {
                                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                                    NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ(c787140UuG4.LJIILJJIL);
                                    synchronized (c787140UuG4.LJIIJ) {
                                        try {
                                            if (networkInfoLJIJ != null) {
                                                if (networkInfoLJIJ.isConnected()) {
                                                    c787140UuG4.LIZJ();
                                                    c787140UuG4.LIZLLL = C2204961BRm.LJLLJ(networkInfoLJIJ, new C0WZX("dzBzEgAjS8/YVFkiQFyKY8zPZD4zA4u+NOlD1YUhBZFpVIHXRzO+/SBbowEqZ3aohW8CN+9P", null));
                                                }
                                            } else {
                                                c787140UuG4.LIZLLL = "DISCONNECTED";
                                            }
                                            c787140UuG4.LIZLLL = "DISCONNECTED";
                                        } finally {
                                        }
                                    }
                                    if ("DISCONNECTED".equals(c787140UuG4.LIZLLL)) {
                                        synchronized (c787140UuG4.LJIIJJI) {
                                            try {
                                                C787140UuG c787140UuG5 = c787140UuG4;
                                                c787140UuG5.LJFF = -2;
                                                c787140UuG5.LJI = -2;
                                            } finally {
                                            }
                                        }
                                        return;
                                    }
                                    return;
                                }
                                if ("android.net.wifi.RSSI_CHANGED".equals(intent.getAction())) {
                                    synchronized (c787140UuG4.LJIIJJI) {
                                        try {
                                            int intExtra = intent.getIntExtra("newRssi", -70);
                                            C787140UuG c787140UuG6 = c787140UuG4;
                                            c787140UuG6.getClass();
                                            if (intExtra <= -88) {
                                                i = 0;
                                            } else if (intExtra >= -55) {
                                                i = 4;
                                            } else {
                                                i = ((intExtra - (-88)) * 4) / 33;
                                            }
                                            c787140UuG6.LJFF = i;
                                        } finally {
                                        }
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception th) {
                            }
                        }

                        @Override // android.content.BroadcastReceiver
                        public final void onReceive(Context context2, Intent intent) {
                            if (!C2214201BlK.LJIIJJI && intent != null) {
                                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                                    C2188191AkT.LIZIZ();
                                }
                            }
                            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                                LIZ(intent);
                            } else {
                                C2408409cA.LIZ();
                                LIZ(intent);
                            }
                        }
                    };
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    C787140UuG c787140UuG5 = this.LL;
                    C786410Ut5.LJIJJ(c787140UuG5.LIZIZ, c787140UuG5.LJIILLIIL, intentFilter);
                    if (!this.LL.LIZJ()) {
                        C1C7U.LIZIZ("NetworkQualityCollect@cc24.initForRegister$1");
                    } else {
                        C1C7U.LIZIZ("NetworkQualityCollect@cc24.initForRegister$1");
                    }
                }
            }, 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ(String str) {
        if (str == null) {
            return;
        }
        synchronized (this.LJIIL) {
            try {
                this.LJII = false;
                if (!TextUtils.isEmpty(str) && (str.contains("nrState=NOT_RESTRICTED") || str.contains("nrState=CONNECTED"))) {
                    this.LJII = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

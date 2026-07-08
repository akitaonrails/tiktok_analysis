package X;

import Y.ARunnableS134S0100000_34;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEInfo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: renamed from: X.1BrU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218021BrU implements InterfaceC2218061BrY {
    public int LIZ;
    public boolean LIZIZ;
    public InterfaceC2218071BrZ LIZJ;
    public volatile InterfaceC2218051BrX LIZLLL;
    public C2218031BrV LJ;
    public BPEAHandler LJFF;
    public HandlerThread LJI;
    public final ConditionVariable LJII = new ConditionVariable();
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public int LJIIIZ = 3;
    public int LJIIJ = 3;
    public Cert LJIIJJI = null;
    public Cert LJIIL = null;
    public HashMap<EnumC2217951BrN, Cert> LJIILIIL = null;
    public final ConcurrentHashMap LJIILJJIL = new ConcurrentHashMap();
    public final Object LJIILL = new Object();
    public final BPEAHandler LJIILLIIL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS134S0100000_34 LJIIZILJ = new ARunnableS134S0100000_34(this, 36);
    public final Boolean LJIJ = VEConfigCenter.getInstance().getValue("ve_enable_audio_release_check", false);
    public C1621480sIU LJIJI;

    public final synchronized BPEAHandler LIZ() {
        try {
            HandlerThread handlerThread = this.LJI;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            HandlerThread handlerThread2 = new HandlerThread("TEAudioCaptureProxy");
            this.LJI = handlerThread2;
            handlerThread2.start();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CreateHandler failed!: ");
            sbLIZ.append(e.toString());
            C2484209oO.LIZJ("TEAudioCaptureProxy", C2188811AlT.LIZIZ(sbLIZ));
            return new BPEAHandler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper(), new Handler.Callback(this) { // from class: X.1BrT
                public final WeakReference<C2218021BrU> LL;

                {
                    this.LL = new WeakReference<>(this);
                }

                /* JADX WARN: Removed duplicated region for block: B:74:0x024c  */
                @Override // android.os.Handler.Callback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean handleMessage(android.os.Message r14) {
                    /*
                        Method dump skipped, instruction units count: 648
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2218011BrT.handleMessage(android.os.Message):boolean");
                }
            });
        }
        return new BPEAHandler(C786410Ut5.W2(this.LJI), new Handler.Callback(this) { // from class: X.1BrT
            public final WeakReference<C2218021BrU> LL;

            {
                this.LL = new WeakReference<>(this);
            }

            /* JADX WARN: Removed duplicated region for block: B:74:0x024c  */
            @Override // android.os.Handler.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean handleMessage(android.os.Message r14) {
                /*
                    Method dump skipped, instruction units count: 648
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2218011BrT.handleMessage(android.os.Message):boolean");
            }
        });
    }

    public final synchronized void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroyHandler mHandler: ");
        sbLIZ.append(this.LJFF);
        C2484209oO.LJI("TEAudioCaptureProxy", C2188811AlT.LIZIZ(sbLIZ));
        HandlerThread handlerThread = this.LJI;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.LJI = null;
            this.LJFF = null;
        }
        ARunnableS134S0100000_34 aRunnableS134S0100000_34 = this.LJIIZILJ;
        if (aRunnableS134S0100000_34 != null) {
            this.LJIILLIIL.removeCallbacks(aRunnableS134S0100000_34);
        }
    }

    public final Cert LIZLLL(EnumC2217951BrN enumC2217951BrN) {
        HashMap<EnumC2217951BrN, Cert> map = this.LJIILIIL;
        if (map != null && !map.isEmpty() && this.LJIILIIL.containsKey(enumC2217951BrN)) {
            return this.LJIILIIL.get(enumC2217951BrN);
        }
        return null;
    }

    public final void LJ(Cert cert) {
        C2484209oO.LJI("TEAudioCaptureProxy", "realReleaseMic in ");
        this.LJIIIIZZ.set(true);
        synchronized (this.LJIILL) {
            try {
                if (this.LIZ == 2) {
                    LJFF(cert);
                }
                this.LIZ = 3;
                if (this.LIZLLL != null) {
                    C2484209oO.LJI("TEAudioCaptureProxy", "realReleaseMic release audioRecord ");
                    this.LIZLLL.release(cert);
                    this.LIZLLL = null;
                }
                if (!this.LJIJ.booleanValue()) {
                    this.LJII.open();
                } else {
                    this.LJIILLIIL.removeCallbacks(this.LJIIZILJ);
                }
                this.LIZ = 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LJ.LIZ(VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_RELEASE, 0, null);
        this.LJIIIIZZ.set(false);
        C2484209oO.LJI("TEAudioCaptureProxy", "realReleaseMic out");
    }

    public final int LJFF(Cert cert) {
        synchronized (this.LJIILL) {
            try {
                if (this.LIZ != 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("mic stop in error state: ");
                    sbLIZ.append(this.LIZ);
                    C2484209oO.LJIIIIZZ("TEAudioCaptureProxy", C2188811AlT.LIZIZ(sbLIZ));
                    return 0;
                }
                if (this.LIZLLL == null) {
                    C2484209oO.LIZJ("TEAudioCaptureProxy", "mic stop error, audio record is null");
                    return -105;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                int iStop = this.LIZLLL.stop(cert);
                LIZJ(Integer.valueOf(iStop), jCurrentTimeMillis, "vesdk_event_did_stop_mic");
                this.LJ.LIZ(VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP, iStop, null);
                this.LIZ = 1;
                return iStop;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2218061BrY
    public final synchronized int init(VEAudioCaptureSettings vEAudioCaptureSettings) {
        this.LJIILLIIL.removeCallbacks(this.LJIIZILJ);
        if (this.LJFF != null) {
            if (this.LJIJ.booleanValue()) {
                this.LJIIIZ = 3;
                this.LJIIJ = 3;
                LJII(0, vEAudioCaptureSettings);
            }
            return 0;
        }
        this.LJFF = LIZ();
        this.LJIIIZ = 3;
        this.LJIIJ = 3;
        LJII(0, vEAudioCaptureSettings);
        return 0;
    }

    @Override // X.InterfaceC2218061BrY
    public final synchronized void release(Cert cert) {
        if (this.LJFF == null) {
            C2484209oO.LJIIIIZZ("TEAudioCaptureProxy", "release, mHandler is null!");
            return;
        }
        C2484209oO.LJI("TEAudioCaptureProxy", "call mic release ");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.LJIJ.booleanValue()) {
            this.LJII.close();
            this.LJFF.removeCallbacksAndMessages(null);
            LJII(3, cert);
            this.LJII.block(2000L);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mic release cost: ");
            sbLIZ.append(jCurrentTimeMillis2);
            sbLIZ.append("ms");
            C2484209oO.LJI("TEAudioCaptureProxy", C2188811AlT.LIZIZ(sbLIZ));
            if (jCurrentTimeMillis2 >= 2000) {
                C2484209oO.LIZJ("TEAudioCaptureProxy", "mic release timeout");
            }
            if (!this.LJIIIIZZ.get() && this.LIZLLL != null) {
                LJ(cert);
            }
            LIZIZ();
        } else {
            this.LJIIL = cert;
            LJII(3, cert);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setAsyncCloseCheckMsg: ");
            sbLIZ2.append(this.LJIIZILJ);
            C2484209oO.LJI("TEAudioCaptureProxy", C2188811AlT.LIZIZ(sbLIZ2));
            this.LJIILLIIL.removeCallbacks(this.LJIIZILJ);
            C786410Ut5.LJLIIL(2000L, this.LJIILLIIL, this.LJIIZILJ);
        }
    }

    @Override // X.InterfaceC2218061BrY
    public final int start(Cert cert) {
        if (this.LJFF == null) {
            C2484209oO.LIZJ("TEAudioCaptureProxy", "start, mHandler is null!");
            return -108;
        }
        this.LJIIJJI = cert;
        LJII(1, cert);
        return 0;
    }

    @Override // X.InterfaceC2218061BrY
    public final int stop(Cert cert) {
        if (this.LJFF == null) {
            C2484209oO.LIZJ("TEAudioCaptureProxy", "stop, mHandler is null!");
            return -108;
        }
        C1305700k5A.LIZJ("te_record_audio_mic_start_info", this.LJIILJJIL.toString());
        LJII(2, cert);
        return 0;
    }

    public final void LJII(int i, Object obj) {
        LJI(i, 0L, obj);
    }

    public static void LIZJ(Integer num, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("resultCode", num);
            jSONObject.put("state", num);
            jSONObject.put("duration", jCurrentTimeMillis - j);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        b.LIZIZ(str, "behavior", jSONObject, true);
    }

    public final synchronized void LJI(int i, long j, Object obj) {
        BPEAHandler bPEAHandler = this.LJFF;
        if (bPEAHandler == null) {
            C2484209oO.LJI("TEAudioCaptureProxy", "send MSG error mHandler is null");
            return;
        }
        if (bPEAHandler.hasMessages(i)) {
            this.LJFF.removeMessages(i);
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = obj;
        messageObtain.what = i;
        if (j <= 0) {
            C786410Ut5.LJLJJL(this.LJFF, messageObtain);
        } else {
            C786410Ut5.LJLJLJ(this.LJFF, messageObtain, j);
        }
    }
}

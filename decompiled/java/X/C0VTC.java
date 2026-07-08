package X;

import X.C08M6;
import X.C0CMU;
import X.C0CMV;
import X.C0VA1;
import X.C0VT5;
import X.C0VT6;
import X.C0VT7;
import X.C0VTA;
import X.C0VTQ;
import X.C0VTR;
import X.C1C7U;
import X.C2214201BlK;
import X.C278260AvQ;
import X.C280290Ayh;
import X.C286830BMb;
import X.C286850BMd;
import X.C786410Ut5;
import X.C793290V9z;
import X.C798290VTf;
import X.C798360VTm;
import X.C844470XAv;
import Y.ARunnableS113S0100000_13;
import Y.AfS136S0000000_13;
import Y.AfS182S0100000_13;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.bytedance.applog.AppLog;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.jato.boost.sched.ProcTidFetcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.oppo.hyperboost.IHyperboostService;
import com.ss.android.ugc.aweme.power.scene.SceneGenerator;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VTC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VTC {
    public static volatile C0VTC LIZIZ;
    public boolean LIZ;

    /* JADX WARN: Type inference failed for: r0v44, types: [X.0VT4] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.os.Handler, com.ss.android.ugc.aweme.power.applog.PowerLogger$start$1] */
    public final void LIZ(final Context context) {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        HandlerThread handlerThread = new HandlerThread("power_handler");
        handlerThread.start();
        BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        synchronized (C0R5C.LIZ) {
            try {
                if (!C0R5C.LIZIZ) {
                    C0R5C.LIZIZ = true;
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    int iIntValue = ((Number) AnonymousClass0726.LIZ.getValue()).intValue();
                    if (iIntValue != 1) {
                        if (iIntValue != 2) {
                            if (iIntValue != 4) {
                                try {
                                    if (((Boolean) C258290AAh.LIZ.getValue()).booleanValue()) {
                                        if (C0VTM.LIZ.contains(Build.MANUFACTURER.toLowerCase(Locale.ROOT))) {
                                            C0R5C.LIZJ = C0VTM.LIZ(contextLIZ);
                                        }
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            } else {
                                C0R5C.LIZJ = true;
                            }
                        } else {
                            C0R5C.LIZJ = C0VTM.LIZ(contextLIZ);
                        }
                    } else {
                        C0R5C.LIZJ = C0VTH.LIZLLL;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        C0VT7.LIZ().getClass();
        C0VT7.LIZLLL(C0VTN.LIZJ());
        final C0VT5 c0vt5LIZ = C0VT5.LIZ();
        c0vt5LIZ.getClass();
        try {
            if (c0vt5LIZ.LIZ != null && c0vt5LIZ.LIZIZ == null) {
                c0vt5LIZ.LIZIZ = new BroadcastReceiver() { // from class: X.0VT4
                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context2, Intent intent) {
                        if (!C2214201BlK.LJIIJJI && intent != null) {
                            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                                C2188191AkT.LIZIZ();
                            }
                        }
                        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            c0vt5LIZ.LIZJ(intent);
                            C0VT7.LIZ().LIZIZ();
                        } else {
                            C2408409cA.LIZ();
                            c0vt5LIZ.LIZJ(intent);
                            C0VT7.LIZ().LIZIZ();
                        }
                    }
                };
                Intent intentLJIJJ = C786410Ut5.LJIJJ(c0vt5LIZ.LIZ, c0vt5LIZ.LIZIZ, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentLJIJJ != null) {
                    c0vt5LIZ.LIZJ(intentLJIJJ);
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        if (!C2214201BlK.LJIIJJI) {
            C0VT7.LIZ().LIZIZ();
        }
        C2214201BlK.LIZLLL().LJJLJLI(new AfS136S0000000_13(9));
        C0VTF.LIZIZ().getClass();
        C0VT7.LIZLLL(C0VTF.LIZIZ());
        if (((Boolean) C0AQR.LIZ.getValue()).booleanValue()) {
            C786410Ut5.LJJZZIII(bPEAHandler, (Runnable) new C798250VTb(context, bPEAHandler).LIZJ.getValue());
        }
        if (((Boolean) C285590BHh.LIZIZ.getValue()).booleanValue()) {
            final C798260VTc c798260VTc = new C798260VTc(context, bPEAHandler);
            AppLog.addSessionHook(new InterfaceC2211051BgF() { // from class: X.0VTE
                @Override // X.InterfaceC2211051BgF
                public final void LIZ(String str, long j, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC2211051BgF
                public final void LIZJ(String str, long j, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC2211051BgF
                public final void LIZIZ(long j, String str) {
                    C798260VTc c798260VTc2 = c798260VTc;
                    c798260VTc2.LJFF = Float.NaN;
                    c798260VTc2.LIZIZ(0);
                }
            });
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS113S0100000_13(c798260VTc, 286));
        }
        C0VTG c0vtgLIZ = C0VTG.LIZ();
        final Looper looperW2 = C786410Ut5.W2(handlerThread);
        if (!c0vtgLIZ.LIZ) {
            final C0VTQ c0vtq = new C0VTQ(looperW2);
            ?? r3 = new BPEAHandler(looperW2) { // from class: com.ss.android.ugc.aweme.power.applog.PowerLogger$start$1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    C0VA1 c0va1;
                    C1C7U.LIZ("PowerLogger@8dfe.start$1");
                    PowerLogger$start$1 powerLogger$start$1 = null;
                    int[] iArr = null;
                    switch (message.what) {
                        case 80:
                            C0VTQ c0vtq2 = c0vtq;
                            c0vtq2.getClass();
                            if (C286850BMd.LIZ()) {
                                c0vtq2.LJIIIIZZ = Process.myPid();
                                c0vtq2.LJIIIZ = ProcTidFetcher.LIZIZ;
                                c0vtq2.LIZ = ((Number) C280290Ayh.LIZ.getValue()).longValue() * 1000;
                                C793290V9z c793290V9z = new C793290V9z();
                                C844470XAv.LIZ.getClass();
                                Context contextLIZ2 = C844470XAv.LIZ();
                                if (contextLIZ2 == null) {
                                    c0va1 = null;
                                } else {
                                    c0va1 = new C0VA1(contextLIZ2, c793290V9z);
                                }
                                c0va1.LJI();
                                c0vtq2.LIZIZ = c0va1;
                                C0VTR.LJFF = C2214201BlK.LJIIJJI;
                                C0VTR.LIZ.getClass();
                                C0VTR.LIZIZ();
                                C2214201BlK.LIZLLL().LJJLJLI(new AfS182S0100000_13(c0va1, 122));
                                C0VT5.LIZ().LIZIZ(new C0VT6() { // from class: X.0VTT
                                    @Override // X.C0VT6
                                    public final void LIZ(boolean z) {
                                        if (z && !C0VTR.LJFF) {
                                            C0VTR.LJI = false;
                                        }
                                    }
                                });
                                C0VT7.LIZLLL(new C0VTA() { // from class: X.0VTS
                                    @Override // X.C0VTA
                                    public final void LIZ(int i) {
                                        if (i != 0) {
                                            C0VTR.LIZLLL = System.currentTimeMillis();
                                        } else {
                                            if (C0VTR.LIZLLL <= 0) {
                                                return;
                                            }
                                            C0VTR.LJ += System.currentTimeMillis() - C0VTR.LIZLLL;
                                            C0VTR.LIZLLL = 0L;
                                        }
                                    }
                                });
                                SceneGenerator.LIZIZ().LIZLLL(c0vtq2);
                                if (!((Boolean) C286830BMb.LIZIZ.getValue()).booleanValue()) {
                                    C0VT5.LIZ().LIZIZ(c0vtq2);
                                }
                                PowerLogger$start$1 powerLogger$start$12 = c0vtq2.LIZJ;
                                if (powerLogger$start$12 != null) {
                                    powerLogger$start$1 = powerLogger$start$12;
                                }
                                C786410Ut5.LJLIIL(120000L, powerLogger$start$1, c0vtq2.LJI);
                            }
                            break;
                        case 81:
                            C798290VTf c798290VTf = c0vtq.LJII;
                            if (c798290VTf != null) {
                                c798290VTf.LIZ.removeCallbacks(c798290VTf.LJIJI);
                                c798290VTf.LIZ.removeCallbacks(c798290VTf.LJIJJ);
                            }
                            C0VTQ c0vtq3 = c0vtq;
                            PowerLogger$start$1 powerLogger$start$13 = c0vtq3.LIZJ;
                            if (powerLogger$start$13 == null) {
                                powerLogger$start$13 = null;
                            }
                            C0VA1 c0va12 = c0vtq3.LIZIZ;
                            if (c0va12 == null) {
                                c0va12 = null;
                            }
                            long j = c0vtq3.LIZ;
                            int i = c0vtq3.LJIIIIZZ;
                            int i2 = c0vtq3.LJIIIZ;
                            final C798290VTf c798290VTf2 = new C798290VTf(powerLogger$start$13, c0va12, j, i, i2);
                            C0VTQ c0vtq4 = c0vtq;
                            String str = c0vtq4.LJFF;
                            String str2 = c0vtq4.LJ;
                            boolean z = c0vtq4.LIZLLL;
                            c798290VTf2.LJIIJJI = z;
                            if (Intrinsics.LJFF("background", str)) {
                                c798290VTf2.LJIILIIL = false;
                                c798290VTf2.LJIILJJIL = 300000L;
                            } else {
                                c798290VTf2.LJIILIIL = !z;
                                c798290VTf2.LJIILJJIL = j;
                            }
                            c798290VTf2.LJIILL = str;
                            c798290VTf2.LJIILLIIL = str2;
                            c798290VTf2.LJ = C0VT5.LIZ().LIZJ;
                            boolean z2 = !z;
                            c798290VTf2.LJIIL = z2;
                            if (z2) {
                                boolean z3 = c798290VTf2.LJIILIIL;
                                if (z3) {
                                    if (i2 > 0) {
                                        iArr = new int[]{i, i2};
                                    } else {
                                        iArr = new int[]{i};
                                    }
                                }
                                C798360VTm c798360VTm = new C798360VTm(true, false, false, iArr, z3);
                                c798290VTf2.LJIJ = c798360VTm;
                                c798360VTm.LIZ();
                                int iLIZIZ = C08M6.LIZIZ();
                                if (iLIZIZ > 0) {
                                    c798290VTf2.LJIIIZ++;
                                    c798290VTf2.LJIIJ += iLIZIZ;
                                }
                            }
                            if (((Boolean) C278260AvQ.LIZIZ.getValue()).booleanValue()) {
                                C0CMU.LIZ.LIZIZ(new C0CMV() { // from class: X.0VTa
                                    @Override // X.C0CMV
                                    public final void LIZJ() {
                                        C798290VTf c798290VTf3 = c798290VTf2;
                                        C786410Ut5.LJJZZIII(c798290VTf3.LIZ, new ARunnableS113S0100000_13(c798290VTf3, 290));
                                    }

                                    @Override // X.C0CMV
                                    public final void onExit() {
                                        C798290VTf c798290VTf3 = c798290VTf2;
                                        C786410Ut5.LJJZZIII(c798290VTf3.LIZ, new ARunnableS113S0100000_13(c798290VTf3, 291));
                                    }
                                });
                                if (C798290VTf.LJIL) {
                                    C786410Ut5.LJJZZIII(powerLogger$start$13, new ARunnableS113S0100000_13(c798290VTf2, 292));
                                    C798290VTf.LJIL = false;
                                }
                            }
                            if (c798290VTf2.LJIILIIL) {
                                C786410Ut5.LJJZZIII(powerLogger$start$13, c798290VTf2.LJIJI);
                            }
                            C786410Ut5.LJLIIL(c798290VTf2.LJIILJJIL, powerLogger$start$13, c798290VTf2.LJIJJ);
                            c0vtq.LJII = c798290VTf2;
                            break;
                        case 82:
                            C798290VTf c798290VTf3 = c0vtq.LJII;
                            if (c798290VTf3 != null) {
                                c798290VTf3.LIZ.removeCallbacks(c798290VTf3.LJIJI);
                                c798290VTf3.LIZ.removeCallbacks(c798290VTf3.LJIJJ);
                            }
                            break;
                    }
                    C1C7U.LIZIZ("PowerLogger@8dfe.start$1");
                }
            };
            c0vtq.LIZJ = r3;
            C786410Ut5.LJLJJI(80, ((Number) C0AQP.LIZ.getValue()).longValue(), r3);
            c0vtgLIZ.LIZ = true;
        }
        SceneGenerator.LIZIZ().LIZJ(C786410Ut5.W2(handlerThread));
        C793230V9t c793230V9tLIZ = C793230V9t.LIZ();
        c793230V9tLIZ.getClass();
        SceneGenerator.LIZIZ().LIZLLL(c793230V9tLIZ.LIZ);
        if (((Boolean) C0AQM.LIZ.getValue()).booleanValue()) {
            ((IHyperboostService) C741110T5h.LIZIZ.getValue()).LIZ(context, new InterfaceC741120T5i() { // from class: X.0T5f
                @Override // X.InterfaceC741120T5i
                public final void LIZ(boolean z) {
                    Context context2 = context;
                    if (z) {
                        ((IHyperboostService) C741110T5h.LIZIZ.getValue()).LIZIZ(context2);
                    }
                }
            });
        }
    }
}

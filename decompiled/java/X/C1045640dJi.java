package X;

import Y.ARunnableS116S0100000_16;
import Y.ARunnableS24S0400000_16;
import Y.ARunnableS49S0300000_16;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045640dJi implements InterfaceC1045930dKB {
    public final Map<String, String> LIZ = Collections.synchronizedMap(new LinkedHashMap());
    public final Map<String, AbstractC1045430dJN> LIZIZ = Collections.synchronizedMap(new LinkedHashMap());
    public final Map<String, C1045770dJv> LIZJ = Collections.synchronizedMap(new LinkedHashMap());
    public final Map<String, C588650N6x> LIZLLL = Collections.synchronizedMap(new LinkedHashMap());
    public final C1045750dJt LJ;
    public C1045740dJs LJFF;
    public final BPEAHandler LJI;
    public int LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public C1045720dJq LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public InterfaceC1045710dJp LJIILIIL;
    public final C01GW LJIILJJIL;

    public final long LJIJJ() {
        Function0<Long> duration;
        InterfaceC1045710dJp interfaceC1045710dJp = this.LJIILIIL;
        if (interfaceC1045710dJp == null || (duration = interfaceC1045710dJp.getDuration()) == null) {
            return 0L;
        }
        return duration.invoke().longValue();
    }

    public final Function2<String, String, Unit> LJIJJLI() {
        Function2<String, String, Unit> function2LJIIIZ;
        InterfaceC1045710dJp interfaceC1045710dJp = this.LJIILIIL;
        return (interfaceC1045710dJp == null || (function2LJIIIZ = interfaceC1045710dJp.LJIIIZ()) == null) ? AFwS300S0000000_16.get$arr$(77) : function2LJIIIZ;
    }

    public final String LJJI() {
        Function0<C1045870dK5> tracker;
        C1045870dK5 c1045870dK5Invoke;
        String str;
        InterfaceC1045710dJp interfaceC1045710dJp = this.LJIILIIL;
        return (interfaceC1045710dJp == null || (tracker = interfaceC1045710dJp.getTracker()) == null || (c1045870dK5Invoke = tracker.invoke()) == null || (str = c1045870dK5Invoke.LIZ) == null) ? "unknown" : str;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0dKl] */
    public C1045640dJi() throws Exception {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        final C1045750dJt c1045750dJt = new C1045750dJt(contextLIZ);
        this.LJ = c1045750dJt;
        this.LJI = new BPEAHandler(Looper.getMainLooper());
        this.LJIIIIZZ = -1L;
        c1045750dJt.LIZJ = new BroadcastReceiver(c1045750dJt) { // from class: X.0dKl
            public final C1045750dJt LIZ;
            public int LIZIZ;

            {
                this.LIZ = c1045750dJt;
                this.LIZIZ = c1045750dJt.LIZ();
            }

            public final void LIZ(Intent intent) {
                String action;
                int intExtra = -1;
                if (intent != null) {
                    intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
                }
                String action2 = null;
                if (intent != null) {
                    action = intent.getAction();
                } else {
                    action = null;
                }
                if (!Intrinsics.LJFF("android.media.VOLUME_CHANGED_ACTION", action) || intExtra != 3) {
                    if (intent != null) {
                        action2 = intent.getAction();
                    }
                    if (!Intrinsics.LJFF("android.media.STREAM_MUTE_CHANGED_ACTION", action2)) {
                        return;
                    }
                }
                C1045750dJt c1045750dJt2 = this.LIZ;
                C1045920dKA c1045920dKA = c1045750dJt2.LIZIZ;
                int i = this.LIZIZ;
                int iLIZ = c1045750dJt2.LIZ();
                this.LIZIZ = iLIZ;
                if (c1045920dKA != null) {
                    if (iLIZ == 0) {
                        if (i > 0) {
                            c1045920dKA.LIZ.LJJII(true, c1045920dKA.LIZIZ);
                        }
                    } else {
                        if (iLIZ <= 0 || i != 0) {
                            return;
                        }
                        c1045920dKA.LIZ.LJJII(false, c1045920dKA.LIZIZ);
                    }
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
                    LIZ(intent);
                } else {
                    C2408409cA.LIZ();
                    LIZ(intent);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("android.media.STREAM_MUTE_CHANGED_ACTION");
        C786410Ut5.LJIL(contextLIZ, c1045750dJt.LIZJ, intentFilter, null, null);
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 893));
    }

    @Override // X.InterfaceC1045690dJn
    public final InterfaceC1045710dJp LJI() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1045690dJn
    public final AbstractC1045430dJN LIZIZ(C1045720dJq c1045720dJq) {
        if (!c1045720dJq.LJI) {
            return null;
        }
        return this.LIZIZ.get(LJ(c1045720dJq));
    }

    @Override // X.InterfaceC1045930dKB
    public final String LJ(C1045720dJq c1045720dJq) {
        C1045890dK7 c1045890dK7 = (C1045890dK7) ListProtector.get(c1045720dJq.LIZIZ, 0);
        String str = c1045890dK7.LIZ;
        String str2 = c1045890dK7.LIZIZ;
        String str3 = c1045890dK7.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        sbLIZ.append(str3);
        return C2084808Es.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1045690dJn
    public final void LJIIIIZZ(InterfaceC1045710dJp interfaceC1045710dJp) {
        this.LJIILIIL = interfaceC1045710dJp;
    }

    public final String LJJIII(C1045720dJq c1045720dJq) {
        C588650N6x c588650N6x = this.LIZLLL.get(LJ(c1045720dJq));
        if (c588650N6x != null) {
            return c588650N6x.LIZ;
        }
        return null;
    }

    public final void LJJIIJ(String str) {
        AbstractC1045430dJN abstractC1045430dJN = this.LIZIZ.get(str);
        this.LIZ.remove(str);
        this.LIZIZ.remove(str);
        this.LIZJ.remove(str);
        this.LIZLLL.remove(str);
        if (abstractC1045430dJN != null) {
            C786410Ut5.LJLIIL(2000L, this.LJI, new ARunnableS116S0100000_16(new AbstractC1045430dJN[]{abstractC1045430dJN}, 219));
        }
    }

    @Override // X.InterfaceC1045690dJn
    public final void LIZJ(Context context, C1045720dJq c1045720dJq) {
        InterfaceC1045710dJp interfaceC1045710dJp = this.LJIILIIL;
        if (interfaceC1045710dJp != null && interfaceC1045710dJp.LJIIJJI()) {
            this.LJFF = new C1045740dJs(this, c1045720dJq, context);
        }
        this.LJ.LIZIZ = new C1045920dKA(this, c1045720dJq);
    }

    @Override // X.InterfaceC1045690dJn
    public final void LJIIIZ(Context context, C1045720dJq c1045720dJq) {
        if (this.LJIIJJI) {
            return;
        }
        ARunnableS49S0300000_16 aRunnableS49S0300000_16 = new ARunnableS49S0300000_16(this, c1045720dJq, context, 15);
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            aRunnableS49S0300000_16.run();
        } else {
            C786410Ut5.LJJZZIII(this.LJI, aRunnableS49S0300000_16);
        }
    }

    @Override // X.InterfaceC1045690dJn
    public final void LJIIJJI(C1045720dJq c1045720dJq, Context context) throws Throwable {
        C1045770dJv c1045770dJvLJIL = LJIL(c1045720dJq, context, null, C13BV.INSTANCE);
        if (c1045770dJvLJIL != null) {
            C1045780dJw.LIZJ(c1045770dJvLJIL.LIZ);
            c1045770dJvLJIL.LIZ.LJ.LIZ("bufferStart", null);
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(LJJI(), "buffer_start", c1045720dJq.LJIIIZ);
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(this.LJIIIZ + 1), "play_order");
        C1022960cj8.LIZ(c1022820ciuLIZLLL, LJIJJLI());
    }

    @Override // X.InterfaceC1045690dJn
    public final void LJIIL(Context context, C1045720dJq c1045720dJq) {
        C588650N6x c588650N6x;
        this.LJIIIZ = 0;
        InterfaceC1045710dJp interfaceC1045710dJp = this.LJIILIIL;
        if (interfaceC1045710dJp != null && interfaceC1045710dJp.LJIIJJI()) {
            this.LJI.removeCallbacks((Runnable) this.LJIILJJIL.getValue());
        }
        this.LJ.LIZIZ = null;
        this.LJFF = null;
        String strLJ = LJ(c1045720dJq);
        if (C294490BgV.LIZ() && (c588650N6x = this.LIZLLL.get(strLJ)) != null && !c588650N6x.LJ.contains("omsdk_finish")) {
            LJIIZILJ(c1045720dJq, c588650N6x, "reset_state");
        }
        LJJIFFI(context, c1045720dJq);
        LJJIIJ(strLJ);
        this.LJII = 0;
        this.LJIIL = false;
        this.LJIIJJI = false;
    }

    public final void LJIILL(long j, long j2) {
        C1045740dJs c1045740dJs;
        C1045740dJs c1045740dJs2;
        C1045740dJs c1045740dJs3;
        long j3 = this.LJIIIIZZ;
        if (j != j3 && j2 != 0) {
            float f = j2;
            float f2 = j / f;
            float f3 = j3 / f;
            if (f2 >= 0.25f && f3 < 0.25f && f3 >= 0.0f && (c1045740dJs3 = this.LJFF) != null) {
                c1045740dJs3.LIZ();
            }
            if (f2 >= 0.5f && f3 < 0.5f && f3 >= 0.0f && (c1045740dJs2 = this.LJFF) != null) {
                c1045740dJs2.LIZIZ();
            }
            if (f2 >= 0.75f && f3 < 0.75f && f3 >= 0.0f && (c1045740dJs = this.LJFF) != null) {
                c1045740dJs.LIZLLL();
            }
            C1045740dJs c1045740dJs4 = this.LJFF;
            if (c1045740dJs4 != null) {
                c1045740dJs4.LIZJ();
            }
            this.LJIIIIZZ = j;
        }
    }

    public final void LJIJI(C1045720dJq c1045720dJq, String str) {
        C588650N6x c588650N6x;
        if (!C294490BgV.LIZ()) {
            return;
        }
        String strLJ = LJ(c1045720dJq);
        String strLJJIII = LJJIII(c1045720dJq);
        if (strLJJIII == null || (c588650N6x = this.LIZLLL.get(strLJ)) == null) {
            return;
        }
        c588650N6x.LIZLLL = str;
        C588660N6y c588660N6yLJIILLIIL = LJIILLIIL(c1045720dJq, c588650N6x, strLJJIII);
        if (Intrinsics.LJFF(str, "omsdk_pause")) {
            AwemeRawAd awemeRawAd = c1045720dJq.LJIIIZ;
            if (C294490BgV.LIZ()) {
                new C1020690cfT(c588660N6yLJIILLIIL, awemeRawAd).logAd(C2275821E6a.LIZ, awemeRawAd);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "omsdk_resume")) {
            return;
        }
        AwemeRawAd awemeRawAd2 = c1045720dJq.LJIIIZ;
        if (!C294490BgV.LIZ()) {
            return;
        }
        new C1020690cfT(c588660N6yLJIILLIIL, awemeRawAd2).logAd(C2275841E6c.LIZ, awemeRawAd2);
    }

    public final void LJJIFFI(Context context, C1045720dJq c1045720dJq) {
        C1045770dJv c1045770dJvLJIL;
        int iLIZ = C2540709xV.LIZ();
        String strLJ = LJ(c1045720dJq);
        AbstractC1045430dJN abstractC1045430dJN = this.LIZIZ.get(strLJ);
        if (iLIZ > 0 && abstractC1045430dJN != null) {
            if (!this.LJIIJJI && !this.LJIIL) {
                String strLJ2 = LJ(c1045720dJq);
                InterfaceC1045710dJp interfaceC1045710dJp = this.LJIILIIL;
                if ((interfaceC1045710dJp == null || !interfaceC1045710dJp.LJJIIJZLJL()) && (c1045770dJvLJIL = LJIL(c1045720dJq, context, null, C13BV.INSTANCE)) != null) {
                    C1045780dJw.LIZJ(c1045770dJvLJIL.LIZ);
                    c1045770dJvLJIL.LIZ.LJ.LIZ("skipped", null);
                }
                this.LJIIL = true;
                if (C294490BgV.LIZ()) {
                    String strLJJIII = LJJIII(c1045720dJq);
                    C588650N6x c588650N6x = this.LIZLLL.get(strLJ2);
                    if (strLJJIII != null && c588650N6x != null && !c588650N6x.LJ.contains("omsdk_break")) {
                        c588650N6x.LJ.add("omsdk_break");
                        c588650N6x.LIZLLL = "omsdk_break";
                        C1046770dLX.LIZLLL(LJIILLIIL(c1045720dJq, c588650N6x, strLJJIII), c1045720dJq.LJIIIZ);
                    }
                }
            }
            C786410Ut5.LJLIIL(((long) iLIZ) * 1000, this.LJI, new ARunnableS24S0400000_16(this, this.LIZLLL.get(strLJ), abstractC1045430dJN, c1045720dJq, 3));
        }
    }

    public final void LJJII(boolean z, C1045720dJq c1045720dJq) {
        int iZ3;
        AudioManager audioManager;
        AwemeRawAd awemeRawAd = c1045720dJq.LJIIIZ;
        if (awemeRawAd != null) {
            if (z) {
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(LJJI(), "mute", awemeRawAd);
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(this.LJIIIZ + 1), "play_order");
                c1022820ciuLIZLLL.LIZIZ(Float.valueOf(0.0f), "playervol");
                C1022960cj8.LIZ(c1022820ciuLIZLLL, LJIJJLI());
                return;
            }
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL(LJJI(), "unmute", awemeRawAd);
            c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(this.LJIIIZ + 1), "play_order");
            float fLIZ = this.LJ.LIZ();
            C1045750dJt c1045750dJt = this.LJ;
            c1045750dJt.getClass();
            int iZ32 = -1;
            try {
                audioManager = c1045750dJt.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
            if (audioManager != null) {
                iZ3 = C786410Ut5.Z3(audioManager, 3);
            } else {
                iZ3 = -1;
            }
            float f = iZ3;
            float fLIZ2 = this.LJ.LIZ();
            C1045750dJt c1045750dJt2 = this.LJ;
            c1045750dJt2.getClass();
            try {
                AudioManager audioManager2 = c1045750dJt2.LIZ;
                if (audioManager2 != null) {
                    iZ32 = C786410Ut5.Z3(audioManager2, 3);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1AF0.LJ(th2);
            }
            float f2 = fLIZ2 / iZ32;
            if (fLIZ > 0.0f && f > 0.0f) {
                f2 = fLIZ / f;
            }
            c1022820ciuLIZLLL2.LIZIZ(Float.valueOf(((int) (f2 * 100)) * 0.001f), "playervol");
            C1022960cj8.LIZ(c1022820ciuLIZLLL2, LJIJJLI());
        }
    }

    @Override // X.InterfaceC1045690dJn
    public final void LIZ(C1045720dJq c1045720dJq, Context context, int i) throws Throwable {
        if (i == 0) {
            C1045770dJv c1045770dJvLJIL = LJIL(c1045720dJq, context, null, C13BV.INSTANCE);
            if (c1045770dJvLJIL != null) {
                C1045780dJw.LIZJ(c1045770dJvLJIL.LIZ);
                c1045770dJvLJIL.LIZ.LJ.LIZ("resume", null);
            }
            LJIJI(c1045720dJq, "omsdk_resume");
        }
    }

    @Override // X.InterfaceC1045690dJn
    public final void LJIIJ(C1045720dJq c1045720dJq, Context context, int i) throws Throwable {
        if (i == 0) {
            C1045770dJv c1045770dJvLJIL = LJIL(c1045720dJq, context, null, C13BV.INSTANCE);
            if (c1045770dJvLJIL != null) {
                C1045780dJw.LIZJ(c1045770dJvLJIL.LIZ);
                c1045770dJvLJIL.LIZ.LJ.LIZ("pause", null);
            }
            LJIJI(c1045720dJq, "omsdk_pause");
        }
    }

    @Override // X.InterfaceC1045690dJn
    public final void LJIILIIL(C1045720dJq c1045720dJq, Context context, int i) throws Throwable {
        String strLJJIII;
        if (i == 1) {
            String strLJ = LJ(c1045720dJq);
            C1045770dJv c1045770dJvLJIL = LJIL(c1045720dJq, context, null, C13BV.INSTANCE);
            if (c1045770dJvLJIL != null) {
                C1045780dJw.LIZJ(c1045770dJvLJIL.LIZ);
                c1045770dJvLJIL.LIZ.LJ.LIZ("complete", null);
            }
            this.LJIIJJI = true;
            if (C294490BgV.LIZ() && (strLJJIII = LJJIII(c1045720dJq)) != null) {
                C588650N6x c588650N6x = this.LIZLLL.get(strLJ);
                if (c588650N6x != null) {
                    Set<String> set = c588650N6x.LJ;
                    if (set != null) {
                        set.add("omsdk_over");
                    }
                    c588650N6x.LIZLLL = "omsdk_over";
                }
                C1046770dLX.LJFF(LJIILLIIL(c1045720dJq, c588650N6x, strLJJIII), c1045720dJq.LJIIIZ, i);
            }
            LJJIFFI(context, c1045720dJq);
            LJJIIJ(strLJ);
            long jLJIJJ = LJIJJ();
            LJIILL(jLJIJJ, jLJIJJ);
        }
        this.LJIIIZ++;
        this.LJII = 0;
    }

    public final C588660N6y LJIILLIIL(C1045720dJq c1045720dJq, C588650N6x c588650N6x, String str) {
        String scene;
        String str2;
        String str3;
        String str4;
        InterfaceC1045710dJp interfaceC1045710dJp = this.LJIILIIL;
        if (interfaceC1045710dJp == null || (scene = interfaceC1045710dJp.getScene()) == null) {
            scene = "others";
        }
        String strLIZJ = C1046770dLX.LIZJ(scene);
        if (c588650N6x == null || (str2 = c588650N6x.LIZIZ) == null) {
            str2 = "unknown";
        }
        if (c588650N6x == null || (str3 = c588650N6x.LIZJ) == null) {
            str3 = "";
        }
        if (c1045720dJq.LJIIIIZZ) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        return new C588660N6y(strLIZJ, str, str2, str3, str4);
    }

    public final void LJIIZILJ(C1045720dJq c1045720dJq, C588650N6x c588650N6x, String str) {
        String strLIZIZ;
        if (!C294490BgV.LIZ() || c588650N6x == null) {
            return;
        }
        String str2 = c588650N6x.LIZ;
        String strLIZ = C1046770dLX.LIZ(c588650N6x.LJ);
        if (!Intrinsics.LJFF(strLIZ, "healthy")) {
            strLIZIZ = C1046770dLX.LIZIZ(c588650N6x.LJ);
        } else {
            strLIZIZ = null;
        }
        String str3 = c588650N6x.LIZLLL;
        c588650N6x.LJ.add("omsdk_finish");
        c588650N6x.LIZLLL = "omsdk_finish";
        C1046770dLX.LJ(LJIILLIIL(c1045720dJq, c588650N6x, str2), c1045720dJq.LJIIIZ, strLIZ, str3, strLIZIZ, str);
    }

    public final void LJIJ(C1045720dJq c1045720dJq, String str, int i) {
        C588650N6x c588650N6x;
        if (!C294490BgV.LIZ()) {
            return;
        }
        String strLJ = LJ(c1045720dJq);
        String strLJJIII = LJJIII(c1045720dJq);
        if (strLJJIII == null || (c588650N6x = this.LIZLLL.get(strLJ)) == null || c588650N6x.LJ.contains(str)) {
            return;
        }
        c588650N6x.LJ.add(str);
        c588650N6x.LIZLLL = str;
        C1046770dLX.LJIIIZ(LJIILLIIL(c1045720dJq, c588650N6x, strLJJIII), c1045720dJq.LJIIIZ, str, i);
    }

    public final AbstractC1045430dJN LJJ(List<C1045900dK8> list, Context context, C1045720dJq c1045720dJq) {
        if (!c1045720dJq.LJI) {
            return null;
        }
        String strLJ = LJ(c1045720dJq);
        AbstractC1045430dJN abstractC1045430dJNLIZIZ = this.LIZIZ.get(strLJ);
        if (abstractC1045430dJNLIZIZ != null) {
            return abstractC1045430dJNLIZIZ;
        }
        C1046020dKK c1046020dKK = C1BUQ.LIZ;
        if (!c1046020dKK.LIZ) {
            C1BUQ.LIZ(context);
            if (c1046020dKK.LIZ) {
                C1BUU.LJFF.LIZ();
            } else {
                throw new IllegalStateException("Method called before OM SDK activation");
            }
        }
        if (!c1046020dKK.LIZ) {
            return null;
        }
        try {
            String strLIZ = C08EL.LIZ(context);
            C844470XAv.LIZ.getClass();
            String strLJFF = C844470XAv.LJFF();
            C1045780dJw.LIZIZ("Bytedance", "Name is null or empty");
            C1045780dJw.LIZIZ(strLJFF, "Version is null or empty");
            C1046930dLn c1046930dLnLIZ = C1046930dLn.LIZ(new C1045960dKE(strLJFF), strLIZ, list, this.LIZ.get(strLJ));
            EnumC1045420dJM enumC1045420dJM = c1045720dJq.LIZLLL;
            EnumC1045410dJL enumC1045410dJL = c1045720dJq.LJ;
            EnumC1046030dKL enumC1046030dKL = EnumC1046030dKL.NATIVE;
            abstractC1045430dJNLIZIZ = AbstractC1045430dJN.LIZIZ(C1045760dJu.LIZ(enumC1045420dJM, enumC1045410dJL, enumC1046030dKL, enumC1046030dKL), c1046930dLnLIZ);
            this.LIZIZ.put(strLJ, abstractC1045430dJNLIZIZ);
            C793770VBv.LJIIJJI("OmAdSessionMonitor", 1, null);
            return abstractC1045430dJNLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create ad session failed ");
            sbLIZ.append(th);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception_message", th.getMessage());
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                jSONObject.put("exception_stack", stringWriter.toString());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            C793770VBv.LJIIJJI("OmAdSessionMonitor", 0, jSONObject);
            return abstractC1045430dJNLIZIZ;
        }
    }

    @Override // X.InterfaceC1045690dJn
    public final void LIZLLL(Context context, String str, List<C1045890dK7> list, C1045720dJq c1045720dJq) {
        this.LJIIJ = c1045720dJq;
        String strLJ = LJ(c1045720dJq);
        ArrayList arrayList = new ArrayList();
        for (C1045890dK7 c1045890dK7 : list) {
            arrayList.add(C1045900dK8.LIZ(c1045890dK7.LIZIZ, new URL(c1045890dK7.LIZ), c1045890dK7.LIZJ));
        }
        if (c1045720dJq.LJFF) {
            this.LIZ.put(strLJ, str);
        }
        LJJ(arrayList, context, c1045720dJq);
    }

    @Override // X.InterfaceC1045690dJn
    public final void LJFF(C1045720dJq c1045720dJq, Context context, int i, View view) throws Throwable {
        C1045770dJv c1045770dJvLJIL;
        int iZ3;
        AudioManager audioManager;
        if (i != 0 || (c1045770dJvLJIL = LJIL(c1045720dJq, context, view, C13BV.INSTANCE)) == null) {
            return;
        }
        float fLIZ = this.LJ.LIZ();
        C1045750dJt c1045750dJt = this.LJ;
        c1045750dJt.getClass();
        try {
            audioManager = c1045750dJt.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (audioManager != null) {
            iZ3 = C786410Ut5.Z3(audioManager, 3);
        } else {
            iZ3 = -1;
        }
        float f = fLIZ / iZ3;
        long jLJIJJ = LJIJJ();
        C2204961BRm.LLLLZIL(c1045770dJvLJIL, jLJIJJ, 1.0f, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMtWT5gyKSFMg76+phNkbgmy1q2ql9SShbUMeU+rF0b0tSLNH4xw==", null));
        if (C294490BgV.LIZ()) {
            String strLJ = LJ(c1045720dJq);
            String strLJJIII = LJJIII(c1045720dJq);
            if (strLJJIII != null) {
                C588650N6x c588650N6x = this.LIZLLL.get(strLJ);
                if (c588650N6x != null) {
                    Set<String> set = c588650N6x.LJ;
                    if (set != null) {
                        set.add("omsdk_start");
                    }
                    c588650N6x.LIZLLL = "omsdk_start";
                }
                C1046770dLX.LJIIJ(LJIILLIIL(c1045720dJq, c588650N6x, strLJJIII), c1045720dJq.LJIIIZ, jLJIJJ, i);
            }
        }
        this.LJIIJ = c1045720dJq;
        InterfaceC1045710dJp interfaceC1045710dJp = this.LJIILIIL;
        boolean z = false;
        if (interfaceC1045710dJp != null && interfaceC1045710dJp.LJIIJJI()) {
            this.LJI.removeCallbacks((Runnable) this.LJIILJJIL.getValue());
            C786410Ut5.LJLIIL(200L, this.LJI, (Runnable) this.LJIILJJIL.getValue());
        }
        InterfaceC1045710dJp interfaceC1045710dJp2 = this.LJIILIIL;
        if (interfaceC1045710dJp2 != null && interfaceC1045710dJp2.LJIIJJI()) {
            this.LJIIIIZZ = -1L;
            LJIILL(0L, jLJIJJ);
        }
        if (f <= 0.0f) {
            z = true;
        }
        LJJII(z, c1045720dJq);
        if (c1045720dJq.LJII) {
            C1022960cj8.LIZ(C2184171Adz.LIZLLL(LJJI(), "auto_full_screen", c1045720dJq.LJIIIZ), LJIJJLI());
        }
    }

    @Override // X.InterfaceC1045690dJn
    public final void LJII(C1045720dJq c1045720dJq, View view, List<? extends View> list, String str) throws Throwable {
        String strLJ = LJ(c1045720dJq);
        if (c1045720dJq.LJFF && c1045720dJq.LJI) {
            this.LIZ.put(strLJ, str);
        }
        LJIL(c1045720dJq, view.getContext(), view, list);
        this.LJIIJ = c1045720dJq;
    }

    @Override // X.InterfaceC1045690dJn
    public final void LJIILJJIL(C1045720dJq c1045720dJq, Context context, View view, List<? extends View> list) throws Throwable {
        AbstractC1045430dJN abstractC1045430dJN = this.LIZIZ.get(LJ(c1045720dJq));
        if (abstractC1045430dJN != null) {
            abstractC1045430dJN.LIZLLL(view);
            abstractC1045430dJN.LJ();
            Iterator<? extends View> it2 = list.iterator();
            while (it2.hasNext()) {
                abstractC1045430dJN.LIZ(it2.next(), EnumC1045490dJT.OTHER);
            }
            C1045770dJv c1045770dJvLJIL = LJIL(c1045720dJq, context, view, list);
            if (c1045770dJvLJIL != null) {
                C1045780dJw.LIZJ(c1045770dJvLJIL.LIZ);
                c1045770dJvLJIL.LIZ.LJ.LIZ("resume", null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1045770dJv LJIL(X.C1045720dJq r10, android.content.Context r11, android.view.View r12, java.util.List<? extends android.view.View> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045640dJi.LJIL(X.0dJq, android.content.Context, android.view.View, java.util.List):X.0dJv");
    }
}

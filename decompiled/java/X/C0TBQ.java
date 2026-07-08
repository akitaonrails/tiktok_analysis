package X;

import Y.AfS181S0100000_12;
import Y.AkS475S0100000_12;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TBQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TBQ {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final Fragment LIZ;
    public final C19EG LIZIZ;
    public final ServiceConnection LIZJ;
    public final C11PQ<Boolean> LIZLLL;
    public final IHostAction LJ;
    public C11JF LJFF;
    public C11JF LJI;
    public C11JF LJII;
    public final C11NJ LJIIIIZZ;
    public C11JF LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;

    public final void LIZ() {
        C11PQ<Integer> bgBroadcastServiceState;
        LIZLLL("bindService");
        IHostAction iHostAction = this.LJ;
        if (iHostAction != null && (bgBroadcastServiceState = iHostAction.getBgBroadcastServiceState()) != null) {
            C11JF c11jf = this.LJI;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LJI = (C11JF) bgBroadcastServiceState.LJJIL(new C786280Uss(this, 5)).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 325), new C09JN() { // from class: X.0TAH
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameBgServiceHelper@d7ff.bindService$1$3");
                    C20441214yg.LJI("GameBgServiceHelper", (Throwable) obj);
                    C1C7U.LIZIZ("GameBgServiceHelper@d7ff.bindService$1$3");
                }
            });
        }
        C11JF c11jf2 = this.LJI;
        if (c11jf2 != null) {
            this.LJIIIIZZ.LIZ(c11jf2);
        }
    }

    public final void LJ() {
        LIZLLL("startService");
        C11JF c11jf = this.LJII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LJFF;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        InterfaceC420801kM interfaceC420801kMLJJLL = this.LIZLLL.LJJIL(new InterfaceC19483011Ki() { // from class: X.0TBR
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return ((Boolean) obj).booleanValue();
            }
        }).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJ(new AkS475S0100000_12(this, 14), false).LJJIL(new InterfaceC19483011Ki() { // from class: X.0TBS
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (obj == Lifecycle.Event.ON_RESUME) {
                    return true;
                }
                return false;
            }
        }).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 326), new C09JN() { // from class: X.0TAJ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameBgServiceHelper@d7ff.startService$5");
                C20441214yg.LJI("GameBgServiceHelper", (Throwable) obj);
                C1C7U.LIZIZ("GameBgServiceHelper@d7ff.startService$5");
            }
        });
        this.LJFF = (C11JF) interfaceC420801kMLJJLL;
        this.LJIIIIZZ.LIZ(interfaceC420801kMLJJLL);
    }

    public final void LJFF() {
        C11PQ<Integer> bgBroadcastServiceState;
        LIZLLL("stopService");
        C11JF c11jf = this.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LJI;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        IHostAction iHostAction = this.LJ;
        if (iHostAction == null || (bgBroadcastServiceState = iHostAction.getBgBroadcastServiceState()) == null) {
            return;
        }
        C11JF c11jf3 = this.LJII;
        if (c11jf3 != null) {
            c11jf3.dispose();
        }
        this.LJII = (C11JF) bgBroadcastServiceState.LJJIL(new C786280Uss(this, 6)).LJLIIL(1L).LJLJI(5L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 327), new C09JN() { // from class: X.0TAI
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameBgServiceHelper@d7ff.stopService$1$3");
                C20441214yg.LJI("GameBgServiceHelper", (Throwable) obj);
                C1C7U.LIZIZ("GameBgServiceHelper@d7ff.stopService$1$3");
            }
        });
    }

    public static Intent LIZIZ(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getBgBroadcastServiceName()));
        return intent;
    }

    public static void LIZLLL(String str) {
        C20441214yg.LJIIIZ("GameBgServiceHelper", str);
    }

    public final void LIZJ(Context context, boolean z) {
        Boolean boolValueOf;
        String str;
        IHostAction iHostAction = this.LJ;
        if (iHostAction != null) {
            boolValueOf = Boolean.valueOf(iHostAction.getBgBroadcastServiceCreate());
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf) && !z) {
            C20441214yg.LIZIZ("GameBgServiceHelper", "checkAndRestartMirrorService, start skip, Mirror Service alive");
            return;
        }
        if (z) {
            str = "force start";
        } else {
            str = "die";
        }
        try {
            C20441214yg.LIZIZ("GameBgServiceHelper", "checkAndRestartMirrorService, Mirror Service ".concat(str));
            if (Build.VERSION.SDK_INT >= 26) {
                C2204961BRm.LJJJJL(context, LIZIZ(context), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYHolk6i4pACa1t8Pnw89ygfkU+A7/k6sWL93FTUKx/AZsAUpfrGSryxA2ZSkVGg==", null));
            } else {
                C786410Ut5.s3(context, LIZIZ(context));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJI(Function0<Unit> function0, Function0<Unit> function02) {
        LIZLLL("waitServiceStarted");
        IHostAction iHostAction = this.LJ;
        if (iHostAction != null && iHostAction.getBgBroadcastServiceCreate()) {
            function02.invoke();
            LIZLLL("waitServiceStarted action2");
        } else {
            function0.invoke();
            LJ();
            LIZ();
            LIZLLL("waitServiceStarted action1");
        }
    }

    public C0TBQ(Fragment fragment, C19EG c19eg, ServiceConnectionC776290Ucl serviceConnectionC776290Ucl) {
        C11PQ<Integer> bgBroadcastServiceState;
        C11PQ<Integer> bgBroadcastServiceState2;
        this.LIZ = fragment;
        this.LIZIZ = c19eg;
        this.LIZJ = serviceConnectionC776290Ucl;
        C11PQ<Boolean> c11pqLJLLLLLL = C11PQ.LJLLLLLL(Boolean.FALSE);
        this.LIZLLL = c11pqLJLLLLLL;
        C11NJ c11nj = new C11NJ();
        this.LJIIIIZZ = c11nj;
        this.LJIIJJI = Integer.MAX_VALUE;
        this.LJIIL = Integer.MAX_VALUE;
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        this.LJ = iHostAction;
        if (iHostAction != null && (bgBroadcastServiceState2 = iHostAction.getBgBroadcastServiceState()) != null) {
            bgBroadcastServiceState2.onNext(0);
        }
        c11pqLJLLLLLL.onNext(Boolean.valueOf(DataChannelGlobal.LLILZ.gg0(C168G.class) != null));
        c11nj.LIZ(c11pqLJLLLLLL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 323), new C09JN() { // from class: X.0TAF
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameBgServiceHelper@d7ff.<init>$2");
                C20441214yg.LJI("GameBgServiceHelper", (Throwable) obj);
                C1C7U.LIZIZ("GameBgServiceHelper@d7ff.<init>$2");
            }
        }));
        if (iHostAction != null && (bgBroadcastServiceState = iHostAction.getBgBroadcastServiceState()) != null) {
            c11nj.LIZ(bgBroadcastServiceState.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 324), new C09JN() { // from class: X.0TAG
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GameBgServiceHelper@d7ff.<init>$3$2");
                    C20441214yg.LJI("GameBgServiceHelper", (Throwable) obj);
                    C1C7U.LIZIZ("GameBgServiceHelper@d7ff.<init>$3$2");
                }
            }));
        }
    }
}

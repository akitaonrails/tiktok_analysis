package Y;

import X.C0WZX;
import X.C13LZ;
import X.C2204961BRm;
import X.C2219681BuA;
import X.C2219831BuP;
import X.C2220031Buj;
import X.C2220141Buu;
import X.C2220151Buv;
import X.C2220161Buw;
import X.C2220171Bux;
import X.C259800zU;
import X.C786410Ut5;
import X.InterfaceC1304030k2T;
import android.app.Activity;
import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import android.provider.Settings;
import com.bytedance.creationmodel.framework.CommonModelReadWriterInternal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AObjectS301S0200000_34 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.1BuH] */
    public static final Object invoke$0(AObjectS301S0200000_34 aObjectS301S0200000_34) {
        ((C259800zU) aObjectS301S0200000_34.l0).element = ((C2219681BuA) aObjectS301S0200000_34.l1).LJLI();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS301S0200000_34 aObjectS301S0200000_34) throws Throwable {
        boolean z;
        C2219681BuA c2219681BuA = (C2219681BuA) aObjectS301S0200000_34.l0;
        Function1 function1 = (Function1) aObjectS301S0200000_34.l1;
        c2219681BuA.getClass();
        C2220031Buj c2220031Buj = new C2220031Buj();
        Object objH2 = C786410Ut5.H2(c2219681BuA.LIZ.LIZ(), "batterymanager");
        if (objH2 != null) {
            BatteryManager batteryManager = (BatteryManager) objH2;
            int iLL = C2204961BRm.LL(batteryManager, 4, new C0WZX("dzBzEgAjS8/YVFkiQFyFazRzjkQWGhg/xMmInCmbDBgXSP3lHXwHkAK6sfEdvDiihSyN29ZGdEdsBqrR0klbMbwkcR9Iq39AS1NA", null));
            c2220031Buj.LIZ = iLL;
            boolean z2 = true;
            if (Build.VERSION.SDK_INT >= 26 && C2204961BRm.LL(batteryManager, 6, new C0WZX("dzBzEgAjS8/YVFkiQFyFazRzjkQWGhg/xMmInCmbDBgXSP3lHXwHkAK6sfEdvDiihSyN29ZGdEdsBqrR0klbMbwkcR9Iq39AS1NA", null)) == 2) {
                z = true;
            } else {
                z = false;
            }
            c2220031Buj.LIZIZ = z;
            if (iLL >= 20) {
                z2 = false;
            }
            c2220031Buj.LIZJ = z2;
        }
        function1.invoke(c2220031Buj);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS301S0200000_34 aObjectS301S0200000_34) {
        ((Function1) aObjectS301S0200000_34.l1).invoke(((C2219681BuA) aObjectS301S0200000_34.l0).LJLIIIL());
        return Unit.LIZ;
    }

    public static final Object invoke$11(AObjectS301S0200000_34 aObjectS301S0200000_34) {
        return ((Function1) aObjectS301S0200000_34.l0).invoke(((CommonModelReadWriterInternal) aObjectS301S0200000_34.l1).LJFF.invoke());
    }

    public static final Object invoke$2(AObjectS301S0200000_34 aObjectS301S0200000_34) {
        String str;
        C2219681BuA c2219681BuA = (C2219681BuA) aObjectS301S0200000_34.l0;
        Function1 function1 = (Function1) aObjectS301S0200000_34.l1;
        Context contextLIZ = c2219681BuA.LIZ.LIZ();
        C2220161Buw c2220161Buw = new C2220161Buw(0);
        c2220161Buw.LIZ = false;
        c2220161Buw.LIZIZ = false;
        c2220161Buw.LIZJ = false;
        if (contextLIZ.getResources().getConfiguration().orientation == 2) {
            str = "landscape";
        } else {
            str = "portrait";
        }
        c2220161Buw.LIZLLL = str;
        function1.invoke(c2220161Buw);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS301S0200000_34 aObjectS301S0200000_34) {
        ((Function1) aObjectS301S0200000_34.l1).invoke(((C2219681BuA) aObjectS301S0200000_34.l0).LJLI());
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS301S0200000_34 aObjectS301S0200000_34) {
        C2219681BuA c2219681BuA = (C2219681BuA) aObjectS301S0200000_34.l0;
        Function1 function1 = (Function1) aObjectS301S0200000_34.l1;
        c2219681BuA.getClass();
        function1.invoke(new C2220171Bux(0));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.1BuB] */
    public static final Object invoke$5(AObjectS301S0200000_34 aObjectS301S0200000_34) {
        ((C259800zU) aObjectS301S0200000_34.l0).element = ((C2219681BuA) aObjectS301S0200000_34.l1).LJLIIIL();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS301S0200000_34 aObjectS301S0200000_34) throws Throwable {
        C2219681BuA c2219681BuA = (C2219681BuA) aObjectS301S0200000_34.l0;
        AObjectS376S0100000_34 aObjectS376S0100000_34 = new AObjectS376S0100000_34((C259800zU) aObjectS301S0200000_34.l1, 2);
        c2219681BuA.getClass();
        c2219681BuA.LJJZZI(new AObjectS301S0200000_34(c2219681BuA, aObjectS376S0100000_34, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS301S0200000_34 aObjectS301S0200000_34) {
        C2219681BuA c2219681BuA = (C2219681BuA) aObjectS301S0200000_34.l0;
        Function1 function1 = (Function1) aObjectS301S0200000_34.l1;
        InterfaceC1304030k2T interfaceC1304030k2T = c2219681BuA.LIZ.LIZJ;
        C2220141Buu c2220141Buu = new C2220141Buu(0);
        c2220141Buu.LIZ = c2219681BuA.LJIIJ;
        c2220141Buu.LIZIZ = false;
        c2220141Buu.LIZJ = "";
        c2220141Buu.LIZLLL = interfaceC1304030k2T.getAppLanguage();
        c2220141Buu.LJ = c2219681BuA.LIZ.LJ;
        c2220141Buu.LJFF = "light";
        c2220141Buu.LJI = 1.0f;
        c2220141Buu.LJII = 16.0f;
        function1.invoke(c2220141Buu);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AObjectS301S0200000_34 aObjectS301S0200000_34) {
        C2219681BuA c2219681BuA = (C2219681BuA) aObjectS301S0200000_34.l0;
        Function1 function1 = (Function1) aObjectS301S0200000_34.l1;
        c2219681BuA.getClass();
        function1.invoke(new C2220151Buv(0));
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS301S0200000_34 aObjectS301S0200000_34) {
        float fLIZLLL;
        C2219681BuA c2219681BuA = (C2219681BuA) aObjectS301S0200000_34.l0;
        Function1 function1 = (Function1) aObjectS301S0200000_34.l1;
        c2219681BuA.getClass();
        C2219831BuP c2219831BuP = new C2219831BuP();
        Activity activity = c2219681BuA.LIZ.LIZJ.getActivity();
        if (activity != null) {
            float f = activity.getWindow().getAttributes().screenBrightness;
            if (f >= 0.0f) {
                fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
            } else {
                try {
                    fLIZLLL = C13LZ.LIZLLL(Settings.System.getInt(c2219681BuA.LIZ.LIZ().getContentResolver(), "screen_brightness") / 255.0f, 0.0f, 1.0f);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    fLIZLLL = -2.0f;
                }
            }
            c2219831BuP.LIZ = fLIZLLL;
        }
        function1.invoke(c2219831BuP);
        return Unit.LIZ;
    }

    public AObjectS301S0200000_34(C2219681BuA c2219681BuA, C259800zU c259800zU, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 5:
                this.l0 = c259800zU;
                this.l1 = c2219681BuA;
                break;
            default:
                this.l0 = c2219681BuA;
                this.l1 = c259800zU;
                break;
        }
    }

    public AObjectS301S0200000_34(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

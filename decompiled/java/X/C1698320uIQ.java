package X;

import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import jkp.j;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uIQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698320uIQ implements InterfaceC1680560tpm {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1680560tpm
    public final void dispose() {
        switch (this.$t) {
            case 0:
                dispose$0(this);
                break;
            case 1:
                dispose$1(this);
                break;
            case 2:
                dispose$2(this);
                break;
            case 3:
                dispose$3(this);
                break;
            case 4:
                dispose$4(this);
                break;
            case 5:
                dispose$5(this);
                break;
            case 6:
                dispose$6(this);
                break;
            case 7:
                dispose$7(this);
                break;
            case 8:
                dispose$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                dispose$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                dispose$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                dispose$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                dispose$12(this);
                break;
        }
    }

    public static final void dispose$0(C1698320uIQ c1698320uIQ) {
        C2296808zG.LIZJ((InterfaceC497601wk) c1698320uIQ.l0, null);
    }

    public static final void dispose$1(C1698320uIQ c1698320uIQ) {
        C1679540to8 c1679540to8 = (C1679540to8) c1698320uIQ.l0;
        c1679540to8.getClass();
        c1679540to8.LIZIZ = C13BV.INSTANCE;
        c1679540to8.LIZJ = new long[0];
        ((C13FE) c1679540to8.LJ).setValue("");
        ((C13FE) c1679540to8.LJFF).setValue(j.LLILLL);
    }

    public static final void dispose$10(C1698320uIQ c1698320uIQ) {
        ((C1692140u8S) c1698320uIQ.l0).LJIILIIL();
    }

    public static final void dispose$11(C1698320uIQ c1698320uIQ) {
        C13E8<C1320770kTT<C1331070kk5>> c13e8 = C1668620tWW.LIZ;
        C1320770kTT<C1331070kk5> c1320770kTT = (C1320770kTT) c1698320uIQ.l0;
        C13E8<C1320770kTT<C1331070kk5>> c13e82 = C1668620tWW.LIZ;
        synchronized (c13e82) {
            try {
                c1320770kTT.LJIIIIZZ(null);
                c13e82.addLast(c1320770kTT);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void dispose$12(C1698320uIQ c1698320uIQ) {
        C21149817pg c21149817pg = (C21149817pg) c1698320uIQ.l0;
        c21149817pg.LIZ();
        c21149817pg.LIZLLL.removeCallbacksAndMessages(null);
    }

    public static final void dispose$2(C1698320uIQ c1698320uIQ) {
        C1676910tjt c1676910tjt = (C1676910tjt) c1698320uIQ.l0;
        c1676910tjt.LJIIIZ();
        c1676910tjt.LIZ.LJ();
    }

    public static final void dispose$3(C1698320uIQ c1698320uIQ) {
        C1676910tjt c1676910tjt = (C1676910tjt) c1698320uIQ.l0;
        c1676910tjt.LJIIIZ();
        c1676910tjt.LIZ.LJ();
    }

    public static final void dispose$4(C1698320uIQ c1698320uIQ) {
        ((Function0) c1698320uIQ.l0).invoke();
    }

    public static final void dispose$5(C1698320uIQ c1698320uIQ) {
        C786410Ut5.LJIIJ((DialogC1389620mGW) c1698320uIQ.l0);
    }

    public static final void dispose$6(C1698320uIQ c1698320uIQ) {
        ((C1698030uHx) c1698320uIQ.l0).LJ();
    }

    public static final void dispose$7(C1698320uIQ c1698320uIQ) {
        DialogC1686750tzl dialogC1686750tzl = (DialogC1686750tzl) c1698320uIQ.l0;
        dialogC1686750tzl.dismiss();
        C785410UrT.LIZ(dialogC1686750tzl);
        ((DialogC1686750tzl) c1698320uIQ.l0).LLIZ.LIZLLL();
    }

    public static final void dispose$8(C1698320uIQ c1698320uIQ) {
        ((C1686700tzg) c1698320uIQ.l0).LIZLLL();
        C1686700tzg c1686700tzg = (C1686700tzg) c1698320uIQ.l0;
        c1686700tzg.getClass();
        ViewTreeLifecycleOwner.set(c1686700tzg, null);
        c1686700tzg.LLJILLL.removeViewImmediate(c1686700tzg);
    }

    public static final void dispose$9(C1698320uIQ c1698320uIQ) {
        ((C1697350uGr) c1698320uIQ.l0).LJFF = true;
    }

    public C1698320uIQ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0XpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860540XpM {
    public static String LJ;
    public static AnonymousClass0956 LJIIIZ;
    public static C860570XpP LIZ = new C860570XpP(0);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicLong LIZJ = new AtomicLong(0);
    public static String LIZLLL = "";
    public static final C860590XpR LJFF = new C860590XpR();
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(551));
    public static final C054G LJIIIIZZ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));

    public static void LIZIZ() {
        if (!((Boolean) LJII.getValue()).booleanValue()) {
            LIZIZ.set(false);
        } else {
            if (!LIZIZ.compareAndSet(true, false)) {
                return;
            }
            AnonymousClass0956 anonymousClass0956 = LJIIIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LJIIIZ = null;
        }
        LIZ = new C860570XpP(0);
        LJ = null;
        C860580XpQ.LIZIZ.end();
    }

    public static C860590XpR LIZ() {
        return LJFF;
    }
}

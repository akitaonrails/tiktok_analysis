package X;

import Y.ARunnableS14S1100000_9;
import Y.ARunnableS42S0300000_9;
import Y.ARunnableS78S0200000_9;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS10S1000100_9;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N8B, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N8B extends C0N8H<Aweme> implements C0N8E {
    public static final /* synthetic */ int LJIIJ = 0;
    public final C0N8C LJI;
    public final C0N8J<Aweme> LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    @Override // X.InterfaceC2258671Dar
    public final void LJIILLIIL() {
    }

    public final void LJIILIIL() {
        C0N8C c0n8c = this.LJI;
        c0n8c.LIZ.setValue(c0n8c, C0N8C.LIZIZ[0], this);
    }

    @Override // X.InterfaceC2258821Db6
    public final String LJIIZILJ() {
        String strLJJJLIIL;
        C0N0Y c0n0yLIZ = this.LJI.LIZ();
        return (c0n0yLIZ == null || (strLJJJLIIL = c0n0yLIZ.LJJJLIIL()) == null) ? "undefined" : strLJJJLIIL;
    }

    @Override // X.InterfaceC2258821Db6
    public final long LLLJL() {
        C0N0Y c0n0yLIZ = this.LJI.LIZ();
        if (c0n0yLIZ != null) {
            return c0n0yLIZ.getCurrentPosition();
        }
        return -10003L;
    }

    @Override // X.InterfaceC2258821Db6
    public final boolean isPlaying() {
        C0N0Y c0n0yLIZ = this.LJI.LIZ();
        if (c0n0yLIZ != null) {
            return c0n0yLIZ.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC2258681Das
    public final String LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC2258681Das
    public final String getEventType() {
        return this.LJIIIZ;
    }

    @Override // X.C0N8E
    public final void F4(String str) {
        if (str == null) {
            return;
        }
        Handler handler = this.LJFF;
        if (!Intrinsics.LJFF(Looper.myLooper(), handler.getLooper())) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS14S1100000_9(this, str, 18));
            return;
        }
        Iterator<T> it2 = this.LJ.values().iterator();
        while (it2.hasNext()) {
            ((C0N86) it2.next()).LJIIIIZZ(this.LJIIIZ, str);
        }
    }

    @Override // X.InterfaceC2258821Db6
    public final long LJII(String str) {
        C0N0Y c0n0yLIZ = this.LJI.LIZ();
        if (c0n0yLIZ != null) {
            long jLJJJLL = c0n0yLIZ.LJJJLL(str);
            C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = jLJJJLL;
            C589080N8o.LJ(this, null, new AwS158S1100000_9(str, c238400w2, 31));
            if (c238400w2.element <= 0) {
                Pair pair = new Pair(LJIIZILJ(), Long.valueOf(LLLJL()));
                String str2 = (String) pair.getFirst();
                long jLongValue = ((Number) pair.getSecond()).longValue();
                C589080N8o.LJ(this, null, new AwS10S1000100_9(str2, jLongValue, 1));
                if (Intrinsics.LJFF(str2, str)) {
                    c238400w2.element = jLongValue;
                }
            }
            return c238400w2.element;
        }
        return -10003L;
    }

    public final void LJIILL(String str) {
        if (str == null) {
            return;
        }
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
        Handler handler = this.LJFF;
        if (!Intrinsics.LJFF(Looper.myLooper(), handler.getLooper())) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS14S1100000_9(this, str, 19));
            return;
        }
        Iterator<T> it2 = this.LJ.values().iterator();
        while (it2.hasNext()) {
            ((C0N86) it2.next()).LIZ(this.LJIIIZ, str);
        }
    }

    public C0N8B(C588970N8d c588970N8d, C0N21 c0n21) {
        super(null);
        this.LJI = c588970N8d;
        this.LJII = c0n21;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c588970N8d.LIZIZ());
        sbLIZ.append('/');
        sbLIZ.append(C0N8B.class.getSimpleName());
        this.LJIIIIZZ = C2088108Fz.LIZIZ(c588970N8d, C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIZ = c588970N8d.LIZLLL;
        c588970N8d.LIZIZ();
    }

    @Override // X.C0N8E
    public final void LIZ(Aweme aweme, Map<String, ? extends Object> map) {
        C0N23 c0n23LIZ = this.LJII.LIZ(aweme);
        if (c0n23LIZ != null) {
            MeasurementDependencyModules.LIZ.getClass();
            C04TF.LIZ().isDebug();
            Handler handler = this.LJFF;
            if (!Intrinsics.LJFF(Looper.myLooper(), handler.getLooper())) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS42S0300000_9(this, c0n23LIZ, map, 18));
                return;
            }
            Iterator<T> it2 = this.LJ.values().iterator();
            while (it2.hasNext()) {
                ((C0N86) it2.next()).LJIILL(c0n23LIZ, this.LJIIIZ, map);
            }
        }
    }

    @Override // X.C0N8E
    public final void LIZIZ(Aweme aweme, Map<String, ? extends Object> map) {
        String aid;
        Handler handler = this.LJFF;
        if (!Intrinsics.LJFF(Looper.myLooper(), handler.getLooper())) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS78S0200000_9(this, aweme, 88));
        } else {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            LJIILL(aid);
        }
        C0N23 c0n23LIZ = this.LJII.LIZ(aweme);
        if (c0n23LIZ != null) {
            MeasurementDependencyModules.LIZ.getClass();
            C04TF.LIZ().isDebug();
            Handler handler2 = this.LJFF;
            if (!Intrinsics.LJFF(Looper.myLooper(), handler2.getLooper())) {
                C786410Ut5.LJJZZIII(handler2, new ARunnableS42S0300000_9(this, c0n23LIZ, map, 19));
                return;
            }
            Iterator<T> it2 = this.LJ.values().iterator();
            while (it2.hasNext()) {
                ((C0N86) it2.next()).LJIILIIL(c0n23LIZ, this.LJIIIZ, map);
            }
        }
    }
}

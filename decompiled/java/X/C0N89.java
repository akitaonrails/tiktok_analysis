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
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N89, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N89 extends C0N8H<Aweme> implements InterfaceC581470MrJ {
    public final AbstractC583190Mu5 LJI;
    public final C0N8J<Aweme> LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    public final void LJIILIIL() {
        AbstractC583190Mu5 abstractC583190Mu5 = this.LJI;
        abstractC583190Mu5.LIZ.setValue(abstractC583190Mu5, AbstractC583190Mu5.LIZIZ[0], this);
    }

    @Override // X.InterfaceC2258671Dar
    public final void LJIILLIIL() {
        C589080N8o.LIZIZ(this, null, new AwS553S0100000_9(this, 1781));
        this.LJ.clear();
    }

    @Override // X.InterfaceC2258821Db6
    public final String LJIIZILJ() {
        String strLJJJLIIL = this.LJI.LIZIZ().LJJJLIIL();
        return strLJJJLIIL == null ? "undefined" : strLJJJLIIL;
    }

    @Override // X.InterfaceC2258821Db6
    public final long LLLJL() {
        return this.LJI.LIZIZ().getCurrentPosition();
    }

    @Override // X.InterfaceC2258821Db6
    public final boolean isPlaying() {
        return this.LJI.LIZIZ().isPlaying();
    }

    @Override // X.InterfaceC2258681Das
    public final String LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC2258681Das
    public final String getEventType() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC581470MrJ
    public final void F4(String str) {
        if (str == null) {
            return;
        }
        Handler handler = this.LJFF;
        if (!Intrinsics.LJFF(Looper.myLooper(), handler.getLooper())) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS14S1100000_9(this, str, 16));
            return;
        }
        Iterator<T> it2 = this.LJ.values().iterator();
        while (it2.hasNext()) {
            ((C0N86) it2.next()).LJIIIIZZ(this.LJIIIZ, str);
        }
    }

    @Override // X.InterfaceC581470MrJ
    public final void LJI(String str) {
        if (str == null) {
            return;
        }
        Handler handler = this.LJFF;
        if (!Intrinsics.LJFF(Looper.myLooper(), handler.getLooper())) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS14S1100000_9(this, str, 15));
            return;
        }
        Iterator<T> it2 = this.LJ.values().iterator();
        while (it2.hasNext()) {
            ((C0N86) it2.next()).LIZIZ(this.LJIIIZ, str);
        }
    }

    @Override // X.InterfaceC2258821Db6
    public final long LJII(String str) {
        long jLJJJLL = this.LJI.LIZIZ().LJJJLL(str);
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = jLJJJLL;
        C589080N8o.LJ(this, null, new AwS158S1100000_9(str, c238400w2, 30));
        if (c238400w2.element <= 0) {
            Pair pair = new Pair(LJIIZILJ(), Long.valueOf(LLLJL()));
            String str2 = (String) pair.getFirst();
            long jLongValue = ((Number) pair.getSecond()).longValue();
            C589080N8o.LJ(this, null, new AwS10S1000100_9(str2, jLongValue, 0));
            if (Intrinsics.LJFF(str2, str)) {
                c238400w2.element = jLongValue;
            }
        }
        return c238400w2.element;
    }

    public final void LJIILL(String str) {
        if (str == null) {
            return;
        }
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
        Handler handler = this.LJFF;
        if (!Intrinsics.LJFF(Looper.myLooper(), handler.getLooper())) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS14S1100000_9(this, str, 17));
            return;
        }
        Iterator<T> it2 = this.LJ.values().iterator();
        while (it2.hasNext()) {
            ((C0N86) it2.next()).LIZ(this.LJIIIZ, str);
        }
    }

    public C0N89(AbstractC583190Mu5 abstractC583190Mu5, C584970Mwx c584970Mwx) {
        super(null);
        this.LJI = abstractC583190Mu5;
        this.LJII = c584970Mwx;
        this.LJIIIIZZ = abstractC583190Mu5.LIZJ();
        this.LJIIIZ = abstractC583190Mu5.LIZ();
        abstractC583190Mu5.LIZJ();
    }

    @Override // X.InterfaceC581470MrJ
    public final void LIZ(Aweme aweme, Map<String, ? extends Object> map) {
        C0N23 c0n23LIZIZ = this.LJII.LIZIZ(aweme, this.LJIIIZ);
        if (c0n23LIZIZ != null) {
            MeasurementDependencyModules.LIZ.getClass();
            C04TF.LIZ().isDebug();
            Handler handler = this.LJFF;
            if (!Intrinsics.LJFF(Looper.myLooper(), handler.getLooper())) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS42S0300000_9(this, c0n23LIZIZ, map, 14));
                return;
            }
            Iterator<T> it2 = this.LJ.values().iterator();
            while (it2.hasNext()) {
                ((C0N86) it2.next()).LJIILL(c0n23LIZIZ, this.LJIIIZ, map);
            }
        }
    }

    @Override // X.InterfaceC581470MrJ
    public final void LIZIZ(Aweme aweme, Map<String, ? extends Object> map) {
        Handler handler = this.LJFF;
        if (!Intrinsics.LJFF(Looper.myLooper(), handler.getLooper())) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS78S0200000_9(this, aweme, 75));
        } else {
            LJIILL(aweme.getAid());
        }
        C0N23 c0n23LIZIZ = this.LJII.LIZIZ(aweme, this.LJIIIZ);
        if (c0n23LIZIZ != null) {
            MeasurementDependencyModules.LIZ.getClass();
            C04TF.LIZ().isDebug();
            Handler handler2 = this.LJFF;
            if (!Intrinsics.LJFF(Looper.myLooper(), handler2.getLooper())) {
                C786410Ut5.LJJZZIII(handler2, new ARunnableS42S0300000_9(this, c0n23LIZIZ, map, 15));
                return;
            }
            Iterator<T> it2 = this.LJ.values().iterator();
            while (it2.hasNext()) {
                ((C0N86) it2.next()).LJIILIIL(c0n23LIZIZ, this.LJIIIZ, map);
            }
        }
    }
}

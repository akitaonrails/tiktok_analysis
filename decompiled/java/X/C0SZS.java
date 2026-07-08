package X;

import X.C03H5;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS13S1100100_11;
import kotlin.jvm.internal.AwS1S1110100_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SZS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SZS<R extends C03H5, ITEM> {
    public final C13IQ<?> LIZ;
    public final C0SZU<R, ITEM> LIZIZ;
    public final String LIZJ;
    public C0SMO<R, ITEM> LIZLLL;

    public final void LIZIZ() {
        C0SMO<R, ITEM> c0smo = this.LIZLLL;
        if (c0smo != null) {
            c0smo.setProxy(null);
        }
        this.LIZLLL = null;
        C0SZU<R, ITEM> c0szu = this.LIZIZ;
        if (c0szu != null) {
            c0szu.LIZ();
        }
    }

    public C0SZS(C19719912Dl c19719912Dl, C0SZU c0szu, String str) {
        this.LIZ = c19719912Dl;
        this.LIZIZ = c0szu;
        this.LIZJ = str;
    }

    public final void LIZ(int i, C0SMO<R, ITEM> c0smo, ITEM item, List<? extends Object> list, Function1<? super ITEM, Unit> function1, Function0<Integer> function0) {
        C725200ScY c725200ScY = C725200ScY.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c725200ScY);
                }
            }
            if (C725480Sd0.LIZ(c725200ScY)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c725200ScY, "default", SystemClock.elapsedRealtimeNanos(), 20));
            }
        }
        LIZIZ();
        C725200ScY c725200ScY2 = C725200ScY.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c725200ScY2);
                }
            }
            if (C725480Sd0.LIZ(c725200ScY2)) {
                C725430Scv.LIZ(new AwS1S1110100_11(c725200ScY2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), 1));
            }
        }
        c0smo.setProxy(this);
        this.LIZLLL = c0smo;
        C0SZU<R, ITEM> c0szu = this.LIZIZ;
        if (c0szu != null) {
            c0szu.LIZLLL(i, c0smo, item, list, function1, function0);
        }
    }
}

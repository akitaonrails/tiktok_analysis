package X;

import android.os.SystemClock;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS20S0001000_5;

/* JADX INFO: renamed from: X.0E5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359040E5u implements INLEListenerVideoOutput, Observer<Integer> {
    public volatile long LL;
    public final /* synthetic */ C359010E5r LLILLJJLI;

    public C359040E5u(C359010E5r c359010E5r) {
        this.LLILLJJLI = c359010E5r;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Integer num) {
        boolean z;
        Pair<Long, Long> pair;
        Pair<Long, Long> pairPrevious;
        boolean z2;
        Pair<Long, Long> next;
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    this.LLILLJJLI.LJI.LIZ();
                    C359010E5r c359010E5r = this.LLILLJJLI;
                    C359080E5y c359080E5y = c359010E5r.LJIIJJI;
                    if (c359080E5y != null) {
                        c359080E5y.LIZ.i3(new AwS20S0001000_5((int) C350870DpF.LJ(c359010E5r.LIZ), 19));
                        return;
                    }
                    return;
                }
                return;
            }
            long jLIZLLL = C352310DrZ.LIZLLL(C350870DpF.LJ(this.LLILLJJLI.LIZ));
            ArrayList<Pair<Long, Long>> arrayList = this.LLILLJJLI.LIZIZ;
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                z = false;
            } else {
                for (Pair<Long, Long> pair2 : arrayList) {
                    long jLongValue = pair2.getFirst().longValue();
                    long jLongValue2 = pair2.getSecond().longValue();
                    long jLIZ = C352310DrZ.LIZ(jLIZLLL);
                    if (jLongValue <= jLIZ && jLIZ <= jLongValue2 && C1225104qn.LIZ(pair2)) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            ArrayList<Pair<Long, Long>> arrayList2 = this.LLILLJJLI.LIZIZ;
            ListIterator<Pair<Long, Long>> listIterator = arrayList2.listIterator(arrayList2.size());
            while (true) {
                pair = null;
                if (listIterator.hasPrevious()) {
                    pairPrevious = listIterator.previous();
                    if (C1225104qn.LIZ(pairPrevious)) {
                        break;
                    }
                } else {
                    pairPrevious = null;
                    break;
                }
            }
            Pair<Long, Long> pair3 = pairPrevious;
            if (pair3 != null && jLIZLLL == C352310DrZ.LIZLLL(pair3.getSecond().longValue())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || z2) {
                Iterator<Pair<Long, Long>> it2 = this.LLILLJJLI.LIZIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        Pair<Long, Long> pair4 = next;
                        if (C352310DrZ.LIZ(jLIZLLL) <= pair4.getFirst().longValue() && C1225104qn.LIZ(pair4)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Pair<Long, Long> pair5 = next;
                if (pair5 != null) {
                    C359010E5r c359010E5r2 = this.LLILLJJLI;
                    c359010E5r2.LIZLLL.LIZIZ(C352310DrZ.LIZLLL(pair5.getFirst().longValue()), new C0FX3(c359010E5r2, 18), true, true);
                } else {
                    C359010E5r c359010E5r3 = this.LLILLJJLI;
                    Iterator<Pair<Long, Long>> it3 = c359010E5r3.LIZIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Pair<Long, Long> next2 = it3.next();
                        if (C1225104qn.LIZ(next2)) {
                            pair = next2;
                            break;
                        }
                    }
                    Pair<Long, Long> pair6 = pair;
                    if (pair6 != null) {
                        c359010E5r3.LIZLLL.LIZIZ(C352310DrZ.LIZLLL(pair6.getFirst().longValue()), new C0FX3(c359010E5r3, 19), true, true);
                    }
                }
            }
            this.LLILLJJLI.LJI.getClass();
            SystemClock.elapsedRealtime();
            return;
        }
        this.LLILLJJLI.LJI.LIZ();
        this.LLILLJJLI.LJI.getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
    public final void onRefresh(int i, long j) {
        if (i != 0) {
            return;
        }
        C354270Duj.LIZJ(0L, new C359050E5v(this, j, this.LLILLJJLI));
    }
}

package X;

import Y.AObserverS214S0100000_10;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS124S1100000_10;
import kotlin.jvm.internal.AwS25S0001000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0Pz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662750Pz7 {
    public static volatile boolean LIZLLL;
    public static final C662750Pz7 LIZ = new C662750Pz7();
    public static final LinkedBlockingQueue<C662770Pz9> LIZIZ = new LinkedBlockingQueue<>();
    public static final Set<Integer> LIZJ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final ConcurrentHashMap<Integer, C662760Pz8> LJ = new ConcurrentHashMap<>();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(424));

    public static final void LJFF() {
        LIZJ.clear();
        LIZIZ.clear();
        LJ.clear();
        LIZLLL = false;
    }

    public static void LIZ(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        if (LIZLLL) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition == -1) {
                return;
            }
            LIZJ.clear();
            if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                while (true) {
                    LIZJ.add(Integer.valueOf(iFindFirstVisibleItemPosition));
                    if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                        break;
                    } else {
                        iFindFirstVisibleItemPosition++;
                    }
                }
            }
            LIZLLL = true;
            ArrayList arrayList = new ArrayList();
            LIZIZ.drainTo(arrayList);
            arrayList.isEmpty();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LJ((C662770Pz9) it2.next());
            }
        }
    }

    public static void LJ(C662770Pz9 c662770Pz9) {
        View view;
        String string;
        if (!LIZJ.contains(Integer.valueOf(c662770Pz9.LIZ)) || (view = c662770Pz9.LIZIZ.get()) == null) {
            return;
        }
        C662760Pz8 c662760Pz8 = LJ.get(Integer.valueOf(c662770Pz9.LIZ));
        if (c662760Pz8 != null) {
            string = Long.valueOf(c662760Pz8.LIZIZ).toString();
        } else {
            string = null;
        }
        C1848530yCh.LJ(new AwS124S1100000_10(c662770Pz9, string, 12), view);
    }

    public static String LIZIZ(View view, Integer num) {
        if (!C0P7Y.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.identityHashCode(view));
            sbLIZ.append('_');
            sbLIZ.append(num);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(System.identityHashCode(view));
        sbLIZ2.append('_');
        sbLIZ2.append(((LiveData) LJFF.getValue()).getValue());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LIZJ(View view, LiveData liveData) {
        if (!C0P7Y.LIZ()) {
            if (liveData == null) {
                return;
            }
            view.addOnAttachStateChangeListener(new C0R48(new AObserverS214S0100000_10(view, 106), liveData, 11));
            return;
        }
        view.addOnAttachStateChangeListener(new C0R45(new AObserverS214S0100000_10(view, 107), 29));
    }

    public static void LJII(View view, C662760Pz8 c662760Pz8) {
        LJ.put(Integer.valueOf(c662760Pz8.LIZJ), c662760Pz8);
        LIZJ(view, null);
        C1848530yCh.LIZ(view, c662760Pz8.LIZ, new AwS589S0100000_10(c662760Pz8, 405));
    }

    public static void LIZLLL(int i, View view, String str) {
        if (i >= 0) {
            C662770Pz9 c662770Pz9 = new C662770Pz9(i, new WeakReference(view), str, null);
            if (LIZLLL) {
                LIZ.getClass();
                LJ(c662770Pz9);
            } else {
                LIZIZ.offer(c662770Pz9);
            }
        }
    }

    public static void LJI(int i, View view, String str) {
        LIZJ(view, null);
        C1848530yCh.LIZ(view, str, new AwS25S0001000_10(i, 5));
    }
}

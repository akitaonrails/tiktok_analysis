package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020810cff {
    public static final C1020810cff LIZ = new C1020810cff();
    public static final Map<String, Integer> LIZIZ = new LinkedHashMap();
    public static final Map<String, Integer> LIZJ = new LinkedHashMap();
    public static final Map<String, Map<String, Integer>> LIZLLL = new LinkedHashMap();
    public static final Map<String, Map<String, Integer>> LJ = new LinkedHashMap();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(476));
    public static final ExecutorService LJI = C786410Ut5.i4(new ThreadFactory() { // from class: X.0iiR
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            BPEAThread bPEAThread = new BPEAThread(runnable);
            ThreadMethodProxy.setName(bPEAThread, "profile_aweme_info_thread");
            return bPEAThread;
        }
    });

    static {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0cht
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String nickname;
                if (!z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("type: ");
                    sbLIZ.append(i);
                    sbLIZ.append(" failed, nickname:");
                    String uid = null;
                    if (user != null) {
                        nickname = user.getNickname();
                    } else {
                        nickname = null;
                    }
                    sbLIZ.append(nickname);
                    sbLIZ.append(" , uid:");
                    if (user != null) {
                        uid = user.getUid();
                    }
                    sbLIZ.append(uid);
                    C1720106oR.LJI("Profile_ProfileAwemeInfoStatistics", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                if (i == 3) {
                    C1020810cff.LIZ.getClass();
                    C1020810cff.LJI.submit(RunnableC1022180chs.LL);
                }
            }
        });
    }

    public static Keva LIZIZ() {
        return (Keva) LJFF.getValue();
    }

    public static int LIZ(RecyclerView recyclerView, Rect rect) {
        recyclerView.getGlobalVisibleRect(rect);
        Iterator it2 = new C1077420e8y(recyclerView, 39).iterator();
        int i = 0;
        while (true) {
            C1077410e8x c1077410e8x = (C1077410e8x) it2;
            if (!c1077410e8x.hasNext()) {
                return 0;
            }
            Object next = c1077410e8x.next();
            int i2 = i + 1;
            if (i >= 0) {
                View view = (View) next;
                if (view instanceof FixedRatioFrameLayout) {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2) && rect2.bottom > rect.top) {
                        return recyclerView.getChildAdapterPosition(view);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}

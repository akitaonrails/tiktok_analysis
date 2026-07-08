package X;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.common.live_data.NextLiveData;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15hk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20591015hk {
    public static final ConcurrentHashMap<Integer, C20590315hd> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, C20591115hl> LIZIZ = new ConcurrentHashMap<>();

    static {
        new CopyOnWriteArraySet();
    }

    public static CopyOnWriteArraySet LIZIZ(View view) {
        Object obj = LJFF(view).get(Integer.valueOf(R.id.f836z1p));
        if (obj instanceof CopyOnWriteArraySet) {
            return (CopyOnWriteArraySet) obj;
        }
        return null;
    }

    public static C20591115hl LIZJ(View view) {
        int iIdentityHashCode;
        int iIdentityHashCode2 = 0;
        if (view == null) {
            iIdentityHashCode = 0;
        } else {
            iIdentityHashCode = System.identityHashCode(view);
        }
        ConcurrentHashMap<Integer, C20591115hl> concurrentHashMap = LIZIZ;
        C20591115hl c20591115hl = concurrentHashMap.get(Integer.valueOf(iIdentityHashCode));
        if (iIdentityHashCode != 0 && c20591115hl != null) {
            return c20591115hl;
        }
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = displayMetrics.widthPixels;
        float f2 = displayMetrics.density;
        C19389510tR c19389510tR = new C19389510tR(f / f2, displayMetrics.heightPixels / f2);
        EnumC20591315hn enumC20591315hn = EnumC20591315hn.ALL;
        EnumC1153530g7j enumC1153530g7j = EnumC1153530g7j.NO_SUPPORT;
        C20591715hr c20591715hr = C20591715hr.LIZ;
        C20591115hl c20591115hl2 = new C20591115hl(enumC20591315hn, c19389510tR, enumC1153530g7j, false, false, false, false, c20591715hr.LIZ(), c20591715hr.LIZJ(), false, EnumC19380610s0.UNKNOWN, null);
        if (view != null) {
            iIdentityHashCode2 = System.identityHashCode(view);
        }
        concurrentHashMap.put(Integer.valueOf(iIdentityHashCode2), c20591115hl2);
        return c20591115hl2;
    }

    public static View.OnLayoutChangeListener LIZLLL(View view) {
        Object obj = LJFF(view).get(Integer.valueOf(R.id.z1r));
        if (obj instanceof View.OnLayoutChangeListener) {
            return (View.OnLayoutChangeListener) obj;
        }
        return null;
    }

    public static NextLiveData LJ(View view) {
        Object obj = LJFF(view).get(Integer.valueOf(R.id.z1s));
        if (obj instanceof NextLiveData) {
            return (NextLiveData) obj;
        }
        return null;
    }

    public static ConcurrentHashMap LJFF(View view) {
        ConcurrentHashMap concurrentHashMap;
        Object tag = view.getTag(R.id.z1v);
        ConcurrentHashMap concurrentHashMap2 = null;
        if (tag instanceof ConcurrentHashMap) {
            concurrentHashMap = (ConcurrentHashMap) tag;
        } else {
            concurrentHashMap = null;
        }
        if (concurrentHashMap != null) {
            return concurrentHashMap;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.z1v);
                if (tag2 instanceof ConcurrentHashMap) {
                    concurrentHashMap2 = (ConcurrentHashMap) tag2;
                }
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    view.setTag(R.id.z1v, concurrentHashMap2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return concurrentHashMap2;
    }

    public static Pair LIZ(EnumC20591315hn enumC20591315hn, View view) {
        int i = C20591615hq.LIZ[enumC20591315hn.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Object obj = LJFF(view).get(Integer.valueOf(R.id.z1w));
                if (obj instanceof Pair) {
                    return (Pair) obj;
                }
                return null;
            }
            return null;
        }
        Object obj2 = LJFF(view).get(Integer.valueOf(R.id.z1t));
        if (obj2 instanceof Pair) {
            return (Pair) obj2;
        }
        return null;
    }

    public static void LJI(EnumC20591315hn enumC20591315hn, View view, float f, float f2) {
        if (enumC20591315hn == EnumC20591315hn.HORIZONTAL) {
            LJFF(view).put(Integer.valueOf(R.id.z1t), new Pair(Float.valueOf(f), Float.valueOf(f2)));
        } else {
            if (enumC20591315hn != EnumC20591315hn.VERTICAL) {
                return;
            }
            LJFF(view).put(Integer.valueOf(R.id.z1w), new Pair(Float.valueOf(f), Float.valueOf(f2)));
        }
    }
}

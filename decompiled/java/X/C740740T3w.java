package X;

import Y.AObserverS216S0100000_12;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;

/* JADX INFO: renamed from: X.0T3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740740T3w {
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.Aweme LJ() {
        /*
            X.0mCc r1 = X.C1906580ziK.LIZIZ()
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            java.lang.Object r0 = r1.LIZ
            boolean r0 = r0 instanceof X.InterfaceC1711206n0
            if (r0 == 0) goto L1f
            android.app.Activity r0 = r1.LIZIZ()
            if (r0 == 0) goto L2e
            X.19EG r1 = X.C1388190mED.LIZIZ(r0)
        L18:
            if (r1 == 0) goto L2e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = LJFF(r1)
            return r0
        L1f:
            boolean r0 = r1 instanceof X.C1397950mTx
            if (r0 == 0) goto L2e
            X.0mTx r1 = (X.C1397950mTx) r1
            android.app.Activity r1 = r1.LIZLLL
            boolean r0 = r1 instanceof X.C19EG
            if (r0 == 0) goto L2e
            X.19EG r1 = (X.C19EG) r1
            goto L18
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C740740T3w.LJ():com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Aweme LJFF(C19EG c19eg) {
        return (Aweme) LJI(c19eg).getValue();
    }

    public static NextLiveData LJI(C19EG c19eg) {
        return ((AwemeChangeCallBack) ViewModelProviders.of(c19eg).get(AwemeChangeCallBack.class)).LL;
    }

    public static void LJII(C19EG c19eg, Aweme aweme) {
        LJI(c19eg).setValue(aweme);
        AwemeChangeCallBack.LLILLJJLI.setValue(aweme);
    }

    public static void LJIIIIZZ(Fragment fragment, Observer observer) {
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        NextLiveData nextLiveDataLJI = LJI(activity);
        if (observer != null) {
            nextLiveDataLJI.removeObserver(observer);
        } else {
            "Java has declared not null, follow previous logic".toString();
            throw new IllegalArgumentException("Java has declared not null, follow previous logic");
        }
    }

    public static void LJIIIZ(C19EG c19eg, Observer observer) {
        NextLiveData nextLiveDataLJI = LJI(c19eg);
        if (observer != null) {
            nextLiveDataLJI.removeObserver(observer);
        } else {
            "Java has declared not null, follow previous logic".toString();
            throw new IllegalArgumentException("Java has declared not null, follow previous logic");
        }
    }

    public static void LIZ(Fragment fragment, LifecycleOwner lifecycleOwner, C0T2Y c0t2y) {
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        LifecycleOwner lifecycleOwner2 = fragment;
        if (!(lifecycleOwner instanceof Activity)) {
            lifecycleOwner2 = lifecycleOwner;
        }
        LJI(activity).observe(lifecycleOwner2, new AObserverS216S0100000_12(c0t2y, 51));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.LiveData, com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.19EG] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static void LIZIZ(C19EG c19eg, LifecycleOwner lifecycleOwner, final C0T2Y c0t2y) {
        ?? r1;
        if (!C1591220rVg.LIZLLL()) {
            if ((c19eg instanceof C199Y) && (c19eg instanceof InterfaceC1711206n0)) {
                Object objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) c19eg);
                if (objLIZ != null && (objLIZ instanceof C0J5E)) {
                    r1 = (Fragment) objLIZ;
                }
            } else {
                r1 = c19eg;
            }
            if (r1 != 0) {
                lifecycleOwner = r1;
            }
        }
        LJI(c19eg).observe(lifecycleOwner, new Observer() { // from class: X.0T2Z
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Aweme aweme = (Aweme) obj;
                C0T2Y c0t2y2 = c0t2y;
                if (c0t2y2 != null) {
                    c0t2y2.Y3(aweme);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[PHI: r3
      0x001f: PHI (r3v1 ??) = (r3v5 ??), (r3v6 ??), (r3v7 ??) binds: [B:3:0x000b, B:5:0x000f, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.LiveData, com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0T2X, androidx.lifecycle.Observer] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.19EG] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LifecycleOwner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0T2X LIZJ(X.C19EG r3, androidx.lifecycle.LifecycleOwner r4, final X.C0T2Y r5) {
        /*
            X.0T2X r2 = new X.0T2X
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData r1 = LJI(r3)
            boolean r0 = r3 instanceof X.C199Y
            if (r0 == 0) goto L1f
            boolean r0 = r3 instanceof X.InterfaceC1711206n0
            if (r0 == 0) goto L1f
            X.15ms r3 = (X.InterfaceC20622815ms) r3
            X.198i r3 = X.C20629915o1.LIZ(r3)
            if (r3 == 0) goto L22
            boolean r0 = r3 instanceof X.C0J5E
            if (r0 == 0) goto L22
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
        L1f:
            if (r3 == 0) goto L22
            r4 = r3
        L22:
            r1.observe(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C740740T3w.LIZJ(X.19EG, androidx.lifecycle.LifecycleOwner, X.0T2Y):X.0T2X");
    }

    public static AObserverS216S0100000_12 LIZLLL(Fragment fragment, LifecycleOwner lifecycleOwner, C0T2Y c0t2y) {
        AObserverS216S0100000_12 aObserverS216S0100000_12 = new AObserverS216S0100000_12(c0t2y, 52);
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return aObserverS216S0100000_12;
        }
        LifecycleOwner lifecycleOwner2 = fragment;
        if (!(lifecycleOwner instanceof Activity)) {
            lifecycleOwner2 = lifecycleOwner;
        }
        LJI(activity).observe(lifecycleOwner2, aObserverS216S0100000_12);
        return aObserverS216S0100000_12;
    }
}

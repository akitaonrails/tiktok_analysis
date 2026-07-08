package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0PSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645110PSb {
    public static final C0PE2 LIZ(LifecycleOwner lifecycleOwner) {
        Fragment fragment;
        if (lifecycleOwner instanceof Fragment) {
            fragment = (Fragment) lifecycleOwner;
        } else {
            fragment = null;
        }
        C128Y c128yLJ = C651580Ph6.LJ(fragment);
        if (!(c128yLJ instanceof C0PE2)) {
            return null;
        }
        return (C0PE2) c128yLJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl LIZIZ(android.view.View r7, androidx.fragment.app.Fragment r8) {
        /*
            r3 = r8
            androidx.fragment.app.Fragment r2 = X.C651580Ph6.LJ(r3)
            boolean r0 = r2 instanceof X.C0PE2
            r4 = 0
            if (r0 == 0) goto L1d
            if (r2 == 0) goto L1d
            java.util.concurrent.CopyOnWriteArrayList<java.util.concurrent.CopyOnWriteArrayList<X.0PVu>> r0 = X.C646070PVt.LIZ
            int r1 = r2.hashCode()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            X.0PVu r5 = X.C646070PVt.LIZJ(r1, r0)
            if (r5 != 0) goto L21
        L1d:
            X.0PVu r5 = X.C646070PVt.LIZLLL()
        L21:
            if (r3 == 0) goto L4b
            int r0 = r3.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L2b:
            r2 = r7
            if (r2 == 0) goto L46
            if (r6 == 0) goto L46
            int r1 = r6.intValue()
            X.0PVy r4 = new X.0PVy
            int r0 = r2.hashCode()
            r4.<init>(r0, r1)
        L3d:
            com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl r0 = new com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl
            r7 = 0
            r1 = 8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L46:
            if (r5 == 0) goto L3d
            X.0PVy r4 = r5.LJFF
            goto L3d
        L4b:
            if (r5 == 0) goto L50
            java.lang.Integer r6 = r5.LJ
            goto L2b
        L50:
            r6 = r4
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645110PSb.LIZIZ(android.view.View, androidx.fragment.app.Fragment):com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl");
    }
}

package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0JAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487580JAe {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(android.view.View r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L36
            android.content.Context r0 = r4.getContext()
            X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
            if (r0 == 0) goto L1a
            X.198i r2 = r0.LIZLLL()
            if (r2 == 0) goto L1a
        L13:
            boolean r0 = r2 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L7d
            if (r2 == 0) goto L7d
            return r2
        L1a:
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            if (r0 == 0) goto L45
            android.content.Context r0 = r4.getContext()
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L38
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L45
        L36:
            r2 = r3
            goto L13
        L38:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L36
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L45
            goto L36
        L45:
            androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r4)
            if (r2 == 0) goto L36
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L60
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L55:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L62
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L71
            goto L36
        L60:
            r1 = r3
            goto L55
        L62:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L36
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L71
            goto L36
        L6f:
            if (r2 == 0) goto L36
        L71:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L78
            X.198i r2 = (X.InterfaceC214902198i) r2
            goto L13
        L78:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L6f
        L7d:
            if (r4 == 0) goto L8a
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L8a
            android.app.Activity r3 = X.C06MM.LIZ(r0)
            return r3
        L8a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C487580JAe.LIZIZ(android.view.View):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(androidx.fragment.app.Fragment r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L17
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L3b
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        Ld:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L1f
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L2c
        L17:
            r1 = r2
        L18:
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L3d
            if (r1 == 0) goto L3d
            return r1
        L1f:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L17
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L2c
            goto L17
        L2c:
            r1 = r3
        L2d:
            boolean r0 = r1 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L34
            X.198i r1 = (X.InterfaceC214902198i) r1
            goto L18
        L34:
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            if (r1 == 0) goto L17
            goto L2d
        L3b:
            r1 = r2
            goto Ld
        L3d:
            if (r3 == 0) goto L44
            X.19EG r2 = r3.getActivity()
            return r2
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C487580JAe.LIZJ(androidx.fragment.app.Fragment):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Fragment LIZ(Activity activity, Fragment fragment) {
        boolean z;
        Object objLIZJ = LIZJ(fragment);
        if (objLIZJ instanceof Fragment) {
            return (Fragment) objLIZJ;
        }
        if (C294780Bgy.LIZ()) {
            z = activity instanceof InterfaceC214897198d;
        } else if ((activity instanceof InterfaceC214897198d) && ((InterfaceC214897198d) activity).getEnableSAF()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        Object objLIZJ2 = C20629915o1.LIZJ((InterfaceC20622815ms) activity);
        if (!(objLIZJ2 instanceof Fragment)) {
            return null;
        }
        return (Fragment) objLIZJ2;
    }
}

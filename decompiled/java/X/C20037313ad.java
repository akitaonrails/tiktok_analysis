package X;

import android.view.ViewGroup;

/* JADX INFO: renamed from: X.13ad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20037313ad {
    public static final ViewGroup.LayoutParams LIZ = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC20036713aX LIZ(X.AbstractC20085213iM r6, X.C13Z1 r7, X.C19719212De r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C094R.LIZ
            r4 = 0
            r1 = 1
            boolean r0 = r0.compareAndSet(r4, r1)
            r3 = 0
            if (r0 == 0) goto L44
            r0 = 6
            X.1DEK r5 = X.C095G.LIZ(r1, r3, r0)
            X.01GW<kotlin.coroutines.CoroutineContext> r0 = X.C1838750xwv.LLJIJIL
            java.lang.Object r0 = r0.getValue()
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.094Q r1 = new X.094Q
            r1.<init>(r5, r3)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            kotlin.jvm.internal.AwS582S0100000_3 r2 = new kotlin.jvm.internal.AwS582S0100000_3
            r0 = 16
            r2.<init>(r5, r0)
            java.lang.Object r1 = X.C13YE.LIZJ
            monitor-enter(r1)
            java.util.List<? extends kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>> r0 = X.C13YE.LJIIIIZZ     // Catch: java.lang.Throwable -> L38
            java.util.List r0 = X.C13LP.LJLILLLLZI(r2, r0)     // Catch: java.lang.Throwable -> L38
            X.C13YE.LJIIIIZZ = r0     // Catch: java.lang.Throwable -> L38
            goto L3e
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r1)
            throw r0
        L3e:
            monitor-exit(r1)
            X.13YC r0 = X.C13YE.LIZ
            X.C13YE.LJ(r0)
        L44:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto Laf
            android.view.View r4 = r6.getChildAt(r4)
            boolean r0 = r4 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r0 == 0) goto L56
            androidx.compose.ui.platform.AndroidComposeView r4 = (androidx.compose.ui.platform.AndroidComposeView) r4
            if (r4 != 0) goto L6b
        L56:
            androidx.compose.ui.platform.AndroidComposeView r4 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r6.getContext()
            kotlin.coroutines.CoroutineContext r0 = r7.LJIIIIZZ()
            r4.<init>(r1, r0)
            r4.getView()
            android.view.ViewGroup$LayoutParams r0 = X.C20037313ad.LIZ
            r6.addView(r4, r0)
        L6b:
            r4.getView()
            r3 = 2131400794(0x7f0a985a, float:1.8422452E38)
            java.lang.Object r2 = r4.getTag(r3)
            boolean r0 = r2 instanceof androidx.compose.ui.platform.WrappedComposition
            if (r0 == 0) goto L7d
            androidx.compose.ui.platform.WrappedComposition r2 = (androidx.compose.ui.platform.WrappedComposition) r2
            if (r2 != 0) goto L96
        L7d:
            androidx.compose.ui.platform.WrappedComposition r2 = new androidx.compose.ui.platform.WrappedComposition
            X.13ah r1 = new X.13ah
            X.13dH r0 = r4.getRoot()
            r1.<init>(r0)
            X.13Yr r0 = new X.13Yr
            r0.<init>(r7, r1)
            r2.<init>(r4, r0)
            r4.getView()
            r4.setTag(r3, r2)
        L96:
            r2.LJIILJJIL(r8)
            kotlin.coroutines.CoroutineContext r1 = r4.getCoroutineContext()
            kotlin.coroutines.CoroutineContext r0 = r7.LJIIIIZZ()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto Lae
            kotlin.coroutines.CoroutineContext r0 = r7.LJIIIIZZ()
            r4.setCoroutineContext(r0)
        Lae:
            return r2
        Laf:
            com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker.recordViewRemovedPoint(r6, r3)
            r6.removeAllViews()
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20037313ad.LIZ(X.13iM, X.13Z1, X.12De):X.13aX");
    }
}

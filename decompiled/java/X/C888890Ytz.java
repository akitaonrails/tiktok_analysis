package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0Ytz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888890Ytz {
    public final Fragment LIZ;
    public final Context LIZIZ;
    public final LifecycleCoroutineScope LIZJ;
    public InterfaceC888860Ytw LJ;
    public boolean LJFF;
    public final Set<InterfaceC888860Ytw> LIZLLL = new LinkedHashSet();
    public final C1DEV LJI = C2191201ApK.LIZ();

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r4.LIZLLL.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC888860Ytw r5) {
        /*
            r4 = this;
            java.util.Set<X.0Ytw> r0 = r4.LIZLLL
            java.util.Iterator r3 = r0.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0Ytw r0 = (X.InterfaceC888860Ytw) r0
            X.0Nwx r1 = r0.getType()
            X.0Nwx r0 = r5.getType()
            if (r1 != r0) goto L6
            if (r2 != 0) goto L24
        L1f:
            java.util.Set<X.0Ytw> r0 = r4.LIZLLL
            r0.add(r5)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C888890Ytz.LIZ(X.0Ytw):void");
    }

    public C888890Ytz(Fragment fragment, Context context, LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZ = fragment;
        this.LIZIZ = context;
        this.LIZJ = lifecycleCoroutineScope;
    }
}

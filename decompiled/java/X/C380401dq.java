package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.01dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C380401dq {
    public LifecycleCoroutineScope LIZ;
    public final AnonymousClass0204 LIZIZ;
    public final C054G LIZJ;

    public C380401dq(LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZ = lifecycleCoroutineScope;
        AnonymousClass0204 anonymousClass0204 = new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 1);
        this.LIZIZ = anonymousClass0204;
        this.LIZJ = C2296808zG.LIZ(C0PEM.LIZ.plus(anonymousClass0204));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r5.equals("ui") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r5.equals("main") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        r1 = r6.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r1 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        if (r1.launchWhenResumed(new X.C379901dl(r6, null, r2)) != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        X.C23250099c.LIZLLL(r6.LIZJ, null, null, new X.C380001dm(r6, null, r2), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T, R> void LIZ(X.InterfaceC381401e0<T, R> r7, T r8) {
        /*
            r6 = this;
            X.020Z r2 = new X.020Z
            r0 = 0
            r2.<init>(r6, r7, r8, r0)
            java.lang.String r1 = r7.getContext()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r1.toLowerCase(r0)
            int r1 = r5.hashCode()
            r4 = 3
            r0 = 3366(0xd26, float:4.717E-42)
            r3 = 0
            if (r1 == r0) goto L53
            r0 = 3732(0xe94, float:5.23E-42)
            if (r1 == r0) goto L4a
            r0 = 3343801(0x3305b9, float:4.685663E-39)
            if (r1 == r0) goto L75
            r0 = 1544803905(0x5c13d641, float:1.6644958E17)
            if (r1 != r0) goto L7d
            java.lang.String r0 = "default"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L7d
            androidx.lifecycle.LifecycleCoroutineScope r1 = r6.LIZ
            if (r1 == 0) goto L3f
            X.01dp r0 = new X.01dp
            r0.<init>(r6, r3, r2)
            X.09AE r0 = r1.launchWhenResumed(r0)
            if (r0 != 0) goto L49
        L3f:
            X.054G r1 = r6.LIZJ
            X.01dr r0 = new X.01dr
            r0.<init>(r6, r3, r2)
            X.C23250099c.LIZLLL(r1, r3, r3, r0, r4)
        L49:
            return
        L4a:
            java.lang.String r0 = "ui"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L97
            goto L7d
        L53:
            java.lang.String r0 = "io"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L7d
            androidx.lifecycle.LifecycleCoroutineScope r1 = r6.LIZ
            if (r1 == 0) goto L6a
            X.01dn r0 = new X.01dn
            r0.<init>(r6, r3, r2)
            X.09AE r0 = r1.launchWhenResumed(r0)
            if (r0 != 0) goto L49
        L6a:
            X.054G r1 = r6.LIZJ
            X.01do r0 = new X.01do
            r0.<init>(r6, r3, r2)
            X.C23250099c.LIZLLL(r1, r3, r3, r0, r4)
            return
        L75:
            java.lang.String r0 = "main"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L97
        L7d:
            androidx.lifecycle.LifecycleCoroutineScope r1 = r6.LIZ
            if (r1 == 0) goto L8c
            X.01ds r0 = new X.01ds
            r0.<init>(r6, r3, r2)
            X.09AE r0 = r1.launchWhenResumed(r0)
            if (r0 != 0) goto L49
        L8c:
            X.054G r1 = r6.LIZJ
            X.01dt r0 = new X.01dt
            r0.<init>(r6, r3, r2)
            X.C23250099c.LIZLLL(r1, r3, r3, r0, r4)
            return
        L97:
            androidx.lifecycle.LifecycleCoroutineScope r1 = r6.LIZ
            if (r1 == 0) goto La6
            X.01dl r0 = new X.01dl
            r0.<init>(r6, r3, r2)
            X.09AE r0 = r1.launchWhenResumed(r0)
            if (r0 != 0) goto L49
        La6:
            X.054G r1 = r6.LIZJ
            X.01dm r0 = new X.01dm
            r0.<init>(r6, r3, r2)
            X.C23250099c.LIZLLL(r1, r3, r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380401dq.LIZ(X.01e0, java.lang.Object):void");
    }
}

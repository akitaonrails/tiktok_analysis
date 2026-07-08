package X;

/* JADX INFO: renamed from: X.0K7K, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K7K {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r5.getLifecycle().addObserver(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.repository.PrivilegeRepository LIZ(java.lang.String r4, androidx.lifecycle.LifecycleOwner r5) {
        /*
            X.0K7N r0 = X.C0K7N.LIZ
            java.lang.Object r3 = r0.get(r4)
            com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.repository.PrivilegeRepository r3 = (com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.repository.PrivilegeRepository) r3
            if (r3 != 0) goto L12
            com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.repository.PrivilegeRepository r3 = new com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.repository.PrivilegeRepository
            r3.<init>(r4)
            r0.put(r4, r3)
        L12:
            if (r5 == 0) goto L44
            java.util.Set<java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner>> r0 = r3.LLILZLL
            java.util.Iterator r2 = r0.iterator()
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L1a
            if (r1 != 0) goto L3a
        L33:
            androidx.lifecycle.Lifecycle r0 = r5.getLifecycle()
            r0.addObserver(r3)
        L3a:
            java.util.Set<java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner>> r1 = r3.LLILZLL
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r1.add(r0)
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0K7K.LIZ(java.lang.String, androidx.lifecycle.LifecycleOwner):com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.repository.PrivilegeRepository");
    }
}

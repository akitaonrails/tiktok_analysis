package X;

import android.util.LruCache;

/* JADX INFO: renamed from: X.0k1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303560k1i extends LruCache<C20644415qM, C20644815qQ> {
    public final String LIZ;

    public C1303560k1i(int i, String str) {
        super(i);
        this.LIZ = str;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, C20644415qM c20644415qM, C20644815qQ c20644815qQ, C20644815qQ c20644815qQ2) {
        C20644815qQ c20644815qQ3 = c20644815qQ;
        if (z && c20644815qQ3 != null) {
            c20644815qQ3.LIZJ(this.LIZ);
        }
    }
}

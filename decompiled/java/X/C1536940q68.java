package X;

import android.util.LruCache;

/* JADX INFO: renamed from: X.0q68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536940q68 {
    public String LIZ = "";
    public int LIZIZ = 8;
    public final LruCache<String, C1536930q67> LIZJ = new LruCache<>(this.LIZIZ);
    public final LruCache<String, AnonymousClass0957<C1536920q66>> LIZLLL = new LruCache<>(this.LIZIZ);

    public final void LIZ(int i) {
        this.LIZIZ = i;
        this.LIZJ.resize(i);
        this.LIZLLL.resize(i);
    }
}

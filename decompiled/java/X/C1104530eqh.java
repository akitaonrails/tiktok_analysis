package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0eqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104530eqh {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final WeakReference<InterfaceC978780bZs> LJ;

    public C1104530eqh() {
        throw null;
    }

    public C1104530eqh(String str, String str2, String str3, String str4, WeakReference weakReference, int i) {
        str2 = (i & 4) != 0 ? "" : str2;
        str3 = (i & 8) != 0 ? "" : str3;
        str4 = (i & 16) != 0 ? "treasure_box" : str4;
        weakReference = (i & 32) != 0 ? null : weakReference;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = weakReference;
    }
}

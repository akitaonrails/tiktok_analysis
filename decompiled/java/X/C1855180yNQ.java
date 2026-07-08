package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yNQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855180yNQ {
    public static final C1855180yNQ LIZLLL = new C1855180yNQ("", false, "");
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1855180yNQ)) {
            return false;
        }
        C1855180yNQ c1855180yNQ = (C1855180yNQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1855180yNQ.LIZ) && this.LIZIZ == c1855180yNQ.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1855180yNQ.LIZJ);
    }

    public C1855180yNQ(String str, boolean z, String str2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
    }
}

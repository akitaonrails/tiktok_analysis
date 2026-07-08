package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KIP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KIP {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public C0KIP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KIP)) {
            return false;
        }
        C0KIP c0kip = (C0KIP) obj;
        return Intrinsics.LJFF(this.LIZ, c0kip.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0kip.LIZIZ) && this.LIZJ == c0kip.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0kip.LIZLLL);
    }

    public /* synthetic */ C0KIP(int i) {
        this("", "", -999, "");
    }

    public C0KIP(String str, String str2, int i, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
    }
}

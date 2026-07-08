package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03o5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C953503o5 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final String LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    public C953503o5() {
        String str = null;
        this(str, str, str, false, str, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C953503o5)) {
            return false;
        }
        C953503o5 c953503o5 = (C953503o5) obj;
        return Intrinsics.LJFF(this.LIZ, c953503o5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c953503o5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c953503o5.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c953503o5.LIZLLL) && this.LJ == c953503o5.LJ && Intrinsics.LJFF(this.LJFF, c953503o5.LJFF);
    }

    public /* synthetic */ C953503o5(String str, String str2, String str3, boolean z, String str4, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (String) null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str4);
    }

    public C953503o5(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = z;
        this.LJFF = str5;
    }
}

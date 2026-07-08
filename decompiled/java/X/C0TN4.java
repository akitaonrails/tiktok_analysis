package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TN4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TN4 {
    public final C0TVK LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Function0<Unit> LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0TN4)) {
            return false;
        }
        C0TN4 c0tn4 = (C0TN4) obj;
        return this.LIZ == c0tn4.LIZ && this.LIZIZ == c0tn4.LIZIZ && this.LIZJ == c0tn4.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0tn4.LIZLLL) && Intrinsics.LJFF(this.LJ, c0tn4.LJ) && Intrinsics.LJFF(this.LJFF, c0tn4.LJFF) && this.LJI == c0tn4.LJI;
    }

    public C0TN4(C0TVK c0tvk, boolean z, boolean z2, String str, String str2, Function0<Unit> function0, int i) {
        this.LIZ = c0tvk;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = function0;
        this.LJI = i;
    }
}

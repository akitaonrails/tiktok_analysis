package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0buq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991780buq {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991780buq)) {
            return false;
        }
        C991780buq c991780buq = (C991780buq) obj;
        return this.LIZ == c991780buq.LIZ && this.LIZIZ == c991780buq.LIZIZ && this.LIZJ == c991780buq.LIZJ && Intrinsics.LJFF(this.LIZLLL, c991780buq.LIZLLL);
    }

    public C991780buq(int i, int i2, int i3, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = str;
    }
}

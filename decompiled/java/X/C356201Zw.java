package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Zw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C356201Zw {
    public final int LIZ;
    public final Long LIZIZ;
    public final boolean LIZJ;

    public C356201Zw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C356201Zw)) {
            return false;
        }
        C356201Zw c356201Zw = (C356201Zw) obj;
        return this.LIZ == c356201Zw.LIZ && Intrinsics.LJFF(this.LIZIZ, c356201Zw.LIZIZ) && this.LIZJ == c356201Zw.LIZJ;
    }

    public /* synthetic */ C356201Zw(int i) {
        this(0, null, false);
    }

    public C356201Zw(int i, Long l, boolean z) {
        this.LIZ = i;
        this.LIZIZ = l;
        this.LIZJ = z;
    }
}

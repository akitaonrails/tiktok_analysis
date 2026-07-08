package X;

import com.ss.android.ugc.aweme.im.message.content.FakeMsgContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06uE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1756006uE {
    public final C869590Y9l LIZ;
    public final FakeMsgContent LIZIZ;
    public final int LIZJ;
    public final Long LIZLLL;
    public final C869590Y9l LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1756006uE)) {
            return false;
        }
        C1756006uE c1756006uE = (C1756006uE) obj;
        return Intrinsics.LJFF(this.LIZ, c1756006uE.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1756006uE.LIZIZ) && this.LIZJ == c1756006uE.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1756006uE.LIZLLL) && Intrinsics.LJFF(this.LJ, c1756006uE.LJ) && this.LJFF == c1756006uE.LJFF;
    }

    public C1756006uE(C869590Y9l c869590Y9l, FakeMsgContent fakeMsgContent, int i, Long l, C869590Y9l c869590Y9l2, int i2) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = fakeMsgContent;
        this.LIZJ = i;
        this.LIZLLL = l;
        this.LJ = c869590Y9l2;
        this.LJFF = i2;
    }
}

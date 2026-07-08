package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.SimpleUser;

/* JADX INFO: renamed from: X.14u2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20412414u2 {
    public final long LIZ;
    public final PlaybookContent LIZIZ;
    public final SimpleUser LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20412414u2)) {
            return false;
        }
        C20412414u2 c20412414u2 = (C20412414u2) obj;
        return this.LIZ == c20412414u2.LIZ && Intrinsics.LJFF(this.LIZIZ, c20412414u2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20412414u2.LIZJ) && this.LIZLLL == c20412414u2.LIZLLL && this.LJ == c20412414u2.LJ && this.LJFF == c20412414u2.LJFF && this.LJI == c20412414u2.LJI && this.LJII == c20412414u2.LJII && this.LJIIIIZZ == c20412414u2.LJIIIIZZ && this.LJIIIZ == c20412414u2.LJIIIZ && this.LJIIJ == c20412414u2.LJIIJ && this.LJIIJJI == c20412414u2.LJIIJJI && this.LJIIL == c20412414u2.LJIIL && this.LJIILIIL == c20412414u2.LJIILIIL && this.LJIILJJIL == c20412414u2.LJIILJJIL && this.LJIILL == c20412414u2.LJIILL;
    }

    public C20412414u2(long j, PlaybookContent playbookContent, SimpleUser simpleUser, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.LIZ = j;
        this.LIZIZ = playbookContent;
        this.LIZJ = simpleUser;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = i;
        this.LJIIJ = z4;
        this.LJIIJJI = z5;
        this.LJIIL = z6;
        this.LJIILIIL = z7;
        this.LJIILJJIL = z8;
        this.LJIILL = z9;
    }
}

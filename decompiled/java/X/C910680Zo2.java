package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zo2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910680Zo2 {
    public final EnumC910600Znu LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final Function0<Unit> LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C910680Zo2)) {
            return false;
        }
        C910680Zo2 c910680Zo2 = (C910680Zo2) obj;
        return this.LIZ == c910680Zo2.LIZ && this.LIZIZ == c910680Zo2.LIZIZ && this.LIZJ == c910680Zo2.LIZJ && Intrinsics.LJFF(this.LIZLLL, c910680Zo2.LIZLLL) && this.LJ == c910680Zo2.LJ;
    }

    public C910680Zo2(EnumC910600Znu enumC910600Znu, long j, int i, AwS415S0200000_14 awS415S0200000_14, long j2) {
        this.LIZ = enumC910600Znu;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = awS415S0200000_14;
        this.LJ = j2;
    }
}

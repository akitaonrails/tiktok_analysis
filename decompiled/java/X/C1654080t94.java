package X;

import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t94, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654080t94 {
    public final int LIZ;
    public final EnumC1653890t8l LIZIZ;
    public final List<C1657380tEO> LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 9));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 8));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1654080t94)) {
            return false;
        }
        C1654080t94 c1654080t94 = (C1654080t94) obj;
        return this.LIZ == c1654080t94.LIZ && this.LIZIZ == c1654080t94.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1654080t94.LIZJ);
    }

    public C1654080t94(int i, EnumC1653890t8l enumC1653890t8l, List<C1657380tEO> list) {
        this.LIZ = i;
        this.LIZIZ = enumC1653890t8l;
        this.LIZJ = list;
    }
}

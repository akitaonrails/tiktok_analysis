package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13bG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20041213bG {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Function2<Context, Function0<Unit>, CharSequence> LIZLLL;
    public final Integer LJ;
    public final Boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20041213bG)) {
            return false;
        }
        C20041213bG c20041213bG = (C20041213bG) obj;
        return Intrinsics.LJFF(this.LIZ, c20041213bG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20041213bG.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20041213bG.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20041213bG.LIZLLL) && Intrinsics.LJFF(this.LJ, c20041213bG.LJ) && Intrinsics.LJFF(this.LJFF, c20041213bG.LJFF) && this.LJI == c20041213bG.LJI && this.LJII == c20041213bG.LJII;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode()) * 31;
        Function2<Context, Function0<Unit>, CharSequence> function2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Integer num = this.LJ;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LJFF;
        return ((((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public /* synthetic */ C20041213bG(String str, String str2, String str3, Integer num, Boolean bool, boolean z, boolean z2, int i) {
        this(str, str2, str3, (Function2<? super Context, ? super Function0<Unit>, ? extends CharSequence>) null, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20041213bG(String str, String str2, String str3, Function2<? super Context, ? super Function0<Unit>, ? extends CharSequence> function2, Integer num, Boolean bool, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = function2;
        this.LJ = num;
        this.LJFF = bool;
        this.LJI = z;
        this.LJII = z2;
    }
}

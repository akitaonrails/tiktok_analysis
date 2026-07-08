package X;

import android.content.Context;
import android.os.Bundle;
import android.telecom.DisconnectCause;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302870k0b {
    public final String LIZ;
    public final Context LIZIZ;
    public C1302880k0c LIZJ;
    public final C1302920k0g LIZLLL;
    public final CoroutineContext LJ;
    public final C05XL<AbstractC1302730k0N> LJFF;
    public final Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> LJI;
    public final Function2<DisconnectCause, InterfaceC1364105Vn<? super Unit>, Object> LJII;
    public final Function1<InterfaceC1364105Vn<? super Unit>, Object> LJIIIIZZ;
    public final Function1<InterfaceC1364105Vn<? super Unit>, Object> LJIIIZ;
    public final InterfaceC1631620sYq<String, Bundle, InterfaceC1364105Vn<? super Unit>, Object> LJIIJ;
    public final C05YC<EnumC1302210jzX> LJIIJJI;
    public final C1302410jzr LJIIL;
    public final C05XL<Unit> LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1302870k0b)) {
            return false;
        }
        C1302870k0b c1302870k0b = (C1302870k0b) obj;
        return Intrinsics.LJFF(this.LIZ, c1302870k0b.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1302870k0b.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1302870k0b.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1302870k0b.LIZLLL) && Intrinsics.LJFF(this.LJ, c1302870k0b.LJ) && Intrinsics.LJFF(this.LJFF, c1302870k0b.LJFF) && Intrinsics.LJFF(this.LJI, c1302870k0b.LJI) && Intrinsics.LJFF(this.LJII, c1302870k0b.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1302870k0b.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1302870k0b.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1302870k0b.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1302870k0b.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1302870k0b.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1302870k0b.LJIILIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        C05XL<AbstractC1302730k0N> c05xl = this.LJFF;
        int iHashCode2 = (((((((((((((iHashCode + (c05xl == null ? 0 : c05xl.hashCode())) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31;
        C1302410jzr c1302410jzr = this.LJIIL;
        return ((iHashCode2 + (c1302410jzr != null ? c1302410jzr.hashCode() : 0)) * 31) + this.LJIILIIL.hashCode();
    }

    public final String toString() {
        return "PendingConnectionRequest(requestIdMatcher=" + this.LIZ + ", context=" + this.LIZIZ + ", callAttributes=" + this.LIZJ + ", callChannel=" + this.LIZLLL + ", coroutineContext=" + this.LJ + ", completableDeferred=" + this.LJFF + ", onAnswer=" + this.LJI + ", onDisconnect=" + this.LJII + ", onSetActive=" + this.LJIIIIZZ + ", onSetInactive=" + this.LJIIIZ + ", onEvent=" + this.LJIIJ + ", onStateChangedCallback=" + this.LJIIJJI + ", preferredStartingCallEndpoint=" + this.LJIIL + ", execution=" + this.LJIILIIL + ')';
    }

    public C1302870k0b(String str, Context context, C1302880k0c c1302880k0c, C1302920k0g c1302920k0g, CoroutineContext coroutineContext, C099F c099f, Function2 function2, Function2 function22, Function1 function1, Function1 function12, C324530Cnr c324530Cnr, C2252331DDr c2252331DDr, C1302410jzr c1302410jzr, C099F c099f2) {
        this.LIZ = str;
        this.LIZIZ = context;
        this.LIZJ = c1302880k0c;
        this.LIZLLL = c1302920k0g;
        this.LJ = coroutineContext;
        this.LJFF = c099f;
        this.LJI = function2;
        this.LJII = function22;
        this.LJIIIIZZ = function1;
        this.LJIIIZ = function12;
        this.LJIIJ = c324530Cnr;
        this.LJIIJJI = c2252331DDr;
        this.LJIIL = c1302410jzr;
        this.LJIILIIL = c099f2;
    }
}

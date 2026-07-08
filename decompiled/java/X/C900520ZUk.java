package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900520ZUk {
    public final int LIZ;
    public final InterfaceC460300I3g LIZIZ;
    public final InterfaceC460300I3g LIZJ;
    public final int LIZLLL;
    public final Integer LJ;
    public final UrlModel LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final C1622006Ws<Function1<Pair<? extends View, ? extends InterfaceC665370Q7z>, Unit>> LJIIIZ;
    public final C1622006Ws<Function0<Unit>> LJIIJ;
    public final boolean LJIIJJI;

    public C900520ZUk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C900520ZUk)) {
            return false;
        }
        C900520ZUk c900520ZUk = (C900520ZUk) obj;
        return this.LIZ == c900520ZUk.LIZ && Intrinsics.LJFF(this.LIZIZ, c900520ZUk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c900520ZUk.LIZJ) && this.LIZLLL == c900520ZUk.LIZLLL && Intrinsics.LJFF(this.LJ, c900520ZUk.LJ) && Intrinsics.LJFF(this.LJFF, c900520ZUk.LJFF) && this.LJI == c900520ZUk.LJI && this.LJII == c900520ZUk.LJII && this.LJIIIIZZ == c900520ZUk.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c900520ZUk.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c900520ZUk.LJIIJ) && this.LJIIJJI == c900520ZUk.LJIIJJI;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31;
        Integer num = this.LJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        UrlModel urlModel = this.LJFF;
        int iHashCode3 = (((((((iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        this.LJIIIZ.getClass();
        int i = iHashCode3 * 31;
        C1622006Ws<Function0<Unit>> c1622006Ws = this.LJIIJ;
        if (c1622006Ws != null) {
            c1622006Ws.getClass();
        }
        return (i * 31) + C786410Ut5.Z2(this.LJIIJJI);
    }

    public final String toString() {
        return "UnifiedSimpleShare(iconRes=" + this.LIZ + ", titleText=" + this.LIZIZ + ", descView=" + this.LIZJ + ", descViewVisibility=" + this.LIZLLL + ", tagView=" + this.LJ + ", cover=" + this.LJFF + ", isIllegalContent=" + this.LJI + ", showExclamation=" + this.LJII + ", safetyMask=" + this.LJIIIIZZ + ", click=" + this.LJIIIZ + ", expose=" + this.LJIIJ + ", reportable=" + this.LJIIJJI + ')';
    }

    public C900520ZUk(int i, InterfaceC460300I3g interfaceC460300I3g, InterfaceC460300I3g interfaceC460300I3g2, int i2, Integer num, UrlModel urlModel, boolean z, boolean z2, boolean z3, C1622006Ws c1622006Ws, C1622006Ws c1622006Ws2, boolean z4, int i3) {
        z = (i3 & 64) != 0 ? false : z;
        z2 = (i3 & 128) != 0 ? false : z2;
        z3 = (i3 & 256) != 0 ? false : z3;
        c1622006Ws2 = (i3 & 1024) != 0 ? null : c1622006Ws2;
        this.LIZ = i;
        this.LIZIZ = interfaceC460300I3g;
        this.LIZJ = interfaceC460300I3g2;
        this.LIZLLL = i2;
        this.LJ = num;
        this.LJFF = urlModel;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = c1622006Ws;
        this.LJIIJ = c1622006Ws2;
        this.LJIIJJI = z4;
    }
}

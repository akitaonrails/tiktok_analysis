package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361340EEq {
    public final C113G LIZ;
    public final String LIZIZ;
    public final C361270EEj LIZJ;
    public final boolean LIZLLL;
    public final C375830EoP<Unit> LJ;
    public final int LJFF;
    public final C375830EoP<EffectModel> LJI;
    public final C375830EoP<EffectModel> LJII;
    public final C375830EoP<Pair<EffectModel, EffectSearchModel>> LJIIIIZZ;
    public final Boolean LJIIIZ;
    public final C375830EoP<Boolean> LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C361340EEq)) {
            return false;
        }
        C361340EEq c361340EEq = (C361340EEq) obj;
        return Intrinsics.LJFF(this.LIZ, c361340EEq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c361340EEq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c361340EEq.LIZJ) && this.LIZLLL == c361340EEq.LIZLLL && Intrinsics.LJFF(this.LJ, c361340EEq.LJ) && this.LJFF == c361340EEq.LJFF && Intrinsics.LJFF(this.LJI, c361340EEq.LJI) && Intrinsics.LJFF(this.LJII, c361340EEq.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c361340EEq.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c361340EEq.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c361340EEq.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        C375830EoP<Unit> c375830EoP = this.LJ;
        int iHashCode2 = (((iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31) + this.LJFF) * 31;
        C375830EoP<EffectModel> c375830EoP2 = this.LJI;
        int iHashCode3 = (iHashCode2 + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31;
        C375830EoP<EffectModel> c375830EoP3 = this.LJII;
        int iHashCode4 = (iHashCode3 + (c375830EoP3 == null ? 0 : c375830EoP3.hashCode())) * 31;
        C375830EoP<Pair<EffectModel, EffectSearchModel>> c375830EoP4 = this.LJIIIIZZ;
        int iHashCode5 = (iHashCode4 + (c375830EoP4 == null ? 0 : c375830EoP4.hashCode())) * 31;
        Boolean bool = this.LJIIIZ;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        C375830EoP<Boolean> c375830EoP5 = this.LJIIJ;
        return iHashCode6 + (c375830EoP5 != null ? c375830EoP5.hashCode() : 0);
    }

    public final String toString() {
        return "EffectResourcePanelState(config=" + this.LIZ + ", enterWay=" + this.LIZIZ + ", effectState=" + this.LIZJ + ", isCheckEffectFuncState=" + this.LIZLLL + ", onBackPressed=" + this.LJ + ", panelHeight=" + this.LJFF + ", selectEffect=" + this.LJI + ", unSelectEffect=" + this.LJII + ", longClickEffect=" + this.LJIIIIZZ + ", searchPanelVisible=" + this.LJIIIZ + ", panelAnimDoneState=" + this.LJIIJ + ')';
    }

    public static C361340EEq LIZ(C361340EEq c361340EEq, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, Boolean bool, C375830EoP c375830EoP5, int i) {
        C113G c113g;
        String str;
        boolean z;
        int i2;
        C375830EoP c375830EoP6 = c375830EoP5;
        C375830EoP c375830EoP7 = c375830EoP4;
        C375830EoP c375830EoP8 = c375830EoP3;
        C375830EoP c375830EoP9 = c375830EoP2;
        Boolean bool2 = bool;
        C375830EoP c375830EoP10 = c375830EoP;
        C361270EEj c361270EEj = null;
        if ((i & 1) != 0) {
            c113g = c361340EEq.LIZ;
        } else {
            c113g = null;
        }
        if ((i & 2) != 0) {
            str = c361340EEq.LIZIZ;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            c361270EEj = c361340EEq.LIZJ;
        }
        if ((i & 8) != 0) {
            z = c361340EEq.LIZLLL;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            c375830EoP10 = c361340EEq.LJ;
        }
        if ((i & 32) != 0) {
            i2 = c361340EEq.LJFF;
        } else {
            i2 = 0;
        }
        if ((i & 64) != 0) {
            c375830EoP9 = c361340EEq.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP8 = c361340EEq.LJII;
        }
        if ((i & 256) != 0) {
            c375830EoP7 = c361340EEq.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            bool2 = c361340EEq.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            c375830EoP6 = c361340EEq.LJIIJ;
        }
        c361340EEq.getClass();
        return new C361340EEq(c113g, str, c361270EEj, z, c375830EoP10, i2, c375830EoP9, c375830EoP8, c375830EoP7, bool2, c375830EoP6);
    }

    public C361340EEq(C113G c113g, String str, C361270EEj c361270EEj, boolean z, C375830EoP<Unit> c375830EoP, int i, C375830EoP<EffectModel> c375830EoP2, C375830EoP<EffectModel> c375830EoP3, C375830EoP<Pair<EffectModel, EffectSearchModel>> c375830EoP4, Boolean bool, C375830EoP<Boolean> c375830EoP5) {
        this.LIZ = c113g;
        this.LIZIZ = str;
        this.LIZJ = c361270EEj;
        this.LIZLLL = z;
        this.LJ = c375830EoP;
        this.LJFF = i;
        this.LJI = c375830EoP2;
        this.LJII = c375830EoP3;
        this.LJIIIIZZ = c375830EoP4;
        this.LJIIIZ = bool;
        this.LJIIJ = c375830EoP5;
    }
}

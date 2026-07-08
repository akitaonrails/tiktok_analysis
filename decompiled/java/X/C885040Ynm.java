package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ynm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885040Ynm implements InterfaceC884640Yn8 {
    public final C878950Ydx LIZ;
    public final List<Pair<C13IQ<? extends InterfaceC884250YmV>, InterfaceC878560YdK>> LIZIZ;
    public final List<C13IQ<? extends InterfaceC878540YdI>> LIZJ;
    public final List<C13IQ<? extends InterfaceC882100Yj2>> LIZLLL;
    public final Pair<C13IQ<? extends InterfaceC879790YfJ>, InterfaceC879770YfH> LJ;
    public final List<C13IQ<? extends InterfaceC882190YjB>> LJFF;
    public final List<C13IQ<? extends InterfaceC886490Yq7<?, ?>>> LJI;
    public final List<C13IQ<? extends InterfaceC884950Ynd>> LJII;
    public final C884380Ymi LJIIIIZZ;
    public final Function1<C13IQ<? extends InterfaceC884250YmV>, InterfaceC884250YmV> LJIIIZ;
    public final Function1<C13IQ<? extends InterfaceC878540YdI>, InterfaceC878540YdI> LJIIJ;
    public final Function1<C13IQ<? extends InterfaceC882100Yj2>, InterfaceC882100Yj2> LJIIJJI;
    public final Function1<C13IQ<? extends InterfaceC879790YfJ>, InterfaceC879790YfJ> LJIIL;
    public final Function1<C13IQ<? extends InterfaceC882190YjB>, InterfaceC882190YjB> LJIILIIL;
    public final Function1<C13IQ<? extends InterfaceC886490Yq7<?, ?>>, InterfaceC886490Yq7<?, ?>> LJIILJJIL;
    public final Function1<C13IQ<? extends InterfaceC884950Ynd>, InterfaceC884950Ynd> LJIILL;
    public final Function1<InterfaceC879010Ye3, InterfaceC884870YnV> LJIILLIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C885040Ynm)) {
            return false;
        }
        C885040Ynm c885040Ynm = (C885040Ynm) obj;
        return Intrinsics.LJFF(this.LIZ, c885040Ynm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c885040Ynm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c885040Ynm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c885040Ynm.LIZLLL) && Intrinsics.LJFF(this.LJ, c885040Ynm.LJ) && Intrinsics.LJFF(this.LJFF, c885040Ynm.LJFF) && Intrinsics.LJFF(this.LJI, c885040Ynm.LJI) && Intrinsics.LJFF(this.LJII, c885040Ynm.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c885040Ynm.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c885040Ynm.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c885040Ynm.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c885040Ynm.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c885040Ynm.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c885040Ynm.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c885040Ynm.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c885040Ynm.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c885040Ynm.LJIILLIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        Function1<C13IQ<? extends InterfaceC884250YmV>, InterfaceC884250YmV> function1 = this.LJIIIZ;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C13IQ<? extends InterfaceC878540YdI>, InterfaceC878540YdI> function12 = this.LJIIJ;
        int iHashCode3 = (iHashCode2 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1<C13IQ<? extends InterfaceC882100Yj2>, InterfaceC882100Yj2> function13 = this.LJIIJJI;
        int iHashCode4 = (iHashCode3 + (function13 == null ? 0 : function13.hashCode())) * 31;
        Function1<C13IQ<? extends InterfaceC879790YfJ>, InterfaceC879790YfJ> function14 = this.LJIIL;
        int iHashCode5 = (iHashCode4 + (function14 == null ? 0 : function14.hashCode())) * 31;
        Function1<C13IQ<? extends InterfaceC882190YjB>, InterfaceC882190YjB> function15 = this.LJIILIIL;
        int iHashCode6 = (iHashCode5 + (function15 == null ? 0 : function15.hashCode())) * 31;
        Function1<C13IQ<? extends InterfaceC886490Yq7<?, ?>>, InterfaceC886490Yq7<?, ?>> function16 = this.LJIILJJIL;
        int iHashCode7 = (iHashCode6 + (function16 == null ? 0 : function16.hashCode())) * 31;
        Function1<C13IQ<? extends InterfaceC884950Ynd>, InterfaceC884950Ynd> function17 = this.LJIILL;
        int iHashCode8 = (iHashCode7 + (function17 == null ? 0 : function17.hashCode())) * 31;
        Function1<InterfaceC879010Ye3, InterfaceC884870YnV> function18 = this.LJIILLIIL;
        return iHashCode8 + (function18 != null ? function18.hashCode() : 0);
    }

    public final String toString() {
        return "ConversationPageConfig(key=" + this.LIZ + ", dataSourceConfig=" + this.LIZIZ + ", customDataSourceObserverConfig=" + this.LIZJ + ", updaterConfig=" + this.LIZLLL + ", filterConfig=" + this.LJ + ", decoratorConfig=" + this.LJFF + ", voConverterConfig=" + this.LJI + ", voPostModifierConfig=" + this.LJII + ", extraBehaviorConfig=" + this.LJIIIIZZ + ", dataSourceFactory=" + this.LJIIIZ + ", customDataSourceObserverFactory=" + this.LJIIJ + ", updaterFactory=" + this.LJIIJJI + ", filterFactory=" + this.LJIIL + ", decoratorFactory=" + this.LJIILIIL + ", voConverterFactory=" + this.LJIILJJIL + ", voPostModifierFactory=" + this.LJIILL + ", chatListEngineExceptionMonitorFactory=" + this.LJIILLIIL + ')';
    }

    @Override // X.InterfaceC884640Yn8
    public final List<C13IQ<? extends InterfaceC882100Yj2>> LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC884640Yn8
    public final List<Pair<C13IQ<? extends InterfaceC884250YmV>, InterfaceC878560YdK>> LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC884640Yn8
    public final Pair<C13IQ<? extends InterfaceC879790YfJ>, InterfaceC879770YfH> LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC884640Yn8
    public final Function1<C13IQ<? extends InterfaceC886490Yq7<?, ?>>, InterfaceC886490Yq7<?, ?>> LJ() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC884640Yn8
    public final List<C13IQ<? extends InterfaceC884950Ynd>> LJFF() {
        return this.LJII;
    }

    @Override // X.InterfaceC884640Yn8
    public final List<C13IQ<? extends InterfaceC878540YdI>> LJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC884640Yn8
    public final Function1<C13IQ<? extends InterfaceC882190YjB>, InterfaceC882190YjB> LJII() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC884640Yn8
    public final List<C13IQ<? extends InterfaceC882190YjB>> LJIIIIZZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC884640Yn8
    public final Function1<C13IQ<? extends InterfaceC882100Yj2>, InterfaceC882100Yj2> LJIIIZ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC884640Yn8
    public final Function1<C13IQ<? extends InterfaceC884950Ynd>, InterfaceC884950Ynd> LJIIJ() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC884640Yn8
    public final Function1<InterfaceC879010Ye3, InterfaceC884870YnV> LJIIJJI() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC884640Yn8
    public final C884380Ymi LJIIL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC884640Yn8
    public final Function1<C13IQ<? extends InterfaceC879790YfJ>, InterfaceC879790YfJ> LJIILIIL() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC884640Yn8
    public final List<C13IQ<? extends InterfaceC886490Yq7<?, ?>>> LJIILJJIL() {
        return this.LJI;
    }

    @Override // X.InterfaceC884640Yn8
    public final Function1<C13IQ<? extends InterfaceC884250YmV>, InterfaceC884250YmV> LJIILL() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC884640Yn8
    public final Function1<C13IQ<? extends InterfaceC878540YdI>, InterfaceC878540YdI> LJIILLIIL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC884640Yn8
    public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 getKey() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C885040Ynm(C878950Ydx c878950Ydx, List<? extends Pair<? extends C13IQ<? extends InterfaceC884250YmV>, ? extends InterfaceC878560YdK>> list, List<? extends C13IQ<? extends InterfaceC878540YdI>> list2, List<? extends C13IQ<? extends InterfaceC882100Yj2>> list3, Pair<? extends C13IQ<? extends InterfaceC879790YfJ>, ? extends InterfaceC879770YfH> pair, List<? extends C13IQ<? extends InterfaceC882190YjB>> list4, List<? extends C13IQ<? extends InterfaceC886490Yq7<?, ?>>> list5, List<? extends C13IQ<? extends InterfaceC884950Ynd>> list6, C884380Ymi c884380Ymi, Function1<? super C13IQ<? extends InterfaceC884250YmV>, ? extends InterfaceC884250YmV> function1, Function1<? super C13IQ<? extends InterfaceC878540YdI>, ? extends InterfaceC878540YdI> function12, Function1<? super C13IQ<? extends InterfaceC882100Yj2>, ? extends InterfaceC882100Yj2> function13, Function1<? super C13IQ<? extends InterfaceC879790YfJ>, ? extends InterfaceC879790YfJ> function14, Function1<? super C13IQ<? extends InterfaceC882190YjB>, ? extends InterfaceC882190YjB> function15, Function1<? super C13IQ<? extends InterfaceC886490Yq7<?, ?>>, ? extends InterfaceC886490Yq7<?, ?>> function16, Function1<? super C13IQ<? extends InterfaceC884950Ynd>, ? extends InterfaceC884950Ynd> function17, Function1<? super InterfaceC879010Ye3, ? extends InterfaceC884870YnV> function18) {
        this.LIZ = c878950Ydx;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = pair;
        this.LJFF = list4;
        this.LJI = list5;
        this.LJII = list6;
        this.LJIIIIZZ = c884380Ymi;
        this.LJIIIZ = function1;
        this.LJIIJ = function12;
        this.LJIIJJI = function13;
        this.LJIIL = function14;
        this.LJIILIIL = function15;
        this.LJIILJJIL = function16;
        this.LJIILL = function17;
        this.LJIILLIIL = function18;
    }
}

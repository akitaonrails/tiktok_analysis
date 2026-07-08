package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225520hzq extends C1224440hy6 {
    public final boolean LJIIJJI;
    public final Integer LJIIL;
    public final C1390920mIc LJIILIIL;
    public final Integer LJIILJJIL;
    public final EnumC1222430hur LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final boolean LJIJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1225520hzq)) {
            return false;
        }
        C1225520hzq c1225520hzq = (C1225520hzq) obj;
        return this.LJIIJJI == c1225520hzq.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1225520hzq.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1225520hzq.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1225520hzq.LJIILJJIL) && this.LJIILL == c1225520hzq.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c1225520hzq.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c1225520hzq.LJIIZILJ) && this.LJIJ == c1225520hzq.LJIJ && this.LJIJI == c1225520hzq.LJIJI && this.LJIJJ == c1225520hzq.LJIJJ && this.LJIJJLI == c1225520hzq.LJIJJLI;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LJIIJJI) * 31;
        Integer num = this.LJIIL;
        int iHashCode = (((iZ2 + (num == null ? 0 : num.hashCode())) * 31) + this.LJIILIIL.hashCode()) * 31;
        Integer num2 = this.LJIILJJIL;
        return ((((((((((((((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LJIILL.hashCode()) * 31) + this.LJIILLIIL.hashCode()) * 31) + this.LJIIZILJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIJ)) * 31) + C786410Ut5.Z2(this.LJIJI)) * 31) + C786410Ut5.Z2(this.LJIJJ)) * 31) + C786410Ut5.Z2(this.LJIJJLI);
    }

    public final String toString() {
        return "NewConversationTemplateSelectorConfig(isFullScreen=" + this.LJIIJJI + ", requestCode=" + this.LJIIL + ", sheetBuilder=" + this.LJIILIIL + ", sheetBuilderVariant=" + this.LJIILJJIL + ", selectedListPosition=" + this.LJIILL + ", enterFrom=" + this.LJIILLIIL + ", enterMethod=" + this.LJIIZILJ + ", needRecommendMetricHelper=" + this.LJIJ + ", confirmWidgetManagedExternally=" + this.LJIJI + ", searchBarManagedExternally=" + this.LJIJJ + ", enableTransitionAnimation=" + this.LJIJJLI + ')';
    }

    @Override // X.C1224440hy6
    public final boolean LIZ() {
        return this.LJIJI;
    }

    @Override // X.C1224440hy6
    public final boolean LIZIZ() {
        return this.LJIJJLI;
    }

    @Override // X.C1224440hy6
    public final String LIZJ() {
        return this.LJIILLIIL;
    }

    @Override // X.C1224440hy6
    public final String LIZLLL() {
        return this.LJIIZILJ;
    }

    @Override // X.C1224440hy6
    public final Integer LJ() {
        return this.LJIIL;
    }

    @Override // X.C1224440hy6
    public final boolean LJFF() {
        return this.LJIJJ;
    }

    @Override // X.C1224440hy6
    public final EnumC1222430hur LJI() {
        return this.LJIILL;
    }

    @Override // X.C1224440hy6
    public final C1390920mIc LJII() {
        return this.LJIILIIL;
    }

    @Override // X.C1224440hy6
    public final Integer LJIIIIZZ() {
        return this.LJIILJJIL;
    }

    @Override // X.C1224440hy6
    public final boolean LJIIIZ() {
        return this.LJIIJJI;
    }

    public C1225520hzq(boolean z, C1390920mIc c1390920mIc, EnumC1222430hur enumC1222430hur, String str, String str2, boolean z2, boolean z3, boolean z4) {
        super(z, null, c1390920mIc, null, enumC1222430hur, str, str2, z3, z4, true, null, 1024);
        this.LJIIJJI = z;
        this.LJIIL = null;
        this.LJIILIIL = c1390920mIc;
        this.LJIILJJIL = null;
        this.LJIILL = enumC1222430hur;
        this.LJIILLIIL = str;
        this.LJIIZILJ = str2;
        this.LJIJ = z2;
        this.LJIJI = z3;
        this.LJIJJ = z4;
        this.LJIJJLI = true;
    }
}

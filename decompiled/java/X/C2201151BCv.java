package X;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201151BCv extends C09AY implements Function1<Set<AbstractC2201091BCp<?>>, Unit> {
    public C2201151BCv() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Set<AbstractC2201091BCp<?>> set) {
        Set<AbstractC2201091BCp<?>> set2 = set;
        set2.add(new AbstractC2201091BCp<C2184761Aew>() { // from class: X.1BCx
            @Override // X.AbstractC2201091BCp
            public final void LJIIL() {
                ((ArrayList) C20533215Wg.LIZLLL).add(this);
            }

            @Override // X.AbstractC2201091BCp
            public final C2184761Aew LJIILIIL() {
                return new C2184761Aew();
            }

            @Override // X.AbstractC2201091BCp
            public final C2184761Aew LJIILJJIL() {
                return new C2184761Aew();
            }

            @Override // X.AbstractC2201091BCp
            public final InterfaceC1702080uOU LJIIJJI() {
                return EnumC2184731Aet.Activity;
            }

            @Override // X.AbstractC2201091BCp
            public final boolean LJIILLIIL(C2184761Aew c2184761Aew, C2184761Aew c2184761Aew2) {
                c2184761Aew.getClass();
                c2184761Aew2.getClass();
                return false;
            }
        });
        set2.add(C1618030sCv.LJFF);
        set2.add(C2201181BCy.LJFF);
        if (C2200821BBo.LJFF) {
            set2.add(new AbstractC2201091BCp<C1BC7>() { // from class: X.1BC8
                public boolean LJFF = true;

                @Override // X.AbstractC2201091BCp
                public final void LJIJ() {
                    this.LJFF = false;
                    C1BC7 c1bc7 = new C1BC7();
                    c1bc7.LIZ = false;
                    LJJ(c1bc7);
                }

                @Override // X.AbstractC2201091BCp
                public final void LJIJI() {
                    this.LJFF = true;
                    C1BC7 c1bc7 = new C1BC7();
                    c1bc7.LIZ = true;
                    LJJ(c1bc7);
                }

                @Override // X.AbstractC2201091BCp
                public final C1BC7 LJIILIIL() {
                    return new C1BC7();
                }

                @Override // X.AbstractC2201091BCp
                public final C1BC7 LJIILJJIL() {
                    C1BC7 c1bc7 = new C1BC7();
                    c1bc7.LIZ = this.LJFF;
                    return c1bc7;
                }

                @Override // X.AbstractC2201091BCp
                public final InterfaceC1702080uOU LJIIJJI() {
                    return EnumC2184731Aet.Foreground;
                }

                @Override // X.AbstractC2201091BCp
                public final boolean LJIILLIIL(C1BC7 c1bc7, C1BC7 c1bc72) {
                    if (c1bc7.LIZ != c1bc72.LIZ) {
                        return true;
                    }
                    return false;
                }
            });
        }
        C2200821BBo.LIZ.getClass();
        if (C2200821BBo.LJI) {
            set2.add(new C2201161BCw());
        }
        return Unit.LIZ;
    }
}

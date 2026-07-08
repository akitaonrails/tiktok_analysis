package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uSU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1704560uSU extends C09AY implements Function1<Set<AbstractC2201091BCp<?>>, Unit> {
    public C1704560uSU() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Set<AbstractC2201091BCp<?>> set) {
        set.add(new AbstractC2201091BCp<C1702190uOf>() { // from class: X.0uOe
            public static final Map<InterfaceC1702080uOU, Integer> LJI;

            @Override // X.AbstractC2201091BCp
            public final long LJII() {
                return 3000L;
            }

            @Override // X.AbstractC2201091BCp
            public final boolean LJIILL() {
                return true;
            }

            @Override // X.AbstractC2201091BCp
            public final long LJIIZILJ() {
                return 1000L;
            }

            @Override // X.AbstractC2201091BCp
            public final long LJIJJLI() {
                return 1000L;
            }

            static {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(C1BC9.Cpu, 4);
                linkedHashMap.put(C1BC9.Memory, 4);
                linkedHashMap.put(C1BC9.Battery, 2);
                LJI = linkedHashMap;
            }

            public static int LJJIFFI() {
                Iterator it2 = ((LinkedHashMap) LJI).entrySet().iterator();
                int score = 0;
                while (it2.hasNext()) {
                    score += EnumC1006810cJ5.Critical.getScore() * ((Number) ((Map.Entry) it2.next()).getValue()).intValue();
                }
                return score;
            }

            @Override // X.AbstractC2201091BCp
            public final C1702190uOf LJIILIIL() {
                return new C1702190uOf();
            }

            @Override // X.AbstractC2201091BCp
            public final C1702190uOf LJIILJJIL() {
                EnumC1006810cJ5 enumC1006810cJ5;
                C1702190uOf c1702190uOf = new C1702190uOf();
                int score = 0;
                int score2 = 0;
                for (Map.Entry entry : ((LinkedHashMap) LJI).entrySet()) {
                    C1702170uOd c1702170uOd = (C1702170uOd) C2201101BCq.LJI((InterfaceC1702080uOU) entry.getKey(), null);
                    C1702200uOg c1702200uOg = new C1702200uOg();
                    if (c1702170uOd == null || (enumC1006810cJ5 = c1702170uOd.LIZ) == null) {
                        enumC1006810cJ5 = EnumC1006810cJ5.Unknown;
                    }
                    c1702200uOg.LIZ = enumC1006810cJ5;
                    if (C1702210uOh.LIZ && c1702170uOd != null) {
                        c1702170uOd.LIZ();
                    }
                    c1702190uOf.LIZJ.put((InterfaceC1702080uOU) entry.getKey(), c1702200uOg);
                    score2 += c1702200uOg.LIZ.getScore() * ((Number) entry.getValue()).intValue();
                }
                Iterator it2 = ((LinkedHashMap) LJI).entrySet().iterator();
                while (it2.hasNext()) {
                    score += EnumC1006810cJ5.Low.getScore() * ((Number) ((Map.Entry) it2.next()).getValue()).intValue();
                }
                int iLJJIFFI = (score - LJJIFFI()) / 5;
                c1702190uOf.LIZ = score2 < LJJIFFI() + iLJJIFFI ? EnumC1006810cJ5.Critical : ((double) score2) < ((double) LJJIFFI()) + (((double) iLJJIFFI) * 1.5d) ? EnumC1006810cJ5.High : score2 < LJJIFFI() + (iLJJIFFI * 2) ? EnumC1006810cJ5.Medium : EnumC1006810cJ5.Low;
                c1702190uOf.LIZIZ = score2;
                return c1702190uOf;
            }

            @Override // X.AbstractC2201091BCp
            public final InterfaceC1702080uOU LJIIJJI() {
                return EnumC1702070uOT.ResDash;
            }

            @Override // X.AbstractC2201091BCp
            public final boolean LJIILLIIL(C1702190uOf c1702190uOf, C1702190uOf c1702190uOf2) {
                if (c1702190uOf.LIZ != c1702190uOf2.LIZ) {
                    return true;
                }
                return false;
            }
        });
        return Unit.LIZ;
    }
}

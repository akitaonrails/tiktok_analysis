package X;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BCI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BCI extends C09AY implements Function1<Set<AbstractC2201091BCp<?>>, Unit> {
    public C1BCI() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Set<AbstractC2201091BCp<?>> set) {
        set.add(new AbstractC2201091BCp<C2201251BDf>() { // from class: X.1BCH
            public static final C2201251BDf LJI = new C2201251BDf();

            @Override // X.AbstractC2201091BCp
            public final C2201251BDf LJIILIIL() {
                return new C2201251BDf();
            }

            @Override // X.AbstractC2201091BCp
            public final C2201251BDf LJIILJJIL() {
                C2201251BDf c2201251BDf = LJI;
                return c2201251BDf == null ? new C2201251BDf() : c2201251BDf;
            }

            @Override // X.AbstractC2201091BCp
            public final InterfaceC1702080uOU LJIIJJI() {
                return EnumC1702060uOS.DeviceInfo;
            }

            @Override // X.AbstractC2201091BCp
            public final /* bridge */ /* synthetic */ boolean LJIILLIIL(C2201251BDf c2201251BDf, C2201251BDf c2201251BDf2) {
                return false;
            }
        });
        return Unit.LIZ;
    }
}

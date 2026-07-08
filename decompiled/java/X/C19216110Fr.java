package X;

import Y.AfS117S0300000_28;
import Y.AfS197S0100000_28;
import Y.AkS489S0100000_28;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.geofencing.model.Translations;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10Fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19216110Fr {
    public static final C19216110Fr LIZ = new C19216110Fr();
    public static List<TranslatedRegion> LIZIZ = C13BV.INSTANCE;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(581));

    public static void LIZ(Function0 function0) {
        if (!LIZIZ.isEmpty()) {
            function0.invoke();
            return;
        }
        C11NJ c11nj = (C11NJ) LIZJ.getValue();
        InterfaceC19216410Fu.LIZ.getClass();
        c11nj.LIZ(new C19478011Ik(new C19479411Iy(C1411960mqY.LIZ().LIZ().LJIIL(new InterfaceC1487280oo2() { // from class: X.10Fs
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return ((Translations) obj).translations;
            }
        }).LJIILIIL(C1701940uOG.LIZIZ()).LJIJJ(C11S5.LIZ()), new AfS197S0100000_28(function0, 78)), new InterfaceC1487280oo2() { // from class: X.10Fm
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return C19215710Fn.LIZ();
            }
        }).LJIILLIIL(new C09JN() { // from class: X.10Fq
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GeoFencingRegionDataSource@d393.performWhenFetched$4");
                C19216110Fr.LIZIZ = C13LP.LJJJJLI((Iterable) obj);
                C1C7U.LIZIZ("GeoFencingRegionDataSource@d393.performWhenFetched$4");
            }
        }));
    }

    public static void LIZIZ(Function1 function1, Function1 function12) {
        if (LIZIZ.isEmpty()) {
            C259800zU c259800zU = new C259800zU();
            C11NJ c11nj = (C11NJ) LIZJ.getValue();
            InterfaceC19216410Fu.LIZ.getClass();
            c11nj.LIZ(new C19478011Ik(new C19479411Iy(C1411960mqY.LIZ().LIZ().LJIIL(new InterfaceC1487280oo2() { // from class: X.10Ft
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return ((Translations) obj).translations;
                }
            }).LJIILIIL(C1701940uOG.LIZIZ()).LJIJJ(C11S5.LIZ()), new C09JN() { // from class: X.10Fo
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GeoFencingRegionDataSource@d393.tryFetchIfAbsent$2");
                    Keva.getRepo("geofencing_region_list").storeString("regions", C08JS.LIZLLL(C13LP.LJJJJLI((Iterable) obj)));
                    C1C7U.LIZIZ("GeoFencingRegionDataSource@d393.tryFetchIfAbsent$2");
                }
            }), new AkS489S0100000_28(c259800zU, 5)).LJIILLIIL(new AfS117S0300000_28(c259800zU, function1, function12, 4)));
            return;
        }
        if (function1 != null) {
            function1.invoke(C473080Igs.LIZ(LIZIZ));
        }
        Keva.getRepo("geofencing_region_list").storeString("regions", C08JS.LIZLLL(LIZIZ));
    }
}

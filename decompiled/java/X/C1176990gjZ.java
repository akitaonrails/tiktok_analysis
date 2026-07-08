package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176990gjZ extends C09AY implements Function1<Bitmap, Unit> {
    public final /* synthetic */ C1176870gjN LL;
    public final /* synthetic */ PoiDiscoveryCard LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ List<PoiDiscoveryCard> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176990gjZ(C1176870gjN c1176870gjN, PoiDiscoveryCard poiDiscoveryCard, boolean z, List<PoiDiscoveryCard> list, int i) {
        super(1);
        this.LL = c1176870gjN;
        this.LLILLJJLI = poiDiscoveryCard;
        this.LLILLL = z;
        this.LLILZ = list;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        Double d;
        Bitmap bitmap2 = bitmap;
        InterfaceC1177250gjz interfaceC1177250gjz = this.LL.LIZIZ;
        Location location = this.LLILLJJLI.location;
        Double d2 = null;
        if (location != null) {
            d = location.lat;
        } else {
            d = null;
        }
        double dLIZ = C1175120ggY.LIZ(d);
        Location location2 = this.LLILLJJLI.location;
        if (location2 != null) {
            d2 = location2.lng;
        }
        C1177960gl8 c1177960gl8 = new C1177960gl8(dLIZ, C1175120ggY.LIZ(d2));
        C1178140glQ c1178140glQ = new C1178140glQ();
        boolean z = this.LLILLL;
        List<PoiDiscoveryCard> list = this.LLILZ;
        int i = this.LLILZIL;
        C1176870gjN c1176870gjN = this.LL;
        PoiDiscoveryCard poiDiscoveryCard = this.LLILLJJLI;
        c1178140glQ.LIZ = bitmap2;
        if (z) {
            c1178140glQ.LJ = 0.5f;
            c1178140glQ.LIZLLL = 0.89f;
        } else {
            c1178140glQ.LJ = 0.5f;
            c1178140glQ.LIZLLL = 0.5f;
        }
        c1178140glQ.LJFF = C1175120ggY.LIZJ(Integer.valueOf(list.size() - i));
        c1178140glQ.LIZJ = true;
        if (z) {
            c1176870gjN.LIZLLL.Mi0(poiDiscoveryCard);
        }
        C2205251BSp c2205251BSpLJIIL = interfaceC1177250gjz.LJIIL(c1177960gl8, c1178140glQ);
        if (c2205251BSpLJIIL != null) {
            PoiDiscoveryCard poiDiscoveryCard2 = this.LLILLJJLI;
            C1176870gjN c1176870gjN2 = this.LL;
            String str = poiDiscoveryCard2.poiId;
            if (str != null) {
                c2205251BSpLJIIL.LIZJ(str);
            }
            ((ArrayList) c1176870gjN2.LJ).add(c2205251BSpLJIIL);
        }
        return Unit.LIZ;
    }
}

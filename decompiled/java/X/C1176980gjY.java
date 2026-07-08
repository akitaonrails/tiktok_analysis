package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapdetail.marker.PoiMapDetailMarkerRender$createAddMarker$addMarker$2", f = "PoiMapDetailMarkerRender.kt", l = {}, m = "invokeSuspend")
public final class C1176980gjY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1176900gjQ LL;
    public final /* synthetic */ C1176630giz LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C1177000gja LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176980gjY(float f, Bitmap bitmap, C1176900gjQ c1176900gjQ, C1176630giz c1176630giz, C1177000gja c1177000gja, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = c1176900gjQ;
        this.LLILLJJLI = c1176630giz;
        this.LLILLL = bitmap;
        this.LLILZ = f;
        this.LLILZIL = z;
        this.LLILZLL = c1177000gja;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1176900gjQ c1176900gjQ = this.LL;
        C1176630giz c1176630giz = this.LLILLJJLI;
        Bitmap bitmap = this.LLILLL;
        return new C1176980gjY(this.LLILZ, bitmap, c1176900gjQ, c1176630giz, this.LLILZLL, interfaceC1364105Vn, this.LLILZIL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Double d;
        C1C7U.LIZ("PoiMapDetailMarkerRender@7f86.createAddMarker$addMarker$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1176900gjQ c1176900gjQ = this.LL;
        C1176630giz c1176630giz = this.LLILLJJLI;
        Bitmap bitmap = this.LLILLL;
        float f = this.LLILZ;
        boolean z = this.LLILZIL;
        C1177000gja c1177000gja = this.LLILZLL;
        ConcurrentHashMap<String, C1176790gjF> concurrentHashMap = c1176900gjQ.LJFF;
        String poiId = c1176630giz.card.getPoiId();
        String str = "";
        if (poiId == null) {
            poiId = "";
        }
        C1176790gjF c1176790gjF = concurrentHashMap.get(poiId);
        if (c1176790gjF == null) {
            PoiGeneralCard poiGeneralCard = c1176630giz.card;
            InterfaceC1177250gjz interfaceC1177250gjz = c1176900gjQ.LIZIZ;
            Location location = poiGeneralCard.getLocation();
            Double d2 = null;
            if (location != null) {
                d = location.lat;
            } else {
                d = null;
            }
            double dLIZ = C1175120ggY.LIZ(d);
            Location location2 = poiGeneralCard.getLocation();
            if (location2 != null) {
                d2 = location2.lng;
            }
            C1177960gl8 c1177960gl8 = new C1177960gl8(dLIZ, C1175120ggY.LIZ(d2));
            C1178140glQ c1178140glQ = new C1178140glQ();
            c1178140glQ.LIZ = bitmap;
            float f2 = c1177000gja.LIZLLL;
            float f3 = c1177000gja.LJ;
            c1178140glQ.LJ = f2;
            c1178140glQ.LIZLLL = f3;
            c1178140glQ.LIZJ = true;
            c1178140glQ.LJFF = f;
            C2205251BSp c2205251BSpLJIIL = interfaceC1177250gjz.LJIIL(c1177960gl8, c1178140glQ);
            if (c2205251BSpLJIIL != null) {
                String poiId2 = poiGeneralCard.getPoiId();
                if (poiId2 != null) {
                    c2205251BSpLJIIL.LIZJ(poiId2);
                }
                ConcurrentHashMap<String, C1176790gjF> concurrentHashMap2 = c1176900gjQ.LJFF;
                String poiId3 = poiGeneralCard.getPoiId();
                if (poiId3 != null) {
                    str = poiId3;
                }
                concurrentHashMap2.put(str, new C1176790gjF(c2205251BSpLJIIL, z));
            }
        } else {
            c1176790gjF.LIZ.LIZLLL(bitmap);
            c1176790gjF.LIZ.LIZIZ(f);
            c1176790gjF.LIZIZ = z;
            String poiId4 = c1176630giz.card.getPoiId();
            if (poiId4 != null) {
                c1176790gjF.LIZ.LIZJ(poiId4);
            }
        }
        c1176900gjQ.LJ.invoke(c1176630giz.card);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiMapDetailMarkerRender@7f86.createAddMarker$addMarker$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

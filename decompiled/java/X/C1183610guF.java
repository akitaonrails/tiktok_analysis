package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0guF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment$injectPrfSharedProperty$1$1$1", f = "PoiDetailSlashFragment.kt", l = {}, m = "invokeSuspend")
public final class C1183610guF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PoiDetailSlashFragment LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1183610guF(PoiDetailSlashFragment poiDetailSlashFragment, Map<String, String> map, InterfaceC1364105Vn<? super C1183610guF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = poiDetailSlashFragment;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1183610guF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiDetailSlashFragment@9df6.injectPrfSharedProperty$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1188750h2X c1188750h2X = C1188750h2X.LIZ;
        String poiId = this.LL.getPoiId();
        Map<String, String> mapLJ = this.LLILLJJLI;
        c1188750h2X.getClass();
        try {
            C1183630guH<String, C1183620guG> c1183630guH = C1188750h2X.LJII;
            ReentrantReadWriteLock.WriteLock writeLock = c1183630guH.LIZIZ.writeLock();
            writeLock.lock();
            try {
                C1183620guG c1183620guGLJ = c1183630guH.LIZ.LJ(poiId);
                writeLock.unlock();
                C1183620guG c1183620guG = c1183620guGLJ;
                C1183630guH<String, C1183560guA> c1183630guH2 = C1188750h2X.LJIIIIZZ;
                writeLock = c1183630guH2.LIZIZ.writeLock();
                writeLock.lock();
                try {
                    C1183560guA c1183560guALJ = c1183630guH2.LIZ.LJ(poiId);
                    writeLock.unlock();
                    C1183560guA c1183560guA = c1183560guALJ;
                    if (c1183620guG != null && c1183560guA != null) {
                        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (mapLJ == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        linkedHashMap.putAll(mapLJ);
                        linkedHashMap.put("is_success", C1189060h32.LJJIJ(C1189060h32.LJIIZILJ(c1183620guG.LIZIZ)));
                        if (C1189060h32.LJIIZILJ(c1183620guG.LIZIZ)) {
                            linkedHashMap.put("has_diff", C1189060h32.LJJIJ(!Intrinsics.LJFF(c1183620guG.LIZ, c1183560guA)));
                            linkedHashMap.put("preload_param", c1183620guG.LIZ.toString());
                            linkedHashMap.put("business_param", c1183560guA.toString());
                        }
                        c1185040gwY.getClass();
                        C1185040gwY.LIZIZ("poi_detail_page_preload_record", linkedHashMap, null);
                    } else {
                        C1185040gwY c1185040gwY2 = C1185040gwY.LIZ;
                        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("error_message", "miss preload record"));
                        if (mapLJ == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        mapLJIIJ.putAll(mapLJ);
                        c1185040gwY2.getClass();
                        C1185040gwY.LIZIZ("poi_detail_page_preload_record", mapLJIIJ, null);
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX.LIZ.LJ(C1EMR.POI_DETAIL_PRELOAD_ERR, e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiDetailSlashFragment@9df6.injectPrfSharedProperty$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

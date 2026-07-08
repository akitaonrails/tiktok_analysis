package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.poi.mapmode.map.PoiMapModeClusterPicLoader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS632S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapmode.map.PoiMapModeClusterPicLoader$loadPic$job$1", f = "PoiMapModeClusterPicLoader.kt", l = {}, m = "invokeSuspend")
public final class C1177200gju extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C1177210gjv> LL;
    public final /* synthetic */ PoiMapModeClusterPicLoader LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177200gju(List<C1177210gjv> list, PoiMapModeClusterPicLoader poiMapModeClusterPicLoader, InterfaceC1364105Vn<? super C1177200gju> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = poiMapModeClusterPicLoader;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1177200gju(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapModeClusterPicLoader@697f.loadPic$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C1177210gjv> list = this.LL;
        PoiMapModeClusterPicLoader poiMapModeClusterPicLoader = this.LLILLJJLI;
        for (final C1177210gjv c1177210gjv : list) {
            if (!c1177210gjv.LJII || c1177210gjv.LIZIZ == null) {
                final AwS632S0100000_18 awS632S0100000_18 = new AwS632S0100000_18(poiMapModeClusterPicLoader, 295);
                poiMapModeClusterPicLoader.getClass();
                String str = c1177210gjv.LJI;
                if (str != null && str.length() > 0 && 1 != 0) {
                    C1189360h3W c1189360h3WLIZIZ = new C1180600gpO("poi_map_mode", "poi_map_mode_marker_img", null).LIZIZ(str);
                    int i = C1178130glP.LIZ;
                    c1189360h3WLIZIZ.LJI(i, i);
                    c1189360h3WLIZIZ.LIZ.LIZLLL("MarkerDataParser");
                    c1189360h3WLIZIZ.LIZ.LJJIIJZLJL(new InterfaceC1331910klR(c1177210gjv, awS632S0100000_18) { // from class: X.0gjk
                        public final C1177210gjv LL;
                        public final Function2<C1177210gjv, Bitmap, Unit> LLILLJJLI;

                        @Override // X.InterfaceC1331910klR
                        public final void onCanceled() {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onProgress(float f) {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            Function2<C1177210gjv, Bitmap, Unit> function2;
                            if (bitmap != null && (function2 = this.LLILLJJLI) != null) {
                                function2.invoke(this.LL, bitmap);
                            }
                        }

                        {
                            this.LL = c1177210gjv;
                            this.LLILLJJLI = awS632S0100000_18;
                        }
                    });
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiMapModeClusterPicLoader@697f.loadPic$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

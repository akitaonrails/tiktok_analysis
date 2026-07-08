package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.cluster.PoiCampaignMarkerPicLoader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS632S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0glJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.cluster.PoiCampaignMarkerPicLoader$loadPic$job$1", f = "PoiCampaignMarkerPicLoader.kt", l = {}, m = "invokeSuspend")
public final class C1178070glJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C1178080glK> LL;
    public final /* synthetic */ PoiCampaignMarkerPicLoader LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1178070glJ(List<C1178080glK> list, PoiCampaignMarkerPicLoader poiCampaignMarkerPicLoader, InterfaceC1364105Vn<? super C1178070glJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = poiCampaignMarkerPicLoader;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1178070glJ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiCampaignMarkerPicLoader@2096.loadPic$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C1178080glK> list = this.LL;
        PoiCampaignMarkerPicLoader poiCampaignMarkerPicLoader = this.LLILLJJLI;
        for (final C1178080glK c1178080glK : list) {
            final AwS632S0100000_18 awS632S0100000_18 = new AwS632S0100000_18(poiCampaignMarkerPicLoader, 252);
            poiCampaignMarkerPicLoader.getClass();
            String str = c1178080glK.LJFF;
            if (str != null && str.length() > 0 && 1 != 0) {
                C1189360h3W c1189360h3WLIZIZ = new C1180600gpO("add_poi_campaign", "poi_marker_icon", null).LIZIZ(str);
                int i = C1913407eW.LIZ;
                c1189360h3WLIZIZ.LJI(i, i);
                c1189360h3WLIZIZ.LIZ.LJJIIJZLJL(new InterfaceC1331910klR(c1178080glK, awS632S0100000_18) { // from class: X.0glI
                    public final C1178080glK LL;
                    public final Function2<C1178080glK, Bitmap, Unit> LLILLJJLI;

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
                        Function2<C1178080glK, Bitmap, Unit> function2;
                        if (bitmap != null && (function2 = this.LLILLJJLI) != null) {
                            function2.invoke(this.LL, bitmap);
                        }
                    }

                    {
                        this.LL = c1178080glK;
                        this.LLILLJJLI = awS632S0100000_18;
                    }
                });
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiCampaignMarkerPicLoader@2096.loadPic$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumPageApi;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumViewModel;
import com.ss.android.ugc.aweme.poi.experiment.PoiGalleryPicOptExperiment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0gyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.album.PoiAlbumViewModel$triggerIdlePreload$1", f = "PoiAlbumViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1186510gyv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PoiAlbumViewModel LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1186510gyv(PoiAlbumViewModel poiAlbumViewModel, int i, InterfaceC1364105Vn<? super C1186510gyv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = poiAlbumViewModel;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1186510gyv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listLJJJJI;
        List<PoiAlbumPageApi.Category> categories;
        int iIntValue;
        int iIntValue2;
        Integer num;
        Integer num2;
        C1C7U.LIZ("PoiAlbumViewModel@897e.triggerIdlePreload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PoiAlbumViewModel poiAlbumViewModel = this.LL;
        int i = this.LLILLJJLI;
        PoiAlbumPageApi.PoiAlbumResponse poiAlbumResponseLIZ = poiAlbumViewModel.getState().LL.LIZ();
        if (poiAlbumResponseLIZ != null && (categories = poiAlbumResponseLIZ.getCategories()) != null) {
            PoiGalleryPicOptExperiment.LIZ.getClass();
            C01GW c01gw = PoiGalleryPicOptExperiment.LIZJ;
            PoiGalleryPicOptExperiment.PoiAlbumIdlePreloadConfig poiAlbumIdlePreloadConfig = ((PoiGalleryPicOptExperiment.PoiGalleryPicOptConfigModel) c01gw.getValue()).poiAlbumIdlePreloadImage;
            int i2 = 0;
            if (poiAlbumIdlePreloadConfig != null && (num2 = poiAlbumIdlePreloadConfig.tabCount) != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            PoiGalleryPicOptExperiment.PoiAlbumIdlePreloadConfig poiAlbumIdlePreloadConfig2 = ((PoiGalleryPicOptExperiment.PoiGalleryPicOptConfigModel) c01gw.getValue()).poiAlbumIdlePreloadImage;
            if (poiAlbumIdlePreloadConfig2 != null && (num = poiAlbumIdlePreloadConfig2.imageCount) != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 0;
            }
            int i3 = i + 1;
            if (i3 >= 0) {
                i2 = i3;
            }
            if (i2 >= categories.size()) {
                listLJJJJI = C13BV.INSTANCE;
            } else {
                int i4 = iIntValue + i2;
                int size = categories.size();
                if (i4 > size) {
                    i4 = size;
                }
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(i2, i4);
                ArrayList arrayList = new ArrayList();
                C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
                while (it2.LLILLL) {
                    C19719612Di.LJJI(((PoiAlbumPageApi.Category) ListProtector.get(categories, it2.nextInt())).getIdlePreloadImageUrls(iIntValue2), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!a0.LJJJIL((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                listLJJJJI = C13LP.LJJJJI(arrayList2);
            }
        } else {
            listLJJJJI = C13BV.INSTANCE;
        }
        if (listLJJJJI.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PoiAlbumViewModel@897e.triggerIdlePreload$1");
            return unit;
        }
        C1336370ksd.LIZ.LJFF(new C1202730hP5(listLJJJJI, "poi_album", "poi_album_idle_preload_gallery_pic"));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PoiAlbumViewModel@897e.triggerIdlePreload$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

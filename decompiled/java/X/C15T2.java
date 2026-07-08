package X;

import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15T2, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.data.hotcache.ExploreHotCacheDataManager$cacheInnerImage$1", f = "ExploreHotCacheDataManager.kt", l = {}, m = "invokeSuspend")
public final class C15T2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<ExplorePostItem> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15T2(List<ExplorePostItem> list, InterfaceC1364105Vn<? super C15T2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15T2(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<PhotoModeImageUrlModel> imageList;
        C1C7U.LIZ("ExploreHotCacheDataManager@1354.cacheInnerImage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C15T4.LIZ().enableDownloadImage && C15T4.LIZ().enable) {
            C2153908cD c2153908cD = C2153908cD.LIZ;
            for (ExplorePostItem explorePostItem : this.LL) {
                C20524115St.LL.getClass();
                Aweme aweme = explorePostItem.aweme;
                if (aweme != null) {
                    PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                    if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null) {
                        imageList = C13BV.INSTANCE;
                    }
                    int iMin = Math.min(C15T4.LIZ().downloadImageCnt, imageList.size());
                    for (int i = 0; i < iMin; i++) {
                        C1EE2 c1ee2 = C1EE2.LIZIZ;
                        C844470XAv.LIZ.getClass();
                        c1ee2.LJJIIZ("homepage_explore", C844470XAv.LIZ(), explorePostItem.aweme, i, EnumC1334360kpO.LOW, null, null);
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreHotCacheDataManager@1354.cacheInnerImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

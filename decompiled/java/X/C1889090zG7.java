package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.MoveFullEntryAssetsData;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.shop.MoveFullEntryAssetsItemData;
import com.ss.android.ugc.aweme.inbox.shop.ShopFullMigrationBannerAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zG7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.shop.ShopFullMigrationBannerAssem$onReceiveGetShopFullMigrationDataEvent$1", f = "ShopFullMigrationBannerAssem.kt", l = {}, m = "invokeSuspend")
public final class C1889090zG7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShopFullMigrationBannerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889090zG7(ShopFullMigrationBannerAssem shopFullMigrationBannerAssem, InterfaceC1364105Vn<? super C1889090zG7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shopFullMigrationBannerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1889090zG7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopFullMigrationBannerAssem@90b9.onReceiveGetShopFullMigrationDataEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C624370OeJ.LIZIZ("ShopFullMigrationBannerProtocol", "onReceiveGetShopFullMigrationDataEvent");
        MoveFullEntryAssetsData moveFullEntryAssetsDataLJIIIZ = ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).inboxService().LJIIIZ();
        if (moveFullEntryAssetsDataLJIIIZ != null) {
            ShopFullMigrationBannerAssem shopFullMigrationBannerAssem = this.LL;
            shopFullMigrationBannerAssem.LLILZ = moveFullEntryAssetsDataLJIIIZ;
            C624370OeJ.LIZIZ("ShopFullMigrationBannerProtocol", "real show");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryShowBanner, cacheData = ");
            sbLIZ.append(shopFullMigrationBannerAssem.LLILZ);
            C624370OeJ.LIZIZ("ShopFullMigrationBannerProtocol", C2188811AlT.LIZIZ(sbLIZ));
            MoveFullEntryAssetsItemData moveFullEntryAssetsItemData = null;
            if (shopFullMigrationBannerAssem.LLILZ == null || !((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).inboxService().LJI()) {
                shopFullMigrationBannerAssem.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
            } else {
                C624370OeJ.LIZIZ("ShopFullMigrationBannerProtocol", "tryShowBanner success");
                C2252321DDq c2252321DDq = shopFullMigrationBannerAssem.LL;
                EnumC637310OzB enumC637310OzB = EnumC637310OzB.BOTTOM_SHOW;
                MoveFullEntryAssetsData moveFullEntryAssetsData = shopFullMigrationBannerAssem.LLILZ;
                if (moveFullEntryAssetsData != null) {
                    moveFullEntryAssetsItemData = new MoveFullEntryAssetsItemData(moveFullEntryAssetsData.content, moveFullEntryAssetsData.actionAreaText, moveFullEntryAssetsData.lightIconUrl, moveFullEntryAssetsData.darkIconUrl, moveFullEntryAssetsData.schemaLink);
                }
                c2252321DDq.setValue(new Pair(enumC637310OzB, moveFullEntryAssetsItemData));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopFullMigrationBannerAssem@90b9.onReceiveGetShopFullMigrationDataEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

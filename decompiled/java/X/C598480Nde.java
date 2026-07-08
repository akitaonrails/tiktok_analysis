package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommercebase.network.StatusResponse;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.api.ShopBagApi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.ShopBagPreview$fetchShoppingBagPreview$ssResponse$2", f = "ShopBagPreview.kt", l = {163}, m = "invokeSuspend")
public final class C598480Nde extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super C0X52<StatusResponse<Object>>>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ EnumC598510Ndh LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598480Nde(String str, String str2, boolean z, EnumC598510Ndh enumC598510Ndh, InterfaceC1364105Vn<? super C598480Nde> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = z;
        this.LLILZLL = enumC598510Ndh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C598480Nde c598480Nde = new C598480Nde(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c598480Nde.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c598480Nde;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> mapLJIIZILJ;
        Object liveBagPreview = obj;
        C1C7U.LIZ("ShopBagPreview@d7a8.fetchShoppingBagPreview$ssResponse$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(liveBagPreview);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(liveBagPreview);
            boolean z = this.LLILLJJLI;
            C598490Ndf c598490Ndf = ShopBagApi.LIZ;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            boolean z2 = this.LLILZIL;
            EnumC598510Ndh enumC598510Ndh = this.LLILZLL;
            Map<String, Object> map = C21190617wG.LIZJ.get(str);
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), C1741890vQh.LJIIIIZZ(entry.getValue()));
                }
                mapLJIIZILJ = C2097608Jq.LJIIZILJ(linkedHashMap);
            } else {
                mapLJIIZILJ = null;
            }
            this.LL = 1;
            c598490Ndf.getClass();
            ShopBagApi shopBagApi = (ShopBagApi) C598490Ndf.LIZIZ.create(ShopBagApi.class);
            Integer numLJ = C2286608xc.LJ(0);
            SettingsManager.LIZLLL().getClass();
            liveBagPreview = shopBagApi.getLiveBagPreview(str, str2, false, 1, numLJ, C2286608xc.LJ(SettingsManager.LJ("shop_bag_preview_page_size", 0)), z2, 1, z, enumC598510Ndh.getValue(), mapLJIIZILJ, this);
            if (liveBagPreview == objLJFF) {
                C1C7U.LIZIZ("ShopBagPreview@d7a8.fetchShoppingBagPreview$ssResponse$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShopBagPreview@d7a8.fetchShoppingBagPreview$ssResponse$2");
        return liveBagPreview;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super C0X52<StatusResponse<Object>>> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

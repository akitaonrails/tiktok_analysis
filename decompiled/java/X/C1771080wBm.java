package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixAssem$loadCacheData$4", f = "ShopMallMixAssem.kt", l = {}, m = "invokeSuspend")
public final class C1771080wBm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1771170wBv LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771080wBm(AbstractC1771170wBv abstractC1771170wBv, InterfaceC1364105Vn<? super C1771080wBm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1771170wBv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771080wBm(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallMixAssem@a45d.loadCacheData$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ECMixMallPageDTO eCMixMallPageDTO = ((C1771140wBs) this.LL).LIZJ;
        if (eCMixMallPageDTO != null) {
            eCMixMallPageDTO.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallMixAssem@a45d.loadCacheData$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

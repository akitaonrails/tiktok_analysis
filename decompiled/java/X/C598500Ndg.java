package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ndg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.ShopBagPreview$fetchShoppingBagPreviewBagAssemble$2", f = "ShopBagPreview.kt", l = {272}, m = "invokeSuspend")
public final class C598500Ndg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ HashMap<String, String> LLILZ;
    public final /* synthetic */ EnumC598510Ndh LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ Function1<String, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C598500Ndg(String str, String str2, HashMap<String, String> map, EnumC598510Ndh enumC598510Ndh, boolean z, long j, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C598500Ndg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = map;
        this.LLILZIL = enumC598510Ndh;
        this.LLILZLL = z;
        this.LLIZ = j;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598500Ndg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopBagPreview@d7a8.fetchShoppingBagPreviewBagAssemble$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            HashMap<String, String> map = this.LLILZ;
            EnumC598510Ndh enumC598510Ndh = this.LLILZIL;
            boolean z = this.LLILZLL;
            long j = this.LLIZ;
            Function1<String, Unit> function1 = this.LLIZLLLIL;
            this.LL = 1;
            if (C21190617wG.LIZLLL(str, str2, map, enumC598510Ndh, z, j, function1, this) == objLJFF) {
                C1C7U.LIZIZ("ShopBagPreview@d7a8.fetchShoppingBagPreviewBagAssemble$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopBagPreview@d7a8.fetchShoppingBagPreviewBagAssemble$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

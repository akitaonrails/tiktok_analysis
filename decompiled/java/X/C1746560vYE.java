package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vYE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.preview.helper.AepPreloadHelper$preloadInputItemData$1", f = "AepPreloadHelper.kt", l = {55}, m = "invokeSuspend")
public final class C1746560vYE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Region LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746560vYE(Region region, Integer num, String str, String str2, InterfaceC1364105Vn<? super C1746560vYE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = region;
        this.LLILLL = num;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1746560vYE(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AepPreloadHelper@a7d2.preloadInputItemData$1");
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
            C980703sT c980703sT = AddressApi.LIZ;
            Region region = this.LLILLJJLI;
            Integer numLJ = C2286608xc.LJ(0);
            Integer num = this.LLILLL;
            String str = this.LLILZ;
            this.LL = 1;
            obj = c980703sT.LIZLLL(region, numLJ, null, num, str, null, null, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AepPreloadHelper@a7d2.preloadInputItemData$1");
                return objLJFF;
            }
        }
        Response response = (Response) obj;
        if (!response.isCodeOK()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AepPreloadHelper@a7d2.preloadInputItemData$1");
            return unit;
        }
        InputItemData inputItemData = (InputItemData) response.data;
        if (inputItemData != null) {
            String str2 = this.LLILZIL;
            if (C756302xN.LIZ(inputItemData.inputItems)) {
                C1747600vZu c1747600vZu = new C1747600vZu(inputItemData);
                if (C1746530vYB.LIZ) {
                    C1746530vYB.LIZIZ.LIZJ(str2, c1747600vZu);
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AepPreloadHelper@a7d2.preloadInputItemData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

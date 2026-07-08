package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import com.ss.android.ugc.aweme.ecommerce.proto.IEcomProtobufService;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$requestChunk$1$3$1$3", f = "ShopMallRepository.kt", l = {}, m = "invokeSuspend")
public final class C1771190wBx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ AbstractC1771170wBv LLILLJJLI;
    public final /* synthetic */ C1771500wCS LLILLL;
    public final /* synthetic */ C1771590wCb LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771190wBx(boolean z, AbstractC1771170wBv abstractC1771170wBv, C1771500wCS c1771500wCS, C1771590wCb c1771590wCb, InterfaceC1364105Vn<? super C1771190wBx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = abstractC1771170wBv;
        this.LLILLL = c1771500wCS;
        this.LLILZ = c1771590wCb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771190wBx(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        HashMap<String, Object> mapLIZ;
        C1C7U.LIZ("ShopMallRepository@92e8.requestChunk$1$3$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            IEcomProtobufService iEcomProtobufService = (IEcomProtobufService) PluggableExtentionKt.pluggableSpi$default(IEcomProtobufService.class, false, false, false, 14, null);
            if (iEcomProtobufService != null) {
                iEcomProtobufService.LJ("/api/v1/mall/homepage/bff/get", "preload=1");
            }
            if (!this.LL) {
                ECMixMallPageDTO eCMixMallPageDTO = ((C1771640wCg) this.LLILLJJLI).LIZJ;
                Map mapLIZJ = null;
                if (eCMixMallPageDTO != null && (mapLIZ = C1741890vQh.LIZ(eCMixMallPageDTO)) != null) {
                    mapLIZJ = C2097908Jt.LIZJ(new Pair("data", mapLIZ));
                }
                this.LLILLL.getClass();
                if (mapLIZJ != null) {
                    EcomResourceBystander.LIZ.getClass();
                    EcomResourceBystander.LJIILLIIL(mapLIZJ, "/api/v1/mall/homepage/bff/get", true, null, null);
                }
            }
            if (((Boolean) C0BAX.LIZ.getValue()).booleanValue()) {
                this.LLILLL.LJIILJJIL(((C1771640wCg) this.LLILLJJLI).LIZ, false, this.LLILZ.LIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallRepository@92e8.requestChunk$1$3$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

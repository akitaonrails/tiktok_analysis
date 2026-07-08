package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.preload.ShopMixMallDataPreload;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMixMallPerfConfigV1Model;
import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.list.ECMixMallListDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.section.ECMixMallSectionDTO;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wC2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.preload.ShopMixMallDataPreload$Companion$preloadMixMallData$2$1$onSuccess$1", f = "ShopMixMallDataPreload.kt", l = {}, m = "invokeSuspend")
public final class C1771240wC2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ EnumC1771290wC7 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771240wC2(Object obj, long j, EnumC1771290wC7 enumC1771290wC7, InterfaceC1364105Vn<? super C1771240wC2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = obj;
        this.LLILLJJLI = j;
        this.LLILLL = enumC1771290wC7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771240wC2(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C0X52 c0x52;
        C0X52 c0x522;
        T t;
        int iIntValue;
        ECMixMallListDTO eCMixMallListDTO;
        List<ECMixMallSectionDTO> list;
        Integer num;
        C1C7U.LIZ("ShopMixMallDataPreload$Companion@47ad.preloadMixMallData$2$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1771230wC1 c1771230wC1 = ShopMixMallDataPreload.Companion;
        Object obj2 = this.LL;
        long j = this.LLILLJJLI;
        c1771230wC1.getClass();
        if ((obj2 instanceof C0X52) && obj2 != null && (t = (c0x522 = (C0X52) obj2).LIZIZ) != 0 && ((Response) t).data != 0) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("MixMall ClickPreload Preload onSuccess");
            n nVar = (n) ((Response) c0x522.LIZIZ).data;
            if (nVar != null) {
                C2341109Fh.LIZ("MixMall ClickPreload Preload onSuccess: hasData");
                C1769810w9j.LIZ.getClass();
                EcMixMallPerfConfigV1Model ecMixMallPerfConfigV1ModelLIZ = C1769810w9j.LIZ();
                if (ecMixMallPerfConfigV1ModelLIZ == null || (num = ecMixMallPerfConfigV1ModelLIZ.enableSkipPreloadApiSaveCache) == null || num.intValue() != 1) {
                    try {
                        Integer num2 = C1771440wCM.LIZLLL().cacheWriteInterval;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        long j2 = iIntValue;
                        if (C1773900wGK.LIZJ()) {
                            MMKStorageUtil mMKStorageUtil = MMKStorageUtil.LIZ;
                            if (MMKStorageUtil.LJ(nVar)) {
                                C599820Nfo.LIZ.getClass();
                                C599820Nfo.LIZ("wyxxxxxxxx", "MixMall ClickPreload: save prefetch CacheData");
                                MMKStorageUtil.LJFF(j2, nVar);
                            }
                        } else {
                            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(nVar);
                            ECMixMallPageDTO eCMixMallPageDTO = (ECMixMallPageDTO) JsonParseUtils.LIZLLL(ECMixMallPageDTO.class, strLJIIIIZZ);
                            if (eCMixMallPageDTO != null && (eCMixMallListDTO = eCMixMallPageDTO.body) != null && (list = eCMixMallListDTO.sections) != null && !list.isEmpty()) {
                                C599820Nfo.LIZ.getClass();
                                C599820Nfo.LIZ("wyxxxxxxxx", "MixMall ClickPreload: save prefetch CacheData");
                                MMKStorageUtil mMKStorageUtil2 = MMKStorageUtil.LIZ;
                                MMKStorageUtil.LJFF(j2, strLJIIIIZZ);
                            }
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                C1767950w6j c1767950w6j = C1767950w6j.LIZ;
                int stage = EnumC1771300wC8.PRELOAD_SUCCESS.getStage();
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                c1767950w6j.getClass();
                C1767950w6j.LJIJJLI(stage, jCurrentTimeMillis, null);
            }
        } else if (obj2 instanceof AbstractRunnableC20150813sw) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("MixMall ClickPreload Preload onSuccess: task");
        } else {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("MixMall ClickPreload Preload onSuccess: noData");
            PowerPreloadServiceImpl.LIZIZ().LIZ("api/v1/mall/homepage/bff/get", null);
            C1767950w6j c1767950w6j2 = C1767950w6j.LIZ;
            int stage2 = EnumC1771300wC8.PRELOAD_FAIL.getStage();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("error_msg", EnumC1771280wC6.RESPONSE_UNAVAILABLE.getErrMsg()));
            c1767950w6j2.getClass();
            C1767950w6j.LJIJJLI(stage2, jCurrentTimeMillis2, mapLIZJ);
        }
        C1771230wC1 c1771230wC12 = ShopMixMallDataPreload.Companion;
        String value = this.LLILLL.getValue();
        c1771230wC12.getClass();
        C1771590wCb c1771590wCbLIZ = C1771230wC1.LIZ(value);
        Object obj3 = this.LL;
        if (!(obj3 instanceof C0X52) || (c0x52 = (C0X52) obj3) == null || (str = c0x52.LIZ.LJI) == null) {
            str = "";
        }
        C1771230wC1.LIZJ(c1771590wCbLIZ, 0, str, System.currentTimeMillis() - this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMixMallDataPreload$Companion@47ad.preloadMixMallData$2$1$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

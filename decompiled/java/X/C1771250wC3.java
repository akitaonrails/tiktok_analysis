package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallApiWithPreload;
import com.ss.android.ugc.aweme.ecommerce.mall.preload.ShopMixMallDataPreload;
import com.ss.android.ugc.aweme.ecommerce.mall.preload.ShopMixMallDataPreloadChunk;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wC3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.preload.ShopMixMallDataPreloadChunk$Companion$preloadChunkDeferred$2", f = "ShopMixMallDataPreloadChunk.kt", l = {165}, m = "invokeSuspend")
public final class C1771250wC3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ n LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ PreloadExtraInfo LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C05XL<C1515820pY4<C1515870pY9<ECMixMallPageDTO>>> LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ EnumC1771290wC7 LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771250wC3(n nVar, Map<String, String> map, PreloadExtraInfo preloadExtraInfo, boolean z, C05XL<C1515820pY4<C1515870pY9<ECMixMallPageDTO>>> c05xl, long j, EnumC1771290wC7 enumC1771290wC7, boolean z2, InterfaceC1364105Vn<? super C1771250wC3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = nVar;
        this.LLILLL = map;
        this.LLILZ = preloadExtraInfo;
        this.LLILZIL = z;
        this.LLILZLL = c05xl;
        this.LLIZ = j;
        this.LLIZLLLIL = enumC1771290wC7;
        this.LLJ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771250wC3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object shopBffStreamDataSuspend = obj;
        C1C7U.LIZ("ShopMixMallDataPreloadChunk$Companion@12ae.preloadChunkDeferred$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = "";
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(shopBffStreamDataSuspend);
            } else {
                C155000ia.LIZIZ(shopBffStreamDataSuspend);
                ShopMallApiWithPreload.LIZ.getClass();
                ShopMallApiWithPreload shopMallApiWithPreload = C1771330wCB.LIZIZ;
                List<C080U> listLJI = C1771330wCB.LJI();
                n nVar = this.LLILLJJLI;
                Map<String, String> map = this.LLILLL;
                PreloadExtraInfo preloadExtraInfo = this.LLILZ;
                this.LL = 1;
                shopBffStreamDataSuspend = shopMallApiWithPreload.getShopBffStreamDataSuspend(listLJI, nVar, map, preloadExtraInfo, this);
                if (shopBffStreamDataSuspend == objLJFF) {
                    C1C7U.LIZIZ("ShopMixMallDataPreloadChunk$Companion@12ae.preloadChunkDeferred$2");
                    return objLJFF;
                }
            }
            this.LLILZLL.LJIIZILJ(ShopMixMallDataPreloadChunk.chunkPreloadCacheManager.LJIJJLI((C1515820pY4) shopBffStreamDataSuspend, this.LLILZIL));
            C1767950w6j c1767950w6j = C1767950w6j.LIZ;
            int stage = EnumC1771300wC8.PRELOAD_SUCCESS.getStage();
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
            c1767950w6j.getClass();
            C1767950w6j.LJIJJLI(stage, jCurrentTimeMillis, null);
            C1771230wC1 c1771230wC1 = ShopMixMallDataPreload.Companion;
            String value = this.LLIZLLLIL.getValue();
            c1771230wC1.getClass();
            C1771230wC1.LIZJ(C1771230wC1.LIZ(value), 0, "", System.currentTimeMillis() - this.LLIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            if (this.LLJ) {
                ShopMixMallDataPreloadChunk.chunkPreloadCacheManager.LJIIJJI(this.LLILZLL);
            } else {
                ShopMixMallDataPreloadChunk.chunkPreloadCacheManager.LJIIJ(this.LLILZLL);
            }
            this.LLILZLL.LJJJJJ(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.LLJ) {
                ShopMixMallDataPreloadChunk.chunkPreloadCacheManager.LJIIJJI(this.LLILZLL);
            } else {
                ShopMixMallDataPreloadChunk.chunkPreloadCacheManager.LJIIJ(this.LLILZLL);
            }
            this.LLILZLL.LJJJJJ(th);
            C1767950w6j c1767950w6j2 = C1767950w6j.LIZ;
            int stage2 = EnumC1771300wC8.PRELOAD_FAIL.getStage();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLIZ;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("error_msg", message));
            c1767950w6j2.getClass();
            C1767950w6j.LJIJJLI(stage2, jCurrentTimeMillis2, mapLIZJ);
            C1771230wC1 c1771230wC12 = ShopMixMallDataPreload.Companion;
            String value2 = this.LLIZLLLIL.getValue();
            c1771230wC12.getClass();
            C1771590wCb c1771590wCbLIZ = C1771230wC1.LIZ(value2);
            String message2 = th.getMessage();
            if (message2 != null) {
                str = message2;
            }
            C1771230wC1.LIZJ(c1771590wCbLIZ, -1, str, System.currentTimeMillis() - this.LLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMixMallDataPreloadChunk$Companion@12ae.preloadChunkDeferred$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

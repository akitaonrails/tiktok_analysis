package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$requestChunk$1$3$1$preloadTask$1$2", f = "ShopMallRepository.kt", l = {617}, m = "invokeSuspend")
public final class C1771160wBu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<k> LLILLJJLI;
    public final /* synthetic */ AbstractC1771170wBv LLILLL;
    public final /* synthetic */ C1771500wCS LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771160wBu(C259800zU<k> c259800zU, AbstractC1771170wBv abstractC1771170wBv, C1771500wCS c1771500wCS, InterfaceC1364105Vn<? super C1771160wBu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = abstractC1771170wBv;
        this.LLILZ = c1771500wCS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771160wBu(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, com.google.gson.k] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        Object objLJIIIZ;
        n nVar;
        C1C7U.LIZ("ShopMallRepository@92e8.requestChunk$1$3$1$preloadTask$1$2");
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
            Integer num = C1771440wCM.LIZLLL().cacheWriteInterval;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(iIntValue, this) == objLJFF) {
                C1C7U.LIZIZ("ShopMallRepository@92e8.requestChunk$1$3$1$preloadTask$1$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.element = C1741890vQh.LJI(((C1771640wCg) this.LLILLL).LIZJ);
        try {
            C1771500wCS c1771500wCS = this.LLILZ;
            k kVar = this.LLILLJJLI.element;
            if (kVar instanceof n) {
                nVar = (n) kVar;
            } else {
                nVar = null;
            }
            c1771500wCS.getClass();
            objLJIIIZ = C1771500wCS.LJIIIZ(nVar, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            EnumC1771210wBz enumC1771210wBz = EnumC1771210wBz.CROP_ONLINE_DATA;
            String message = e.getMessage();
            if (message == null) {
                message = "crop online data error before save";
            }
            C1768370w7P.LIZ(e, enumC1771210wBz, message, null);
            objLJIIIZ = this.LLILLJJLI.element;
        }
        MMKStorageUtil mMKStorageUtil = MMKStorageUtil.LIZ;
        MMKStorageUtil.LJFF(0L, objLJIIIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallRepository@92e8.requestChunk$1$3$1$preloadTask$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

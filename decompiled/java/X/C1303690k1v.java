package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallRepository$requestChunk$1$3$1$10", f = "ShopMallRepository.kt", l = {698, 699}, m = "invokeSuspend")
public final class C1303690k1v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1771500wCS LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303690k1v(C1771500wCS c1771500wCS, InterfaceC1364105Vn<? super C1303690k1v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1771500wCS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1303690k1v(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("ShopMallRepository@92e8.requestChunk$1$3$1$10");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    unit = Unit.LIZ;
                    C1C7U.LIZIZ("ShopMallRepository@92e8.requestChunk$1$3$1$10");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C099F c099f = this.LLILLJJLI.LIZLLL;
            if (c099f != null) {
                this.LL = 1;
                if (c099f.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("ShopMallRepository@92e8.requestChunk$1$3$1$10");
                    return objLJFF;
                }
            }
        }
        C099F c099f2 = this.LLILLJJLI.LJ;
        if (c099f2 != null) {
            this.LL = 2;
            if (c099f2.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("ShopMallRepository@92e8.requestChunk$1$3$1$10");
                return objLJFF;
            }
            unit = Unit.LIZ;
            C1C7U.LIZIZ("ShopMallRepository@92e8.requestChunk$1$3$1$10");
            return unit;
        }
        unit = null;
        C1C7U.LIZIZ("ShopMallRepository@92e8.requestChunk$1$3$1$10");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

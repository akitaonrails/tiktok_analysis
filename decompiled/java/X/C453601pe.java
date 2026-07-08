package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.ugc.effectplatform.cache.EffectPlatformCacheImpl$writeStreamToFile$result$1", f = "EffectPlatformCacheImpl.kt", l = {139}, m = "invokeSuspend")
public final class C453601pe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends Long>>, Object> {
    public int LL;
    public final /* synthetic */ Pair<C05XL<Pair<String, Long>>, C13S7> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C453601pe(Pair<? extends C05XL<Pair<String, Long>>, C13S7> pair, InterfaceC1364105Vn<? super C453601pe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C453601pe(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectPlatformCacheImpl@282f.writeStreamToFile$result$1");
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
            C453501pd c453501pd = new C453501pd(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C099A.LIZJ(10000L, c453501pd, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectPlatformCacheImpl@282f.writeStreamToFile$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EffectPlatformCacheImpl@282f.writeStreamToFile$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

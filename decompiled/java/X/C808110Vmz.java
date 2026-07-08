package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cache.core.BaseCacheManager$release$1", f = "BaseCacheManager.kt", l = {187, 189}, m = "invokeSuspend")
public final class C808110Vmz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C808140Vn2<Object, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C808110Vmz(C808140Vn2<Object, Object> c808140Vn2, InterfaceC1364105Vn<? super C808110Vmz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c808140Vn2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C808110Vmz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCacheManager@1c16.release$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C2296808zG.LIZJ(this.LLILLJJLI.LIZLLL, null);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BaseCacheManager@1c16.release$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C808140Vn2<Object, Object> c808140Vn2 = this.LLILLJJLI;
            this.LL = 1;
            if (c808140Vn2.LIZJ(this) == objLJFF) {
                C1C7U.LIZIZ("BaseCacheManager@1c16.release$1");
                return objLJFF;
            }
        }
        InterfaceC808120Vn0<Object, Object> interfaceC808120Vn0 = this.LLILLJJLI.LIZ;
        this.LL = 2;
        if (interfaceC808120Vn0.release() == objLJFF) {
            C1C7U.LIZIZ("BaseCacheManager@1c16.release$1");
            return objLJFF;
        }
        C2296808zG.LIZJ(this.LLILLJJLI.LIZLLL, null);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaseCacheManager@1c16.release$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

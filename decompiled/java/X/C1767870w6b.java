package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0w6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.ShopMallObserver$preload$1", f = "ShopMallObserver.kt", l = {}, m = "invokeSuspend")
public final class C1767870w6b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1767870w6b(InterfaceC1364105Vn<? super C1767870w6b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1767870w6b(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallObserver@972f.preload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1767910w6f c1767910w6f = C1767910w6f.LIZ;
        if (C1767910w6f.LIZJ != null) {
            c1767910w6f.getClass();
            C1767910w6f.LIZ("getTemplateData cache memory");
        } else {
            synchronized (c1767910w6f) {
                try {
                    if (C1767910w6f.LIZJ == null) {
                        if (C7879035x.LIZLLL()) {
                            C1767910w6f.LIZJ = C1767910w6f.LIZIZ();
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } else {
                            try {
                                try {
                                    C1767910w6f.LIZJ = C1767910w6f.LIZIZ();
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (CancellationException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    throw e;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C1AF0.LJ(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        C1768320w7K.LIZ.getClass();
        C1768320w7K.LIZ();
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        String stage = EnumC1768030w6r.STAGE_CREATE_LOAD_CACHE.getStage();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1767960w6k.LIZ.getClass();
        long j = jCurrentTimeMillis - C1767960w6k.LIZLLL;
        c1767950w6j.getClass();
        C1767950w6j.LJIIL(j, stage, null, true, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallObserver@972f.preload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1767870w6b(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

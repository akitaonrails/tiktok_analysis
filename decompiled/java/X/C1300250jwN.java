package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0jwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.popup.dynamic.spark.FeedPopupSparkPreloader$cacheSparkManager$2$onLoadFail$1", f = "FeedPopupSparkPreloader.kt", l = {}, m = "invokeSuspend")
public final class C1300250jwN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20644415qM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1300250jwN(C20644415qM c20644415qM, InterfaceC1364105Vn<? super C1300250jwN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20644415qM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1300250jwN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedPopupSparkPreloader@427.cacheSparkManager$2$onLoadFail$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1303560k1i c1303560k1i = C1303570k1j.LIZIZ;
        C20644415qM c20644415qM = this.LL;
        synchronized (c1303560k1i) {
            try {
                c1303560k1i.remove(c20644415qM);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedPopupSparkPreloader@427.cacheSparkManager$2$onLoadFail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

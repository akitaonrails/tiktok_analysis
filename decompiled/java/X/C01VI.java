package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01VI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ogccampaign.OgcLynxCache$loadFromDisk$1", f = "OgcLynxCache.kt", l = {}, m = "invokeSuspend")
public final class C01VI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01VI(String str, InterfaceC1364105Vn<? super C01VI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01VI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OgcLynxCache@b171.loadFromDisk$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            OgcLynxCache.LIZ.LJFF(this.LL);
            OgcLynxCache.LJII = false;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OgcLynxCache@b171.loadFromDisk$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            OgcLynxCache ogcLynxCache = OgcLynxCache.LIZ;
            OgcLynxCache.LJII = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

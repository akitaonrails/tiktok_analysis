package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.preload.BasePreloader$preload$1", f = "BasePreloader.kt", l = {53}, m = "invokeSuspend")
public final class C1833970xpD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1844760y6c<AbstractC1833980xpE, Object> LLILLJJLI;
    public final /* synthetic */ AbstractC1833980xpE LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833970xpD(AbstractC1844760y6c<AbstractC1833980xpE, Object> abstractC1844760y6c, AbstractC1833980xpE abstractC1833980xpE, long j, InterfaceC1364105Vn<? super C1833970xpD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1844760y6c;
        this.LLILLL = abstractC1833980xpE;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1833970xpD(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ = obj;
        C1C7U.LIZ("BasePreloader@b2e4.preload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                AbstractC1844760y6c<AbstractC1833980xpE, Object> abstractC1844760y6c = this.LLILLJJLI;
                AbstractC1833980xpE abstractC1833980xpE = this.LLILLL;
                this.LL = 1;
                C1833940xpA c1833940xpA = (C1833940xpA) abstractC1844760y6c;
                c1833940xpA.getClass();
                objLIZIZ = c1833940xpA.LIZIZ(this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("BasePreloader@b2e4.preload$1");
                    return objLJFF;
                }
            }
            LruCache<String, C1844780y6e<?>> lruCache = AbstractC1844760y6c.LIZIZ;
            ((C1833940xpA) this.LLILLJJLI).getClass();
            C1833940xpA c1833940xpA2 = C1833940xpA.LJ;
            lruCache.put("live_replay_list", new C1844780y6e<>(this.LLILZ, this.LLILLL.LIZ, objLIZIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BasePreloader@b2e4.preload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

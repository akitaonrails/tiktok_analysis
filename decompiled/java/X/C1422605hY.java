package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.MixSearchCacheUtil$asyncStoreCacheWithGap$1", f = "MixSearchCacheUtil.kt", l = {100}, m = "invokeSuspend")
public final class C1422605hY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<n, n> LLILLL;
    public final /* synthetic */ n LLILZ;
    public final /* synthetic */ C677540Qhs LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1422605hY(Function1<? super n, n> function1, n nVar, C677540Qhs c677540Qhs, InterfaceC1364105Vn<? super C1422605hY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = nVar;
        this.LLILZIL = c677540Qhs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1422605hY c1422605hY = new C1422605hY(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1422605hY.LLILLJJLI = obj;
        return c1422605hY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("MixSearchCacheUtil@d925.asyncStoreCacheWithGap$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            C1422705hZ.LIZ.getClass();
            long j = C1422705hZ.LIZIZ.storageDelay;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("MixSearchCacheUtil@d925.asyncStoreCacheWithGap$1");
                return objLJFF;
            }
        }
        n nVarInvoke = this.LLILLL.invoke(this.LLILZ);
        if (nVarInvoke == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MixSearchCacheUtil@d925.asyncStoreCacheWithGap$1");
            return unit;
        }
        C1422805ha c1422805ha = C1422805ha.LIZ;
        try {
            c098200Yq = this.LLILZIL.LIZIZ(nVarInvoke, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1422805ha.LIZLLL = (C1422405hW) c098200Yq;
        C1422805ha c1422805ha2 = C1422805ha.LIZ;
        C1422805ha.LJ = true;
        C1422805ha.LJFF = null;
        C013C c013c = new C013C();
        synchronized (C1422805ha.LIZ) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = jCurrentTimeMillis - C1422805ha.LJI;
                C1422705hZ.LIZ.getClass();
                if (j2 < C1422705hZ.LIZIZ.storageGap) {
                    z = false;
                }
                c013c.element = z;
                if (z) {
                    C1422805ha.LJI = jCurrentTimeMillis;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (c013c.element) {
            ((Keva) C1422805ha.LIZIZ.getValue()).storeString("mix_search_chunk_filter_cache", nVarInvoke.toString());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MixSearchCacheUtil@d925.asyncStoreCacheWithGap$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

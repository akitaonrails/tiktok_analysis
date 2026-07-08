package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wXG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.tiktok.kmp.shareprop.SharePropagationCacheManager$writeAsync$memoryDoneMs$1", f = "SharePropagationCacheManager.kt", l = {293}, m = "invokeSuspend")
public final class C1784400wXG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Long>, Object> {
    public C1DEV LL;
    public C1784480wXO LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C1784480wXO LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784400wXG(C1784480wXO c1784480wXO, long j, int i, InterfaceC1364105Vn<? super C1784400wXG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1784480wXO;
        this.LLIZ = j;
        this.LLIZLLLIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784400wXG(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEV c1dev;
        C1784480wXO c1784480wXO;
        long j;
        int i;
        C1C7U.LIZ("SharePropagationCacheManager@7b32.writeAsync$memoryDoneMs$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LLILZ;
                j = this.LLILLL;
                c1784480wXO = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1dev = C1784440wXK.LIZJ;
            c1784480wXO = this.LLILZLL;
            j = this.LLIZ;
            i = this.LLIZLLLIL;
            this.LL = c1dev;
            this.LLILLJJLI = c1784480wXO;
            this.LLILLL = j;
            this.LLILZ = i;
            this.LLILZIL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("SharePropagationCacheManager@7b32.writeAsync$memoryDoneMs$1");
                return objLJFF;
            }
        }
        try {
            C1784440wXK.LIZ.getClass();
            C1784440wXK.LIZLLL = C1784440wXK.LIZLLL(C1784440wXK.LIZ(i, j, C1784440wXK.LJI(Collections.singletonList(c1784480wXO), C1784440wXK.LJFF())));
            Long lLJFF = C2286608xc.LJFF(C1784440wXK.LJII());
            c1dev.LIZIZ(null);
            C1C7U.LIZIZ("SharePropagationCacheManager@7b32.writeAsync$memoryDoneMs$1");
            return lLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

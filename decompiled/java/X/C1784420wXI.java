package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wXI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.tiktok.kmp.shareprop.SharePropagationCacheManager$writeSync$1", f = "SharePropagationCacheManager.kt", l = {293}, m = "invokeSuspend")
public final class C1784420wXI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1154320g90>, Object> {
    public C1DEV LL;
    public InterfaceC1784430wXJ LLILLJJLI;
    public C1784480wXO LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ InterfaceC1784430wXJ LLIZ;
    public final /* synthetic */ C1784480wXO LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784420wXI(InterfaceC1784430wXJ interfaceC1784430wXJ, C1784480wXO c1784480wXO, long j, int i, InterfaceC1364105Vn<? super C1784420wXI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = interfaceC1784430wXJ;
        this.LLIZLLLIL = c1784480wXO;
        this.LLJ = j;
        this.LLJI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784420wXI(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEV c1dev;
        InterfaceC1784430wXJ interfaceC1784430wXJ;
        C1784480wXO c1784480wXO;
        long j;
        int i;
        C1C7U.LIZ("SharePropagationCacheManager@7b32.writeSync$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZLL;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LLILZIL;
                j = this.LLILZ;
                c1784480wXO = this.LLILLL;
                interfaceC1784430wXJ = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1dev = C1784440wXK.LIZJ;
            interfaceC1784430wXJ = this.LLIZ;
            c1784480wXO = this.LLIZLLLIL;
            j = this.LLJ;
            i = this.LLJI;
            this.LL = c1dev;
            this.LLILLJJLI = interfaceC1784430wXJ;
            this.LLILLL = c1784480wXO;
            this.LLILZ = j;
            this.LLILZIL = i;
            this.LLILZLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("SharePropagationCacheManager@7b32.writeSync$1");
                return objLJFF;
            }
        }
        try {
            C1784440wXK.LIZ.getClass();
            boolean zLIZIZ = C1784440wXK.LIZIZ(interfaceC1784430wXJ);
            List<C1784480wXO> listLIZ = C1784440wXK.LIZ(i, j, C1784440wXK.LJI(Collections.singletonList(c1784480wXO), C1784440wXK.LJFF()));
            C1784440wXK.LIZLLL = C1784440wXK.LIZLLL(listLIZ);
            long jLJII = C1784440wXK.LJII();
            interfaceC1784430wXJ.LIZ(listLIZ);
            C20684815ws.LJIILLIIL("share_prop_storage_diff", C2097608Jq.LJI(new Pair("duration", String.valueOf(C1784440wXK.LJII() - jLJII))));
            if (!zLIZIZ) {
                z = false;
            }
            C1154320g90 c1154320g90 = new C1154320g90(z);
            c1dev.LIZIZ(null);
            C1C7U.LIZIZ("SharePropagationCacheManager@7b32.writeSync$1");
            return c1154320g90;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1154320g90> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

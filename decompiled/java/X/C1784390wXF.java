package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wXF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.tiktok.kmp.shareprop.SharePropagationCacheManager$writeAsync$1", f = "SharePropagationCacheManager.kt", l = {135}, m = "invokeSuspend")
public final class C1784390wXF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1784430wXJ LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784390wXF(InterfaceC1784430wXJ interfaceC1784430wXJ, long j, int i, long j2, InterfaceC1364105Vn<? super C1784390wXF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1784430wXJ;
        this.LLILLL = j;
        this.LLILZ = i;
        this.LLILZIL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784390wXF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePropagationCacheManager@7b32.writeAsync$1");
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
            C1784440wXK c1784440wXK = C1784440wXK.LIZ;
            InterfaceC1784430wXJ interfaceC1784430wXJ = this.LLILLJJLI;
            long j = this.LLILLL;
            int i2 = this.LLILZ;
            long j2 = this.LLILZIL;
            this.LL = 1;
            if (c1784440wXK.LIZJ(interfaceC1784430wXJ, j, i2, j2, this) == objLJFF) {
                C1C7U.LIZIZ("SharePropagationCacheManager@7b32.writeAsync$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePropagationCacheManager@7b32.writeAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rHL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayPreloadManager$resetCache$3", f = "ECLiveVideoReplayPreloadManager.kt", l = {689}, m = "invokeSuspend")
public final class C1582330rHL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ C21353418hQ LLILZ;
    public final /* synthetic */ C259800zU<InterfaceC1482530ogN> LLILZIL;
    public final /* synthetic */ C259800zU<C09AE> LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ C188G LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1582330rHL(long j, C013C c013c, C21353418hQ c21353418hQ, C259800zU<InterfaceC1482530ogN> c259800zU, C259800zU<C09AE> c259800zU2, long j2, int i, C188G c188g, InterfaceC1364105Vn<? super C1582330rHL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c013c;
        this.LLILZ = c21353418hQ;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c259800zU2;
        this.LLIZ = j2;
        this.LLIZLLLIL = i;
        this.LLJ = c188g;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1582330rHL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECLiveVideoReplayPreloadManager@de08.resetCache$3");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.resetCache$3");
                return objLJFF;
            }
        }
        C21353118hN.LJIIJ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, false, "seek_failed");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.resetCache$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

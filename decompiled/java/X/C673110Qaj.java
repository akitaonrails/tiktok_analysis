package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qaj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.mob.SearchMusicMiddlePerfMobHelper$processTrendingData$2", f = "SearchMusicMiddlePerfMobHelper.kt", l = {148}, m = "invokeSuspend")
public final class C673110Qaj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C681610QoR LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673110Qaj(C681610QoR c681610QoR, String str, boolean z, InterfaceC1364105Vn<? super C673110Qaj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c681610QoR;
        this.LLILLL = str;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673110Qaj(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SearchMusicMiddlePerfMobHelper@2b04.processTrendingData$2");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C673100Qai c673100Qai = new C673100Qai(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c673100Qai);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchMusicMiddlePerfMobHelper@2b04.processTrendingData$2");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        this.LLILLJJLI.LIZLLL = ((Number) pair.getFirst()).intValue();
        this.LLILLJJLI.LJII = ((Number) pair.getSecond()).longValue();
        C099F c099f = this.LLILLJJLI.LJIILJJIL;
        Unit unit = Unit.LIZ;
        c099f.LJJLIIIJILLIZJL(unit);
        if (((Number) pair.getFirst()).intValue() <= 0) {
            this.LLILLJJLI.LIZIZ(System.currentTimeMillis());
        }
        C1C7U.LIZIZ("SearchMusicMiddlePerfMobHelper@2b04.processTrendingData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

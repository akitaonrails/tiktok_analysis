package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import njp.a;

/* JADX INFO: renamed from: X.05Sj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedEntranceKt$SocialThoughtAggregatedEntrance$onTap$1$1$1", f = "SocialThoughtAggregatedEntrance.kt", l = {248}, m = "invokeSuspend")
public final class C1355905Sj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C1675800ti6> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZIL;
    public final /* synthetic */ List<C1677480tko<Float, C1677280tkU>> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1355905Sj(List<C1675800ti6> list, Function0<Unit> function0, C1677480tko<Float, C1677280tkU> c1677480tko, List<C1677480tko<Float, C1677280tkU>> list2, InterfaceC1364105Vn<? super C1355905Sj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = function0;
        this.LLILZIL = c1677480tko;
        this.LLILZLL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1355905Sj c1355905Sj = new C1355905Sj(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1355905Sj.LLILLJJLI = obj;
        return c1355905Sj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtAggregatedEntranceKt@9dce.SocialThoughtAggregatedEntrance$onTap$1$1$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1355605Sg(this.LLILZIL, null), 3);
            IntRange intRangeLJIIIZ = C1697810uHb.LJIIIZ(this.LLILLL);
            List<C1677480tko<Float, C1677280tkU>> list = this.LLILZLL;
            List<C1675800ti6> list2 = this.LLILLL;
            C531650Kt9 it2 = intRangeLJIIIZ.iterator();
            while (it2.LLILLL) {
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1355705Sh(it2.nextInt(), list, list2, null), 3);
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(145L, this) == objLJFF) {
                C1C7U.LIZIZ("SocialThoughtAggregatedEntranceKt@9dce.SocialThoughtAggregatedEntrance$onTap$1$1$1");
                return objLJFF;
            }
        }
        this.LLILZ.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtAggregatedEntranceKt@9dce.SocialThoughtAggregatedEntrance$onTap$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

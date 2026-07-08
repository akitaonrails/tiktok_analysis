package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Sh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedEntranceKt$SocialThoughtAggregatedEntrance$onTap$1$1$1$2$1", f = "SocialThoughtAggregatedEntrance.kt", l = {240, 241}, m = "invokeSuspend")
public final class C1355705Sh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ List<C1677480tko<Float, C1677280tkU>> LLILLL;
    public final /* synthetic */ List<C1675800ti6> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1355705Sh(int i, List<C1677480tko<Float, C1677280tkU>> list, List<C1675800ti6> list2, InterfaceC1364105Vn<? super C1355705Sh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = list;
        this.LLILZ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1355705Sh(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtAggregatedEntranceKt@9dce.SocialThoughtAggregatedEntrance$onTap$1$1$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SocialThoughtAggregatedEntranceKt@9dce.SocialThoughtAggregatedEntrance$onTap$1$1$1$2$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = ((long) this.LLILLJJLI) * 55;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SocialThoughtAggregatedEntranceKt@9dce.SocialThoughtAggregatedEntrance$onTap$1$1$1$2$1");
                return objLJFF;
            }
        }
        C1677480tko c1677480tko = (C1677480tko) ListProtector.get(this.LLILLL, this.LLILLJJLI);
        Float fLIZLLL = C2286608xc.LIZLLL(1.0f);
        C1676890tjr c1676890tjrLIZJ = C1671550tbF.LIZJ(0.82f, ((C1675800ti6) ListProtector.get(this.LLILZ, this.LLILLJJLI)).LJI, null, 4);
        this.LL = 2;
        if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1676890tjrLIZJ, null, null, this, 12) == objLJFF) {
            C1C7U.LIZIZ("SocialThoughtAggregatedEntranceKt@9dce.SocialThoughtAggregatedEntrance$onTap$1$1$1$2$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtAggregatedEntranceKt@9dce.SocialThoughtAggregatedEntrance$onTap$1$1$1$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

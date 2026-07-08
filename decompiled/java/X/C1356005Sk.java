package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Sk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedEntranceKt$SocialThoughtAggregatedEntrance$1$1", f = "SocialThoughtAggregatedEntrance.kt", l = {207}, m = "invokeSuspend")
public final class C1356005Sk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ List<C1675800ti6> LLILZ;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZIL;
    public final /* synthetic */ List<C1677480tko<Float, C1677280tkU>> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356005Sk(boolean z, List<C1675800ti6> list, C1677480tko<Float, C1677280tkU> c1677480tko, List<C1677480tko<Float, C1677280tkU>> list2, InterfaceC1364105Vn<? super C1356005Sk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = list;
        this.LLILZIL = c1677480tko;
        this.LLILZLL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1356005Sk c1356005Sk = new C1356005Sk(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1356005Sk.LLILLJJLI = obj;
        return c1356005Sk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtAggregatedEntranceKt@9dce.SocialThoughtAggregatedEntrance$1$1");
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
            if (this.LLILLL) {
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1355505Sf(this.LLILZIL, null), 3);
                C1846520y9S c1846520y9SLJIIL = C13LZ.LJIIL(C1697810uHb.LJIIIZ(this.LLILZ));
                List<C1677480tko<Float, C1677280tkU>> list = this.LLILZLL;
                List<C1675800ti6> list2 = this.LLILZ;
                C531650Kt9 it2 = c1846520y9SLJIIL.iterator();
                int i2 = 0;
                while (it2.LLILLL) {
                    int iNextInt = it2.nextInt();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1355805Si(i2, list, iNextInt, list2, null), 3);
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILZIL;
                Float fLIZLLL = C2286608xc.LIZLLL(64.0f);
                C1676890tjr c1676890tjrLIZJ = C1671550tbF.LIZJ(1.0f, 438.65f, null, 4);
                this.LL = 1;
                if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1676890tjrLIZJ, null, null, this, 12) == objLJFF) {
                    C1C7U.LIZIZ("SocialThoughtAggregatedEntranceKt@9dce.SocialThoughtAggregatedEntrance$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtAggregatedEntranceKt@9dce.SocialThoughtAggregatedEntrance$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

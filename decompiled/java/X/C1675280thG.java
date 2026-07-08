package X;

import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0thG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675280thG extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1665500tRU<ThoughtAggregatedModel> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function1<ThoughtAggregatedModel, Unit> LLILZ;
    public final /* synthetic */ Function1<ThoughtAggregatedModel, Unit> LLILZIL;
    public final /* synthetic */ Function1<ThoughtAggregatedModel, Unit> LLILZLL;
    public final /* synthetic */ Function1<ThoughtAggregatedModel, Unit> LLIZ;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLIZLLLIL;
    public final /* synthetic */ Function1<ThoughtAggregatedModel, Unit> LLJ;
    public final /* synthetic */ Function1<Boolean, Unit> LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1675280thG(InterfaceC1665500tRU<ThoughtAggregatedModel> interfaceC1665500tRU, boolean z, Function0<Unit> function0, Function1<? super ThoughtAggregatedModel, Unit> function1, Function1<? super ThoughtAggregatedModel, Unit> function12, Function1<? super ThoughtAggregatedModel, Unit> function13, Function1<? super ThoughtAggregatedModel, Unit> function14, Function1<? super C1378605aS, Unit> function15, Function1<? super ThoughtAggregatedModel, Unit> function16, Function1<? super Boolean, Unit> function17, int i) {
        super(2);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = z;
        this.LLILLL = function0;
        this.LLILZ = function1;
        this.LLILZIL = function12;
        this.LLILZLL = function13;
        this.LLIZ = function14;
        this.LLIZLLLIL = function15;
        this.LLJ = function16;
        this.LLJI = function17;
        this.LLJIJIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1675260thE.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJIJIL | 1));
        return Unit.LIZ;
    }
}

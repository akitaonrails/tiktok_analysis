package X;

import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS287S0000000_4;

/* JADX INFO: renamed from: X.0thF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675270thF extends C09AY implements Function1<C0MAE, Unit> {
    public final /* synthetic */ InterfaceC1665500tRU<ThoughtAggregatedModel> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function1<ThoughtAggregatedModel, Unit> LLILLL;
    public final /* synthetic */ Function1<ThoughtAggregatedModel, Unit> LLILZ;
    public final /* synthetic */ Function1<ThoughtAggregatedModel, Unit> LLILZIL;
    public final /* synthetic */ Function1<ThoughtAggregatedModel, Unit> LLILZLL;
    public final /* synthetic */ Function1<C1378605aS, Unit> LLIZ;
    public final /* synthetic */ Function1<ThoughtAggregatedModel, Unit> LLIZLLLIL;
    public final /* synthetic */ C05P0<Boolean> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1675270thF(InterfaceC1665500tRU<ThoughtAggregatedModel> interfaceC1665500tRU, boolean z, Function1<? super ThoughtAggregatedModel, Unit> function1, Function1<? super ThoughtAggregatedModel, Unit> function12, Function1<? super ThoughtAggregatedModel, Unit> function13, Function1<? super ThoughtAggregatedModel, Unit> function14, Function1<? super C1378605aS, Unit> function15, Function1<? super ThoughtAggregatedModel, Unit> function16, C05P0<Boolean> c05p0) {
        super(1);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = z;
        this.LLILLL = function1;
        this.LLILZ = function12;
        this.LLILZIL = function13;
        this.LLILZLL = function14;
        this.LLIZ = function15;
        this.LLIZLLLIL = function16;
        this.LLJ = c05p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAE c0mae) {
        InterfaceC1665500tRU<ThoughtAggregatedModel> interfaceC1665500tRU = this.LL;
        c0mae.LIZJ(interfaceC1665500tRU.size(), new C020W(AFwS287S0000000_4.get$arr$(18), interfaceC1665500tRU, 60), new C5183020f((List) interfaceC1665500tRU, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 234), new C19719212De(-1091073711, new C1675770ti3(interfaceC1665500tRU, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ), true));
        return Unit.LIZ;
    }
}

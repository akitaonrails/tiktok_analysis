package X;

import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O4J, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM$toggleFavorite$1", f = "TopicRecommendListVM.kt", l = {229}, m = "invokeSuspend")
public final class C0O4J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<C0O7A<? extends C0O3E>> LLILLL;
    public final /* synthetic */ C0O4K LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ TopicRawInfo LLIZ;
    public final /* synthetic */ TopicRecommendListVM LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0O4J(InterfaceC346201Wa<? extends C0O7A<? extends C0O3E>> interfaceC346201Wa, C0O4K c0o4k, String str, C013C c013c, TopicRawInfo topicRawInfo, TopicRecommendListVM topicRecommendListVM, boolean z, InterfaceC1364105Vn<? super C0O4J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = c0o4k;
        this.LLILZIL = str;
        this.LLILZLL = c013c;
        this.LLIZ = topicRawInfo;
        this.LLIZLLLIL = topicRecommendListVM;
        this.LLJ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0O4J c0o4j = new C0O4J(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c0o4j.LLILLJJLI = obj;
        return c0o4j;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopicRecommendListVM@c776.toggleFavorite$1");
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
            final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            InterfaceC346201Wa<C0O7A<? extends C0O3E>> interfaceC346201Wa = this.LLILLL;
            final C0O4K c0o4k = this.LLILZ;
            final String str = this.LLILZIL;
            final C013C c013c = this.LLILZLL;
            final TopicRawInfo topicRawInfo = this.LLIZ;
            final TopicRecommendListVM topicRecommendListVM = this.LLIZLLLIL;
            final boolean z = this.LLJ;
            InterfaceC346701Wf<? super C0O7A<? extends C0O3E>> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0O4I
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
                    C0O7A c0o7a = (C0O7A) obj2;
                    if (c0o7a instanceof C0O79) {
                        if (C0O7F.LIZJ(c0o7a.LIZJ) == EnumC614130O6x.Optimistic) {
                            C1DFH c1dfh = C0PEM.LIZ;
                            Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0O4H(c0o4k, str, c013c, topicRawInfo, null));
                            if (objLJI != C099R.LJFF()) {
                                return Unit.LIZ;
                            }
                            return objLJI;
                        }
                        C1DFH c1dfh2 = C0PEM.LIZ;
                        Object objLJI2 = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0O4F(c013c, topicRawInfo, c0o4k, str, topicRecommendListVM, c0o7a, interfaceC497601wk, null));
                        if (objLJI2 == C099R.LJFF()) {
                            return objLJI2;
                        }
                        return Unit.LIZ;
                    }
                    if (c0o7a instanceof C0O78) {
                        C1DFH c1dfh3 = C0PEM.LIZ;
                        Object objLJI3 = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0O4G(c0o7a, c0o4k, str, z, topicRawInfo, interfaceC497601wk, null));
                        if (objLJI3 == C099R.LJFF()) {
                            return objLJI3;
                        }
                        return Unit.LIZ;
                    }
                    C2296808zG.LIZJ(interfaceC497601wk, null);
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201Wa.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("TopicRecommendListVM@c776.toggleFavorite$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopicRecommendListVM@c776.toggleFavorite$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

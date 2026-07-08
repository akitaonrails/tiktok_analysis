package X;

import Y.AgS7S1210000_9;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM$toggleFavorite$1", f = "MovieDetailVM.kt", l = {132}, m = "invokeSuspend")
public final class C613340O3w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<C0O7A<C613300O3s>> LLILLL;
    public final /* synthetic */ MovieDetailVM LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C613340O3w(InterfaceC346201Wa<? extends C0O7A<C613300O3s>> interfaceC346201Wa, MovieDetailVM movieDetailVM, boolean z, String str, InterfaceC1364105Vn<? super C613340O3w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = movieDetailVM;
        this.LLILZIL = z;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C613340O3w c613340O3w = new C613340O3w(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c613340O3w.LLILLJJLI = obj;
        return c613340O3w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MovieDetailVM@5412.toggleFavorite$1");
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
            InterfaceC346201Wa<C0O7A<C613300O3s>> interfaceC346201Wa = this.LLILLL;
            AgS7S1210000_9 agS7S1210000_9 = new AgS7S1210000_9(interfaceC497601wk, this.LLILZ, this.LLILZIL, this.LLILZLL, 1);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS7S1210000_9, this) == objLJFF) {
                C1C7U.LIZIZ("MovieDetailVM@5412.toggleFavorite$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MovieDetailVM@5412.toggleFavorite$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailApi;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieVideoListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0O3J, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieVideoListVM$onLoadMore$response$1", f = "MovieVideoListVM.kt", l = {109}, m = "invokeSuspend")
public final class C0O3J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0O7A<C0O17>>, Object> {
    public int LL;
    public final /* synthetic */ MovieVideoListVM LLILLJJLI;
    public final /* synthetic */ C0O18 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O3J(MovieVideoListVM movieVideoListVM, C0O18 c0o18, InterfaceC1364105Vn<? super C0O3J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = movieVideoListVM;
        this.LLILLL = c0o18;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O3J(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0O3P c0o3p;
        Object objLJJIJ = obj;
        C1C7U.LIZ("MovieVideoListVM@88f6.onLoadMore$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJJIJ);
            C613290O3r c613290O3r = MovieDetailApi.LIZ;
            MovieVideoListVM movieVideoListVM = this.LLILLJJLI;
            String str = movieVideoListVM.LLILZIL;
            if (str == null) {
                str = null;
            }
            String str2 = this.LLILLL.LIZ;
            boolean z = movieVideoListVM.LLIZLLLIL;
            c613290O3r.getClass();
            C613960O6g c613960O6gLIZIZ = C613940O6e.LIZ().LIZIZ(new C0O3W(str, str2));
            C0O4P<C0O17> value = C613290O3r.LIZLLL.getValue();
            AFwS292S0000000_9 aFwS292S0000000_9 = AFwS292S0000000_9.get$arr$(38);
            AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(645);
            Intrinsics.LJFF(C0O17.class, C0O17.class);
            c613960O6gLIZIZ.LIZ(new C0O8D(new C0O70(value, aFwS292S0000000_9, aFwS240S0000000_9, C0O17.class, C0O17.class)));
            if (z) {
                c0o3p = C613290O3r.LIZJ;
            } else {
                c0o3p = C613290O3r.LIZIZ;
            }
            C0O7F.LIZIZ(c613960O6gLIZIZ, c0o3p);
            InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZIZ.LIZIZ();
            this.LL = 1;
            objLJJIJ = C09IC.LJJIJ(interfaceC346201WaLIZIZ, this);
            if (objLJJIJ == objLJFF) {
                C1C7U.LIZIZ("MovieVideoListVM@88f6.onLoadMore$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MovieVideoListVM@88f6.onLoadMore$response$1");
        return objLJJIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0O7A<C0O17>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

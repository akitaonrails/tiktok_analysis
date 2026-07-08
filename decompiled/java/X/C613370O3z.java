package X;

import Y.AgS290S0100000_9;
import com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailApi;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0O3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM$refreshMovieDetail$1", f = "MovieDetailVM.kt", l = {76}, m = "invokeSuspend")
public final class C613370O3z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MovieDetailVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613370O3z(MovieDetailVM movieDetailVM, InterfaceC1364105Vn<? super C613370O3z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = movieDetailVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613370O3z(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0O3P c0o3p;
        C1C7U.LIZ("MovieDetailVM@5412.refreshMovieDetail$1");
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
            this.LLILLJJLI.setState(AFwS240S0000000_9.get$arr$(941));
            C613290O3r c613290O3r = MovieDetailApi.LIZ;
            String strVQ2 = this.LLILLJJLI.vQ2();
            boolean z = this.LLILLJJLI.LLILLL;
            c613290O3r.getClass();
            C613960O6g c613960O6gLIZIZ = C613940O6e.LIZ().LIZIZ(new C0O40(strVQ2));
            C0O4O value = C613290O3r.LJ.getValue();
            AFwS292S0000000_9 aFwS292S0000000_9 = AFwS292S0000000_9.get$arr$(37);
            AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(644);
            Intrinsics.LJFF(C0O42.class, C0O42.class);
            c613960O6gLIZIZ.LIZ(new C0O8D(new C0O70(value, aFwS292S0000000_9, aFwS240S0000000_9, C0O42.class, C0O42.class)));
            if (z) {
                c0o3p = C613290O3r.LIZJ;
            } else {
                c0o3p = C613290O3r.LIZIZ;
            }
            C0O7F.LIZIZ(c613960O6gLIZIZ, c0o3p);
            InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZIZ.LIZIZ();
            AgS290S0100000_9 agS290S0100000_9 = new AgS290S0100000_9(this.LLILLJJLI, 35);
            this.LL = 1;
            if (interfaceC346201WaLIZIZ.collect(agS290S0100000_9, this) == objLJFF) {
                C1C7U.LIZIZ("MovieDetailVM@5412.refreshMovieDetail$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MovieDetailVM@5412.refreshMovieDetail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

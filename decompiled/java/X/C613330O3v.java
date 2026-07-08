package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM$toggleFavorite$1$1$2", f = "MovieDetailVM.kt", l = {}, m = "invokeSuspend")
public final class C613330O3v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MovieDetailVM LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0O7A<C613300O3s> LLILZ;
    public final /* synthetic */ InterfaceC497601wk LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C613330O3v(MovieDetailVM movieDetailVM, boolean z, String str, C0O7A<C613300O3s> c0o7a, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C613330O3v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = movieDetailVM;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = c0o7a;
        this.LLILZIL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613330O3v(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        BaseResponse baseResponse;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        C1C7U.LIZ("MovieDetailVM@5412.toggleFavorite$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL.getState().LLILLJJLI;
        MovieDetailVM movieDetailVM = this.LL;
        if (z != movieDetailVM.LLILLJJLI) {
            movieDetailVM.LLILLJJLI = movieDetailVM.getState().LLILLJJLI;
            C0O4L.LIZLLL(C0O4K.MOVIE, this.LL.vQ2(), !this.LLILLJJLI);
            MovieDetailVM movieDetailVM2 = this.LL;
            boolean z2 = movieDetailVM2.LLILLJJLI;
            String strVQ2 = movieDetailVM2.vQ2();
            String str4 = this.LLILLL;
            C0O3E c0o3e = (C0O3E) ((C0O79) this.LLILZ).LJ;
            if (z2) {
                str = "favorite_topic";
            } else {
                str = "cancel_favorite_movie";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (z2) {
                str2 = "favorite_from";
            } else {
                str2 = "cancel_from";
            }
            c2344009Gk.LJIIIIZZ(str2, "detail_page");
            c2344009Gk.LJIIIIZZ("movie_id", strVQ2);
            c2344009Gk.LJIIIIZZ("movie_title", str4);
            if ((c0o3e instanceof C613300O3s) && (baseResponse = ((C613300O3s) c0o3e).LIZ) != null && (serverTimeExtra = baseResponse.extra) != null) {
                str3 = serverTimeExtra.logid;
            } else {
                str3 = null;
            }
            LogPbBean logPbBean = new LogPbBean();
            logPbBean.setImprId(str3);
            c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZ(logPbBean));
            c2344009Gk.LJIIIIZZ("category", "movie");
            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        }
        C2296808zG.LIZJ(this.LLILZIL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MovieDetailVM@5412.toggleFavorite$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

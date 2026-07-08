package X;

import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS24S0010000_9;
import njp.a;

/* JADX INFO: renamed from: X.0O47, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM$toggleFavorite$1$1$3", f = "MovieDetailVM.kt", l = {}, m = "invokeSuspend")
public final class C0O47 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MovieDetailVM LL;
    public final /* synthetic */ InterfaceC497601wk LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O47(MovieDetailVM movieDetailVM, InterfaceC497601wk interfaceC497601wk, boolean z, InterfaceC1364105Vn<? super C0O47> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = movieDetailVM;
        this.LLILLJJLI = interfaceC497601wk;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O47(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TopicRawInfo topicRawInfoLIZ;
        C1C7U.LIZ("MovieDetailVM@5412.toggleFavorite$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0O4L.LIZLLL(C0O4K.MOVIE, this.LL.vQ2(), this.LL.LLILLJJLI);
        MovieDetail movieDetailLIZ = this.LL.getState().LL.LIZ();
        if (movieDetailLIZ != null) {
            topicRawInfoLIZ = movieDetailLIZ.LIZ();
        } else {
            topicRawInfoLIZ = null;
        }
        C1440005kM.LIZ(new C613490O4l(topicRawInfoLIZ, this.LL.LLILLJJLI));
        this.LL.setState(new AwS24S0010000_9(this.LLILLL, 13));
        C2296808zG.LIZJ(this.LLILLJJLI, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MovieDetailVM@5412.toggleFavorite$1$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

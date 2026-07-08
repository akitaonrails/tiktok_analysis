package X;

import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O4G, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM$toggleFavorite$1$1$3", f = "TopicRecommendListVM.kt", l = {}, m = "invokeSuspend")
public final class C0O4G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0O7A<? extends C0O3E> LL;
    public final /* synthetic */ C0O4K LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ TopicRawInfo LLILZIL;
    public final /* synthetic */ InterfaceC497601wk LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O4G(C0O7A<? extends C0O3E> c0o7a, C0O4K c0o4k, String str, boolean z, TopicRawInfo topicRawInfo, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0O4G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0o7a;
        this.LLILLJJLI = c0o4k;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = topicRawInfo;
        this.LLILZLL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O4G(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopicRecommendListVM@c776.toggleFavorite$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0O4L.LIZLLL(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        C1440005kM.LIZ(new C613490O4l(this.LLILZIL, this.LLILZ));
        C2296808zG.LIZJ(this.LLILZLL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopicRecommendListVM@c776.toggleFavorite$1$1$3");
        return unit;
    }
}

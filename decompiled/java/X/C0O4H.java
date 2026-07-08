package X;

import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O4H, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM$toggleFavorite$1$1$1", f = "TopicRecommendListVM.kt", l = {}, m = "invokeSuspend")
public final class C0O4H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0O4K LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ TopicRawInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O4H(C0O4K c0o4k, String str, C013C c013c, TopicRawInfo topicRawInfo, InterfaceC1364105Vn<? super C0O4H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0o4k;
        this.LLILLJJLI = str;
        this.LLILLL = c013c;
        this.LLILZ = topicRawInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O4H(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopicRecommendListVM@c776.toggleFavorite$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0O4L.LIZLLL(this.LL, this.LLILLJJLI, !this.LLILLL.element);
        C1440005kM.LIZ(new C613490O4l(this.LLILZ, !this.LLILLL.element));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopicRecommendListVM@c776.toggleFavorite$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

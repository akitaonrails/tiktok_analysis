package X;

import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O4F, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM$toggleFavorite$1$1$2", f = "TopicRecommendListVM.kt", l = {}, m = "invokeSuspend")
public final class C0O4F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ TopicRawInfo LLILLJJLI;
    public final /* synthetic */ C0O4K LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ TopicRecommendListVM LLILZIL;
    public final /* synthetic */ C0O7A<? extends C0O3E> LLILZLL;
    public final /* synthetic */ InterfaceC497601wk LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O4F(C013C c013c, TopicRawInfo topicRawInfo, C0O4K c0o4k, String str, TopicRecommendListVM topicRecommendListVM, C0O7A<? extends C0O3E> c0o7a, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0O4F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c013c;
        this.LLILLJJLI = topicRawInfo;
        this.LLILLL = c0o4k;
        this.LLILZ = str;
        this.LLILZIL = topicRecommendListVM;
        this.LLILZLL = c0o7a;
        this.LLIZ = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O4F(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "TopicRecommendListVM@c776.toggleFavorite$1$1$2"
            X.C1C7U.LIZ(r9)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r11)
            X.013C r0 = r10.LL
            boolean r0 = r0.element
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo r0 = r10.LLILLJJLI
            java.lang.Boolean r0 = r0.isCollected
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r3 = 0
            if (r0 != 0) goto La0
            X.0O4K r2 = r10.LLILLL
            java.lang.String r1 = r10.LLILZ
            X.013C r0 = r10.LL
            boolean r0 = r0.element
            r0 = r0 ^ 1
            X.C0O4L.LIZLLL(r2, r1, r0)
            com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM r2 = r10.LLILZIL
            X.013C r0 = r10.LL
            boolean r0 = r0.element
            r1 = r0 ^ 1
            java.lang.String r8 = r10.LLILZ
            com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo r0 = r10.LLILLJJLI
            java.lang.String r7 = r0.title
            if (r7 != 0) goto L3f
            java.lang.String r7 = ""
        L3f:
            X.0O7A<? extends X.0O3E> r0 = r10.LLILZLL
            X.0O79 r0 = (X.C0O79) r0
            D extends X.0O5h r6 = r0.LJ
            X.0O3E r6 = (X.C0O3E) r6
            X.0O4X r0 = r2.LL
            if (r0 == 0) goto La0
            X.0O4X r0 = r2.vQ2()
            X.0O4X r5 = X.C0O4X.BOOK
            if (r0 != r5) goto La0
            if (r1 == 0) goto Lbd
            java.lang.String r2 = "favorite_topic"
        L57:
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            if (r1 == 0) goto Lba
            java.lang.String r1 = "favorite_from"
        L60:
            java.lang.String r0 = "topic_recommend_page"
            r4.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "book_id"
            r4.LJIIIIZZ(r0, r8)
            java.lang.String r0 = "book_title"
            r4.LJIIIIZZ(r0, r7)
            boolean r0 = r6 instanceof X.C613230O3l
            if (r0 == 0) goto Lab
            X.0O3l r6 = (X.C613230O3l) r6
            com.ss.android.ugc.aweme.base.api.BaseResponse r0 = r6.LIZ
            if (r0 == 0) goto Lb8
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r0.extra
            if (r0 == 0) goto Lb8
            java.lang.String r0 = r0.logid
        L7f:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r1 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r1.<init>()
            r1.setImprId(r0)
            X.0NyV r0 = X.C584850Mwl.LIZ
            java.lang.String r1 = r0.LIZ(r1)
            java.lang.String r0 = "log_pb"
            r4.LJIIIIZZ(r0, r1)
            java.lang.String r1 = r5.getCategory()
            java.lang.String r0 = "category"
            r4.LJIIIIZZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.LIZ
            X.C20684815ws.LJIILLIIL(r2, r0)
        La0:
            X.01wk r0 = r10.LLIZ
            X.C2296808zG.LIZJ(r0, r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        Lab:
            X.0O3m r6 = (X.C613240O3m) r6
            com.ss.android.ugc.aweme.base.api.BaseResponse r0 = r6.LIZ
            if (r0 == 0) goto Lb8
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r0.extra
            if (r0 == 0) goto Lb8
            java.lang.String r0 = r0.logid
            goto L7f
        Lb8:
            r0 = r3
            goto L7f
        Lba:
            java.lang.String r1 = "cancel_from"
            goto L60
        Lbd:
            java.lang.String r2 = "cancel_favorite_book"
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O4F.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

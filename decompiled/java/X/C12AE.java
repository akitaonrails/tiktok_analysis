package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12AE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel$processAweme$1", f = "EffectRecommendationCarouselViewModel.kt", l = {279, 288, 289}, m = "invokeSuspend")
public final class C12AE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ EffectRecommendationCarouselViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12AE(Aweme aweme, EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel, InterfaceC1364105Vn<? super C12AE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = effectRecommendationCarouselViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12AE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0094 A[PHI: r10
      0x0094: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String), (r10v3 java.lang.String) binds: [B:38:0x0091, B:27:0x005e, B:29:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r6 = r19
            java.lang.String r8 = "EffectRecommendationCarouselViewModel@7d94.processAweme$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            r5 = r18
            int r0 = r5.LL
            r3 = 3
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 == r2) goto L34
            if (r0 == r1) goto L98
            if (r0 != r3) goto La9
            X.C155000ia.LIZIZ(r6)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L23:
            X.C155000ia.LIZIZ(r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.LLILLJJLI
            r5.LL = r2
            java.lang.Object r6 = X.C12AG.LIZ(r0, r5)
            if (r6 != r4) goto L37
            X.C1C7U.LIZIZ(r8)
            return r4
        L34:
            X.C155000ia.LIZIZ(r6)
        L37:
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r7 = r6.getFirst()
            com.ss.android.ugc.aweme.recommendationcard.data.CardMaterials r7 = (com.ss.android.ugc.aweme.recommendationcard.data.CardMaterials) r7
            r15 = 0
            if (r7 == 0) goto L78
            com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel r0 = r5.LLILLL
            androidx.lifecycle.MutableLiveData<S> r2 = r0.LLILZIL
            java.lang.Object r9 = r2.getValue()
            X.129t r9 = (X.C197103129t) r9
            if (r9 == 0) goto L96
            com.ss.android.ugc.aweme.recommendationcard.data.FeedEventCardInfo r6 = r7.feedEventCardInfo
            if (r6 == 0) goto L90
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate r0 = r6.feedCardTemplate
            if (r0 == 0) goto L90
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardBackgroundInfo r0 = r0.feedCardBackgroundInfo
            if (r0 == 0) goto L90
            java.lang.String r10 = r0.titleText
        L5c:
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate r0 = r6.feedCardTemplate
            if (r0 == 0) goto L94
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardActionButtonInfo r0 = r0.feedCardActionButtonInfo
            if (r0 == 0) goto L94
            java.lang.String r11 = r0.text
        L66:
            java.util.List<com.ss.android.ugc.aweme.recommendationcard.data.CardContent> r12 = r7.cardContent
            java.lang.String r13 = r7.toString()
            r14 = 0
            r17 = 232(0xe8, float:3.25E-43)
            r16 = r15
            X.129t r0 = X.C197103129t.LIZ(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L75:
            r2.setValue(r0)
        L78:
            com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel r2 = r5.LLILLL
            r5.LL = r1
            r2.getClass()
            X.1DFB r1 = X.C0PEM.LIZJ
            X.09mD r0 = new X.09mD
            r0.<init>(r2, r15)
            java.lang.Object r0 = X.C23250099c.LJI(r5, r1, r0)
            if (r0 != r4) goto L9b
            X.C1C7U.LIZIZ(r8)
            return r4
        L90:
            r10 = r15
            if (r6 == 0) goto L94
            goto L5c
        L94:
            r11 = r15
            goto L66
        L96:
            r0 = r15
            goto L75
        L98:
            X.C155000ia.LIZIZ(r6)
        L9b:
            com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel r0 = r5.LLILLL
            r5.LL = r3
            java.lang.Object r0 = r0.EQ2(r5)
            if (r0 != r4) goto L1d
            X.C1C7U.LIZIZ(r8)
            return r4
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12AE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

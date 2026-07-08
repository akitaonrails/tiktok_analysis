package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12AF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel$processAweme$1", f = "EffectRecommendationCardViewModel.kt", l = {217}, m = "invokeSuspend")
public final class C12AF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ EffectRecommendationCardViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12AF(Aweme aweme, EffectRecommendationCardViewModel effectRecommendationCardViewModel, InterfaceC1364105Vn<? super C12AF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = effectRecommendationCardViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12AF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080 A[PHI: r6
      0x0080: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String), (r6v3 java.lang.String) binds: [B:42:0x007d, B:18:0x0042, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r3 = r16
            java.lang.String r4 = "EffectRecommendationCardViewModel@8ad5.processAweme$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r15.LL
            r1 = 1
            if (r0 == 0) goto L82
            if (r0 != r1) goto L93
            X.C155000ia.LIZIZ(r3)
        L15:
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r2 = r3.getFirst()
            com.ss.android.ugc.aweme.recommendationcard.data.CardMaterials r2 = (com.ss.android.ugc.aweme.recommendationcard.data.CardMaterials) r2
            java.lang.Object r10 = r3.getSecond()
            java.lang.String r10 = (java.lang.String) r10
            if (r2 == 0) goto L74
            com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel r0 = r15.LLILLL
            androidx.lifecycle.MutableLiveData<X.12AJ> r1 = r0.LLIZ
            java.lang.Object r5 = r1.getValue()
            X.12AJ r5 = (X.C12AJ) r5
            r13 = 0
            if (r5 == 0) goto L71
            com.ss.android.ugc.aweme.recommendationcard.data.FeedEventCardInfo r3 = r2.feedEventCardInfo
            if (r3 == 0) goto L7c
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate r0 = r3.feedCardTemplate
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardBackgroundInfo r0 = r0.feedCardBackgroundInfo
            if (r0 == 0) goto L7c
            java.lang.String r6 = r0.titleText
        L40:
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate r0 = r3.feedCardTemplate
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardActionButtonInfo r0 = r0.feedCardActionButtonInfo
            if (r0 == 0) goto L80
            java.lang.String r7 = r0.text
        L4a:
            java.util.List<com.ss.android.ugc.aweme.recommendationcard.data.CardContent> r8 = r2.cardContent
            if (r3 == 0) goto L7a
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate r0 = r3.feedCardTemplate
            if (r0 == 0) goto L7a
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardBackgroundInfo r0 = r0.feedCardBackgroundInfo
            if (r0 == 0) goto L7a
            java.lang.String r9 = r0.bgMusicUrl
        L58:
            java.lang.String r11 = r2.toString()
            com.ss.android.ugc.aweme.recommendationcard.data.FeedEventCardInfo r0 = r2.feedEventCardInfo
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardTemplate r0 = r0.feedCardTemplate
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.recommendationcard.data.FeedCardBackgroundInfo r0 = r0.feedCardBackgroundInfo
            if (r0 == 0) goto L6a
            java.lang.String r13 = r0.bgPictureUrl
        L6a:
            r12 = 0
            r14 = 64
            X.12AJ r13 = X.C12AJ.LIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L71:
            r1.setValue(r13)
        L74:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L7a:
            r9 = r13
            goto L58
        L7c:
            r6 = r13
            if (r3 == 0) goto L80
            goto L40
        L80:
            r7 = r13
            goto L4a
        L82:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r15.LLILLJJLI
            r15.LL = r1
            java.lang.Object r3 = X.C12AG.LIZ(r0, r15)
            if (r3 != r2) goto L15
            X.C1C7U.LIZIZ(r4)
            return r2
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12AF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

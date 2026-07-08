package X;

import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09mE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel$startAutoRotation$1", f = "EffectRecommendationCarouselViewModel.kt", l = {315}, m = "invokeSuspend")
public final class C2470809mE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectRecommendationCarouselViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470809mE(EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel, InterfaceC1364105Vn<? super C2470809mE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectRecommendationCarouselViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2470809mE(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.String r5 = "EffectRecommendationCarouselViewModel@7d94.startAutoRotation$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r15.LL
            r2 = 1
            if (r0 == 0) goto L80
            if (r0 != r2) goto L91
            X.C155000ia.LIZIZ(r16)
        L13:
            com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel r0 = r15.LLILLJJLI
            androidx.lifecycle.MutableLiveData<S> r0 = r0.LLILZIL
            java.lang.Object r0 = r0.getValue()
            X.129t r0 = (X.C197103129t) r0
            if (r0 == 0) goto L59
            com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel r1 = r15.LLILLJJLI
            java.lang.Integer r4 = r0.LJI
            r3 = 2
            if (r4 == 0) goto L6f
            int r0 = r4.intValue()
            if (r0 != 0) goto L61
            android.app.Application r0 = X.C0CHQ.LIZ
            boolean r0 = X.C444960Hcc.LIZJ(r0)
            if (r0 == 0) goto L35
        L34:
            r2 = 2
        L35:
            androidx.lifecycle.MutableLiveData<S> r3 = r1.LLILZIL
            java.lang.Object r6 = r3.getValue()
            X.129t r6 = (X.C197103129t) r6
            if (r6 == 0) goto L5f
            r7 = 0
            r11 = 0
            java.lang.Integer r12 = X.C2286608xc.LJ(r2)
            java.lang.Integer r0 = X.C2286608xc.LJ(r2)
            android.graphics.drawable.Drawable r13 = r1.BQ2(r0)
            r14 = 63
            r8 = r7
            r9 = r7
            r10 = r7
            X.129t r0 = X.C197103129t.LIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L56:
            r3.setValue(r0)
        L59:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L5f:
            r0 = 0
            goto L56
        L61:
            int r0 = r4.intValue()
            if (r0 != r2) goto L71
            android.app.Application r0 = X.C0CHQ.LIZ
            boolean r0 = X.C444960Hcc.LIZJ(r0)
            if (r0 == 0) goto L34
        L6f:
            r2 = 0
            goto L35
        L71:
            int r0 = r4.intValue()
            if (r0 != r3) goto L6f
            android.app.Application r0 = X.C0CHQ.LIZ
            boolean r0 = X.C444960Hcc.LIZJ(r0)
            if (r0 == 0) goto L6f
            goto L35
        L80:
            X.C155000ia.LIZIZ(r16)
            r15.LL = r2
            r0 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r15)
            if (r0 != r3) goto L13
            X.C1C7U.LIZIZ(r5)
            return r3
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2470809mE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixJSBAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qhi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixJSBAbility$handleSearchPromotionInterface$1", f = "MixJSBAbility.kt", l = {242}, m = "invokeSuspend")
public final class C677440Qhi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1422405hW LL;
    public C013C LLILLJJLI;
    public MixJSBAbility LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C678140Qiq LLILZLL;
    public final /* synthetic */ n LLIZ;
    public final /* synthetic */ MixShopSearchBizVM LLIZLLLIL;
    public final /* synthetic */ MixJSBAbility LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677440Qhi(C678140Qiq c678140Qiq, n nVar, MixShopSearchBizVM mixShopSearchBizVM, MixJSBAbility mixJSBAbility, InterfaceC1364105Vn<? super C677440Qhi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c678140Qiq;
        this.LLIZ = nVar;
        this.LLIZLLLIL = mixShopSearchBizVM;
        this.LLJ = mixJSBAbility;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C677440Qhi(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:6:0x001f). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r9 = "MixJSBAbility@c493.handleSearchPromotionInterface$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r10.LLILZIL
            r5 = 0
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L4b
            if (r0 != r4) goto L9b
            java.lang.Object r8 = r10.LLILZ
            java.util.Iterator r8 = (java.util.Iterator) r8
            com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixJSBAbility r0 = r10.LLILLL
            X.013C r7 = r10.LLILLJJLI
            X.05hW r2 = r10.LL
            X.C155000ia.LIZIZ(r11)
        L1f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r1 = r11.booleanValue()
            if (r1 == 0) goto L29
            r7.element = r5
        L29:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r8.next()
            X.0QiM r1 = (X.AbstractC677840QiM) r1
            if (r1 == 0) goto L29
            r10.LL = r2
            r10.LLILLJJLI = r7
            r10.LLILLL = r0
            r10.LLILZ = r8
            r10.LLILZIL = r4
            java.lang.Object r11 = r0.LIZIZ(r1, r10)
            if (r11 != r6) goto L1f
            X.C1C7U.LIZIZ(r9)
            return r6
        L4b:
            X.C155000ia.LIZIZ(r11)
            X.0Qiq r0 = r10.LLILZLL
            if (r0 == 0) goto L99
            com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel r0 = r0.LJIIL
            if (r0 == 0) goto L99
            X.05dM r0 = r0.LLILZ
            if (r0 == 0) goto L99
            X.0Qhs r2 = r0.LJ
            if (r2 == 0) goto L99
            com.google.gson.n r1 = r10.LLIZ
            X.0QeD r0 = new X.0QeD
            r0.<init>(r5)
            X.05hW r2 = r2.LIZIZ(r1, r0)
            if (r2 == 0) goto L76
            com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM r0 = r10.LLIZLLLIL
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData<X.05hW> r0 = r0.LLJJI
            if (r0 == 0) goto L76
            r0.postValue(r2)
        L76:
            X.013C r7 = new X.013C
            r7.<init>()
            if (r2 == 0) goto L97
            java.util.List<X.05dX> r0 = r2.LIZJ
            if (r0 == 0) goto L97
            int r0 = r0.size()
            if (r0 <= 0) goto L97
            r0 = 1
        L88:
            r7.element = r0
            if (r2 == 0) goto La3
            java.util.List<? extends X.0QiM> r1 = r2.LIZIZ
            if (r1 == 0) goto La3
            com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixJSBAbility r0 = r10.LLJ
            java.util.Iterator r8 = r1.iterator()
            goto L29
        L97:
            r0 = 0
            goto L88
        L99:
            r2 = r3
            goto L76
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La3:
            boolean r0 = r7.element
            if (r0 == 0) goto Lb3
            if (r2 == 0) goto Lb3
            X.0Qhj r1 = new X.0Qhj
            X.0Qiq r0 = r10.LLILZLL
            r1.<init>(r0, r2, r3)
            X.C23250099c.LJFF(r1)
        Lb3:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C677440Qhi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

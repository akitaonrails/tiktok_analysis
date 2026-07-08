package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qhq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixRefreshRepo$doWorkPrivate$5$4$onNext$3$7", f = "BaseMixRefreshRepo.kt", l = {730, 818}, m = "invokeSuspend")
public final class C677520Qhq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC677500Qho LLILLJJLI;
    public final /* synthetic */ n LLILLL;
    public final /* synthetic */ C1422405hW LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C675150Qe1 LLILZLL;
    public final /* synthetic */ MixPageViewModel LLIZ;
    public final /* synthetic */ C118300cf LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ long LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677520Qhq(AbstractC677500Qho abstractC677500Qho, n nVar, C1422405hW c1422405hW, String str, C675150Qe1 c675150Qe1, MixPageViewModel mixPageViewModel, C118300cf c118300cf, long j, long j2, InterfaceC1364105Vn<? super C677520Qhq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC677500Qho;
        this.LLILLL = nVar;
        this.LLILZ = c1422405hW;
        this.LLILZIL = str;
        this.LLILZLL = c675150Qe1;
        this.LLIZ = mixPageViewModel;
        this.LLIZLLLIL = c118300cf;
        this.LLJ = j;
        this.LLJI = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C677520Qhq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cb A[PHI: r2
      0x01cb: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v6 java.lang.String), (r2v6 java.lang.String) binds: [B:95:0x01c7, B:55:0x0101, B:57:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C677520Qhq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

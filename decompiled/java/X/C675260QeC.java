package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QeC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixLoadMoreRepo$request$2", f = "BaseMixLoadMoreRepo.kt", l = {145}, m = "invokeSuspend")
public final class C675260QeC extends C09AX implements Function2<InterfaceC346701Wf<? super AbstractC677910QiT<? extends C1422405hW>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C675270QeD LLILLL;
    public final /* synthetic */ AbstractC677510Qhp LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ C677540Qhs LLILZLL;
    public final /* synthetic */ MixPageViewModel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C675260QeC(Context context, C677540Qhs c677540Qhs, MixPageViewModel mixPageViewModel, C675270QeD c675270QeD, AbstractC677510Qhp abstractC677510Qhp, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c675270QeD;
        this.LLILZ = abstractC677510Qhp;
        this.LLILZIL = context;
        this.LLILZLL = c677540Qhs;
        this.LLIZ = mixPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C675260QeC c675260QeC = new C675260QeC(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c675260QeC.LLILLJJLI = obj;
        return c675260QeC;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C675260QeC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super AbstractC677910QiT<? extends C1422405hW>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

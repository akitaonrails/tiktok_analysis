package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.selection.SelectMediaInterceptorChainKt$interceptList$1$deferred$1$1", f = "SelectMediaInterceptorChain.kt", l = {132}, m = "invokeSuspend")
public final class C1404505ed extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C529330KpP LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ TikTokMediaModel LLILZ;
    public final /* synthetic */ C0L90 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1404505ed(C529330KpP c529330KpP, Context context, TikTokMediaModel tikTokMediaModel, C0L90 c0l90, InterfaceC1364105Vn<? super C1404505ed> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c529330KpP;
        this.LLILLL = context;
        this.LLILZ = tikTokMediaModel;
        this.LLILZIL = c0l90;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1404505ed(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectMediaInterceptorChainKt@2694.interceptList$1$deferred$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C529330KpP c529330KpP = this.LLILLJJLI;
            Context context = this.LLILLL;
            TikTokMediaModel tikTokMediaModel = this.LLILZ;
            C0L90 c0l90 = this.LLILZIL;
            this.LL = 1;
            obj = c529330KpP.LIZIZ(c529330KpP.LIZ, context, tikTokMediaModel, c0l90, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SelectMediaInterceptorChainKt@2694.interceptList$1$deferred$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SelectMediaInterceptorChainKt@2694.interceptList$1$deferred$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

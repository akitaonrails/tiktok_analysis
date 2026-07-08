package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.selection.SelectMediaInterceptorChain$doIntercept$2", f = "SelectMediaInterceptorChain.kt", l = {}, m = "invokeSuspend")
public final class C529310KpN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC529320KpO<InterfaceC529290KpL> LL;
    public final /* synthetic */ InterfaceC529270KpJ<InterfaceC529290KpL> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ TikTokMediaModel LLILZ;
    public final /* synthetic */ C0L90 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C529310KpN(InterfaceC529320KpO<InterfaceC529290KpL> interfaceC529320KpO, InterfaceC529270KpJ<? extends InterfaceC529290KpL> interfaceC529270KpJ, Context context, TikTokMediaModel tikTokMediaModel, C0L90 c0l90, InterfaceC1364105Vn<? super C529310KpN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC529320KpO;
        this.LLILLJJLI = interfaceC529270KpJ;
        this.LLILLL = context;
        this.LLILZ = tikTokMediaModel;
        this.LLILZIL = c0l90;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C529310KpN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectMediaInterceptorChain@b2b7.doIntercept$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ((InterfaceC529290KpL) this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SelectMediaInterceptorChain@b2b7.doIntercept$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

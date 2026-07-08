package X;

import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.model.RecentCelebrationResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationRepo$preloadCelebrationAndMaterial$task$1$storeCelebrationTask$1", f = "CelebrationRepo.kt", l = {}, m = "invokeSuspend")
public final class C568010MPn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C568040MPq LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ RecentCelebrationResponse LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C568010MPn(C568040MPq c568040MPq, String str, RecentCelebrationResponse recentCelebrationResponse, InterfaceC1364105Vn<? super C568010MPn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c568040MPq;
        this.LLILLJJLI = str;
        this.LLILLL = recentCelebrationResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C568010MPn(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CelebrationRepo@2cdd.preloadCelebrationAndMaterial$task$1$storeCelebrationTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJII(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CelebrationRepo@2cdd.preloadCelebrationAndMaterial$task$1$storeCelebrationTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

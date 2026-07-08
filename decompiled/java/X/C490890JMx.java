package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.controller.PcsVideoPlayerViewController$getOnUIPlayListener$1$onRenderFirstFrame$1", f = "PcsVideoPlayerViewController.kt", l = {}, m = "invokeSuspend")
public final class C490890JMx extends C09AX implements Function2<C0N0Y, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C490890JMx(InterfaceC1364105Vn<? super C490890JMx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C490890JMx c490890JMx = new C490890JMx(interfaceC1364105Vn);
        c490890JMx.LL = obj;
        return c490890JMx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsVideoPlayerViewController@65f8.getOnUIPlayListener$1$onRenderFirstFrame$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C0N0Y) this.LL).LJJIIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoPlayerViewController@65f8.getOnUIPlayListener$1$onRenderFirstFrame$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0N0Y c0n0y, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0n0y, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

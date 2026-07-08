package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0JNU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.PcsVideoPlayerView$onRenderFirstFrame$1$1", f = "PcsVideoPlayerView.kt", l = {}, m = "invokeSuspend")
public final class C0JNU extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0JO7 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JNU(C0JO7 c0jo7, InterfaceC1364105Vn<? super C0JNU> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c0jo7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JNU(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsVideoPlayerView@8926.onRenderFirstFrame$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getPlayerChannel().LIZJ.setValue(C2286608xc.LIZLLL(0.0f));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoPlayerView@8926.onRenderFirstFrame$1$1");
        return unit;
    }
}

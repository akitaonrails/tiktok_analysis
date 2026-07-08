package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayLandscapeLayout$initView$5$1", f = "PlayerOverlayLandscapeLayout.kt", l = {}, m = "invokeSuspend")
public final class C491000JNi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C490990JNh LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491000JNi(C490990JNh c490990JNh, InterfaceC1364105Vn<? super C491000JNi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c490990JNh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C491000JNi(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayerOverlayLandscapeLayout@1994.initView$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C490990JNh c490990JNh = this.LL;
        C09AE c09ae = c490990JNh.LLJJIJIIJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        c490990JNh.LLJJIJIIJIL = c490990JNh.getMinimiseOverlayUIJob();
        this.LL.getPlayerChannel().LJ.setValue(new C0JNF(!this.LL.getPlayerChannel().LJ.getValue().LIZ, true));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerOverlayLandscapeLayout@1994.initView$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

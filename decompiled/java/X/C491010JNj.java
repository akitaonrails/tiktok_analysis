package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0JNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayLandscapeLayout$initObserver$1$3$1$1", f = "PlayerOverlayLandscapeLayout.kt", l = {}, m = "invokeSuspend")
public final class C491010JNj extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C490990JNh LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491010JNj(C490990JNh c490990JNh, float f, InterfaceC1364105Vn<? super C491010JNj> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c490990JNh;
        this.LLILLJJLI = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C491010JNj(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayerOverlayLandscapeLayout@1994.initObserver$1$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.getPlayerChannel().LJII.getValue().booleanValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PlayerOverlayLandscapeLayout@1994.initObserver$1$3$1$1");
            return unit;
        }
        this.LL.setCurrentTimeSecondaryText(C0JO6.LIZ((int) ((this.LLILLJJLI / 100.0f) * (r2.getPlayerChannel().LIZIZ() / LSPassThroughRecordSizeConfig.DEFAULT))));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PlayerOverlayLandscapeLayout@1994.initObserver$1$3$1$1");
        return unit2;
    }
}

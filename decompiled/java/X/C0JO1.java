package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0JO1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.view.PcsVideoSeekbarView$tryMinimizeSeekbar$1$1", f = "PcsVideoSeekbarView.kt", l = {}, m = "invokeSuspend")
public final class C0JO1 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C491160JNy LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JO1(C491160JNy c491160JNy, InterfaceC1364105Vn<? super C0JO1> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c491160JNy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JO1(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsVideoSeekbarView@3e6a.tryMinimizeSeekbar$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C12P2 seekBar = this.LL.getSeekBar();
        if (seekBar != null) {
            seekBar.setSeekBarShowType(this.LL.LLJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsVideoSeekbarView@3e6a.tryMinimizeSeekbar$1$1");
        return unit;
    }
}

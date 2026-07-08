package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L26, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.navigation.StoryCanvasPrepareTask$process$2", f = "SocCreativeInternalLauncher.kt", l = {}, m = "invokeSuspend")
public final class C0L26 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0L24 LL;
    public final /* synthetic */ CanvasVideoData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L26(C0L24 c0l24, CanvasVideoData canvasVideoData, InterfaceC1364105Vn<? super C0L26> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0l24;
        this.LLILLJJLI = canvasVideoData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L26(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryCanvasPrepareTask@3797.process$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0L24 c0l24 = this.LL;
        c0l24.LJ.LIZIZ(c0l24.LIZIZ, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryCanvasPrepareTask@3797.process$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

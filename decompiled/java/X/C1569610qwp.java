package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.StripMusicPreviewScene$initObserver$9$onStopTrackingTouch$timeoutJob$1", f = "StripMusicPreviewScene.kt", l = {177}, m = "invokeSuspend")
public final class C1569610qwp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C12DF LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1569610qwp(C12DF c12df, InterfaceC1364105Vn<? super C1569610qwp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c12df;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1569610qwp(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StripMusicPreviewScene@827f.initObserver$9$onStopTrackingTouch$timeoutJob$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("StripMusicPreviewScene@827f.initObserver$9$onStopTrackingTouch$timeoutJob$1");
                return objLJFF;
            }
        }
        C12DF c12df = this.LLILLJJLI;
        c12df.LLLFF = false;
        C337180DJs.LIZ(c12df.LLJLLIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StripMusicPreviewScene@827f.initObserver$9$onStopTrackingTouch$timeoutJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

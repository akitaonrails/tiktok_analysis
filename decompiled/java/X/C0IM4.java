package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IM4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.helper.LiveEasierExitInnerFeedManagerV2$getRealExitInfo$1$onResult$1", f = "LiveEasierExitInnerFeedManagerV2.kt", l = {}, m = "invokeSuspend")
public final class C0IM4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0IHG LL;
    public final /* synthetic */ C0ITZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IM4(C0IHG c0ihg, C0ITZ c0itz, InterfaceC1364105Vn<? super C0IM4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ihg;
        this.LLILLJJLI = c0itz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IM4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEasierExitInnerFeedManagerV2@5787.getRealExitInfo$1$onResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0IHG c0ihg = this.LL;
        if (c0ihg != null) {
            ((C0IHF) c0ihg).LIZ(this.LLILLJJLI.LIZLLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveEasierExitInnerFeedManagerV2@5787.getRealExitInfo$1$onResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

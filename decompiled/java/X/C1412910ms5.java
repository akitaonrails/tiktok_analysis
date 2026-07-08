package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS72S1000000_22;
import njp.a;

/* JADX INFO: renamed from: X.0ms5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.VideoMixEditingMaterialComponent$removeCanCancelledItem$1", f = "VideoMixEditingMaterialComponent.kt", l = {}, m = "invokeSuspend")
public final class C1412910ms5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1413530mt5 LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412910ms5(C1413530mt5 c1413530mt5, String str, InterfaceC1364105Vn<? super C1412910ms5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1413530mt5;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1412910ms5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoMixEditingMaterialComponent@1cfb.removeCanCancelledItem$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1414450muZ.LJFF(this.LL.LLLIIIIL, new AwS72S1000000_22(this.LLILLJJLI, 8));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoMixEditingMaterialComponent@1cfb.removeCanCancelledItem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

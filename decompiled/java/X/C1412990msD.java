package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0msD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.VideoMixEditingMaterialComponent$show$6", f = "VideoMixEditingMaterialComponent.kt", l = {}, m = "invokeSuspend")
public final class C1412990msD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1413530mt5 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1413010msF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412990msD(C1413530mt5 c1413530mt5, boolean z, C1413010msF c1413010msF, InterfaceC1364105Vn<? super C1412990msD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1413530mt5;
        this.LLILLJJLI = z;
        this.LLILLL = c1413010msF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1412990msD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoMixEditingMaterialComponent@1cfb.show$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.u6(this.LLILLJJLI, this.LLILLL.LIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoMixEditingMaterialComponent@1cfb.show$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

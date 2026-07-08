package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS619S0100000_5;
import njp.a;

/* JADX INFO: renamed from: X.0Etw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.edittext.EPAIGCEditTextComponent$generateRequest$2$1", f = "EPAIGCEditTextComponent.kt", l = {}, m = "invokeSuspend")
public final class C379260Etw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C382830Ezh LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C379260Etw(C382830Ezh c382830Ezh, InterfaceC1364105Vn<? super C379260Etw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c382830Ezh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C379260Etw(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPAIGCEditTextComponent@14a5.generateRequest$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.v5().fe1(EnumC379010EtX.GENERATE_CLICKED, new AwS619S0100000_5(this.LL, 9));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPAIGCEditTextComponent@14a5.generateRequest$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

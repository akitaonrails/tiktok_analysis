package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS265S0000000_25;
import njp.a;

/* JADX INFO: renamed from: X.0sPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.util.SkipAIGCLoadComponent$onCreate$5$1", f = "SkipAIGCLoadComponent.kt", l = {}, m = "invokeSuspend")
public final class C1626090sPv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1625020sOC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626090sPv(C1625020sOC c1625020sOC, InterfaceC1364105Vn<? super C1626090sPv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1625020sOC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626090sPv(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkipAIGCLoadComponent@d3a7.onCreate$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.getRecordControlApi().isRecording().LIZJ().booleanValue()) {
            if (C1631200sYA.LIZ(this.LL.o2())) {
                C1625020sOC c1625020sOC = this.LL;
                if (c1625020sOC.getDiContainer().LIZJ(InterfaceC1630630sXF.class)) {
                    c1625020sOC.whenReadyOrThrowInternal(c1625020sOC.getDiContainer(), InterfaceC1630630sXF.class, new AwS265S0000000_25(18));
                }
            } else {
                InterfaceC1630630sXF interfaceC1630630sXFW2 = this.LL.w2();
                if (interfaceC1630630sXFW2 != null) {
                    interfaceC1630630sXFW2.lZ0(AFwS266S0000000_25.get$arr$(309));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkipAIGCLoadComponent@d3a7.onCreate$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

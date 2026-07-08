package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01X7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.pov.PovTask$requestPovData$1$1$1", f = "PovTaskManager.kt", l = {}, m = "invokeSuspend")
public final class C01X7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1421450n5r LL;
    public final /* synthetic */ Function1<Integer, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01X7(C1421450n5r c1421450n5r, Function1<? super Integer, Unit> function1, InterfaceC1364105Vn<? super C01X7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1421450n5r;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01X7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PovTask@b799.requestPovData$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.LIZJ) {
            this.LLILLJJLI.invoke(C2286608xc.LJ(0));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PovTask@b799.requestPovData$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

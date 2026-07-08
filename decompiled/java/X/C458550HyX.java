package X;

import Y.AgS287S0100000_6;
import android.widget.TextSwitcher;
import com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordTipAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordTipAssem$onActualViewCreated$2", f = "RecordTipAssem.kt", l = {80}, m = "invokeSuspend")
public final class C458550HyX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecordTipAssem LLILLJJLI;
    public final /* synthetic */ TextSwitcher LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458550HyX(RecordTipAssem recordTipAssem, TextSwitcher textSwitcher, InterfaceC1364105Vn<? super C458550HyX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recordTipAssem;
        this.LLILLL = textSwitcher;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C458550HyX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordTipAssem@3f7d.onActualViewCreated$2");
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
            RecordTipAssem recordTipAssem = this.LLILLJJLI;
            recordTipAssem.getClass();
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C463000IDq(C459000HzG.LIZIZ(recordTipAssem), 52));
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 163);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("RecordTipAssem@3f7d.onActualViewCreated$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordTipAssem@3f7d.onActualViewCreated$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

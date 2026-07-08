package X;

import com.ss.android.ugc.tools.chat.message.cell.regeneratecell.RegenerateAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.cell.regeneratecell.RegenerateAssem$observeState$1", f = "RegenerateAssem.kt", l = {}, m = "invokeSuspend")
public final class C446460Hf2 extends C09AX implements Function2<C189200o6<? extends Unit>, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RegenerateAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C446460Hf2(RegenerateAssem regenerateAssem, InterfaceC1364105Vn<? super C446460Hf2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = regenerateAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C446460Hf2(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RegenerateAssem@34fe.observeState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C197039127h c197039127hUp = this.LL.up();
        if (c197039127hUp != null) {
            c197039127hUp.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_clockwise));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RegenerateAssem@34fe.observeState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C189200o6<? extends Unit> c189200o6, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(C189200o6.m1boximpl(c189200o6.m10unboximpl()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

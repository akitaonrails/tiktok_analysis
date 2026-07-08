package X;

import com.ss.android.ugc.tools.chat.message.cell.aigenimagecell.AIGenImageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.cell.aigenimagecell.AIGenImageAssem$observeSaveState$1", f = "AIGenImageAssem.kt", l = {}, m = "invokeSuspend")
public final class C342410Dbb extends C09AX implements Function2<InterfaceC1157570gEF<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIGenImageAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C342410Dbb(AIGenImageAssem aIGenImageAssem, InterfaceC1364105Vn<? super C342410Dbb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGenImageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C342410Dbb c342410Dbb = new C342410Dbb(this.LLILLJJLI, interfaceC1364105Vn);
        c342410Dbb.LL = obj;
        return c342410Dbb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGenImageAssem@f8f0.observeSaveState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL instanceof C1157580gEG) {
            this.LLILLJJLI.Ap(true);
        } else {
            this.LLILLJJLI.Ap(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGenImageAssem@f8f0.observeSaveState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1157570gEF<? extends String> interfaceC1157570gEF, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1157570gEF, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

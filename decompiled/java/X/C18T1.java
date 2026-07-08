package X;

import android.view.View;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.tools.chat.message.cell.genereatingcell.AIGeneratingAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18T1, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.cell.genereatingcell.AIGeneratingAssem$onBindItem$1$1$1", f = "AIGeneratingAssem.kt", l = {}, m = "invokeSuspend")
public final class C18T1 extends C09AX implements Function2<C189200o6<? extends Unit>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AIGeneratingAssem LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18T1(AIGeneratingAssem aIGeneratingAssem, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C18T1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aIGeneratingAssem;
        this.LLILLL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C18T1 c18t1 = new C18T1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c18t1.LL = obj;
        return c18t1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGeneratingAssem@7ad9.onBindItem$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object objM10unboximpl = ((C189200o6) this.LL).m10unboximpl();
        C18UP c18up = C18UP.LIZ;
        C18UJ c18uj = (C18UJ) this.LLILLJJLI.LLLF.getValue();
        AIChatGenNode aIChatGenNodeLIZLLL = C18UO.LIZLLL(this.LLILLL);
        long createdAt = this.LLILLL.getCreatedAt();
        c18up.getClass();
        C18UP.LJI(createdAt, aIChatGenNodeLIZLLL, c18uj, "cancel");
        if (C189200o6.m7isFailureimpl(objM10unboximpl)) {
            C1389890mGx c1389890mGx = new C1389890mGx((View) this.LLILLJJLI.LLJZ.getValue());
            c1389890mGx.LJIIIZ(2131849939);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGeneratingAssem@7ad9.onBindItem$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C189200o6<? extends Unit> c189200o6, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(C189200o6.m1boximpl(c189200o6.m10unboximpl()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

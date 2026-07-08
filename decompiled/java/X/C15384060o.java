package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS368S0200000_2;
import njp.a;

/* JADX INFO: renamed from: X.060o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.chore.SmartReplyGeckoHelper$getGeckoResource$3", f = "SmartReplyGeckoHelper.kt", l = {}, m = "invokeSuspend")
public final class C15384060o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15386060q LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15384060o(C15386060q c15386060q, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C15384060o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15386060q;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15384060o(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartReplyGeckoHelper@f0e7.getGeckoResource$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06I1 c06i1 = C06I1.LIZIZ;
        C15386060q c15386060q = this.LL;
        Function1<String, Unit> function1 = this.LLILLJJLI;
        c06i1.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        c15386060q.getClass();
        sbLIZ.append("create_bot_progress_anim");
        sbLIZ.append('/');
        sbLIZ.append(c15386060q.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str = (String) C15385060p.LIZ.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append('/');
        sbLIZ2.append(c15386060q.LIZ);
        sbLIZ2.append('/');
        sbLIZ2.append(strLIZIZ);
        C06I1.LIZIZ(c15386060q.LIZ, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), new AwS368S0200000_2(c15386060q, function1, 90));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartReplyGeckoHelper@f0e7.getGeckoResource$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

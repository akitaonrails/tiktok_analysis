package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06EQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.view.panel.StreakPetLynxPanel$open$2$onSuccess$1$1", f = "StreakPetLynxPanel.kt", l = {}, m = "invokeSuspend")
public final class C06EQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C06EK LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06EQ(C06EK c06ek, String str, InterfaceC1364105Vn<? super C06EQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c06ek;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06EQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetLynxPanel@7dcd.open$2$onSuccess$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1541990qEH interfaceC1541990qEH = this.LL.LJIIJ;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.d1(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetLynxPanel@7dcd.open$2$onSuccess$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

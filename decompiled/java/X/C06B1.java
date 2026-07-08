package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06B1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.triggers.StreakGroupInlineTrigger$tryInsertEndInlineMsgWithCoroutine$1", f = "StreakGroupInlineTrigger.kt", l = {}, m = "invokeSuspend")
public final class C06B1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ C06B4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06B1(int i, List<String> list, C06B4 c06b4, InterfaceC1364105Vn<? super C06B1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = list;
        this.LLILLL = c06b4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06B1(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakGroupInlineTrigger@b501.tryInsertEndInlineMsgWithCoroutine$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1564306An c1564306An = C1564306An.LIZ;
        int i = this.LL;
        List<String> list = this.LLILLJJLI;
        C06B2 c06b2 = new C06B2(this.LLILLL);
        c1564306An.getClass();
        C1564306An.LIZJ(list, i, c06b2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakGroupInlineTrigger@b501.tryInsertEndInlineMsgWithCoroutine$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

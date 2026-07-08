package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09mL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.PhotoMvGoNextImpl$startGoNext$4", f = "PhotoMvGoNextImpl.kt", l = {}, m = "invokeSuspend")
public final class C2471509mL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C573020Mdg LL;
    public final /* synthetic */ ArrayList<String> LLILLJJLI;
    public final /* synthetic */ C573110Mdp LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2471509mL(C573020Mdg c573020Mdg, ArrayList<String> arrayList, C573110Mdp c573110Mdp, InterfaceC1364105Vn<? super C2471509mL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c573020Mdg;
        this.LLILLJJLI = arrayList;
        this.LLILLL = c573110Mdp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2471509mL(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoMvGoNextImpl@10f4.startGoNext$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJI(this.LLILLL.LIZ, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoMvGoNextImpl@10f4.startGoNext$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

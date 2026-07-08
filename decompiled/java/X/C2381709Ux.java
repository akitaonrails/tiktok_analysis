package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09Ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2381709Ux extends C09AY implements InterfaceC1631630sYr<List<? extends Effect>, Boolean, Integer, Integer, Unit> {
    public final /* synthetic */ C113E LL;
    public final /* synthetic */ Function2<List<? extends Effect>, Integer, Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2381709Ux(C113E c113e, Function2<? super List<? extends Effect>, ? super Integer, Unit> function2, Function0<Unit> function0) {
        super(4);
        this.LL = c113e;
        this.LLILLJJLI = function2;
        this.LLILLL = function0;
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Effect> list, Boolean bool, Integer num, Integer num2) {
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C1749280vcc c1749280vcc = this.LL.LLJJJ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 8);
        if (list != null) {
            C113E c113e = this.LL;
            c113e.LLLIIII = zBooleanValue;
            if (c113e.LLIZLLLIL.mActivity != null) {
                this.LLILLJJLI.invoke(list, Integer.valueOf(c113e.LLLI));
            }
            C113E c113e2 = this.LL;
            c113e2.LLLI = iIntValue;
            c113e2.LLLII = iIntValue2;
        } else {
            this.LLILLL.invoke();
        }
        return Unit.LIZ;
    }
}

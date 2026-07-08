package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492640JTq extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C127K LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492640JTq(C127K c127k) {
        super(1);
        this.LL = c127k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        C127M accessory;
        String strLJIJI;
        bool.booleanValue();
        C127K c127k = this.LL;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C11G4) {
            C11G4 c11g4 = (C11G4) this.LL.getAccessory();
            if (C494680Jac.LJFF()) {
                strLJIJI = C497740JfY.LJIJI(2131844231);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131844230);
            }
            c11g4.LJIILJJIL(strLJIJI);
            c11g4.LJIILLIIL(true);
        }
        return Unit.LIZ;
    }
}

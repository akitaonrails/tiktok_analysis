package X;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0EwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380850EwV extends C09AY implements Function2<C380780EwO, Boolean, Unit> {
    public final /* synthetic */ C380820EwS LL;
    public final /* synthetic */ C380780EwO LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380850EwV(C380820EwS c380820EwS, C380780EwO c380780EwO, long j, Function0<Unit> function0) {
        super(2);
        this.LL = c380820EwS;
        this.LLILLJJLI = c380780EwO;
        this.LLILLL = j;
        this.LLILZ = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C380780EwO c380780EwO, Boolean bool) {
        C380780EwO c380780EwO2 = c380780EwO;
        boolean zBooleanValue = bool.booleanValue();
        if (this.LL.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            if (this.LLILLJJLI.LJI) {
                this.LL.i3(AFwS234S0000000_5.get$arr$(247));
                this.LL.LIZLLL();
                InterfaceC373570Ekl interfaceC373570EklP4 = this.LL.P4();
                if (interfaceC373570EklP4 != null) {
                    C380780EwO c380780EwO3 = this.LLILLJJLI;
                    interfaceC373570EklP4.CD0(c380780EwO3.LIZJ, c380780EwO3.LJIIJ);
                }
                InterfaceC373570Ekl interfaceC373570EklP42 = this.LL.P4();
                if (interfaceC373570EklP42 != null) {
                    interfaceC373570EklP42.LIZ();
                }
            } else {
                C376300EpA.LIZIZ("download_stroke", c380780EwO2.LIZJ, null, null, zBooleanValue, System.currentTimeMillis() - this.LLILLL, 0);
                String str = c380780EwO2.LIZLLL;
                String str2 = c380780EwO2.LJFF;
                String str3 = c380780EwO2.LJII;
                C380820EwS.t5(this.LL, str, Boolean.TRUE, EnumC1641380soa.SUCCESS, null, str2, str3, c380780EwO2.LJIIJ, false);
                this.LL.H4();
                this.LLILZ.invoke();
            }
        }
        return Unit.LIZ;
    }
}

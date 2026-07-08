package X;

import Y.AComparatorS23S0000000_4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0CiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.handlers.MessageChunkProxy$timer$2$1", f = "MessageChunkProxy.kt", l = {}, m = "invokeSuspend")
public final class C321180CiS extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C321150CiP LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321180CiS(C321150CiP c321150CiP, InterfaceC1364105Vn<? super C321180CiS> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c321150CiP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C321180CiS(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageChunkProxy@ea6a.timer$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL.LIZLLL;
        if (str == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MessageChunkProxy@ea6a.timer$2$1");
            return unit;
        }
        C321220CiW c321220CiWLIZ = C321740CjM.LIZ(str);
        boolean z = true;
        if (c321220CiWLIZ != null && c321220CiWLIZ.LIZLLL < ((double) c321220CiWLIZ.LJ) * 1.0d) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MessageChunkProxy@ea6a.timer$2$1");
            return unit2;
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS23S0000000_4(1), this.LL.LIZIZ);
        List<C321170CiR> list = this.LL.LIZIZ;
        if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
            z = false;
        } else {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((C321170CiR) it2.next()).LIZLLL) {
                    break;
                }
            }
            z = false;
        }
        listLJLLLL.size();
        if (z) {
            ((ArrayList) this.LL.LIZIZ).clear();
            C321150CiP c321150CiP = this.LL;
            Iterator it3 = listLJLLLL.iterator();
            while (it3.hasNext()) {
                c321150CiP.LJFF((C321170CiR) it3.next());
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MessageChunkProxy@ea6a.timer$2$1");
        return unit3;
    }
}

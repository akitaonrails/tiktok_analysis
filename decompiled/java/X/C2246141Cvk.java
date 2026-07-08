package X;

import android.app.Activity;
import com.bytedance.bpea.transmit.StackManager;
import com.bytedance.hox.Hox;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.1Cvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246141Cvk extends C09AY implements Function0<Unit> {
    public C2246141Cvk() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final C19EG c19eg;
        if (C838910WvZ.LIZIZ == 0) {
            Activity activityLIZ = C2421209eE.LIZ();
            if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null) {
                StackManager.LIZLLL = true;
            } else {
                final C013C c013c = new C013C();
                boolean zLIZ = C1559540qga.LIZ(c19eg);
                c013c.element = zLIZ;
                StackManager.LIZLLL = true ^ zLIZ;
                Hox.LLJILJIL.LIZ(c19eg).vQ2(new InterfaceC1583770rJf() { // from class: X.1Cvm
                    @Override // X.InterfaceC1583770rJf
                    public final void A4(String str, String str2) {
                        c013c.element = C1559540qga.LIZ(c19eg);
                        int i = StackManager.LIZ;
                        StackManager.LIZLLL = !c013c.element;
                    }
                });
            }
        } else {
            StackManager.LIZLLL = true;
            StackManager.LJIILIIL = AFwS189S0000000_3.get$arr$(1668);
        }
        return Unit.LIZ;
    }
}

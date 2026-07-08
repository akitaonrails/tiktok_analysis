package Y;

import X.C09JN;
import X.C1720106oR;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C635440OwA;
import X.InterfaceC1631620sYq;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AfS0S0112000_9 implements C09JN {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0112000_9 afS0S0112000_9, Object obj) {
        C1C7U.LIZ("SystemNotificationUnsubscribeHelper@8069.performUnsubscribe$1");
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performUnsubscribe success group = ");
        sbLIZ.append(afS0S0112000_9.i2);
        sbLIZ.append(", category = ");
        sbLIZ.append(afS0S0112000_9.i3);
        sbLIZ.append(", isUnsubscribe = ");
        sbLIZ.append(afS0S0112000_9.z1);
        C1720106oR.LJI("SNUnsubscribeSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
        C635440OwA.LIZIZ(afS0S0112000_9.i2, afS0S0112000_9.z1, Integer.valueOf(afS0S0112000_9.i3));
        ((InterfaceC1631620sYq) afS0S0112000_9.l0).invoke(Integer.valueOf(afS0S0112000_9.i2), Integer.valueOf(afS0S0112000_9.i3), Boolean.valueOf(afS0S0112000_9.z1));
        C1C7U.LIZIZ("SystemNotificationUnsubscribeHelper@8069.performUnsubscribe$1");
    }

    public static final void accept$1(AfS0S0112000_9 afS0S0112000_9, Object obj) {
        C1C7U.LIZ("SystemNotificationUnsubscribeHelper@8069.performUnsubscribe$2");
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performUnsubscribe error group = ");
        sbLIZ.append(afS0S0112000_9.i2);
        sbLIZ.append(", category = ");
        sbLIZ.append(afS0S0112000_9.i3);
        sbLIZ.append(", isUnsubscribe = ");
        sbLIZ.append(afS0S0112000_9.z1);
        sbLIZ.append(", message = ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C1720106oR.LJI("SNUnsubscribeSheetHelper", C2188811AlT.LIZIZ(sbLIZ));
        Function0 function0 = (Function0) afS0S0112000_9.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("SystemNotificationUnsubscribeHelper@8069.performUnsubscribe$2");
    }

    public AfS0S0112000_9(int i, int i2, Object obj, boolean z, int i3) {
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.z1 = z;
        this.l0 = obj;
    }
}

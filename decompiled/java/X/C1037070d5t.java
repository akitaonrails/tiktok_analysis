package X;

import Y.AfS185S0100000_16;
import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0d5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037070d5t extends AbstractC1037060d5s {
    public final C1037050d5r LIZ = new C1037050d5r(this);
    public final C1037020d5o LIZIZ = new C1037020d5o(this);
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 796));

    @Override // X.InterfaceC1037120d5y
    public final String getTag() {
        return "IABPreWarm_ContainerTask";
    }

    @Override // X.AbstractC1037060d5s
    public final List<InterfaceC1037120d5y> LIZJ() {
        return (List) this.LIZJ.getValue();
    }

    public C1037070d5t() {
        C1906580ziK.LIZJ().LJII().LJJIL(new InterfaceC19483011Ki() { // from class: X.0d5v
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return ((AbstractC1387200mCc) obj).LIZ instanceof C08B7;
            }
        }).LJJLJLI(new AfS185S0100000_16(this, 34));
    }

    public static Activity LIZLLL() {
        Activity activityLJFF = C2214201BlK.LJFF();
        InterfaceC1603190roz.LJJIJIIJI.getClass();
        if (C0SPD.LIZ()) {
            return activityLJFF;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IABPreWarm_ContainerTask");
        sbLIZ.append('(');
        sbLIZ.append(C13LP.LJJLIIIJ(LIZJ(), null, null, null, 0, null, AFwS252S0000000_16.get$arr$(536), 31));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

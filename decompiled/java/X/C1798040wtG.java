package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0wtG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798040wtG implements InterfaceC586170Myt {
    public static final C1798040wtG LL = new C1798040wtG();

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1798060wtI c1798060wtI = C1798060wtI.LIZ;
                    if (C1798060wtI.LIZIZ()) {
                        C1798060wtI.LJFF(EnumC1798030wtF.LOG_OUT, null);
                        C1797880wt0 c1797880wt0 = C1797750wsn.LIZJ;
                        if (c1797880wt0 != null) {
                            C421590Gg1.LIZ(new AwS571S0100000_27(c1797880wt0, 1408));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C1798060wtI c1798060wtI2 = C1798060wtI.LIZ;
            if (!C1798060wtI.LIZIZ()) {
                return;
            }
            C1798060wtI.LJFF(EnumC1798030wtF.ACCOUNT_SWITCHED, null);
            C1797880wt0 c1797880wt02 = C1797750wsn.LIZJ;
            if (c1797880wt02 == null) {
                return;
            }
            C421590Gg1.LIZ(new AwS571S0100000_27(c1797880wt02, 1404));
            return;
        }
        C1798060wtI c1798060wtI3 = C1798060wtI.LIZ;
        if (!C1798060wtI.LIZIZ()) {
            return;
        }
        C1798060wtI.LJFF(EnumC1798030wtF.LOG_IN, null);
        C1797880wt0 c1797880wt03 = C1797750wsn.LIZJ;
        if (c1797880wt03 == null) {
            return;
        }
        C421590Gg1.LIZ(new AwS571S0100000_27(c1797880wt03, 1407));
    }
}

package X;

import com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityOptConfig;

/* JADX INFO: renamed from: X.0NsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607610NsN {
    public static volatile long LIZJ;
    public static final C607610NsN LIZ = new C607610NsN();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C607580NsK());
    public static volatile EnumC1588650rRX LIZLLL = EnumC1588650rRX.NONE;
    public static int LJ = 1;

    public static InterfaceC497601wk LIZ() {
        return (InterfaceC497601wk) LIZIZ.getValue();
    }

    public static void LIZIZ(EnumC607620NsO enumC607620NsO, EnumC607600NsM enumC607600NsM) {
        if (!FollowRealTimeReadExp.LIZ() && !((Boolean) FollowingSkylightAbilityOptConfig.LJ.getValue()).booleanValue()) {
            return;
        }
        C23250099c.LIZLLL(LIZ(), null, null, new C607590NsL(enumC607620NsO, enumC607600NsM, null), 3);
    }
}

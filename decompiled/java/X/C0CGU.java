package X;

import com.ss.android.ugc.aweme.ab.EcSearchEntranceDataConfigModel;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CGU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CGU {
    public static final EcSearchEntranceDataConfigModel LIZ = new EcSearchEntranceDataConfigModel(0, 0, null, null, 15, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(819));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(817));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(818));

    public static boolean LIZ(int i) {
        if (((EcSearchEntranceDataConfigModel) LIZIZ.getValue()).enableNewPriorityRule == 1 && !((Set) LIZLLL.getValue()).contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }
}

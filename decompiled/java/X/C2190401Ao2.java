package X;

import com.ss.android.ugc.aweme.ab.NativeHistoryConfig;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1Ao2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190401Ao2 {
    public static final C2190401Ao2 LIZ = new C2190401Ao2();
    public static final NativeHistoryConfig LIZIZ = new NativeHistoryConfig(false, C1697810uHb.LJ(8, 101));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(34));

    public static boolean LIZ(int i) {
        C01GW c01gw = LIZJ;
        if (((NativeHistoryConfig) c01gw.getValue()).enable && ((NativeHistoryConfig) c01gw.getValue()).list.contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }
}

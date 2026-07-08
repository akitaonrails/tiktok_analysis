package X;

import com.ss.android.ugc.aweme.inbox.InboxRefresh;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903400zdC {
    public static final InboxRefresh LIZ = new InboxRefresh();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(694));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(695));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(697));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(696));

    public static final boolean LIZ(long j) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - j;
        C01GW c01gw = LJ;
        if (j2 >= ((Number) c01gw.getValue()).longValue()) {
            z = true;
        } else {
            z = false;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("expiredByTabChange ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(" - ");
        sbLIZ.append(j);
        sbLIZ.append(" >= ");
        sbLIZ.append(((Number) c01gw.getValue()).longValue());
        sbLIZ.append(" = ");
        sbLIZ.append(z);
        C1720106oR.LJI("InboxRefreshSettings", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }
}

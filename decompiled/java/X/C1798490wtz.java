package X;

import android.content.Context;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0wtz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798490wtz {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Function0<Integer> LIZLLL;
    public final List<String> LJFF;
    public final Function0<String> LJI;
    public final Set<String> LJII;
    public final long LJIIIZ;
    public final int LJ = 2;
    public final boolean LJIIIIZZ = false;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WifiConfig(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", connectedOnly=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", permissionLevelGetter=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", requiredPermissionLevel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", requiredRegions=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", storeRegionGetter=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", realtimeScanCerts=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", bypassWifiRule=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", scanTimeoutMs=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return this.LIZIZ && this.LJFF.contains(this.LJI.invoke()) && this.LIZLLL.invoke().intValue() == this.LJ;
    }

    public C1798490wtz(Context context, boolean z, boolean z2, AwS571S0100000_27 awS571S0100000_27, List list, AFwS216S0000000_27 aFwS216S0000000_27, Set set, long j) {
        this.LIZ = context;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = awS571S0100000_27;
        this.LJFF = list;
        this.LJI = aFwS216S0000000_27;
        this.LJII = set;
        this.LJIIIZ = j;
    }
}

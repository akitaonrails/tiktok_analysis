package X;

import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTaskEventAbility;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C620060OTs {
    public final String LIZ;
    public final BulletinTaskEventAbility LIZIZ;
    public final Function1<String, Map<String, Object>> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C620060OTs)) {
            return false;
        }
        C620060OTs c620060OTs = (C620060OTs) obj;
        return Intrinsics.LJFF(this.LIZ, c620060OTs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c620060OTs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c620060OTs.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageEntry(bbId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ability=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraParamsProvider=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C620060OTs(String str, BulletinTaskEventAbility bulletinTaskEventAbility, C620110OTx c620110OTx) {
        this.LIZ = str;
        this.LIZIZ = bulletinTaskEventAbility;
        this.LIZJ = c620110OTx;
    }
}

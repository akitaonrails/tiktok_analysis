package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionABInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982590bg1 extends AbstractC982860bgS {
    public static final /* synthetic */ int LJI = 0;
    public final EnumC982640bg6 LJ;
    public final Map<Long, CompetitionABInfo> LJFF;

    public C982590bg1() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982590bg1)) {
            return false;
        }
        C982590bg1 c982590bg1 = (C982590bg1) obj;
        return this.LJ == c982590bg1.LJ && Intrinsics.LJFF(this.LJFF, c982590bg1.LJFF);
    }

    public final int hashCode() {
        return (this.LJ.hashCode() * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionReplyResult(replyType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", abInfos=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982590bg1(C983120bgs c983120bgs) {
        EnumC982640bg6 enumC982640bg6 = c983120bgs.LJ;
        Map<Long, CompetitionABInfo> map = c983120bgs.LJFF;
        this.LJ = enumC982640bg6;
        this.LJFF = map;
    }
}

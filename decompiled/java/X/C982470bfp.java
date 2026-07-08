package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionABInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982470bfp extends AbstractC982800bgM {
    public static final /* synthetic */ int LJIIJ = 0;
    public final EnumC982740bgG LJFF;
    public final long LJI;
    public final List<C981870ber> LJII;
    public final C981540beK LJIIIIZZ;
    public final Map<Long, CompetitionABInfo> LJIIIZ;

    public C982470bfp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982470bfp)) {
            return false;
        }
        C982470bfp c982470bfp = (C982470bfp) obj;
        return this.LJFF == c982470bfp.LJFF && this.LJI == c982470bfp.LJI && Intrinsics.LJFF(this.LJII, c982470bfp.LJII) && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LJIIIIZZ, c982470bfp.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c982470bfp.LJIIIZ);
    }

    public final int hashCode() {
        return (((((((this.LJFF.hashCode() * 31) + C786410Ut5.Y2(this.LJI)) * 31) + this.LJII.hashCode()) * 31 * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionStartMessage(inviteType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", inviteUid=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", teams=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", giftMeta=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", countTimeConfig=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", abInfos=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982470bfp(C982650bg7 c982650bg7) {
        EnumC982740bgG enumC982740bgG = c982650bg7.LJFF;
        long j = c982650bg7.LJI;
        List<C981870ber> list = c982650bg7.LJII;
        C981540beK c981540beK = c982650bg7.LJIIIIZZ;
        Map<Long, CompetitionABInfo> map = c982650bg7.LJIIIZ;
        this.LJFF = enumC982740bgG;
        this.LJI = j;
        this.LJII = list;
        this.LJIIIIZZ = c981540beK;
        this.LJIIIZ = map;
    }
}

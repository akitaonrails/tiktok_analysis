package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionABInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982480bfq extends AbstractC982800bgM {
    public static final /* synthetic */ int LJIIJ = 0;
    public final EnumC982740bgG LJFF;
    public final long LJI;
    public final List<C981870ber> LJII;
    public final Map<Long, ? extends EnumC982730bgF> LJIIIIZZ;
    public final Map<Long, CompetitionABInfo> LJIIIZ;

    public C982480bfq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982480bfq)) {
            return false;
        }
        C982480bfq c982480bfq = (C982480bfq) obj;
        return this.LJFF == c982480bfq.LJFF && this.LJI == c982480bfq.LJI && Intrinsics.LJFF(this.LJII, c982480bfq.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c982480bfq.LJIIIIZZ) && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LJIIIZ, c982480bfq.LJIIIZ);
    }

    public final int hashCode() {
        return (((((((this.LJFF.hashCode() * 31) + C786410Ut5.Y2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31 * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionInviteMessage(inviteType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", inviteUid=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", teams=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", giftPermissions=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", giftMeta=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", abInfos=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982480bfq(C982660bg8 c982660bg8) {
        EnumC982740bgG enumC982740bgG = c982660bg8.LJFF;
        long j = c982660bg8.LJI;
        List<C981870ber> list = c982660bg8.LJII;
        Map<Long, ? extends EnumC982730bgF> map = c982660bg8.LJIIIIZZ;
        Map<Long, CompetitionABInfo> map2 = c982660bg8.LJIIIZ;
        this.LJFF = enumC982740bgG;
        this.LJI = j;
        this.LJII = list;
        this.LJIIIIZZ = map;
        this.LJIIIZ = map2;
    }
}

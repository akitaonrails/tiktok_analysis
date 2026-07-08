package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionABInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982450bfn extends AbstractC982800bgM {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final EnumC982740bgG LJFF;
    public final long LJI;
    public final long LJII;
    public final List<C981870ber> LJIIIIZZ;
    public final EnumC974260bSa LJIIIZ;
    public final Map<Long, ? extends EnumC982730bgF> LJIIJ;
    public final EnumC982730bgF LJIIJJI;
    public final C981540beK LJIIL;
    public final Map<Long, CompetitionABInfo> LJIILIIL;

    public C982450bfn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982450bfn)) {
            return false;
        }
        C982450bfn c982450bfn = (C982450bfn) obj;
        return this.LJFF == c982450bfn.LJFF && this.LJI == c982450bfn.LJI && this.LJII == c982450bfn.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c982450bfn.LJIIIIZZ) && this.LJIIIZ == c982450bfn.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c982450bfn.LJIIJ) && this.LJIIJJI == c982450bfn.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c982450bfn.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c982450bfn.LJIILIIL);
    }

    public final int hashCode() {
        return (((((((((((((((this.LJFF.hashCode() * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionAcceptMessage(inviteType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", inviteUid=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", replierUid=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", teams=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", giftPermissions=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", inviteePermissionType=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", countTimeConfig=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", abInfos=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982450bfn(C982540bfw c982540bfw) {
        EnumC982740bgG enumC982740bgG = c982540bfw.LJFF;
        long j = c982540bfw.LJI;
        long j2 = c982540bfw.LJII;
        List<C981870ber> list = c982540bfw.LJIIIIZZ;
        EnumC974260bSa enumC974260bSa = c982540bfw.LJIIIZ;
        Map<Long, ? extends EnumC982730bgF> map = c982540bfw.LJIIJ;
        EnumC982730bgF enumC982730bgF = c982540bfw.LJIIJJI;
        C981540beK c981540beK = c982540bfw.LJIIL;
        Map<Long, CompetitionABInfo> map2 = c982540bfw.LJIILIIL;
        this.LJFF = enumC982740bgG;
        this.LJI = j;
        this.LJII = j2;
        this.LJIIIIZZ = list;
        this.LJIIIZ = enumC974260bSa;
        this.LJIIJ = map;
        this.LJIIJJI = enumC982730bgF;
        this.LJIIL = c981540beK;
        this.LJIILIIL = map2;
    }
}

package X;

import com.bytedance.android.live.liveinteract.competition.model.CompetitionABInfo;
import com.bytedance.android.live.liveinteract.linkroom.CoHostEnableConditionChangeEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.CohostContentGuideInfo;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0beE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981480beE implements InterfaceC963620bBQ {
    public final EnumC975850bV9 LIZ;
    public final boolean LIZIZ;
    public final Room LIZJ;
    public final C981520beI LIZLLL;
    public final String LJ;
    public final long LJFF;
    public List<C954460awe> LJI;
    public List<C954460awe> LJII;
    public EnumC962960bAM LJIIIIZZ;
    public long LJIIIZ;
    public final C981540beK LJIIJ;
    public long LJIIJJI;
    public List<C981870ber> LJIIL;
    public long LJIILIIL;
    public List<C982390bfh> LJIILJJIL;
    public Map<Long, C982390bfh> LJIILL;
    public Map<Long, C982390bfh> LJIILLIIL;
    public Map<Long, ? extends EnumC982730bgF> LJIIZILJ;
    public Map<Long, CompetitionABInfo> LJIJ;
    public EnumC982500bfs LJIJI;
    public C945320ahu LJIJJ;
    public EnumC974260bSa LJIJJLI;
    public AbstractC963510bBF LJIL;
    public long LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public CohostContentGuideInfo LJJII;
    public Function0<Unit> LJJIII;
    public C973800bRq LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public final C973910bS1 LJJIIZI;
    public final C981550beL LJJIJ;
    public final C981500beG LJJIJIIJI;
    public final C974430bSr LJJIJIIJIL;
    public final C981910bev LJJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C981480beE)) {
            return false;
        }
        C981480beE c981480beE = (C981480beE) obj;
        return this.LIZ == c981480beE.LIZ && this.LIZIZ == c981480beE.LIZIZ && Intrinsics.LJFF(this.LIZJ, c981480beE.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        Room room = this.LIZJ;
        return iHashCode + (room == null ? 0 : room.hashCode());
    }

    public static long LIZ() {
        return C915980Zwa.LJI().LJIIJ().getChannelId();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionModel(uuid='");
        sbLIZ.append(this.LJ);
        sbLIZ.append("', createdSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bizType=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", currentCompetitionId=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetModel, source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CompetitionModel", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("resetEngineModel, source=");
        sbLIZ2.append(str);
        C20441214yg.LIZIZ("CompetitionModel", C2188811AlT.LIZIZ(sbLIZ2));
        EnumC962960bAM enumC962960bAM = EnumC962960bAM.UNKNOWN;
        LIZLLL(enumC962960bAM);
        LIZJ(EnumC974260bSa.NONE);
        this.LJIIIZ = 0L;
        this.LJIIJJI = 0L;
        this.LJIIL = new ArrayList();
        this.LJIILIIL = 0L;
        this.LJIILJJIL = new ArrayList();
        this.LJIILL = new LinkedHashMap();
        this.LJIILLIIL = new LinkedHashMap();
        this.LJIIZILJ = C2097608Jq.LJ();
        this.LJIJI = EnumC982500bfs.UNKNOWN;
        this.LJIL = null;
        C981540beK c981540beK = this.LJIIJ;
        c981540beK.getClass();
        c981540beK.LIZ = enumC962960bAM;
        c981540beK.LIZIZ = 0L;
        c981540beK.LIZJ = 0L;
        c981540beK.LIZLLL = 0L;
        c981540beK.LJFF = 0L;
        c981540beK.LJ = 0L;
        c981540beK.LJI = 0L;
        c981540beK.LJII = 0L;
        c981540beK.LJIIIIZZ = 0L;
        c981540beK.LJIIIZ = 0L;
        c981540beK.LJIIJ = 0L;
        this.LJJ = 0L;
        this.LJJIIJ = null;
        C981550beL c981550beL = this.LJJIJ;
        c981550beL.getClass();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("resetModel, source=");
        sbLIZ3.append(str);
        C20441214yg.LIZIZ("CompetitionTrackingModel", C2188811AlT.LIZIZ(sbLIZ3));
        c981550beL.LIZJ = false;
        C973890bRz.LIZ.LJI = false;
        c981550beL.LIZLLL = false;
        c981550beL.LIZIZ = "";
        c981550beL.LJIIIIZZ = false;
        c981550beL.LJII = 0L;
        c981550beL.LJIIIZ = null;
        c981550beL.LJIIJ = 0L;
        c981550beL.LJIIJJI = 0L;
        c981550beL.LJ = false;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("resetBizModel, source=");
        sbLIZ4.append(str);
        C20441214yg.LIZIZ("CompetitionModel", C2188811AlT.LIZIZ(sbLIZ4));
        C981500beG c981500beG = this.LJJIJIIJI;
        c981500beG.getClass();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("resetModel, source=");
        sbLIZ5.append(str);
        C20441214yg.LIZIZ("Competition_TakeStageModel", C2188811AlT.LIZIZ(sbLIZ5));
        c981500beG.LJIIIIZZ = 0L;
        c981500beG.LIZIZ = 0L;
        C13BV c13bv = C13BV.INSTANCE;
        c981500beG.LJI = c13bv;
        c981500beG.LJII = c13bv;
        c981500beG.LJIIIZ = 0L;
        c981500beG.LJIIJ = 0L;
        c981500beG.LJIIJJI = 0L;
        c981500beG.LJIILIIL = false;
        c981500beG.LJIILJJIL = false;
        c981500beG.LIZJ = false;
        c981500beG.LJFF = 0L;
        C974430bSr c974430bSr = this.LJJIJIIJIL;
        c974430bSr.getClass();
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("resetModel, source=");
        sbLIZ6.append(str);
        C20441214yg.LIZIZ("TakeStageTrackingModel", C2188811AlT.LIZIZ(sbLIZ6));
        c974430bSr.LIZIZ = c13bv;
        c974430bSr.LIZ(0L);
    }

    public final void LIZJ(EnumC974260bSa enumC974260bSa) {
        this.LJIJJLI = enumC974260bSa;
        DataChannelGlobal.LLILZ.FQ2(CoHostEnableConditionChangeEvent.class, new C915720ZwA(enumC974260bSa.isInProcess()));
    }

    public final void LIZLLL(EnumC962960bAM enumC962960bAM) {
        this.LJIIIIZZ = enumC962960bAM;
        this.LJIIJ.LIZ = enumC962960bAM;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update bizType value=");
        sbLIZ.append(enumC962960bAM);
        C20441214yg.LIZIZ("CompetitionModel", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C981480beE(EnumC975850bV9 enumC975850bV9, boolean z, Room room) {
        long ownerUserId;
        this.LIZ = enumC975850bV9;
        this.LIZIZ = z;
        this.LIZJ = room;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompetitionModel init/reset source = ");
        sbLIZ.append(enumC975850bV9);
        sbLIZ.append(" is anchor = ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("CompetitionModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZLLL = new C981520beI(this);
        this.LJ = UUID.randomUUID().toString();
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        this.LJFF = ownerUserId;
        this.LJI = new ArrayList();
        this.LJII = new ArrayList();
        EnumC962960bAM enumC962960bAM = EnumC962960bAM.UNKNOWN;
        this.LJIIIIZZ = enumC962960bAM;
        this.LJIIJ = new C981540beK(enumC962960bAM, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8);
        this.LJIIL = new ArrayList();
        this.LJIILJJIL = new ArrayList();
        this.LJIILL = new HashMap();
        this.LJIILLIIL = new HashMap();
        this.LJIIZILJ = C2097608Jq.LJ();
        this.LJIJ = C2097608Jq.LJ();
        this.LJIJI = EnumC982500bfs.UNKNOWN;
        this.LJIJJLI = EnumC974260bSa.NONE;
        this.LJJIIZI = C973910bS1.LIZ;
        this.LJJIJ = new C981550beL(this);
        this.LJJIJIIJI = new C981500beG(this);
        this.LJJIJIIJIL = new C974430bSr(this);
        this.LJJIJIL = new C981910bev();
    }
}

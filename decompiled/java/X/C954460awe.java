package X;

import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import tikcast.linkmic.common.CohostStreamConfig;
import tikcast.linkmic.common.CohostUserInfo;
import tikcast.linkmic.common.ContentPosition;

/* JADX INFO: renamed from: X.0awe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954460awe extends C955670ayb {
    public final long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final ConcurrentHashSet<Long> LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public int LJIJ;
    public final EnumC919210a1n LJIJI;
    public C754570Tip LJIJJ;
    public long LJIJJLI;
    public boolean LJIL;
    public String LJJ;
    public CohostStreamConfig LJJI;
    public ContentPosition LJJIFFI;
    public boolean LJJII;
    public GiftGalleryBadgeInfo LJJIII;
    public LeagueScoreInfo LJJIIJ;
    public CohostUserInfo.CohostMode LJJIIJZLJL;
    public EnumC950200apm LJJIIZ;
    public boolean LJJIIZI;
    public String LJJIJ;
    public Object LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public int LJJIJL;
    public String LJJIJLIJ;

    public final void LJ() {
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJIILJJIL.clear();
        this.LJIILL = 0L;
        this.LJIILLIIL = 0L;
        this.LJIIZILJ = 0L;
    }

    public final boolean LJI() {
        return this.LJ == C950220apo.LJFF();
    }

    public final boolean LJIIIIZZ() {
        return this.LJJIIZ.isLinked();
    }

    public final boolean LJIIJ() {
        return this.LJJIIZ.isInviting() || this.LJJIIZ.isApplying() || this.LJJIIZ.isInvitingMe() || this.LJJIIZ.isApplyingMe();
    }

    public final boolean LJIIJJI() {
        return this.LJII == C950220apo.LJFF();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiCoHostUser(uid=");
        sb.append(this.LJ);
        sb.append(", userInfo=");
        sb.append(this.LJIJJ);
        sb.append(", roomId=");
        sb.append(this.LJFF);
        sb.append(", channelId=");
        sb.append(this.LJI);
        sb.append(", rivalUserId=");
        sb.append(this.LJII);
        sb.append(", sdkRivalUserId=");
        sb.append(this.LJIIIIZZ);
        sb.append(", state=");
        sb.append(this.LJJIIZ);
        sb.append(", playType=");
        sb.append(this.LJIJ);
        sb.append(", linkRemainingTime=");
        sb.append(this.LJIIJ);
        sb.append(", linkMicId='");
        sb.append(this.LJIIJJI);
        sb.append("', isGroupMerging=");
        sb.append(this.LJIIL);
        sb.append(", isGroupMergingByMe=");
        sb.append(this.LJIILIIL);
        sb.append(", groupMergingUidsByMe=");
        sb.append(this.LJIILJJIL);
        sb.append(", groupOwnerUid=");
        sb.append(this.LJIILL);
        sb.append(", groupOwnerRoomId=");
        sb.append(this.LJIILLIIL);
        sb.append(", groupOwnerChannelId=");
        sb.append(this.LJIIZILJ);
        sb.append(", isInvitedBySelf=");
        sb.append(this.LJJIIZI);
        sb.append(", createSourceTag=");
        sb.append(this.LJJIJ);
        sb.append(", streamId=");
        CohostStreamConfig cohostStreamConfig = this.LJJI;
        sb.append(cohostStreamConfig != null ? cohostStreamConfig.screenShareStreamId : null);
        sb.append(", contentPosition=");
        sb.append(this.LJJIFFI);
        sb.append(", followStatus=");
        sb.append(this.LJIJJLI);
        sb.append(", sourceType=");
        sb.append(this.LJJIJL);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C954460awe(long j) {
        this(j, 0L);
    }

    public final void LJFF(String str) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearIM, source=");
        sbLIZ.append(str);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", rivalUserId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", joinMessage=");
        Object obj = this.LJJIJIIJI;
        if (obj != null) {
            numValueOf = Integer.valueOf(obj.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LJIIIZ("MultiCoHostUser", C2188811AlT.LIZIZ(sbLIZ));
        this.LJJIJIIJI = null;
    }

    public final boolean LJIIIZ(Long l) {
        long j = this.LJ;
        if (l != null && l.longValue() == j) {
            return true;
        }
        return false;
    }

    public C954460awe(long j, long j2) {
        this.LJ = j;
        this.LJFF = j2;
        this.LJIIJJI = "";
        this.LJIILJJIL = new ConcurrentHashSet<>();
        this.LJIJI = EnumC919210a1n.SUPPORT_MULTI;
        this.LJIJJLI = -1L;
        this.LJJ = "";
        this.LJJIIZ = EnumC950200apm.IDLE;
        this.LJJIJ = "sdk";
        this.LJJIJIIJIL = true;
        this.LJJIJLIJ = "";
    }
}

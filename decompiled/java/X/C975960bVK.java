package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorMatchSettings;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleFeatureFlags;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.CohostContentGuideInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.IceShowdownInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishEffectInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchThemeDisplayResource;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bVK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975960bVK implements InterfaceC973730bRj, InterfaceC963620bBQ {
    public final EnumC975850bV9 LIZ;
    public final boolean LIZIZ;
    public final Room LIZJ;
    public EnumC919170a1j LIZLLL;
    public long LJ;
    public boolean LJFF;
    public boolean LJI;
    public BattleSetting LJII;
    public MatchThemeDisplayResource LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public List<Long> LJIIJJI;
    public TeamUsersInfo LJIIL;
    public String LJIILIIL;
    public List<GiftMode> LJIILJJIL;
    public GiftMode LJIILL;
    public int LJIILLIIL;
    public BattleUserInfo LJIIZILJ;
    public Map<Long, AnchorMatchSettings> LJIJ;
    public C976920bWs LJIJI;
    public final Map<Long, Long> LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public int LJJI;
    public long LJJIFFI;
    public long LJJII;
    public long LJJIII;
    public long LJJIIJ;
    public long LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIIZI;
    public List<? extends TeamUsersInfo> LJJIJ;
    public Map<Long, BattleComboInfo> LJJIJIIJI;
    public BattleTeamResult LJJIJIIJIL;
    public Map<Long, BattleTeamResult> LJJIJIL;
    public List<BattleTeamUserArmies> LJJIJL;
    public boolean LJJIJLIJ;
    public boolean LJJIL;
    public final C098J<Long, Boolean> LJJIZ;
    public boolean LJJJ;
    public EnumC919170a1j LJJJI;
    public Map<Long, BattleUserArmies> LJJJIL;
    public List<BattleTeamUserArmies> LJJJJ;
    public boolean LJJJJI;
    public long LJJJJIZL;
    public GiftMode LJJJJJ;
    public GiftModeMeta LJJJJJL;
    public boolean LJJJJL;
    public boolean LJJJJLI;
    public final long LJJJJLL;
    public BattleFeatureFlags LJJJJZ;
    public long LJJJJZI;
    public final MutableLiveData<List<C976480bWA>> LJJJLIIL;
    public List<C954460awe> LJJJLL;
    public final C975990bVN LJJJLZIJ;
    public long LJJJZ;
    public int LJJL;
    public long LJJLI;
    public boolean LJJLIIIIJ;
    public boolean LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public EnigmaBattleSetting LJJLIIIJJI;
    public long LJJLIIIJJIZ;
    public long LJJLIIIJL;
    public boolean LJJLIIIJLJLI;
    public IceShowdownInfo LJJLIIIJLLLLLLLZ;
    public BattleEffectInfos LJJLIIJ;
    public CohostContentGuideInfo LJJLIL;
    public Function0<Unit> LJJLJ;
    public C973800bRq LJJLJLI;
    public Long LJJLL;
    public MatchPunishEffectInfo.EffectStruct LJJZ;

    @Override // X.InterfaceC974470bSv
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC974220bSW
    public final void LJIJ() {
        this.LJJJJLI = true;
    }

    @Override // X.InterfaceC974470bSv
    public final void LJJII() {
        this.LJJIJLIJ = true;
    }

    @Override // X.InterfaceC974220bSW
    public final void LJJIJL() {
        this.LJJJJL = true;
    }

    @Override // X.InterfaceC915660Zw4
    public final void LJJJLL() {
    }

    @Override // X.InterfaceC974470bSv
    public final void LJJLIL(long j) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C975960bVK)) {
            return false;
        }
        C975960bVK c975960bVK = (C975960bVK) obj;
        return this.LIZ == c975960bVK.LIZ && this.LIZIZ == c975960bVK.LIZIZ && Intrinsics.LJFF(this.LIZJ, c975960bVK.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        Room room = this.LIZJ;
        return iHashCode + (room == null ? 0 : room.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveMatchModel(createdSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isAnchor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", room=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC974220bSW
    public final boolean LJ() {
        GiftMode giftMode;
        GiftMode giftMode2 = this.LJIILL;
        return (giftMode2 != null ? Long.valueOf(giftMode2.giftId) : null) != null && ((giftMode = this.LJIILL) == null || giftMode.giftId != 0);
    }

    @Override // X.InterfaceC974220bSW
    public final boolean LJIILL() {
        GiftModeMeta giftModeMeta;
        GiftModeMeta giftModeMeta2 = this.LJJJJJL;
        return (giftModeMeta2 != null ? Long.valueOf(giftModeMeta2.giftId) : null) != null && ((giftModeMeta = this.LJJJJJL) == null || giftModeMeta.giftId != 0);
    }

    @Override // X.InterfaceC915660Zw4
    public final BattleUserInfo LJJI() {
        Room room;
        User owner;
        BattleBaseUserInfo battleBaseUserInfo;
        Long l;
        BattleUserInfo battleUserInfo = this.LJIIZILJ;
        if ((battleUserInfo == null || (battleBaseUserInfo = battleUserInfo.user) == null || (l = battleBaseUserInfo.userId) == null || l.longValue() <= 0) && (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null && (owner = room.getOwner()) != null) {
            this.LJIIZILJ = new BattleUserInfo(new BattleBaseUserInfo(Long.valueOf(owner.getId()), C0KVU.LIZLLL(owner), C0KVU.LJ(owner), owner.getAvatarThumb(), 0L, 0), null, 2, null);
        }
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC974340bSi
    public final C976480bWA LJJJIL() {
        List<C976480bWA> value = this.LJJJLIIL.getValue();
        if (value != null) {
            return (C976480bWA) C13LP.LJJJLL(value);
        }
        return null;
    }

    @Override // X.InterfaceC974340bSi
    public final long LJJJJJ() {
        EnumC919170a1j enumC919170a1j;
        Room room;
        User owner;
        if (this.LJIIJ == 0 && (((enumC919170a1j = this.LIZLLL) == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL || enumC919170a1j == EnumC919170a1j.MATCH_TYPE_1V1) && (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null && (owner = room.getOwner()) != null)) {
            this.LJIIJ = owner.getId();
        }
        return this.LJIIJ;
    }

    @Override // X.InterfaceC974220bSW
    public final GiftMode LJJJJZ() {
        GiftMode giftMode = this.LJJJJJ;
        if (giftMode != null) {
            return giftMode;
        }
        long j = this.LJJJJIZL;
        return j != 0 ? C973890bRz.LIZIZ(j) : giftMode;
    }

    @Override // X.InterfaceC974470bSv
    public final long LJJL() {
        if (this.LJIIIZ == 0) {
            this.LJIIIZ = C915980Zwa.LJI().LJIIJ().getChannelId();
        }
        return this.LJIIIZ;
    }

    public final long LJLIIIL() {
        List<C976800bWg> list;
        List<C976480bWA> value = this.LJJJLIIL.getValue();
        if (value == null) {
            return 0L;
        }
        for (C976480bWA c976480bWA : value) {
            if (LJJJJJ() == c976480bWA.LIZ && (list = c976480bWA.LJFF) != null) {
                for (C976800bWg c976800bWg : list) {
                    if (c976800bWg.LIZ == this.LJJJJLL) {
                        return c976800bWg.LJ;
                    }
                }
            }
        }
        return 0L;
    }

    public final C976480bWA LJLIL() {
        C976480bWA next;
        List<C976480bWA> value = this.LJJJLIIL.getValue();
        if (value != null) {
            Iterator<C976480bWA> it2 = value.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next.LIZ == LJJJJJ()) {
                    break;
                }
            }
            C976480bWA c976480bWA = next;
            if (c976480bWA != null) {
                return c976480bWA;
            }
        }
        List<C976480bWA> value2 = this.LJJJLIIL.getValue();
        if (value2 != null) {
            return (C976480bWA) C13LP.LJJJLL(value2);
        }
        return null;
    }

    public final List<C954460awe> LJLIIL() {
        List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
        return listLJJLI.isEmpty() ? this.LJJJLL : listLJJLI;
    }

    public final long LJLILLLLZI() {
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        long currentUserId = interfaceC500940JkiUser != null ? interfaceC500940JkiUser.getCurrentUserId() : 0L;
        if (this.LJJJLL.size() == 2 && currentUserId != 0) {
            Iterator<C954460awe> it2 = this.LJJJLL.iterator();
            while (it2.hasNext()) {
                long j = it2.next().LJ;
                if (currentUserId != j) {
                    return j;
                }
            }
        }
        return 0L;
    }

    @Override // X.InterfaceC974470bSv
    public final boolean LIZ() {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC974470bSv
    public final BattleFeatureFlags LIZJ() {
        return this.LJJJJZ;
    }

    @Override // X.InterfaceC974340bSi
    public final List<Long> LIZLLL() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC973770bRn
    public final long LJFF() {
        return this.LJJIII;
    }

    @Override // X.InterfaceC915660Zw4
    public final Map<Long, AnchorMatchSettings> LJII() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC974220bSW
    public final GiftModeMeta LJIIIIZZ() {
        return this.LJJJJJL;
    }

    @Override // X.InterfaceC974470bSv
    public final EnumC919170a1j LJIIIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC974470bSv
    public final long LJIIJ() {
        return this.LJJJJZI;
    }

    @Override // X.InterfaceC974340bSi
    public final Long LJIIL() {
        return this.LJJLL;
    }

    @Override // X.InterfaceC915660Zw4
    public final BattleSetting LJIILIIL() {
        return this.LJII;
    }

    @Override // X.InterfaceC914410Zu3
    public final long LJIILJJIL() {
        return this.LJJLI;
    }

    @Override // X.InterfaceC973820bRs
    public final boolean LJIILLIIL() {
        return this.LJJLIIIJLJLI;
    }

    @Override // X.InterfaceC974340bSi
    public final BattleTeamResult LJIJI() {
        return this.LJJIJIIJIL;
    }

    @Override // X.InterfaceC975610bUl
    public final long LJIJJ() {
        return this.LJJLIIIJL;
    }

    @Override // X.InterfaceC974470bSv
    public final boolean LJIJJLI() {
        return this.LJI;
    }

    @Override // X.InterfaceC974340bSi
    public final List<BattleTeamUserArmies> LJJ() {
        return this.LJJIJL;
    }

    @Override // X.InterfaceC914410Zu3
    public final int LJJIII() {
        return this.LJJLIIIJILLIZJL;
    }

    @Override // X.InterfaceC974220bSW
    public final boolean LJJIIJ() {
        return this.LJJJJI;
    }

    @Override // X.InterfaceC975610bUl
    public final EnigmaBattleSetting LJJIIJZLJL() {
        return this.LJJLIIIJJI;
    }

    @Override // X.InterfaceC914410Zu3
    public final int LJJIIZ() {
        return this.LJJL;
    }

    @Override // X.InterfaceC974470bSv
    public final String LJJIIZI() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC974470bSv
    public final EnumC919170a1j LJJIJ() {
        return this.LJJJI;
    }

    @Override // X.InterfaceC974220bSW
    public final boolean LJJIJIIJI() {
        return this.LJJJJL;
    }

    @Override // X.InterfaceC974470bSv
    public final boolean LJJIJIIJIL() {
        return this.LJIL;
    }

    @Override // X.InterfaceC973770bRn
    public final long LJJIJIL() {
        return this.LJJIIJZLJL;
    }

    @Override // X.InterfaceC974340bSi
    public final Map<Long, BattleComboInfo> LJJIJLIJ() {
        return this.LJJIJIIJI;
    }

    @Override // X.InterfaceC974220bSW
    public final GiftMode LJJIL() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC974470bSv
    public final MatchPunishEffectInfo.EffectStruct LJJIZ() {
        return this.LJJZ;
    }

    @Override // X.InterfaceC974340bSi
    public final List<TeamUsersInfo> LJJJ() {
        return this.LJJIJ;
    }

    @Override // X.InterfaceC974470bSv
    public final boolean LJJJI() {
        return this.LJJIJLIJ;
    }

    @Override // X.InterfaceC975610bUl
    public final long LJJJJ() {
        return this.LJJLIIIJJIZ;
    }

    @Override // X.InterfaceC974470bSv
    public final boolean LJJJJI() {
        return this.LJFF;
    }

    @Override // X.InterfaceC974470bSv
    public final MutableLiveData<List<C976480bWA>> LJJJJIZL() {
        return this.LJJJLIIL;
    }

    @Override // X.InterfaceC974470bSv
    public final long LJJJJJL() {
        return this.LJ;
    }

    @Override // X.InterfaceC974340bSi
    public final TeamUsersInfo LJJJJLI() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC974220bSW
    public final int LJJJJZI() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC973770bRn
    public final long LJJJLIIL() {
        return this.LJJIIZI;
    }

    @Override // X.InterfaceC914410Zu3
    public final boolean LJJJLZIJ() {
        return this.LJJLIIIIJ;
    }

    @Override // X.InterfaceC974470bSv
    public final List<BattleTeamUserArmies> LJJLI() {
        return this.LJJJJ;
    }

    @Override // X.InterfaceC973770bRn
    public final long LJJLIIIJ() {
        return this.LJJIFFI;
    }

    @Override // X.InterfaceC914410Zu3
    public final boolean LJJLIIIJJI() {
        return this.LJJLIIIJ;
    }

    @Override // X.InterfaceC914410Zu3
    public final long LJJLIIIJLLLLLLLZ() {
        return this.LJJJZ;
    }

    @Override // X.InterfaceC974220bSW
    public final boolean LJJLIIJ() {
        return this.LJJJJLI;
    }

    @Override // X.InterfaceC974470bSv
    public final Map<Long, Long> LJJLJLI() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC974470bSv
    public final Map<Long, BattleUserArmies> LJJLL() {
        return this.LJJJIL;
    }

    @Override // X.InterfaceC973770bRn
    public final long LJJZ() {
        return this.LJJIIZ;
    }

    @Override // X.InterfaceC973770bRn
    public final long LJJZZI() {
        return this.LJJIIJ;
    }

    @Override // X.InterfaceC974380bSm
    public final CohostContentGuideInfo LJL() {
        return this.LJJLIL;
    }

    @Override // X.InterfaceC973770bRn
    public final long er() {
        return this.LJJII;
    }

    @Override // X.InterfaceC974220bSW
    public final long q9() {
        return this.LJJJJIZL;
    }

    @Override // X.InterfaceC973770bRn
    public final void LIZIZ(long j) {
        this.LJJIFFI = j;
    }

    @Override // X.InterfaceC974470bSv
    public final void LJI(Map<Long, BattleUserArmies> map) {
        this.LJJJIL = map;
    }

    @Override // X.InterfaceC974220bSW
    public final void LJIIZILJ(boolean z) {
        this.LJJJJI = z;
    }

    @Override // X.InterfaceC914410Zu3
    public final void LJIL(boolean z) {
        this.LJJLIIIIJ = z;
    }

    @Override // X.InterfaceC914410Zu3
    public final void LJJIFFI(int i) {
        this.LJJLIIIJILLIZJL = i;
    }

    @Override // X.InterfaceC914410Zu3
    public final void LJJJJL(boolean z) {
        this.LJJLIIIJ = z;
    }

    @Override // X.InterfaceC914410Zu3
    public final void LJJJJLL(long j) {
        this.LJJLI = j;
    }

    @Override // X.InterfaceC974470bSv
    public final void LJJJZ(boolean z) {
        this.LJI = z;
        C974450bSt c974450bSt = C973890bRz.LIZ;
        C973890bRz.LIZ.LJI = z;
    }

    @Override // X.InterfaceC974220bSW
    public final void LJJLIIIIJ(long j) {
        this.LJJJJIZL = j;
    }

    @Override // X.InterfaceC975610bUl
    public final void LJJLIIIJILLIZJL(long j) {
        this.LJJLIIIJJIZ = j;
    }

    @Override // X.InterfaceC914410Zu3
    public final void LJJLIIIJJIZ(long j) {
        this.LJJJZ = j;
    }

    @Override // X.InterfaceC975610bUl
    public final void LJJLIIIJL(long j) {
        this.LJJLIIIJL = j;
    }

    @Override // X.InterfaceC914410Zu3
    public final void LJJLIIIJLJLI(int i) {
        this.LJJL = i;
    }

    @Override // X.InterfaceC974220bSW
    public final void LJJLJ(GiftMode giftMode) {
        long j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setGiftOnlyGift, giftMode = ");
        sbLIZ.append(giftMode);
        C20441214yg.LIZIZ("LiveMatchModel", C2188811AlT.LIZIZ(sbLIZ));
        if (giftMode != null) {
            j = giftMode.giftId;
        } else {
            j = 0;
        }
        this.LJJJJIZL = j;
        this.LJJJJJ = giftMode;
    }

    @Override // X.InterfaceC974470bSv
    public final void LJJZZIII(List<BattleTeamUserArmies> list) {
        this.LJJJJ = list;
    }

    @Override // X.InterfaceC974220bSW
    public final void LJLI(GiftModeMeta giftModeMeta) {
        long j;
        this.LJJJJJL = giftModeMeta;
        if (giftModeMeta != null) {
            j = giftModeMeta.giftId;
        } else {
            j = 0;
        }
        this.LJJJJIZL = j;
        if (j == 0) {
            C20441214yg.LIZIZ("LiveMatchModel giftOnly updater = ", "giftOnlyEmpty");
        }
    }

    public final void LJLJI(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Set battle Id ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("LiveMatchModel", C2188811AlT.LIZIZ(sbLIZ));
        C915980Zwa.LJI().LJIIJ().LJJJLL(j);
        this.LJ = j;
    }

    public final void LJLJJI(BattleSetting battleSetting) {
        long j;
        Integer numValueOf;
        GiftModeMeta giftModeMeta;
        GiftModeMeta giftModeMeta2;
        int i;
        this.LJII = battleSetting;
        if (battleSetting != null) {
            j = battleSetting.battleId;
        } else {
            j = 0;
        }
        LJLJI(j);
        this.LJIJI.getClass();
        GiftModeMeta giftModeMeta3 = null;
        if (battleSetting != null) {
            numValueOf = Integer.valueOf(battleSetting.battleType);
        } else {
            numValueOf = null;
        }
        this.LIZLLL = C918130a03.LIZ(numValueOf);
        if (battleSetting != null) {
            giftModeMeta = battleSetting.giftModeMeta;
        } else {
            giftModeMeta = null;
        }
        LJLI(giftModeMeta);
        C974450bSt c974450bSt = C973890bRz.LIZ;
        C974450bSt c974450bSt2 = C973890bRz.LIZ;
        c974450bSt2.LJLJI(battleSetting);
        C973890bRz.LJIIIZ = this.LIZLLL;
        if (battleSetting != null) {
            giftModeMeta2 = battleSetting.giftModeMeta;
        } else {
            giftModeMeta2 = null;
        }
        c974450bSt2.LJLI(giftModeMeta2);
        if (battleSetting != null) {
            i = battleSetting.gameplayOption;
        } else {
            i = 0;
        }
        this.LJIILLIIL = i;
        if (battleSetting != null) {
            giftModeMeta3 = battleSetting.giftModeMeta;
        }
        this.LJIILL = C978440bZK.LJII(giftModeMeta3);
    }

    public C975960bVK(EnumC975850bV9 enumC975850bV9, boolean z, Room room) {
        long id;
        User owner;
        this.LIZ = enumC975850bV9;
        this.LIZIZ = z;
        this.LIZJ = room;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveMatchModel init/reset source = ");
        sbLIZ.append(enumC975850bV9);
        sbLIZ.append(" is anchor = ");
        sbLIZ.append(z);
        C20441214yg.LJ("LiveMatchModel", C2188811AlT.LIZIZ(sbLIZ));
        UUID.randomUUID().toString();
        this.LIZLLL = EnumC919170a1j.UNKNOWN;
        this.LJIILIIL = "";
        this.LJIJ = new LinkedHashMap();
        this.LJIJI = new C976920bWs();
        this.LJIJJ = new HashMap();
        this.LJJIZ = new C098J<>();
        if (room != null && (owner = room.getOwner()) != null) {
            id = owner.getId();
        } else {
            id = 0;
        }
        this.LJJJJLL = id;
        this.LJJJLIIL = new MutableLiveData<>(new ArrayList());
        this.LJJJLL = new ArrayList();
        this.LJJJLZIJ = new C975990bVN(this);
        this.LJJLIIIJILLIZJL = 1;
    }
}

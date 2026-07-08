package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkConnectionTypeChangedEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorMatchSettings;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleFeatureFlags;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.CohostContentGuideInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishEffectInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bSt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974450bSt implements InterfaceC973730bRj {
    public final String LIZ;
    public final Function1<C974450bSt, Unit> LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public BattleSetting LJ;
    public boolean LJFF;
    public boolean LJI;
    public GiftMode LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public long LJIIL;
    public GiftMode LJIILIIL;
    public GiftModeMeta LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public long LJJ;
    public BattleUserInfo LJJIFFI;
    public long LJJIIJ;
    public boolean LJJIIJZLJL;
    public long LJJIIZ;
    public int LJJIIZI;
    public long LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJL;
    public long LJJIJLIJ;
    public Map<Long, BattleUserArmies> LJJIL;
    public List<BattleTeamUserArmies> LJJIZ;
    public long LJJJ;
    public EnigmaBattleSetting LJJJI;
    public long LJJJIL;
    public long LJJJJ;
    public BattleFeatureFlags LJJJJI;
    public final MutableLiveData<List<C976480bWA>> LJII = new MutableLiveData<>(new ArrayList());
    public final String LJIIIIZZ = "";
    public final Map<Long, Long> LJJI = new HashMap();
    public final Map<Long, AnchorMatchSettings> LJJII = new LinkedHashMap();
    public C0C9S LJJIII = C0C9S.NONE;
    public int LJJIJIL = 1;

    @Override // X.InterfaceC974340bSi
    public final List<Long> LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC973770bRn
    public final long LJFF() {
        return 0L;
    }

    @Override // X.InterfaceC974470bSv
    public final long LJIIJ() {
        return 0L;
    }

    @Override // X.InterfaceC974470bSv
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC974340bSi
    public final Long LJIIL() {
        return null;
    }

    @Override // X.InterfaceC973820bRs
    public final boolean LJIILLIIL() {
        return false;
    }

    @Override // X.InterfaceC974220bSW
    public final void LJIJ() {
        this.LJIILLIIL = true;
    }

    @Override // X.InterfaceC974340bSi
    public final BattleTeamResult LJIJI() {
        return null;
    }

    @Override // X.InterfaceC974340bSi
    public final List<BattleTeamUserArmies> LJJ() {
        return null;
    }

    @Override // X.InterfaceC974470bSv
    public final void LJJII() {
        this.LJJIIJZLJL = true;
    }

    @Override // X.InterfaceC974470bSv
    public final EnumC919170a1j LJJIJ() {
        return null;
    }

    @Override // X.InterfaceC974220bSW
    public final void LJJIJL() {
        this.LJIILL = true;
    }

    @Override // X.InterfaceC974340bSi
    public final Map<Long, BattleComboInfo> LJJIJLIJ() {
        return null;
    }

    @Override // X.InterfaceC974470bSv
    public final MatchPunishEffectInfo.EffectStruct LJJIZ() {
        return null;
    }

    @Override // X.InterfaceC974340bSi
    public final List<TeamUsersInfo> LJJJ() {
        return null;
    }

    @Override // X.InterfaceC974340bSi
    public final C976480bWA LJJJIL() {
        return null;
    }

    @Override // X.InterfaceC974340bSi
    public final TeamUsersInfo LJJJJLI() {
        return null;
    }

    @Override // X.InterfaceC974220bSW
    public final int LJJJJZI() {
        return 0;
    }

    @Override // X.InterfaceC915660Zw4
    public final void LJJJLL() {
    }

    @Override // X.InterfaceC973770bRn
    public final long LJJZZI() {
        return 0L;
    }

    @Override // X.InterfaceC974380bSm
    public final CohostContentGuideInfo LJL() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C974450bSt)) {
            return false;
        }
        C974450bSt c974450bSt = (C974450bSt) obj;
        return Intrinsics.LJFF(this.LIZ, c974450bSt.LIZ) && Intrinsics.LJFF(this.LIZIZ, c974450bSt.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Function1<C974450bSt, Unit> function1 = this.LIZIZ;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleDataModel(stateKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reset=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC974220bSW
    public final boolean LJ() {
        GiftMode giftMode;
        GiftMode giftMode2 = this.LJIIIZ;
        return (giftMode2 != null ? Long.valueOf(giftMode2.giftId) : null) != null && ((giftMode = this.LJIIIZ) == null || giftMode.giftId != 0);
    }

    @Override // X.InterfaceC974470bSv
    public final EnumC919170a1j LJIIIZ() {
        C974450bSt c974450bSt = C973890bRz.LIZ;
        return C973890bRz.LJIIIZ;
    }

    @Override // X.InterfaceC915660Zw4
    public final BattleUserInfo LJJI() {
        Room room;
        User owner;
        BattleBaseUserInfo battleBaseUserInfo;
        Long l;
        BattleUserInfo battleUserInfo = this.LJJIFFI;
        if ((battleUserInfo == null || (battleBaseUserInfo = battleUserInfo.user) == null || (l = battleBaseUserInfo.userId) == null || l.longValue() <= 0) && (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null && (owner = room.getOwner()) != null) {
            this.LJJIFFI = new BattleUserInfo(new BattleBaseUserInfo(Long.valueOf(owner.getId()), C0KVU.LIZLLL(owner), C0KVU.LJ(owner), owner.getAvatarThumb(), 0L, 0), null, 2, null);
        }
        return this.LJJIFFI;
    }

    @Override // X.InterfaceC974470bSv
    public final long LJJL() {
        if (this.LIZLLL == 0) {
            this.LIZLLL = C915980Zwa.LJI().LJIIJ().getChannelId();
        }
        return this.LIZLLL;
    }

    public final long LJLIIIL() {
        BattleSetting battleSetting = this.LJ;
        return battleSetting != null ? battleSetting.battleId : this.LIZJ;
    }

    public final long LJLIIL() {
        BattleSetting battleSetting = this.LJ;
        return battleSetting != null ? battleSetting.channelId : C915980Zwa.LJI().LJIIJ().getChannelId();
    }

    public final EnumC964170bCJ LJLIL() {
        DataChannel dataChannel;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = LinkCrossRoomDataHolder.LJLLI;
        if (linkCrossRoomDataHolder2 == null || (dataChannel = linkCrossRoomDataHolder2.LIZIZ) == null) {
            return EnumC964170bCJ.NONE;
        }
        if (Intrinsics.LJFF("data_battle_state", this.LIZ)) {
            EnumC964170bCJ enumC964170bCJ = (EnumC964170bCJ) dataChannel.gg0(BattleStateChannel.class);
            return enumC964170bCJ == null ? EnumC964170bCJ.NONE : enumC964170bCJ;
        }
        EnumC964170bCJ enumC964170bCJ2 = (EnumC964170bCJ) dataChannel.gg0(BattleReMatchStateChannel.class);
        return enumC964170bCJ2 == null ? EnumC964170bCJ.NONE : enumC964170bCJ2;
    }

    @Override // X.InterfaceC974220bSW
    public final boolean LJIILL() {
        GiftModeMeta giftModeMeta;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isGiftOnlyMode, gift = ");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", giftId = ");
        GiftModeMeta giftModeMeta2 = this.LJIILJJIL;
        sbLIZ.append(giftModeMeta2 != null ? Long.valueOf(giftModeMeta2.giftId) : null);
        C20441214yg.LIZIZ("BattleDataTag", C2188811AlT.LIZIZ(sbLIZ));
        GiftModeMeta giftModeMeta3 = this.LJIILJJIL;
        return (giftModeMeta3 != null ? Long.valueOf(giftModeMeta3.giftId) : null) != null && ((giftModeMeta = this.LJIILJJIL) == null || giftModeMeta.giftId != 0);
    }

    @Override // X.InterfaceC974470bSv
    public final boolean LIZ() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC974470bSv
    public final BattleFeatureFlags LIZJ() {
        return this.LJJJJI;
    }

    @Override // X.InterfaceC915660Zw4
    public final Map<Long, AnchorMatchSettings> LJII() {
        return this.LJJII;
    }

    @Override // X.InterfaceC974220bSW
    public final GiftModeMeta LJIIIIZZ() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC915660Zw4
    public final BattleSetting LJIILIIL() {
        return this.LJ;
    }

    @Override // X.InterfaceC914410Zu3
    public final long LJIILJJIL() {
        return this.LJJIJ;
    }

    @Override // X.InterfaceC975610bUl
    public final long LJIJJ() {
        return this.LJJJJ;
    }

    @Override // X.InterfaceC974470bSv
    public final boolean LJIJJLI() {
        return this.LJI;
    }

    @Override // X.InterfaceC914410Zu3
    public final int LJJIII() {
        return this.LJJIJIL;
    }

    @Override // X.InterfaceC974220bSW
    public final boolean LJJIIJ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC975610bUl
    public final EnigmaBattleSetting LJJIIJZLJL() {
        return this.LJJJI;
    }

    @Override // X.InterfaceC914410Zu3
    public final int LJJIIZ() {
        return this.LJJIIZI;
    }

    @Override // X.InterfaceC974470bSv
    public final String LJJIIZI() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC974220bSW
    public final boolean LJJIJIIJI() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC974470bSv
    public final boolean LJJIJIIJIL() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC973770bRn
    public final long LJJIJIL() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC974220bSW
    public final GiftMode LJJIL() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC974470bSv
    public final boolean LJJJI() {
        return this.LJJIIJZLJL;
    }

    @Override // X.InterfaceC975610bUl
    public final long LJJJJ() {
        return this.LJJJIL;
    }

    @Override // X.InterfaceC974470bSv
    public final boolean LJJJJI() {
        return this.LJFF;
    }

    @Override // X.InterfaceC974470bSv
    public final MutableLiveData<List<C976480bWA>> LJJJJIZL() {
        return this.LJII;
    }

    @Override // X.InterfaceC974340bSi
    public final long LJJJJJ() {
        return this.LJJIIJ;
    }

    @Override // X.InterfaceC974470bSv
    public final long LJJJJJL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC974220bSW
    public final GiftMode LJJJJZ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC973770bRn
    public final long LJJJLIIL() {
        return this.LJIL;
    }

    @Override // X.InterfaceC914410Zu3
    public final boolean LJJJLZIJ() {
        return this.LJJIJIIJI;
    }

    @Override // X.InterfaceC974470bSv
    public final List<BattleTeamUserArmies> LJJLI() {
        return this.LJJIZ;
    }

    @Override // X.InterfaceC973770bRn
    public final long LJJLIIIJ() {
        return this.LJJJ;
    }

    @Override // X.InterfaceC914410Zu3
    public final boolean LJJLIIIJJI() {
        return this.LJJIJIIJIL;
    }

    @Override // X.InterfaceC914410Zu3
    public final long LJJLIIIJLLLLLLLZ() {
        return this.LJJIIZ;
    }

    @Override // X.InterfaceC974220bSW
    public final boolean LJJLIIJ() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC974470bSv
    public final Map<Long, Long> LJJLJLI() {
        return this.LJJI;
    }

    @Override // X.InterfaceC974470bSv
    public final Map<Long, BattleUserArmies> LJJLL() {
        return this.LJJIL;
    }

    @Override // X.InterfaceC973770bRn
    public final long LJJZ() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC973770bRn
    public final long er() {
        return this.LJIJJLI;
    }

    @Override // X.InterfaceC974220bSW
    public final long q9() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC973770bRn
    public final void LIZIZ(long j) {
        this.LJJJ = j;
    }

    @Override // X.InterfaceC974470bSv
    public final void LJI(Map<Long, BattleUserArmies> map) {
        this.LJJIL = map;
    }

    @Override // X.InterfaceC974220bSW
    public final void LJIIZILJ(boolean z) {
        this.LJIIJJI = z;
    }

    @Override // X.InterfaceC914410Zu3
    public final void LJIL(boolean z) {
        this.LJJIJIIJI = z;
    }

    @Override // X.InterfaceC914410Zu3
    public final void LJJIFFI(int i) {
        this.LJJIJIL = i;
    }

    @Override // X.InterfaceC914410Zu3
    public final void LJJJJL(boolean z) {
        this.LJJIJIIJIL = z;
    }

    @Override // X.InterfaceC914410Zu3
    public final void LJJJJLL(long j) {
        this.LJJIJ = j;
    }

    @Override // X.InterfaceC974470bSv
    public final void LJJJZ(boolean z) {
        this.LJI = true;
    }

    @Override // X.InterfaceC974220bSW
    public final void LJJLIIIIJ(long j) {
        this.LJIIL = j;
    }

    @Override // X.InterfaceC975610bUl
    public final void LJJLIIIJILLIZJL(long j) {
        this.LJJJIL = j;
    }

    @Override // X.InterfaceC914410Zu3
    public final void LJJLIIIJJIZ(long j) {
        this.LJJIIZ = j;
    }

    @Override // X.InterfaceC975610bUl
    public final void LJJLIIIJL(long j) {
        this.LJJJJ = j;
    }

    @Override // X.InterfaceC914410Zu3
    public final void LJJLIIIJLJLI(int i) {
        this.LJJIIZI = i;
    }

    @Override // X.InterfaceC974470bSv
    public final void LJJLIL(long j) {
        this.LJJIJLIJ = j;
    }

    @Override // X.InterfaceC974220bSW
    public final void LJJLJ(GiftMode giftMode) {
        long j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setGiftOnlyGift, giftMode = ");
        sbLIZ.append(giftMode);
        C20441214yg.LIZIZ("BattleDataTag", C2188811AlT.LIZIZ(sbLIZ));
        if (giftMode != null) {
            j = giftMode.giftId;
        } else {
            j = 0;
        }
        this.LJIIL = j;
        this.LJIILIIL = giftMode;
    }

    @Override // X.InterfaceC974470bSv
    public final void LJJZZIII(List<BattleTeamUserArmies> list) {
        this.LJJIZ = list;
    }

    @Override // X.InterfaceC974220bSW
    public final void LJLI(GiftModeMeta giftModeMeta) {
        long j;
        this.LJIILJJIL = giftModeMeta;
        if (giftModeMeta != null) {
            j = giftModeMeta.giftId;
        } else {
            j = 0;
        }
        this.LJIIL = j;
    }

    public final void LJLJI(BattleSetting battleSetting) {
        long j;
        GiftModeMeta giftModeMeta;
        this.LJ = battleSetting;
        if (battleSetting != null) {
            j = battleSetting.battleId;
        } else {
            j = 0;
        }
        C915980Zwa.LJI().LJIIJ().LJJJLL(j);
        this.LIZJ = j;
        this.LJJ = LJLIIL();
        GiftModeMeta giftModeMeta2 = null;
        if (battleSetting != null) {
            giftModeMeta = battleSetting.giftModeMeta;
        } else {
            giftModeMeta = null;
        }
        LJLI(giftModeMeta);
        if (battleSetting != null) {
            giftModeMeta2 = battleSetting.giftModeMeta;
        }
        this.LJIIIZ = C978440bZK.LJII(giftModeMeta2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C974450bSt(String str, Function1<? super C974450bSt, Unit> function1) {
        this.LIZ = str;
        this.LIZIZ = function1;
    }

    public final void LJLILLLLZI(String str, boolean z) {
        DataChannel dataChannel;
        InterfaceC2262081DgM currentUser;
        String idStr;
        String strLIZ;
        String idStr2;
        long id;
        int i;
        LiveMode streamType;
        long currentUserId;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("  source = ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("BattleDataModelReset", C2188811AlT.LIZIZ(sbLIZ));
        Function1<C974450bSt, Unit> function1 = this.LIZIZ;
        if (function1 != null) {
            function1.invoke(this);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        boolean z3 = false;
        if (room != null) {
            long ownerUserId = room.getOwnerUserId();
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            } else {
                currentUserId = 0;
            }
            if (ownerUserId == currentUserId) {
                z2 = true;
            } else {
                z2 = false;
            }
            C974480bSw.LIZ.LJJI(str, z2, z);
        }
        if (!C500260Jjc.LJIJ(dataChannelGlobal) && this.LJJIII != C0C9S.NONE && LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_match_identify", 0.2d)) {
            JSONObject jSONObject = new JSONObject();
            InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
            if (interfaceC500940JkiUser2 != null) {
                currentUser = interfaceC500940JkiUser2.getCurrentUser();
            } else {
                currentUser = null;
            }
            Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (Room.isValid(room2)) {
                if (room2 != null) {
                    idStr = room2.getIdStr();
                } else {
                    idStr = null;
                }
            } else {
                idStr = CardStruct.IStatusCode.DEFAULT;
            }
            C0K04.LJFF("room_id", idStr, jSONObject);
            if (room2 != null && (streamType = room2.getStreamType()) != null) {
                strLIZ = C354201Zc.LIZ(streamType);
            } else {
                strLIZ = null;
            }
            C0K04.LJFF("live_type", strLIZ, jSONObject);
            if (!jSONObject.has("channel_id")) {
                C0K04.LJ("channel_id", C915980Zwa.LJI().LJIIJ().getChannelId(), jSONObject);
            }
            if (!jSONObject.has("battle_id")) {
                C0K04.LJ("battle_id", LJLIIIL(), jSONObject);
            }
            if (room2 == null || (idStr2 = room2.getIdStr()) == null) {
                idStr2 = "";
            }
            C0K04.LJFF("anchor_id", idStr2, jSONObject);
            if (currentUser != null) {
                id = currentUser.getId();
            } else {
                id = 0;
            }
            C0K04.LJ("current_user_id", id, jSONObject);
            C0K04.LJFF("identify_status", this.LJJIII.getValue(), jSONObject);
            C0K04.LJ("time", System.currentTimeMillis() - 0, jSONObject);
            C0K04.LJFF("match_progress_opt", "1", jSONObject);
            C974480bSw.LJIJ(jSONObject, false);
            if (this.LJJIII == C0C9S.MATCH_SEI) {
                i = 0;
            } else {
                i = 1;
            }
            C1CC2.LJIIIIZZ("ttlive_client_match_identify", i, jSONObject);
        }
        this.LJJIII = C0C9S.NONE;
        this.LIZJ = 0L;
        this.LJJ = 0L;
        this.LJFF = false;
        this.LJIJJLI = 0L;
        this.LJIL = 0L;
        this.LJIIZILJ = 0L;
        this.LJIJ = 0L;
        this.LJI = false;
        this.LJJIIJ = 0L;
        this.LJ = null;
        this.LJJIIJZLJL = false;
        this.LJIJI = false;
        this.LJIJJ = false;
        this.LJJIFFI = null;
        this.LJJIJIL = 1;
        this.LJJIIZ = 0L;
        this.LJJIJ = 0L;
        this.LJJIIZI = 0;
        this.LJJIJL = false;
        this.LJIIL = 0L;
        LJLI(null);
        this.LJIILL = false;
        this.LJIILLIIL = false;
        this.LJJIL = null;
        this.LJJIZ = null;
        this.LJJJI = null;
        this.LJJJIL = 0L;
        this.LJJJJ = 0L;
        this.LJJJJI = null;
        EnumC964170bCJ enumC964170bCJ = EnumC964170bCJ.NONE;
        EnumC964170bCJ enumC964170bCJLJLIL = LJLIL();
        if (enumC964170bCJLJLIL != enumC964170bCJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateState, old State = ");
            sbLIZ2.append(enumC964170bCJLJLIL);
            sbLIZ2.append("; targetState = ");
            sbLIZ2.append(enumC964170bCJ);
            C20441214yg.LJIIIZ("BattleDataTag", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateState, success targetState = ");
            sbLIZ3.append(enumC964170bCJ);
            C20441214yg.LJIIIZ("BattleDataTag", C2188811AlT.LIZIZ(sbLIZ3));
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
            LinkCrossRoomDataHolder linkCrossRoomDataHolderLIZIZ = C464550IJp.LIZIZ();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("updateState, success stateKey = ");
            sbLIZ4.append(this.LIZ);
            C20441214yg.LJIIIZ("BattleDataTag", C2188811AlT.LIZIZ(sbLIZ4));
            if (Intrinsics.LJFF("data_battle_state", this.LIZ)) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("updateState, success stateKey = ");
                if (linkCrossRoomDataHolderLIZIZ.LIZIZ == null) {
                    z3 = true;
                }
                sbLIZ5.append(z3);
                C20441214yg.LJIIIZ("BattleDataTag", C2188811AlT.LIZIZ(sbLIZ5));
                DataChannel dataChannel2 = linkCrossRoomDataHolderLIZIZ.LIZIZ;
                if (dataChannel2 != null) {
                    dataChannel2.zW(BattleStateChannel.class, enumC964170bCJ);
                }
            } else {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("updateState, rematch success stateKey = ");
                if (linkCrossRoomDataHolderLIZIZ.LIZIZ == null) {
                    z3 = true;
                }
                sbLIZ6.append(z3);
                C20441214yg.LJIIIZ("BattleDataTag", C2188811AlT.LIZIZ(sbLIZ6));
                DataChannel dataChannel3 = linkCrossRoomDataHolderLIZIZ.LIZIZ;
                if (dataChannel3 != null) {
                    dataChannel3.zW(BattleReMatchStateChannel.class, enumC964170bCJ);
                }
            }
            if (C500260Jjc.LJIJI(linkCrossRoomDataHolderLIZIZ.LIZIZ) && (dataChannel = linkCrossRoomDataHolderLIZIZ.LIZIZ) != null) {
                dataChannel.FQ2(LinkConnectionTypeChangedEvent.class);
            }
        }
    }
}

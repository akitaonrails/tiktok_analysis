package X;

import Y.ARunnableS48S0300000_15;
import Y.ARunnableS84S0200000_15;
import Y.ARunnableS9S0310000_15;
import Y.AfS0S0310100_15;
import Y.AfS0S0411200_15;
import Y.AfS1S0210100_15;
import Y.AfS2S0201100_15;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.api.TwoMatchApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4004049FixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4029011FixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviteMockSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchIsPlaybookFoldable;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS8S0100200_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bY0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977620bY0 extends C0TW5 {
    public static final /* synthetic */ int LJJIL = 0;
    public final MutableLiveData<Boolean> LJIILIIL;
    public final MutableLiveData LJIILJJIL;
    public final MutableLiveData<Boolean> LJIILL;
    public final MutableLiveData LJIILLIIL;
    public final MutableLiveData<C977730bYB> LJIIZILJ;
    public final MutableLiveData LJIJ;
    public final MutableLiveData<Boolean> LJIJI;
    public boolean LJIJJ;
    public final MutableLiveData<C977820bYK> LJIJJLI;
    public final MutableLiveData LJIL;
    public final MutableLiveData<Integer> LJJ;
    public final MutableLiveData LJJI;
    public final C979030baH LJJIFFI;
    public long LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public C501470JlZ LJJIIZI;
    public final Map<Long, Long> LJJIJ;
    public Integer LJJIJIIJI;
    public Integer LJJIJIIJIL;
    public C979520bb4 LJJIJIL;
    public final C977980bYa LJJIJL;
    public C957560b1e LJJIJLIJ;

    @Override // X.C0TW5, X.InterfaceC969510bKv
    public final void onCleared() {
        this.LJJIIJ = true;
        super.onCleared();
        MutableLiveData<Boolean> mutableLiveData = this.LJIILIIL;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJIILL.setValue(bool);
        this.LJJIIJZLJL = false;
        this.LJJIIZ = false;
        this.LJIIZILJ.setValue(new C977730bYB(null, null, null, null));
        this.LJIJJLI.setValue(new C977820bYK(new C410901il(), 0, 0, 14, 0));
        this.LJJII = 0L;
        this.LJJIJIIJI = null;
        this.LJJIJIIJIL = null;
        ((LinkedHashMap) this.LJJIJ).clear();
    }

    public final void LJIIL() {
        ((LinkedHashMap) this.LJJIJ).clear();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearBattleIdMap, _battleId =  ");
        sbLIZ.append(this.LJJII);
        C20441214yg.LIZIZ("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LJIILIIL() {
        this.LJIILL.setValue(Boolean.FALSE);
        this.LJJIIJZLJL = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("battleIdMap.isEmpty() ");
        sbLIZ.append(this.LJJIJ.isEmpty());
        C20441214yg.LIZIZ("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        return this.LJJIJ.isEmpty();
    }

    public final void LJIILLIIL() {
        C410901il c410901il;
        if (this.LJJIFFI.LJII && LiveMatchIsPlaybookFoldable.INSTANCE.isEnabled()) {
            C977820bYK value = this.LJIJJLI.getValue();
            if (value == null || (c410901il = value.LIZ) == null) {
                c410901il = new C410901il();
            }
            Pair<Integer, Integer> pairLJ = this.LJJIFFI.LJ(c410901il);
            int iIntValue = pairLJ.getFirst().intValue();
            int iIntValue2 = pairLJ.getSecond().intValue();
            C979030baH c979030baH = this.LJJIFFI;
            boolean z = c979030baH.LIZLLL;
            this.LJJ.setValue(Integer.valueOf(c979030baH.LJI));
            this.LJIJJLI.setValue(new C977820bYK(c410901il, 1, c410901il.indexOf(this.LJJIFFI.LIZ), 8, 0));
            this.LJIJJLI.setValue(new C977820bYK(c410901il, z ? 2 : 3, iIntValue, iIntValue2));
        }
    }

    public final void LJIIZILJ() {
        C410901il c410901il;
        Pair pair;
        int iNextIndex;
        C977820bYK value = this.LJIJJLI.getValue();
        if (value == null || (c410901il = value.LIZ) == null) {
            c410901il = new C410901il();
        }
        this.LJJIFFI.getClass();
        Iterator<Object> it2 = c410901il.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!(it2.next() instanceof C979040baI)) {
                i++;
            } else if (i != -1) {
                ListIterator<Object> listIterator = c410901il.listIterator(c410901il.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (listIterator.previous() instanceof C980060bbw) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                int i2 = 1;
                if (iNextIndex == -1) {
                    c410901il.subList(i, i + 1).clear();
                } else {
                    i2 = (iNextIndex - i) + 1;
                    c410901il.subList(i, iNextIndex + 1).clear();
                }
                pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
        pair = new Pair(-1, -1);
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        if (iIntValue != -1) {
            this.LJIJJLI.setValue(new C977820bYK(c410901il, 3, iIntValue, iIntValue2));
            this.LJJ.setValue(-1);
        }
    }

    public final boolean LJJ() {
        if (!LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            C20441214yg.LIZIZ("TwoMatchInviterViewModel", "shouldCancelCoHostInvitationFirst QuickBattle not enabled");
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldCancelCoHostInvitationFirst inviteType=");
        sbLIZ.append(this.LJJIJIIJIL);
        C20441214yg.LIZIZ("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Integer num = this.LJJIJIIJIL;
        return num != null && num.intValue() == 5;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0bYa] */
    public C977620bY0() {
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.LJIILIIL = mutableLiveData;
        this.LJIILJJIL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LJIILL = mutableLiveData2;
        this.LJIILLIIL = mutableLiveData2;
        MutableLiveData<C977730bYB> mutableLiveData3 = new MutableLiveData<>();
        this.LJIIZILJ = mutableLiveData3;
        this.LJIJ = mutableLiveData3;
        this.LJIJI = new MutableLiveData<>(bool);
        MutableLiveData<C977820bYK> mutableLiveData4 = new MutableLiveData<>(new C977820bYK(new C410901il(), 0, 0, 14, 0));
        this.LJIJJLI = mutableLiveData4;
        this.LJIL = mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5 = new MutableLiveData<>(0);
        this.LJJ = mutableLiveData5;
        this.LJJI = mutableLiveData5;
        this.LJJIFFI = new C979030baH();
        this.LJJIJ = new LinkedHashMap();
        this.LJJIJIL = new C979520bb4(-1, -1);
        this.LJJIJL = new Object() { // from class: X.0bYa
        };
        this.LJJIJLIJ = new C957560b1e(0, 3);
    }

    public final void LJIJI(C950840aqo c950840aqo) {
        LJIILL(false, C973660bRc.LJJLIIIJL, (List) this.LIZJ.getValue(), null, true);
        C915980Zwa.LJIIIZ().LIZIZ(EnumC959750b5B.TYPE_TEAM_PAIR_BUTTON_CLICK, c950840aqo);
    }

    public final void LJIIJJI(EnumC976510bWD enumC976510bWD, boolean z) {
        long j;
        List<C954460awe> list;
        C954460awe c954460awe;
        Map<Boolean, List<C954460awe>> value = this.LJFF.getValue();
        if (value != null && (list = value.get(Boolean.FALSE)) != null && (c954460awe = (C954460awe) C13LP.LJJJLZIJ(0, list)) != null) {
            j = c954460awe.LJ;
        } else {
            j = 0;
        }
        if (LJJ()) {
            C20441214yg.LIZIZ("TwoMatchInviterViewModel", "CoHost inviteCancel is called.");
            LJIIJ(j, this.LJJIJLIJ.LIZIZ, this.LJJIJIIJI);
            return;
        }
        this.LJIILL.setValue(Boolean.TRUE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel invitation , reason = ");
        sbLIZ.append(enumC976510bWD);
        C20441214yg.LJ("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        long j2 = this.LJJII;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cancelInvitation for targetUid: ");
        sbLIZ2.append(j);
        sbLIZ2.append(", found battleId: ");
        sbLIZ2.append(j2);
        C20441214yg.LIZIZ("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ2));
        LJIJ(j2, z, enumC976510bWD, j, this.LJJIJIIJIL, this.LJJIJIIJI, null);
    }

    public final void LJIILJJIL(long j, EnumC975850bV9 enumC975850bV9) {
        long id;
        List<C954460awe> list;
        C954460awe c954460awe;
        DataChannel dataChannel;
        Long l;
        User owner;
        MutableLiveData<Boolean> mutableLiveData = this.LJIILL;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJJIIJZLJL = false;
        this.LJIILIIL.setValue(Boolean.TRUE);
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ);
        long j2 = 0;
        if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
            id = owner.getId();
        } else {
            id = 0;
        }
        long jLIZ = C978480bZO.LIZ(true);
        int i = LiveDirectMatchSetting.INSTANCE.getValue().inviterTimeout;
        if (this.LJJII == j && (dataChannel = this.LIZ) != null && (l = (Long) dataChannel.gg0(BattleInvitingTimeLeftChannel.class)) != null) {
            jLIZ = l.longValue();
        }
        if (enumC975850bV9 == EnumC975850bV9.INVITER_FROM_PROFILE || enumC975850bV9 == EnumC975850bV9.SOLO_INVITER_FROM_JSB || enumC975850bV9 == EnumC975850bV9.INVITER_FROM_FRIEND_RANK) {
            jLIZ = i;
        }
        this.LJJII = j;
        Map<Boolean, List<C954460awe>> value = this.LJFF.getValue();
        if (value != null && (list = value.get(bool)) != null && (c954460awe = (C954460awe) C13LP.LJJJLZIJ(0, list)) != null) {
            j2 = c954460awe.LJ;
        }
        LJIIZILJ();
        LJIIIIZZ(id, true);
        LJFF(this.LIZ, jLIZ, new AwS8S0100200_15(this, j2, j, 1));
    }

    public final void LJIL(C975600bUk c975600bUk, Function0<Unit> function0) {
        if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
            if (this.LJJIIJZLJL) {
                C20441214yg.LJIIL("TwoMatchInviterViewModel", "sendInviteWithEvent blocked: invite already in flight");
                C974540bT2.LIZ.LL("invite_in_flight");
                return;
            } else if (this.LJJII != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendInviteWithEvent blocked: active battleId=");
                sbLIZ.append(this.LJJII);
                C20441214yg.LJIIL("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
                C974540bT2.LIZ.LL("active_battle_id");
                return;
            }
        }
        this.LJJIIJZLJL = true;
        this.LJJIIJ = false;
        this.LJIILL.setValue(Boolean.TRUE);
        this.LJIILIIL.setValue(Boolean.FALSE);
        this.LJJIJLIJ = c975600bUk.LJI;
        LJIJJ(false, Long.valueOf(c975600bUk.LIZ), 5, c975600bUk.LIZLLL, c975600bUk.LJ, Integer.valueOf(this.LJJIJLIJ.LIZ), c975600bUk.LJFF, function0);
        if (LiveMatchInviteMockSetting.INSTANCE.isDuplicateInviteEnabled() && !this.LJJIIZ) {
            this.LJJIIZ = true;
            C20441214yg.LJIIL("TwoMatchInviterViewModel", "MOCK: scheduling duplicate sendInviteWithEvent to test VM-level guard");
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS48S0300000_15(this, c975600bUk, function0, 13));
        }
    }

    public static final void LJIIJ(long j, long j2, Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C920580a40 c920580a40 = new C920580a40(0, 0L, j, j2, C2097908Jt.LIZJ(new Pair("invite_type", Integer.valueOf(iIntValue))), null, null, 208);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Call Co-Host inviteCancel param = ");
        sbLIZ.append(c920580a40);
        C20441214yg.LIZIZ("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C915980Zwa.LJII().LLJJLIIIJLLLLLLLZ(c920580a40, null, C915280ZvS.LIZ);
    }

    public final void LJIJJLI(boolean z, Long l, EnumC919170a1j enumC919170a1j) {
        ArrayList arrayList;
        List<C954460awe> list;
        List<C954460awe> list2;
        if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
            if (this.LJJIIJZLJL) {
                C20441214yg.LJIIL("TwoMatchInviterViewModel", "sendInvite blocked: invite already in flight");
                C974540bT2.LIZ.LL("invite_in_flight");
                return;
            } else if (this.LJJII != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendInvite blocked: active battleId=");
                sbLIZ.append(this.LJJII);
                C20441214yg.LJIIL("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
                C974540bT2.LIZ.LL("active_battle_id");
                return;
            }
        }
        this.LJJIIJZLJL = true;
        int i = 0;
        this.LJJIIJ = false;
        MutableLiveData<Boolean> mutableLiveData = this.LJIILL;
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(bool);
        this.LJIILIIL.setValue(Boolean.FALSE);
        if (LiveMatchInvite4029011FixSetting.INSTANCE.isEnabled()) {
            LJIIZILJ();
        }
        this.LJII.setValue(new HashMap());
        List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
        if (!listLJJLI.isEmpty()) {
            LIZLLL(listLJJLI);
        }
        if (Intrinsics.LJFF(C915980Zwa.LJI().LJIIJ().LJJIJIIJI(), EnumC973640bRa.PK_REMATCH.getValue())) {
            i = 6;
        } else if (z) {
            i = 1;
        }
        Map<Boolean, List<C954460awe>> value = this.LJFF.getValue();
        ArrayList arrayList2 = null;
        if (value != null && (list2 = value.get(bool)) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C954460awe> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().LJ));
            }
        } else {
            arrayList = null;
        }
        Map<Boolean, List<C954460awe>> value2 = this.LJFF.getValue();
        if (value2 != null && (list = value2.get(Boolean.FALSE)) != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C954460awe> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Long.valueOf(it3.next().LJ));
            }
        }
        LJIJJ(z, l, i, arrayList, arrayList2, null, null, null);
        LiveMatchInviteMockSetting liveMatchInviteMockSetting = LiveMatchInviteMockSetting.INSTANCE;
        if (liveMatchInviteMockSetting.isVmClearedEnabled()) {
            C20441214yg.LJIIL("TwoMatchInviterViewModel", "MOCK: forcing isCleared=true to simulate VM-cleared race");
            this.LJJIIJ = true;
        }
        if (liveMatchInviteMockSetting.isDuplicateInviteEnabled() && !this.LJJIIZ) {
            this.LJJIIZ = true;
            C20441214yg.LJIIL("TwoMatchInviterViewModel", "MOCK: scheduling duplicate sendInvite to test VM-level guard");
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS9S0310000_15(this, z, l, enumC919170a1j, 2));
        }
    }

    public static final void LJIILL(boolean z, String str, List list, List list2, boolean z2) {
        String str2;
        long j;
        C954460awe c954460awe;
        C925640aCA.LJ(C915980Zwa.LJI().LJIIJ().LJJIJIIJI());
        boolean zLJFF = Intrinsics.LJFF(str, C973660bRc.LJJLIIIJL);
        if (zLJFF) {
            str2 = "2v2";
        } else {
            str2 = "1v1";
        }
        if (!zLJFF && list2 != null && (c954460awe = (C954460awe) C13LP.LJJJLL(list2)) != null) {
            j = c954460awe.LJ;
        } else {
            j = 0;
        }
        C973660bRc.LIZ.LJLJLLL(j, list, list2, z2, z, str2, str, C915980Zwa.LJI().LIZ().LJIILLIIL());
    }

    public final void LJIJ(long j, boolean z, EnumC976510bWD enumC976510bWD, long j2, Integer num, Integer num2, C957590b1h c957590b1h) {
        Room room;
        int i;
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        EnumC976510bWD.Companion.getClass();
        c974540bT2.LJJJJZ(j, C976520bWE.LIZ(enumC976510bWD), z);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            room = new Room();
        }
        long channelId = C915980Zwa.LJII().getChannelId();
        long jLJJL = 0;
        if (channelId == 0) {
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf2 != null) {
                jLJJL = interfaceC973730bRjYf2.LJJL();
            }
        } else {
            jLJJL = channelId;
        }
        C480460Ism.LIZ().getClass();
        TwoMatchApi twoMatchApi = (TwoMatchApi) C480460Ism.LIZLLL(TwoMatchApi.class);
        long id = room.getId();
        switch (C976380bW0.LIZIZ[enumC976510bWD.ordinal()]) {
            case 1:
            case 3:
            case 5:
            case 6:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 4:
                i = 4;
                break;
            default:
                throw new C1954807lC();
        }
        twoMatchApi.cancel(id, jLJJL, j, i, num, num2, Long.valueOf(j2)).LJIILIIL(new C0UO0()).LJJLL(new AfS0S0310100_15(enumC976510bWD, z, this, c957590b1h, j, 3), new AfS1S0210100_15(j, z, this, c957590b1h, 2));
    }

    public final void LJIJJ(boolean z, Long l, int i, List<Long> list, List<Long> list2, Integer num, C954360awU c954360awU, Function0<Unit> function0) {
        Object objLJJJLL;
        long id;
        long jLongValue;
        long id2;
        long jLongValue2;
        long jLongValue3;
        boolean zBooleanValue;
        String str;
        List<C954460awe> list3;
        List<C954460awe> list4;
        User owner;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inviteType=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Long l2 = null;
        if (i != 5) {
            List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
            if (!(listLJIJJ instanceof Collection) || !listLJIJJ.isEmpty()) {
                Iterator<C954460awe> it2 = listLJIJJ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().LJIIJ()) {
                        this.LJIIZILJ.setValue(C977730bYB.LIZ(new C977730bYB(null, null, null, null), null, new C977870bYP(), null, null, 13));
                        LJIILIIL();
                        C974540bT2 c974540bT2 = C974540bT2.LIZ;
                        C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.HOSTS_CHANGED, i, z, EnumC919170a1j.MATCH_TYPE_1V1, 4);
                        C20441214yg.LJIIL("TwoMatchInviterViewModel", "Has unlinked host, can not send invite");
                        break;
                    }
                }
            }
        }
        this.LJJIII = z;
        this.LJJIJIIJIL = Integer.valueOf(i);
        this.LJJIJIIJI = num;
        C501470JlZ c501470JlZ = this.LJJIIZI;
        if (c501470JlZ != null) {
            this.LJJIIZI = null;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MOCK: bypassing invite API; posting onInviteFailed with errorCode=");
            sbLIZ2.append(Integer.valueOf(c501470JlZ.getErrorCode()));
            C20441214yg.LJIIL("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            C786410Ut5.LJJZZIII(C0IK5.LIZ(), new ARunnableS84S0200000_15(this, c501470JlZ, 76));
            return;
        }
        long channelId = C915980Zwa.LJII().getChannelId();
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        } else {
            objLJJJLL = null;
        }
        if (list2 != null) {
            l2 = (Long) C13LP.LJJJLL(list2);
        }
        if (objLJJJLL != null && l2 != null) {
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ);
            if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(this.LIZ);
            if (roomLJJLIIIIJ2 != null) {
                id2 = roomLJJLIIIIJ2.getId();
            } else {
                id2 = 0;
            }
            C974540bT2.LIZ.LJJLIIIJ(i);
            System.currentTimeMillis();
            int iLJIIIZ = C978520bZS.LJIIIZ();
            if (l != null) {
                jLongValue2 = l.longValue();
            } else {
                jLongValue2 = 0;
            }
            Pair pairLIZIZ = C156900it.LIZIZ(iLJIIIZ, jLongValue2);
            int iIntValue = ((Number) pairLIZIZ.getFirst()).intValue();
            String str2 = (String) pairLIZIZ.getSecond();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("inviteType=");
            sbLIZ3.append(i);
            sbLIZ3.append(", selfTeamUser=");
            sbLIZ3.append(objLJJJLL);
            sbLIZ3.append(", rivalTeamUser=");
            sbLIZ3.append(l2);
            sbLIZ3.append(", roomId=");
            sbLIZ3.append(id2);
            sbLIZ3.append(", channelId=");
            sbLIZ3.append(channelId);
            sbLIZ3.append(", gameplayOption=");
            sbLIZ3.append(iLJIIIZ);
            C20441214yg.LIZIZ("TwoMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ3));
            C480460Ism.LIZ().getClass();
            TwoMatchApi twoMatchApi = (TwoMatchApi) C480460Ism.LIZLLL(TwoMatchApi.class);
            if (l != null) {
                jLongValue3 = l.longValue();
            } else {
                jLongValue3 = 0;
            }
            long jLIZ = C975070bTt.LIZ(iLJIIIZ, jLongValue3);
            Boolean value = this.LJIJI.getValue();
            if (value != null) {
                zBooleanValue = value.booleanValue();
            } else {
                zBooleanValue = false;
            }
            twoMatchApi.invite(id2, channelId, jLongValue, i, jLIZ, zBooleanValue, iLJIIIZ, num, iIntValue, str2, C974540bT2.LJJII()).LJIILIIL(new C0UO0()).LJJLL(new AfS0S0411200_15(this, i, id, jLongValue, num, function0, z, c954360awU, 1), new AfS2S0201100_15(i, id, this, c954360awU, 3));
            if (this.LJIJJ) {
                str = C973660bRc.LJJLIIIJJIZ;
            } else {
                str = C973660bRc.LJJLIIIJJI;
            }
            Map<Boolean, List<C954460awe>> value2 = this.LJFF.getValue();
            if (value2 != null) {
                list3 = value2.get(Boolean.TRUE);
            } else {
                list3 = null;
            }
            Map<Boolean, List<C954460awe>> value3 = this.LJFF.getValue();
            if (value3 != null) {
                list4 = value3.get(Boolean.FALSE);
            } else {
                list4 = null;
            }
            LJIILL(z, str, list3, list4, false);
            C955650ayZ.LIZJ(true);
            return;
        }
        C974540bT2 c974540bT22 = C974540bT2.LIZ;
        C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.TEAM_EMPTY, i, z, EnumC919170a1j.MATCH_TYPE_1V1, 4);
        LJIILIIL();
        C20441214yg.LJIIL("TwoMatchInviterViewModel", "selfTeamUser or rivalTeamUser is null");
    }
}

package X;

import Y.AfS0S0310100_15;
import Y.AfS1S0210100_15;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bXx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977590bXx extends C0TW5 {
    public final MutableLiveData<Boolean> LJIILIIL;
    public final MutableLiveData LJIILJJIL;
    public final MutableLiveData<Boolean> LJIILL;
    public final MutableLiveData LJIILLIIL;
    public final MutableLiveData<C977720bYA> LJIIZILJ;
    public final MutableLiveData LJIJ;
    public long LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public C501470JlZ LJJI;

    @Override // X.C0TW5, X.InterfaceC969510bKv
    public final void onCleared() {
        this.LJIJJLI = true;
        super.onCleared();
        MutableLiveData<Boolean> mutableLiveData = this.LJIILIIL;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJIILL.setValue(bool);
        this.LJIL = false;
        this.LJJ = false;
        this.LJIIZILJ.setValue(new C977720bYA(null, null, null, null));
        this.LJIJI = 0L;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zW(BattleIsInTeamPairing.class, new C962900bAG(false, false, 4));
        }
        C20441214yg.LIZIZ("TeamMatchInviterInviteeViewModel", "TeamMatchInviterViewModel onCleared BattleIsInTeamPairing");
    }

    public C977590bXx() {
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.LJIILIIL = mutableLiveData;
        this.LJIILJJIL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LJIILL = mutableLiveData2;
        this.LJIILLIIL = mutableLiveData2;
        MutableLiveData<C977720bYA> mutableLiveData3 = new MutableLiveData<>();
        this.LJIIZILJ = mutableLiveData3;
        this.LJIJ = mutableLiveData3;
    }

    public final String LJIIJJI(boolean z) {
        List<C954460awe> list;
        Map<Boolean, List<C954460awe>> value = this.LJFF.getValue();
        List<C954460awe> list2 = null;
        if (value != null) {
            list = value.get(Boolean.TRUE);
        } else {
            list = null;
        }
        Map<Boolean, List<C954460awe>> value2 = this.LJFF.getValue();
        if (value2 != null) {
            list2 = value2.get(Boolean.FALSE);
        }
        if (z) {
            return "2v2";
        }
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            if (list.size() == 2 && list2.size() == 2) {
                return "2v2";
            }
            if (list.size() != 1 || list2.size() != 3) {
                if (list.size() == 3 && list2.size() == 1) {
                    return "1v3";
                }
                if (list.size() != 1 || list2.size() != 2) {
                    if (list.size() != 2 || list2.size() != 1) {
                        return "2v2";
                    }
                    return "1v2";
                }
                return "1v2";
            }
            return "1v3";
        }
        return "";
    }

    public final void LJIIJ(EnumC976510bWD enumC976510bWD, boolean z) {
        this.LJIILL.setValue(Boolean.TRUE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel invitation , reason = ");
        sbLIZ.append(enumC976510bWD);
        C20441214yg.LJ("TeamMatchInviterInviteeViewModel", C2188811AlT.LIZIZ(sbLIZ));
        LJIILIIL(this.LJIJI, z, enumC976510bWD);
    }

    public final void LJIIL(Long l, String str, boolean z) {
        long id;
        List<C954460awe> list;
        long jLongValue;
        long j;
        User owner;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ);
        if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
            id = owner.getId();
        } else {
            id = 0;
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        C925640aCA.LJ(C915980Zwa.LJI().LJIIJ().LJJIJIIJI());
        boolean zLJFF = Intrinsics.LJFF(str, C973660bRc.LJJLIIIJL);
        List<C954460awe> list2 = null;
        if (zLJFF) {
            list = listLLILZLL;
        } else {
            Map<Boolean, List<C954460awe>> value = this.LJFF.getValue();
            if (value != null) {
                list = value.get(Boolean.TRUE);
            } else {
                list = null;
            }
            Map<Boolean, List<C954460awe>> value2 = this.LJFF.getValue();
            if (value2 != null) {
                list2 = value2.get(Boolean.FALSE);
            }
        }
        for (C954460awe c954460awe : listLLILZLL) {
            if (c954460awe.LJ != id) {
                C973660bRc c973660bRc = C973660bRc.LIZ;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                if (zLJFF) {
                    j = 0;
                } else {
                    j = c954460awe.LJ;
                }
                C973660bRc.LIZ.LJJLIIIJ(jLongValue, true, list, list2, j, id, z, LJIIJJI(zLJFF), C915980Zwa.LJI().LIZ().LJIILLIIL(), str);
            }
        }
    }

    public final void LJIILIIL(long j, boolean z, EnumC976510bWD enumC976510bWD) {
        Room room;
        long channelId;
        int i;
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        EnumC976510bWD.Companion.getClass();
        c974540bT2.LJJJJZ(j, C976520bWE.LIZ(enumC976510bWD), z);
        EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            room = new Room();
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            channelId = interfaceC973730bRjYf2.LJJL();
        } else {
            channelId = C915980Zwa.LJII().getChannelId();
        }
        C480460Ism.LIZ().getClass();
        MultiMatchApi multiMatchApi = (MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class);
        long id = room.getId();
        switch (C976500bWC.LIZ[enumC976510bWD.ordinal()]) {
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
        multiMatchApi.cancel(id, channelId, j, i).LJIILIIL(new C0UO0()).LJJLL(new AfS0S0310100_15(enumC976510bWD, z, enumC919170a1jXB0, this, j, 0), new AfS1S0210100_15(j, z, enumC919170a1jXB0, this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(boolean r42, java.lang.Long r43, X.EnumC919170a1j r44) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C977590bXx.LJIILJJIL(boolean, java.lang.Long, X.0a1j):void");
    }
}

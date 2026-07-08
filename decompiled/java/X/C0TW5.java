package X;

import Y.AfS148S0200000_12;
import Y.AkS15S0000100_12;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TW5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0TW5 implements InterfaceC969510bKv {
    public static C11JF LJIIL;
    public DataChannel LIZ;
    public final MutableLiveData<List<C954460awe>> LIZIZ;
    public final MutableLiveData LIZJ;
    public final MutableLiveData<List<BattleUserInfo>> LIZLLL;
    public final MutableLiveData LJ;
    public final MutableLiveData<Map<Boolean, List<C954460awe>>> LJFF;
    public final MutableLiveData<Map<Boolean, List<BattleUserInfo>>> LJI;
    public final MutableLiveData<Map<Long, Boolean>> LJII;
    public final MutableLiveData LJIIIIZZ;
    public final MutableLiveData<Long> LJIIIZ;
    public final MutableLiveData LJIIJ;
    public final MutableLiveData<Map<Long, GiftGalleryBadgeInfo>> LJIIJJI;

    public final void LJI() {
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zW(BattleInvitingTimeLeftChannel.class, 0L);
        }
        C11JF c11jf = LJIIL;
        if (c11jf != null) {
            C500260Jjc.LJJLIIIJLJLI(c11jf);
        }
        LJIIL = null;
    }

    @Override // X.InterfaceC969510bKv
    public void onCleared() {
        C20441214yg.LJ("TeamMatchInviterInviteeViewModel", "InviterInviteeViewModel, onCleared");
        this.LIZIZ.setValue(C13BV.INSTANCE);
        this.LJII.setValue(new HashMap());
        this.LJIIIZ.setValue(0L);
        this.LJFF.setValue(new LinkedHashMap());
        LJI();
    }

    public C0TW5() {
        C13BV c13bv = C13BV.INSTANCE;
        MutableLiveData<List<C954460awe>> mutableLiveData = new MutableLiveData<>(c13bv);
        this.LIZIZ = mutableLiveData;
        this.LIZJ = mutableLiveData;
        MutableLiveData<List<BattleUserInfo>> mutableLiveData2 = new MutableLiveData<>(c13bv);
        this.LIZLLL = mutableLiveData2;
        this.LJ = mutableLiveData2;
        this.LJFF = new MutableLiveData<>();
        this.LJI = new MutableLiveData<>();
        MutableLiveData<Map<Long, Boolean>> mutableLiveData3 = new MutableLiveData<>(new HashMap());
        this.LJII = mutableLiveData3;
        this.LJIIIIZZ = mutableLiveData3;
        MutableLiveData<Long> mutableLiveData4 = new MutableLiveData<>(0L);
        this.LJIIIZ = mutableLiveData4;
        this.LJIIJ = mutableLiveData4;
        this.LJIIJJI = new MutableLiveData<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[PHI: r1
      0x0070: PHI (r1v6 java.lang.Object) = (r1v1 java.lang.Object), (r1v7 java.lang.Object) binds: [B:18:0x006e, B:16:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TW5.LIZIZ():void");
    }

    public final void LIZ(DataChannel dataChannel) {
        long id;
        InterfaceC2262081DgM currentUser;
        this.LIZ = dataChannel;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            id = currentUser.getId();
        } else {
            id = 0;
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        if (listLLILZLL.size() < 2) {
            MutableLiveData<List<C954460awe>> mutableLiveData = this.LIZIZ;
            C13BV c13bv = C13BV.INSTANCE;
            mutableLiveData.setValue(c13bv);
            this.LIZLLL.setValue(c13bv);
            this.LJI.setValue(new LinkedHashMap());
            this.LJFF.setValue(new LinkedHashMap());
            this.LJII.setValue(new HashMap());
            C20441214yg.LIZIZ("TeamMatchInviterInviteeViewModel", "clearInviterInviteeStateWhenLinkedHostCountInsufficient");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C954460awe c954460awe : listLLILZLL) {
            if (c954460awe.LJ == id) {
                arrayList.add(c954460awe);
            } else {
                arrayList2.add(c954460awe);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Boolean.TRUE, arrayList);
        linkedHashMap.put(Boolean.FALSE, arrayList2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update invite ui list, teamGroup = ");
        sbLIZ.append(linkedHashMap.size());
        C20441214yg.LIZIZ("TeamMatchInviterInviteeViewModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF.setValue(linkedHashMap);
    }

    public final void LIZLLL(List<C954460awe> list) {
        this.LIZIZ.setValue(list);
    }

    public final void LJ(Map<Long, GiftGalleryBadgeInfo> map) {
        this.LJIIJJI.setValue(map);
    }

    public final void LIZJ(List<BattleUserInfo> list, Map<Long, GiftGalleryBadgeInfo> map) {
        List<C954460awe> listLIZIZ = C949620aoq.LIZIZ(list);
        C915980Zwa.LJII().LJJJJLL(map);
        if (!((ArrayList) list).isEmpty()) {
            this.LIZLLL.setValue(list);
            this.LIZIZ.setValue(listLIZIZ);
        }
    }

    public final void LJII(List<BattleUserInfo> list, List<BattleUserInfo> list2) {
        ArrayList arrayList = new ArrayList(C949620aoq.LIZIZ(list));
        ArrayList arrayList2 = new ArrayList(C949620aoq.LIZIZ(list2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = Boolean.TRUE;
        linkedHashMap.put(bool, list);
        Boolean bool2 = Boolean.FALSE;
        linkedHashMap.put(bool2, list2);
        this.LJI.setValue(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(bool, arrayList);
        linkedHashMap2.put(bool2, arrayList2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update invite ui list, teamGroup = ");
        sbLIZ.append(linkedHashMap2.size());
        C20441214yg.LIZIZ("TeamMatchInviterInviteeViewModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF.setValue(linkedHashMap2);
    }

    public final void LJIIIIZZ(long j, boolean z) {
        Map<Long, Boolean> map = (Map) this.LJIIIIZZ.getValue();
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(Long.valueOf(j), Boolean.valueOf(z));
        this.LJII.setValue(map);
    }

    public final void LJIIIZ(List<C954460awe> list, List<C954460awe> list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Boolean.TRUE, list);
        linkedHashMap.put(Boolean.FALSE, list2);
        this.LJFF.setValue(linkedHashMap);
    }

    public final void LJFF(DataChannel dataChannel, long j, Function0<Unit> function0) {
        LJI();
        LJIIL = (C11JF) C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(j).LJJJJZI(new AkS15S0000100_12(j, 1)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS148S0200000_12(dataChannel, this, 49), new C09JN() { // from class: X.0TAc
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("TeamMatchInviterInviteeViewModel@d0cf.startInviteCountdown$3");
                C0UVC.LIZIZ((Throwable) obj);
                C1C7U.LIZIZ("TeamMatchInviterInviteeViewModel@d0cf.startInviteCountdown$3");
            }
        }, new C786160Usg(dataChannel, function0, 1));
    }
}

package X;

import Y.ARunnableS84S0200000_15;
import Y.AfS0S0111100_15;
import Y.AfS151S0200000_15;
import Y.AfS1S0101100_15;
import Y.AfS5S0100100_15;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4029011FixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviteMockSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AFwS338S0000000_15;
import kotlin.jvm.internal.AwS133S0110000_15;
import kotlin.jvm.internal.AwS155S0110000_15;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977570bXv implements InterfaceC976280bVq, InterfaceC977860bYO {
    public final MatchBaseWidget LIZ;
    public LinkDialog LIZIZ;
    public final DataChannel LIZJ;
    public final C977610bXz LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public GiftMode LJI;
    public Long LJII;
    public Function1<? super EnumC919170a1j, Unit> LJIIIIZZ;
    public InterfaceC1631620sYq<? super Long, ? super EnumC919170a1j, ? super List<TeamUser>, Unit> LJIIIZ;
    public Function2<? super Boolean, ? super Boolean, Unit> LJIIJ;
    public Function2<? super EnumC976510bWD, ? super Boolean, Unit> LJIIJJI;
    public Function1<? super Boolean, Unit> LJIIL;
    public Function0<Unit> LJIILIIL;
    public C986440bmE LJIILJJIL;
    public C501470JlZ LJIILL;

    @Override // X.InterfaceC976280bVq
    public final void LIZIZ() {
        this.LJ = true;
        if (this.LIZLLL != null) {
            C11JF c11jf = AbstractC742600TBa.LJIIIIZZ;
            if (c11jf != null) {
                C500260Jjc.LJJLIIIJLJLI(c11jf);
            }
            AbstractC742600TBa.LJIIIIZZ = null;
        }
        LIZLLL();
        C20441214yg.LIZIZ("IndividualMatchInviterCoordinator", "will clear invite viewModel");
        C977610bXz c977610bXz = this.LIZLLL;
        if (c977610bXz != null) {
            c977610bXz.onCleared();
        }
    }

    @Override // X.InterfaceC976280bVq
    public final void LIZLLL() {
        LinkDialog linkDialog = this.LIZIZ;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
        this.LJIILIIL.invoke();
    }

    @Override // X.InterfaceC976280bVq
    public final void LJ() {
        C977610bXz c977610bXz = this.LIZLLL;
        if (c977610bXz != null) {
            c977610bXz.LIZJ(EnumC976510bWD.MIC_ROOM_START);
        }
    }

    public C977570bXv(MatchBaseWidget matchBaseWidget) {
        DataChannel dataChannelProvideDataChannel;
        this.LIZ = matchBaseWidget;
        if (matchBaseWidget != null) {
            dataChannelProvideDataChannel = matchBaseWidget.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        this.LIZJ = dataChannelProvideDataChannel;
        this.LIZLLL = matchBaseWidget != null ? (C977610bXz) matchBaseWidget.y1(C977610bXz.class) : null;
        this.LJIIIIZZ = AFwS250S0000000_15.get$arr$(1);
        this.LJIIIZ = AFwS338S0000000_15.get$arr$(0);
        this.LJIIJ = AFwS299S0000000_15.get$arr$(1);
        this.LJIIJJI = AFwS299S0000000_15.get$arr$(0);
        this.LJIIL = AFwS250S0000000_15.get$arr$(0);
        this.LJIILIIL = AFwS203S0000000_15.get$arr$(0);
    }

    @Override // X.InterfaceC976280bVq
    public final void LIZ(boolean z) {
        C16FS c16fs;
        MatchBaseWidget matchBaseWidget = this.LIZ;
        C985030bjx c985030bjx = null;
        if (matchBaseWidget != null && matchBaseWidget.getView() != null) {
            MatchBaseWidget matchBaseWidget2 = this.LIZ;
            if (matchBaseWidget2 != null) {
                c16fs = (C16FS) matchBaseWidget2.findViewById(R.id.cnn);
            } else {
                c16fs = null;
            }
            MatchBaseWidget matchBaseWidget3 = this.LIZ;
            if (matchBaseWidget3 != null) {
                c985030bjx = (C985030bjx) matchBaseWidget3.findViewById(R.id.cnl);
            }
            if (c16fs != null) {
                c16fs.setEnabled(z);
            }
            if (c985030bjx != null) {
                c985030bjx.setEnabled(z);
            }
            if (z) {
                if (c16fs != null) {
                    c16fs.j0(R.style.a7v);
                }
            } else {
                if (c16fs != null) {
                    c16fs.j0(R.style.a76);
                }
                if (c985030bjx == null) {
                    return;
                }
                c985030bjx.LIZIZ();
            }
        }
    }

    @Override // X.InterfaceC976280bVq
    public final void LJIIIZ(LinkMicBattleMessage linkMicBattleMessage) {
        C977610bXz c977610bXz = this.LIZLLL;
        if (c977610bXz != null) {
            c977610bXz.LIZIZ(linkMicBattleMessage.actionByUserId, true);
        }
    }

    @Override // X.InterfaceC976280bVq
    public final void LJIIJ(boolean z) {
        C977610bXz c977610bXz = this.LIZLLL;
        if (c977610bXz != null) {
            c977610bXz.LIZJ(EnumC976510bWD.HOSTS_LIST_CHANGED);
        }
        if (z) {
            C766270U4b.LIZLLL(2131853338);
        }
    }

    @Override // X.InterfaceC976280bVq
    public final boolean LJIILIIL(LinkMicBattleMessage linkMicBattleMessage) {
        long jLongValue;
        ArrayList arrayList;
        MutableLiveData mutableLiveData;
        List list;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = this.LJII;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jCurrentTimeMillis - jLongValue > 3000) {
            return false;
        }
        C977610bXz c977610bXz = this.LIZLLL;
        ArrayList arrayList2 = null;
        if (c977610bXz != null && (mutableLiveData = c977610bXz.LIZLLL) != null && (list = (List) mutableLiveData.getValue()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((C954460awe) it2.next()).LJ));
            }
        } else {
            arrayList = null;
        }
        List<TeamUsersInfo> list2 = linkMicBattleMessage.teamUsers;
        if (list2 != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<TeamUsersInfo> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Long.valueOf(it3.next().teamId));
            }
        }
        return C976880bWo.LIZ(arrayList2, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b A[PHI: r2
      0x002b: PHI (r2v1 boolean) = (r2v0 boolean), (r2v3 boolean) binds: [B:20:0x0028, B:13:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC976280bVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJIIJIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r8) {
        /*
            r7 = this;
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r6 = r8.battleSetting
            r5 = 1
            if (r6 == 0) goto L2d
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta r1 = r6.giftModeMeta
            if (r1 == 0) goto L27
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r0 = r7.LJI
            if (r0 == 0) goto L24
            long r3 = r0.giftId
        Lf:
            long r1 = r1.giftId
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L27
            r2 = 1
        L16:
            int r1 = X.C978520bZS.LJIIIZ()
            int r0 = r6.gameplayOption
            if (r1 != r0) goto L2b
            r0 = 1
        L1f:
            if (r2 == 0) goto L2d
            if (r0 == 0) goto L2d
            return r5
        L24:
            r3 = 0
            goto Lf
        L27:
            r2 = 0
            if (r6 == 0) goto L2b
            goto L16
        L2b:
            r0 = 0
            goto L1f
        L2d:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C977570bXv.LJJIJIIJIL(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage):boolean");
    }

    public final void LJJJI(Throwable th) {
        C986440bmE c986440bmE;
        if (this.LJ) {
            return;
        }
        C986440bmE c986440bmE2 = this.LJIILJJIL;
        if (c986440bmE2 != null) {
            c986440bmE2.LIZLLL(th);
        }
        boolean z = th instanceof C501470JlZ;
        boolean z2 = true;
        boolean z3 = false;
        if (z && ((C501520Jle) th).getErrorCode() == 4029011 && (c986440bmE = this.LJIILJJIL) != null && c986440bmE.LJ()) {
            C977610bXz c977610bXz = this.LIZLLL;
            if (c977610bXz != null) {
                c977610bXz.LJIILL = false;
                return;
            }
            return;
        }
        this.LJIILJJIL = null;
        C977610bXz c977610bXz2 = this.LIZLLL;
        if (c977610bXz2 != null) {
            c977610bXz2.LJIIJJI.setValue(Boolean.FALSE);
            c977610bXz2.LJIILL = false;
        }
        if (z) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            if (!TextUtils.isEmpty(c501470JlZ.getPrompt())) {
                C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
            } else {
                switch (c501470JlZ.getErrorCode()) {
                    case 4004047:
                    case 4029016:
                        C766270U4b.LIZLLL(2131853308);
                        break;
                    case 4029012:
                        C766270U4b.LIZLLL(2131853307);
                        break;
                    case 4029013:
                        C766270U4b.LIZLLL(2131853343);
                        break;
                    case 4029014:
                        C766270U4b.LIZLLL(2131853278);
                        break;
                    case 4029019:
                        C766270U4b.LIZLLL(2131853342);
                        break;
                }
            }
            if (4004253 != c501470JlZ.getErrorCode()) {
                z3 = true;
            } else {
                z2 = false;
            }
        } else if (th instanceof C977870bYP) {
            C766270U4b.LIZLLL(2131843062);
        } else {
            C766270U4b.LIZLLL(2131852422);
        }
        this.LJIIJ.invoke(Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    @Override // X.InterfaceC977860bYO
    public final void LIZJ(long j, EnumC976510bWD enumC976510bWD) {
        Room room;
        long channelId;
        int i;
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        EnumC976510bWD.Companion.getClass();
        c974540bT2.LJJJJZ(j, C976520bWE.LIZ(enumC976510bWD), this.LJFF);
        DataChannel dataChannel = this.LIZJ;
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
        switch (C976490bWB.LIZ[enumC976510bWD.ordinal()]) {
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
        multiMatchApi.cancel(id, channelId, j, i).LJIILIIL(new C0UO0()).LJJLL(new AfS151S0200000_15(enumC976510bWD, this, 0), new AfS5S0100100_15(j, this, 0));
    }

    @Override // X.InterfaceC977860bYO
    public final void LJIILJJIL(List list, boolean z) {
        long id;
        boolean z2;
        int i;
        long id2;
        long j;
        User owner;
        User owner2;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZJ);
        long j2 = 0;
        if (roomLJJLIIIIJ != null && (owner2 = roomLJJLIIIIJ.getOwner()) != null) {
            id = owner2.getId();
        } else {
            id = 0;
        }
        boolean z3 = true;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        C925640aCA.LJ(C915980Zwa.LJI().LJIIJ().LJJIJIIJI());
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            long j3 = it2.next().LJ;
            if (j3 != id) {
                C973660bRc c973660bRc = C973660bRc.LIZ;
                C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                int size = C915980Zwa.LJII().LLILZLL(z3).size();
                c917350Zyn.getClass();
                C973660bRc.LIZ.LJLJLLL(j3, null, null, true, z, C917350Zyn.LIZIZ(enumC919170a1jXB0, size), null, C915980Zwa.LJI().LIZ().LJIILLIIL());
                z3 = true;
            }
        }
        C501470JlZ c501470JlZ = this.LJIILL;
        if (c501470JlZ != null) {
            this.LJIILL = null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MOCK: bypassing invite API; posting handleInviteRequestFailed with errorCode=");
            sbLIZ.append(Integer.valueOf(c501470JlZ.getErrorCode()));
            C20441214yg.LJIIL("IndividualMatchInviterCoordinator", C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.LJJZZIII(C0IK5.LIZ(), new ARunnableS84S0200000_15(this, c501470JlZ, 0));
            return;
        }
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        if ((listLJIJJ instanceof Collection) && listLJIJJ.isEmpty()) {
            z2 = false;
        } else {
            Iterator<C954460awe> it3 = listLJIJJ.iterator();
            while (it3.hasNext()) {
                if (it3.next().LJIIJ()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (z2) {
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.HOSTS_CHANGED, 0, z, EnumC919170a1j.MATCH_TYPE_INDIVIDUAL, 6);
            LJJJI(new C977870bYP());
            return;
        }
        long channelId = C915980Zwa.LJII().getChannelId();
        if (channelId == 0) {
            C20441214yg.LJ("IndividualMatchInviterCoordinator", "Invite Request Error: channelId is empty");
            C974540bT2 c974540bT22 = C974540bT2.LIZ;
            C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.CHANNEL_ID_INVALID, 0, z, EnumC919170a1j.MATCH_TYPE_INDIVIDUAL, 6);
            return;
        }
        if (Intrinsics.LJFF(C915980Zwa.LJI().LJIIJ().LJJIJIIJI(), EnumC973640bRa.PK_REMATCH.getValue())) {
            i = 6;
        } else if (z) {
            i = 1;
        } else {
            i = 0;
        }
        Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(this.LIZJ);
        if (roomLJJLIIIIJ2 != null && (owner = roomLJJLIIIIJ2.getOwner()) != null) {
            id2 = owner.getId();
        } else {
            id2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C954460awe) obj).LJ != id2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList2.add(Long.valueOf(((C954460awe) it4.next()).LJ));
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
        C974540bT2.LIZ.LJJLIIIJ(i);
        this.LJII = Long.valueOf(System.currentTimeMillis());
        this.LJIIIIZZ.invoke(EnumC919170a1j.MATCH_TYPE_INDIVIDUAL);
        int iLJIIIZ = C978520bZS.LJIIIZ();
        C915980Zwa.LJI().LIZLLL();
        GiftMode giftMode = this.LJI;
        if (giftMode != null) {
            j = giftMode.giftId;
        } else {
            j = 0;
        }
        Pair pairLIZIZ = C156900it.LIZIZ(iLJIIIZ, j);
        int iIntValue = ((Number) pairLIZIZ.getFirst()).intValue();
        String str = (String) pairLIZIZ.getSecond();
        C480460Ism.LIZ().getClass();
        MultiMatchApi multiMatchApi = (MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class);
        GiftMode giftMode2 = this.LJI;
        if (giftMode2 != null) {
            j2 = giftMode2.giftId;
        }
        ((C0J1N) multiMatchApi.multiInvitePb(channelId, i, "", strLJJLIIIJ, C975070bTt.LIZ(iLJIIIZ, j2), 3, iLJIIIZ, iIntValue, str, C974540bT2.LJJII()).LJIILIIL(new C0UO0()).LIZJ(C11RD.LJ(this.LIZ))).LIZ(new AfS0S0111100_15(i, id2, this, z, 0), new AfS1S0101100_15(i, id2, this, 0));
    }

    @Override // X.InterfaceC976280bVq
    public final void LJJIIJZLJL(LinkMicBattleMessage linkMicBattleMessage, boolean z) {
        MutableLiveData mutableLiveData;
        List list;
        Object next;
        C977610bXz c977610bXz = this.LIZLLL;
        C754570Tip c754570Tip = null;
        if (c977610bXz != null && (mutableLiveData = c977610bXz.LIZLLL) != null && (list = (List) mutableLiveData.getValue()) != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    C954460awe c954460awe = (C954460awe) next;
                    if (linkMicBattleMessage != null && c954460awe.LJ == linkMicBattleMessage.actionByUserId) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C954460awe c954460awe2 = (C954460awe) next;
            if (c954460awe2 != null) {
                c754570Tip = c954460awe2.LJIJJ;
            }
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843057, C946260ajQ.LIZ(c754570Tip)));
        if (linkMicBattleMessage != null) {
            C974540bT2.LIZ.LJJJJLL(linkMicBattleMessage, Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // X.InterfaceC976280bVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage r10, boolean r11, kotlin.jvm.internal.AwS381S0200000_15 r12) {
        /*
            r9 = this;
            X.0bXz r0 = r9.LIZLLL
            r6 = 0
            r7 = 0
            if (r0 == 0) goto L6b
            androidx.lifecycle.MutableLiveData r0 = r0.LIZLLL
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L6b
            java.util.Iterator r8 = r0.iterator()
        L16:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r5 = r8.next()
            r0 = r5
            X.0awe r0 = (X.C954460awe) r0
            if (r10 == 0) goto L16
            long r2 = r0.LJ
            long r0 = r10.actionByUserId
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L16
        L2d:
            X.0awe r5 = (X.C954460awe) r5
            if (r5 == 0) goto L6b
            X.0Tip r0 = r5.LJIJJ
        L33:
            java.lang.String r5 = X.C946260ajQ.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r4 = r9.LIZJ
            if (r4 == 0) goto L48
            java.lang.Class<com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent> r3 = com.bytedance.android.live.liveinteract.matchv2.connection.matchstate.RematchButtonUpdateEvent.class
            X.0baw r2 = new X.0baw
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = 6
            r2.<init>(r1, r7, r7, r0)
            r4.LC0(r3, r2)
        L48:
            r0 = 2131853306(0x7f117ffa, float:1.9340255E38)
            java.lang.String r1 = X.C497740JfY.LJIJI(r0)
            java.lang.String r0 = "{username}"
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r1, r0, r5, r6)
            X.C766270U4b.LJIIJJI(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r12.invoke(r0)
            if (r10 == 0) goto L68
            X.0bT2 r1 = X.C974540bT2.LIZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r1.LJLJLJ(r10, r0)
        L68:
            return
        L69:
            r5 = r7
            goto L2d
        L6b:
            r0 = r7
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C977570bXv.LJJIJLIJ(com.bytedance.android.livesdk.model.message.LinkMicBattleMessage, boolean, kotlin.jvm.internal.AwS381S0200000_15):void");
    }

    @Override // X.InterfaceC976280bVq
    public final Pair LJJIJ(AwS559S0100000_15 awS559S0100000_15, AwS559S0100000_15 awS559S0100000_152, AwS559S0100000_15 awS559S0100000_153, AwS559S0100000_15 awS559S0100000_154, AwS559S0100000_15 awS559S0100000_155, AwS594S0100000_15 awS594S0100000_15, EnumC975850bV9 enumC975850bV9, LinkMicBattleMessage linkMicBattleMessage) {
        return new Pair(Boolean.FALSE, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC976280bVq
    public final void LJIJJ(EnumC975850bV9 enumC975850bV9, boolean z, boolean z2, boolean z3, String str, GiftMode giftMode, Function1<? super EnumC919170a1j, Unit> function1, InterfaceC1631620sYq<? super Long, ? super EnumC919170a1j, ? super List<TeamUser>, Unit> interfaceC1631620sYq, Function2<? super Boolean, ? super Boolean, Unit> function2, Function2<? super EnumC976510bWD, ? super Boolean, Unit> function22, Function1<? super Boolean, Unit> function12, Function1<? super Long, Unit> function13, Function0<Unit> function0, Function0<Unit> function02) {
        FragmentManager fragmentManager;
        EnumC977660bY4 enumC977660bY4;
        long jLIZ = C158B.LIZ();
        LinkDialog linkDialog = this.LIZIZ;
        Long lValueOf = null;
        if (linkDialog != null && linkDialog.isVisible()) {
            LinkDialog linkDialog2 = this.LIZIZ;
            if (linkDialog2 == null || (enumC977660bY4 = linkDialog2.LLILZIL) == null) {
                enumC977660bY4 = null;
            }
            if (enumC977660bY4 == EnumC977660bY4.TYPE_INDIVIDUAL_MATCH_INVITE) {
                return;
            }
            if (linkDialog2 != null) {
                linkDialog2.dismiss();
            }
        }
        C977610bXz c977610bXz = this.LIZLLL;
        if (c977610bXz != null) {
            c977610bXz.LIZ = this.LIZJ;
            c977610bXz.LIZIZ = this;
        }
        this.LJFF = z2;
        this.LJI = giftMode;
        this.LJIIIIZZ = function1;
        this.LJIIIZ = interfaceC1631620sYq;
        this.LJIIJ = function2;
        this.LJIIJJI = function22;
        this.LJIIL = function12;
        this.LJIILIIL = function02;
        if (this.LIZ != null) {
            System.currentTimeMillis();
            MatchBaseWidget matchBaseWidget = this.LIZ;
            LinkDialog linkDialog3 = new LinkDialog(matchBaseWidget);
            EnumC977660bY4 enumC977660bY42 = EnumC977660bY4.TYPE_INDIVIDUAL_MATCH_INVITE;
            C979910bbh c979910bbh = new C979910bbh(matchBaseWidget, giftMode, z2, false);
            linkDialog3.LLILZIL = enumC977660bY42;
            linkDialog3.LLILZLL = c979910bbh;
            this.LIZIZ = linkDialog3;
            DataChannel dataChannel = this.LIZJ;
            if (dataChannel != null) {
                fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            } else {
                fragmentManager = null;
            }
            linkDialog3.show(fragmentManager, "IndividualMatchInviterCoordinator");
            LinkDialog linkDialog4 = this.LIZIZ;
            if (linkDialog4 != null) {
                linkDialog4.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9((AwS559S0100000_15) function02, 0));
            }
            if (z) {
                if (LiveMatchInvite4029011FixSetting.INSTANCE.isEnabled()) {
                    List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
                    Iterator<C954460awe> it2 = listLLILZLL.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Long.valueOf(it2.next().LJ));
                    }
                    Set setLLIIJI = C13LP.LLIIJI(arrayList);
                    EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_INDIVIDUAL;
                    if (giftMode != null) {
                        lValueOf = Long.valueOf(giftMode.giftId);
                    }
                    this.LJIILJJIL = new C986440bmE(new C986430bmD(setLLIIJI, enumC919170a1j, lValueOf, z2, SystemClock.elapsedRealtime()), new AwS559S0100000_15(this, 0), AFwS203S0000000_15.get$arr$(1), new AwS133S0110000_15(this, z2, 0), new AwS451S0200000_15(this, (AwS155S0110000_15) function2, 0), new AwS559S0100000_15(this, 1));
                }
                this.LJIILL = C977760bYE.LIZ(false);
                C977610bXz c977610bXz2 = this.LIZLLL;
                if (c977610bXz2 != null) {
                    c977610bXz2.LIZLLL(z2);
                }
                if (LiveMatchInviteMockSetting.INSTANCE.isOrphanBattleEnabled()) {
                    C20441214yg.LJIIL("IndividualMatchInviterCoordinator", "MOCK: forcing hasLeftCurrentState=true to simulate orphan battle race condition");
                    this.LJ = true;
                }
            }
            C974540bT2.LIZ.LJJLIIIIJ(EnumC974650bTD.CLICKICON, EnumC919170a1j.MATCH_TYPE_INDIVIDUAL, C158B.LIZ() - jLIZ);
        }
    }
}

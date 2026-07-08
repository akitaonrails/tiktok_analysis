package X;

import Y.AObserverS179S0200000_15;
import Y.ARunnableS48S0300000_15;
import Y.ARunnableS84S0200000_15;
import Y.AfS0S0111100_15;
import Y.AfS0S0310100_15;
import Y.AfS0S0411200_15;
import Y.AfS1S0101100_15;
import Y.AfS1S0210100_15;
import Y.AfS2S0201100_15;
import android.os.Looper;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.model.ShouldTriggerInviteOnOpen;
import com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.model.ShouldTriggerMockInviteErrorForTeamPair;
import com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.api.TwoMatchApi;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.settingview.UpRightIconViewModel;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInvite4004049FixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviteMockSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchInviterPanelLynxMockErrorSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AFwS338S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS8S0100200_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.0bY1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977630bY1 extends C0TW5 {
    public static final /* synthetic */ int LJJLIIIJJI = 0;
    public final MutableLiveData<EnumC919170a1j> LJIILIIL;
    public final MutableLiveData LJIILJJIL;
    public final MutableLiveData<Boolean> LJIILL;
    public final MutableLiveData LJIILLIIL;
    public final MutableLiveData<Boolean> LJIIZILJ;
    public final MutableLiveData LJIJ;
    public final MediatorLiveData<EnumC977690bY7> LJIJI;
    public final MediatorLiveData LJIJJ;
    public final MediatorLiveData<C978120bYo> LJIJJLI;
    public final MediatorLiveData LJIL;
    public final MutableLiveData<C977770bYF> LJJ;
    public final MutableLiveData LJJI;
    public final MutableLiveData<Boolean> LJJIFFI;
    public final MutableLiveData<C978130bYp> LJJII;
    public final MutableLiveData LJJIII;
    public int LJJIIJ;
    public final MutableLiveData<C977740bYC> LJJIIJZLJL;
    public final MutableLiveData LJJIIZ;
    public final MutableLiveData<String> LJJIIZI;
    public final MutableLiveData LJJIJ;
    public final MutableLiveData<C978110bYn> LJJIJIIJI;
    public final MutableLiveData LJJIJIIJIL;
    public AwS559S0100000_15 LJJIJIL;
    public UpRightIconViewModel LJJIJL;
    public long LJJIJLIJ;
    public final Map<Long, Long> LJJIL;
    public C957560b1e LJJIZ;
    public boolean LJJJ;
    public String LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public C501470JlZ LJJJJIZL;
    public final MutableLiveData<Boolean> LJJJJJ;
    public final MutableLiveData LJJJJJL;
    public final MutableLiveData<Boolean> LJJJJL;
    public final MutableLiveData LJJJJLI;
    public int LJJJJLL;
    public Integer LJJJJZ;
    public String LJJJJZI;
    public long LJJJLIIL;
    public InterfaceC1631620sYq<? super EnumC919170a1j, ? super List<C954460awe>, ? super List<C954460awe>, Unit> LJJJLL;
    public Function0<Unit> LJJJLZIJ;
    public Function0<Unit> LJJJZ;
    public EnumC975850bV9 LJJL;
    public EnumC974980bTk LJJLI;
    public Function0<Unit> LJJLIIIIJ;
    public Function1<? super EnumC919170a1j, Unit> LJJLIIIJ;
    public Function0<Unit> LJJLIIIJILLIZJL;

    @Override // X.C0TW5, X.InterfaceC969510bKv
    public final void onCleared() {
        this.LJJJIL = true;
        super.onCleared();
        MutableLiveData<Boolean> mutableLiveData = this.LJIILL;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJIIZILJ.setValue(bool);
        this.LJJJJ = false;
        this.LJJJJI = false;
        this.LJJ.setValue(new C977770bYF(0));
        this.LJJIIJZLJL.setValue(new C977740bYC(null, 3, 0));
        this.LJJIIZI.setValue("");
        this.LJJIJIIJI.setValue(null);
        this.LJJIJLIJ = 0L;
        this.LJJJJZ = null;
        this.LJJJJLL = 0;
        ((LinkedHashMap) this.LJJIL).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC977690bY7 LJIILJJIL() {
        Boolean bool = (Boolean) this.LJIJ.getValue();
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) this.LJIILLIIL.getValue();
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        EnumC977690bY7 enumC977690bY7 = zBooleanValue ? EnumC977690bY7.INVITING : zBooleanValue2 ? EnumC977690bY7.INVITED : EnumC977690bY7.NONE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uiInviteButtonStatusMutable, recompute, newStatus: ");
        sbLIZ.append(enumC977690bY7);
        sbLIZ.append(", waiting: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", ready: ");
        sbLIZ.append(zBooleanValue2);
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        return enumC977690bY7;
    }

    public final C978120bYo LJIILL() {
        String strLIZIZ;
        Integer num = 2131856762;
        if (C976600bWM.LIZ(this.LJJL)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onClick: teamPairButton is disabled when triggered quick match by ");
            sbLIZ.append(this.LJJJI);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else if (C915980Zwa.LJFF().RY(this.LJJJ).compareTo(EnumC964170bCJ.INVITED) >= 0) {
            strLIZIZ = "onClick: teamPairButton is disabled already invited";
        } else if (C948770anT.LJ() && (!C915980Zwa.LJII().LJJIIJZLJL().isEmpty())) {
            num = 2131851852;
            strLIZIZ = "onClick: teamPairButton is disabled, getSelfHostRoomLinkedGuests().isNotEmpty()";
        } else if (C975140bU0.LJFF()) {
            num = 2131851723;
            strLIZIZ = "onClick: teamPairButton is disabled, currently in catch beans";
        } else if (C975140bU0.LJII()) {
            num = 2131851724;
            strLIZIZ = "onClick: teamPairButton is disabled, currently in take the stage";
        } else {
            num = null;
            strLIZIZ = null;
        }
        boolean z = (num == null || strLIZIZ == null) ? false : true;
        boolean zIsInProcess = C915980Zwa.LIZIZ().JV1(false).isInProcess();
        boolean z2 = C948770anT.LJ() && (C915980Zwa.LJII().LJJIIJZLJL().isEmpty() ^ true);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("uiDisableStateMutable, recompute, newState: UIDisableState(isTeamPairDisabled: ");
        sbLIZ2.append(z);
        sbLIZ2.append(", isAllDisabled: ");
        sbLIZ2.append(zIsInProcess);
        sbLIZ2.append("), teamPairDisableReason: ");
        sbLIZ2.append(num);
        sbLIZ2.append(", teamPairLogMessage: ");
        sbLIZ2.append(strLIZIZ);
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ2));
        return new C978120bYo(z, zIsInProcess, z2);
    }

    public final boolean LJIILLIIL() {
        this.LJIIZILJ.setValue(Boolean.FALSE);
        this.LJJJJ = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("battleIdMap.isEmpty() ");
        sbLIZ.append(this.LJJIL.isEmpty());
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        return this.LJJIL.isEmpty();
    }

    public final void LJIJJLI() {
        C973660bRc c973660bRc = C973660bRc.LIZ;
        Map<Boolean, List<C954460awe>> value = this.LJFF.getValue();
        List<C954460awe> list = value != null ? value.get(Boolean.TRUE) : null;
        Map<Boolean, List<C954460awe>> value2 = this.LJFF.getValue();
        List<C954460awe> list2 = value2 != null ? value2.get(Boolean.FALSE) : null;
        C973660bRc.LJJJZ(false, list, list2, this.LJJLI, null, this.LJJJ, true, EnumC973700bRg.INVITE_WAITING, LJIJI(null), null, null, false, C978440bZK.LJ(this.LIZ), this.LJIILIIL.getValue(), 3584);
    }

    public final boolean LJJIIZ() {
        if (!LiveDirectMatchSetting.INSTANCE.isEnabled()) {
            C20441214yg.LIZIZ("CombinedMatchInviterViewModel", "shouldCancelCoHostInvitationFirst QuickBattle not enabled");
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldCancelCoHostInvitationFirst inviteType=");
        sbLIZ.append(this.LJJJJLL);
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        return this.LJJJJLL == 5;
    }

    public final void LJJIIZI() {
        AbstractC986390bm9 abstractC986390bm9LJ = new C963880bBq(C915980Zwa.LIZLLL(), C915980Zwa.LJII()).LJ();
        if (abstractC986390bm9LJ instanceof C986370bm7) {
            C766270U4b.LIZLLL(C986380bm8.LIZ((C986370bm7) abstractC986390bm9LJ));
            return;
        }
        this.LJIIZILJ.setValue(Boolean.TRUE);
        this.LJIILL.setValue(Boolean.FALSE);
        C950840aqo c950840aqo = new C950840aqo(3, new InterfaceC914930Zut<C960260b60>() { // from class: X.0bY2
            @Override // X.InterfaceC914930Zut
            public final void onSuccess(C960260b60 c960260b60) {
                List<C954460awe> list;
                List<C954460awe> list2;
                DataChannel dataChannel;
                C977630bY1 c977630bY1 = this.LIZ;
                MutableLiveData<Boolean> mutableLiveData = c977630bY1.LJIILL;
                Boolean bool = Boolean.TRUE;
                mutableLiveData.setValue(bool);
                MutableLiveData<Boolean> mutableLiveData2 = c977630bY1.LJIIZILJ;
                Boolean bool2 = Boolean.FALSE;
                mutableLiveData2.setValue(bool2);
                UpRightIconViewModel upRightIconViewModel = c977630bY1.LJJIJL;
                if (upRightIconViewModel != null) {
                    upRightIconViewModel.zQ2(false);
                }
                InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(c977630bY1.LJJJ);
                if (interfaceC973730bRjYf2 != null) {
                    interfaceC973730bRjYf2.LJJJZ(true);
                }
                C977810bYJ.LIZ();
                if (C978520bZS.LJIILIIL(c977630bY1.LJJJ)) {
                    C766270U4b.LIZLLL(2131856753);
                }
                if (LiveMatchInviterPanelLynxMockErrorSetting.INSTANCE.isErrorAfterInvite() && (dataChannel = c977630bY1.LIZ) != null) {
                    dataChannel.zW(ShouldTriggerMockInviteErrorForTeamPair.class, bool);
                }
                c977630bY1.LJJJLZIJ.invoke();
                C973660bRc c973660bRc = C973660bRc.LIZ;
                Map<Boolean, List<C954460awe>> value = c977630bY1.LJFF.getValue();
                if (value != null) {
                    list = value.get(bool);
                } else {
                    list = null;
                }
                Map<Boolean, List<C954460awe>> value2 = c977630bY1.LJFF.getValue();
                if (value2 != null) {
                    list2 = value2.get(bool2);
                } else {
                    list2 = null;
                }
                C973660bRc.LJJJZ(false, list, list2, c977630bY1.LJJLI, null, c977630bY1.LJJJ, true, EnumC973700bRg.INVITE_WAITING, c977630bY1.LJIJI(null), null, null, false, C978440bZK.LJ(c977630bY1.LIZ), c977630bY1.LJIILIIL.getValue(), 3584);
            }

            @Override // X.InterfaceC914930Zut
            public final void LIZ(int i, String str, Throwable th) {
                C962900bAG c962900bAG;
                String prompt;
                C977630bY1 c977630bY1 = this.LIZ;
                if (th != null) {
                    c977630bY1.getClass();
                    if (!(th instanceof C501470JlZ) || (prompt = ((C501470JlZ) th).getPrompt()) == null) {
                        prompt = "";
                    }
                    if (prompt.length() == 0) {
                        C766270U4b.LIZLLL(2131856763);
                    } else {
                        C766270U4b.LJIIJJI(prompt);
                    }
                }
                DataChannel dataChannel = c977630bY1.LIZ;
                if (dataChannel != null && (c962900bAG = (C962900bAG) dataChannel.gg0(BattleIsInTeamPairing.class)) != null && c962900bAG.LIZ) {
                    return;
                }
                c977630bY1.LJJJZ.invoke();
            }
        }, 3, 24);
        C973660bRc c973660bRc = C973660bRc.LIZ;
        C973660bRc.LJLLI(this.LJJJ);
        C915980Zwa.LJIIIZ().LIZIZ(EnumC959750b5B.TYPE_TEAM_PAIR_BUTTON_CLICK, c950840aqo);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJ() {
        /*
            r5 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.LIZ
            r4 = 0
            if (r0 == 0) goto L39
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2 r0 = X.C784920Uqg.LIZIZ(r0)
            if (r0 == 0) goto L39
            webcast.data.multi_guest_play.ActivePlaybook r0 = r0.LIZIZ()
            if (r0 == 0) goto L39
            webcast.data.multi_guest_play.Playbook r3 = r0.playbook
            int r1 = r0.playStatus
            r0 = 1
            if (r1 != r0) goto L39
            if (r3 == 0) goto L3a
            long r0 = r3.playbookId
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L20:
            androidx.lifecycle.MutableLiveData<X.0bYn> r0 = r5.LJJIJIIJI
            java.lang.Object r0 = r0.getValue()
            X.0bYn r0 = (X.C978110bYn) r0
            if (r0 == 0) goto L37
            long r0 = r0.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L30:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L3c
            return
        L37:
            r0 = r4
            goto L30
        L39:
            r3 = r4
        L3a:
            r2 = r4
            goto L20
        L3c:
            if (r3 == 0) goto L44
            r5.LJJIJIL = r4
            r5.LJJIJIIJIL(r3)
            return
        L44:
            kotlin.jvm.internal.AwS559S0100000_15 r1 = new kotlin.jvm.internal.AwS559S0100000_15
            r0 = 858(0x35a, float:1.202E-42)
            r1.<init>(r5, r0)
            r5.LJJIJIL = r1
            com.bytedance.bpea.transmit.delegate.BPEAHandler r3 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            Y.ARunnableS115S0100000_15 r2 = new Y.ARunnableS115S0100000_15
            r0 = 154(0x9a, float:2.16E-43)
            r2.<init>(r5, r0)
            r0 = 800(0x320, double:3.953E-321)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C977630bY1.LJJIJ():void");
    }

    public C977630bY1() {
        MutableLiveData<EnumC919170a1j> mutableLiveData = new MutableLiveData<>(EnumC919170a1j.UNKNOWN);
        this.LJIILIIL = mutableLiveData;
        this.LJIILJJIL = mutableLiveData;
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LJIILL = mutableLiveData2;
        this.LJIILLIIL = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>(bool);
        this.LJIIZILJ = mutableLiveData3;
        this.LJIJ = mutableLiveData3;
        MediatorLiveData<EnumC977690bY7> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.addSource(mutableLiveData3, new AObserverS179S0200000_15(this, mediatorLiveData, 3));
        mediatorLiveData.addSource(mutableLiveData2, new AObserverS179S0200000_15(this, mediatorLiveData, 4));
        mediatorLiveData.setValue(LJIILJJIL());
        this.LJIJI = mediatorLiveData;
        this.LJIJJ = mediatorLiveData;
        MediatorLiveData<C978120bYo> mediatorLiveData2 = new MediatorLiveData<>();
        mediatorLiveData2.addSource(mutableLiveData2, new AObserverS179S0200000_15(this, mediatorLiveData2, 2));
        mediatorLiveData2.setValue(LJIILL());
        this.LJIJJLI = mediatorLiveData2;
        this.LJIL = mediatorLiveData2;
        MutableLiveData<C977770bYF> mutableLiveData4 = new MutableLiveData<>();
        this.LJJ = mutableLiveData4;
        this.LJJI = mutableLiveData4;
        this.LJJIFFI = new MutableLiveData<>(bool);
        MutableLiveData<C978130bYp> mutableLiveData5 = new MutableLiveData<>(new C978130bYp(false, 0));
        this.LJJII = mutableLiveData5;
        this.LJJIII = mutableLiveData5;
        MutableLiveData<C977740bYC> mutableLiveData6 = new MutableLiveData<>(new C977740bYC(null, 3, 0));
        this.LJJIIJZLJL = mutableLiveData6;
        this.LJJIIZ = mutableLiveData6;
        MutableLiveData<String> mutableLiveData7 = new MutableLiveData<>("");
        this.LJJIIZI = mutableLiveData7;
        this.LJJIJ = mutableLiveData7;
        MutableLiveData<C978110bYn> mutableLiveData8 = new MutableLiveData<>(null);
        this.LJJIJIIJI = mutableLiveData8;
        this.LJJIJIIJIL = mutableLiveData8;
        this.LJJIL = new LinkedHashMap();
        this.LJJIZ = new C957560b1e(0, 3);
        this.LJJJI = "";
        MutableLiveData<Boolean> mutableLiveData9 = new MutableLiveData<>(bool);
        this.LJJJJJ = mutableLiveData9;
        this.LJJJJJL = mutableLiveData9;
        MutableLiveData<Boolean> mutableLiveData10 = new MutableLiveData<>(bool);
        this.LJJJJL = mutableLiveData10;
        this.LJJJJLI = mutableLiveData10;
        this.LJJJJZI = "";
        this.LJJJLL = AFwS338S0000000_15.get$arr$(11);
        this.LJJJLZIJ = AFwS203S0000000_15.get$arr$(329);
        this.LJJJZ = AFwS203S0000000_15.get$arr$(328);
        this.LJJLI = EnumC974980bTk.INVITE;
        this.LJJLIIIIJ = AFwS203S0000000_15.get$arr$(326);
        this.LJJLIIIJ = AFwS250S0000000_15.get$arr$(188);
        this.LJJLIIIJILLIZJL = AFwS203S0000000_15.get$arr$(325);
    }

    public static final boolean LJIJ() {
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        if (!(listLJIJJ instanceof Collection) || !listLJIJJ.isEmpty()) {
            Iterator<C954460awe> it2 = listLJIJJ.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJIIJ()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJJIJIIJI() {
        List<C954460awe> arrayList;
        List<C954460awe> arrayList2;
        InterfaceC2262081DgM currentUser;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        if (listLLILZLL.size() > 2) {
            return;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        long id = (interfaceC500940JkiUser == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null) ? 0L : currentUser.getId();
        List listSingletonList = Collections.singletonList(String.valueOf(id));
        ArrayList arrayList3 = new ArrayList();
        for (C954460awe c954460awe : listLLILZLL) {
            if (c954460awe.LJ != id) {
                arrayList3.add(c954460awe);
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(String.valueOf(((C954460awe) it2.next()).LJ));
        }
        List<? extends List<String>> listLJIIJJI = C1697810uHb.LJIIJJI(listSingletonList, arrayList4);
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_1V1;
        LJJIJIL(enumC919170a1j, listLJIIJJI);
        InterfaceC1631620sYq<? super EnumC919170a1j, ? super List<C954460awe>, ? super List<C954460awe>, Unit> interfaceC1631620sYq = this.LJJJLL;
        Map<Boolean, List<C954460awe>> value = this.LJFF.getValue();
        if (value == null || (arrayList = value.get(Boolean.TRUE)) == null) {
            arrayList = new ArrayList<>();
        }
        Map<Boolean, List<C954460awe>> value2 = this.LJFF.getValue();
        if (value2 == null || (arrayList2 = value2.get(Boolean.FALSE)) == null) {
            arrayList2 = new ArrayList<>();
        }
        interfaceC1631620sYq.invoke(enumC919170a1j, arrayList, arrayList2);
    }

    public final void LJIIL(boolean z) {
        if (z) {
            LJIIJJI(EnumC976510bWD.CANCEL_BUTTON, this.LJJJ);
        }
        this.LJIIZILJ.setValue(Boolean.FALSE);
    }

    public final boolean LJIJI(EnumC919170a1j enumC919170a1j) {
        if (enumC919170a1j == null) {
            enumC919170a1j = this.LJIILIIL.getValue();
        }
        if (enumC919170a1j == EnumC919170a1j.MATCH_TYPE_2V2 && C915980Zwa.LJII().LLILZLL(true).size() == 2) {
            return true;
        }
        return false;
    }

    public final void LJJIIJZLJL(EnumC919170a1j enumC919170a1j) {
        this.LJIILIIL.setValue(enumC919170a1j);
        List<Long> list = C973970bS7.LIZJ().LIZIZ;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        LIZLLL(listLLILZLL);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C954460awe c954460awe : listLLILZLL) {
            if (!LJIJI(enumC919170a1j) && !list.contains(Long.valueOf(c954460awe.LJ))) {
                arrayList2.add(c954460awe);
            } else {
                arrayList.add(c954460awe);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Boolean.TRUE, arrayList);
        linkedHashMap.put(Boolean.FALSE, arrayList2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupInitialMatchConfiguration: selfTeam = ");
        sbLIZ.append(arrayList);
        sbLIZ.append(", rivalTeam = ");
        sbLIZ.append(arrayList2);
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF.setValue(linkedHashMap);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJJIJIIJIL(Playbook playbook) {
        String str;
        MutableLiveData<C978110bYn> mutableLiveData = this.LJJIJIIJI;
        C978110bYn c978110bYn = null;
        String str2 = null;
        if (playbook != null) {
            long j = playbook.playbookId;
            PlaybookContent playbookContent = playbook.content;
            if (playbookContent != null) {
                str2 = playbookContent.title;
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (playbookContent != null && (str = playbookContent.coverUrl) != null) {
                str3 = str;
            }
            c978110bYn = new C978110bYn(j, str2, str3);
        }
        mutableLiveData.setValue(c978110bYn);
    }

    public final void LJIIJJI(EnumC976510bWD enumC976510bWD, boolean z) {
        int i;
        long j;
        List<C954460awe> list;
        C954460awe c954460awe;
        EnumC919170a1j value = this.LJIILIIL.getValue();
        if (value == null) {
            i = -1;
        } else {
            i = C976340bVw.LIZIZ[value.ordinal()];
        }
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cancelInvitation, Unsupported match type: ");
                sbLIZ.append(this.LJIILIIL.getValue());
                C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            Map<Boolean, List<C954460awe>> value2 = this.LJFF.getValue();
            if (value2 != null && (list = value2.get(Boolean.FALSE)) != null && (c954460awe = (C954460awe) C13LP.LJJJLZIJ(0, list)) != null) {
                j = c954460awe.LJ;
            } else {
                j = 0;
            }
            if (LJJIIZ()) {
                C20441214yg.LIZIZ("CombinedMatchInviterViewModel", "CoHost inviteCancel is called.");
                LJIIJ(j, this.LJJIZ.LIZIZ, this.LJJJJZ);
                return;
            }
            this.LJIIZILJ.setValue(Boolean.TRUE);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cancelInvitation, cancelReason=");
            sbLIZ2.append(enumC976510bWD);
            sbLIZ2.append(", isRematch=");
            sbLIZ2.append(z);
            sbLIZ2.append(", rivalId=");
            sbLIZ2.append(j);
            C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            LJJI(this.LJJIJLIJ, z, enumC976510bWD, Long.valueOf(j), Integer.valueOf(this.LJJJJLL), this.LJJJJZ, null);
            return;
        }
        this.LJIIZILJ.setValue(Boolean.TRUE);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("cancelInvitation, cancelReason=");
        sbLIZ3.append(enumC976510bWD);
        sbLIZ3.append(", isRematch=");
        sbLIZ3.append(z);
        sbLIZ3.append(", battleId=");
        sbLIZ3.append(this.LJJIJLIJ);
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ3));
        LJJI(this.LJJIJLIJ, z, enumC976510bWD, null, null, null, null);
    }

    public final void LJIILIIL(boolean z, EnumC959580b4u enumC959580b4u) {
        DataChannel dataChannel;
        if (z) {
            this.LJIILL.setValue(Boolean.FALSE);
            if (enumC959580b4u == EnumC959580b4u.TEAM_PAIR_ONE_V_ONE_BATTLE_BUTTON_CLICKED && (dataChannel = this.LIZ) != null) {
                dataChannel.zW(ShouldTriggerInviteOnOpen.class, Boolean.TRUE);
            }
            this.LJJJZ.invoke();
            C915980Zwa.LJIIIZ().LIZ(enumC959580b4u, null);
            LJI();
            DataChannel dataChannel2 = this.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.zW(BattleIsInTeamPairing.class, new C962900bAG(false, false, 4));
            }
        }
        this.LJIIZILJ.setValue(Boolean.FALSE);
    }

    public final void LJIIZILJ(long j, EnumC975850bV9 enumC975850bV9) {
        long id;
        boolean z;
        boolean z2;
        long j2;
        List<C954460awe> list;
        C954460awe c954460awe;
        DataChannel dataChannel;
        Long l;
        User owner;
        this.LJIILL.setValue(Boolean.TRUE);
        MutableLiveData<Boolean> mutableLiveData = this.LJIIZILJ;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.LJJJJ = false;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ);
        if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
            id = owner.getId();
        } else {
            id = 0;
        }
        long jLIZ = C978480bZO.LIZ(true);
        int i = LiveDirectMatchSetting.INSTANCE.getValue().inviterTimeout;
        if (this.LJJIJLIJ == j && (dataChannel = this.LIZ) != null && (l = (Long) dataChannel.gg0(BattleInvitingTimeLeftChannel.class)) != null) {
            jLIZ = l.longValue();
        }
        if (enumC975850bV9 == EnumC975850bV9.SOLO_INVITER_FROM_JSB) {
            z = true;
        } else {
            z = false;
        }
        if (enumC975850bV9 == EnumC975850bV9.INVITER_FROM_PROFILE) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLIZ = C976600bWM.LIZ(enumC975850bV9);
        EnumC919170a1j value = this.LJIILIIL.getValue();
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_1V1;
        if (value == enumC919170a1j && (z || z2 || zLIZ)) {
            jLIZ = i;
        }
        this.LJJIJLIJ = j;
        Map<Boolean, List<C954460awe>> value2 = this.LJFF.getValue();
        if (value2 != null && (list = value2.get(bool)) != null && (c954460awe = (C954460awe) C13LP.LJJJLZIJ(0, list)) != null) {
            j2 = c954460awe.LJ;
        } else {
            j2 = 0;
        }
        LJIIIIZZ(id, true);
        LJFF(this.LIZ, jLIZ, new AwS8S0100200_15(this, j2, j, 0));
        if (this.LJJL == EnumC975850bV9.INVITER_FROM_FRIEND_RANK) {
            this.LJJIIJZLJL.setValue(new C977740bYC(C497740JfY.LJIJI(2131855551), 2, 0));
        } else if (this.LJIILIIL.getValue() == enumC919170a1j) {
            this.LJJIIJZLJL.setValue(new C977740bYC(C497740JfY.LJIJI(2131853761), 0));
        } else {
            this.LJJIIJZLJL.setValue(new C977740bYC(C497740JfY.LJIJI(2131853760), 0));
        }
    }

    public final void LJJIIJ(C975600bUk c975600bUk, Function0<Unit> function0) {
        if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
            if (this.LJJJJ) {
                C20441214yg.LJIIL("CombinedMatchInviterViewModel", "sendInviteWithEvent blocked: invite already in flight");
                C974540bT2.LIZ.LL("invite_in_flight");
                C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.INVITE_IN_FLIGHT, 0, false, EnumC919170a1j.MATCH_TYPE_1V1, 14);
                return;
            } else if (this.LJJIJLIJ != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendInviteWithEvent blocked: active battleId=");
                sbLIZ.append(this.LJJIJLIJ);
                C20441214yg.LJIIL("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
                C974540bT2.LIZ.LL("active_battle_id");
                C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.ACTIVE_BATTLE_ID, 0, false, EnumC919170a1j.MATCH_TYPE_1V1, 14);
                return;
            }
        }
        this.LJJJJ = true;
        this.LJJJIL = false;
        this.LJJIZ = c975600bUk.LJI;
        LJJII(false, Long.valueOf(c975600bUk.LIZ), 5, c975600bUk.LIZLLL, c975600bUk.LJ, false, Integer.valueOf(this.LJJIZ.LIZ), c975600bUk.LJFF, function0);
        if (LiveMatchInviteMockSetting.INSTANCE.isDuplicateInviteEnabled() && !this.LJJJJI) {
            this.LJJJJI = true;
            C20441214yg.LJIIL("CombinedMatchInviterViewModel", "MOCK: scheduling duplicate sendInviteWithEvent to test VM-level guard");
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS48S0300000_15(this, c975600bUk, function0, 6));
        }
    }

    public final void LJJIJIL(EnumC919170a1j enumC919170a1j, List<? extends List<String>> list) {
        List arrayList;
        InterfaceC2262081DgM currentUser;
        this.LJIILIIL.setValue(enumC919170a1j);
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            currentUser.getId();
        }
        List list2 = (List) C13LP.LJJJLL(list);
        List listLJJJJIZL = C13LP.LJJJJIZL(list, 1);
        if (enumC919170a1j == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
            arrayList = new ArrayList();
            Iterator it2 = listLJJJJIZL.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI((Iterable) it2.next(), arrayList);
            }
        } else {
            arrayList = (List) C13LP.LJJJLL(listLJJJJIZL);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it3.next());
                if (lLJIILIIL != null) {
                    long jLongValue = lLJIILIIL.longValue();
                    Iterator<C954460awe> it4 = listLLILZLL.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            C954460awe next = it4.next();
                            if (next.LJ == jLongValue) {
                                if (next != null) {
                                    arrayList2.add(next);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arrayList != null) {
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL((String) it5.next());
                if (lLJIILIIL2 != null) {
                    long jLongValue2 = lLJIILIIL2.longValue();
                    if (this.LJJJJLL == 5) {
                        arrayList3.add(new C954460awe(jLongValue2));
                    } else {
                        Iterator<C954460awe> it6 = listLLILZLL.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                C954460awe next2 = it6.next();
                                if (next2.LJ == jLongValue2) {
                                    if (next2 != null) {
                                        arrayList3.add(next2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Boolean.TRUE, arrayList2);
        linkedHashMap.put(Boolean.FALSE, arrayList3);
        this.LJFF.setValue(linkedHashMap);
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
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C915980Zwa.LJII().LLJJLIIIJLLLLLLLZ(c920580a40, null, C915280ZvS.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIL(int i, String str, String str2) {
        EnumC964170bCJ enumC964170bCJRY = C915980Zwa.LJFF().RY(this.LJJJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError, errorCode: ");
        sbLIZ.append(i);
        sbLIZ.append(", message: ");
        sbLIZ.append(str);
        sbLIZ.append(", currentMatchStatus: ");
        sbLIZ.append(enumC964170bCJRY);
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (str == null) {
            str = "";
        }
        EnumC919170a1j value = this.LJIILIIL.getValue();
        if (value == null) {
            value = EnumC919170a1j.UNKNOWN;
        }
        EnumC977690bY7 enumC977690bY7 = (EnumC977690bY7) this.LJIJJ.getValue();
        if (enumC977690bY7 == null) {
            enumC977690bY7 = EnumC977690bY7.NONE;
        }
        if (Intrinsics.LJFF(str2, "render_error")) {
            String str3 = this.LJJJJZI;
            HashMap map = new HashMap();
            map.put("error_message", str);
            map.put("match_type", String.valueOf(value.getType()));
            map.put("sub_match_type", str3);
            C975060bTs.LIZ("livesdk_match_inviter_lynx_render_error", map);
        } else if (Intrinsics.LJFF(str2, "runtime_error")) {
            int iOrdinal = enumC977690bY7.ordinal();
            HashMap map2 = new HashMap();
            map2.put("error_code", String.valueOf(i));
            map2.put("error_message", str);
            map2.put("match_type", String.valueOf(value.getType()));
            map2.put("invite_status", String.valueOf(iOrdinal));
            C975060bTs.LIZ("livesdk_match_inviter_lynx_runtime_error", map2);
        }
        int i2 = C976340bVw.LIZ[enumC964170bCJRY.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onError, unregistered currentMatchStatus: ");
                    sbLIZ2.append(enumC964170bCJRY);
                    C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                this.LJJLIIIJILLIZJL.invoke();
                return;
            }
            Function1<? super EnumC919170a1j, Unit> function1 = this.LJJLIIIJ;
            EnumC919170a1j value2 = this.LJIILIIL.getValue();
            if (value2 == null) {
                value2 = EnumC919170a1j.UNKNOWN;
            }
            function1.invoke(value2);
            return;
        }
        this.LJJLIIIIJ.invoke();
    }

    public final void LJJ(int i, List<? extends List<String>> list, EnumC919170a1j enumC919170a1j) {
        List<C954460awe> arrayList;
        List<C954460awe> arrayList2;
        String str;
        List<C954460awe> list2;
        List<C954460awe> list3;
        Long l;
        int i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMainButtonClick: action = ");
        sbLIZ.append(i);
        sbLIZ.append(", teamsList = ");
        sbLIZ.append(list);
        sbLIZ.append(", matchType = ");
        sbLIZ.append(enumC919170a1j);
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (C915980Zwa.LIZIZ().JV1(false).isInProcess()) {
            C20441214yg.LIZIZ("CombinedMatchInviterViewModel", "onMainButtonClick. currently in competition, ignore invite request");
            if (C915980Zwa.LIZIZ().Dn0().isCatchBean()) {
                i2 = 2131851723;
            } else {
                i2 = 2131851724;
            }
            C766270U4b.LIZLLL(i2);
            return;
        }
        LJJIJIL(enumC919170a1j, list);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(BattleInvitingTimeLeftChannel.class)) != null) {
            l.longValue();
        }
        EnumC973700bRg enumC973700bRg = EnumC973700bRg.TEAMMATE_SELECTION;
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                enumC973700bRg = EnumC973700bRg.INVITE_WAITING;
                if (LJIJI(enumC919170a1j)) {
                    MutableLiveData<Boolean> mutableLiveData = this.LJIIZILJ;
                    Boolean bool = Boolean.TRUE;
                    mutableLiveData.setValue(bool);
                    this.LJJJJJ.setValue(bool);
                } else if (this.LJIILIIL.getValue() == EnumC919170a1j.MATCH_TYPE_1V1) {
                    MutableLiveData<Boolean> mutableLiveData2 = this.LJIIZILJ;
                    if (mutableLiveData2 != null) {
                        mutableLiveData2.setValue(Boolean.TRUE);
                    }
                    this.LJJJJL.setValue(Boolean.TRUE);
                } else {
                    LJIIL(true);
                }
                str = "withdraw";
            }
        } else {
            if (LiveMatchInviterPanelLynxMockErrorSetting.INSTANCE.isErrorBeforeInvite()) {
                C766270U4b.LJIIJJI("DEBUG TOAST: Triggered before invite error");
                LJIL(0, "Mock error", "runtime_error");
                return;
            }
            if (LJIJI(enumC919170a1j)) {
                if (C915980Zwa.LJFF().co0()) {
                    C20441214yg.LIZIZ("CombinedMatchInviterViewModel", "onMainButtonClick, in match, endCurrentVictoryLap first");
                    InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
                    if (interfaceC975870bVBLJFF != null) {
                        interfaceC975870bVBLJFF.LJFF(true);
                    }
                    InterfaceC975870bVB interfaceC975870bVBLJFF2 = C915980Zwa.LJI().LJFF();
                    if (interfaceC975870bVBLJFF2 != null) {
                        interfaceC975870bVBLJFF2.LJIJJLI(new AwS559S0100000_15(this, 857));
                    }
                    C915980Zwa.LJFF().S6(AFwS203S0000000_15.get$arr$(327));
                } else {
                    C20441214yg.LIZIZ("CombinedMatchInviterViewModel", "onMainButtonClick, not in match, startTeamPair directly");
                    LJJIIZI();
                }
            } else {
                InterfaceC1631620sYq<? super EnumC919170a1j, ? super List<C954460awe>, ? super List<C954460awe>, Unit> interfaceC1631620sYq = this.LJJJLL;
                Map<Boolean, List<C954460awe>> value = this.LJFF.getValue();
                if (value == null || (arrayList = value.get(Boolean.TRUE)) == null) {
                    arrayList = new ArrayList<>();
                }
                Map<Boolean, List<C954460awe>> value2 = this.LJFF.getValue();
                if (value2 == null || (arrayList2 = value2.get(Boolean.FALSE)) == null) {
                    arrayList2 = new ArrayList<>();
                }
                interfaceC1631620sYq.invoke(enumC919170a1j, arrayList, arrayList2);
            }
            str = "invite";
        }
        C973660bRc c973660bRc = C973660bRc.LIZ;
        Map<Boolean, List<C954460awe>> value3 = this.LJFF.getValue();
        if (value3 != null) {
            list2 = value3.get(Boolean.TRUE);
        } else {
            list2 = null;
        }
        Map<Boolean, List<C954460awe>> value4 = this.LJFF.getValue();
        if (value4 != null) {
            list3 = value4.get(Boolean.FALSE);
        } else {
            list3 = null;
        }
        String str2 = str;
        C973660bRc.LJJJLZIJ(str, list2, list3, null, this.LJJJJZI, false, enumC973700bRg, LJIJI(null), LJIJI(null), false, null, null, enumC919170a1j, this.LJJLI, 3592);
        if (Intrinsics.LJFF(str, "invite") || Intrinsics.LJFF(str, "withdraw")) {
            C974540bT2.LIZ.LJJLI(0L, str2, this.LJJJ);
        }
    }

    public final void LJIJJ(Long l, String str, boolean z, boolean z2) {
        long id;
        List<C954460awe> list;
        long jLongValue;
        long j;
        String str2;
        User owner;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ);
        if (roomLJJLIIIIJ != null && (owner = roomLJJLIIIIJ.getOwner()) != null) {
            id = owner.getId();
        } else {
            id = 0;
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        List<C954460awe> list2 = (List) this.LIZJ.getValue();
        if (listLLILZLL.size() < 2 && list2 != null) {
            listLLILZLL = list2;
        }
        C925640aCA.LJ(C915980Zwa.LJI().LJIIJ().LJJIJIIJI());
        boolean zLJFF = Intrinsics.LJFF(str, C973660bRc.LJJLIIIJL);
        List<C954460awe> list3 = null;
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
                list3 = value2.get(Boolean.FALSE);
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
                if (Intrinsics.LJFF(this.LJJJJZI, C973660bRc.LJJLIIIJL)) {
                    str2 = "2v2";
                } else {
                    str2 = this.LJJJJZI;
                }
                C973660bRc.LIZ.LJJLIIIJ(jLongValue, z2, list, list3, j, id, z, str2, C915980Zwa.LJI().LIZ().LJIILLIIL(), str);
            }
        }
    }

    public final void LJJIII(final boolean z, final Long l, final EnumC919170a1j enumC919170a1j, final boolean z2) {
        int i;
        List<C954460awe> list;
        List<C954460awe> list2;
        long id;
        long id2;
        long jLongValue;
        long jLongValue2;
        List<C954460awe> list3;
        List<C954460awe> list4;
        User owner;
        User owner2;
        boolean z3;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<C954460awe> list5;
        List<C954460awe> list6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendInvite, isRematch: ");
        sbLIZ.append(z);
        sbLIZ.append(", onlyGiftId: ");
        sbLIZ.append(l);
        sbLIZ.append(", matchType: ");
        sbLIZ.append(enumC919170a1j);
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveMatchInvite4004049FixSetting.INSTANCE.isEnable()) {
            if (this.LJJJJ) {
                C20441214yg.LJIIL("CombinedMatchInviterViewModel", "sendInvite blocked: invite already in flight");
                C974540bT2.LIZ.LL("invite_in_flight");
                C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.INVITE_IN_FLIGHT, 0, z, enumC919170a1j, 6);
                return;
            } else if (this.LJJIJLIJ != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sendInvite blocked: active battleId=");
                sbLIZ2.append(this.LJJIJLIJ);
                C20441214yg.LJIIL("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                C974540bT2.LIZ.LL("active_battle_id");
                C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.ACTIVE_BATTLE_ID, 0, z, enumC919170a1j, 6);
                return;
            }
        }
        this.LJJJJ = true;
        this.LJJJIL = false;
        MutableLiveData<Boolean> mutableLiveData = this.LJIIZILJ;
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(bool);
        MutableLiveData<Boolean> mutableLiveData2 = this.LJIILL;
        Boolean bool2 = Boolean.FALSE;
        mutableLiveData2.setValue(bool2);
        this.LJII.setValue(new HashMap());
        List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
        if (!listLJJLI.isEmpty()) {
            LIZLLL(listLJJLI);
        }
        if (Intrinsics.LJFF(C915980Zwa.LJI().LJIIJ().LJJIJIIJI(), EnumC973640bRa.PK_REMATCH.getValue())) {
            i = 6;
        } else if (z) {
            i = 1;
        } else {
            i = 0;
        }
        if (enumC919170a1j != null) {
            int i2 = C976340bVw.LIZIZ[enumC919170a1j.ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    Map<Boolean, List<C954460awe>> value = this.LJFF.getValue();
                    if (value != null && (list6 = value.get(bool)) != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(list6, 10));
                        Iterator<C954460awe> it2 = list6.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Long.valueOf(it2.next().LJ));
                        }
                    } else {
                        arrayList = null;
                    }
                    Map<Boolean, List<C954460awe>> value2 = this.LJFF.getValue();
                    if (value2 != null && (list5 = value2.get(Boolean.FALSE)) != null) {
                        arrayList2 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                        Iterator<C954460awe> it3 = list5.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(Long.valueOf(it3.next().LJ));
                        }
                    } else {
                        arrayList2 = null;
                    }
                    LJJII(z, l, i, arrayList, arrayList2, z2, null, null, null);
                }
            } else {
                Map<Boolean, List<C954460awe>> value3 = this.LJFF.getValue();
                if (value3 != null) {
                    list = value3.get(bool);
                } else {
                    list = null;
                }
                Map<Boolean, List<C954460awe>> value4 = this.LJFF.getValue();
                if (value4 != null) {
                    list2 = value4.get(bool2);
                } else {
                    list2 = null;
                }
                if (LJIJ()) {
                    this.LJJ.setValue(C977770bYF.LIZ(new C977770bYF(0), null, null, new C977870bYP(), null, null, 27));
                    LJIILLIIL();
                    C974540bT2 c974540bT2 = C974540bT2.LIZ;
                    C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.HOSTS_CHANGED, i, z, enumC919170a1j, 4);
                } else {
                    this.LJJJ = z;
                    C501470JlZ c501470JlZ = this.LJJJJIZL;
                    if (c501470JlZ != null) {
                        this.LJJJJIZL = null;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("MOCK: bypassing invite API; posting onInviteFailed with errorCode=");
                        sbLIZ3.append(Integer.valueOf(c501470JlZ.getErrorCode()));
                        C20441214yg.LJIIL("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ3));
                        C786410Ut5.LJJZZIII(C0IK5.LIZ(), new ARunnableS84S0200000_15(this, c501470JlZ, 48));
                    } else {
                        long channelId = C915980Zwa.LJII().getChannelId();
                        if (channelId == 0) {
                            C20441214yg.LJ("TeamMatchInviterInviteeViewModel", "Invite Request Error: channelId is empty");
                            C974540bT2 c974540bT22 = C974540bT2.LIZ;
                            C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.CHANNEL_ID_INVALID, i, z, enumC919170a1j, 4);
                            LJIILLIIL();
                        } else if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
                            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ);
                            if (roomLJJLIIIIJ != null && (owner2 = roomLJJLIIIIJ.getOwner()) != null) {
                                id = owner2.getId();
                            } else {
                                id = 0;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (C954460awe c954460awe : list) {
                                if (c954460awe.LJ != id) {
                                    arrayList3.add(c954460awe);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                            Iterator it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                arrayList4.add(Long.valueOf(((C954460awe) it4.next()).LJ));
                            }
                            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62);
                            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            Iterator<C954460awe> it5 = list2.iterator();
                            while (it5.hasNext()) {
                                arrayList5.add(Long.valueOf(it5.next().LJ));
                            }
                            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList5, ",", null, null, 0, null, null, 62);
                            Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(this.LIZ);
                            if (roomLJJLIIIIJ2 != null && (owner = roomLJJLIIIIJ2.getOwner()) != null) {
                                id2 = owner.getId();
                            } else {
                                id2 = 0;
                            }
                            Iterator<C954460awe> it6 = C915980Zwa.LJII().LLILZLL(true).iterator();
                            while (it6.hasNext()) {
                                long j = it6.next().LJ;
                                if (j != id2) {
                                    C973660bRc c973660bRc = C973660bRc.LIZ;
                                    Map<Boolean, List<C954460awe>> value5 = this.LJFF.getValue();
                                    if (value5 != null) {
                                        list3 = value5.get(Boolean.TRUE);
                                    } else {
                                        list3 = null;
                                    }
                                    Map<Boolean, List<C954460awe>> value6 = this.LJFF.getValue();
                                    if (value6 != null) {
                                        list4 = value6.get(Boolean.FALSE);
                                    } else {
                                        list4 = null;
                                    }
                                    C973660bRc.LIZ.LJLJLLL(j, list3, list4, true, z, this.LJJJJZI, null, C915980Zwa.LJI().LIZ().LJIILLIIL());
                                }
                            }
                            C974540bT2.LIZ.LJJLIIIJ(i);
                            System.currentTimeMillis();
                            int iLJIIIZ = C978520bZS.LJIIIZ();
                            C915980Zwa.LJI().LIZLLL();
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            Pair pairLIZIZ = C156900it.LIZIZ(iLJIIIZ, jLongValue);
                            int iIntValue = ((Number) pairLIZIZ.getFirst()).intValue();
                            String str = (String) pairLIZIZ.getSecond();
                            C480460Ism.LIZ().getClass();
                            MultiMatchApi multiMatchApi = (MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class);
                            if (l != null) {
                                jLongValue2 = l.longValue();
                            } else {
                                jLongValue2 = 0;
                            }
                            multiMatchApi.multiInvitePb(channelId, i, strLJJLIIIJ, strLJJLIIIJ2, C975070bTt.LIZ(iLJIIIZ, jLongValue2), enumC919170a1j.getType(), iLJIIIZ, iIntValue, str, C974540bT2.LJJII()).LJIILIIL(new C0UO0()).LJJLL(new AfS0S0111100_15(i, id, this, z, 3), new AfS1S0101100_15(i, id, this, 5));
                        } else {
                            C974540bT2 c974540bT23 = C974540bT2.LIZ;
                            C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.TEAM_EMPTY, i, z, enumC919170a1j, 4);
                            LJIILLIIL();
                        }
                    }
                }
            }
            LiveMatchInviteMockSetting liveMatchInviteMockSetting = LiveMatchInviteMockSetting.INSTANCE;
            if (liveMatchInviteMockSetting.isVmClearedEnabled()) {
                C20441214yg.LJIIL("CombinedMatchInviterViewModel", "MOCK: forcing isCleared=true to simulate VM-cleared race (Block E)");
                z3 = true;
                this.LJJJIL = true;
            } else {
                z3 = true;
            }
            if (liveMatchInviteMockSetting.isDuplicateInviteEnabled() && !this.LJJJJI) {
                this.LJJJJI = z3;
                C20441214yg.LJIIL("CombinedMatchInviterViewModel", "MOCK: scheduling duplicate sendInvite to test VM-level guard");
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0bYD
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CombinedMatchInviterViewModel@5274.sendInvite$3");
                        try {
                            this.LL.LJJIII(z, l, enumC919170a1j, z2);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CombinedMatchInviterViewModel@5274.sendInvite$3");
                    }
                });
                return;
            }
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("sendInvite, invalid match type ");
        sbLIZ4.append(enumC919170a1j);
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ4));
        this.LJJJJ = false;
        this.LJIIZILJ.setValue(bool2);
    }

    public final void LJJI(long j, boolean z, EnumC976510bWD enumC976510bWD, Long l, Integer num, Integer num2, C957590b1h c957590b1h) {
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
        switch (C976340bVw.LIZLLL[enumC976510bWD.ordinal()]) {
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
        twoMatchApi.cancel(id, jLJJL, j, i, num, num2, l).LJIILIIL(new C0UO0()).LJJLL(new AfS0S0310100_15(enumC976510bWD, z, this, c957590b1h, j, 1), new AfS1S0210100_15(j, z, this, c957590b1h, 1));
    }

    public final void LJJII(boolean z, Long l, int i, List<Long> list, List<Long> list2, boolean z2, Integer num, C954360awU c954360awU, Function0<Unit> function0) {
        Object objLJJJLL;
        long id;
        long jLongValue;
        long id2;
        long jLongValue2;
        long jLongValue3;
        List<C954460awe> list3;
        List<C954460awe> list4;
        long j;
        C954460awe c954460awe;
        User owner;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inviteType=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 5 && LJIJ()) {
            this.LJJ.setValue(C977770bYF.LIZ(new C977770bYF(0), null, null, new C977870bYP(), null, null, 27));
            LJIILLIIL();
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.HOSTS_CHANGED, i, z, EnumC919170a1j.MATCH_TYPE_1V1, 4);
            C20441214yg.LJIIL("CombinedMatchInviterViewModel", "Has unlinked host, can not send invite");
        }
        this.LJJJ = z;
        this.LJJJJLL = i;
        this.LJJJJZ = num;
        C501470JlZ c501470JlZ = this.LJJJJIZL;
        Long l2 = null;
        if (c501470JlZ != null) {
            this.LJJJJIZL = null;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MOCK: bypassing invite API; posting onInviteFailed with errorCode=");
            sbLIZ2.append(Integer.valueOf(c501470JlZ.getErrorCode()));
            C20441214yg.LJIIL("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            C786410Ut5.LJJZZIII(C0IK5.LIZ(), new ARunnableS84S0200000_15(this, c501470JlZ, 47));
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
            C915980Zwa.LJI().LIZLLL();
            if (l != null) {
                jLongValue2 = l.longValue();
            } else {
                jLongValue2 = 0;
            }
            Pair pairLIZIZ = C156900it.LIZIZ(iLJIIIZ, jLongValue2);
            int iIntValue = ((Number) pairLIZIZ.getFirst()).intValue();
            String str = (String) pairLIZIZ.getSecond();
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
            C20441214yg.LIZIZ("CombinedMatchInviterViewModel", C2188811AlT.LIZIZ(sbLIZ3));
            C480460Ism.LIZ().getClass();
            TwoMatchApi twoMatchApi = (TwoMatchApi) C480460Ism.LIZLLL(TwoMatchApi.class);
            if (l != null) {
                jLongValue3 = l.longValue();
            } else {
                jLongValue3 = 0;
            }
            twoMatchApi.invite(id2, channelId, jLongValue, i, C975070bTt.LIZ(iLJIIIZ, jLongValue3), z2, iLJIIIZ, num, iIntValue, str, null).LJIILIIL(new C0UO0()).LJJLL(new AfS0S0411200_15(this, i, id, jLongValue, num, function0, z, c954360awU, 0), new AfS2S0201100_15(i, id, this, c954360awU, 1));
            String str2 = C973660bRc.LJJLIIIJJI;
            Map<Boolean, List<C954460awe>> value = this.LJFF.getValue();
            if (value != null) {
                list3 = value.get(Boolean.TRUE);
            } else {
                list3 = null;
            }
            Map<Boolean, List<C954460awe>> value2 = this.LJFF.getValue();
            if (value2 != null) {
                list4 = value2.get(Boolean.FALSE);
            } else {
                list4 = null;
            }
            C925640aCA.LJ(C915980Zwa.LJI().LJIIJ().LJJIJIIJI());
            if (!Intrinsics.LJFF(str2, C973660bRc.LJJLIIIJL) && list4 != null && (c954460awe = (C954460awe) C13LP.LJJJLL(list4)) != null) {
                j = c954460awe.LJ;
            } else {
                j = 0;
            }
            C973660bRc.LIZ.LJLJLLL(j, list3, list4, false, z, this.LJJJJZI, str2, C915980Zwa.LJI().LIZ().LJIILLIIL());
            C955650ayZ.LIZJ(true);
            return;
        }
        C974540bT2 c974540bT22 = C974540bT2.LIZ;
        C974540bT2.LJJLIIIJILLIZJL(EnumC977680bY6.TEAM_EMPTY, i, z, EnumC919170a1j.MATCH_TYPE_1V1, 4);
        LJIILLIIL();
        C20441214yg.LJIIL("CombinedMatchInviterViewModel", "selfTeamUser or rivalTeamUser is null");
    }
}

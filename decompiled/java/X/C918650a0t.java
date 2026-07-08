package X;

import Y.AcS496S0100000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCoHostMaxGuestCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceCancelInviteTimerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiInviteMixModeOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUnifiedInviteRouteOptSetting;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS112S0400000_15;
import kotlin.jvm.internal.AwS11S0300100_15;
import kotlin.jvm.internal.AwS18S0410000_15;
import kotlin.jvm.internal.AwS19S0300100_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS49S0500000_15;
import kotlin.jvm.internal.AwS52S0000100_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS9S1301000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;
import webcast.data.multilive_biz.BizInviteParams;

/* JADX INFO: renamed from: X.0a0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918650a0t implements InterfaceC918930a1L {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIILL;
    public final Room LIZ;
    public final DataChannel LIZIZ;
    public final Function0<Context> LIZJ;
    public final Function0<LifecycleOwner> LIZLLL;
    public final Function2<String, Function1<? super String, Unit>, Boolean> LJ;
    public final C920310a3Z LJFF;
    public final LiveMode LJI;
    public final boolean LJII;
    public final C11NJ LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final Set<Long> LJIIJ;
    public final C01GW LJIIJJI;
    public final C304201Fw LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C918650a0t.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C13LE.LIZ.getClass();
        LJIILL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final MultiGuestDataHolder LJI() {
        C304201Fw c304201Fw = this.LJIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJIILL;
        return (MultiGuestDataHolder) c304201Fw.LIZ();
    }

    @Override // X.InterfaceC918930a1L
    public final void onDestroy() {
        this.LJIIIIZZ.LJ();
        ((C588290N5n) this.LJIIJJI.getValue()).LIZJ.clear();
        ((C920310a3Z) this.LJIILIIL.getValue()).LIZJ();
        ((Handler) this.LJIIIZ.getValue()).removeCallbacksAndMessages(null);
        this.LJIIJ.clear();
    }

    @Override // X.InterfaceC918930a1L
    public final void LIZIZ(C918350a0P c918350a0P) {
        InterfaceC918290a0J interfaceC918290a0J;
        InterfaceC918330a0N interfaceC918330a0N;
        String strLIZ;
        C915880ZwQ c915880ZwQ;
        long id;
        String strLIZ2;
        C918350a0P c918350a0PLIZ = c918350a0P;
        InterfaceC918290a0J interfaceC918290a0J2 = c918350a0PLIZ.LIZIZ;
        final String str = "";
        if (interfaceC918290a0J2 instanceof C918410a0V) {
            C918410a0V c918410a0V = (C918410a0V) interfaceC918290a0J2;
            LinkPlayerInfo linkPlayerInfoLIZ = c918350a0PLIZ.LIZ.LIZ();
            User user = linkPlayerInfoLIZ.mUser;
            if (user != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            User user2 = linkPlayerInfoLIZ.mUser;
            if (user2 != null && (strLIZ2 = C0KVU.LIZ(user2)) != null) {
                str = strLIZ2;
            }
            C918360a0Q c918360a0Q = c918350a0PLIZ.LIZJ;
            Function0<Unit> function0 = c918360a0Q.LIZ;
            Function1<C918230a0D, Unit> function1 = c918360a0Q.LIZJ;
            final long j = id;
            C918360a0Q c918360a0Q2 = new C918360a0Q(new AwS19S0300100_15(this, (C918650a0t) id, (long) c918410a0V, (C918410a0V) function0, (Function0<Unit>) 3), new AwS11S0300100_15(this, id, c918410a0V, c918350a0PLIZ, 1), new AwS49S0500000_15(this, (C918650a0t) c918350a0PLIZ, (C918350a0P) linkPlayerInfoLIZ, (LinkPlayerInfo) c918410a0V, (C918410a0V) function1, (Function1<? super C918230a0D, Unit>) 0));
            C918370a0R c918370a0R = c918350a0PLIZ.LIZLLL;
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            Function2<String, Function1<? super String, Unit>, Boolean> function2 = this.LJ;
            String str2 = c918410a0V.LJFF;
            if (str2 == null) {
                str2 = c918410a0V.LIZJ;
            }
            final String str3 = c918410a0V.LIZLLL;
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS52S0000100_15(j, 1));
            final AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(c01gwLIZIZ, (C01GW<? extends LinkPlayerInfo>) 1026);
            final AwS559S0100000_15 awS559S0100000_152 = new AwS559S0100000_15(c01gwLIZIZ, (C01GW<? extends LinkPlayerInfo>) 1027);
            c13dvLIZIZ.addAll(C1697810uHb.LJIIJJI(new C918760a14(function2, str2), new InterfaceC918590a0n(j) { // from class: X.0a1I
                public final long LIZ;

                {
                    this.LIZ = j;
                }

                @Override // X.InterfaceC918590a0n
                public final C918610a0p LIZ(C918580a0m c918580a0m) {
                    if (this.LIZ == 0) {
                        return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.INVALID_UID, "invalid_uid");
                    }
                    return new C918610a0p(EnumC918840a1C.PASSED);
                }
            }, new InterfaceC918590a0n(str3) { // from class: X.0a13
                public final String LIZ;

                {
                    this.LIZ = str3;
                }

                @Override // X.InterfaceC918590a0n
                public final C918610a0p LIZ(C918580a0m c918580a0m) {
                    if (a0.LJJJIL(this.LIZ)) {
                        return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.INVITE_SOURCE_EMPTY, "invite_source_empty");
                    }
                    return new C918610a0p(EnumC918840a1C.PASSED);
                }
            }, new InterfaceC918590a0n() { // from class: X.0a10
                @Override // X.InterfaceC918590a0n
                public final C918610a0p LIZ(C918580a0m c918580a0m) {
                    if (!C931790aM5.LIZIZ() && C925150aBN.LIZLLL() == null) {
                        return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.LAYOUT_ID_MISSING, "layout_id_missing");
                    }
                    return new C918610a0p(EnumC918840a1C.PASSED);
                }
            }, new InterfaceC918590a0n() { // from class: X.0a0s
                @Override // X.InterfaceC918590a0n
                public final C918610a0p LIZ(C918580a0m c918580a0m) {
                    if (!C489080JFy.LIZ(C949950apN.LIZIZ(), 2)) {
                        C766270U4b.LIZLLL(2131842740);
                        return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.IN_ROOM_MODE_DISABLED, "in_room_mode_disabled");
                    }
                    return new C918610a0p(EnumC918840a1C.PASSED);
                }
            }, new InterfaceC918590a0n(j, str3) { // from class: X.0a0q
                public final long LIZ;
                public final String LIZIZ;

                @Override // X.InterfaceC918590a0n
                public final C918610a0p LIZ(C918580a0m c918580a0m) {
                    Set<Long> setLLIIJI;
                    C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                    C307001Gy.LIZ().getClass();
                    InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                    if (interfaceC954180awCLLJLL == null || (setLLIIJI = interfaceC954180awCLLJLL.LLIIJI()) == null) {
                        setLLIIJI = C08CX.INSTANCE;
                    }
                    if (setLLIIJI.contains(Long.valueOf(this.LIZ)) && (!Intrinsics.LJFF(this.LIZIZ, "invitation_tab_viewers"))) {
                        C766270U4b.LIZLLL(2131842764);
                        return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.ALREADY_INVITED, "already_invited");
                    }
                    return new C918610a0p(EnumC918840a1C.PASSED);
                }

                {
                    this.LIZ = j;
                    this.LIZIZ = str3;
                }
            }, new InterfaceC918590a0n(str, awS559S0100000_15) { // from class: X.0a0x
                public final String LIZ;
                public final Function0<LinkPlayerInfo> LIZIZ;

                @Override // X.InterfaceC918590a0n
                public final C918610a0p LIZ(C918580a0m c918580a0m) {
                    LinkPlayerInfo linkPlayerInfoInvoke = this.LIZIZ.invoke();
                    if (linkPlayerInfoInvoke != null && linkPlayerInfoInvoke.LIZ == 1 && linkPlayerInfoInvoke.mRoleType == 2) {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842750, this.LIZ));
                        return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.TARGET_WAITING, "target_waiting");
                    }
                    return new C918610a0p(EnumC918840a1C.PASSED);
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = awS559S0100000_15;
                }
            }, new InterfaceC918590a0n(j, str, awS559S0100000_152) { // from class: X.0a0u
                public final long LIZ;
                public final String LIZIZ;
                public final Function0<LinkPlayerInfo> LIZJ;

                @Override // X.InterfaceC918590a0n
                public final C918610a0p LIZ(C918580a0m c918580a0m) {
                    boolean z;
                    List<LinkUser> listLIZLLL;
                    InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                    if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                        Iterator<LinkUser> it2 = listLIZLLL.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            LinkUser next = it2.next();
                            Long l = next.userId;
                            long j2 = this.LIZ;
                            if (l != null && l.longValue() == j2) {
                                if (next != null) {
                                    z = true;
                                }
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                    LinkPlayerInfo linkPlayerInfoInvoke = this.LIZJ.invoke();
                    if ((linkPlayerInfoInvoke != null && linkPlayerInfoInvoke.LIZ == 2) || z) {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842745, this.LIZIZ));
                        return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.TARGET_ALREADY_LINKED, "target_already_linked");
                    }
                    return new C918610a0p(EnumC918840a1C.PASSED);
                }

                {
                    this.LIZ = j;
                    this.LIZIZ = str;
                    this.LIZJ = awS559S0100000_152;
                }
            }, new InterfaceC918590a0n(j, str) { // from class: X.0a0w
                public final long LIZ;
                public final String LIZIZ;

                @Override // X.InterfaceC918590a0n
                public final C918610a0p LIZ(C918580a0m c918580a0m) {
                    if (((HashSet) C924810aAp.LJ().LJJIFFI).contains(Long.valueOf(this.LIZ))) {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842749, this.LIZIZ));
                        return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.TARGET_PREVIOUSLY_REJECTED, "target_previously_rejected");
                    }
                    return new C918610a0p(EnumC918840a1C.PASSED);
                }

                {
                    this.LIZ = j;
                    this.LIZIZ = str;
                }
            }, new InterfaceC918590a0n() { // from class: X.0a0r
                @Override // X.InterfaceC918590a0n
                public final C918610a0p LIZ(C918580a0m c918580a0m) {
                    if (C917810ZzX.LJIIIIZZ()) {
                        C917810ZzX.LIZ.getClass();
                        if (!C917810ZzX.LIZIZ()) {
                            C766270U4b.LIZLLL(2131851851);
                            return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.COHOST_INVITE_IN_PROGRESS, "cohost_invite_in_progress");
                        }
                    }
                    return new C918610a0p(EnumC918840a1C.PASSED);
                }
            }, new InterfaceC918590a0n() { // from class: X.0a0z
                @Override // X.InterfaceC918590a0n
                public final C918610a0p LIZ(C918580a0m c918580a0m) {
                    if (C917810ZzX.LJIIIIZZ()) {
                        C917810ZzX.LIZ.getClass();
                        if (C917810ZzX.LJFF() == LinkMicCoHostMaxGuestCountSetting.INSTANCE.getValue()) {
                            C766270U4b.LIZLLL(2131851854);
                            return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.COHOST_MAX_GUEST_REACHED, "cohost_max_guest_reached");
                        }
                    }
                    return new C918610a0p(EnumC918840a1C.PASSED);
                }
            }, new InterfaceC918590a0n() { // from class: X.0a11
                @Override // X.InterfaceC918590a0n
                public final C918610a0p LIZ(C918580a0m c918580a0m) {
                    if (LiveSdkMultiInviteMixModeOptSetting.isEnable() && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).n30() && !C917810ZzX.LJIIIIZZ() && !C917810ZzX.LJIIJ()) {
                        C766270U4b.LIZLLL(2131842740);
                        return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.MIX_MODE_NOT_AVAILABLE, "mix_mode_not_available");
                    }
                    return new C918610a0p(EnumC918840a1C.PASSED);
                }
            }));
            c13dvLIZIZ.addAll(c918350a0PLIZ.LIZLLL.LIZ);
            c918350a0PLIZ = C918350a0P.LIZ(c918350a0PLIZ, null, c918360a0Q2, C918370a0R.LIZ(c918370a0R, C1697820uHc.LIZ(c13dvLIZIZ), false, 2), 3);
        } else if (interfaceC918290a0J2 instanceof C918310a0L) {
            C918310a0L c918310a0L = (C918310a0L) interfaceC918290a0J2;
            LinkPlayerInfo linkPlayerInfoLIZ2 = c918350a0PLIZ.LIZ.LIZ();
            int i = c918310a0L.LIZIZ;
            String str4 = c918310a0L.LIZLLL;
            Function1<Long, Unit> function12 = c918310a0L.LJ;
            C918360a0Q c918360a0Q3 = c918350a0PLIZ.LIZJ;
            Function1<C918230a0D, Unit> function13 = c918360a0Q3.LIZJ;
            Function0<Unit> function02 = c918360a0Q3.LIZ;
            long id2 = linkPlayerInfoLIZ2.mUser.getId();
            C918360a0Q c918360a0Q4 = c918350a0PLIZ.LIZJ;
            AwS19S0300100_15 awS19S0300100_15 = new AwS19S0300100_15((Function0) function02, (Function0<Unit>) this, (C918650a0t) id2, (long) function12, (Function1<? super Long, Unit>) 2);
            AwS112S0400000_15 awS112S0400000_15 = new AwS112S0400000_15(this, (C918650a0t) function12, (Function1<? super Long, Unit>) linkPlayerInfoLIZ2, (LinkPlayerInfo) c918350a0PLIZ, (C918350a0P) 6);
            AwS9S1301000_15 awS9S1301000_15 = new AwS9S1301000_15(this, linkPlayerInfoLIZ2, str4, i, function13, 0);
            c918360a0Q4.getClass();
            C918360a0Q c918360a0Q5 = new C918360a0Q(awS19S0300100_15, awS112S0400000_15, awS9S1301000_15);
            C918370a0R c918370a0R2 = c918350a0PLIZ.LIZLLL;
            C13DV c13dvLIZIZ2 = C1697820uHc.LIZIZ();
            final AwS559S0100000_15 awS559S0100000_153 = new AwS559S0100000_15(this, 1022);
            c13dvLIZIZ2.addAll(Collections.singletonList(new InterfaceC918590a0n(awS559S0100000_153) { // from class: X.0a0o
                public final Function0<Boolean> LIZ;

                {
                    this.LIZ = awS559S0100000_153;
                }

                @Override // X.InterfaceC918590a0n
                public final C918610a0p LIZ(C918580a0m c918580a0m) {
                    if (this.LIZ.invoke().booleanValue()) {
                        return new C918610a0p(EnumC918840a1C.FAILED, EnumC918770a15.FREQ_LIMITED, "freq_limited");
                    }
                    return new C918610a0p(EnumC918840a1C.PASSED);
                }
            }));
            c13dvLIZIZ2.addAll(c918350a0PLIZ.LIZLLL.LIZ);
            c918350a0PLIZ = C918350a0P.LIZ(c918350a0PLIZ, null, c918360a0Q5, C918370a0R.LIZ(c918370a0R2, C1697820uHc.LIZ(c13dvLIZIZ2), false, 2), 3);
        } else if (interfaceC918290a0J2 instanceof C918320a0M) {
            C918320a0M c918320a0M = (C918320a0M) interfaceC918290a0J2;
            LinkPlayerInfo linkPlayerInfoLIZ3 = c918350a0PLIZ.LIZ.LIZ();
            int i2 = c918320a0M.LIZIZ;
            String str5 = c918320a0M.LIZJ;
            C918360a0Q c918360a0Q6 = c918350a0PLIZ.LIZJ;
            C918360a0Q c918360a0QLIZ = C918360a0Q.LIZ(c918360a0Q6, new AwS9S1301000_15(this, linkPlayerInfoLIZ3, str5, i2, c918360a0Q6.LIZJ, 1));
            C918370a0R c918370a0R3 = c918350a0PLIZ.LIZLLL;
            C13DV c13dvLIZIZ3 = C1697820uHc.LIZIZ();
            c13dvLIZIZ3.addAll(Collections.singletonList(new C918700a0y(new AwS559S0100000_15(linkPlayerInfoLIZ3, 1023), this.LJ, str5, c918320a0M.LJ)));
            c13dvLIZIZ3.addAll(c918350a0PLIZ.LIZLLL.LIZ);
            c918350a0PLIZ = C918350a0P.LIZ(c918350a0PLIZ, null, c918360a0QLIZ, C918370a0R.LIZ(c918370a0R3, C1697820uHc.LIZ(c13dvLIZIZ3), false, 2), 3);
        } else {
            C918370a0R c918370a0R4 = c918350a0PLIZ.LIZLLL;
            if (c918370a0R4.LIZIZ) {
                List<InterfaceC918590a0n> list = c918370a0R4.LIZ;
                if ((list instanceof Collection) && list.isEmpty()) {
                    interfaceC918290a0J = c918350a0PLIZ.LIZIZ;
                    if (!(interfaceC918290a0J instanceof C915880ZwQ)) {
                        str = strLIZ;
                        C918760a14 c918760a14 = new C918760a14(this.LJ, str);
                        C918370a0R c918370a0R5 = c918350a0PLIZ.LIZLLL;
                        C13DV c13dvLIZIZ4 = C1697820uHc.LIZIZ();
                        c13dvLIZIZ4.add(c918760a14);
                        c13dvLIZIZ4.addAll(c918350a0PLIZ.LIZLLL.LIZ);
                        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ4);
                        c918370a0R5.getClass();
                        c918350a0PLIZ = C918350a0P.LIZ(c918350a0PLIZ, null, null, new C918370a0R((List<? extends InterfaceC918590a0n>) listLIZ, false), 7);
                    } else {
                        str = strLIZ;
                        C918760a14 c918760a142 = new C918760a14(this.LJ, str);
                        C918370a0R c918370a0R52 = c918350a0PLIZ.LIZLLL;
                        C13DV c13dvLIZIZ42 = C1697820uHc.LIZIZ();
                        c13dvLIZIZ42.add(c918760a142);
                        c13dvLIZIZ42.addAll(c918350a0PLIZ.LIZLLL.LIZ);
                        List listLIZ2 = C1697820uHc.LIZ(c13dvLIZIZ42);
                        c918370a0R52.getClass();
                        c918350a0PLIZ = C918350a0P.LIZ(c918350a0PLIZ, null, null, new C918370a0R((List<? extends InterfaceC918590a0n>) listLIZ2, false), 7);
                    }
                } else {
                    Iterator<InterfaceC918590a0n> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() instanceof C918760a14) {
                            c918350a0PLIZ = C918350a0P.LIZ(c918350a0PLIZ, null, null, C918370a0R.LIZ(c918350a0PLIZ.LIZLLL, null, false, 1), 7);
                            break;
                        }
                    }
                    interfaceC918290a0J = c918350a0PLIZ.LIZIZ;
                    if ((!(interfaceC918290a0J instanceof C915880ZwQ) && (c915880ZwQ = (C915880ZwQ) interfaceC918290a0J) != null && (strLIZ = c915880ZwQ.LIZIZ) != null) || ((interfaceC918290a0J instanceof InterfaceC918330a0N) && (interfaceC918330a0N = (InterfaceC918330a0N) interfaceC918290a0J) != null && (strLIZ = interfaceC918330a0N.LIZ()) != null)) {
                        str = strLIZ;
                    }
                    C918760a14 c918760a1422 = new C918760a14(this.LJ, str);
                    C918370a0R c918370a0R522 = c918350a0PLIZ.LIZLLL;
                    C13DV c13dvLIZIZ422 = C1697820uHc.LIZIZ();
                    c13dvLIZIZ422.add(c918760a1422);
                    c13dvLIZIZ422.addAll(c918350a0PLIZ.LIZLLL.LIZ);
                    List listLIZ22 = C1697820uHc.LIZ(c13dvLIZIZ422);
                    c918370a0R522.getClass();
                    c918350a0PLIZ = C918350a0P.LIZ(c918350a0PLIZ, null, null, new C918370a0R((List<? extends InterfaceC918590a0n>) listLIZ22, false), 7);
                }
            }
        }
        C918560a0k c918560a0k = (C918560a0k) this.LJIILJJIL.getValue();
        c918560a0k.getClass();
        C13DV c13dvLIZIZ5 = C1697820uHc.LIZIZ();
        c13dvLIZIZ5.add(c918560a0k.LIZIZ);
        c13dvLIZIZ5.addAll(c918350a0PLIZ.LIZLLL.LIZ);
        c918560a0k.LIZJ(c918350a0PLIZ, C1697820uHc.LIZ(c13dvLIZIZ5), 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.C918350a0P r23) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C918650a0t.LJIIIZ(X.0a0P):void");
    }

    public static void LJ(Function1 function1, C918230a0D c918230a0D) {
        if (function1 != null) {
            function1.invoke(c918230a0D);
        }
    }

    @Override // X.InterfaceC918930a1L
    public final void LIZ(List list, Function0 function0) {
        boolean z;
        C19EG c19eg;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1AZW.LJIILL("MultiGuestInviteRoutingCapability", "inviteFriendsBySharingMessage is invalid", null, null);
            return;
        }
        Context contextInvoke = this.LIZJ.invoke();
        if ((contextInvoke instanceof C19EG) && (c19eg = (C19EG) contextInvoke) != null) {
            C947390alF.LIZ(c19eg, c19eg, this.LIZIZ, C496860Je8.LIZ, AFwS193S0000000_7.get$arr$(224), new AwS18S0410000_15(this, c19eg, list, function0, 1));
        } else {
            C20441214yg.LJIIL("MultiGuestInviteRoutingCapability", "shareToUsers skipped: context is not FragmentActivity");
        }
    }

    public final void LIZLLL(Function1<? super C918230a0D, Unit> function1, C918230a0D c918230a0D) {
        Throwable th;
        Context contextInvoke;
        if (!c918230a0D.LIZJ && (th = c918230a0D.LJFF) != null && (contextInvoke = this.LIZJ.invoke()) != null) {
            C501540Jlg.LIZJ(contextInvoke, th);
        }
        if (function1 != null) {
            function1.invoke(c918230a0D);
        }
    }

    public final C1106210etP LJII(String str, boolean z) {
        String strLIZIZ;
        boolean z2;
        String str2;
        AdLiveEnterRoomConfig adLiveEnterRoomConfigLJII;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C0IJT.LIZ("").LJIIZILJ());
        Room room = this.LIZ;
        DataChannel dataChannel = this.LIZIZ;
        if (z) {
            strLIZIZ = C481180Itw.LIZJ(room.getOwner(), str);
        } else {
            strLIZIZ = C481180Itw.LIZIZ(room.getOwner());
        }
        C1106200etO c1106200etOLJII = C481180Itw.LJII(room, dataChannel, strLIZIZ, "invitation_tab_friends", linkedHashMap);
        c1106200etOLJII.LJJJI = this.LJII;
        if (!z) {
            str = "";
        }
        c1106200etOLJII.LJJJJLI = str;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        RoomAuthStatus roomAuthStatus = this.LIZ.mRoomAuthStatus;
        if (roomAuthStatus != null && roomAuthStatus.isEnablePromote()) {
            z2 = true;
        } else {
            z2 = false;
        }
        linkedHashMap2.put("param_broadcast_room_auth_promote_bool", Boolean.valueOf(z2));
        ((ArrayList) c1106200etOLJII.LJJ).addAll(((ISlotService) C1161920gLG.LIZJ(ISlotService.class)).getLiveShareSheetAction(linkedHashMap2, EnumC756810TmR.SLOT_BROADCAST_SHARE));
        ((ArrayList) c1106200etOLJII.LJJ).addAll(((IShareService) C1161920gLG.LIZJ(IShareService.class)).fK2(this.LJI, this.LIZ, this.LIZIZ));
        if (C0IXW.LJII(this.LIZIZ) != null && (adLiveEnterRoomConfigLJII = C0IXW.LJII(this.LIZIZ)) != null) {
            str2 = adLiveEnterRoomConfigLJII.aid;
        } else {
            str2 = null;
        }
        c1106200etOLJII.LJJIJL = str2;
        c1106200etOLJII.LJJIZ = C0IXW.LIZLLL(this.LIZIZ);
        c1106200etOLJII.LJJJ = C0IXW.LJII(this.LIZIZ);
        c1106200etOLJII.LJJIL = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
        c1106200etOLJII.LIZ(Boolean.valueOf(this.LJII), "show_cancel");
        c1106200etOLJII.LIZIZ("layout_scene_version", String.valueOf(C915980Zwa.LJIIIIZZ().ln1()));
        return new C1106210etP(c1106200etOLJII);
    }

    public final void LJIIJ(final C918350a0P c918350a0P, C918410a0V c918410a0V) {
        String strLIZLLL;
        final Function1<C918230a0D, Unit> function1 = c918350a0P.LIZJ.LIZJ;
        long id = c918350a0P.LIZ.LIZ().mUser.getId();
        if (C931790aM5.LIZIZ()) {
            strLIZLLL = null;
        } else {
            strLIZLLL = C925150aBN.LIZLLL();
            if (strLIZLLL == null) {
                LJ(function1, new C918230a0D(c918350a0P.LIZIZ(), EnumC918860a1E.LEGACY, false, null, "layout_id_missing", null, null, 104));
                return;
            }
        }
        Pair<EnumC919140a1g, List<C918740a12>> pairLIZJ = LIZJ(id, this.LIZ.getId(), c918410a0V.LJII);
        EnumC919140a1g first = pairLIZJ.getFirst();
        List<C918740a12> second = pairLIZJ.getSecond();
        long id2 = this.LIZ.getId();
        BizInviteParams bizInviteParams = new BizInviteParams();
        bizInviteParams.source = c918410a0V.LJ;
        bizInviteParams.noticeConfirmed = c918410a0V.LJI;
        C949850apD c949850apD = new C949850apD(id2, id, bizInviteParams, strLIZLLL, c918410a0V.LJII, LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue(), c918410a0V.LJ, first, second, 256);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJLJJI(c949850apD, new InterfaceC920680a4A<InviteResult>() { // from class: X.0a0K
                @Override // X.InterfaceC920680a4A
                public final void onSuccess(InviteResult inviteResult) {
                    C918650a0t c918650a0t = this.LIZ;
                    Function1<C918230a0D, Unit> function12 = function1;
                    C918230a0D c918230a0D = new C918230a0D(c918350a0P.LIZIZ(), EnumC918860a1E.LEGACY, true, null, null, null, inviteResult.originData, 56);
                    c918650a0t.getClass();
                    C918650a0t.LJ(function12, c918230a0D);
                }

                @Override // X.InterfaceC920680a4A
                public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                    String message;
                    C918650a0t c918650a0t = this.LIZ;
                    Function1<C918230a0D, Unit> function12 = function1;
                    EnumC918870a1F enumC918870a1FLIZIZ = c918350a0P.LIZIZ();
                    EnumC918860a1E enumC918860a1E = EnumC918860a1E.LEGACY;
                    Integer numValueOf = Integer.valueOf(linkCoreError.errorCode);
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    C918230a0D c918230a0D = new C918230a0D(enumC918870a1FLIZIZ, enumC918860a1E, false, numValueOf, message, th, null, 64);
                    c918650a0t.getClass();
                    C918650a0t.LJ(function12, c918230a0D);
                }
            });
        }
    }

    public final void LJIIJJI(long j, List list) {
        if (list.isEmpty()) {
            return;
        }
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZIZ(((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).sendMultiLiveShareInvitation(j, C13LP.LJJLIIIJ(list, ",", e3.e, e3.f, 0, null, null, 56), C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ())).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), this.LJIIIIZZ, new C09JN() { // from class: X.01HI
            @Override // X.C09JN
            public final void accept(Object obj) {
                InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
                C1C7U.LIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.sendSharedInvitation$1");
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
                    interfaceC937900aVwLLIIJLIL.LLIFFJFJJ(C925150aBN.LIZLLL());
                }
                C1C7U.LIZIZ("MultiGuestInviteRoutingCapabilityImpl@18e5.sendSharedInvitation$1");
            }
        }, new AfS184S0100000_15(this, 170), null, null, 56);
    }

    public static C967180bHA LJIIIIZZ(C918650a0t c918650a0t, long j, long j2) {
        long jLJI = C01JX.LJI();
        c918650a0t.getClass();
        return new C967180bHA(j, jLJI, j2, "", 0L, 0L, false, true, false, false, C1CXJ.Normal, 0L, 0L, 0L, 0L, C1CX5.Good, C1CXK.Normal, "", 0L, "", C1CXI.Unknown);
    }

    public final Pair<EnumC919140a1g, List<C918740a12>> LIZJ(long j, long j2, long j3) {
        if (!MultiGuestUnifiedInviteRouteOptSetting.INSTANCE.enable()) {
            return new Pair<>(EnumC919140a1g.LegacyInvitee, C13BV.INSTANCE);
        }
        return new Pair<>(EnumC919140a1g.InviteeList, Collections.singletonList(new C918740a12(LJIIIIZZ(this, j2, j), new C920820a4O(new C788130Uvr(j3)))));
    }

    public final void LJFF(C918350a0P c918350a0P, C918230a0D c918230a0D, LinkPlayerInfo linkPlayerInfo, Long l, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleErrorCode called with: errorCode = ");
        sbLIZ.append(c918230a0D.LIZLLL);
        sbLIZ.append(", result.throwable = ");
        sbLIZ.append(c918230a0D.LJFF);
        sbLIZ.append(",user_id = ");
        sbLIZ.append(linkPlayerInfo.mUser.getId());
        C20441214yg.LIZIZ("MultiGuestInviteRoutingCapability", C2188811AlT.LIZIZ(sbLIZ));
        if (c918350a0P != null && (c918350a0P.LIZIZ instanceof C918410a0V)) {
            if (l != null) {
                if (l.longValue() == 4004528) {
                    String strLIZ = C0KVU.LIZ(linkPlayerInfo.mUser);
                    AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(c918350a0P, c918230a0D, this, 46);
                    Context contextInvoke = this.LIZJ.invoke();
                    if (contextInvoke != null) {
                        C782110Um9 c782110Um9 = new C782110Um9(contextInvoke);
                        c782110Um9.LIZJ = u.LJJIFFI(contextInvoke.getString(2131842406), "{0}", strLIZ, false);
                        c782110Um9.LJII(2131840710);
                        c782110Um9.LJFF(R.drawable.epr);
                        c782110Um9.LJIILL = false;
                        c782110Um9.LJIILL(contextInvoke.getString(2131842404), new InterfaceC743640TFa() { // from class: X.0a1K
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                            }
                        });
                        c782110Um9.LJIILLIIL(contextInvoke.getString(2131842405), new AcS496S0100000_15(awS259S0300000_15, 62));
                        C786410Ut5.E4(c782110Um9.LIZ());
                        return;
                    }
                    return;
                }
                if (l.longValue() != 0) {
                    C766270U4b.LJIIJJI(str);
                    return;
                }
            }
        } else if (l != null) {
            if (l.longValue() != 0 && C500260Jjc.LJJIIZI(str)) {
                C766270U4b.LJIIJJI(str);
                return;
            }
        }
        if (c918230a0D.LJFF instanceof C501470JlZ) {
            return;
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842749, C0KVU.LIZ(linkPlayerInfo.mUser)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C918650a0t(Room room, DataChannel dataChannel, Function0<? extends Context> function0, Function0<? extends LifecycleOwner> function02, Function2<? super String, ? super Function1<? super String, Unit>, Boolean> function2, C920310a3Z c920310a3Z) {
        this.LIZ = room;
        this.LIZIZ = dataChannel;
        this.LIZJ = function0;
        this.LIZLLL = function02;
        this.LJ = function2;
        this.LJFF = c920310a3Z;
        LiveMode liveMode = LiveMode.VIDEO;
        this.LJI = liveMode;
        this.LJII = true;
        this.LJIIIIZZ = new C11NJ();
        this.LJIIIZ = C292401Bi.LIZ(AFwS203S0000000_15.get$arr$(385));
        this.LJIIJ = new LinkedHashSet();
        this.LJIIJJI = C292401Bi.LIZ(AFwS203S0000000_15.get$arr$(384));
        this.LJIIL = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
        this.LJIILIIL = C292401Bi.LIZ(new AwS559S0100000_15(this, 1028));
        this.LJIILJJIL = C292401Bi.LIZ(new AwS559S0100000_15(this, 1029));
        C948450amx.LIZIZ.LIZJ(this);
        LiveMode liveMode2 = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        this.LJI = liveMode2 != null ? liveMode2 : liveMode;
        Boolean bool = (Boolean) dataChannel.gg0(C0TZM.class);
        this.LJII = bool != null ? bool.booleanValue() : true;
    }
}

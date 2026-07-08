package X;

import Y.AcS23S0200100_15;
import Y.AfS16S0310000_15;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkInviteSuccessEvent;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.KickOutAllMultiGuestGuestsEvent;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.ActivityBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkMicGiftGalleryDisplayText;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CoHostInviteDetailedExtra;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubCohostForSuperFanOnlyLiveSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostAllowInviteWithApplySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostInviteRetryMixedModeGuardSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostRechargeFallbackForConflictSceneSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.ChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS144S0400000_15;
import kotlin.jvm.internal.AwS3S0900000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS55S0310000_15;
import kotlin.jvm.internal.AwS5S0800000_15;
import kotlin.jvm.internal.AwS80S1300000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0aq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950340aq0 {
    public static final boolean LIZ() {
        C915980Zwa.LJII().jn1();
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        ArrayList arrayList = new ArrayList();
        for (C954460awe c954460awe : listLJIJJ) {
            C954460awe c954460awe2 = c954460awe;
            EnumC950200apm enumC950200apm = c954460awe2.LJJIIZ;
            if (enumC950200apm == EnumC950200apm.INVITING || enumC950200apm == EnumC950200apm.INVITED) {
                if (c954460awe2.LJIIJJI()) {
                    arrayList.add(c954460awe);
                }
            }
        }
        return arrayList.size() > 0;
    }

    public static final void LJIIIIZZ(C943870afZ c943870afZ, Room room, Map map, RivalExtraInfo rivalExtraInfo) {
        ActivityBadgeInfo activityBadgeInfo;
        Map<String, String> map2;
        Map mapLJIIL = map;
        if (rivalExtraInfo != null && (activityBadgeInfo = rivalExtraInfo.activityBadgeInfo) != null && (map2 = activityBadgeInfo.eventTrace) != null && !map2.isEmpty()) {
            if (mapLJIIL == null) {
                mapLJIIL = C2097608Jq.LJ();
            }
            mapLJIIL = C2097608Jq.LJIIL(mapLJIIL, map2);
        }
        if (c943870afZ != null) {
            C955400ayA c955400ayA = C955400ayA.LIZ;
            C955400ayA.LJJJJJ(c943870afZ, new AwS80S1300000_15(room, rivalExtraInfo, mapLJIIL, 0));
        } else {
            C955400ayA.LL(room, "invite", null, null, null, null, null, null, null, mapLJIIL, false, 1532);
        }
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [T, android.app.Dialog, com.bytedance.android.live.design.app.LiveDialog] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0apt, X.0apv] */
    public static final void LJII(final C950360aq2 c950360aq2, final DataChannel dataChannel, Context context, boolean z, final InterfaceC950290apv interfaceC950290apv, InterfaceC950020apU interfaceC950020apU) {
        EnumC950200apm enumC950200apm;
        EnumC950200apm enumC950200apm2;
        if (C915980Zwa.LJI().LJIIJ().getChannelId() <= 0) {
            C915980Zwa.LJI().LIZ().LJJLIIJ();
        } else if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Hu0()) {
            C766270U4b.LIZLLL(2131841103);
            if (interfaceC950290apv != null) {
                interfaceC950290apv.LIZIZ(1);
                return;
            }
            return;
        }
        final WeakReference weakReference = new WeakReference(context);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            long id = room.getId();
            ?? r6 = new InterfaceC950290apv() { // from class: X.0apt
                @Override // X.InterfaceC950290apv
                public final void LIZ() {
                    if (c950360aq2.LIZLLL == C955540ayO.LJFF) {
                        C784440Upu.LIZ().LIZIZ(new C950300apw());
                    }
                    dataChannel.FQ2(LinkInviteSuccessEvent.class);
                    InterfaceC950290apv interfaceC950290apv2 = interfaceC950290apv;
                    if (interfaceC950290apv2 != null) {
                        interfaceC950290apv2.LIZ();
                    }
                }

                @Override // X.InterfaceC950290apv
                public final void LIZIZ(int i) {
                    InterfaceC950290apv interfaceC950290apv2 = interfaceC950290apv;
                    if (interfaceC950290apv2 != null) {
                        interfaceC950290apv2.LIZIZ(i);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
                @Override // X.InterfaceC950290apv
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZJ(java.lang.Throwable r5, boolean r6) {
                    /*
                        r4 = this;
                        boolean r0 = r5 instanceof com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException
                        if (r0 == 0) goto L5
                        return
                    L5:
                        java.lang.ref.WeakReference<android.content.Context> r0 = r4
                        java.lang.Object r1 = r0.get()
                        android.content.Context r1 = (android.content.Context) r1
                        boolean r0 = r5 instanceof X.C501520Jle
                        if (r0 == 0) goto L17
                        r0 = r5
                        X.0Jle r0 = (X.C501520Jle) r0
                        r0.getErrorCode()
                    L17:
                        if (r1 == 0) goto L76
                        if (r5 == 0) goto L76
                        boolean r0 = r5 instanceof X.C501470JlZ
                        if (r0 == 0) goto L6e
                        r0 = r5
                        X.0JlZ r0 = (X.C501470JlZ) r0
                        java.lang.String r3 = r0.getAlert()
                        java.lang.String r1 = r0.getPrompt()
                        boolean r0 = android.text.TextUtils.isEmpty(r3)
                        if (r0 == 0) goto L37
                        boolean r0 = android.text.TextUtils.isEmpty(r1)
                        if (r0 != 0) goto L76
                    L36:
                        r3 = r1
                    L37:
                        com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
                        boolean r0 = r0.LLJJIJIL()
                        r2 = r0 ^ 1
                        X.0aq2 r0 = r1
                        X.0ayO r1 = r0.LIZLLL
                        X.0ayO r0 = X.C955540ayO.LJFF
                        if (r1 != r0) goto L66
                        X.0Upu r1 = X.C784440Upu.LIZ()
                        X.0apw r0 = new X.0apw
                        r0.<init>()
                        r1.LIZIZ(r0)
                    L55:
                        if (r6 == 0) goto L5d
                    L57:
                        r0 = 2131841162(0x7f11508a, float:1.9315624E38)
                        X.C766270U4b.LIZLLL(r0)
                    L5d:
                        X.0apv r1 = r3
                        if (r1 == 0) goto L65
                        r0 = 0
                        r1.LIZJ(r5, r0)
                    L65:
                        return
                    L66:
                        if (r2 == 0) goto L55
                        if (r6 != 0) goto L57
                        X.C766270U4b.LJIIJJI(r3)
                        goto L5d
                    L6e:
                        r0 = 2131851936(0x7f117aa0, float:1.9337476E38)
                        java.lang.String r1 = r1.getString(r0)
                        goto L36
                    L76:
                        java.lang.String r3 = ""
                        goto L37
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C950270apt.LIZJ(java.lang.Throwable, boolean):void");
                }
            };
            if (C950220apo.LJIIIZ().isMultiCoHost()) {
                if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Hu0()) {
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(c950360aq2.LIZ);
                    if (lLJIILIIL == null) {
                        C766270U4b.LIZLLL(2131841162);
                    } else {
                        long jLongValue = lLJIILIIL.longValue();
                        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(C950220apo.LJFF());
                        if (c954460aweLLILL != null) {
                            enumC950200apm = c954460aweLLILL.LJJIIZ;
                        } else {
                            enumC950200apm = null;
                        }
                        if (enumC950200apm == EnumC950200apm.CANCELING) {
                            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841245));
                        } else {
                            C954460awe c954460aweLLILL2 = C915980Zwa.LJII().LLILL(jLongValue);
                            if (c954460aweLLILL2 == null || (enumC950200apm2 = c954460aweLLILL2.LJJIIZ) == null) {
                                enumC950200apm2 = EnumC950200apm.IDLE;
                            }
                            int i = C915450Zvj.LIZ[enumC950200apm2.ordinal()];
                            if (i != 1 && i != 2 && i != 3) {
                                boolean z2 = C924810aAp.LJ().LJIIIZ;
                                boolean zIsEnable = LiveCohostInviteRetryMixedModeGuardSetting.INSTANCE.isEnable();
                                if (z2 && (!zIsEnable || !C915980Zwa.LJII().LJJIII())) {
                                    final long jLongValue2 = lLJIILIIL.longValue();
                                    final C950280apu c950280apu = new C950280apu(id, context, c950360aq2, interfaceC950020apU, r6, interfaceC950290apv, dataChannel, z);
                                    final C259800zU c259800zU = new C259800zU();
                                    C782110Um9 c782110Um9 = new C782110Um9(context);
                                    c782110Um9.LJIILLIIL = true;
                                    c782110Um9.LIZJ = C497740JfY.LJIJI(2131843691);
                                    c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131843690));
                                    c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131843689), new InterfaceC743640TFa() { // from class: X.0Zzt
                                        @Override // X.InterfaceC743640TFa
                                        public final void LIZ(LiveDialog liveDialog) {
                                            C955400ayA.LIZ.LLIIIL(jLongValue2, 0L, true);
                                            dataChannel.LC0(KickOutAllMultiGuestGuestsEvent.class, new C918080Zzy(true, (Runnable) new RunnableC514501zT(c259800zU, c950280apu, 1), (Integer) null, 12));
                                        }
                                    });
                                    c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131843688), new AcS23S0200100_15(jLongValue2, c259800zU, c950280apu, 0));
                                    c782110Um9.LJIILL = false;
                                    ?? LIZ = c782110Um9.LIZ();
                                    c259800zU.element = LIZ;
                                    C500260Jjc.LJJLIIIJLLLLLLLZ(LIZ);
                                    C955400ayA.LIZ.LLIIIJ(jLongValue2, 0L);
                                    return;
                                }
                                if (C944270agD.LLJLIL && C915980Zwa.LJII().LJIJJ().size() >= 2) {
                                    C766270U4b.LIZLLL(2131841162);
                                } else if (LIZIZ(id, context, c950360aq2, interfaceC950020apU, r6, interfaceC950290apv, dataChannel, z)) {
                                    return;
                                }
                            } else {
                                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841245));
                            }
                        }
                    }
                } else {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841245));
                }
                if (interfaceC950290apv != null) {
                    interfaceC950290apv.LIZIZ(1);
                    return;
                }
                return;
            }
            if (interfaceC950290apv != null) {
                interfaceC950290apv.LIZIZ(1);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [X.0aq3] */
    public static final boolean LIZIZ(final long j, final Context context, final C950360aq2 c950360aq2, final InterfaceC950020apU interfaceC950020apU, final InterfaceC950290apv interfaceC950290apv, final InterfaceC950290apv interfaceC950290apv2, final DataChannel dataChannel, final boolean z) {
        int secret;
        int i;
        User owner;
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null && (owner = room.getOwner()) != null) {
            secret = owner.getSecret();
        } else {
            secret = 0;
        }
        if (secret == 1) {
            final ?? r7 = new InterfaceC950400aq6() { // from class: X.0aq3
                @Override // X.InterfaceC950400aq6
                public final void LIZ() {
                    InterfaceC950290apv interfaceC950290apv3 = interfaceC950290apv2;
                    if (interfaceC950290apv3 != null) {
                        interfaceC950290apv3.LIZIZ(1);
                    }
                }

                @Override // X.InterfaceC950400aq6
                public final void LIZIZ() {
                    InterfaceC960800b6s.LLLLIILL.LJFF(Boolean.TRUE);
                    DataChannel dataChannel2 = dataChannel;
                    C950360aq2 c950360aq22 = c950360aq2;
                    long j2 = j;
                    boolean z2 = z;
                    InterfaceC950290apv interfaceC950290apv3 = interfaceC950290apv;
                    InterfaceC950290apv interfaceC950290apv4 = interfaceC950290apv2;
                    C950340aq0.LJI(j2, context, c950360aq22, interfaceC950020apU, interfaceC950290apv3, interfaceC950290apv4, dataChannel2, z2);
                }
            };
            final C955540ayO c955540ayO = c950360aq2.LIZLLL;
            final String str = c950360aq2.LIZJ;
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty("private")) {
                map.put("show_type", "private");
            }
            if (c955540ayO != null) {
                map.put("invitee_list", C955410ayB.LIZJ(c955540ayO));
            }
            if (!TextUtils.isEmpty(str)) {
                map.put("invitee_id", str);
            }
            map.put("is_change_pairing", CardStruct.IStatusCode.DEFAULT);
            map.put("is_system_rematching", CardStruct.IStatusCode.DEFAULT);
            map.put("time_stamp", String.valueOf(System.currentTimeMillis()));
            C925600aC6.LIZ(c955540ayO, map);
            C925600aC6.LJJIJLIJ("livesdk_connection_live_watched_show", map);
            C19GO c19go = new C19GO(context);
            c19go.LJIIIZ = R.drawable.dpv;
            c19go.LIZLLL = C497740JfY.LJIJI(2131841191);
            if (!InterfaceC960800b6s.LLLLIILL.LIZIZ().booleanValue()) {
                i = 2131842701;
            } else {
                i = 2131841192;
            }
            c19go.LIZIZ(i);
            final int i2 = 0;
            c19go.LIZJ(2131842656, new DialogInterface.OnClickListener(c955540ayO, str, r7, i2) { // from class: X.0bn7
                public final int $t;
                public Object l1;
                public Object l2;
                public String s0;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    switch (this.$t) {
                        case 0:
                            onClick$0(this, dialogInterface, i3);
                            break;
                        case 1:
                            onClick$1(this, dialogInterface, i3);
                            break;
                    }
                }

                public static final void onClick$0(DialogInterfaceOnClickListenerC986990bn7 dialogInterfaceOnClickListenerC986990bn7, DialogInterface dialogInterface, int i3) {
                    C925600aC6.LJIL((C955540ayO) dialogInterfaceOnClickListenerC986990bn7.l1, dialogInterfaceOnClickListenerC986990bn7.s0, false);
                    ((InterfaceC950400aq6) dialogInterfaceOnClickListenerC986990bn7.l2).LIZ();
                    dialogInterface.dismiss();
                }

                public static final void onClick$1(DialogInterfaceOnClickListenerC986990bn7 dialogInterfaceOnClickListenerC986990bn7, DialogInterface dialogInterface, int i3) {
                    C925600aC6.LJIL((C955540ayO) dialogInterfaceOnClickListenerC986990bn7.l1, dialogInterfaceOnClickListenerC986990bn7.s0, true);
                    ((InterfaceC950400aq6) dialogInterfaceOnClickListenerC986990bn7.l2).LIZIZ();
                    dialogInterface.dismiss();
                }

                {
                    this.$t = i2;
                    this.l1 = c955540ayO;
                    this.s0 = str;
                    this.l2 = r7;
                }
            }, false);
            final int i3 = 1;
            c19go.LJ(2131842658, new DialogInterface.OnClickListener(c955540ayO, str, r7, i3) { // from class: X.0bn7
                public final int $t;
                public Object l1;
                public Object l2;
                public String s0;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i32) {
                    switch (this.$t) {
                        case 0:
                            onClick$0(this, dialogInterface, i32);
                            break;
                        case 1:
                            onClick$1(this, dialogInterface, i32);
                            break;
                    }
                }

                public static final void onClick$0(DialogInterfaceOnClickListenerC986990bn7 dialogInterfaceOnClickListenerC986990bn7, DialogInterface dialogInterface, int i32) {
                    C925600aC6.LJIL((C955540ayO) dialogInterfaceOnClickListenerC986990bn7.l1, dialogInterfaceOnClickListenerC986990bn7.s0, false);
                    ((InterfaceC950400aq6) dialogInterfaceOnClickListenerC986990bn7.l2).LIZ();
                    dialogInterface.dismiss();
                }

                public static final void onClick$1(DialogInterfaceOnClickListenerC986990bn7 dialogInterfaceOnClickListenerC986990bn7, DialogInterface dialogInterface, int i32) {
                    C925600aC6.LJIL((C955540ayO) dialogInterfaceOnClickListenerC986990bn7.l1, dialogInterfaceOnClickListenerC986990bn7.s0, true);
                    ((InterfaceC950400aq6) dialogInterfaceOnClickListenerC986990bn7.l2).LIZIZ();
                    dialogInterface.dismiss();
                }

                {
                    this.$t = i3;
                    this.l1 = c955540ayO;
                    this.s0 = str;
                    this.l2 = r7;
                }
            }, false);
            c19go.LJJIIJ = false;
            C786410Ut5.M4(c19go.LIZ());
            return true;
        }
        if (FansClubCohostForSuperFanOnlyLiveSetting.INSTANCE.isEnabled() && C494680Jac.LJIILL(dataChannel)) {
            C958650b3P.LIZ(context, new C950380aq4(j, context, c950360aq2, interfaceC950020apU, interfaceC950290apv, interfaceC950290apv2, dataChannel, z), new AwS559S0100000_15(interfaceC950290apv2, 92));
            return true;
        }
        return LJI(j, context, c950360aq2, interfaceC950020apU, interfaceC950290apv, interfaceC950290apv2, dataChannel, z);
    }

    public static final boolean LJI(final long j, final Context context, final C950360aq2 c950360aq2, final InterfaceC950020apU interfaceC950020apU, final InterfaceC950290apv interfaceC950290apv, final InterfaceC950290apv interfaceC950290apv2, final DataChannel dataChannel, final boolean z) {
        C11NZ<C470590Icr<MGetUserLinkmicStatusResponse.ResponseData>> userLinkmicStatusMultiCoHost;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        if (!C950220apo.LJIIIZ().isMultiCoHost()) {
            return false;
        }
        if (Intrinsics.LJFF(c950360aq2.LJIIIIZZ, "InteractService")) {
            MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus = new MGetUserLinkmicStatusResponse.LinkmicStatus();
            linkmicStatus.playType = c950360aq2.LJIIJ;
            linkmicStatus.blockReason = 0;
            Room room = new Room();
            Long lLJIILIIL3 = C2095008Iq.LJIILIIL(c950360aq2.LIZJ);
            long jLongValue4 = 0;
            if (lLJIILIIL3 != null) {
                jLongValue = lLJIILIIL3.longValue();
            } else {
                jLongValue = 0;
            }
            room.setId(jLongValue);
            Long lLJIILIIL4 = C2095008Iq.LJIILIIL(c950360aq2.LIZ);
            if (lLJIILIIL4 != null) {
                jLongValue2 = lLJIILIIL4.longValue();
            } else {
                jLongValue2 = 0;
            }
            room.setOwnerUserId(jLongValue2);
            RoomLinkInfo roomLinkInfo = new RoomLinkInfo();
            ChannelInfo channelInfo = new ChannelInfo();
            String str = c950360aq2.LJIIIZ;
            if (str != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str)) != null) {
                jLongValue3 = lLJIILIIL2.longValue();
            } else {
                jLongValue3 = 0;
            }
            channelInfo.innerChannelId = jLongValue3;
            String str2 = c950360aq2.LJIIJJI;
            if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                jLongValue4 = lLJIILIIL.longValue();
            }
            channelInfo.groupChannelId = jLongValue4;
            roomLinkInfo.channelInfo = channelInfo;
            room.setLinkMicInfo(roomLinkInfo);
            room.setOwner(new User());
            RivalExtraInfo rivalExtraInfo = new RivalExtraInfo();
            GiftGalleryBadgeInfo giftGalleryBadgeInfo = new GiftGalleryBadgeInfo();
            GiftGalleryBadgeSection giftGalleryBadgeSection = new GiftGalleryBadgeSection();
            LinkMicGiftGalleryDisplayText linkMicGiftGalleryDisplayText = new LinkMicGiftGalleryDisplayText();
            String str3 = c950360aq2.LJIILIIL;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            linkMicGiftGalleryDisplayText.content = str3;
            giftGalleryBadgeSection.displayText = linkMicGiftGalleryDisplayText;
            giftGalleryBadgeInfo.leagueInfo = giftGalleryBadgeSection;
            rivalExtraInfo.giftGalleryBadgeInfo = giftGalleryBadgeInfo;
            C915980Zwa.LJI().LIZ().LLJJI(c950360aq2.LIZLLL);
            C915980Zwa.LJI().LIZ().LJJIIJ(c950360aq2.LJI);
            String str5 = c950360aq2.LJIIIIZZ;
            if (str5 != null && !a0.LJJJIL(str5)) {
                InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
                String str6 = c950360aq2.LJIIIIZZ;
                if (str6 != null) {
                    str4 = str6;
                }
                interfaceC955420ayCLIZ.LJFF(new C951420ark(str4));
            }
            C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(C950220apo.LJFF());
            EnumC950120ape enumC950120ape = (EnumC950120ape) dataChannel.gg0(MultiCoHostStateChannel.class);
            int i = linkmicStatus.playType;
            if (i != 0 && i != 5) {
                if (i == 1) {
                    LIZJ(dataChannel, room, c950360aq2, enumC950120ape, context, interfaceC950290apv, linkmicStatus, interfaceC950290apv2, rivalExtraInfo);
                }
                return true;
            }
            LIZLLL(dataChannel, c950360aq2, room, enumC950120ape, c954460aweLLILL, context, interfaceC950290apv, linkmicStatus, interfaceC950290apv2, interfaceC950020apU, rivalExtraInfo);
            return true;
        }
        C11NJ c11nj = new C11NJ();
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        if (coHostApi != null && (userLinkmicStatusMultiCoHost = coHostApi.getUserLinkmicStatusMultiCoHost(j, c950360aq2.LIZ, c950360aq2.LIZJ, "", "", "", "", false)) != null) {
            c11nj.LIZ(userLinkmicStatusMultiCoHost.LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0aq1
                @Override // X.C09JN
                public final void accept(Object obj) {
                    MGetUserLinkmicStatusResponse.ResponseData responseData;
                    MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus2;
                    String reason;
                    C1C7U.LIZ("CohostInviteUtilKt@bc0b.invite$1");
                    BaseResponse baseResponse = (BaseResponse) obj;
                    if (baseResponse != null && (responseData = (MGetUserLinkmicStatusResponse.ResponseData) baseResponse.data) != null) {
                        Long lLJIILIIL5 = C2095008Iq.LJIILIIL(c950360aq2.LIZJ);
                        Map<Long, MGetUserLinkmicStatusResponse.LinkmicStatus> map = responseData.linkmicStatusMap;
                        Room room2 = null;
                        if (map != null) {
                            linkmicStatus2 = map.get(lLJIILIIL5);
                        } else {
                            linkmicStatus2 = null;
                        }
                        Map<Long, Room> map2 = responseData.roomInfo;
                        if (map2 != null) {
                            room2 = map2.get(lLJIILIIL5);
                        }
                        if (linkmicStatus2 != null && room2 != null) {
                            if (linkmicStatus2.blockReason != 0) {
                                if (Intrinsics.LJFF(c950360aq2.LIZLLL, C955540ayO.LJJJLIIL)) {
                                    C948620anE.LIZJ("invite_block_check", "blocked", "specified_cohost", "invite_blocked", C2097608Jq.LJIIIIZZ(new Pair("invitee_uid", c950360aq2.LIZ), new Pair("invitee_room_id", c950360aq2.LIZJ), new Pair("block_reason", String.valueOf(linkmicStatus2.blockReason)), new Pair("detail_block_reason", String.valueOf(linkmicStatus2.detailBlockReason))));
                                }
                                int i2 = linkmicStatus2.detailBlockReason;
                                if (i2 != 0 && z) {
                                    C766270U4b.LJIIJJI(C950420aq8.LIZIZ(dataChannel, Integer.valueOf(i2)));
                                } else {
                                    EnumC950430aq9 enumC950430aq9LIZ = C950420aq8.LIZ(linkmicStatus2.blockReason);
                                    if (enumC950430aq9LIZ != null && (reason = enumC950430aq9LIZ.getReason()) != null) {
                                        C766270U4b.LJIIJJI(reason);
                                    }
                                }
                                interfaceC950290apv.LIZIZ(linkmicStatus2.blockReason);
                            } else {
                                C915980Zwa.LJI().LIZ().LLJJI(c950360aq2.LIZLLL);
                                C915980Zwa.LJI().LIZ().LJJIIJ(c950360aq2.LJI);
                                String str7 = c950360aq2.LJIIIIZZ;
                                if (str7 != null && !a0.LJJJIL(str7)) {
                                    InterfaceC955420ayC interfaceC955420ayCLIZ2 = C915980Zwa.LJI().LIZ();
                                    String str8 = c950360aq2.LJIIIIZZ;
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    interfaceC955420ayCLIZ2.LJFF(new C951420ark(str8));
                                }
                                C954460awe c954460aweLLILL2 = C915980Zwa.LJII().LLILL(C950220apo.LJFF());
                                EnumC950120ape enumC950120ape2 = (EnumC950120ape) dataChannel.gg0(MultiCoHostStateChannel.class);
                                int i3 = linkmicStatus2.playType;
                                if (i3 != 0 && i3 != 3) {
                                    if (i3 == 1) {
                                        C950340aq0.LIZJ(dataChannel, room2, c950360aq2, enumC950120ape2, context, interfaceC950290apv, linkmicStatus2, interfaceC950290apv2, null);
                                    } else {
                                        InterfaceC950290apv interfaceC950290apv3 = interfaceC950290apv2;
                                        if (interfaceC950290apv3 != null) {
                                            interfaceC950290apv3.LIZIZ(1);
                                        }
                                    }
                                } else {
                                    C950340aq0.LIZLLL(dataChannel, c950360aq2, room2, enumC950120ape2, c954460aweLLILL2, context, interfaceC950290apv, linkmicStatus2, interfaceC950290apv2, interfaceC950020apU, null);
                                }
                            }
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("return, currentRoomId=");
                            sbLIZ.append(j);
                            sbLIZ.append(", targetUid=");
                            sbLIZ.append(c950360aq2.LIZ);
                            sbLIZ.append(", targetRoomId=");
                            sbLIZ.append(c950360aq2.LIZJ);
                            sbLIZ.append(", targetLinkmicStatus=");
                            sbLIZ.append(linkmicStatus2);
                            sbLIZ.append(", targetRoom=");
                            sbLIZ.append(room2);
                            C20441214yg.LJ("CohostInviteUtil", C2188811AlT.LIZIZ(sbLIZ));
                            if (z) {
                                C766270U4b.LIZLLL(2131841162);
                            }
                            if (Intrinsics.LJFF(c950360aq2.LIZLLL, C955540ayO.LJJJLIIL)) {
                                C948620anE.LIZJ("refresh_user_status", "failed", "specified_cohost", "api_failed", C2097608Jq.LJIIIIZZ(new Pair("invitee_uid", c950360aq2.LIZ), new Pair("invitee_room_id", c950360aq2.LIZJ)));
                            }
                            InterfaceC950290apv interfaceC950290apv4 = interfaceC950290apv2;
                            if (interfaceC950290apv4 != null) {
                                interfaceC950290apv4.LIZIZ(1);
                            }
                        }
                    }
                    C1C7U.LIZIZ("CohostInviteUtilKt@bc0b.invite$1");
                }
            }, new AfS16S0310000_15(c950360aq2, interfaceC950290apv, z, interfaceC950290apv2, 0)));
        }
        return true;
    }

    public static final void LIZJ(DataChannel dataChannel, Room room, C950360aq2 c950360aq2, EnumC950120ape enumC950120ape, Context context, InterfaceC950290apv interfaceC950290apv, MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus, InterfaceC950290apv interfaceC950290apv2, RivalExtraInfo rivalExtraInfo) {
        int iIntValue;
        String str;
        boolean z;
        C954460awe c954460aweLLILL;
        EnumC950200apm enumC950200apm;
        Context contextLJII = context;
        HashMap map = new HashMap();
        map.put("user_info", C950220apo.LJIIZILJ(room.getOwner()));
        Integer num = c950360aq2.LJIILJJIL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = c950360aq2.LIZLLL.LIZ;
        }
        map.put("source_type", Integer.valueOf(iIntValue));
        map.put("check_perception_center", Boolean.valueOf(c950360aq2.LJII));
        if (interfaceC950290apv2 != null) {
            map.put("cohost_invite_callback", interfaceC950290apv2);
        }
        if (c950360aq2.LIZLLL.LIZ()) {
            str = "apply_auto";
        } else {
            str = "apply_rank";
        }
        long id = room.getId();
        long ownerUserId = room.getOwnerUserId();
        long jLJIILIIL = C950220apo.LJIILIIL(room);
        long jLJIIL = C950220apo.LJIIL(room);
        long value = MtCoHostInviteTimeOutSetting.INSTANCE.getValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C950000apS c950000apS = new C950000apS(id, ownerUserId, jLJIILIIL, jLJIIL, value, room, map, arrayList);
        boolean zLIZ = LIZ();
        if (enumC950120ape != EnumC950120ape.Invited && !zLIZ) {
            z = false;
        } else {
            z = true;
        }
        if (!LiveCoHostAllowInviteWithApplySetting.INSTANCE.enable() && z) {
            if (contextLJII == null) {
                contextLJII = C497740JfY.LJII();
            }
            C955850ayt.LIZ(contextLJII, EnumC955790ayn.INVITE_APPLY, new AwS5S0800000_15(c950360aq2, room, rivalExtraInfo, dataChannel, c950000apS, interfaceC950290apv, linkmicStatus, interfaceC950290apv2, 0), new AwS559S0100000_15(interfaceC950290apv2, 86));
            return;
        }
        if (enumC950120ape == EnumC950120ape.Applied || ((c954460aweLLILL = C915980Zwa.LJII().LLILL(C950220apo.LJFF())) != null && (enumC950200apm = c954460aweLLILL.LJJIIZ) != null && enumC950200apm.isApplying())) {
            C766270U4b.LIZLLL(2131841239);
            if (interfaceC950290apv2 == null) {
                return;
            }
            interfaceC950290apv2.LIZIZ(1);
            return;
        }
        if (C915980Zwa.LJIIIZ().k0() == EnumC958900b3o.WAITED) {
            if (contextLJII == null) {
                contextLJII = C497740JfY.LJII();
            }
            C955850ayt.LIZ(contextLJII, EnumC955790ayn.PAIR_INVITE, new AwS5S0800000_15(c950360aq2, room, rivalExtraInfo, dataChannel, c950000apS, interfaceC950290apv, linkmicStatus, interfaceC950290apv2, 1), new AwS559S0100000_15(interfaceC950290apv2, 87));
        } else {
            LJIIIIZZ(c950360aq2.LJIIL, room, c950360aq2.LJI, rivalExtraInfo);
            LJ(dataChannel, c950000apS, room, interfaceC950290apv, linkmicStatus, interfaceC950290apv2, c950360aq2.LJIIL, rivalExtraInfo, c950360aq2.LJI, C950390aq5.LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0apy] */
    public static final void LJ(DataChannel dataChannel, C950000apS c950000apS, final Room room, final InterfaceC950290apv interfaceC950290apv, final MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus, final InterfaceC950290apv interfaceC950290apv2, final C943870afZ c943870afZ, final RivalExtraInfo rivalExtraInfo, final Map<String, String> map, InterfaceC950020apU interfaceC950020apU) {
        final boolean z;
        if (linkmicStatus.playType == 1) {
            z = true;
        } else {
            z = false;
        }
        final boolean zLJFF = Intrinsics.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL(), C955540ayO.LJJJLIIL);
        ?? r0 = new InterfaceC950010apT<C920620a44>() { // from class: X.0apy
            @Override // X.InterfaceC950010apT
            public final void LIZ(C920640a46 c920640a46) {
                String str;
                C943870afZ c943870afZ2 = c943870afZ;
                String str2 = "apply";
                if (c943870afZ2 != null) {
                    C955400ayA c955400ayA = C955400ayA.LIZ;
                    C955400ayA.LJJJJJ(c943870afZ2, new AwS55S0310000_15(room, (Room) z, (boolean) rivalExtraInfo, (RivalExtraInfo) map, (Map<String, String>) 0));
                } else {
                    C955400ayA c955400ayA2 = C955400ayA.LIZ;
                    Room room2 = room;
                    if (z) {
                        str = "apply";
                    } else {
                        str = "invite";
                    }
                    C955400ayA.LLF(room2, str, null, null, null, null, null, false, null, 508);
                }
                interfaceC950290apv.LIZ();
                interfaceC950290apv.LIZIZ(linkmicStatus.blockReason);
                if (zLJFF) {
                    Pair[] pairArr = new Pair[4];
                    pairArr[0] = new Pair("invitee_uid", String.valueOf(room.getOwnerUserId()));
                    pairArr[1] = new Pair("invitee_room_id", String.valueOf(room.getId()));
                    if (!z) {
                        str2 = "invite";
                    }
                    pairArr[2] = new Pair("invite_type", str2);
                    pairArr[3] = new Pair("auto_cohost_success", "1");
                    C948620anE.LIZJ("start_cohost_build_connection", "success", "specified_cohost", null, C2097608Jq.LJIIIIZZ(pairArr));
                }
            }

            @Override // X.InterfaceC950010apT
            public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                String str;
                String string;
                C501520Jle c501520Jle;
                InterfaceC950290apv interfaceC950290apv3;
                int i;
                CoHostInviteDetailedExtra coHostInviteDetailedExtra;
                boolean z2 = th instanceof C501470JlZ;
                Integer numValueOf = null;
                if (z2) {
                    if (!z) {
                        try {
                            coHostInviteDetailedExtra = (CoHostInviteDetailedExtra) C19748512Ol.LIZIZ.LJII(((C501470JlZ) th).getExtra(), CoHostInviteDetailedExtra.class);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                        if (coHostInviteDetailedExtra == null || (i = coHostInviteDetailedExtra.inviteBlockReason) < 0) {
                            i = -1;
                        }
                        if (((C501520Jle) th).getErrorCode() == C950330apz.LJ.LIZ) {
                            C955400ayA c955400ayA = C955400ayA.LIZ;
                            C955400ayA.LJLJJLL(i, UserService.getInstance().user().getCurrentUserId(), room.getOwnerUserId());
                        }
                    }
                    if (((C501520Jle) th).getErrorCode() == C950330apz.LIZ.LIZ && LiveCohostRechargeFallbackForConflictSceneSetting.INSTANCE.isEnable()) {
                        C915980Zwa.LJII().LJLZ(null);
                    }
                }
                interfaceC950290apv.LIZJ(th, false);
                if (!(th instanceof MultiCoHostViolationException) && (interfaceC950290apv3 = interfaceC950290apv2) != null) {
                    interfaceC950290apv3.LIZIZ(1);
                }
                if (zLJFF) {
                    if (z2 && (c501520Jle = (C501520Jle) th) != null) {
                        numValueOf = Integer.valueOf(c501520Jle.getErrorCode());
                    }
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = new Pair("invitee_uid", String.valueOf(room.getOwnerUserId()));
                    pairArr[1] = new Pair("invitee_room_id", String.valueOf(room.getId()));
                    if (z) {
                        str = "apply";
                    } else {
                        str = "invite";
                    }
                    pairArr[2] = new Pair("invite_type", str);
                    if (numValueOf == null || (string = numValueOf.toString()) == null) {
                        string = "";
                    }
                    pairArr[3] = new Pair("error_code", string);
                    pairArr[4] = new Pair("auto_cohost_success", CardStruct.IStatusCode.DEFAULT);
                    C948620anE.LIZJ("start_cohost_build_connection", "failed", "specified_cohost", "api_failed", C2097608Jq.LJIIIIZZ(pairArr));
                }
            }
        };
        C947390alF.LIZ(C497740JfY.LJII(), null, dataChannel, C949460aoa.LIZ, AFwS193S0000000_7.get$arr$(224), new AwS144S0400000_15(linkmicStatus, c950000apS, (C950320apy) r0, interfaceC950020apU, 1));
    }

    public static final void LIZLLL(DataChannel dataChannel, C950360aq2 c950360aq2, Room room, EnumC950120ape enumC950120ape, C954460awe c954460awe, Context context, InterfaceC950290apv interfaceC950290apv, MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus, InterfaceC950290apv interfaceC950290apv2, InterfaceC950020apU interfaceC950020apU, RivalExtraInfo rivalExtraInfo) {
        int iIntValue;
        String str;
        boolean z;
        EnumC950200apm enumC950200apm;
        Context contextLJII = context;
        HashMap map = new HashMap();
        map.put("vendor", 12);
        map.put("sec_to_user_id", c950360aq2.LIZIZ);
        Integer num = c950360aq2.LJIILJJIL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = c950360aq2.LIZLLL.LIZ;
        }
        map.put("invite_type", Integer.valueOf(iIntValue));
        map.put("match_type", 0);
        map.put("check_perception_center", Boolean.valueOf(c950360aq2.LJII));
        if (interfaceC950290apv2 != null) {
            map.put("cohost_invite_callback", interfaceC950290apv2);
        }
        C500400Jjq c500400Jjq = c950360aq2.LJIILL;
        if (c500400Jjq != null) {
            map.put("BATTLE_INVITE_TYPE_DIRECT_BATTLE", Integer.valueOf(c500400Jjq.LIZ));
        }
        if (c950360aq2.LIZLLL.LIZ()) {
            str = "invite_auto";
        } else {
            str = "invite_rank";
        }
        long id = room.getId();
        long ownerUserId = room.getOwnerUserId();
        long jLJIILIIL = C950220apo.LJIILIIL(room);
        long jLJIIL = C950220apo.LJIIL(room);
        long value = MtCoHostInviteTimeOutSetting.INSTANCE.getValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C950000apS c950000apS = new C950000apS(id, ownerUserId, jLJIILIIL, jLJIIL, value, room, map, arrayList);
        if (enumC950120ape == EnumC950120ape.Applied || (c954460awe != null && (enumC950200apm = c954460awe.LJJIIZ) != null && enumC950200apm.isApplying())) {
            z = true;
        } else {
            z = false;
        }
        if (!LiveCoHostAllowInviteWithApplySetting.INSTANCE.enable() && z) {
            if (contextLJII == null) {
                contextLJII = C497740JfY.LJII();
            }
            C955850ayt.LIZ(contextLJII, EnumC955790ayn.APPLY_INVITE, new AwS3S0900000_15(c950360aq2, room, rivalExtraInfo, dataChannel, c950000apS, interfaceC950290apv, linkmicStatus, interfaceC950290apv2, interfaceC950020apU, 0), new AwS559S0100000_15(interfaceC950290apv2, 88));
        } else if (C915980Zwa.LJIIIZ().k0() == EnumC958900b3o.WAITED && !C915980Zwa.LJII().LLJ()) {
            if (contextLJII == null) {
                contextLJII = C497740JfY.LJII();
            }
            C955850ayt.LIZ(contextLJII, EnumC955790ayn.PAIR_INVITE_NEW, new AwS3S0900000_15(c950360aq2, room, rivalExtraInfo, dataChannel, c950000apS, interfaceC950290apv, linkmicStatus, interfaceC950290apv2, interfaceC950020apU, 1), new AwS559S0100000_15(interfaceC950290apv2, 89));
        } else if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).dD(dataChannel, false)) {
            if (interfaceC950290apv2 != null) {
                interfaceC950290apv2.LIZIZ(1);
            }
        } else {
            LJIIIIZZ(c950360aq2.LJIIL, room, c950360aq2.LJI, rivalExtraInfo);
            LJ(dataChannel, c950000apS, room, interfaceC950290apv, linkmicStatus, interfaceC950290apv2, c950360aq2.LJIIL, rivalExtraInfo, c950360aq2.LJI, interfaceC950020apU);
        }
    }
}

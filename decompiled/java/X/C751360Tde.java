package X;

import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Tde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C751360Tde {
    public static final C751360Tde LIZ = new C751360Tde();
    public static CommentSwitchSettings LIZIZ;

    public static void LJ(EnigmaWhisperSwitchSettings enigmaWhisperSwitchSettings) {
        if (enigmaWhisperSwitchSettings != null) {
            Integer numValueOf = Integer.valueOf(enigmaWhisperSwitchSettings.enigmaWhisper);
            if (numValueOf.intValue() != 0) {
                InterfaceC1106030et7.F4.LJFF(Boolean.valueOf(C750850Tcp.LIZ(false, Integer.valueOf(numValueOf.intValue()))));
            }
        }
    }

    public static void LIZLLL(CommentSwitchSettings commentSwitchSettings, DataChannel dataChannel) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (commentSwitchSettings != null) {
            if (C500260Jjc.LJJIJLIJ() || C500260Jjc.LJIIZILJ(dataChannel)) {
                Integer numValueOf = Integer.valueOf(commentSwitchSettings.chat);
                if (numValueOf.intValue() != 0) {
                    boolean zLIZ = C750850Tcp.LIZ(true, Integer.valueOf(numValueOf.intValue()));
                    InterfaceC1106030et7.E4.LJFF(Boolean.valueOf(zLIZ));
                    if (C500260Jjc.LJJJIL(dataChannel) && dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                        roomAuthStatus.setEnableChat(zLIZ);
                    }
                }
            }
            if (C500260Jjc.LJJJIL(dataChannel)) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(commentSwitchSettings.chatL2);
            if (numValueOf2.intValue() != 0) {
                InterfaceC1106030et7.j6.LJFF(Boolean.valueOf(C750850Tcp.LIZ(true, Integer.valueOf(numValueOf2.intValue()))));
            }
            Integer numValueOf3 = Integer.valueOf(commentSwitchSettings.chatSpamComments);
            if (numValueOf3.intValue() != 0) {
                InterfaceC1106030et7.i6.LJFF(Boolean.valueOf(C750850Tcp.LIZ(true, Integer.valueOf(numValueOf3.intValue()))));
            }
            Integer numValueOf4 = Integer.valueOf(commentSwitchSettings.chatCommunityFlagged);
            if (numValueOf4.intValue() != 0) {
                InterfaceC1106030et7.k6.LJFF(Boolean.valueOf(C750850Tcp.LIZ(false, Integer.valueOf(numValueOf4.intValue()))));
            }
            Integer numValueOf5 = Integer.valueOf(commentSwitchSettings.chatCommunityFlaggedReview);
            if (numValueOf5.intValue() != 0) {
                InterfaceC1106030et7.l6.LJFF(Boolean.valueOf(C750850Tcp.LIZ(false, Integer.valueOf(numValueOf5.intValue()))));
            }
            Integer numValueOf6 = Integer.valueOf(commentSwitchSettings.commentTray);
            if (numValueOf6.intValue() != 0) {
                InterfaceC1106030et7.I7.LIZJ(Boolean.valueOf(C750850Tcp.LIZ(true, Integer.valueOf(numValueOf6.intValue()))));
            }
            Integer numValueOf7 = Integer.valueOf(commentSwitchSettings.muteDuration);
            if (numValueOf7.intValue() != 0) {
                C745220TLc c745220TLcLIZJ = C0TYC.LIZJ(Integer.valueOf(numValueOf7.intValue()));
                C751460Tdo.LIZJ().LJFF(Long.valueOf(c745220TLcLIZJ.LIZ));
                C751460Tdo.LIZIZ.put(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), c745220TLcLIZJ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r7, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C751390Tdh
            if (r0 == 0) goto Lb1
            r5 = r8
            X.0Tdh r5 = (X.C751390Tdh) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb1
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r3 = r5.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L94
            if (r0 != r1) goto Lb8
            com.bytedance.ies.sdk.datachannel.DataChannel r7 = r5.LL
            X.C155000ia.LIZIZ(r3)
        L25:
            com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings r3 = (com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings) r3
        L27:
            if (r7 == 0) goto L6f
            boolean r0 = X.C01C5.LIZ(r7)
            if (r0 != r1) goto L6f
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r7.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            boolean r0 = X.C488020JBw.LIZ(r0)
            if (r0 == 0) goto L6f
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r7.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L6f
            com.bytedance.android.livesdk.model.RoomAuthStatus r1 = r0.getRoomAuthStatus()
            if (r1 == 0) goto L6f
            if (r3 == 0) goto L6f
            boolean r0 = r1.spamcomments
            int r0 = X.C750850Tcp.LIZIZ(r0)
            r3.chatSpamComments = r0
            boolean r0 = r1.enableChatL2
            int r0 = X.C750850Tcp.LIZIZ(r0)
            r3.chatL2 = r0
            boolean r0 = r1.commentFlaggedSwitch
            int r0 = X.C750850Tcp.LIZIZ(r0)
            r3.chatCommunityFlagged = r0
            boolean r0 = r1.commentFlaggedReviewSwitch
            int r0 = X.C750850Tcp.LIZIZ(r0)
            r3.chatCommunityFlaggedReview = r0
        L6f:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.MuteDurationEvent> r1 = com.bytedance.android.livesdk.dataChannel.MuteDurationEvent.class
            if (r3 == 0) goto L7b
            int r0 = r3.muteDuration
            java.lang.Integer r4 = X.C2286608xc.LJ(r0)
        L7b:
            X.0TLc r0 = X.C0TYC.LIZJ(r4)
            r2.FQ2(r1, r0)
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.FilterCommentChangeEvent> r1 = com.bytedance.android.livesdk.dataChannel.FilterCommentChangeEvent.class
            if (r3 != 0) goto L92
            com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings r0 = new com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings
            r0.<init>()
        L8b:
            r2.FQ2(r1, r0)
            LIZLLL(r3, r7)
            return r3
        L92:
            r0 = r3
            goto L8b
        L94:
            X.C155000ia.LIZIZ(r3)
            if (r7 == 0) goto Lae
            java.lang.Class<X.0TeM> r0 = X.C751800TeM.class
            java.lang.Object r0 = r7.gg0(r0)
            X.0Tpw r0 = (X.C758980Tpw) r0
            if (r0 == 0) goto Lae
            r5.LL = r7
            r5.LLILZ = r1
            java.lang.Object r3 = r0.LIZLLL(r5)
            if (r3 != r2) goto L25
            return r2
        Lae:
            r3 = r4
            goto L27
        Lb1:
            X.0Tdh r5 = new X.0Tdh
            r5.<init>(r6, r8)
            goto L12
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751360Tde.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.bytedance.ies.sdk.datachannel.DataChannel r6, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C751400Tdi
            if (r0 == 0) goto L42
            r4 = r7
            X.0Tdi r4 = (X.C751400Tdi) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L48
            X.C155000ia.LIZIZ(r3)
        L22:
            com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings r3 = (com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings) r3
        L24:
            LJ(r3)
            return r3
        L28:
            X.C155000ia.LIZIZ(r3)
            if (r6 == 0) goto L40
            java.lang.Class<X.0TeM> r0 = X.C751800TeM.class
            java.lang.Object r0 = r6.gg0(r0)
            X.0Tpw r0 = (X.C758980Tpw) r0
            if (r0 == 0) goto L40
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJFF(r4)
            if (r3 != r2) goto L22
            return r2
        L40:
            r3 = 0
            goto L24
        L42:
            X.0Tdi r4 = new X.0Tdi
            r4.<init>(r5, r7)
            goto L12
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751360Tde.LIZIZ(com.bytedance.ies.sdk.datachannel.DataChannel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings r6, com.bytedance.ies.sdk.datachannel.DataChannel r7, X.InterfaceC1364105Vn<? super X.C470590Icr<com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateResponse>> r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C751370Tdf
            if (r0 == 0) goto L24
            r4 = r8
            X.0Tdf r4 = (X.C751370Tdf) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            com.bytedance.ies.sdk.datachannel.DataChannel r7 = r4.LLILLJJLI
            com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings r6 = r4.LL
            goto L50
        L24:
            X.0Tdf r4 = new X.0Tdf
            r4.<init>(r5, r8)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            if (r7 == 0) goto L4e
            java.lang.Class<X.0TeM> r0 = X.C751800TeM.class
            java.lang.Object r0 = r7.gg0(r0)     // Catch: java.lang.Exception -> L59
            X.0Tpw r0 = (X.C758980Tpw) r0     // Catch: java.lang.Exception -> L59
            if (r0 == 0) goto L4e
            r4.LL = r6     // Catch: java.lang.Exception -> L59
            r4.LLILLJJLI = r7     // Catch: java.lang.Exception -> L59
            r4.LLILZIL = r1     // Catch: java.lang.Exception -> L59
            java.lang.Object r3 = r0.LJIIL(r6, r4)     // Catch: java.lang.Exception -> L59
            if (r3 != r2) goto L53
            return r2
        L4e:
            r3 = 0
            goto L55
        L50:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L59
        L53:
            X.0Icr r3 = (X.C470590Icr) r3     // Catch: java.lang.Exception -> L59
        L55:
            LIZLLL(r6, r7)     // Catch: java.lang.Exception -> L59
            return r3
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751360Tde.LIZJ(com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings, com.bytedance.ies.sdk.datachannel.DataChannel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings r6, com.bytedance.ies.sdk.datachannel.DataChannel r7, X.InterfaceC1364105Vn<? super X.C470590Icr<com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateResponse>> r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C751380Tdg
            if (r0 == 0) goto L22
            r4 = r8
            X.0Tdg r4 = (X.C751380Tdg) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings r6 = r4.LL
            goto L4c
        L22:
            X.0Tdg r4 = new X.0Tdg
            r4.<init>(r5, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            if (r7 == 0) goto L4a
            java.lang.Class<X.0TeM> r0 = X.C751800TeM.class
            java.lang.Object r0 = r7.gg0(r0)     // Catch: java.lang.Exception -> L55
            X.0Tpw r0 = (X.C758980Tpw) r0     // Catch: java.lang.Exception -> L55
            if (r0 == 0) goto L4a
            r4.LL = r6     // Catch: java.lang.Exception -> L55
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L55
            java.lang.Object r3 = r0.LJIILJJIL(r6, r4)     // Catch: java.lang.Exception -> L55
            if (r3 != r2) goto L4f
            return r2
        L4a:
            r3 = 0
            goto L51
        L4c:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L55
        L4f:
            X.0Icr r3 = (X.C470590Icr) r3     // Catch: java.lang.Exception -> L55
        L51:
            LJ(r6)     // Catch: java.lang.Exception -> L55
            return r3
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751360Tde.LJFF(com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings, com.bytedance.ies.sdk.datachannel.DataChannel, X.05Vn):java.lang.Object");
    }
}

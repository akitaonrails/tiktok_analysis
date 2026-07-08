package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUserPoolFix;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0jSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282000jSw {
    public static final EnumC1282060jT2 LIZ(long j) {
        if (j == 10001) {
            return EnumC1282060jT2.AnchorTrigger;
        }
        if (j == 10002) {
            return EnumC1282060jT2.MSeqStart;
        }
        if (j == 10004) {
            return EnumC1282060jT2.CloseLiveRoom;
        }
        if (j == 10003) {
            return EnumC1282060jT2.AnchorMicInterrupt;
        }
        if (j == 10010) {
            return EnumC1282060jT2.LiveStreamError;
        }
        if (j == 10011) {
            return EnumC1282060jT2.LiveStreamError;
        }
        if (j == 10021) {
            return EnumC1282060jT2.PunishCenterIm;
        }
        return EnumC1282060jT2.Unknown;
    }

    public static final EnumC1282020jSy LIZIZ(int i) {
        if (i != 0) {
            if (i != 10018) {
                switch (i) {
                    case 10001:
                        return EnumC1282020jSy.ClickQuickLeaveBtn;
                    case 10002:
                        return EnumC1282020jSy.ManageViewClickLeave;
                    case 10003:
                        return EnumC1282020jSy.LiveEnd;
                    case 10004:
                        return EnumC1282020jSy.FeedbackV3;
                    case 10005:
                        return EnumC1282020jSy.OnlyOneTapGoLive;
                    default:
                        switch (i) {
                            case 10011:
                                return EnumC1282020jSy.OptimizeFirstEnterInList;
                            case 10012:
                                return EnumC1282020jSy.MaximumGuestsReached;
                            case 10013:
                                return EnumC1282020jSy.GuestPauseTimeout;
                            case 10014:
                                return EnumC1282020jSy.AppWillTerminate;
                            case 10015:
                                return EnumC1282020jSy.PlayPipWindow;
                            case 10016:
                                return EnumC1282020jSy.OnlyOne;
                            default:
                                switch (i) {
                                    case 10021:
                                        return EnumC1282020jSy.ReplyFailed;
                                    case 10022:
                                        return EnumC1282020jSy.JoinChannelError;
                                    case 10023:
                                        return EnumC1282020jSy.PermitMessageTimeout;
                                    default:
                                        switch (i) {
                                            case 10031:
                                                return EnumC1282020jSy.RtcError;
                                            case 10032:
                                                return EnumC1282020jSy.AnchorOffline;
                                            case 10033:
                                                return EnumC1282020jSy.RtcLost;
                                            default:
                                                switch (i) {
                                                    case 10041:
                                                        return EnumC1282020jSy.AppliedAudioPanelClose;
                                                    case 10042:
                                                        return EnumC1282020jSy.InvitedAudioPanelClose;
                                                    case 10043:
                                                        return EnumC1282020jSy.AppliedVideoPanelClose;
                                                    case 10044:
                                                        return EnumC1282020jSy.InvitedVideoPanelClose;
                                                    case 10045:
                                                        return EnumC1282020jSy.AppliedAudioPanelTimeout;
                                                    case 10046:
                                                        return EnumC1282020jSy.InvitedAudioPanelTimeout;
                                                    case 10047:
                                                        return EnumC1282020jSy.AppliedVideoPanelTimeout;
                                                    case 10048:
                                                        return EnumC1282020jSy.InvitedVideoPanelTimeout;
                                                    case 10049:
                                                        return EnumC1282020jSy.ReplyReserveAcceptFailed;
                                                    default:
                                                        switch (i) {
                                                            case 10080:
                                                                return EnumC1282020jSy.LeaveGroupWithUserClickDisconnect;
                                                            case 10081:
                                                                return EnumC1282020jSy.LeaveGroupWithPerceptionMessage;
                                                            case 10082:
                                                                return EnumC1282020jSy.LeaveGroupWithMicRoomStart;
                                                            case 10083:
                                                                return EnumC1282020jSy.LeaveGroupWithDetachView;
                                                            case 10084:
                                                                return EnumC1282020jSy.LeaveGroupWithModeSwitch;
                                                            case 10085:
                                                                return EnumC1282020jSy.LeaveGroupWithCohostResume;
                                                            default:
                                                                return EnumC1282020jSy.Unknown;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            }
            return EnumC1282020jSy.GuestResetLinkmicStatus;
        }
        return EnumC1282020jSy.Unknown;
    }

    public static final EnumC1282110jT7 LIZJ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return EnumC1282110jT7.Checked;
                        }
                        return EnumC1282110jT7.Close;
                    }
                    return EnumC1282110jT7.Open;
                }
                return EnumC1282110jT7.Hide;
            }
            return EnumC1282110jT7.NotChecked;
        }
        return EnumC1282110jT7.Checked;
    }

    public static final C1283230jUv LIZLLL(PosIdentity posIdentity) {
        EnumC1283210jUt enumC1283210jUt;
        int i = posIdentity.type;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    enumC1283210jUt = EnumC1283210jUt.EmptySlot;
                } else {
                    enumC1283210jUt = EnumC1283210jUt.LiveUserId;
                }
            } else {
                enumC1283210jUt = EnumC1283210jUt.RtcStreamId;
            }
        } else {
            enumC1283210jUt = EnumC1283210jUt.RtcUserId;
        }
        return new C1283230jUv(enumC1283210jUt, posIdentity.value);
    }

    public static final LinkUser LJ(C967180bHA c967180bHA) {
        LinkUser linkUserLIZ;
        if (LinkMicUserPoolFix.INSTANCE.enable()) {
            linkUserLIZ = new LinkUser.Builder().build();
        } else {
            linkUserLIZ = C967420bHY.LIZ();
        }
        linkUserLIZ.setRoomId(Long.valueOf(c967180bHA.LIZ));
        linkUserLIZ.setUserId(Long.valueOf(c967180bHA.LIZJ));
        linkUserLIZ.setChannelId(Long.valueOf(c967180bHA.LIZIZ));
        linkUserLIZ.setLinkMicId(c967180bHA.LIZLLL);
        linkUserLIZ.setChannelOwnerLinkedTime(Long.valueOf(c967180bHA.LJFF));
        linkUserLIZ.setChannelOwnerJoinTime(Long.valueOf(c967180bHA.LJ));
        linkUserLIZ.setAudioMutedByChannel(c967180bHA.LJI);
        linkUserLIZ.setAudioSwitchOn(c967180bHA.LJII);
        linkUserLIZ.setVideoSwitchOn(c967180bHA.LJIIIIZZ);
        linkUserLIZ.setAudioOccupied(c967180bHA.LJIIIZ);
        linkUserLIZ.setOwnerUid(Long.valueOf(c967180bHA.LJIIL));
        linkUserLIZ.setOwnerRoomId(Long.valueOf(c967180bHA.LJIILIIL));
        linkUserLIZ.setOwnerChannelId(Long.valueOf(c967180bHA.LJIILJJIL));
        linkUserLIZ.setLinkedTimeNano(Long.valueOf(c967180bHA.LJFF));
        int i = C1CX3.LIZ[c967180bHA.LJIJJ.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        linkUserLIZ.setLinkUserType(i2);
        linkUserLIZ.setOnLineUserState(LJFF(c967180bHA.LJIIJ));
        linkUserLIZ.setGroupLinkMicId(c967180bHA.LJIJI);
        linkUserLIZ.setGroupChannelId(Long.valueOf(c967180bHA.LJIJ));
        return linkUserLIZ;
    }

    public static final int LJFF(C1CXJ c1cxj) {
        int i = C1CX3.LJ[c1cxj.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return 0;
    }

    public static final PosIdentity LJI(C1283230jUv c1283230jUv) {
        PosIdentity posIdentity = new PosIdentity();
        posIdentity.type = c1283230jUv.LIZ.intoInt();
        posIdentity.value = c1283230jUv.LIZIZ;
        return posIdentity;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1275510jIT LJII(X.C1276320jJm r3) {
        /*
            X.0jIT r2 = new X.0jIT
            r2.<init>()
            java.lang.String r0 = r3.LIZ
            r2.LIZIZ = r0
            java.lang.String r0 = r3.LIZJ
            r2.LIZLLL = r0
            java.lang.String r0 = r3.LIZLLL
            r2.LJ = r0
            java.lang.String r0 = r3.LIZIZ
            r2.LIZ = r0
            java.lang.String r0 = X.C0X2A.LIZJ
            r2.LIZJ = r0
            X.0oxh r0 = r3.LJ
            if (r0 == 0) goto L28
            int[] r1 = X.C1CX3.LIZJ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L2d;
                case 2: goto L30;
                case 3: goto L33;
                case 4: goto L36;
                case 5: goto L39;
                case 6: goto L3c;
                case 7: goto L3f;
                case 8: goto L42;
                default: goto L28;
            }
        L28:
            X.0jJo r0 = X.EnumC1276340jJo.DISPATCH_OKHTTP_DISPATCH_FAILED
        L2a:
            r2.LJFF = r0
            return r2
        L2d:
            X.0jJo r0 = X.EnumC1276340jJo.DISPATCH_SUCCESS
            goto L2a
        L30:
            X.0jJo r0 = X.EnumC1276340jJo.DISPATCH_INVALID_ORIGIN_URL
            goto L2a
        L33:
            X.0jJo r0 = X.EnumC1276340jJo.DISPATCH_CRONET_NOT_INIT
            goto L2a
        L36:
            X.0jJo r0 = X.EnumC1276340jJo.DISPATCH_TIMEOUT
            goto L2a
        L39:
            X.0jJo r0 = X.EnumC1276340jJo.DISPATCH_INVALID_FINAL_URL
            goto L2a
        L3c:
            X.0jJo r0 = X.EnumC1276340jJo.DISPATCH_OKHTTP_DISPATCH_FAILED
            goto L2a
        L3f:
            X.0jJo r0 = X.EnumC1276340jJo.DISPATCH_WRONG_FORMAT
            goto L2a
        L42:
            X.0jJo r0 = X.EnumC1276340jJo.DISPATCH_NOT_REACHED
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1282000jSw.LJII(X.0jJm):X.0jIT");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0110, code lost:
    
        if (r2.equals("") != false) goto L15;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[PHI: r0
      0x007f: PHI (r0v34 int) = (r0v33 int), (r0v35 int) binds: [B:32:0x0079, B:34:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(X.C1274930jHX r12, X.C1277240jLG r13, kotlin.jvm.functions.Function0 r14) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1282000jSw.LJIIIIZZ(X.0jHX, X.0jLG, kotlin.jvm.functions.Function0):void");
    }
}

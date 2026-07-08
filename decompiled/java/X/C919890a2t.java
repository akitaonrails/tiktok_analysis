package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.EnlargePositionStatusSynContent;
import com.bytedance.android.livesdk.model.message.LinkScreenChangeMessage;
import com.bytedance.android.livesdk.model.message.LinkerEnlargeStatusSynContent;
import com.bytedance.android.livesdk.model.message.LinkerGuestCancelEnlargeContent;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import kotlin.Pair;
import tikcast.linkmic.common.LinkerMediaChangeOperator;

/* JADX INFO: renamed from: X.0a2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919890a2t implements InterfaceC919860a2q {
    public final /* synthetic */ C919900a2u LL;

    public C919890a2t(C919900a2u c919900a2u) {
        this.LL = c919900a2u;
    }

    @Override // X.InterfaceC919860a2q
    public final void K(LinkScreenChangeMessage linkScreenChangeMessage, boolean z) {
        int i;
        LinkPlayerInfo linkPlayerInfoLJII;
        User user;
        boolean z2;
        AbstractC928510aGn abstractC928510aGnLIZ;
        String str;
        Integer numValueOf;
        String str2;
        String str3;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        AbstractC928510aGn abstractC928510aGnLIZ3;
        LinkPlayerInfo linkPlayerInfo;
        long j;
        EnlargePositionStatusSynContent enlargePositionStatusSynContent;
        int i2 = linkScreenChangeMessage.messageType;
        User user2 = null;
        String str4 = "";
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3 && (enlargePositionStatusSynContent = linkScreenChangeMessage.enlargePosStatusSyn) != null) {
                    C919900a2u c919900a2u = this.LL;
                    c919900a2u.LIZ.LJJIIJ(enlargePositionStatusSynContent);
                    C919350a21 c919350a21 = c919900a2u.LIZIZ;
                    c919350a21.LIZJ = enlargePositionStatusSynContent.layoutId;
                    c919350a21.LJJI(enlargePositionStatusSynContent);
                    return;
                }
                return;
            }
            if (!z) {
                C919900a2u c919900a2u2 = this.LL;
                long j2 = c919900a2u2.LIZJ;
                CommonMessageData commonMessageData = linkScreenChangeMessage.baseMessage;
                long j3 = 0;
                if (commonMessageData != null) {
                    j = commonMessageData.createTime;
                } else {
                    j = 0;
                }
                if (j2 >= j) {
                    return;
                }
                if (commonMessageData != null) {
                    j3 = commonMessageData.createTime;
                }
                c919900a2u2.LIZJ = j3;
            }
            LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent = linkScreenChangeMessage.enlargeStatusSyn;
            if (linkerEnlargeStatusSynContent == null) {
                return;
            }
            C919900a2u c919900a2u3 = this.LL;
            C919990a33 c919990a33 = c919900a2u3.LIZ;
            c919990a33.getClass();
            if (C01HE.LJ() == C01FV.ANCHOR) {
                int i3 = linkerEnlargeStatusSynContent.scene;
                LinkerMediaChangeOperator linkerMediaChangeOperator = linkerEnlargeStatusSynContent.operatorInfo;
                if (linkerMediaChangeOperator != null) {
                    numValueOf = Integer.valueOf(linkerMediaChangeOperator.operatorType);
                } else {
                    numValueOf = null;
                }
                LinkerMediaChangeOperator linkerMediaChangeOperator2 = linkerEnlargeStatusSynContent.operatorInfo;
                if (linkerMediaChangeOperator2 != null) {
                    str2 = linkerMediaChangeOperator2.displayId;
                    str3 = linkerMediaChangeOperator2.nickName;
                } else {
                    str2 = null;
                    str3 = null;
                }
                String strLIZIZ = C0KVU.LIZIZ(str2, str3);
                if (i3 == 2) {
                    if (numValueOf != null && numValueOf.intValue() == 1) {
                        InterfaceC302401Fe interfaceC302401FeLJJIII = c919990a33.LJJIII();
                        if (interfaceC302401FeLJJIII != null && (abstractC928510aGnLIZ3 = interfaceC302401FeLJJIII.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ3.LJFF(linkerEnlargeStatusSynContent.enlargeLinkmicId)) != null) {
                            user2 = linkPlayerInfo.mUser;
                        }
                        C01I3.LIZJ(2131843069, "expanded_guest", strLIZIZ, C0KVU.LIZ(user2));
                    }
                } else if (i3 == 3 && numValueOf != null && numValueOf.intValue() == 1) {
                    InterfaceC302401Fe interfaceC302401FeLJJIII2 = c919990a33.LJJIII();
                    if (interfaceC302401FeLJJIII2 != null && (abstractC928510aGnLIZ2 = interfaceC302401FeLJJIII2.LIZ()) != null) {
                        String str5 = c919990a33.LIZ.LJ;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) abstractC928510aGnLIZ2.LJFF(str4);
                        if (linkPlayerInfo2 != null) {
                            user2 = linkPlayerInfo2.mUser;
                        }
                    }
                    C01I3.LIZJ(2131843074, "shrank_guest", strLIZIZ, C0KVU.LIZ(user2));
                }
            }
            c919900a2u3.LIZIZ.LJJIFFI(linkerEnlargeStatusSynContent);
            return;
        }
        C919990a33 c919990a332 = this.LL.LIZ;
        LinkerGuestCancelEnlargeContent linkerGuestCancelEnlargeContent = linkScreenChangeMessage.guestCancelEnlarge;
        if (linkerGuestCancelEnlargeContent != null && (str = linkerGuestCancelEnlargeContent.cancelLinkmicId) != null) {
            str4 = str;
        }
        if (linkerGuestCancelEnlargeContent != null) {
            i = linkerGuestCancelEnlargeContent.isRejectEnlarge;
        } else {
            AbstractC919790a2j.LJIIJJI.getClass();
            i = 0;
        }
        c919990a332.getClass();
        C1143300frE.LJIIJJI().LJII(c919990a332.LIZJ, C2097608Jq.LJIIJ(new Pair("action", "onReceiveGuestZoom"), new Pair("cancelLinkMicId", str4), new Pair("isRejectEnlarge", Integer.valueOf(i))));
        InterfaceC302401Fe interfaceC302401FeLJJIII3 = c919990a332.LJJIII();
        if (interfaceC302401FeLJJIII3 != null && (abstractC928510aGnLIZ = interfaceC302401FeLJJIII3.LIZ()) != null) {
            linkPlayerInfoLJII = C921170a4x.LJII(abstractC928510aGnLIZ, str4);
        } else {
            linkPlayerInfoLJII = null;
        }
        if (linkPlayerInfoLJII != null) {
            user = linkPlayerInfoLJII.mUser;
        } else {
            user = null;
        }
        C919870a2r.LIZ(user);
        Object[] objArr = new Object[1];
        if (linkPlayerInfoLJII != null) {
            user2 = linkPlayerInfoLJII.mUser;
        }
        objArr[0] = C0KVU.LIZ(user2);
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843614, objArr));
        AbstractC919790a2j.LJIIJJI.getClass();
        if (i == AbstractC919790a2j.LJIJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        c919990a332.LJI(str4, null, true, z2, false, true, EnumC919910a2v.FROM_RECEIVE_GUEST_SHRINK_IM, null);
    }
}

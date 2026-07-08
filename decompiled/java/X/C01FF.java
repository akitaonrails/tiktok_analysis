package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowZoomEvent;
import com.bytedance.android.livesdk.model.message.LinkScreenChangeMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.im.LiveShowMessage;

/* JADX INFO: renamed from: X.01FF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class C01FF {
    public final DataChannel LIZ;
    public final C01FL LIZIZ;
    public final C01FG LIZJ;

    public final void LIZ() {
        IMessageManager iMessageManager;
        try {
            DataChannel dataChannel = this.LIZ;
            if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
                return;
            }
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LIZJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.01FG, com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener] */
    public C01FF(DataChannel dataChannel, C01FL c01fl) {
        IMessageManager iMessageManager;
        this.LIZ = dataChannel;
        this.LIZIZ = c01fl;
        ?? r2 = new OnIMMessageListener() { // from class: X.01FG
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "live-show-message-channel";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                DataChannel dataChannel2;
                List<ShowListUser> list;
                ShowListUser showListUser;
                List<ShowListUser> list2;
                if (iMessage == null) {
                    return;
                }
                if (iMessage instanceof LiveShowMessage) {
                    C01FF c01ff = this.LL;
                    LiveShowMessage liveShowMessage = (LiveShowMessage) iMessage;
                    c01ff.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleLiveShowMessage messageId=");
                    sbLIZ.append(liveShowMessage.getMessageId());
                    sbLIZ.append(" messageType=");
                    sbLIZ.append(liveShowMessage.messageType);
                    C20441214yg.LJIIIZ("BaseLiveShowMessageChannel", C2188811AlT.LIZIZ(sbLIZ));
                    switch (liveShowMessage.messageType) {
                        case 0:
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("reportErrorMessage reason=");
                            sbLIZ2.append("");
                            sbLIZ2.append(" message=");
                            sbLIZ2.append(liveShowMessage);
                            C20441214yg.LJ("BaseLiveShowMessageChannel", C2188811AlT.LIZIZ(sbLIZ2));
                            break;
                        case 1:
                            ShowContent showContent = liveShowMessage.showContent;
                            if (showContent != null) {
                                c01ff.LIZIZ.LJIJJ(showContent, liveShowMessage.operatorUserInfo);
                            }
                            break;
                        case 2:
                            c01ff.LIZIZ.LJIILJJIL(liveShowMessage, liveShowMessage.operatorUserInfo);
                            break;
                        case 3:
                            ShowContent showContent2 = liveShowMessage.showContent;
                            if (showContent2 != null) {
                                c01ff.LIZIZ.LJIL(showContent2, liveShowMessage.operatorUserInfo);
                            }
                            break;
                        case 4:
                            ShowContent showContent3 = liveShowMessage.showContent;
                            if (showContent3 != null) {
                                c01ff.LIZIZ.LJIIZILJ(showContent3, liveShowMessage.operatorUserInfo);
                            }
                            break;
                        case 5:
                            if (liveShowMessage.showContent != null) {
                                c01ff.LIZIZ.LJIJI(liveShowMessage);
                            }
                            break;
                        case 6:
                            c01ff.LIZIZ.LJJ(liveShowMessage);
                            break;
                        case 7:
                            c01ff.LIZIZ.LJIILLIIL(liveShowMessage, liveShowMessage.operatorUserInfo);
                            break;
                    }
                    int i = liveShowMessage.messageType;
                    if (i != 2 && i != 5 && i != 7) {
                        return;
                    }
                    ShowListUser showListUser2 = null;
                    String str = null;
                    showListUser2 = null;
                    if (liveShowMessage.showuserfinishreason == 2 && C01HE.LJ() != C01FV.AUDIENCE) {
                        ShowContent showContent4 = liveShowMessage.showContent;
                        if (showContent4 != null && (list2 = showContent4.finishedList) != null) {
                            Iterator<ShowListUser> it2 = list2.iterator();
                            if (it2.hasNext()) {
                                ShowListUser next = it2.next();
                                if (it2.hasNext()) {
                                    int i2 = next.order;
                                    do {
                                        ShowListUser next2 = it2.next();
                                        int i3 = next2.order;
                                        if (i2 < i3) {
                                            next = next2;
                                            i2 = i3;
                                        }
                                    } while (it2.hasNext());
                                }
                                showListUser = next;
                            } else {
                                throw new NoSuchElementException();
                            }
                        } else {
                            showListUser = null;
                        }
                        Object[] objArr = new Object[1];
                        if (showListUser != null) {
                            str = showListUser.nickname;
                        }
                        objArr[0] = str;
                        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843350, objArr));
                        return;
                    }
                    if (liveShowMessage.showuserfinishreason != 11 || C01HE.LJ() == C01FV.AUDIENCE) {
                        return;
                    }
                    ShowContent showContent5 = liveShowMessage.showContent;
                    if (showContent5 != null && (list = showContent5.finishedList) != null) {
                        Iterator<ShowListUser> it3 = list.iterator();
                        if (it3.hasNext()) {
                            ShowListUser next3 = it3.next();
                            if (it3.hasNext()) {
                                int i4 = next3.order;
                                do {
                                    ShowListUser next4 = it3.next();
                                    int i5 = next4.order;
                                    if (i4 < i5) {
                                        next3 = next4;
                                        i4 = i5;
                                    }
                                } while (it3.hasNext());
                            }
                            showListUser2 = next3;
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    LinkerMediaChangeOperator linkerMediaChangeOperator = liveShowMessage.operatorUserInfo;
                    if (linkerMediaChangeOperator == null) {
                        return;
                    }
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    C923330a8R.LJIIJJI(linkerMediaChangeOperator, new C5183020f(showListUser2, 188));
                    return;
                }
                if (!(iMessage instanceof LinkScreenChangeMessage) || (dataChannel2 = this.LL.LIZ) == null) {
                    return;
                }
                dataChannel2.FQ2(LiveShowZoomEvent.class);
            }
        };
        this.LIZJ = r2;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != 0) {
            iMessageManager.addMessageListener(C001A.LIVE_SHOW_MESSAGE.getIntType(), (OnIMMessageListener) r2);
            iMessageManager.addMessageListener(C001A.LINK_SCREEN_CHANGE_MESSAGE.getIntType(), (OnIMMessageListener) r2);
        }
    }
}

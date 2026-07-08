package X;

import X.InterfaceC888420YtE;
import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VOLightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VORightOperationType;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;

/* JADX INFO: renamed from: X.0YrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC887210YrH<EXTRA extends InterfaceC888420YtE> extends InterfaceC885810Yp1<EXTRA> {
    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    /* synthetic */ InterfaceC884440Ymo copyData();

    C894700Z8a getActivityStatusTextWithType();

    C429270GsP getActivityStatusViewData();

    String getActivityText();

    @Override // X.InterfaceC885810Yp1
    /* synthetic */ InterfaceC882230YjF getAvatar();

    C887540Yro getChatListCameraStatus();

    C886440Yq2 getChatStatus();

    @Override // X.InterfaceC885810Yp1
    /* synthetic */ CharSequence getContent();

    @Override // X.InterfaceC885810Yp1
    /* synthetic */ EXTRA getExtra();

    boolean getHasStreakReminderInlineMsg();

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    /* synthetic */ InterfaceC1491305sd getKey();

    VOLightInteractionEntryConf getLightInteractionEntryConf();

    C0I3B getMsgDraft();

    @Override // X.InterfaceC885810Yp1
    /* synthetic */ String getName();

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    /* synthetic */ InterfaceC879010Ye3 getPageKey();

    EnumC881770YiV getReadStatus();

    CharSequence getReadText();

    VORightOperationType getRightOperationType();

    @Override // X.InterfaceC885810Yp1
    /* synthetic */ String getSessionUpdateTime();

    boolean getShowReadStatus();

    boolean getShowStarIcon();

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    /* synthetic */ long getSortOrder();

    SystemContent getSystemContentOfLastMsg();

    String getTimestamp();

    @Override // X.InterfaceC885810Yp1, X.InterfaceC884440Ymo
    /* synthetic */ InterfaceC1490905sZ<?> getType();

    InterfaceC894890Z8t getTypingIndicatorInboxData();

    @Override // X.InterfaceC885810Yp1
    /* synthetic */ AbstractC884010Ym7 getUnreadViewState();

    C0Z8A getVoContentType();

    boolean isLastMsgFakeMsg();
}

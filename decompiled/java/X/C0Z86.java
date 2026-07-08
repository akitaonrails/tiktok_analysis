package X;

import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VOLightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;

/* JADX INFO: renamed from: X.0Z86, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public interface C0Z86 extends InterfaceC888500YtM {
    @Override // X.InterfaceC888500YtM
    /* synthetic */ InterfaceC888500YtM copyData();

    C894700Z8a getActivityStatusTextWithType();

    C429270GsP getActivityStatusViewData();

    String getActivityText();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ Object getAvatar();

    Integer getCategory();

    C887540Yro getChatListCameraStatus();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ CharSequence getContent();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ long getConversationUpdatedAt();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ boolean getHasUnreadMsg();

    int getLastMessageMsgType();

    String getLastMessageScene();

    C869590Y9l getLastMsg();

    C894790Z8j getLeftViewVO();

    VOLightInteractionEntryConf getLightInteractionEntryConf();

    C0Z72 getMiddleViewVO();

    C0I3B getMsgDraft();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ String getName();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ InterfaceC879010Ye3 getPageKey();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ String getPreviewContentType();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ int getPriority();

    EnumC881770YiV getReadStatus();

    CharSequence getReadText();

    C0Z74 getRightViewVO();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ String getSessionId();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ int getSessionType();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ AbstractC884010Ym7 getSessionUnreadViewState();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ String getSessionUpdateTime();

    boolean getShowReadStatus();

    boolean getShowStarIcon();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ long getSortOrder();

    SystemContent getSystemContentOfLastMsg();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ int getViewHolderType();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ boolean isCheckEmoji();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ boolean isMute();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ boolean isSnapshot();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ boolean isSupportMute();

    @Override // X.InterfaceC888500YtM
    /* synthetic */ void setAvatar(Object obj);

    @Override // X.InterfaceC888500YtM
    /* synthetic */ void setContent(CharSequence charSequence);

    void setLeftViewVO(C894790Z8j c894790Z8j);

    void setLightInteractionEntryConf(VOLightInteractionEntryConf vOLightInteractionEntryConf);

    void setMiddleViewVO(C0Z72 c0z72);

    @Override // X.InterfaceC888500YtM
    /* synthetic */ void setPreviewContentType(String str);

    void setReadText(CharSequence charSequence);

    void setRightViewVO(C0Z74 c0z74);

    void setShowReadStatus(boolean z);

    @Override // X.InterfaceC888500YtM
    /* synthetic */ void setSnapshot(boolean z);

    @Override // X.InterfaceC888500YtM
    /* synthetic */ void setSortOrder(long j);
}

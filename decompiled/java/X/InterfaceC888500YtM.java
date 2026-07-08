package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0YtM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC888500YtM extends Serializable {
    InterfaceC888500YtM copyData();

    Object getAvatar();

    CharSequence getContent();

    long getConversationUpdatedAt();

    boolean getHasUnreadMsg();

    String getName();

    InterfaceC879010Ye3 getPageKey();

    String getPreviewContentType();

    int getPriority();

    String getSessionId();

    int getSessionType();

    AbstractC884010Ym7 getSessionUnreadViewState();

    String getSessionUpdateTime();

    long getSortOrder();

    int getViewHolderType();

    boolean isCheckEmoji();

    boolean isMute();

    boolean isSnapshot();

    boolean isSupportMute();

    void setAvatar(Object obj);

    void setContent(CharSequence charSequence);

    void setPreviewContentType(String str);

    void setSnapshot(boolean z);

    void setSortOrder(long j);
}

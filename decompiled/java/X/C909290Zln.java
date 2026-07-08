package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0Zln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909290Zln extends SessionInfo {
    public String LLLLLLIL;
    public IMUser LLLLLLJ;
    public Serializable LLLLLLL;
    public boolean LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public String LLLLLLLZIL;
    public boolean LLLLLLZ;
    public String LLLLLLZZ;
    public boolean LLLLLZ;
    public C0IBF LLLLLZIL;

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo
    public String getSingleChatFromUserId() {
        IMUser iMUser = this.LLLLLLJ;
        if (iMUser != null) {
            return iMUser.getUid();
        }
        return null;
    }

    public final String getButtonType() {
        return this.LLLLLLZZ;
    }

    public final C0IBF getCameraFeatureStatus() {
        return this.LLLLLZIL;
    }

    public final Serializable getChatExt() {
        return this.LLLLLLL;
    }

    public final String getEnterProfileGroupId() {
        return this.LLLLLLLZIL;
    }

    public final IMUser getFromUser() {
        return this.LLLLLLJ;
    }

    public final String getShareUserId() {
        return this.LLLLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo
    public IMUser getSingleChatFromUser() {
        return this.LLLLLLJ;
    }

    public final boolean isOnlineWhenEnterChat() {
        return this.LLLLLZ;
    }

    public final boolean isRecommendedChat() {
        return this.LLLLLLLLLL;
    }

    public final boolean isRisky() {
        return this.LLLLLLZ;
    }

    public final boolean isTCM() {
        return this.LLLLLLLLL;
    }

    public C909290Zln(String str) {
        super(str);
        this.LLLLLZIL = C0IBF.FEATURE_STATUS_UNKNOWN;
    }

    public final void setButtonType(String str) {
        this.LLLLLLZZ = str;
    }

    public final void setCameraFeatureStatus(C0IBF c0ibf) {
        this.LLLLLZIL = c0ibf;
    }

    public final void setChatExt(Serializable serializable) {
        this.LLLLLLL = serializable;
    }

    public final void setEnterProfileGroupId(String str) {
        this.LLLLLLLZIL = str;
    }

    public final void setFromUser(IMUser iMUser) {
        this.LLLLLLJ = iMUser;
    }

    public final void setOnlineWhenEnterChat(boolean z) {
        this.LLLLLZ = z;
    }

    public final void setRecommendedChat(boolean z) {
        this.LLLLLLLLLL = z;
    }

    public final void setRisky(boolean z) {
        this.LLLLLLZ = z;
    }

    public final void setShareUserId(String str) {
        this.LLLLLLIL = str;
    }

    public final void setTCM(boolean z) {
        this.LLLLLLLLL = z;
    }
}

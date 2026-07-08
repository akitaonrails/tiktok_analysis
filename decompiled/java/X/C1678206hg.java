package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;

/* JADX INFO: renamed from: X.06hg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1678206hg {
    public static final String LIZ(SessionInfo sessionInfo) {
        if ((sessionInfo instanceof C909290Zln) && ((C909290Zln) sessionInfo).isTCM()) {
            return "tcm";
        }
        if (sessionInfo.isMessageRequest()) {
            return "stranger";
        }
        if (sessionInfo.isSingleChat()) {
            return "private";
        }
        if (sessionInfo.isGroupChat()) {
            return "group";
        }
        return "";
    }
}

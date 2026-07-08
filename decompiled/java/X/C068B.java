package X;

import com.ss.android.ugc.aweme.chatnotice.ChatNoticeApiHelper;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.IChatNoticeApiHelper;

/* JADX INFO: renamed from: X.068B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C068B {
    public static final /* synthetic */ C068B LIZ = new C068B();

    public static IChatNoticeApiHelper LIZ(TikTokImApi tikTokImApi) {
        IChatNoticeApiHelper iChatNoticeApiHelper;
        Object objLIZ = C04TD.LIZ(IChatNoticeApiHelper.class, false);
        if (objLIZ != null) {
            iChatNoticeApiHelper = (IChatNoticeApiHelper) objLIZ;
        } else {
            if (C04TD.LLJ == null) {
                synchronized (IChatNoticeApiHelper.class) {
                    if (C04TD.LLJ == null) {
                        C04TD.LLJ = new ChatNoticeApiHelper();
                    }
                }
            }
            iChatNoticeApiHelper = C04TD.LLJ;
        }
        iChatNoticeApiHelper.LIZ(tikTokImApi);
        return iChatNoticeApiHelper;
    }
}

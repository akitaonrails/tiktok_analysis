package X;

import com.ss.android.ugc.aweme.setting.api.BetaVersionBody;
import com.ss.android.ugc.aweme.setting.api.EmailRequestBody;
import com.ss.android.ugc.aweme.setting.api.InboxMsgRequestBody;
import com.ss.android.ugc.aweme.setting.api.SimpleResponseBody;

/* JADX INFO: renamed from: X.0TTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC747470TTt {
    public static final C747460TTs LIZ = C747460TTs.LIZ;

    @InterfaceC1501200pAU("/check_version/v7/")
    C11NZ<BetaVersionBody> LIZ();

    @InterfaceC1501240pAY("/notice/save_user_info/v1/")
    C11NZ<SimpleResponseBody> LIZIZ(@C040I EmailRequestBody emailRequestBody);

    @InterfaceC1501240pAY("/notice/send_inbox_message/v1/")
    C11NZ<SimpleResponseBody> LIZJ(@C040I InboxMsgRequestBody inboxMsgRequestBody);
}

package X;

import com.ss.android.ugc.aweme.album.IAlbumUpdateGuideViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.container.BaseChatInputAssem;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText;
import kotlin.jvm.internal.AwS16S0600000_6;
import kotlin.jvm.internal.AwS90S0500000_6;

/* JADX INFO: renamed from: X.0I6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461260I6y {
    public static final void LIZ(SearchableEditText searchableEditText, C19EG c19eg, BaseChatInputAssem baseChatInputAssem, SessionInfo sessionInfo, IAlbumUpdateGuideViewModel iAlbumUpdateGuideViewModel, C0I20 c0i20) {
        C0IBF c0ibf;
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ != null) {
            iMCrossAppFeatureDiffApiLIZIZ.LJIJI();
            if (c19eg == null || sessionInfo == null) {
                return;
            }
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo.getConversationId());
            if (c0y8tLIZ != null) {
                c0ibf = C903170Zbv.LIZIZ(c0y8tLIZ).camera_status;
            } else {
                c0ibf = null;
            }
            if (c0ibf != C0IBF.FEATURE_STATUS_SHOW) {
                return;
            }
            searchableEditText.setOnPasteListener(new AwS16S0600000_6(searchableEditText, c19eg, baseChatInputAssem, sessionInfo, iAlbumUpdateGuideViewModel, c0i20, 2));
            searchableEditText.setOnCommitContentListener(new AwS90S0500000_6(c19eg, baseChatInputAssem, sessionInfo, iAlbumUpdateGuideViewModel, c0i20, 3));
        }
    }
}

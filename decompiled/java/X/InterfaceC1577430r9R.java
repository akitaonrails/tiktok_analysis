package X;

import com.ss.android.ugc.aweme.model.MiniDramaFeedCardRequest;
import com.ss.android.ugc.aweme.model.MiniDramaFeedCardResponse;
import com.ss.android.ugc.aweme.model.MiniDramaTabConfigResponse;

/* JADX INFO: renamed from: X.0r9R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1577430r9R {
    @InterfaceC1501200pAU("/tiktok/v1/paid_content/mini_drama/tab_config")
    C11NZ<MiniDramaTabConfigResponse> LIZIZ();

    @InterfaceC1501240pAY("/tiktok/v1/paid_content/mini_drama/feed_card")
    C11NZ<MiniDramaFeedCardResponse> LIZJ(@C040I MiniDramaFeedCardRequest miniDramaFeedCardRequest);
}

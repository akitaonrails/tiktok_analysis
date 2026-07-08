package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.profile.business.ur.edit.api.YoutubeApi;

/* JADX INFO: renamed from: X.1Ate, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2193881Ate {
    @InterfaceC1501240pAY("/aweme/v1/youtube/bind/")
    @InterfaceC1485505rh
    ListenableFuture<YoutubeApi.YouTubeResponse> LIZ(@InterfaceC1501100pAK("yt_raw_token") String str, @InterfaceC1501100pAK("google_account") String str2, @InterfaceC1501100pAK("youtube_channel_id") String str3, @InterfaceC1501100pAK("youtube_channel_title") String str4, @InterfaceC1501100pAK("user_agent") String str5, @InterfaceC1501100pAK("token_type") String str6, @InterfaceC1501100pAK("access_token") String str7);

    @InterfaceC1501200pAU("/aweme/v1/youtube/unbind/")
    ListenableFuture<YoutubeApi.YouTubeResponse> unlink();
}

package X;

import com.ss.android.ugc.aweme.fe.method.upload.config.I18nUploadAuthConfig;
import com.ss.android.ugc.aweme.fe.method.upload.response.I18nUploadResponse;

/* JADX INFO: renamed from: X.0pKD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1507230pKD {
    @InterfaceC1501200pAU("/aweme/v1/upload/authkey/")
    C15O7<I18nUploadAuthConfig> LIZ();

    @InterfaceC1501200pAU("/aweme/v1/sign/gain/url/")
    C15O7<I18nUploadResponse> LIZIZ(@InterfaceC1501120pAM("video_id") String str, @InterfaceC1501120pAM("play_source") int i);
}

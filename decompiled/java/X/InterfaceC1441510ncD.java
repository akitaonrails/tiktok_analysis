package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0ncD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1441510ncD {
    @InterfaceC1501240pAY("/aweme/v2/aweme/vframe/update/")
    @InterfaceC1485505rh
    C15O7<BaseResponse> LIZ(@InterfaceC1501100pAK("aweme_id") String str, @InterfaceC1501100pAK("video_id") String str2, @InterfaceC1501100pAK("vframe_uri") String str3, @InterfaceC1501100pAK("stickers") String str4, @InterfaceC1501100pAK("aweme_type") Integer num, @InterfaceC1501100pAK("vframe_type") Integer num2);

    @InterfaceC1501240pAY("/tiktok/v1/multi/vframe/update/")
    @InterfaceC1485505rh
    C15O7<BaseResponse> LIZIZ(@InterfaceC1501100pAK("vframe_requests") JSONArray jSONArray);
}

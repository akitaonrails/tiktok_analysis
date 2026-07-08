package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0ncI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1441560ncI {
    @InterfaceC1501240pAY("/aweme/v2/aweme/audiotrack/update/")
    @InterfaceC1485505rh
    C15O7<BaseResponse> LIZ(@InterfaceC1501100pAK("aweme_id") String str, @InterfaceC1501100pAK("audiotrack_uri") String str2);

    @InterfaceC1501240pAY("/tiktok/v1/multi/audiotrack/update/")
    @InterfaceC1485505rh
    C15O7<BaseResponse> LIZIZ(@InterfaceC1501100pAK("audio_requests") JSONArray jSONArray);
}

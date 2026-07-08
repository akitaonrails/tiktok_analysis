package X;

import com.ss.android.ugc.aweme.services.edit.MusicStripResultConfirmResponse;
import com.ss.android.ugc.aweme.services.edit.StripMusicResponse;

/* JADX INFO: renamed from: X.10Hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC19221110Hp {
    public static final C19221010Ho LIZ = C19221010Ho.LIZ;

    @InterfaceC1501240pAY("/tiktok/video/music/edit/v1/")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK("item_id") String str, @InterfaceC1501100pAK("original_vid") String str2, @InterfaceC1501100pAK("new_music_info") String str3, @InterfaceC1501100pAK("original_audio_track") String str4, @InterfaceC1501100pAK("multi_music_edit_info") String str5, @InterfaceC1501100pAK("music_edit_scene") Integer num, @InterfaceC1501100pAK("biz_extra") String str6, @InterfaceC1501100pAK("version") Integer num2, InterfaceC1364105Vn<? super StripMusicResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v1/creator/music/strip_result_confirm/")
    @InterfaceC1485505rh
    Object LIZIZ(@InterfaceC1501100pAK("item_id") long j, @InterfaceC1501100pAK("user_id") long j2, @InterfaceC1501100pAK("is_apply_strip_result") boolean z, @InterfaceC1501100pAK("edit_req_id") String str, InterfaceC1364105Vn<? super MusicStripResultConfirmResponse> interfaceC1364105Vn);
}

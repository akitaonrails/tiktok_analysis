package X;

import com.ss.android.ugc.aweme.music.model.FanSpotlightPickVideoResponse;
import com.ss.android.ugc.aweme.music.model.FanSpotlightPickedVideosResponse;
import com.ss.android.ugc.aweme.music.model.MusicBaseResponse;
import java.util.List;

/* JADX INFO: renamed from: X.0O9Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0O9Z {
    @InterfaceC1501240pAY("/tiktok/v1/user/pick/set/video/")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK("op_type") int i, @InterfaceC1501100pAK("aweme_ids") List<String> list, InterfaceC1364105Vn<? super MusicBaseResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/v1/user/pick/videos/")
    Object LIZIZ(@InterfaceC1501120pAM("sec_user_id") String str, InterfaceC1364105Vn<? super FanSpotlightPickedVideosResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/v1/user/pick/video/options/")
    Object LIZJ(@InterfaceC1501120pAM("video_type") int i, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i2, InterfaceC1364105Vn<? super FanSpotlightPickVideoResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/v1/user/pick/video/options/")
    C11NZ<FanSpotlightPickVideoResponse> LIZLLL(@InterfaceC1501120pAM("video_type") int i, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i2);
}

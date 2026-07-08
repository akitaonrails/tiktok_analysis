package X;

import com.ss.android.ugc.aweme.shortvideo.sticker.livecountdown.CountDownStickerDetailResponse;
import com.ss.android.ugc.aweme.shortvideo.sticker.livecountdown.CountDownStickerResponse;

/* JADX INFO: renamed from: X.11tH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public interface InterfaceC19643311tH {
    public static final C19643511tJ LIZ = C19643511tJ.LIZ;

    @InterfaceC1501200pAU("tiktok/v1/sticker/countdown/detail/")
    C11NZ<CountDownStickerDetailResponse> LIZ(@InterfaceC1501120pAM("item_id") String str);

    @InterfaceC1501240pAY("tiktok/v1/sticker/countdown/reminder/")
    @InterfaceC1485505rh
    C11NZ<CountDownStickerResponse> LIZIZ(@InterfaceC1501100pAK("item_id") String str, @InterfaceC1501100pAK("countdown_time") long j, @InterfaceC1501100pAK("action") int i);
}

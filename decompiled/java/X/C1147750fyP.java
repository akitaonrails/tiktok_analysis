package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.MusicGiftListResponse;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0fyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147750fyP {
    public static C1147330fxj LIZ(MusicGiftListResponse.Data.Tab tab) {
        boolean z;
        C1147410fxr c1147410fxr;
        long j = tab.tabId;
        String str = tab.tabName;
        ImageModel imageModel = tab.tabIcon;
        String str2 = tab.paginationToken;
        boolean z2 = tab.hasMore;
        if (j == 2) {
            z = true;
        } else {
            z = false;
        }
        List<MusicGiftListResponse.Data.Tab.MusicGift> list = tab.gifts;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (MusicGiftListResponse.Data.Tab.MusicGift musicGift : list) {
            long j2 = musicGift.giftId;
            long j3 = musicGift.giftPrice;
            String str3 = musicGift.songName;
            String str4 = musicGift.lyricsText;
            MusicGiftListResponse.Data.Tab.MusicGift.Artist artist = musicGift.artist;
            C1147070fxJ c1147070fxJ = null;
            if (artist != null) {
                c1147410fxr = new C1147410fxr(artist.userId, artist.name, artist.avatar);
            } else {
                c1147410fxr = null;
            }
            Gift.MusicGiftInfo.AudioResource audioResource = musicGift.audioResource;
            if (audioResource != null) {
                c1147070fxJ = new C1147070fxJ(audioResource.audioUrl, audioResource.lyricsUrl, audioResource.snippetId);
            }
            arrayList.add(new C1147350fxl(j2, j3, str3, str4, c1147410fxr, c1147070fxJ, musicGift.albumCover, musicGift.outerDisc, musicGift.coverImage, musicGift.pinned, musicGift.topLeftLabelIcon));
        }
        return new C1147330fxj(j, str, imageModel, str2, z2, z, arrayList);
    }
}

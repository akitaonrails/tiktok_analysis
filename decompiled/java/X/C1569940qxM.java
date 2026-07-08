package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlaybackVideoPreviewStreamData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.VideoPlayConfig;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data.ECLivePlaybackLiveRoomInfo;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data.ECLivePlaybackUserInfo;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data.ECLivePlaybackWatchLiveButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569940qxM implements InterfaceC0148002o {
    public final EnumC1569630qwr LL;
    public final ECLivePlaybackLiveRoomInfo LLILLJJLI;
    public final ECLivePlaybackUserInfo LLILLL;
    public final ECLivePlaybackWatchLiveButton LLILZ;
    public final PlaybackVideoPreviewStreamData LLILZIL;
    public final VideoPlayConfig LLILZLL;
    public final AbstractC1623806Xk<Integer> LLIZ;
    public final C1744020vU8 LLIZLLLIL;

    public C1569940qxM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1569940qxM)) {
            return false;
        }
        C1569940qxM c1569940qxM = (C1569940qxM) obj;
        return this.LL == c1569940qxM.LL && Intrinsics.LJFF(this.LLILLJJLI, c1569940qxM.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1569940qxM.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1569940qxM.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1569940qxM.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1569940qxM.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1569940qxM.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1569940qxM.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        ECLivePlaybackLiveRoomInfo eCLivePlaybackLiveRoomInfo = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (eCLivePlaybackLiveRoomInfo == null ? 0 : eCLivePlaybackLiveRoomInfo.hashCode())) * 31;
        ECLivePlaybackUserInfo eCLivePlaybackUserInfo = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (eCLivePlaybackUserInfo == null ? 0 : eCLivePlaybackUserInfo.hashCode())) * 31;
        ECLivePlaybackWatchLiveButton eCLivePlaybackWatchLiveButton = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (eCLivePlaybackWatchLiveButton == null ? 0 : eCLivePlaybackWatchLiveButton.hashCode())) * 31;
        PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (playbackVideoPreviewStreamData == null ? 0 : playbackVideoPreviewStreamData.hashCode())) * 31;
        VideoPlayConfig videoPlayConfig = this.LLILZLL;
        int iHashCode6 = (((iHashCode5 + (videoPlayConfig == null ? 0 : videoPlayConfig.hashCode())) * 31) + this.LLIZ.hashCode()) * 31;
        C1744020vU8 c1744020vU8 = this.LLIZLLLIL;
        return iHashCode6 + (c1744020vU8 != null ? c1744020vU8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECLivePlaybackState(pageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", roomInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", authorInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", watchLiveButton=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", videoInfo=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", playConfig=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", productCardVO=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1569940qxM(int i) {
        this(EnumC1569630qwr.INIT, null, null, null, null, null, C491101vh.LIZ, null);
    }

    public static C1569940qxM LIZ(C1569940qxM c1569940qxM, EnumC1569630qwr enumC1569630qwr, AbstractC1623806Xk abstractC1623806Xk, int i) {
        ECLivePlaybackLiveRoomInfo eCLivePlaybackLiveRoomInfo;
        ECLivePlaybackUserInfo eCLivePlaybackUserInfo;
        ECLivePlaybackWatchLiveButton eCLivePlaybackWatchLiveButton;
        PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData;
        VideoPlayConfig videoPlayConfig;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        EnumC1569630qwr enumC1569630qwr2 = enumC1569630qwr;
        if ((i & 1) != 0) {
            enumC1569630qwr2 = c1569940qxM.LL;
        }
        C1744020vU8 c1744020vU8 = null;
        if ((i & 2) != 0) {
            eCLivePlaybackLiveRoomInfo = c1569940qxM.LLILLJJLI;
        } else {
            eCLivePlaybackLiveRoomInfo = null;
        }
        if ((i & 4) != 0) {
            eCLivePlaybackUserInfo = c1569940qxM.LLILLL;
        } else {
            eCLivePlaybackUserInfo = null;
        }
        if ((i & 8) != 0) {
            eCLivePlaybackWatchLiveButton = c1569940qxM.LLILZ;
        } else {
            eCLivePlaybackWatchLiveButton = null;
        }
        if ((i & 16) != 0) {
            playbackVideoPreviewStreamData = c1569940qxM.LLILZIL;
        } else {
            playbackVideoPreviewStreamData = null;
        }
        if ((i & 32) != 0) {
            videoPlayConfig = c1569940qxM.LLILZLL;
        } else {
            videoPlayConfig = null;
        }
        if ((i & 64) != 0) {
            abstractC1623806Xk2 = c1569940qxM.LLIZ;
        }
        if ((i & 128) != 0) {
            c1744020vU8 = c1569940qxM.LLIZLLLIL;
        }
        c1569940qxM.getClass();
        return new C1569940qxM(enumC1569630qwr2, eCLivePlaybackLiveRoomInfo, eCLivePlaybackUserInfo, eCLivePlaybackWatchLiveButton, playbackVideoPreviewStreamData, videoPlayConfig, abstractC1623806Xk2, c1744020vU8);
    }

    public C1569940qxM(EnumC1569630qwr enumC1569630qwr, ECLivePlaybackLiveRoomInfo eCLivePlaybackLiveRoomInfo, ECLivePlaybackUserInfo eCLivePlaybackUserInfo, ECLivePlaybackWatchLiveButton eCLivePlaybackWatchLiveButton, PlaybackVideoPreviewStreamData playbackVideoPreviewStreamData, VideoPlayConfig videoPlayConfig, AbstractC1623806Xk<Integer> abstractC1623806Xk, C1744020vU8 c1744020vU8) {
        this.LL = enumC1569630qwr;
        this.LLILLJJLI = eCLivePlaybackLiveRoomInfo;
        this.LLILLL = eCLivePlaybackUserInfo;
        this.LLILZ = eCLivePlaybackWatchLiveButton;
        this.LLILZIL = playbackVideoPreviewStreamData;
        this.LLILZLL = videoPlayConfig;
        this.LLIZ = abstractC1623806Xk;
        this.LLIZLLLIL = c1744020vU8;
    }
}

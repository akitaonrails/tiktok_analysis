package X;

import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0lrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373990lrJ {
    public static final Map<ShareContentType, String> LIZ;
    public static final Map<Integer, ShareContentType> LIZIZ;

    static {
        ShareContentType shareContentType = ShareContentType.LINK;
        ShareContentType shareContentType2 = ShareContentType.VIDEO;
        ShareContentType shareContentType3 = ShareContentType.PHOTO;
        ShareContentType shareContentType4 = ShareContentType.PHOTOS;
        ShareContentType shareContentType5 = ShareContentType.LINK_PLUS_PHOTO;
        ShareContentType shareContentType6 = ShareContentType.LINK_PLUS_VIDEO;
        ShareContentType shareContentType7 = ShareContentType.LINK_PLUS_PHOTOS;
        LIZ = C2097608Jq.LJIIIIZZ(new Pair(shareContentType, "url_form"), new Pair(shareContentType2, "video_form"), new Pair(shareContentType3, "photo_form"), new Pair(shareContentType4, "photos_form"), new Pair(shareContentType5, "url_photo_form"), new Pair(shareContentType6, "url_video_form"), new Pair(shareContentType7, "url_photos_form"));
        ShareContentType shareContentType8 = ShareContentType.DISABLE_SHARE;
        ShareContentType shareContentType9 = ShareContentType.ILEGAL;
        LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(shareContentType.getNum()), shareContentType), new Pair(Integer.valueOf(shareContentType2.getNum()), shareContentType2), new Pair(Integer.valueOf(shareContentType3.getNum()), shareContentType3), new Pair(Integer.valueOf(shareContentType4.getNum()), shareContentType4), new Pair(Integer.valueOf(shareContentType5.getNum()), shareContentType5), new Pair(Integer.valueOf(shareContentType6.getNum()), shareContentType6), new Pair(Integer.valueOf(shareContentType7.getNum()), shareContentType7), new Pair(Integer.valueOf(shareContentType8.getNum()), shareContentType8), new Pair(Integer.valueOf(shareContentType9.getNum()), shareContentType9));
    }
}

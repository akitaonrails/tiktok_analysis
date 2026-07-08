package X;

import com.ss.android.ugc.aweme.im.common.model.SocialAvatarStickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0HtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455350HtN {
    public static final SocialAvatarStickerStruct LIZ(StickerItem stickerItem) {
        SocialAvatarStickerItem socialAvatarStickerItem;
        String str;
        List listSingletonList;
        List<String> list;
        List<String> list2;
        StickerBase stickerBase = stickerItem.stickerBase;
        List<String> list3 = null;
        if (stickerBase == null || (socialAvatarStickerItem = stickerItem.socialAvatarInfo) == null || (str = socialAvatarStickerItem.expression) == null || (listSingletonList = Collections.singletonList(str)) == null) {
            return null;
        }
        Long l = stickerBase.id;
        StickerImage stickerImage = stickerBase.thumbnail;
        if (stickerImage != null) {
            list = stickerImage.urlList;
        } else {
            list = null;
        }
        StickerImage stickerImage2 = stickerBase.image;
        if (stickerImage2 != null) {
            list2 = stickerImage2.urlList;
            list3 = stickerImage2.urlList;
        } else {
            list2 = null;
        }
        return new SocialAvatarStickerStruct(l, listSingletonList, list, list2, list3);
    }
}

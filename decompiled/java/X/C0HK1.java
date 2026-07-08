package X;

import com.ss.android.ugc.aweme.im.common.model.IMStickerSetMetaData;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.model.IMSATaskDetail;
import com.ss.android.ugc.aweme.model.IMSocialAvatarStatus;
import java.util.List;

/* JADX INFO: renamed from: X.0HK1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public interface C0HK1 extends IMSocialAvatarStatus {
    IMStickerSetMetaData getStickerSetMetadata();

    List<StickerItem> getStickers();

    IMSATaskDetail getTaskDetails();
}

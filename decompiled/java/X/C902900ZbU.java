package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: renamed from: X.0ZbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902900ZbU {
    public static boolean LIZ(SharePackage sharePackage) {
        if (!TextUtils.equals("aweme", sharePackage.itemType) && !TextUtils.equals("aweme_photo", sharePackage.itemType) && !TextUtils.equals("aweme_card", sharePackage.itemType) && !TextUtils.equals("video_card", sharePackage.itemType) && !TextUtils.equals("image_card", sharePackage.itemType) && !TextUtils.equals("picture_card", sharePackage.itemType) && !TextUtils.equals("dynamic_card", sharePackage.itemType) && !TextUtils.equals("repost", sharePackage.itemType) && !TextUtils.equals("story_highlight", sharePackage.itemType)) {
            return false;
        }
        return true;
    }
}

package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: renamed from: X.0hjB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215190hjB {
    public static final boolean LIZ(SharePackage sharePackage) {
        if (sharePackage == null) {
            return false;
        }
        return TextUtils.equals(sharePackage.extras.getString("is_friend_private"), "true");
    }
}

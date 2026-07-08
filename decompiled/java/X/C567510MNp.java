package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.vesdk.VESize;

/* JADX INFO: renamed from: X.0MNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567510MNp {
    public static final /* synthetic */ int LIZ = 0;

    public static VESize LIZ(Context context) {
        int screenWidth = ScreenUtils.getScreenWidth(context);
        if (screenWidth <= 0) {
            screenWidth = 720;
        }
        return new VESize(screenWidth, (int) ((screenWidth * 16.0f) / 9));
    }
}

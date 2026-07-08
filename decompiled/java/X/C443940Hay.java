package X;

import android.R;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443940Hay {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(C19EG c19eg) {
        Rect rect = new Rect();
        Window window = c19eg.getWindow();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        View viewQe = C786410Ut5.qe(window, R.id.content);
        if (viewQe != null) {
            int top = i - viewQe.getTop();
            if (top != 0 && top >= 0) {
                return top;
            }
            return C497820Jfg.LIZJ(c19eg);
        }
        return C497820Jfg.LIZJ(c19eg);
    }

    public static boolean LIZIZ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        Map<String, Object> postExtraMap;
        PhotoModeImageInfo photoModeImageInfo2;
        Map<String, Object> postExtraMap2;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (postExtraMap = photoModeImageInfo.getPostExtraMap()) != null && postExtraMap.containsKey("photo_progressive") && (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) != null && (postExtraMap2 = photoModeImageInfo2.getPostExtraMap()) != null && Intrinsics.LJFF(postExtraMap2.get("photo_progressive"), Boolean.TRUE)) {
            return true;
        }
        return false;
    }
}

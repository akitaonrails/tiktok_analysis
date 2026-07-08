package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ltk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375500ltk {
    public static final String LIZJ(String str) {
        if (str != null && !u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static final String LJ(String str) {
        if (str != null && str.length() != 0 && !a0.LJJIIZI(str, "timestamp=", false)) {
            C2089008Gi c2089008Gi = new C2089008Gi(str);
            c2089008Gi.LIZJ(System.currentTimeMillis() / 1000, "timestamp");
            return c2089008Gi.LJ();
        }
        return str;
    }

    public static final String LJFF(String str) {
        if (str != null && str.length() != 0 && C0XQ7.LJFF().isLogin()) {
            C2089008Gi c2089008Gi = new C2089008Gi(str);
            c2089008Gi.LIZLLL("user_id", C0XQ7.LJFF().getCurUserId());
            c2089008Gi.LIZLLL("sec_user_id", C0XQ7.LJFF().getCurSecUserId());
            return c2089008Gi.LJ();
        }
        return str;
    }

    public static final boolean LJI(Context context) {
        if (Build.VERSION.SDK_INT >= 33 || C838410Wul.LIZ(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public static final Activity LJII(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                return (Activity) contextWrapper.getBaseContext();
            }
        }
        return C2214201BlK.LJFF();
    }

    public static final String LIZ(String str, Map<String, String> map) {
        if (str != null && str.length() != 0) {
            C2089008Gi c2089008Gi = new C2089008Gi(str);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!a0.LJJIIZI(str, key, false)) {
                        c2089008Gi.LIZLLL(key, value);
                    }
                }
            }
            return c2089008Gi.LJ();
        }
        return str;
    }

    public static final String LIZIZ(Aweme aweme, String str) {
        List<PhotoModeImageUrlModel> imageList;
        if (str.length() != 0 && C621180OYa.LIZIZ.LJIILJJIL(aweme)) {
            C2089008Gi c2089008Gi = new C2089008Gi(str);
            c2089008Gi.LIZIZ(aweme.getAwemeType(), "aweme_type");
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                c2089008Gi.LIZIZ(imageList.size(), "pic_cnt");
            }
            return c2089008Gi.LJ();
        }
        return str;
    }

    public static final String LIZLLL(Aweme aweme, String str) {
        if (str.length() != 0 && C729510SjV.LJJ(aweme)) {
            C2089008Gi c2089008Gi = new C2089008Gi(str);
            c2089008Gi.LIZLLL("story_uid", AwemeExtKt.getAuthorUid(aweme));
            return c2089008Gi.LJ();
        }
        return str;
    }
}

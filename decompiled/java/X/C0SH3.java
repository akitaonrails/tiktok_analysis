package X;

import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonUIStruct;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0SH3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SH3 {
    public static final int LIZ(BannerCommonUIStruct bannerCommonUIStruct) {
        C0SH4[] c0sh4ArrValues = C0SH4.values();
        int length = c0sh4ArrValues.length;
        int i = 0;
        while (true) {
            String str = null;
            if (i < length) {
                C0SH4 c0sh4 = c0sh4ArrValues[i];
                String str2 = c0sh4.LL;
                if (bannerCommonUIStruct != null) {
                    str = bannerCommonUIStruct.iconName;
                }
                if (u.LJIJI(str2, str, true)) {
                    return c0sh4.LLILLJJLI;
                }
                i++;
            } else {
                return R.raw.icon_info_circle_fill;
            }
        }
    }
}

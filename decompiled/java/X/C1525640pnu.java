package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0pnu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525640pnu {
    public static boolean LIZ(String str, String str2) {
        if (TextUtils.equals(str, str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, CardStruct.IStatusCode.DEFAULT)) {
            if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, CardStruct.IStatusCode.DEFAULT)) {
                return true;
            }
            return false;
        }
        return false;
    }
}

package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0VPJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VPJ {
    public static String LIZ(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (str.length() == 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        sb.append(str);
        sb.append('_');
        sb.append(str2);
        sb.append('_');
        sb.append(str3);
        return sb.toString();
    }
}

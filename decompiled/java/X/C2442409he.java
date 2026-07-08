package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.09he, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2442409he {
    public static final C2442409he LIZ = new C2442409he();

    public static void LIZ(int i, String str, boolean z) {
        String str2;
        C08S3 c08s3 = C08S3.LIZ;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("scenario", String.valueOf(i));
        pairArr[1] = new Pair("url", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_hyperlink", str2);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c08s3.getClass();
        C08S3.LIZJ("IAB_loading_page_show", mapLJIIIIZZ);
    }

    public static void LIZIZ(int i, int i2, String str, String str2, boolean z) {
        String str3;
        C08S3 c08s3 = C08S3.LIZ;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("page_type", String.valueOf(i));
        pairArr[1] = new Pair("scenario", String.valueOf(i2));
        pairArr[2] = new Pair("url", str);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("is_hyperlink", str3);
        pairArr[4] = new Pair("action", str2);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c08s3.getClass();
        C08S3.LIZJ("IAB_page_click", mapLJIIIIZZ);
    }
}

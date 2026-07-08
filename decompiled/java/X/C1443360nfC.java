package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443360nfC {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        int iLIZIZ = LIZIZ(new AwS566S0100000_22(videoPublishEditModel, 1061), z);
        int iLIZIZ2 = LIZIZ(new AwS566S0100000_22(videoPublishEditModel, 1060), z);
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("business_tag", "Creator_tool");
        if (z) {
            str = "post_another_after_publish";
        } else {
            str = "post_another_after_draft";
        }
        int i = 1;
        pairArr[1] = new Pair("item_type", str);
        pairArr[2] = new Pair("is_remember_music", String.valueOf(iLIZIZ));
        pairArr[3] = new Pair("is_remember_effect", String.valueOf(iLIZIZ2));
        if (!z) {
            i = 2;
        }
        pairArr[4] = new Pair("post_again_popup_type", String.valueOf(i));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static int LIZIZ(Function0 function0, boolean z) {
        String str = (String) function0.invoke();
        C1442930neV.LIZ.getClass();
        boolean zLIZLLL = C1442930neV.LIZLLL(z);
        if (str != null) {
            if (str.length() != 0) {
                if (zLIZLLL) {
                    return 1;
                }
                if (str == null) {
                    return 2;
                }
            }
            if (str.length() != 0) {
                return 0;
            }
            return 2;
        }
        return 2;
    }
}

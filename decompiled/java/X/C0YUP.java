package X;

import com.bytedance.im.core.proto.MediaURLStruct;
import java.util.List;

/* JADX INFO: renamed from: X.0YUP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YUP {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(C0YC6 c0yc6) {
        List<String> list;
        String str;
        MediaURLStruct mediaURLStruct = c0yc6.mediaUrlStruct;
        if (mediaURLStruct == null || (list = mediaURLStruct.url_list) == null || list.isEmpty() || (str = (String) C13LP.LJJJLL(list)) == null || str.length() == 0) {
            return false;
        }
        return true;
    }
}

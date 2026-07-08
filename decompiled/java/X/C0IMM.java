package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0IMM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IMM {
    public static final String LIZ(String str, List<? extends PushStreamInfo.Quality> list) {
        if (a0.LJJJIL(str)) {
            return "";
        }
        if (list != null && !list.isEmpty()) {
            for (PushStreamInfo.Quality quality : list) {
                if (Intrinsics.LJFF(quality.sdkKey, str)) {
                    return quality.name;
                }
            }
            String str2 = (String) ((LinkedHashMap) C0IMN.LJ).get(str);
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        String str3 = (String) ((LinkedHashMap) C0IMN.LJ).get(str);
        if (str3 == null) {
            return "";
        }
        return str3;
    }
}

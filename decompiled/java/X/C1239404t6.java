package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tako.ITakoService;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.04t6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1239404t6 {
    public static final C1239404t6 LIZ = new C1239404t6();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1359));

    public static String LIZ() {
        C1166904hP c1166904hPLJLL;
        String str;
        ArrayList arrayList = new ArrayList();
        ITakoService iTakoService = (ITakoService) PluggableExtentionKt.pluggableSpi$default(ITakoService.class, false, false, false, 14, null);
        if (iTakoService != null && (c1166904hPLJLL = iTakoService.LJLL()) != null && (str = c1166904hPLJLL.LIZ) != null && str.length() > 0) {
            LIZ.getClass();
            arrayList.add(C2097608Jq.LJIIIIZZ(new Pair("key", "tako_sub_conv_id"), new Pair("value", str)));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return GsonProtectorUtils.toJson((Gson) LIZIZ.getValue(), arrayList);
    }
}

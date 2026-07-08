package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.channel.share.model.IWrapChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0lxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378040lxq {
    public static final C1378040lxq LIZ = new C1378040lxq();
    public static final Map<String, IWrapChannel> LIZIZ = new LinkedHashMap();

    static {
        List<IWrapChannel> listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, IWrapChannel.class, false);
        if (listLIZIZ == null) {
            listLIZIZ = new ArrayList();
        }
        for (IWrapChannel iWrapChannel : listLIZIZ) {
            LIZIZ.put(iWrapChannel.LJJJJJL(), iWrapChannel);
        }
    }

    public static IWrapChannel LIZ(String str) {
        return (IWrapChannel) ((LinkedHashMap) LIZIZ).get(str);
    }
}

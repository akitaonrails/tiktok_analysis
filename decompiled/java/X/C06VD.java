package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.06VD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06VD {
    public static final C06VD LIZ = new C06VD();
    public static final Map<String, PureLogicChannel> LIZIZ = new LinkedHashMap();

    static {
        List<PureLogicChannel> listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, PureLogicChannel.class, false);
        if (listLIZIZ == null) {
            listLIZIZ = new ArrayList();
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        for (PureLogicChannel pureLogicChannel : listLIZIZ) {
            arrayList.add(LIZIZ.put(pureLogicChannel.key(), pureLogicChannel));
        }
    }
}

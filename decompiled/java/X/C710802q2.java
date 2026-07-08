package X;

import com.ss.android.ugc.aweme.feed.model.RealtimeComponentConfig;
import com.ss.android.ugc.aweme.feed.model.RealtimeFcpConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.02q2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C710802q2 extends C09AY implements Function1<C700640Re2, C700640Re2> {
    public C710802q2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C700640Re2 invoke(C700640Re2 c700640Re2) {
        Collection collection;
        List list;
        RealtimeComponentConfig realtimeComponentConfigCopy;
        C700640Re2 c700640Re22 = c700640Re2;
        RealtimeComponentConfig realtimeComponentConfig = c700640Re22.LJFF.realtimeComponentConfig;
        if (realtimeComponentConfig == null || (collection = realtimeComponentConfig.rerankedComponents) == null) {
            collection = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(collection);
        RealtimeComponentConfig realtimeComponentConfig2 = c700640Re22.LJFF.realtimeComponentConfig;
        if (realtimeComponentConfig2 == null || (list = realtimeComponentConfig2.disableComponents) == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.remove(it2.next());
        }
        RealtimeFcpConfig realtimeFcpConfig = c700640Re22.LJFF;
        RealtimeComponentConfig realtimeComponentConfig3 = realtimeFcpConfig.realtimeComponentConfig;
        if (realtimeComponentConfig3 != null) {
            realtimeComponentConfigCopy = realtimeComponentConfig3.copy(realtimeComponentConfig3.globalShowLimit, realtimeComponentConfig3.disableComponents, arrayList, realtimeComponentConfig3.componentDataList, realtimeComponentConfig3.finalFilterComponents, realtimeComponentConfig3.serverTrackExtra, realtimeComponentConfig3.componentPreloadConfig, realtimeComponentConfig3.slotStrategy);
        } else {
            realtimeComponentConfigCopy = null;
        }
        return C700640Re2.LIZ(c700640Re22, null, realtimeFcpConfig.copy(realtimeComponentConfigCopy), null, null, 223);
    }
}

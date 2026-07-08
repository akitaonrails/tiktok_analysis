package X;

import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gI8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159980gI8 extends C09AY implements Function0<ConcurrentHashMap<EntranceKey, NoticeGroupAttrs>> {
    public C1159980gI8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ConcurrentHashMap<EntranceKey, NoticeGroupAttrs> invoke() {
        ConcurrentHashMap<EntranceKey, NoticeGroupAttrs> concurrentHashMap = new ConcurrentHashMap<>();
        for (Map.Entry<EntranceKey, NoticeGroupAttrs> entry : C1904220zeW.LLIZLLLIL.entrySet()) {
            concurrentHashMap.put(entry.getKey(), NoticeGroupAttrs.LIZ(entry.getValue()));
        }
        return concurrentHashMap;
    }
}

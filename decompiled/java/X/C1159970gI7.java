package X;

import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gI7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159970gI7 extends C09AY implements Function0<ConcurrentHashMap<Integer, NoticeGroupAttrs>> {
    public C1159970gI7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ConcurrentHashMap<Integer, NoticeGroupAttrs> invoke() {
        ConcurrentHashMap<Integer, NoticeGroupAttrs> concurrentHashMap = new ConcurrentHashMap<>();
        for (Map.Entry<Integer, NoticeGroupAttrs> entry : C1904220zeW.LLIZ.entrySet()) {
            concurrentHashMap.put(Integer.valueOf(entry.getKey().intValue()), NoticeGroupAttrs.LIZ(entry.getValue()));
        }
        return concurrentHashMap;
    }
}

package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ros, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707360Ros {
    public final Map<String, NextLiveData<Object>> LIZ = new HashMap();

    public final synchronized NextLiveData LIZ(String str) {
        if (!((HashMap) this.LIZ).containsKey(str)) {
            ((HashMap) this.LIZ).put(str, new NextLiveData());
        }
        return (NextLiveData) ((HashMap) this.LIZ).get(str);
    }

    public final NextLiveData<Object> LIZIZ(String str) {
        return LIZ(str);
    }
}

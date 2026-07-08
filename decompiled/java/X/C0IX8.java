package X;

import com.bytedance.android.live.network.combine.exp.LiveCombineApiReqeustSubBizSimpleLogData;
import com.bytedance.android.live.network.combine.exp.LiveCombineApiRequestSubBizLogData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0IX8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IX8 {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public int LJ;
    public Map<String, LiveCombineApiReqeustSubBizSimpleLogData> LJFF;
    public final ConcurrentHashMap<String, LiveCombineApiRequestSubBizLogData> LJI;

    public C0IX8() {
        this(null);
    }

    public C0IX8(Object obj) {
        ConcurrentHashMap<String, LiveCombineApiRequestSubBizLogData> concurrentHashMap = new ConcurrentHashMap<>();
        this.LIZ = -1L;
        this.LIZIZ = -1L;
        this.LIZJ = -1;
        this.LIZLLL = -1L;
        this.LJ = 0;
        this.LJFF = null;
        this.LJI = concurrentHashMap;
    }
}

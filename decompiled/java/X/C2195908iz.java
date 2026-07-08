package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2195908iz {
    public static final ConcurrentHashMap<String, Aweme> LIZIZ = new ConcurrentHashMap<>();
    public final String LIZ;

    public final Object LIZ() {
        Object obj;
        Aweme aweme;
        Object obj2;
        Aweme aweme2 = LIZIZ.get(this.LIZ);
        if (aweme2 != null) {
            C189200o6.m2constructorimpl(aweme2);
            obj2 = aweme2;
        } else {
            String str = this.LIZ;
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("aid is empty!");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(str);
            sbLIZ.append(']');
            BatchDetailList batchDetailListLIZ = C23053091n.LIZ(0, C2188811AlT.LIZIZ(sbLIZ), null, null, null);
            List<Aweme> list = batchDetailListLIZ.items;
            if (list == null || (aweme = (Aweme) C13LP.LJJJJZI(list)) == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("response can't find target aweme(");
                sbLIZ2.append(str);
                sbLIZ2.append(")! logId: ");
                sbLIZ2.append(batchDetailListLIZ.requestId);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
            LogPbBean logPbBean = batchDetailListLIZ.logPbBean;
            aweme.setRequestId(logPbBean != null ? logPbBean.getImprId() : null);
            C189200o6.m2constructorimpl(aweme);
            obj = aweme;
            boolean zM8isSuccessimpl = C189200o6.m8isSuccessimpl(obj);
            obj2 = obj;
            if (zM8isSuccessimpl) {
                LIZIZ.put(this.LIZ, (Aweme) obj);
                return obj;
            }
        }
        return obj2;
    }

    public C2195908iz(String str) {
        this.LIZ = str;
    }
}

package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0WWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824680WWs {
    public static final AbstractC2252651DEx LIZ(AbstractC796540VMm abstractC796540VMm) {
        Map<String, Object> map = abstractC796540VMm.mBackingFieldMap;
        Object objLIZIZ = map.get("QueryDispatcher");
        if (objLIZIZ == null) {
            objLIZIZ = C2182901Abw.LIZIZ(abstractC796540VMm.mQueryExecutor);
            map.put("QueryDispatcher", objLIZIZ);
        }
        return (AbstractC2252651DEx) objLIZIZ;
    }

    public static final AbstractC2252651DEx LIZIZ(AbstractC796540VMm abstractC796540VMm) {
        Map<String, Object> map = abstractC796540VMm.mBackingFieldMap;
        Object objLIZIZ = map.get("TransactionDispatcher");
        if (objLIZIZ == null) {
            objLIZIZ = C2182901Abw.LIZIZ(abstractC796540VMm.mTransactionExecutor);
            map.put("TransactionDispatcher", objLIZIZ);
        }
        return (AbstractC2252651DEx) objLIZIZ;
    }
}

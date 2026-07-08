package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MaterialCollectionInfo;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.03cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C882303cb {
    public static final MaterialCollectionInfo LIZ(String str) {
        if (str != null) {
            try {
                Type type = new TypeToken<ArrayList<MaterialCollectionInfo>>() { // from class: X.03cc
                }.getType();
                C1227904rF.LIZ.getClass();
                return (MaterialCollectionInfo) C13LP.LJJJLL((ArrayList) C1227904rF.LIZJ(str, type));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }
}

package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0dey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1058820dey implements InterfaceC1058830dez {
    public static List LIZIZ() {
        List<String> listLJJJJZ;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        return (iSparkHostApi == null || (listLJJJJZ = iSparkHostApi.LJJJJZ()) == null) ? C13BV.INSTANCE : listLJJJJZ;
    }

    public static List LIZJ() {
        String strLJLJLJ;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(iSparkHostApi.LLII(Collections.singletonList("host")));
        if (C2213981Bky.LIZIZ.isDebug() && (strLJLJLJ = iSparkHostApi.LJLJLJ()) != null && (!TextUtils.isEmpty(strLJLJLJ))) {
            arrayList.add(strLJLJLJ);
        }
        return arrayList;
    }
}

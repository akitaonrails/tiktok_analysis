package X;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Q0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC663390Q0j implements Serializable {
    public final HashMap<String, String> LL = new HashMap<>();

    public abstract HashMap<String, String> buildParams();

    public void installToMetrics(AbstractC1386130mAt abstractC1386130mAt) {
        HashMap<String, String> mapBuildParams = buildParams();
        if (abstractC1386130mAt != null) {
            abstractC1386130mAt.LIZIZ(mapBuildParams);
        }
    }

    public final void appendParam(String str, String str2, InterfaceC1210900hcG interfaceC1210900hcG) {
        this.LL.put(str, interfaceC1210900hcG.LIZ(str2));
    }
}

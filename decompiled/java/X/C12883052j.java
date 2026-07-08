package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.052j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12883052j {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C12884052k());

    public static Keva LIZ(C12918053s c12918053s) {
        C01GW c01gw = LIZ;
        Keva keva = (Keva) ((ConcurrentHashMap) c01gw.getValue()).get(LIZIZ(c12918053s));
        if (keva == null) {
            Keva repo = KevaImpl.getRepo(LIZIZ(c12918053s), 0);
            ((ConcurrentHashMap) c01gw.getValue()).put(LIZIZ(c12918053s), repo);
            return repo;
        }
        return keva;
    }

    public static String LIZIZ(C12918053s c12918053s) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("frequency_scope_to_repo_name_");
        sbLIZ.append(c12918053s.LIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

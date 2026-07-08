package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059360dfq {
    public static final C1059360dfq LIZ = new C1059360dfq();

    public static final Map LIZ(String str) {
        Object[] objArr;
        boolean zLJFF = Intrinsics.LJFF(EnumC1062390dkj.PUBLIC.toString(), str);
        List listLJJLL = null;
        if (zLJFF) {
            SettingsManager.LIZLLL().getClass();
            Object objLJII = SettingsManager.LJII("aweme_appinfo_safehost_fields", String[].class);
            if ((objLJII instanceof String[]) && (objArr = (Object[]) objLJII) != null) {
                listLJJLL = C13LQ.LJJLL(objArr);
            }
        }
        return C1059370dfr.LIZ(listLJJLL);
    }
}

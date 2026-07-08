package X;

import com.bytedance.keva.Keva;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0m6I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383280m6I {
    public static final C1383280m6I LIZ = new C1383280m6I();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(438));
    public static final Type LIZJ = new TypeToken<Map<String, ? extends Boolean>>() { // from class: X.0m6K
    }.getType();

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static String LIZIZ(String str) {
        String currentUserID;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
            currentUserID = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(currentUserID);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

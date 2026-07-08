package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0gbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171870gbJ {
    public static final C1171870gbJ LIZ = new C1171870gbJ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(134));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(135));

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("collaborative_enable_");
        IUserService iUserService = (IUserService) LIZJ.getValue();
        sbLIZ.append(iUserService != null ? iUserService.getCurrentUserID() : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

package X;

import Y.AObjectS378S0100000_2;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.kmp.nuj.INUJEventHandlerService;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.057p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13019057p {
    public static final C13019057p LIZ = new C13019057p();

    public static List LIZ() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(INUJEventHandlerService.class);
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(C09R7.LIZ(c19719912DlLIZ), false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            return Collections.singletonList(new C13020057q(Collections.singletonList(C13LE.LIZ(C19280910bv.class)), new AObjectS378S0100000_2((INUJEventHandlerService) objPluggableSpi$default, 4)));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Service '");
        sbLIZ.append(c19719912DlLIZ.LJI());
        sbLIZ.append("' not registered. Ensure @ServiceImpl is annotated.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}

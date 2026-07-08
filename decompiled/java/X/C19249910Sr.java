package X;

import com.ss.android.ugc.aweme.event.NUJMobHelperImpl;
import com.ss.android.ugc.aweme.journey.INUJMobHelper;
import java.util.HashMap;

/* JADX INFO: renamed from: X.10Sr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19249910Sr implements INUJMobHelper {
    public static final C19249910Sr LIZIZ = new C19249910Sr();
    public final /* synthetic */ INUJMobHelper LIZ;

    @Override // com.ss.android.ugc.aweme.journey.INUJMobHelper
    public final void LIZ(String str, HashMap<String, String> map) {
        this.LIZ.LIZ(str, map);
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJMobHelper
    public final void LIZIZ(C2344009Gk c2344009Gk, String str) {
        this.LIZ.LIZIZ(c2344009Gk, str);
    }

    @Override // com.ss.android.ugc.aweme.journey.INUJMobHelper
    public final void LIZJ(C2344009Gk c2344009Gk) {
        this.LIZ.LIZJ(c2344009Gk);
    }

    public C19249910Sr() {
        INUJMobHelper iNUJMobHelper;
        Object objLIZ = C04TD.LIZ(INUJMobHelper.class, false);
        if (objLIZ != null) {
            iNUJMobHelper = (INUJMobHelper) objLIZ;
        } else {
            if (C04TD.j0 == null) {
                synchronized (INUJMobHelper.class) {
                    if (C04TD.j0 == null) {
                        C04TD.j0 = new NUJMobHelperImpl();
                    }
                }
            }
            iNUJMobHelper = C04TD.j0;
        }
        this.LIZ = iNUJMobHelper;
    }
}

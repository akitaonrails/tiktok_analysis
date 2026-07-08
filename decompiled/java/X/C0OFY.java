package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.enter.IEnterProfileService;
import com.ss.android.ugc.profile.business.ur.utils.EnterProfileServiceImpl;
import java.util.Map;

/* JADX INFO: renamed from: X.0OFY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OFY implements C0OFZ {
    public static final IEnterProfileService LIZIZ;
    public final /* synthetic */ C0OFZ LIZ;

    @Override // X.C0OFZ
    public final C0OFZ LIZ(Map<String, ? extends Object> map) {
        return this.LIZ.LIZ(map);
    }

    @Override // X.C0OFZ
    public final void LIZIZ(int i, View view) {
        this.LIZ.LIZIZ(i, view);
    }

    @Override // X.C0OFZ
    public final C0OFZ LIZJ(Map<String, ? extends Object> map) {
        return this.LIZ.LIZJ(map);
    }

    static {
        IEnterProfileService iEnterProfileService;
        Object objLIZ = C04TD.LIZ(IEnterProfileService.class, false);
        if (objLIZ != null) {
            iEnterProfileService = (IEnterProfileService) objLIZ;
        } else {
            if (C04TD.O6 == null) {
                synchronized (IEnterProfileService.class) {
                    if (C04TD.O6 == null) {
                        C04TD.O6 = new EnterProfileServiceImpl();
                    }
                }
            }
            iEnterProfileService = C04TD.O6;
        }
        LIZIZ = iEnterProfileService;
    }

    public C0OFY(Context context, String str, String str2, String str3, String str4, String str5) {
        this.LIZ = LIZIZ.LIZ(context, str, str2, str3, str4, str5);
    }

    public /* synthetic */ C0OFY(Context context, String str, String str2, String str3, String str4, int i) {
        this(context, str, (String) null, str2, str3, (i & 32) != 0 ? null : str4);
    }
}

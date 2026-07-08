package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.ies.foundation.activity.BaseActivity;

/* JADX INFO: renamed from: X.19Cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21500419Cg extends C19D2 {
    public static boolean LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19D2, X.C19DE, X.InterfaceC21503119Dh
    public final void LJJIIZI(BaseActivity baseActivity, Bundle bundle) {
        super.LJJIIZI(baseActivity, bundle);
        if (!C294780Bgy.LIZ() ? !(!(baseActivity instanceof InterfaceC214897198d) || !((InterfaceC214897198d) baseActivity).getEnableSAF()) : (baseActivity instanceof InterfaceC214897198d)) {
            if (((InterfaceC214897198d) baseActivity).migrateDarkModeImplToFragment()) {
                return;
            }
        }
        C755440TkE.LIZ(baseActivity);
    }

    @Override // X.C19DE, X.InterfaceC21503119Dh
    public final void LJJJJ(BaseActivity baseActivity, Bundle bundle) {
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(baseActivity, 0, "sp_dark_mode");
        if (!LLILLL) {
            C19GT.LJJIII(sharedPreferencesLIZJ.getInt("dark_mode", 1));
            LLILLL = true;
        }
    }
}

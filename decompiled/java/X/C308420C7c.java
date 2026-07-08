package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.google.gson.n;
import com.ss.android.ugc.aweme.SettingsMainApiImpl;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi;
import java.util.List;

/* JADX INFO: renamed from: X.0C7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308420C7c implements ISettingsMainApi {
    public static final C308420C7c LIZIZ = new C308420C7c();
    public final /* synthetic */ ISettingsMainApi LIZ;

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZ(Context context) {
        this.LIZ.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZIZ(n nVar) {
        this.LIZ.LIZIZ(nVar);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZJ(Activity activity, Fragment fragment) {
        this.LIZ.LIZJ(activity, fragment);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final C310720CFy LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final C310720CFy LJ(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy) {
        return this.LIZ.LJ(editor, iESSettingsProxy);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LJFF(C0CG1 c0cg1) {
        this.LIZ.LJFF(c0cg1);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final List<C10FJ> LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final boolean shouldUseRecyclerPartialUpdate() {
        return this.LIZ.shouldUseRecyclerPartialUpdate();
    }

    public C308420C7c() {
        ISettingsMainApi iSettingsMainApi;
        Object objLIZ = C04TD.LIZ(ISettingsMainApi.class, false);
        if (objLIZ != null) {
            iSettingsMainApi = (ISettingsMainApi) objLIZ;
        } else {
            if (C04TD.LJJZ == null) {
                synchronized (ISettingsMainApi.class) {
                    if (C04TD.LJJZ == null) {
                        C04TD.LJJZ = new SettingsMainApiImpl();
                    }
                }
            }
            iSettingsMainApi = C04TD.LJJZ;
        }
        this.LIZ = iSettingsMainApi;
    }
}

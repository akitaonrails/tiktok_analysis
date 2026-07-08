package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService;

/* JADX INFO: renamed from: X.0Qah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673090Qah implements ISearchPluginService {
    public static final C673090Qah LIZIZ = new C673090Qah();
    public final /* synthetic */ ISearchPluginService LIZ = (ISearchPluginService) ServiceManager.get().getService(ISearchPluginService.class, false, false);

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final void LIZJ(Boolean bool, String str, String str2) {
        this.LIZ.LIZJ(bool, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final void LJ() {
        this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final boolean LJFF(Fragment fragment, String str, boolean z) {
        return this.LIZ.LJFF(fragment, str, z);
    }

    @Override // com.ss.android.ugc.aweme.search.df.api.core.plugin.ISearchPluginService
    public final boolean checkPluginInstalled(String str) {
        return this.LIZ.checkPluginInstalled(str);
    }
}

package X;

import Y.ARunnableS108S0100000_8;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.nletemplate.AutomationResult;
import com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0KvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533090KvT implements INLETemplateOfflineService {
    public static final C533090KvT LIZIZ = new C533090KvT();
    public final /* synthetic */ INLETemplateOfflineService LIZ = (INLETemplateOfflineService) ServiceManager.get().getService(INLETemplateOfflineService.class);

    @Override // X.InterfaceC533110KvV
    public final void LIZ(C0L9D c0l9d, AutomationResult automationResult) {
        this.LIZ.LIZ(c0l9d, automationResult);
    }

    @Override // com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService
    public final Pair<String, String> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC533110KvV
    public final void LIZJ(AutomationResult automationResult) {
        this.LIZ.LIZJ(automationResult);
    }

    @Override // com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService
    public final void LIZLLL(String str, LifecycleOwner lifecycleOwner, Runnable runnable) {
        this.LIZ.LIZLLL(str, lifecycleOwner, runnable);
    }

    @Override // com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService
    public final void LJ(Activity activity, List list, AwS552S0100000_8 awS552S0100000_8, ARunnableS108S0100000_8 aRunnableS108S0100000_8, ARunnableS108S0100000_8 aRunnableS108S0100000_82, AwS587S0100000_8 awS587S0100000_8, ARunnableS108S0100000_8 aRunnableS108S0100000_83) {
        this.LIZ.LJ(activity, list, awS552S0100000_8, aRunnableS108S0100000_8, aRunnableS108S0100000_82, awS587S0100000_8, aRunnableS108S0100000_83);
    }

    @Override // com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService
    public final boolean LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // X.InterfaceC533110KvV
    public final void LJI(String str, String str2) {
        this.LIZ.LJI(str, str2);
    }
}

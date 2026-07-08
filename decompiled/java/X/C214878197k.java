package X;

import android.content.Context;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.CollabServiceImpl;
import com.ss.android.ugc.aweme.service.ICollabEventTrackingService;
import com.ss.android.ugc.aweme.service.ICollabService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.197k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214878197k implements ICollabService {
    public static final C214878197k LIZIZ = new C214878197k();
    public final /* synthetic */ ICollabService LIZ;

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LIZJ(C19EG c19eg, C21524119Lj c21524119Lj) {
        this.LIZ.LIZJ(c19eg, c21524119Lj);
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final long LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LJ() {
        this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final boolean LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final long LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final ICollabEventTrackingService LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LJIIIIZZ(ReusedUIAssem reusedUIAssem, int i, int i2) {
        this.LIZ.LJIIIIZZ(reusedUIAssem, i, i2);
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final LiveData LJIIIZ(LifecycleRegistry lifecycleRegistry) {
        return this.LIZ.LJIIIZ(lifecycleRegistry);
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LJIIJ(String str, C19EG c19eg, Aweme aweme, String str2, Function0<Unit> function0, String str3) {
        this.LIZ.LJIIJ(str, c19eg, aweme, str2, function0, str3);
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LJIIJJI(C19EG c19eg, Aweme aweme, boolean z) {
        this.LIZ.LJIIJJI(c19eg, aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LJIIL(Context context, String str, List<? extends User> list, OnActivityResultCallback onActivityResultCallback) {
        this.LIZ.LJIIL(context, str, list, onActivityResultCallback);
    }

    public C214878197k() {
        ICollabService iCollabService;
        Object objLIZ = C04TD.LIZ(ICollabService.class, false);
        if (objLIZ != null) {
            iCollabService = (ICollabService) objLIZ;
        } else {
            if (C04TD.Y3 == null) {
                synchronized (ICollabService.class) {
                    if (C04TD.Y3 == null) {
                        C04TD.Y3 = new CollabServiceImpl();
                    }
                }
            }
            iCollabService = C04TD.Y3;
        }
        this.LIZ = iCollabService;
    }
}

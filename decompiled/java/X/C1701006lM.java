package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;

/* JADX INFO: renamed from: X.06lM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1701006lM implements IIMCameraEntranceService {
    public static final C1701006lM LIZIZ = new C1701006lM();
    public final /* synthetic */ IIMCameraEntranceService LIZ;

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final boolean LIZLLL(int i, IMUser iMUser, String str) {
        return this.LIZ.LIZLLL(i, iMUser, str);
    }

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final IMMessageListProtocol<?> LJ(Fragment fragment) {
        return this.LIZ.LJ(fragment);
    }

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final IMMessageListProtocol<?> LJFF(Fragment fragment) {
        return this.LIZ.LJFF(fragment);
    }

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final boolean LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final boolean LJII(int i, String str, boolean z) {
        return this.LIZ.LJII(i, str, z);
    }

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final boolean LJIIIIZZ(String str, int i, IMUser iMUser, boolean z) {
        return this.LIZ.LJIIIIZZ(str, i, iMUser, z);
    }

    @Override // com.ss.android.ugc.aweme.im.camera.entrance.IIMCameraEntranceService
    public final boolean LJIIIZ(boolean z) {
        return this.LIZ.LJIIIZ(z);
    }

    public C1701006lM() {
        IIMCameraEntranceService iIMCameraEntranceService = (IIMCameraEntranceService) PluggableExtentionKt.pluggableSpi$default(IIMCameraEntranceService.class, false, false, false, 14, null);
        if (iIMCameraEntranceService != null) {
            this.LIZ = iIMCameraEntranceService;
        } else {
            "CameraEntranceService not found".toString();
            throw new IllegalStateException("CameraEntranceService not found");
        }
    }
}

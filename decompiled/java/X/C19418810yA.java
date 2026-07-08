package X;

import android.content.Context;
import com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService;
import com.ss.android.ugc.aweme.audiomode.vopclone.service.VopCloneServiceImpl;

/* JADX INFO: renamed from: X.10yA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19418810yA implements IVopCloneService {
    public static final C19418810yA LIZIZ = new C19418810yA();
    public final /* synthetic */ IVopCloneService LIZ;

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopCloneService
    public final void LIZ(Context context, String str) {
        this.LIZ.LIZ(context, str);
    }

    public C19418810yA() {
        IVopCloneService iVopCloneService;
        Object objLIZ = C04TD.LIZ(IVopCloneService.class, false);
        if (objLIZ != null) {
            iVopCloneService = (IVopCloneService) objLIZ;
        } else {
            if (C04TD.LLIIIZ == null) {
                synchronized (IVopCloneService.class) {
                    if (C04TD.LLIIIZ == null) {
                        C04TD.LLIIIZ = new VopCloneServiceImpl();
                    }
                }
            }
            iVopCloneService = C04TD.LLIIIZ;
        }
        this.LIZ = iVopCloneService;
    }
}

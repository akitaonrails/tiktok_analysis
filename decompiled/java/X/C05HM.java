package X;

import android.content.Context;
import com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService;
import com.ss.android.ugc.aweme.audiomode.vopclone.service.VopInstantCloneServiceImpl;

/* JADX INFO: renamed from: X.05HM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05HM implements IVopInstantCloneService {
    public static final C05HM LIZIZ = new C05HM();
    public final /* synthetic */ IVopInstantCloneService LIZ;

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJIJIIJIL() {
        return this.LIZ.LJJIJIIJIL();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJIJIL() {
        return this.LIZ.LJJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJIJL() {
        return this.LIZ.LJJIJL();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final void LJJIJLIJ(Context context, String str) {
        this.LIZ.LJJIJLIJ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJIL() {
        return this.LIZ.LJJIL();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final String LJJIZ() {
        return this.LIZ.LJJIZ();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJJ() {
        return this.LIZ.LJJJ();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJJI() {
        return this.LIZ.LJJJI();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int LJJJIL() {
        return this.LIZ.LJJJIL();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final String LJJJJ() {
        return this.LIZ.LJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int getCurrentState() {
        return this.LIZ.getCurrentState();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final C05HK getSpeakerInfo() {
        return this.LIZ.getSpeakerInfo();
    }

    @Override // com.ss.android.ugc.aweme.audiomode.vopclone.service.IVopInstantCloneService
    public final int init(String str) {
        return this.LIZ.init(str);
    }

    public C05HM() {
        IVopInstantCloneService iVopInstantCloneService;
        Object objLIZ = C04TD.LIZ(IVopInstantCloneService.class, false);
        if (objLIZ != null) {
            iVopInstantCloneService = (IVopInstantCloneService) objLIZ;
        } else {
            if (C04TD.LLIIJI == null) {
                synchronized (IVopInstantCloneService.class) {
                    if (C04TD.LLIIJI == null) {
                        C04TD.LLIIJI = new VopInstantCloneServiceImpl();
                    }
                }
            }
            iVopInstantCloneService = C04TD.LLIIJI;
        }
        this.LIZ = iVopInstantCloneService;
    }
}

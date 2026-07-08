package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.creatorcenter.IStudioAppPromoteService;
import com.ss.android.ugc.aweme.creatorcenter.StudioAppPromoteServiceImpl;

/* JADX INFO: renamed from: X.0ik8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254220ik8 implements IStudioAppPromoteService {
    public static final C1254220ik8 LIZIZ = new C1254220ik8();
    public final /* synthetic */ IStudioAppPromoteService LIZ;

    @Override // com.ss.android.ugc.aweme.creatorcenter.IStudioAppPromoteService
    public final void LIZ(Context context) {
        this.LIZ.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.creatorcenter.IStudioAppPromoteService
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.creatorcenter.IStudioAppPromoteService
    public final void LIZJ(ViewGroup viewGroup, C0TGX c0tgx) {
        this.LIZ.LIZJ(viewGroup, c0tgx);
    }

    public C1254220ik8() {
        IStudioAppPromoteService iStudioAppPromoteService;
        Object objLIZ = C04TD.LIZ(IStudioAppPromoteService.class, false);
        if (objLIZ != null) {
            iStudioAppPromoteService = (IStudioAppPromoteService) objLIZ;
        } else {
            if (C04TD.LLLLLZIL == null) {
                synchronized (IStudioAppPromoteService.class) {
                    if (C04TD.LLLLLZIL == null) {
                        C04TD.LLLLLZIL = new StudioAppPromoteServiceImpl();
                    }
                }
            }
            iStudioAppPromoteService = C04TD.LLLLLZIL;
        }
        this.LIZ = iStudioAppPromoteService;
    }
}

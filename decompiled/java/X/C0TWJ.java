package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IWebCreationPromoteService;
import com.ss.android.ugc.aweme.web.creation.WebCreationPromoteServiceImpl;

/* JADX INFO: renamed from: X.0TWJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TWJ implements IWebCreationPromoteService {
    public static final C0TWJ LIZIZ = new C0TWJ();
    public final /* synthetic */ IWebCreationPromoteService LIZ;

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final void LIZ(ViewGroup viewGroup, C0TGX c0tgx) {
        this.LIZ.LIZ(viewGroup, c0tgx);
    }

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final void LIZIZ(Context context) {
        this.LIZ.LIZIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.IWebCreationPromoteService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    public C0TWJ() {
        IWebCreationPromoteService iWebCreationPromoteService;
        Object objLIZ = C04TD.LIZ(IWebCreationPromoteService.class, false);
        if (objLIZ != null) {
            iWebCreationPromoteService = (IWebCreationPromoteService) objLIZ;
        } else {
            if (C04TD.f6 == null) {
                synchronized (IWebCreationPromoteService.class) {
                    if (C04TD.f6 == null) {
                        C04TD.f6 = new WebCreationPromoteServiceImpl();
                    }
                }
            }
            iWebCreationPromoteService = C04TD.f6;
        }
        this.LIZ = iWebCreationPromoteService;
    }
}

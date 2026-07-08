package X;

import com.ss.android.ugc.aweme.servicimpl.EditorTabAiMeService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tiktok.IEditorTabAiMeService;

/* JADX INFO: renamed from: X.0MGG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MGG implements IEditorTabAiMeService {
    public static final C0MGG LIZIZ = new C0MGG();
    public final /* synthetic */ IEditorTabAiMeService LIZ;

    @Override // com.ss.android.ugc.tiktok.IEditorTabAiMeService
    public final boolean LIZ(ShortVideoContext shortVideoContext) {
        return this.LIZ.LIZ(shortVideoContext);
    }

    @Override // com.ss.android.ugc.tiktok.IEditorTabAiMeService
    public final void LIZIZ(C19A3 c19a3, C1DRG c1drg) {
        this.LIZ.LIZIZ(c19a3, c1drg);
    }

    public C0MGG() {
        IEditorTabAiMeService iEditorTabAiMeService;
        Object objLIZ = C04TD.LIZ(IEditorTabAiMeService.class, false);
        if (objLIZ != null) {
            iEditorTabAiMeService = (IEditorTabAiMeService) objLIZ;
        } else {
            if (C04TD.P4 == null) {
                synchronized (IEditorTabAiMeService.class) {
                    if (C04TD.P4 == null) {
                        C04TD.P4 = new EditorTabAiMeService();
                    }
                }
            }
            iEditorTabAiMeService = C04TD.P4;
        }
        this.LIZ = iEditorTabAiMeService;
    }
}

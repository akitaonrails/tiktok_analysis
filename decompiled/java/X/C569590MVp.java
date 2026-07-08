package X;

import com.ss.android.ugc.aweme.editorpro.EditorProServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tiktok.IEditorProService;

/* JADX INFO: renamed from: X.0MVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569590MVp implements IEditorProService {
    public static final C569590MVp LIZIZ = new C569590MVp();
    public final /* synthetic */ IEditorProService LIZ;

    @Override // com.ss.android.ugc.tiktok.IEditorProService
    public final void LIZ(C1DRG c1drg) {
        this.LIZ.LIZ(c1drg);
    }

    @Override // com.ss.android.ugc.tiktok.IEditorProService
    public final InterfaceC1653190t7d LIZIZ(C1DRG c1drg, String str, boolean z) {
        return this.LIZ.LIZIZ(c1drg, str, z);
    }

    @Override // com.ss.android.ugc.tiktok.IEditorProService
    public final void LIZJ(String str, C19A3 c19a3, ShortVideoContext shortVideoContext) {
        this.LIZ.LIZJ(str, c19a3, shortVideoContext);
    }

    @Override // com.ss.android.ugc.tiktok.IEditorProService
    public final boolean LIZLLL(ShortVideoContext shortVideoContext) {
        return this.LIZ.LIZLLL(shortVideoContext);
    }

    public C569590MVp() {
        IEditorProService iEditorProService;
        Object objLIZ = C04TD.LIZ(IEditorProService.class, false);
        if (objLIZ != null) {
            iEditorProService = (IEditorProService) objLIZ;
        } else {
            if (C04TD.f0 == null) {
                synchronized (IEditorProService.class) {
                    if (C04TD.f0 == null) {
                        C04TD.f0 = new EditorProServiceImpl();
                    }
                }
            }
            iEditorProService = C04TD.f0;
        }
        this.LIZ = iEditorProService;
    }
}

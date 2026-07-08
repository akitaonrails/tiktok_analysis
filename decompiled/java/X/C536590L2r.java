package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.IEditorTabAiVideoService;

/* JADX INFO: renamed from: X.0L2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536590L2r implements IEditorTabAiVideoService {
    public static final C536590L2r LIZIZ = new C536590L2r();
    public final /* synthetic */ IEditorTabAiVideoService LIZ;

    @Override // com.ss.android.ugc.tiktok.IEditorTabAiVideoService
    public final void LIZ(C1DRG c1drg, C19A3 c19a3) {
        this.LIZ.LIZ(c1drg, c19a3);
    }

    public C536590L2r() {
        IEditorTabAiVideoService iEditorTabAiVideoService = (IEditorTabAiVideoService) PluggableExtentionKt.pluggableSpi$default(IEditorTabAiVideoService.class, false, false, false, 14, null);
        if (iEditorTabAiVideoService != null) {
            this.LIZ = iEditorTabAiVideoService;
        } else {
            "no implement IEditorTabAiVideoService".toString();
            throw new IllegalStateException("no implement IEditorTabAiVideoService");
        }
    }
}

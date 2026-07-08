package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.ss.android.ugc.tiktok.IEditorTabAIPortraitService;

/* JADX INFO: renamed from: X.0MGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MGJ implements IEditorTabAIPortraitService {
    public static final C0MGJ LIZIZ = new C0MGJ();
    public final /* synthetic */ IEditorTabAIPortraitService LIZ;

    @Override // com.ss.android.ugc.tiktok.IEditorTabAIPortraitService
    public final void LIZ(C1DRG c1drg, C19A3 c19a3, AIPortraitEnterParams aIPortraitEnterParams) {
        this.LIZ.LIZ(c1drg, c19a3, aIPortraitEnterParams);
    }

    public C0MGJ() {
        IEditorTabAIPortraitService iEditorTabAIPortraitService = (IEditorTabAIPortraitService) PluggableExtentionKt.pluggableSpi$default(IEditorTabAIPortraitService.class, false, false, false, 14, null);
        if (iEditorTabAIPortraitService != null) {
            this.LIZ = iEditorTabAIPortraitService;
        } else {
            "no implement IEditorTabAIPortraitService".toString();
            throw new IllegalStateException("no implement IEditorTabAIPortraitService");
        }
    }
}

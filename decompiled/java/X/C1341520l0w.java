package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.util.List;

/* JADX INFO: renamed from: X.0l0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341520l0w {
    public final List<? extends Comment> LIZ;
    public final C1339520kxi LIZIZ;
    public final String LIZJ;

    public C1341520l0w(List<? extends Comment> list, C1339520kxi c1339520kxi) {
        String strLLIIZ;
        this.LIZ = list;
        this.LIZIZ = c1339520kxi;
        ITranslationService iTranslationService = (ITranslationService) PluggableExtentionKt.pluggableSpi$default(ITranslationService.class, false, false, false, 14, null);
        this.LIZJ = (iTranslationService == null || (strLLIIZ = iTranslationService.LLIIZ()) == null) ? "" : strLLIIZ;
    }
}

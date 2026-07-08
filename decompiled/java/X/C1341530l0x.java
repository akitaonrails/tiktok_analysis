package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.util.List;

/* JADX INFO: renamed from: X.0l0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341530l0x {
    public final List<? extends Comment> LIZ;
    public final C1339520kxi LIZIZ;
    public final String LIZJ = ((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LLIIZ();

    public C1341530l0x(List<? extends Comment> list, C1339520kxi c1339520kxi) {
        this.LIZ = list;
        this.LIZIZ = c1339520kxi;
    }
}

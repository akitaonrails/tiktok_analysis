package X;

import com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361950lXt extends C09AY implements Function0<CommentPreloadExperiment.Meta> {
    public C1361950lXt() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment$Meta, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ CommentPreloadExperiment.Meta invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        CommentPreloadExperiment.Meta meta = CommentPreloadExperiment.LIZIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(CommentPreloadExperiment.Meta.class, meta, "inbox_comment_preload", true);
        if (LJJII != 0) {
            return LJJII;
        }
        CommentPreloadExperiment.LIZ.getClass();
        return meta;
    }
}

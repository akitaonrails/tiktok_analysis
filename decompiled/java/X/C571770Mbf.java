package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.Set;

/* JADX INFO: renamed from: X.0Mbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571770Mbf {
    public AwemeDraft LIZ;
    public final C377010EqJ LIZIZ = new C377010EqJ(new Object() { // from class: X.0Mbg
    });

    public final Set<String> LIZ() {
        AwemeDraft awemeDraft = this.LIZ;
        return awemeDraft == null ? C08CX.INSTANCE : C0CHQ.LIZ().LJI().LJIILJJIL().LJII(awemeDraft);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.13VV] */
    public final long LIZIZ() {
        final AwemeDraft awemeDraft = this.LIZ;
        if (awemeDraft == null) {
            return 0L;
        }
        this.LIZIZ.getValue().getClass();
        return new AbstractC20020613Vc(awemeDraft) { // from class: X.13VV
            public final long LIZ() {
                C0M5Z<String> c0m5zLJII = C0CHQ.LIZ().LJI().LJIILJJIL().LJII(this.LIZ);
                C13VD c13vd = new C13VD(null, null, 3);
                long j = 0;
                for (String str : c0m5zLJII) {
                    C13VF c13vf = new C13VF();
                    c13vf.LIZ(c13vd);
                    if (str != null) {
                        c13vf.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZ(str));
                    }
                    j += c13vd.LIZJ;
                    c13vd.LIZJ = 0L;
                }
                return j;
            }
        }.LIZ() + 0 + 0 + 0 + 0;
    }
}

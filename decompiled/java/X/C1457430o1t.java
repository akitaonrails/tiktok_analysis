package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0o1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457430o1t {
    public static final C1457430o1t LIZ = new C1457430o1t();

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ai_recommend_sticker", true, false) && !videoPublishEditModel.isStoryEditMode()) {
            if ((videoPublishEditModel.getShootMode() != 15 || videoPublishEditModel.getOrigin() == 0) && C0CHQ.LIZ().getAccountService().isLogin() && !C0CHQ.LIZ().getAccountService().LIZ()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static AbstractC1921407fo LIZIZ(AbstractC1457480o1y abstractC1457480o1y) {
        if (abstractC1457480o1y instanceof C1457510o21) {
            C1457510o21 c1457510o21 = (C1457510o21) abstractC1457480o1y;
            return new C2265708uF(c1457510o21.LIZIZ, c1457510o21.LIZJ);
        }
        if (abstractC1457480o1y instanceof C1457540o24) {
            C1457540o24 c1457540o24 = (C1457540o24) abstractC1457480o1y;
            return new C2265908uH(c1457540o24.LIZIZ, c1457540o24.LIZJ);
        }
        if (abstractC1457480o1y instanceof C573450MeN) {
            return new C1921307fn(((C1457520o22) abstractC1457480o1y).LIZIZ);
        }
        if (abstractC1457480o1y instanceof C1457520o22) {
            return new C1921307fn(((C1457520o22) abstractC1457480o1y).LIZIZ);
        }
        if (abstractC1457480o1y instanceof C1457500o20) {
            C1457500o20 c1457500o20 = (C1457500o20) abstractC1457480o1y;
            return new C2275508vp(c1457500o20.LIZIZ, c1457500o20.LIZJ, c1457500o20.LIZLLL);
        }
        if (abstractC1457480o1y instanceof C1457470o1x) {
            C1457470o1x c1457470o1x = (C1457470o1x) abstractC1457480o1y;
            return new C2266008uI(c1457470o1x.LIZIZ, c1457470o1x.LIZJ, c1457470o1x.LIZLLL, c1457470o1x.LJ, c1457470o1x.LJFF, c1457470o1x.LJI);
        }
        if (abstractC1457480o1y instanceof C1457460o1w) {
            C1457460o1w c1457460o1w = (C1457460o1w) abstractC1457480o1y;
            return new C2256108sh(c1457460o1w.LIZIZ, c1457460o1w.LIZJ, 6, c1457460o1w.LIZLLL, c1457460o1w.LJ);
        }
        throw new C1954807lC();
    }

    public final C11NZ<String> LJ(VideoPublishEditModel videoPublishEditModel) {
        try {
            C2256608sm c2256608sm = new C2256608sm(0);
            getClass();
            AbstractC1457480o1y abstractC1457480o1yLIZJ = LIZJ(videoPublishEditModel, 0, c2256608sm);
            if (abstractC1457480o1yLIZJ != null) {
                return C1457440o1u.LIZJ(abstractC1457480o1yLIZJ, true, null, 4);
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x035f A[EDGE_INSN: B:313:0x035f->B:230:0x035f BREAK  A[LOOP:4: B:225:0x0345->B:315:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v51, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v15, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC1457480o1y LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r18, int r19, X.C2256608sm r20) {
        /*
            Method dump skipped, instruction units count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1457430o1t.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int, X.08sm):X.0o1y");
    }

    public static void LJFF(AbstractC1457480o1y abstractC1457480o1y, VideoPublishEditModel videoPublishEditModel, int i) {
        C573430MeL c573430MeL = C573430MeL.LIZ;
        Boolean bool = Boolean.FALSE;
        c573430MeL.getClass();
        C2288408xu c2288408xuLIZ = C573430MeL.LIZ(videoPublishEditModel, bool);
        abstractC1457480o1y.LIZ = c2288408xuLIZ;
        c2288408xuLIZ.LJ = i;
    }
}

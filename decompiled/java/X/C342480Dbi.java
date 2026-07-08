package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Dbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342480Dbi {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ() {
        int dimension;
        if (C276040Arq.LIZ() != 0) {
            C844470XAv.LIZ.getClass();
            dimension = ((int) ((((double) C844470XAv.LIZ().getResources().getDimension(R.dimen.jm)) / ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)))) + 0.5d)) + 1;
            int iLIZ = C276040Arq.LIZ();
            if (iLIZ >= dimension) {
                dimension = iLIZ;
            }
        } else {
            dimension = 20;
        }
        C1344030l4z.LIZJ("CommentViewPreloadV2", "getFirstRefreshCommentCount " + dimension);
        return dimension;
    }
}

package X;

import com.ss.android.ugc.aweme.appdiff.ICommentAppDiffProtocol;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350650lFf {
    public static final C1350650lFf LIZ = new C1350650lFf();
    public static Pair<String, Integer> LIZIZ = new Pair<>("", 0);

    public static boolean LIZIZ() {
        ICommentAppDiffProtocol.LIZ.getClass();
        ICommentAppDiffProtocol value = C1352700lIy.LIZIZ.getValue();
        boolean z = (LIZJ() & 1) == 1;
        value.LIZIZ(z);
        return z;
    }

    public static boolean LIZ() {
        return (LIZJ() & 2) == 2;
    }

    public static int LIZJ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (Intrinsics.LJFF(curUserId, LIZIZ.getFirst())) {
            return LIZIZ.getSecond().intValue();
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "comment_photo_publish", true);
        LIZIZ = new Pair<>(curUserId, Integer.valueOf(iLJIJ));
        return iLJIJ;
    }
}

package X;

import android.app.Activity;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DJ4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJ4 {
    public static final C0DJ4 LIZ = new C0DJ4();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(433));

    public static void LIZ(C0DJ4 c0dj4, String str, Throwable th, int i) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        c0dj4.getClass();
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
            c1397580mTM.LIZIZ("CommentListLazyParser error(debug): msg = " + str + ", e = " + th);
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }
}

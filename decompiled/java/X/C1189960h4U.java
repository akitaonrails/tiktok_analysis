package X;

import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0h4U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189960h4U {
    @C14EU(threadMode = ThreadMode.MAIN)
    public static void onDeleteReviewEvent(InterfaceC1189980h4W interfaceC1189980h4W, C1187180h00 c1187180h00) {
        interfaceC1189980h4W.fk(c1187180h00.LIZ, c1187180h00.LIZIZ);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public static void onInteractionReviewEvent(InterfaceC1189980h4W interfaceC1189980h4W, C1189970h4V c1189970h4V) {
        String str = c1189970h4V.LIZ;
        String str2 = c1189970h4V.LIZIZ;
        interfaceC1189980h4W.i5(c1189970h4V.LIZLLL, str, c1189970h4V.LIZJ, str2);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public static void onWriteReviewEvent(InterfaceC1189980h4W interfaceC1189980h4W, C1186690gzD c1186690gzD) {
        interfaceC1189980h4W.A8(c1186690gzD.LIZIZ, c1186690gzD.LIZ);
    }
}

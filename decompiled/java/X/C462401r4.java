package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController;

/* JADX INFO: renamed from: X.01r4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C462401r4 {
    public static void LIZ(Long l) {
        String string;
        NoticeboardGuestController.LJIILIIL = l;
        C11PQ<String> c11pq = NoticeboardGuestController.LJIILJJIL;
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        c11pq.onNext(string);
    }
}

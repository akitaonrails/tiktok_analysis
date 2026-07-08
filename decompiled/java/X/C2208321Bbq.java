package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.experiment.CommentImagePublishOptExp;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.1Bbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208321Bbq implements InterfaceC586170Myt {
    public static final C2208321Bbq LL = new C2208321Bbq();

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (z) {
            int i3 = C2208181Bbc.LJII;
            if (CommentImagePublishOptExp.LIZ()) {
                synchronized (C2208181Bbc.LJIIIIZZ) {
                    try {
                        C2208181Bbc.LJIIIZ = null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                C2208181Bbc.LJIIIZ = null;
            }
            if (i == 3) {
                C0TSK.LIZ("cmt_img_auth_".concat(C2208191Bbd.LJI()));
            }
        }
    }
}

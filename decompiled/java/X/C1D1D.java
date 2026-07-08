package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.experiment.CommentImagePublishOptExp;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuthKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: renamed from: X.1D1D, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D1D implements InterfaceC626120Oh8 {
    public final int $t;

    public static final void onComplete$0(C1D1D c1d1d) {
    }

    public static final void onComplete$1(C1D1D c1d1d) {
    }

    public static final void onError$0(C1D1D c1d1d, Throwable th) {
    }

    public static final void onSubscribe$0(C1D1D c1d1d, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(C1D1D c1d1d, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                break;
            case 1:
                onComplete$1(this);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                break;
            case 1:
                onNext$1(this, obj);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                onSubscribe$1(this, interfaceC420801kM);
                break;
        }
    }

    public C1D1D(int i) {
        this.$t = i;
    }

    public static final void onError$1(C1D1D c1d1d, Throwable th) {
        C2208281Bbm.LJI(C2208281Bbm.LIZ, null, -1, Long.valueOf(C2252408s6.LIZIZ(th)), th.getMessage(), null, 17);
    }

    public static final void onNext$1(C1D1D c1d1d, Object obj) {
        CommentImageUploadAuth commentImageUploadAuth = (CommentImageUploadAuth) obj;
        String imprId = null;
        if (CommentImageUploadAuthKt.isValid(commentImageUploadAuth)) {
            int i = C2208181Bbc.LJII;
            if (CommentImagePublishOptExp.LIZ()) {
                synchronized (C2208181Bbc.LJIIIIZZ) {
                    try {
                        C2208181Bbc.LJIIIZ = commentImageUploadAuth;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                C2208181Bbc.LJIIIZ = commentImageUploadAuth;
            }
            String json = GsonProtectorUtils.toJson(C08JS.LIZIZ(), commentImageUploadAuth);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cmt_img_auth_");
            sbLIZ.append(C2208191Bbd.LJI());
            C0TSK.LJFF(C2188811AlT.LIZIZ(sbLIZ), json);
            C1344030l4z.LIZJ("CommentImageUploadController", "prefetch auth success");
            C2208281Bbm.LJI(C2208281Bbm.LIZ, null, 1, null, null, null, 29);
            if (C0BJO.LIZIZ) {
                C23250099c.LIZLLL(new C2208331Bbr().LIZ, null, null, new C2207791Baz(commentImageUploadAuth, null), 3);
                return;
            }
            return;
        }
        C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
        LogPbBean logPd = commentImageUploadAuth.getLogPd();
        if (logPd != null) {
            imprId = logPd.getImprId();
        }
        C2208281Bbm.LJI(c2208281Bbm, null, -1, null, "auth is invalid", imprId, 5);
    }

    public static final /* bridge */ /* synthetic */ void onNext$0(C1D1D c1d1d, Object obj) {
    }
}

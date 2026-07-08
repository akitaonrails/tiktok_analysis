package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMServiceBridgeApi;

/* JADX INFO: renamed from: X.064t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15493064t {
    public static final C15493064t LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C054G LIZLLL;
    public static final C15495064v LJ;
    public volatile C1598406Nq LIZ;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.064v] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C15493064t.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C15493064t c15493064t = new C15493064t();
        LIZIZ = c15493064t;
        C1598406Nq c1598406Nq = c15493064t.LIZ;
        if (c1598406Nq == null) {
            synchronized (c15493064t) {
                c1598406Nq = c15493064t.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c15493064t.LIZ = c1598406Nq;
                }
            }
        }
        LIZLLL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        LJ = new InterfaceC15498064y() { // from class: X.064v
            @Override // X.InterfaceC15498064y
            public final void LIZIZ(C15497064x c15497064x) {
                C15491064r c15491064r = C15491064r.LIZIZ;
                String str = c15497064x.LIZ;
                c15491064r.getClass();
                C15491064r.LIZIZ(str);
            }

            @Override // X.InterfaceC15498064y
            public final void LIZJ(C19EG c19eg) {
                C15493064t.LIZIZ.getClass();
                C15493064t.LIZ(c19eg, null);
            }

            @Override // X.InterfaceC15498064y
            public final void LJ(C19EG c19eg) {
                C15493064t.LIZIZ.getClass();
                C15493064t.LIZ(c19eg, null);
            }

            @Override // X.InterfaceC15498064y
            public final void LIZ(C19EG c19eg, C15496064w c15496064w) {
                C15493064t.LIZIZ.getClass();
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("streak_flow_dialog", "streak_follow_dialog", bundle);
                C786410Ut5.LJJJI("streak_invite_id", c15496064w.LIZ, bundle);
                C786410Ut5.LJJJI("streak_uniq_id", c15496064w.LIZIZ, bundle);
                C786410Ut5.LJJJI("streak_user_name", c15496064w.LJFF, bundle);
                C786410Ut5.LJJJI("streak_target_uid", c15496064w.LIZJ, bundle);
                C786410Ut5.LJJJI("streak_target_sec_uid", c15496064w.LIZLLL, bundle);
                C786410Ut5.LJJJI("streak_avatar_url", c15496064w.LJ, bundle);
                C786410Ut5.LJJJI("streak_egg_url", c15496064w.LJI, bundle);
                IMServiceBridgeApi.LIZ.getClass();
                IMServiceBridgeApi iMServiceBridgeApiLIZ = C15488064o.LIZ();
                if (iMServiceBridgeApiLIZ != null) {
                    iMServiceBridgeApiLIZ.LIZJ(c19eg, bundle);
                }
            }

            @Override // X.InterfaceC15498064y
            public final void LIZLLL(C19EG c19eg, String str) {
                C15493064t.LIZIZ.getClass();
                C15493064t.LIZ(c19eg, str);
            }
        };
    }

    public static void LIZ(Activity activity, String str) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("streak_flow_dialog", "streak_error_toast", bundle);
        C786410Ut5.LJJJI("streak_accept_fail_error_msg", str, bundle);
        IMServiceBridgeApi.LIZ.getClass();
        IMServiceBridgeApi iMServiceBridgeApiLIZ = C15488064o.LIZ();
        if (iMServiceBridgeApiLIZ != null) {
            iMServiceBridgeApiLIZ.LIZJ(activity, bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C19EG r15, java.lang.String r16, java.lang.String r17, X.InterfaceC15498064y r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15493064t.LIZIZ(X.19EG, java.lang.String, java.lang.String, X.064y, X.05Vn):java.lang.Object");
    }
}
